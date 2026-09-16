package com.causentry.app;

import android.app.AppOpsManager;
import android.os.Binder;

import java.util.ArrayList;
import java.util.List;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

/**
 * AppOps cloaking in system_server.
 *
 * Detectors find fake-GPS apps without touching the package list:
 *   for (installed app) if (appOps.checkOpNoThrow(OPSTR_MOCK_LOCATION, uid, pkg) == ALLOWED) -> "Lokasi Palsu"
 * and the reverse lookup getPackagesForOps()/getOpsForPackage() returns every package that
 * holds an op - including the mock-location app, even when its package queries are filtered.
 *
 * So for a protected caller: a cloaked package never holds mock location (the op reports
 * MODE_ERRORED) and it is dropped from op listings. Nothing about the app or its real
 * app-op is modified - the filter only exists inside the protected app's binder calls.
 */
public final class AppOpsCloak {

    private static final String OP_MOCK = "android:mock_location";
    private static final int OP_MOCK_ID = 58;                 // AppOpsManager.OP_MOCK_LOCATION
    private static final int MODE_ERRORED = AppOpsManager.MODE_ERRORED;

    private AppOpsCloak() {
    }

    public static void install(ClassLoader cl) {
        try {
            Class<?> svc = XposedHelpers.findClassIfExists("com.android.server.appop.AppOpsService", cl);
            if (svc == null) {
                XposedBridge.log("Causentry appops: AppOpsService not found");
                return;
            }
            int n = 0;
            for (String m : new String[]{"checkOperation", "noteOperation", "startOperation", "checkOperationRaw",
                    "noteOperationUnchecked", "startOperationUnchecked", "finishOperation"}) {
                n += XposedBridge.hookAllMethods(svc, m, new OpHook()).size();
            }
            n += XposedBridge.hookAllMethods(svc, "getPackagesForOps", new OpsListFilter()).size();
            n += XposedBridge.hookAllMethods(svc, "getOpsForPackage", new OpsListFilter()).size();
            XposedBridge.log("Causentry appops: hooked " + n + " methods on AppOpsService");
        } catch (Throwable t) {
            XposedBridge.log("Causentry appops failed: " + t);
        }
    }

    /** mock-location requests about a cloaked package answer "denied" */
    private static final class OpHook extends XC_MethodHook {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) {
            try {
                if (!CloakCfg.callerIsTarget()) return;
                if (!isMockOp(param.args)) return;
                String pkg = packageArg(param.args);
                if (pkg == null || !CloakCfg.isCloakedForCaller(pkg)) return;
                int uid = Binder.getCallingUid();
                XposedBridge.log("Causentry appops: " + param.method.getName() + "(" + pkg
                        + ") -> MODE_ERRORED for caller=" + uid);
                param.setResult(MODE_ERRORED);
            } catch (Throwable ignored) {
            }
        }
    }

    /** op listings never mention a cloaked package */
    private static final class OpsListFilter extends XC_MethodHook {
        @Override
        protected void afterHookedMethod(MethodHookParam param) {
            try {
                if (!CloakCfg.callerIsTarget()) return;
                Object res = param.getResult();
                if (!(res instanceof List)) return;
                List<?> in = (List<?>) res;
                List<Object> out = new ArrayList<>(in.size());
                int dropped = 0;
                for (Object ops : in) {
                    String pkg = null;
                    try {
                        pkg = (String) XposedHelpers.callMethod(ops, "getPackageName");
                    } catch (Throwable ignored) {
                    }
                    if (pkg != null && CloakCfg.isCloakedForCaller(pkg)) {
                        dropped++;
                        XposedBridge.log("Causentry appops: dropped " + pkg + " from "
                                + param.method.getName() + " for caller=" + Binder.getCallingUid());
                        continue;
                    }
                    out.add(ops);
                }
                if (dropped > 0) param.setResult(out);
            } catch (Throwable ignored) {
            }
        }
    }

    private static boolean isMockOp(Object[] args) {
        if (args == null) return false;
        for (Object a : args) {
            if (a instanceof String && OP_MOCK.equals(a)) return true;
            if (a instanceof Integer && (Integer) a == OP_MOCK_ID) return true;
        }
        return false;
    }

    private static String packageArg(Object[] args) {
        if (args == null) return null;
        for (Object a : args) {
            if (a instanceof String && ((String) a).contains(".")) return (String) a;
        }
        return null;
    }
}
