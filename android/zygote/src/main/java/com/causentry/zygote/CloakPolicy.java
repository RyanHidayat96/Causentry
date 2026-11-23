package com.causentry.zygote;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Lock-free, push-updated policy store.
 * Zero disk I/O in hot paths: updates arrive via PolicyChannel from causentryd,
 * with a single cold-start fallback read from /data/system/causentry/cloak.json (0640 system:system).
 */
final class CloakPolicy {
    private static final String TAG = "CausentryZygote";
    private static final File SYSTEM_POLICY_FILE = new File("/data/system/causentry/cloak.json");
    private static final File PROBE_FLAG = new File("/data/system/causentry/probe");
    private static final int PER_USER_RANGE = 100_000;

    static final class Snapshot {
        static final Snapshot EMPTY = new Snapshot(
                Collections.emptyMap(),
                Collections.emptyMap(),
                Collections.emptySet(),
                Collections.emptySet(),
                Collections.emptySet(),
                Collections.emptySet(),
                0L
        );

        final Map<Integer, Set<String>> hiddenByAppId;
        final Map<Integer, Set<Integer>> hiddenAppIdsByCaller;
        final Set<String> appZygoteBlocked;
        final Set<Integer> developerOptionsAppIds;
        final Set<Integer> accessibilityAppIds;
        final Set<Integer> mockLocationAppIds;
        final long generation;

        Snapshot(
                Map<Integer, Set<String>> hiddenByAppId,
                Map<Integer, Set<Integer>> hiddenAppIdsByCaller,
                Set<String> appZygoteBlocked,
                Set<Integer> developerOptionsAppIds,
                Set<Integer> accessibilityAppIds,
                Set<Integer> mockLocationAppIds,
                long generation
        ) {
            this.hiddenByAppId = hiddenByAppId;
            this.hiddenAppIdsByCaller = hiddenAppIdsByCaller;
            this.appZygoteBlocked = appZygoteBlocked;
            this.developerOptionsAppIds = developerOptionsAppIds;
            this.accessibilityAppIds = accessibilityAppIds;
            this.mockLocationAppIds = mockLocationAppIds;
            this.generation = generation;
        }
    }

    private static final AtomicReference<Snapshot> CURRENT = new AtomicReference<>(Snapshot.EMPTY);
    private static volatile long probeCheckedAt;
    private static volatile boolean probeOn;

    private CloakPolicy() {}

    static int toAppId(int uid) {
        return uid < 0 ? -1 : (uid % PER_USER_RANGE);
    }

    static boolean hasHiddenPackages(int uid) {
        int appId = toAppId(uid);
        if (appId < 10_000) return false;
        Set<String> hidden = CURRENT.get().hiddenByAppId.get(appId);
        return hidden != null && !hidden.isEmpty();
    }

    static boolean hides(int uid, String packageName) {
        if (packageName == null || packageName.isEmpty()) return false;
        int appId = toAppId(uid);
        if (appId < 10_000) return false;
        Set<String> hidden = CURRENT.get().hiddenByAppId.get(appId);
        return hidden != null && hidden.contains(packageName);
    }

    static boolean hidesUid(int callerUid, int targetUid) {
        int callerAppId = toAppId(callerUid);
        int targetAppId = toAppId(targetUid);
        if (callerAppId < 10_000 || targetAppId < 10_000 || callerAppId == targetAppId) return false;
        Set<Integer> hiddenUids = CURRENT.get().hiddenAppIdsByCaller.get(callerAppId);
        return hiddenUids != null && hiddenUids.contains(targetAppId);
    }

    static boolean blocksAppZygote(String packageName) {
        if (packageName == null || packageName.isEmpty()) return false;
        Set<String> set = CURRENT.get().appZygoteBlocked;
        if (set.isEmpty()) return false;
        if (set.contains(packageName)) return true;
        int colon = packageName.indexOf(':');
        return colon > 0 && set.contains(packageName.substring(0, colon));
    }

    static boolean hidesDeveloperOptions(int uid) {
        int appId = toAppId(uid);
        return appId >= 10_000 && CURRENT.get().developerOptionsAppIds.contains(appId);
    }

    static boolean hidesAccessibility(int uid) {
        int appId = toAppId(uid);
        return appId >= 10_000 && CURRENT.get().accessibilityAppIds.contains(appId);
    }

    static boolean hidesMockLocation(int uid) {
        int appId = toAppId(uid);
        return appId >= 10_000 && CURRENT.get().mockLocationAppIds.contains(appId);
    }

    static boolean probeEnabled() {
        long now = System.currentTimeMillis();
        if (now - probeCheckedAt < 2000L) return probeOn;
        probeCheckedAt = now;
        probeOn = PROBE_FLAG.exists();
        return probeOn;
    }

    /** Called once at startup to load the system-only cold-start fallback if socket push hasn't arrived yet. */
    static synchronized void loadColdStartFallback() {
        if (CURRENT.get().generation > 0L) return;
        if (!SYSTEM_POLICY_FILE.isFile() || !SYSTEM_POLICY_FILE.canRead()) return;
        try (FileInputStream in = new FileInputStream(SYSTEM_POLICY_FILE)) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) > 0) {
                bos.write(buf, 0, n);
                if (bos.size() > 2 * 1024 * 1024) break;
            }
            JSONObject root = new JSONObject(new String(bos.toByteArray(), StandardCharsets.UTF_8));
            applyJson(root, "cold-start");
        } catch (Throwable t) {
            Log.w(TAG, "cold-start policy load skipped: " + t.getMessage());
        }
    }

    static void applyPushPolicy(JSONObject root) {
        if (root == null) return;
        applyJson(root, "push");
    }

    private static void applyJson(JSONObject root, String source) {
        try {
            JSONArray uids = root.optJSONArray("targetUids");
            JSONArray targets = root.optJSONArray("targets");
            JSONObject byTarget = root.optJSONObject("hiddenByTarget");
            JSONObject hiddenUidsByTarget = root.optJSONObject("hiddenUidsByTarget");

            Map<Integer, Set<String>> nextHidden = new HashMap<>();
            Map<Integer, Set<Integer>> nextHiddenUids = new HashMap<>();

            if (uids != null && targets != null && byTarget != null
                    && uids.length() == targets.length()) {
                for (int i = 0; i < targets.length(); i++) {
                    int appId = toAppId(uids.optInt(i, -1));
                    String target = targets.optString(i, "");
                    if (appId < 10_000 || target.isEmpty()) continue;

                    JSONArray packages = byTarget.optJSONArray(target);
                    if (packages != null) {
                        Set<String> hidden = new HashSet<>(packages.length());
                        for (int p = 0; p < packages.length(); p++) {
                            String name = packages.optString(p, "");
                            if (!name.isEmpty()) hidden.add(name);
                        }
                        nextHidden.put(appId, Collections.unmodifiableSet(hidden));
                    }

                    if (hiddenUidsByTarget != null) {
                        JSONArray hUids = hiddenUidsByTarget.optJSONArray(target);
                        if (hUids != null) {
                            Set<Integer> uidSet = new HashSet<>(hUids.length());
                            for (int u = 0; u < hUids.length(); u++) {
                                int hid = toAppId(hUids.optInt(u, -1));
                                if (hid >= 10_000 && hid != appId) uidSet.add(hid);
                            }
                            nextHiddenUids.put(appId, Collections.unmodifiableSet(uidSet));
                        }
                    }
                }
            }

            Set<String> nextAppZygote = new HashSet<>();
            JSONArray appZygote = root.optJSONArray("appZygote");
            if (appZygote != null) {
                for (int i = 0; i < appZygote.length(); i++) {
                    String name = appZygote.optString(i, "");
                    if (!name.isEmpty()) nextAppZygote.add(name);
                }
            }

            Set<Integer> nextDev = readAppIdSet(root.optJSONArray("developerOptionsUids"));
            Set<Integer> nextAcc = root.has("accessibilityUids")
                    ? readAppIdSet(root.optJSONArray("accessibilityUids"))
                    : new HashSet<>(nextDev);
            Set<Integer> nextMock = root.has("mockLocationUids")
                    ? readAppIdSet(root.optJSONArray("mockLocationUids"))
                    : new HashSet<>(nextDev);

            long gen = root.optLong("generation", System.currentTimeMillis());
            Snapshot snap = new Snapshot(
                    Collections.unmodifiableMap(nextHidden),
                    Collections.unmodifiableMap(nextHiddenUids),
                    Collections.unmodifiableSet(nextAppZygote),
                    Collections.unmodifiableSet(nextDev),
                    Collections.unmodifiableSet(nextAcc),
                    Collections.unmodifiableSet(nextMock),
                    gen
            );
            CURRENT.set(snap);
            Log.i(TAG, "policy applied (" + source + ") gen=" + gen
                    + " targets=" + nextHidden.size()
                    + " dev=" + nextDev.size()
                    + " acc=" + nextAcc.size()
                    + " mock=" + nextMock.size()
                    + " appZygote=" + nextAppZygote.size());
        } catch (Throwable t) {
            Log.w(TAG, "policy apply failed (" + source + ")", t);
        }
    }

    private static Set<Integer> readAppIdSet(JSONArray arr) {
        if (arr == null) return Collections.emptySet();
        Set<Integer> out = new HashSet<>(arr.length());
        for (int i = 0; i < arr.length(); i++) {
            int appId = toAppId(arr.optInt(i, -1));
            if (appId >= 10_000) out.add(appId);
        }
        return out;
    }
}
