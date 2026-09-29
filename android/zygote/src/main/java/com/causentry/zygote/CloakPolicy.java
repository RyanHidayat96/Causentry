package com.causentry.zygote;

import android.os.FileObserver;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/** Reads the daemon's atomic target UID -> hidden package policy. */
final class CloakPolicy {
    private static final String TAG = "CausentryZygote";
    private static final File[] POLICIES = new File[]{
            new File("/data/system/causentry/cloak.json"),
            new File("/data/local/tmp/causentry/cloak.json"),
            new File("/sdcard/Android/media/com.causentry.app/cloak.json"),
            new File("/data/media/0/Android/media/com.causentry.app/cloak.json"),
    };
    private static final long REFRESH_MS = 1000L;

    private static volatile long lastModified;
    private static volatile long lastLength;
    private static volatile long lastRead;
    private static volatile String lastPolicyPath = "";
    private static volatile boolean policyDirty = true;
    private static volatile FileObserver policyObserver;
    private static volatile Map<Integer, Set<String>> hiddenByUid = Collections.emptyMap();
    private static volatile Set<String> appZygoteBlocked = Collections.emptySet();
    private static volatile Set<Integer> developerOptionsUids = Collections.emptySet();

    private CloakPolicy() {}

    static boolean hasHiddenPackages(int uid) {
        if (uid < 10000) return false;
        refresh(false);
        Set<String> hidden = hiddenByUid.get(uid);
        return hidden != null && !hidden.isEmpty();
    }

    static boolean hides(int uid, String packageName) {
        if (packageName == null || uid < 10000) return false;
        refresh(false);
        Set<String> hidden = hiddenByUid.get(uid);
        return hidden != null && hidden.contains(packageName);
    }

    static boolean blocksAppZygote(String packageName) {
        if (packageName == null || packageName.isEmpty()) return false;
        refresh(false);
        if (appZygoteBlocked.contains(packageName)) return true;
        int colon = packageName.indexOf(':');
        return colon > 0 && appZygoteBlocked.contains(packageName.substring(0, colon));
    }

    static boolean hidesDeveloperOptions(int uid) {
        if (uid < 10000) return false;
        refresh(false);
        return developerOptionsUids.contains(uid);
    }

    static void refreshNow() {
        refresh(true);
    }

    private static synchronized void ensurePolicyObserver() {
        if (policyObserver != null) return;
        File directory = POLICIES[0].getParentFile();
        if (directory == null || !directory.isDirectory()) return;
        try {
            FileObserver observer = new FileObserver(directory.getAbsolutePath(),
                    FileObserver.CLOSE_WRITE | FileObserver.MOVED_TO) {
                @Override public void onEvent(int event, String path) {
                    if (POLICIES[0].getName().equals(path)) policyDirty = true;
                }
            };
            observer.startWatching();
            policyObserver = observer;
        } catch (Throwable error) {
            Log.w(TAG, "policy watcher unavailable", error);
        }
    }

    private static void refresh(boolean force) {
        ensurePolicyObserver();
        long now = System.currentTimeMillis();
        boolean dirty = policyDirty;
        if (!force && !dirty && now - lastRead < REFRESH_MS) return;
        lastRead = now;

        Throwable lastError = null;
        for (File policy : POLICIES) {
            long modified = policy.lastModified();
            if (modified <= 0L) continue;
            long length = policy.length();
            String path = policy.getAbsolutePath();
            if (!force && !dirty && path.equals(lastPolicyPath)
                    && modified == lastModified && length == lastLength) return;

            try (FileInputStream input = new FileInputStream(policy)) {
                byte[] bytes = new byte[(int) Math.min(policy.length(), 1024 * 1024)];
                int count = input.read(bytes);
                JSONObject root = new JSONObject(new String(bytes, 0, Math.max(0, count), StandardCharsets.UTF_8));
                JSONArray uids = root.optJSONArray("targetUids");
                JSONArray targets = root.optJSONArray("targets");
                JSONObject byTarget = root.optJSONObject("hiddenByTarget");
                Map<Integer, Set<String>> next = new HashMap<>();
                Set<String> nextAppZygote = new HashSet<>();
                Set<Integer> nextDeveloperOptions = new HashSet<>();

                if (uids == null || targets == null || byTarget == null
                        || uids.length() != targets.length()) {
                    throw new IllegalArgumentException("invalid target UID policy");
                }
                for (int i = 0; i < targets.length(); i++) {
                    int uid = uids.optInt(i, -1);
                    String target = targets.optString(i, "");
                    JSONArray packages = byTarget.optJSONArray(target);
                    if (uid < 10000 || packages == null) continue;
                    Set<String> hidden = new HashSet<>();
                    for (int p = 0; p < packages.length(); p++) {
                        String name = packages.optString(p, "");
                        if (!name.isEmpty()) hidden.add(name);
                    }
                    next.put(uid, Collections.unmodifiableSet(hidden));
                }

                JSONArray appZygote = root.optJSONArray("appZygote");
                if (appZygote != null) {
                    for (int i = 0; i < appZygote.length(); i++) {
                        String name = appZygote.optString(i, "");
                        if (!name.isEmpty()) nextAppZygote.add(name);
                    }
                }

                JSONArray developerOptions = root.optJSONArray("developerOptionsUids");
                if (developerOptions != null) {
                    for (int i = 0; i < developerOptions.length(); i++) {
                        int uid = developerOptions.optInt(i, -1);
                        if (uid >= 10000) nextDeveloperOptions.add(uid);
                    }
                }

                hiddenByUid = Collections.unmodifiableMap(next);
                appZygoteBlocked = Collections.unmodifiableSet(nextAppZygote);
                developerOptionsUids = Collections.unmodifiableSet(nextDeveloperOptions);
                lastModified = modified;
                lastLength = length;
                lastPolicyPath = path;
                policyDirty = false;
                Log.i(TAG, "policy refreshed targets=" + next.size()
                        + " appZygote=" + nextAppZygote.size()
                        + " developerOptions=" + nextDeveloperOptions.size()
                        + " source=" + path);
                return;
            } catch (Throwable error) {
                // A system_app process can be blocked from /data/system by SELinux.
                // Try the root-written mirror before retaining the last known policy.
                lastError = error;
            }
        }
        if (lastError != null) {
            // Keep the last known-good policy. A malformed update must fail open.
            Log.w(TAG, "policy refresh skipped", lastError);
        }
    }
}
