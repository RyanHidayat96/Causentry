package com.causentry.app;

import android.os.Binder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

/**
 * Package cloaking inside system_server.
 *
 * Why system_server: protected apps (PairIP / Zimperium) crash when anything is injected
 * into their own process, so the filter has to live in the process that answers their
 * PackageManager calls.
 *
 * Effect: for a *protected* app (JMO, CIMB, ...) a cloaked package looks uninstalled -
 * getPackageInfo/getApplicationInfo throw NameNotFoundException and list results are
 * filtered. Every other app (launcher, the cloaked app itself, adb shell) still sees it,
 * so nothing is ever uninstalled, disabled or hidden from the user.
 *
 * Which class to hook (verified against this ROM's services.jar):
 *   Android 15/16 : com.android.server.pm.IPackageManagerBase
 *   Android <= 14 : com.android.server.pm.PackageManagerService$IPackageManagerImpl
 *
 * Config comes from /data/system/causentry/cloak.json, written by the root daemon
 * (/data/adb is not readable by system_server and is hidden by SUSFS):
 *   {"targetUids":[10400],"targets":["com.bpjstku"],"hidden":["ru.gavrikov.mocklocations"]}
 */
public final class PackageCloak {

    private static final String CONFIG = "/data/system/causentry/cloak.json";
    private static final long RELOAD_MS = 5000;

    private static final String[] CANDIDATES = {
            "com.android.server.pm.IPackageManagerBase",                    // Android 15/16
            "com.android.server.pm.PackageManagerService$IPackageManagerImpl",
            "com.android.server.pm.PackageManagerService",
    };

    private static long loadedAt = 0;
    private static long lastMtime = -1;
    private static final Set<Integer> TARGET_UIDS = new HashSet<>();
    private static final Set<String> TARGETS = new HashSet<>();
    private static final Set<String> HIDDEN = new HashSet<>();

    private PackageCloak() {
    }

    public static void install(ClassLoader cl) {
        try {
            int hooked = 0;
            for (String name : CANDIDATES) {
                Class<?> c;
                try {
                    c = XposedHelpers.findClass(name, cl);
                    if (c == null) continue;
                } catch (Throwable ignored) {
                    continue;
                }
                int n = 0;
                n += XposedBridge.hookAllMethods(c, "getPackageInfo", new NotFound()).size();
                n += XposedBridge.hookAllMethods(c, "getApplicationInfo", new NotFound()).size();
                n += XposedBridge.hookAllMethods(c, "getPackageUid", new CloakUid()).size();
                n += XposedBridge.hookAllMethods(c, "getInstalledPackages", new ListFilter()).size();
                n += XposedBridge.hookAllMethods(c, "getInstalledApplications", new ListFilter()).size();
                n += XposedBridge.hookAllMethods(c, "queryIntentActivities", new ListFilter()).size();
                n += XposedBridge.hookAllMethods(c, "getPackagesForUid", new ArrayFilter()).size();
                if (n > 0) {
                    hooked += n;
                    XposedBridge.log("Causentry cloak: hooked " + n + " methods on " + name);
                }
            }
            refresh();
            XposedBridge.log("Causentry cloak installed in system_server: methods=" + hooked
                    + " targets=" + TARGETS + " hidden=" + HIDDEN.size());
        } catch (Throwable t) {
            XposedBridge.log("Causentry cloak failed: " + t);
        }
    }

    /* ------------------------------------------------------------------ */
    /* hooks                                                              */
    /* ------------------------------------------------------------------ */

    /** package-name queries of a cloaked package look like "not installed" */
    private static final class NotFound extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) {
            try {
                String pkg = firstString(param.args);
                if (pkg == null || !isCloaked(pkg)) return;
                int uid = Binder.getCallingUid();
                boolean target = isTarget(uid);
                if (target) {
                    XposedBridge.log("Causentry cloak: " + methodName(param) + "(" + pkg
                            + ") caller=" + uid + " -> NameNotFound");
                    param.setThrowable(new android.content.pm.PackageManager.NameNotFoundException(pkg));
                }
            } catch (Throwable ignored) {
            }
        }
    }

    private static final class CloakUid extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) {
            try {
                String pkg = firstString(param.args);
                if (pkg != null && isCloaked(pkg) && isTarget(Binder.getCallingUid())) {
                    param.setResult(-1);
                }
            } catch (Throwable ignored) {
            }
        }
    }

    private static final class ArrayFilter extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(MethodHookParam param) {
            try {
                if (!isTarget(Binder.getCallingUid())) return;
                Object res = param.getResult();
                if (!(res instanceof String[])) return;
                String[] in = (String[]) res;
                List<String> out = new ArrayList<>(in.length);
                for (String s : in) {
                    if (!isCloaked(s)) out.add(s);
                }
                if (out.size() != in.length) param.setResult(out.toArray(new String[0]));
            } catch (Throwable ignored) {
            }
        }
    }

    private static final class ListFilter extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(MethodHookParam param) {
            try {
                if (!isTarget(Binder.getCallingUid())) return;
                Object res = param.getResult();
                if (res == null) return;
                List<?> in = null;
                boolean parceled = false;
                if (res instanceof List) {
                    in = (List<?>) res;
                } else if (res.getClass().getName().equals("android.content.pm.ParceledListSlice")) {
                    Object l = XposedHelpers.callMethod(res, "getList");
                    if (l instanceof List) {
                        in = (List<?>) l;
                        parceled = true;
                    }
                }
                if (in == null) return;
                List<Object> out = new ArrayList<>(in.size());
                for (Object o : in) {
                    if (!isCloaked(nameOf(o))) out.add(o);
                }
                if (out.size() == in.size()) return;
                if (!parceled) {
                    param.setResult(out);
                } else {
                    param.setResult(XposedHelpers.newInstance(
                            XposedHelpers.findClass("android.content.pm.ParceledListSlice",
                                    param.method.getDeclaringClass().getClassLoader()),
                            out));
                }
            } catch (Throwable ignored) {
            }
        }
    }

    /* ------------------------------------------------------------------ */
    /* helpers                                                            */
    /* ------------------------------------------------------------------ */

    private static String methodName(XC_MethodHook.MethodHookParam p) {
        try {
            return p.method.getName();
        } catch (Throwable t) {
            return "call";
        }
    }

    private static String nameOf(Object o) {
        try {
            if (o instanceof android.content.pm.PackageInfo) return ((android.content.pm.PackageInfo) o).packageName;
            if (o instanceof android.content.pm.ApplicationInfo) return ((android.content.pm.ApplicationInfo) o).packageName;
            if (o instanceof android.content.pm.ResolveInfo) {
                android.content.pm.ResolveInfo ri = (android.content.pm.ResolveInfo) o;
                if (ri.activityInfo != null) return ri.activityInfo.packageName;
                if (ri.serviceInfo != null) return ri.serviceInfo.packageName;
                if (ri.providerInfo != null) return ri.providerInfo.packageName;
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private static String firstString(Object[] args) {
        if (args == null) return null;
        for (Object a : args) {
            if (a instanceof String) return (String) a;
        }
        return null;
    }

    private static boolean isTarget(int uid) {
        refresh();
        return TARGET_UIDS.contains(uid);
    }

    private static boolean isCloaked(String pkg) {
        refresh();
        return pkg != null && HIDDEN.contains(pkg);
    }

    /** reload at most every RELOAD_MS, and only when the file changed */
    private static synchronized void refresh() {
        long now = System.currentTimeMillis();
        if (now - loadedAt < RELOAD_MS) return;
        loadedAt = now;
        try {
            File f = new File(CONFIG);
            long mt = f.lastModified();
            if (mt == lastMtime) return;
            lastMtime = mt;
            BufferedReader r = new BufferedReader(new FileReader(f));
            StringBuilder sb = new StringBuilder();
            try {
                String line;
                while ((line = r.readLine()) != null) sb.append(line);
            } finally {
                r.close();
            }
            String json = sb.toString();
            TARGET_UIDS.clear();
            TARGETS.clear();
            HIDDEN.clear();
            readInts(json, "\"targetUids\"", TARGET_UIDS);
            readStrings(json, "\"targets\"", TARGETS);
            readStrings(json, "\"hidden\"", HIDDEN);
        } catch (Throwable ignored) {
            // keep the last good set
        }
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
