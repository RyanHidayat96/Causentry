package com.causentry.app;

import java.lang.reflect.Field;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

/**
 * Denies the App-Zygote service-spawn path for protected packages.
 *
 * Background (approach taken from MhmRdd/Isolation-Policy, Apache-2.0):
 * a service declared with android:useAppZygote="true" + isolatedProcess="true" is forked
 * from a per-app App Zygote. Everything the app puts in its ZygotePreload runs inside the
 * app_zygote SELinux domain, which AOSP grants selinux_check_context / selinux_check_access.
 * A hardened app (PairIP / Zimperium) uses exactly that to interrogate the kernel about
 * SELinux labels and access vectors - something a normal app domain cannot do - and force-
 * closes when the answers look tampered with.
 *
 * Returning false from HostingRecord#usesAppZygote for a protected package stops that
 * spawn path: the ZygotePreload never runs in app_zygote, while the app itself keeps
 * running normally (the failed/redirected service bind is tolerated).
 */
public final class AppZygoteCloak {

    private AppZygoteCloak() {
    }

    public static void install(ClassLoader cl) {
        try {
            Class<?> hr = XposedHelpers.findClassIfExists("com.android.server.am.HostingRecord", cl);
            if (hr == null) {
                XposedBridge.log("Causentry appzygote: HostingRecord not found");
                return;
            }
            int n = XposedBridge.hookAllMethods(hr, "usesAppZygote", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) {
                    try {
                        String pkg = definingPackage(param.thisObject);
                        if (pkg == null || !isTargetPackage(pkg)) return;
                        XposedBridge.log("Causentry appzygote: denied useAppZygote for " + pkg);
                        param.setResult(Boolean.FALSE);
                    } catch (Throwable ignored) {
                    }
                }
            }).size();
            XposedBridge.log("Causentry appzygote: hooked " + n + " methods on HostingRecord"
                    + " targets=" + CloakCfg.TARGETS);
        } catch (Throwable t) {
            XposedBridge.log("Causentry appzygote failed: " + t);
        }
    }

    /** the package a HostingRecord was created for, without depending on field names */
    private static String definingPackage(Object record) {
        if (record == null) return null;
        try {
            CloakCfg.refresh();
            for (Field f : record.getClass().getDeclaredFields()) {
                if (f.getType() != String.class) continue;
                try {
                    f.setAccessible(true);
                    Object v = f.get(record);
                    if (!(v instanceof String)) continue;
                    String s = (String) v;
                    if (s.isEmpty()) continue;
                    if (isTargetPackage(s)) return s;
                    int colon = s.indexOf(':');
                    if (colon > 0 && isTargetPackage(s.substring(0, colon))) return s.substring(0, colon);
                } catch (Throwable ignored) {
                }
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private static boolean isTargetPackage(String name) {
        if (name == null) return false;
        CloakCfg.refresh();
        return CloakCfg.APPZYGOTE.contains(name);
    }
}
