package com.causentry.zygote;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ART hooks for Android 11-16 PackageManager query paths.
 *
 * Key guarantees:
 * - Never throws checked NameNotFoundException from ComputerEngine internal methods (returns null per AOSP contract).
 * - Hooks all overloads with signature-aware callingUid resolution (never mistakes userId for callingUid).
 * - Caches reflective Method/Field extractors once per Class<?> (zero hot-path reflection scans).
 * - Covers UID lookups (getPackagesForUid, getNameForUid, getNamesForUids), providers, installers, and getAllPackages.
 */
final class PackageCloakHooks {
    private static final String TAG = "CausentryZygote";
    private static final long FLAG_MATCH_ANY_USER = 0x00400000L;

    private static ClassLoader systemServerLoader;
    private static final ConcurrentHashMap<Class<?>, PackageExtractor> EXTRACTOR_CACHE = new ConcurrentHashMap<>();
    private static final PackageExtractor NONE_EXTRACTOR = obj -> null;

    static final class InstallResult {
        int pkgHooks;
        int appZygoteHooks;
        int a11yHooks;
    }

    private PackageCloakHooks() {}

    static InstallResult install() {
        InstallResult result = new InstallResult();
        try {
            systemServerLoader = findSystemServerLoader();

            int installed = 0;
            // Internal ComputerEngine lookup methods return null when package is absent/filtered
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getPackageInfoInternal", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getApplicationInfoInternal", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getApplicationInfo", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "generatePackageInfo", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getActivityInfoInternal", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getPackageUidInternal", -1);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getInstallSourceInfo", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "getInstallerPackageName", null);
            installed += hookAllBefore("com.android.server.pm.ComputerEngine", "checkPackageStartable", null);

            // Visibility gates
            installed += hookVisibilityChecks();
            installed += hookAppsFilter();

            // UID -> package reverse lookup hooks (closes UID brute-force enumeration)
            installed += hookUidReverseLookup("com.android.server.pm.ComputerEngine", "getPackagesForUid");
            installed += hookUidReverseLookup("com.android.server.pm.ComputerEngine", "getNameForUid");
            installed += hookNamesForUids("com.android.server.pm.ComputerEngine", "getNamesForUids");

            // Provider & intent & inventory queries
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "resolveContentProvider", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "resolveContentProviderInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "queryIntentActivitiesInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "queryIntentServicesInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ResolveIntentHelper",
                    "queryIntentReceiversInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ResolveIntentHelper",
                    "queryIntentContentProvidersInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.LauncherAppsService$LauncherAppsImpl",
                    "getLauncherActivities", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.LauncherAppsService$LauncherAppsImpl",
                    "getShortcutConfigActivities", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.LauncherAppsService$LauncherAppsImpl",
                    "getActivityList", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "getInstalledPackagesInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "getInstalledApplicationsInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "getInstalledPackages", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "getInstalledApplications", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "getAllPackages", PackageCloakHooks::filterIntentResult);

            result.pkgHooks = installed;
            result.appZygoteHooks = AppZygoteHooks.install(systemServerLoader)
                    + ActiveServicesHooks.install(systemServerLoader);
            result.a11yHooks = AccessibilityHooks.install(systemServerLoader);

            Log.i(TAG, "hooks ready pkg=" + result.pkgHooks
                    + " appZygote=" + result.appZygoteHooks
                    + " a11y=" + result.a11yHooks);
        } catch (Throwable error) {
            Log.e(TAG, "package hook initialization failed", error);
        }
        return result;
    }

    /**
     * Signature-aware before-hook for all overloads of a ComputerEngine query method.
     * Precomputes callingUid/flags parameter indices at install time.
     */
    private static int hookAllBefore(String className, String methodName, Object replacement) {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !methodName.equals(exe.getName())) continue;
                    Method method = (Method) exe;
                    Class<?>[] params = method.getParameterTypes();
                    if (params.length == 0) continue;

                    // Check return type compatibility for primitive replacement (e.g., -1 for int)
                    if (replacement instanceof Integer && method.getReturnType() != int.class) continue;
                    if (replacement == null && method.getReturnType().isPrimitive()) continue;

                    // Determine callingUid arg index accurately:
                    // In ComputerEngine methods with (..., int filterCallingUid, int userId),
                    // filterCallingUid is the SECOND-TO-LAST int when >=2 trailing ints exist.
                    // If only 1 int exists at the end, it is userId -> use Binder.getCallingUid().
                    final int uidArgIdx = resolveFilterCallingUidArgIndex(params);
                    final int flagsArgIdx = resolveFlagsArgIndex(params);
                    final int pkgArgIdx = resolvePackageArgIndex(params);
                    if (pkgArgIdx < 0) continue;

                    HookTransformer transformer = (original, frame) -> {
                        int callingUid = uidArgIdx > 0
                                ? frame.accessor().getInt(uidArgIdx)
                                : Binder.getCallingUid();
                        if (callingUid < 10_000) {
                            callingUid = Binder.getCallingUid();
                        }
                        if (CloakPolicy.hasHiddenPackages(callingUid)) {
                            Object rawPkg = frame.accessor().getReference(pkgArgIdx);
                            String pkg = extractPackageName(rawPkg);
                            if (pkg != null && CloakPolicy.hides(callingUid, pkg)) {
                                if (flagsArgIdx > 0) {
                                    long flags = frame.accessor().getArgumentShorty(flagsArgIdx) == 'J'
                                            ? frame.accessor().getLong(flagsArgIdx)
                                            : frame.accessor().getInt(flagsArgIdx);
                                    if ((flags & FLAG_MATCH_ANY_USER) != 0) {
                                        Transformers.invokeExactNoChecks(original, frame);
                                        return;
                                    }
                                }
                                if (CloakPolicy.probeEnabled()) {
                                    Log.i(TAG, "probe " + methodName + " uid=" + callingUid + " pkg=" + pkg);
                                }
                                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, replacement);
                                return;
                            }
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                    };

                    try {
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                        installed++;
                    } catch (Throwable err) {
                        Log.w(TAG, "hook failed " + method, err);
                    }
                }
            }
        } catch (Throwable error) {
            Log.w(TAG, "class unavailable " + className + "#" + methodName);
        }
        return installed;
    }

    /**
     * Frame index 0 is 'this' for instance methods; parameter i maps to frame index (i + 1).
     * When a method ends with (..., int filterCallingUid, int userId), return (n - 2) + 1.
     */
    private static int resolveFilterCallingUidArgIndex(Class<?>[] params) {
        int n = params.length;
        if (n >= 2 && params[n - 1] == int.class && params[n - 2] == int.class) {
            return (n - 2) + 1;
        }
        return -1;
    }

    private static int resolveFlagsArgIndex(Class<?>[] params) {
        for (int i = 0; i < params.length; i++) {
            if (params[i] == long.class) return i + 1;
        }
        return -1;
    }

    private static int resolvePackageArgIndex(Class<?>[] params) {
        for (int i = 0; i < params.length; i++) {
            if (params[i] == String.class || params[i] == ComponentName.class
                    || params[i].getName().endsWith("PackageStateInternal")
                    || params[i].getName().endsWith("AndroidPackage")) {
                return i + 1;
            }
        }
        return -1;
    }

    private static int hookAppsFilter() {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName("com.android.server.pm.AppsFilterImpl", true, systemServerLoader);
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !"shouldFilterApplication".equals(exe.getName())) continue;
                    Method method = (Method) exe;
                    if (method.getReturnType() != boolean.class) continue;
                    Class<?>[] params = method.getParameterTypes();
                    // Android 14+: (Computer snapshot, int callingUid, Object callingSetting, PackageStateInternal targetPkgSetting, int userId)
                    final int uidIdx = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE && params.length >= 4 && params[1] == int.class) ? 2 : -1;
                    final int targetIdx = (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE && params.length >= 4) ? 4 : -1;

                    HookTransformer transformer = (original, frame) -> {
                        int uid = uidIdx > 0 ? frame.accessor().getInt(uidIdx) : Binder.getCallingUid();
                        if (CloakPolicy.hasHiddenPackages(uid)) {
                            String pkg = targetIdx > 0
                                    ? extractPackageName(frame.accessor().getReference(targetIdx))
                                    : packageNameFromObjects(frame);
                            if (pkg != null && CloakPolicy.hides(uid, pkg)) {
                                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, true);
                                return;
                            }
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                    };
                    Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    installed++;
                }
            }
        } catch (Throwable err) {
            Log.w(TAG, "AppsFilterImpl hook failed", err);
        }
        return installed;
    }

    private static int hookVisibilityChecks() {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName("com.android.server.pm.ComputerEngine", true, systemServerLoader);
            for (Executable executable : Reflection.getHiddenExecutables(clazz)) {
                if (!(executable instanceof Method) || !"shouldFilterApplication".equals(executable.getName())) continue;
                Method method = (Method) executable;
                Class<?>[] parameters = method.getParameterTypes();
                if (method.getReturnType() != boolean.class || parameters.length < 3
                        || !parameters[0].getName().equals("com.android.server.pm.pkg.PackageStateInternal")
                        || parameters[1] != int.class) continue;
                HookTransformer transformer = (original, frame) -> {
                    int uid = frame.accessor().getInt(2);
                    if (CloakPolicy.hasHiddenPackages(uid)) {
                        String pkg = extractPackageName(frame.accessor().getReference(1));
                        if (pkg != null && CloakPolicy.hides(uid, pkg)) {
                            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, true);
                            return;
                        }
                    }
                    Transformers.invokeExactNoChecks(original, frame);
                };
                Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                installed++;
            }
        } catch (Throwable err) {
            Log.w(TAG, "visibility hooks failed", err);
        }
        return installed;
    }

    private static int hookUidReverseLookup(String className, String methodName) {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !methodName.equals(exe.getName())) continue;
                    Method method = (Method) exe;
                    Class<?>[] params = method.getParameterTypes();
                    if (params.length < 1 || params[0] != int.class) continue;
                    HookTransformer transformer = (original, frame) -> {
                        int callerUid = Binder.getCallingUid();
                        int queriedUid = frame.accessor().getInt(1);
                        if (CloakPolicy.hidesUid(callerUid, queriedUid)) {
                            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, null);
                            return;
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                        if (CloakPolicy.hasHiddenPackages(callerUid)) {
                            Object ret = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                            if (ret instanceof String[]) {
                                String[] arr = (String[]) ret;
                                ArrayList<String> kept = new ArrayList<>(arr.length);
                                boolean changed = false;
                                for (String p : arr) {
                                    if (CloakPolicy.hides(callerUid, p)) changed = true;
                                    else kept.add(p);
                                }
                                if (changed) {
                                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX,
                                            kept.isEmpty() ? null : kept.toArray(new String[0]));
                                }
                            } else if (ret instanceof String && CloakPolicy.hides(callerUid, (String) ret)) {
                                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, null);
                            }
                        }
                    };
                    Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    installed++;
                }
            }
        } catch (Throwable ignored) {}
        return installed;
    }

    private static int hookNamesForUids(String className, String methodName) {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !methodName.equals(exe.getName())) continue;
                    Method method = (Method) exe;
                    HookTransformer transformer = (original, frame) -> {
                        Transformers.invokeExactNoChecks(original, frame);
                        int callerUid = Binder.getCallingUid();
                        if (!CloakPolicy.hasHiddenPackages(callerUid)) return;
                        Object ret = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                        if (ret instanceof String[]) {
                            String[] arr = (String[]) ret;
                            for (int i = 0; i < arr.length; i++) {
                                if (arr[i] != null && CloakPolicy.hides(callerUid, arr[i])) {
                                    arr[i] = null;
                                }
                            }
                        }
                    };
                    Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    installed++;
                }
            }
        } catch (Throwable ignored) {}
        return installed;
    }

    private static int hookAfter(String className, String methodName, FrameResultFilter filter) {
        int installed = 0;
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable target : Reflection.getHiddenExecutables(cursor)) {
                    if (!(target instanceof Method) || !methodName.equals(target.getName())) continue;
                    HookTransformer transformer = (original, frame) -> {
                        Transformers.invokeExactNoChecks(original, frame);
                        filter.filter(frame);
                    };
                    Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    installed++;
                }
            }
        } catch (Throwable error) {
            Log.w(TAG, "hookAfter unavailable " + className + "#" + methodName);
        }
        return installed;
    }

    private static void filterIntentResult(EmulatedStackFrame frame) {
        int uid = Binder.getCallingUid();
        if (!CloakPolicy.hasHiddenPackages(uid)) return;

        Object result = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
        if (result == null) return;

        if (result instanceof List<?>) {
            List<?> entries = (List<?>) result;
            ArrayList<Object> visible = new ArrayList<>(entries.size());
            boolean changed = false;
            for (Object entry : entries) {
                if (CloakPolicy.hides(uid, extractPackageName(entry))) {
                    changed = true;
                } else {
                    visible.add(entry);
                }
            }
            if (changed) {
                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, visible);
            }
            return;
        }
        if (result.getClass().getName().endsWith("ParceledListSlice")) {
            try {
                Method getListMethod = result.getClass().getMethod("getList");
                List<?> entries = (List<?>) getListMethod.invoke(result);
                if (entries != null) {
                    ArrayList<Object> visible = new ArrayList<>(entries.size());
                    boolean changed = false;
                    for (Object entry : entries) {
                        if (CloakPolicy.hides(uid, extractPackageName(entry))) {
                            changed = true;
                        } else {
                            visible.add(entry);
                        }
                    }
                    if (changed) {
                        Constructor<?> ctor = result.getClass().getConstructor(List.class);
                        frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, ctor.newInstance(visible));
                    }
                }
            } catch (Throwable ignored) {}
            return;
        }
        if (CloakPolicy.hides(uid, extractPackageName(result))) {
            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, null);
        }
    }

    private static ClassLoader findSystemServerLoader() {
        try {
            Class<?> zygoteInit = Class.forName("com.android.internal.os.ZygoteInit");
            Method method = Reflection.getDeclaredMethod(zygoteInit, "getOrCreateSystemServerClassLoader");
            Object loader = method.invoke(null);
            if (loader instanceof ClassLoader) return (ClassLoader) loader;
        } catch (Throwable error) {
            Log.w(TAG, "system server classloader lookup failed", error);
        }
        return PackageCloakHooks.class.getClassLoader();
    }

    private static String packageNameFromObjects(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) != 'L') continue;
            String result = extractPackageName(accessor.getReference(i));
            if (result != null) return result;
        }
        return null;
    }

    private static String extractPackageName(Object value) {
        if (value == null) return null;
        if (value instanceof String) {
            String s = (String) value;
            return s.indexOf('.') > 0 ? s : null;
        }
        if (value instanceof ComponentName) return ((ComponentName) value).getPackageName();
        if (value instanceof PackageInfo) return ((PackageInfo) value).packageName;
        if (value instanceof ApplicationInfo) return ((ApplicationInfo) value).packageName;
        if (value instanceof ProviderInfo) return ((ProviderInfo) value).packageName;
        if (value instanceof ComponentInfo) return ((ComponentInfo) value).packageName;
        if (value instanceof ResolveInfo) {
            ResolveInfo info = (ResolveInfo) value;
            if (info.activityInfo != null) return info.activityInfo.packageName;
            if (info.serviceInfo != null) return info.serviceInfo.packageName;
            if (info.providerInfo != null) return info.providerInfo.packageName;
            return null;
        }

        Class<?> clazz = value.getClass();
        PackageExtractor extractor = EXTRACTOR_CACHE.get(clazz);
        if (extractor == null) {
            extractor = buildExtractor(clazz);
            EXTRACTOR_CACHE.putIfAbsent(clazz, extractor);
        }
        return extractor.extract(value);
    }

    private static PackageExtractor buildExtractor(Class<?> clazz) {
        for (String methodName : new String[]{"getPackageName", "getManifestPackageName", "getComponentName"}) {
            for (Class<?> c = clazz; c != null; c = c.getSuperclass()) {
                try {
                    Method m = Reflection.getDeclaredMethod(c, methodName);
                    m.setAccessible(true);
                    return obj -> {
                        try {
                            Object r = m.invoke(obj);
                            if (r instanceof String) return (String) r;
                            if (r instanceof ComponentName) return ((ComponentName) r).getPackageName();
                        } catch (Throwable ignored) {}
                        return null;
                    };
                } catch (Throwable ignored) {}
            }
        }
        for (String fieldName : new String[]{"packageName", "mName", "activityInfo", "componentName"}) {
            for (Class<?> c = clazz; c != null; c = c.getSuperclass()) {
                try {
                    Field f = c.getDeclaredField(fieldName);
                    f.setAccessible(true);
                    return obj -> {
                        try {
                            Object r = f.get(obj);
                            if (r instanceof String) return (String) r;
                            if (r instanceof ComponentInfo) return ((ComponentInfo) r).packageName;
                            if (r instanceof ComponentName) return ((ComponentName) r).getPackageName();
                        } catch (Throwable ignored) {}
                        return null;
                    };
                } catch (Throwable ignored) {}
            }
        }
        return NONE_EXTRACTOR;
    }

    private interface PackageExtractor {
        String extract(Object value);
    }

    private interface FrameResultFilter {
        void filter(EmulatedStackFrame frame);
    }
}
