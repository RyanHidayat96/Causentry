package com.causentry.app;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Debug;
import android.util.Log;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/**
 * Causentry — universal detection-bypass engine.
 *
 * Runs inside protected apps (Vector / LSPosed) and neutralises the common
 * reasons an app refuses to run on a rooted / tweaked device:
 *   - Developer options & ADB settings
 *   - Root indicators (binaries, props, package list, shell probes, RootBeer)
 *   - Fake-GPS / mock-location indicators
 *   - Debugger attachment
 *   - Hooking-framework fingerprints
 */
public final class CausentryModule implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lp) {
        try {
            if (lp == null || lp.packageName == null) return;

            // System-side components: never injected into the protected app itself.
            if ("android".equals(lp.packageName)) {
                SystemCloak.hookSystemServer(lp.classLoader);
                return;
            }
            if ("com.android.providers.settings".equals(lp.packageName)) {
                SystemCloak.hookSettingsProvider(lp.classLoader);
                return;
            }

            Cfg cfg = Cfg.get();
            if (!cfg.isProtected(lp.packageName)) return;
            ClassLoader cl = lp.classLoader;

            Log.i(Cfg.TAG, "cloaking " + lp.packageName + " (config: " + cfg.loadedFrom + ")");
            if (cfg.cloakSettings) cloakSettings(cl);
            if (cfg.cloakPackages) cloakPackages(cl, cfg);
            if (cfg.cloakRoot) cloakRoot(cl);
            if (cfg.cloakLocation) cloakLocation(cl);
            if (cfg.cloakDebug) cloakDebug(cl);
            if (cfg.cloakFramework) cloakFramework(cl);
            if (cfg.spoofProps) spoofProps(cl);
            if (cfg.spoofBuild) spoofBuild();
            bestEffortTargets(cl);
            Log.i(Cfg.TAG, "cloak active for " + lp.packageName);
        } catch (Throwable t) {
            Log.e(Cfg.TAG, "cloak failed: " + t);
            XposedBridge.log(t);
        }
    }

    /* ------------------------------------------------------------------ */
    /* Settings: developer options / ADB / mock location                   */
    /* ------------------------------------------------------------------ */

    private void cloakSettings(ClassLoader cl) {
        for (String cls : new String[]{
                "android.provider.Settings$Secure",
                "android.provider.Settings$Global",
                "android.provider.Settings$System"}) {
            Class<?> c = safeFind(cls, cl);
            if (c == null) continue;
            XposedBridge.hookAllMethods(c, "getInt", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam p) {
                    if (isWatchedKey(p)) p.setResult(0);
                }
            });
            XposedBridge.hookAllMethods(c, "getLong", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam p) {
                    if (isWatchedKey(p)) p.setResult(0L);
                }
            });
            XposedBridge.hookAllMethods(c, "getFloat", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam p) {
                    if (isWatchedKey(p)) p.setResult(0f);
                }
            });
            XposedBridge.hookAllMethods(c, "getString", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam p) {
                    if (isWatchedKey(p)) p.setResult(null);
                }
            });
        }
    }

    private static boolean isWatchedKey(XC_MethodHook.MethodHookParam p) {
        Object[] a = p.args;
        if (a == null) return false;
        for (Object o : a) {
            if (o instanceof String && Hide.SETTINGS_KEYS.contains(o)) return true;
        }
        return false;
    }

    /* ------------------------------------------------------------------ */
    /* Package visibility                                                  */
    /* ------------------------------------------------------------------ */

    private void cloakPackages(ClassLoader cl, Cfg cfg) {
        Class<?> apm = safeFind("android.app.ApplicationPackageManager", cl);
        if (apm == null) return;

        XposedBridge.hookAllMethods(apm, "getPackageInfo", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                String name = firstString(p.args);
                if (name != null && cfg.isPackageHidden(name)) {
                    p.setThrowable(new PackageManager.NameNotFoundException(name));
                }
            }
        });
        XposedBridge.hookAllMethods(apm, "getApplicationInfo", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                String name = firstString(p.args);
                if (name != null && cfg.isPackageHidden(name)) {
                    p.setThrowable(new PackageManager.NameNotFoundException(name));
                }
            }
        });
        XposedBridge.hookAllMethods(apm, "getInstalledPackages", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam p) {
                filterResult(p, cfg, true);
            }
        });
        XposedBridge.hookAllMethods(apm, "getInstalledApplications", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam p) {
                filterResult(p, cfg, false);
            }
        });
        XposedBridge.hookAllMethods(apm, "getPackageInfoAsUser", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                String name = firstString(p.args);
                if (name != null && cfg.isPackageHidden(name)) {
                    p.setThrowable(new PackageManager.NameNotFoundException(name));
                }
            }
        });
    }

    private static void filterResult(XC_MethodHook.MethodHookParam p, Cfg cfg, boolean packages) {
        Object r = p.getResult();
        if (!(r instanceof List)) return;
        List<?> src = (List<?>) r;
        List<Object> out = new ArrayList<>(src.size());
        for (Object o : src) {
            String name = null;
            if (packages && o instanceof PackageInfo) name = ((PackageInfo) o).packageName;
            if (!packages && o instanceof ApplicationInfo) name = ((ApplicationInfo) o).packageName;
            if (name == null || !cfg.isPackageHidden(name)) out.add(o);
        }
        if (out.size() != src.size()) p.setResult(out);
    }

    /* ------------------------------------------------------------------ */
    /* Root indicators                                                     */
    /* ------------------------------------------------------------------ */

    private void cloakRoot(ClassLoader cl) {
        // File-based probes
        XposedBridge.hookAllMethods(java.io.File.class, "exists", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    Object t = p.thisObject;
                    if (t instanceof java.io.File && Hide.isRootishPath(((java.io.File) t).getPath())) {
                        p.setResult(Boolean.FALSE);
                    }
                } catch (Throwable ignored) {
                }
            }
        });
        XposedBridge.hookAllMethods(java.io.File.class, "isFile", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    Object t = p.thisObject;
                    if (t instanceof java.io.File && Hide.isRootishPath(((java.io.File) t).getPath())) {
                        p.setResult(Boolean.FALSE);
                    }
                } catch (Throwable ignored) {
                }
            }
        });
        XposedBridge.hookAllMethods(java.io.File.class, "canRead", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                try {
                    Object t = p.thisObject;
                    if (t instanceof java.io.File && Hide.isRootishPath(((java.io.File) t).getPath())) {
                        p.setResult(Boolean.FALSE);
                    }
                } catch (Throwable ignored) {
                }
            }
        });

        // Shell probes ("which su", "su -c id", ...)
        XposedBridge.hookAllMethods(Runtime.class, "exec", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                String cmd = joinCommand(p.args);
                if (Hide.isRootishCommand(cmd)) {
                    p.setThrowable(new IOException("Cannot run program: EACCES (Permission denied)"));
                }
            }
        });
        XposedBridge.hookAllMethods(ProcessBuilder.class, "start", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                Object t = p.thisObject;
                if (t instanceof ProcessBuilder) {
                    List<String> c = ((ProcessBuilder) t).command();
                    if (c != null && Hide.isRootishCommand(String.join(" ", c))) {
                        p.setThrowable(new IOException("Cannot run program: EACCES (Permission denied)"));
                    }
                }
            }
        });

        // RootBeer & friends
        Class<?> rbn = safeFind("com.scottyab.rootbeer.RootBeerNative", cl);
        if (rbn != null) {
            XposedBridge.hookAllMethods(rbn, "nativeCheckForRoot", XC_MethodReplacement.returnConstant(0));
            XposedBridge.hookAllMethods(rbn, "setLogDebugMessages", XC_MethodReplacement.returnConstant(null));
        }
        Class<?> rb = safeFind("com.scottyab.rootbeer.RootBeer", cl);
        if (rb != null) {
            for (String m : new String[]{"isRooted", "isRootedWithBusyBoxCheck", "detectRootManagementApps",
                    "detectPotentiallyDangerousApps", "detectRootCloakingApps", "checkForBinary",
                    "checkForSuBinary", "checkSuExists", "detectDangerousProps", "detectRWPaths",
                    "checkForDangerousProps", "checkForRWPaths", "detectTestKeys"}) {
                try {
                    XposedBridge.hookAllMethods(rb, m, new FalseReplacement());
                } catch (Throwable ignored) {
                }
            }
        }
    }

    /** Returns a falsy value matching the hooked method's return type. */
    private static final class FalseReplacement extends XC_MethodReplacement {
        @Override
        protected Object replaceHookedMethod(MethodHookParam param) {
            Class<?> rt = param.method instanceof Method ? ((Method) param.method).getReturnType() : boolean.class;
            if (rt == boolean.class || rt == Boolean.class) return Boolean.FALSE;
            if (rt == int.class || rt == Integer.class) return 0;
            if (rt == long.class || rt == Long.class) return 0L;
            if (rt == String.class) return "";
            return null;
        }
    }

    /* ------------------------------------------------------------------ */
    /* Mock / fake GPS                                                     */
    /* ------------------------------------------------------------------ */

    private void cloakLocation(ClassLoader cl) {
        Class<?> loc = safeFind("android.location.Location", cl);
        if (loc != null) {
            XposedBridge.hookAllMethods(loc, "isMock", XC_MethodReplacement.returnConstant(Boolean.FALSE));
            XposedBridge.hookAllMethods(loc, "isFromMockProvider", XC_MethodReplacement.returnConstant(Boolean.FALSE));
        }
        Class<?> lm = safeFind("android.location.LocationManager", cl);
        if (lm != null) {
            XposedBridge.hookAllMethods(lm, "getProviders", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam p) {
                    p.setResult(filterProviders(p.getResult()));
                }
            });
            XposedBridge.hookAllMethods(lm, "getAllProviders", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam p) {
                    p.setResult(filterProviders(p.getResult()));
                }
            });
            XposedBridge.hookAllMethods(lm, "getProvider", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam p) {
                    String n = firstString(p.args);
                    if (isSuspiciousProvider(n)) p.setResult(null);
                }
            });
        }
    }

    private static Object filterProviders(Object r) {
        if (!(r instanceof Collection)) return r;
        Collection<?> src = (Collection<?>) r;
        List<Object> out = new ArrayList<>(src.size());
        for (Object o : src) {
            if (!(o instanceof String) || !isSuspiciousProvider((String) o)) out.add(o);
        }
        return out;
    }

    private static boolean isSuspiciousProvider(String name) {
        if (name == null) return false;
        String n = name.toLowerCase();
        return n.contains("mock") || n.contains("fake") || n.contains("test");
    }

    /* ------------------------------------------------------------------ */
    /* Debugger / framework fingerprints                                   */
    /* ------------------------------------------------------------------ */

    private void cloakDebug(ClassLoader cl) {
        Class<?> d = safeFind("android.os.Debug", cl);
        if (d != null) {
            XposedBridge.hookAllMethods(d, "isDebuggerConnected", XC_MethodReplacement.returnConstant(Boolean.FALSE));
            XposedBridge.hookAllMethods(d, "waitingForDebugger", XC_MethodReplacement.returnConstant(Boolean.FALSE));
        }
    }

    private void cloakFramework(ClassLoader cl) {
        XposedBridge.hookAllMethods(Class.class, "forName", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                String name = firstString(p.args);
                if (name != null && Hide.isFrameworkName(name) && !isFrameworkCaller()) {
                    p.setThrowable(new ClassNotFoundException(name));
                }
            }
        });
        XposedBridge.hookAllMethods(ClassLoader.class, "loadClass", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) throws Throwable {
                String name = firstString(p.args);
                if (name != null && Hide.isFrameworkName(name) && !isFrameworkCaller()) {
                    p.setThrowable(new ClassNotFoundException(name));
                }
            }
        });
    }

    private static boolean isFrameworkCaller() {
        StackTraceElement[] st = new Throwable().getStackTrace();
        int limit = Math.min(st.length, 8);
        for (int i = 1; i < limit; i++) {
            String c = st[i].getClassName();
            if (c.startsWith("com.causentry.app") || c.startsWith("de.robv.android.xposed")
                    || c.startsWith("org.lsposed") || c.startsWith("org.matrix.vector")
                    || c.startsWith("io.github.libxposed")) {
                return true;
            }
        }
        return false;
    }

    /* ------------------------------------------------------------------ */
    /* Props / Build                                                       */
    /* ------------------------------------------------------------------ */

    private void spoofProps(ClassLoader cl) {
        Class<?> sp = safeFind("android.os.SystemProperties", cl);
        if (sp == null) return;
        XposedBridge.hookAllMethods(sp, "get", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam p) {
                String key = firstString(p.args);
                if (key == null) return;
                String v = spoofedValue(key);
                if (v != null) p.setResult(v);
            }
        });
    }

    private static String spoofedValue(String key) {
        String k = key.toLowerCase();
        for (String[] pair : Hide.PROP_SPOOFS) {
            if (pair[0].equals(k)) return pair[1];
        }
        return null;
    }

    private void spoofBuild() {
        try {
            XposedHelpers.setStaticObjectField(Build.class, "TAGS", "release-keys");
            XposedHelpers.setStaticObjectField(Build.class, "TYPE", "user");
            XposedHelpers.setStaticBooleanField(Build.class, "DEBUGGABLE", false);
        } catch (Throwable t) {
            XposedBridge.log(t);
        }
    }

    /* ------------------------------------------------------------------ */
    /* Best-effort hooks for known in-app detectors                        */
    /* ------------------------------------------------------------------ */

    private void bestEffortTargets(ClassLoader cl) {
        // JMO (com.bpjstku) obfuscated helpers — silently skipped if version changed.
        tryHookReplacement(cl, "getCollectionUri", "TuitionPaymentFragmentbindingInflater1", Boolean.FALSE);
        tryHookReplacement(cl, "AndroidImageReaderProxyExternalSyntheticLambda1",
                "TuitionPaymentFragmentspecialinlinedviewModeldefault3", Boolean.FALSE);
    }

    private void tryHookReplacement(ClassLoader cl, String cls, String method, Object value) {
        try {
            Class<?> c = XposedHelpers.findClassIfExists(cls, cl);
            if (c == null) return;
            XposedBridge.hookAllMethods(c, method, XC_MethodReplacement.returnConstant(value));
        } catch (Throwable ignored) {
        }
    }

    /* ------------------------------------------------------------------ */
    /* helpers                                                             */
    /* ------------------------------------------------------------------ */

    private static Class<?> safeFind(String name, ClassLoader cl) {
        try {
            return XposedHelpers.findClassIfExists(name, cl);
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

    private static String joinCommand(Object[] args) {
        if (args == null) return null;
        StringBuilder sb = new StringBuilder();
        for (Object o : args) {
            if (o instanceof String) {
                sb.append((String) o).append(' ');
            } else if (o instanceof String[]) {
                for (String s : (String[]) o) sb.append(s).append(' ');
            } else if (o instanceof List) {
                for (Object s : (List<?>) o) sb.append(String.valueOf(s)).append(' ');
            }
        }
        return sb.toString();
    }
}
