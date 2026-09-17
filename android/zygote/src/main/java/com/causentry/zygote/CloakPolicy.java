package com.causentry.zygote;

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
    private static final File POLICY = new File("/data/system/causentry/cloak.json");
    private static final long REFRESH_MS = 1000L;

    private static volatile long lastModified;
    private static volatile long lastRead;
    private static volatile Map<Integer, Set<String>> hiddenByUid = Collections.emptyMap();

    private CloakPolicy() {}

    static boolean hides(int uid, String packageName) {
        if (packageName == null || uid < 10000) return false;
        refresh(false);
        Set<String> hidden = hiddenByUid.get(uid);
        return hidden != null && hidden.contains(packageName);
    }

    static void refreshNow() {
        refresh(true);
    }

    private static void refresh(boolean force) {
        long now = System.currentTimeMillis();
        if (!force && now - lastRead < REFRESH_MS) return;
        lastRead = now;

        long modified = POLICY.lastModified();
        if (!force && modified == lastModified) return;

        try (FileInputStream input = new FileInputStream(POLICY)) {
            byte[] bytes = new byte[(int) Math.min(POLICY.length(), 1024 * 1024)];
            int count = input.read(bytes);
            JSONObject root = new JSONObject(new String(bytes, 0, Math.max(0, count), StandardCharsets.UTF_8));
            JSONArray uids = root.optJSONArray("targetUids");
            JSONArray targets = root.optJSONArray("targets");
            JSONObject byTarget = root.optJSONObject("hiddenByTarget");
            Map<Integer, Set<String>> next = new HashMap<>();

            if (uids != null && targets != null && byTarget != null) {
                int countTargets = Math.min(uids.length(), targets.length());
                for (int i = 0; i < countTargets; i++) {
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
            }

            hiddenByUid = Collections.unmodifiableMap(next);
            lastModified = modified;
            Log.i(TAG, "policy refreshed targets=" + next.size());
        } catch (Throwable error) {
            // Keep the last known-good policy. A malformed update must fail open.
            Log.w(TAG, "policy refresh skipped", error);
        }
    }
}
