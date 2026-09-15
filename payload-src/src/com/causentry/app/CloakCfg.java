package com.causentry.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Shared runtime config for every hook that has to know "which apps are protected"
 * and "which packages must stay invisible to them".
 *
 * The root daemon (bin/cloak.sh) writes the same small JSON to several locations,
 * because the processes we hook have very different file access:
 *   system_server        can read /data/system (its own dir)
 *   SettingsProvider     usually only /data/local/tmp and the sdcard media dir
 *   /data/adb is not readable by either (and SUSFS hides it)
 *
 *   {"targetUids":[10400],"targets":["com.bpjstku"],"hidden":["ru.gavrikov.mocklocations"]}
 */
public final class CloakCfg {

    private static final String[] PATHS = {
            "/data/system/causentry/cloak.json",
            "/data/local/tmp/causentry/cloak.json",
            "/sdcard/Android/media/com.causentry.app/cloak.json",
            "/data/media/0/Android/media/com.causentry.app/cloak.json",
    };

    private static final long RELOAD_MS = 5000L;

    public static final Set<Integer> UIDS = new HashSet<>();
    public static final Set<String> TARGETS = new LinkedHashSet<>();
    public static final Set<String> HIDDEN = new LinkedHashSet<>();

    private static long loadedAt = 0L;
    private static String lastStamp = "";

    private CloakCfg() {
    }

    public static boolean isTarget(int uid) {
        refresh();
        return UIDS.contains(uid);
    }

    public static boolean isCloaked(String pkg) {
        if (pkg == null) return false;
        refresh();
        return HIDDEN.contains(pkg);
    }

    public static synchronized void refresh() {
        long now = System.currentTimeMillis();
        if (now - loadedAt < RELOAD_MS) return;
        loadedAt = now;
        for (String path : PATHS) {
            try {
                File f = new File(path);
                if (!f.canRead()) continue;
                String stamp = path + ":" + f.lastModified() + ":" + f.length();
                if (stamp.equals(lastStamp)) return;
                BufferedReader r = new BufferedReader(new FileReader(f));
                StringBuilder sb = new StringBuilder();
                try {
                    String line;
                    while ((line = r.readLine()) != null) sb.append(line);
                } finally {
                    r.close();
                }
                parse(sb.toString());
                lastStamp = stamp;
                return;
            } catch (Throwable ignored) {
                // try the next location
            }
        }
    }

    private static void parse(String json) {
        Set<Integer> uids = new HashSet<>();
        Set<String> targets = new LinkedHashSet<>();
        Set<String> hidden = new LinkedHashSet<>();
        readInts(json, "\"targetUids\"", uids);
        readStrings(json, "\"targets\"", targets);
        readStrings(json, "\"hidden\"", hidden);
        if (hidden.isEmpty() && targets.isEmpty() && uids.isEmpty()) return;   // keep last good
        UIDS.clear();
        UIDS.addAll(uids);
        TARGETS.clear();
        TARGETS.addAll(targets);
        HIDDEN.clear();
        HIDDEN.addAll(hidden);
    }

    private static void readInts(String json, String key, Set<Integer> into) {
        int i = json.indexOf(key);
        if (i < 0) return;
        int open = json.indexOf('[', i), close = json.indexOf(']', open);
        if (open < 0 || close < 0) return;
        for (String part : json.substring(open + 1, close).split(",")) {
            try {
                into.add(Integer.parseInt(part.trim()));
            } catch (Throwable ignored) {
            }
        }
    }

    private static void readStrings(String json, String key, Set<String> into) {
        int i = json.indexOf(key);
        if (i < 0) return;
        int open = json.indexOf('[', i), close = json.indexOf(']', open);
        if (open < 0 || close < 0) return;
        for (String part : json.substring(open + 1, close).split(",")) {
            String s = part.trim().replace("\"", "");
            if (!s.isEmpty()) into.add(s);
        }
    }
}
