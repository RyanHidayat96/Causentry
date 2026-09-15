package com.causentry.app;

import android.os.Binder;

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

    private static final String[] CANDIDATES = {
            "com.android.server.pm.IPackageManagerBase",                    // Android 15/16
            "com.android.server.pm.PackageManagerService$IPackageManagerImpl",
            "com.android.server.pm.PackageManagerService",
    };

    private PackageCloak() {
    }

    /** queries that take a package name: cloaked -> NameNotFoundException */
    private static final String[] NAME_METHODS = {
            "getPackageInfo", "getPackageInfoVersioned", "getApplicationInfo", "getApplicationInfoAsUser",
            "getActivityInfo", "getServiceInfo", "getReceiverInfo", "getProviderInfo",
    };

    /** queries that return a list: cloaked entries are dropped */
    private static final String[] LIST_METHODS = {
            "getInstalledPackages", "getInstalledPackagesAsUser", "getInstalledApplications",
            "getInstalledApplicationsAsUser", "getPackagesHoldingPermissions", "getPreferredActivities",
            "queryIntentActivities", "queryIntentServices", "queryBroadcastReceivers",
            "queryIntentContentProviders", "queryContentProviders",
    };

    /** resolve-style queries: cloaked component -> nothing resolves */
    private static final String[] RESOLVE_METHODS = {
            "resolveIntent", "resolveService", "resolveContentProvider", "findPersistentPreferredActivity",
    };

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
                NotFound notFound = new NotFound();
                ListFilter listFilter = new ListFilter();
                NullWhenCloaked nullFilter = new NullWhenCloaked();
                for (String m : NAME_METHODS) n += XposedBridge.hookAllMethods(c, m, notFound).size();
                for (String m : LIST_METHODS) n += XposedBridge.hookAllMethods(c, m, listFilter).size();
                for (String m : RESOLVE_METHODS) n += XposedBridge.hookAllMethods(c, m, nullFilter).size();
                n += XposedBridge.hookAllMethods(c, "getPackageUid", new CloakUid()).size();
                n += XposedBridge.hookAllMethods(c, "getPackagesForUid", new ArrayFilter()).size();
                n += XposedBridge.hookAllMethods(c, "getApplicationEnabledSetting", new CloakEnabled()).size();
                if (n > 0) {
                    hooked += n;
                    XposedBridge.log("Causentry cloak: hooked " + n + " methods on " + name);
                }
            }
            // diagnostics: watch every binder-facing PMS method for cloaked package names,
            // so a leaking API shows up by name instead of being guessed at
            for (String name : CANDIDATES) {
                try {
                    Class<?> c = XposedHelpers.findClass(name, cl);
                    if (c != null) hooked += hookEveryMethod(c);
                } catch (Throwable ignored) {
                }
            }
            CloakCfg.refresh();
            XposedBridge.log("Causentry cloak installed in system_server: methods=" + hooked
                    + " targets=" + CloakCfg.TARGETS + " hidden=" + CloakCfg.HIDDEN.size());
        } catch (Throwable t) {
            XposedBridge.log("Causentry cloak failed: " + t);
        }
    }

    /** hooks every declared method; any call/result naming a cloaked package is logged */
    private static int hookEveryMethod(Class<?> c) {
        int n = 0;
        for (java.lang.reflect.Method m : c.getDeclaredMethods()) {
            if (m.getParameterCount() > 12) continue;
            final String mname = m.getName();
            try {
                XposedBridge.hookMethod(m, new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam p) {
                        try {
                            if (!CloakCfg.callerIsTarget()) return;
                            String hit = firstCloakedIn(argsText(p.args));
                            if (hit != null) {
                                XposedBridge.log("Causentry diag: " + mname + " ARG " + hit
                                        + " caller=" + android.os.Binder.getCallingUid());
                            }
                        } catch (Throwable ignored) {
                        }
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam p) {
                        try {
                            if (!CloakCfg.callerIsTarget()) return;
                            String hit = firstCloakedIn(String.valueOf(p.getResult()));
                            if (hit != null) {
                                XposedBridge.log("Causentry diag: " + mname + " RESULT " + hit
                                        + " caller=" + android.os.Binder.getCallingUid());
                            }
                        } catch (Throwable ignored) {
                        }
                    }
                });
                n++;
            } catch (Throwable ignored) {
            }
        }
        return n;
    }

    private static String argsText(Object[] args) {
        if (args == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Object a : args) {
            sb.append(String.valueOf(a)).append('|');
            if (sb.length() > 400) break;
        }
        return sb.toString();
    }

    private static String firstCloakedIn(String text) {
        if (text == null || text.isEmpty()) return null;
        CloakCfg.refresh();
        for (String p : CloakCfg.HIDDEN) {
            if (text.contains(p)) return p;
        }
        return null;
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
                if (pkg != null && isCloaked(pkg) && CloakCfg.callerIsTarget()) {
                    param.setResult(-1);
                }
            } catch (Throwable ignored) {
            }
        }
    }

    /** a cloaked package also reports as disabled ("installed but not usable") */
    private static final class CloakEnabled extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) {
            try {
                String pkg = firstString(param.args);
                if (pkg != null && isCloaked(pkg) && CloakCfg.callerIsTarget()) {
                    param.setResult(2);   // COMPONENT_ENABLED_STATE_DISABLED
                }
            } catch (Throwable ignored) {
            }
        }
    }

    /** resolve* / findPersistent* : a cloaked component must not resolve */
    private static final class NullWhenCloaked extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(MethodHookParam param) {
            try {
                if (!CloakCfg.callerIsTarget()) return;
                String name = nameOf(param.getResult());
                if (name != null && isCloaked(name)) {
                    XposedBridge.log("Causentry cloak: " + methodName(param) + " leaked " + name
                            + " -> null for caller=" + Binder.getCallingUid());
                    param.setResult(null);
                }
            } catch (Throwable ignored) {
            }
        }
    }

    private static final class ArrayFilter extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(MethodHookParam param) {
            try {
                if (!CloakCfg.callerIsTarget()) return;
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
                if (!CloakCfg.callerIsTarget()) return;
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
                    String name = nameOf(o);
                    if (!isCloaked(name)) {
                        out.add(o);
                    } else {
                        XposedBridge.log("Causentry cloak: " + methodName(param) + " leaked " + name
                                + " -> filtered for caller=" + Binder.getCallingUid());
                    }
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
        return CloakCfg.isTarget(uid);
    }

    private static boolean isCloaked(String pkg) {
        return CloakCfg.isCloaked(pkg);
    }
}
