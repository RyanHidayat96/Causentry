package com.causentry.app;

import android.os.Binder;
import android.os.Process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Shared runtime config + caller identification for every system-side hook.
 *
 * Two facts drive the design:
 *  1. The daemon writes the same small JSON to several paths because the processes we
 *     hook have different file access (system_server: /data/system; SettingsProvider:
 *     /data/local/tmp or the sdcard media dir). /data/adb is readable by neither.
 *  2. A protected app is not always "uid in the list": some apps run checks from an
 *     *isolated* process (`com.example.app:b:e.…`, uid ~90000) whose uid is generated at
 *     runtime. So a caller is a target when its uid matches, or when the caller's
 *     process command line starts with one of the target package names.
 *
 *   {"targetUids":[10400],"targets":["com.bank"],"hidden":["com.fakegps"],
 *    "hiddenByTarget":{"com.bank":["com.fakegps"]}}
 */
public final class CloakCfg {

    private static final String[] PATHS = {
            "/data/system/causentry/cloak.json",
            "/data/local/tmp/causentry/cloak.json",
            "/sdcard/Android/media/com.causentry.app/cloak.json",
            "/data/media/0/Android/media/com.causentry.app/cloak.json",
    };

    private static final long RELOAD_MS = 5000L;
    private static final long PID_CACHE_MS = 3000L;

    public static final Set<Integer> UIDS = new HashSet<>();
    public static final Set<String> TARGETS = new LinkedHashSet<>();
    public static final Set<String> HIDDEN = new LinkedHashSet<>();
    public static final Map<String, Set<String>> HIDDEN_BY_TARGET = new HashMap<>();
    /** packages whose app-zygote service spawn is denied (per-app "isolate" toggle) */
    public static final Set<String> APPZYGOTE = new LinkedHashSet<>();

    private static long loadedAt = 0L;
    private static String lastStamp = "";

    private static final Map<Integer, String> PID_PKG = new HashMap<>();
    private static final Map<Integer, Long> PID_AT = new HashMap<>();

    private CloakCfg() {
    }

    /** uid-list match, plus isolated/child processes of a target package */
    public static boolean callerIsTarget() {
        try {
            int uid = Binder.getCallingUid();
            refresh();
            if (UIDS.contains(uid)) return true;
            return callerTargetPackage() != null;
        } catch (Throwable t) {
            return false;
        }
    }

    public static boolean isTarget(int uid) {
        try {
            int pid = Binder.getCallingPid();
            if (pid > 0 && pid != Process.myPid()) return callerIsTarget();
        } catch (Throwable ignored) {
        }
        refresh();
        return UIDS.contains(uid);
    }

    /** target package name for this binder caller, when /proc exposes it */
    public static String callerTargetPackage() {
        try {
            refresh();
            int pid = Binder.getCallingPid();
            if (pid <= 0 || pid == Process.myPid()) return null;
            String pkg = packageOfPid(pid);
            if (pkg == null) return null;
            for (String t : TARGETS) {
                if (pkg.equals(t) || pkg.startsWith(t + ":")) return t;
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    /** /proc/<pid>/cmdline -> base package name (isolated processes include the app prefix) */
    public static String packageOfPid(int pid) {
        Long at = PID_AT.get(pid);
        long now = System.currentTimeMillis();
        if (at != null && now - at < PID_CACHE_MS && PID_PKG.containsKey(pid)) return PID_PKG.get(pid);
        String name = null;
        try {
            BufferedReader r = new BufferedReader(new FileReader("/proc/" + pid + "/cmdline"));
            try {
                StringBuilder sb = new StringBuilder();
                int c;
                while ((c = r.read()) > 0) sb.append((char) c);
                name = sb.toString();
            } finally {
                r.close();
            }
        } catch (Throwable ignored) {
        }
        if (name == null || name.isEmpty()) return null;
        int cut = name.indexOf('\0');
        if (cut > 0) name = name.substring(0, cut);
        int colon = name.indexOf(':');
        if (colon > 0) name = name.substring(0, colon);
        name = name.trim();
        if (name.isEmpty()) return null;
        if (PID_PKG.size() > 64) {   // keep the cache small
            PID_PKG.clear();
            PID_AT.clear();
        }
        PID_PKG.put(pid, name);
        PID_AT.put(pid, now);
        return name;
    }

    public static boolean isCloaked(String pkg) {
        if (pkg == null) return false;
        refresh();
        return HIDDEN.contains(pkg);
    }

    public static boolean isCloakedForCaller(String pkg) {
        if (pkg == null) return false;
        refresh();
        String target = callerTargetPackage();
        if (target != null) {
            Set<String> scoped = HIDDEN_BY_TARGET.get(target);
            return scoped != null ? scoped.contains(pkg) : HIDDEN.contains(pkg);
        }
        try {
            if (!UIDS.contains(Binder.getCallingUid())) return false;
        } catch (Throwable ignored) {
            return false;
        }
        return HIDDEN.contains(pkg);
    }

    public static synchronized void refresh() {
        long now = System.currentTimeMillis();
        if (now - loadedAt < RELOAD_MS) return;
        loadedAt = now;
        for (String path : PATHS) {
            try {
                java.io.File f = new java.io.File(path);
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
        Set<String> appZygote = new LinkedHashSet<>();
        Map<String, Set<String>> hiddenByTarget = new HashMap<>();
        readInts(json, "\"targetUids\"", uids);
        readStrings(json, "\"targets\"", targets);
        readStrings(json, "\"hidden\"", hidden);
        readStringArrays(json, "\"hiddenByTarget\"", hiddenByTarget);
        readStrings(json, "\"appZygote\"", appZygote);
        if (hidden.isEmpty() && targets.isEmpty() && uids.isEmpty()) return;   // keep last good
        UIDS.clear();
        UIDS.addAll(uids);
        TARGETS.clear();
        TARGETS.addAll(targets);
        HIDDEN.clear();
        HIDDEN.addAll(hidden);
        HIDDEN_BY_TARGET.clear();
        HIDDEN_BY_TARGET.putAll(hiddenByTarget);
        APPZYGOTE.clear();
        APPZYGOTE.addAll(appZygote.isEmpty() ? targets : appZygote);
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
        readStringArrayBody(json.substring(open + 1, close), into);
    }

    private static void readStringArrays(String json, String key, Map<String, Set<String>> into) {
        int i = json.indexOf(key);
        if (i < 0) return;
        int open = json.indexOf('{', i), close = json.indexOf('}', open);
        if (open < 0 || close < 0) return;
        String body = json.substring(open + 1, close);
        int pos = 0;
        while (pos < body.length()) {
            int k1 = body.indexOf('"', pos);
            if (k1 < 0) break;
            int k2 = body.indexOf('"', k1 + 1);
            if (k2 < 0) break;
            String name = body.substring(k1 + 1, k2);
            int arrOpen = body.indexOf('[', k2);
            int arrClose = body.indexOf(']', arrOpen);
            if (arrOpen < 0 || arrClose < 0) break;
            Set<String> values = new LinkedHashSet<>();
            readStringArrayBody(body.substring(arrOpen + 1, arrClose), values);
            into.put(name, values);
            pos = arrClose + 1;
        }
    }

    private static void readStringArrayBody(String body, Set<String> into) {
        for (String part : body.split(",")) {
            String s = part.trim().replace("\"", "");
            if (!s.isEmpty()) into.add(s);
        }
    }
}
