package com.causentry.app;

import android.os.Binder;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

/**
 * System-side cloaking. Runs in system processes (SettingsProvider, system_server)
 * so that hardened apps (PairIP / RASP wrappers that crash when an Xposed module is
 * injected into *their* process) never need to be injected at all.
 */
public final class SystemCloak {

    private static volatile Set<Integer> protectedUids = null;
    private static volatile long uidCacheAt = 0L;
    private static final long UID_CACHE_MS = 30_000L;

    private SystemCloak() {
    }

    /* ------------------------------------------------------------------ */
    /* SettingsProvider: report clean developer/ADB flags to protected apps */
    /* ------------------------------------------------------------------ */

    public static void hookSettingsProvider(ClassLoader cl) {
        Class<?> provider = XposedHelpers.findClassIfExists("com.android.providers.settings.SettingsProvider", cl);
        if (provider == null) {
            Log.w(Cfg.TAG, "SettingsProvider class not found");
            return;
        }
        XposedBridge.hookAllMethods(provider, "call", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) {
                try {
                    String method = param.args.length > 0 && param.args[0] instanceof String
                            ? (String) param.args[0] : null;      // e.g. "GET_secure"
                    String arg = param.args.length > 1 && param.args[1] instanceof String
                            ? (String) param.args[1] : null;      // setting key name
                    if (method == null || arg == null) return;
                    if (!method.startsWith("GET")) return;         // never touch writes
                    if (!Hide.SETTINGS_KEYS.contains(arg)) return;
                    if (!isProtectedUid(Binder.getCallingUid())) return;

                    Bundle b = new Bundle();
                    b.putString(Settings.NameValueTable.VALUE, "0");
                    b.putString(Settings.NameValueTable.NAME, arg);
                    param.setResult(b);
                    Log.i(Cfg.TAG, "settings " + method + "/" + arg + " -> clean for uid "
                            + Binder.getCallingUid());
                } catch (Throwable t) {
                    Log.w(Cfg.TAG, "settings hook error: " + t);
                }
            }
        });
        Log.i(Cfg.TAG, "SettingsProvider cloak installed");
    }

    /* ------------------------------------------------------------------ */
    /* PackageManagerService: hide denylisted packages from protected apps */
    /* ------------------------------------------------------------------ */

    public static void hookSystemServer(ClassLoader cl) {
        Class<?> impl = XposedHelpers.findClassIfExists(
                "com.android.server.pm.PackageManagerService$IPackageManagerImpl", cl);
        if (impl == null) {
            impl = XposedHelpers.findClassIfExists("com.android.server.pm.PackageManagerService", cl);
        }
        if (impl == null) {
            Log.w(Cfg.TAG, "PackageManagerService class not found");
            return;
        }
        XposedBridge.hookAllMethods(impl, "getPackageInfo", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) {
                try {
                    String pkg = firstString(param.args);
                    if (pkg == null) return;
                    if (!Cfg.get().isPackageHidden(pkg)) return;
                    int uid = Binder.getCallingUid();
                    if (!isProtectedUid(uid)) return;
                    param.setResult(null);   // caller gets NameNotFoundException
                    Log.i(Cfg.TAG, "hidden package " + pkg + " from uid " + uid);
                } catch (Throwable t) {
                    Log.w(Cfg.TAG, "pms hook error: " + t);
                }
            }
        });
        XposedBridge.hookAllMethods(impl, "getApplicationInfo", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) {
                try {
                    String pkg = firstString(param.args);
                    if (pkg == null) return;
                    if (!Cfg.get().isPackageHidden(pkg)) return;
                    if (!isProtectedUid(Binder.getCallingUid())) return;
                    param.setResult(null);
                } catch (Throwable t) {
                    Log.w(Cfg.TAG, "pms hook error: " + t);
                }
            }
        });
        Log.i(Cfg.TAG, "PackageManager cloak installed");
    }

    /* ------------------------------------------------------------------ */
    /* helpers                                                             */
    /* ------------------------------------------------------------------ */

    private static boolean isProtectedUid(int uid) {
        if (uid < 10000) return false;                  // system/root traffic is never filtered
        Set<Integer> uids = protectedUids;
        long now = System.currentTimeMillis();
        if (uids == null || now - uidCacheAt > UID_CACHE_MS) {
            uids = resolveProtectedUids();
            protectedUids = uids;
            uidCacheAt = now;
        }
        return uids.contains(uid);
    }

    private static Set<Integer> resolveProtectedUids() {
        Set<Integer> out = new HashSet<>();
        try {
            Object pm = ipm();
            if (pm == null) return out;
            Method getPkgInfo = pm.getClass().getMethod("getPackageInfo", String.class, long.class, int.class);
            for (String pkg : Cfg.get().targets) {
                try {
                    Object pi = getPkgInfo.invoke(pm, pkg, 0L, 0);
                    if (pi == null) continue;
                    Object ai = XposedHelpers.getObjectField(pi, "applicationInfo");
                    if (ai == null) continue;
                    out.add((Integer) XposedHelpers.getObjectField(ai, "uid"));
                } catch (Throwable ignored) {
                }
            }
        } catch (Throwable t) {
            Log.w(Cfg.TAG, "uid resolve failed: " + t);
        }
        return out;
    }

    private static Object ipm() {
        try {
            Class<?> at = Class.forName("android.app.ActivityThread");
            Method m = at.getMethod("getPackageManager");
            return m.invoke(null);
        } catch (Throwable t) {
            return null;
        }
    }

    private static String firstString(Object[] args) {
        if (args == null) return null;
        for (Object o : args) {
            if (o instanceof String) return (String) o;
        }
        return null;
    }
}
