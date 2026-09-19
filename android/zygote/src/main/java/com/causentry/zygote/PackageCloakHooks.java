package com.causentry.zygote;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/** ART hooks for Android 14+ PackageManager query paths. */
final class PackageCloakHooks {
    private static final String TAG = "CausentryZygote";
    private static ClassLoader systemServerLoader;

    private PackageCloakHooks() {}

    static void install() {
        try {
            systemServerLoader = findSystemServerLoader();
            CloakPolicy.refreshNow();

            int installed = 0;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getPackageInfoInternal",
                    PackageCloakHooks::shouldHideStringQuery, null)) installed++;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getApplicationInfoInternal",
                    PackageCloakHooks::shouldHideStringQuery, null)) installed++;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getApplicationInfo",
                    frame -> CloakPolicy.hides(Binder.getCallingUid(), firstString(frame)), null)) installed++;
            installed += hookVisibilityChecks();
            if (hookBefore("com.android.server.pm.ComputerEngine", "generatePackageInfo",
                    PackageCloakHooks::shouldHideGeneratedPackageInfo, null)) installed++;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getPackageUidInternal",
                    PackageCloakHooks::shouldHidePackageUid, -1)) installed++;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getActivityInfoInternal",
                    PackageCloakHooks::shouldHideObjectQuery, null)) installed++;
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "queryIntentActivitiesInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ComputerEngine",
                    "queryIntentServicesInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ResolveIntentHelper",
                    "queryIntentReceiversInternal", PackageCloakHooks::filterIntentResult);
            installed += hookAfter("com.android.server.pm.ResolveIntentHelper",
                    "queryIntentContentProvidersInternal", PackageCloakHooks::filterIntentResult);
            FramePredicate appFilter = Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE
                    ? PackageCloakHooks::shouldFilterApplicationApi34
                    : PackageCloakHooks::shouldFilterApplication;
            if (hookBefore("com.android.server.pm.AppsFilterImpl", "shouldFilterApplication",
                    appFilter, true)) installed++;
            installed += AppZygoteHooks.install(systemServerLoader);

            if (installed >= 2) {
                SystemServerBackend.markCloakReady(installed);
            } else {
                Log.e(TAG, "package cloak not ready; hooks installed=" + installed);
            }
        } catch (Throwable error) {
            Log.e(TAG, "package hook initialization failed", error);
        }
    }

    private static boolean hookBefore(
            String className,
            String methodName,
            FramePredicate predicate,
            Object replacement) {
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            Executable target = findExecutable(clazz, methodName);
            if (target == null) {
                Log.w(TAG, "method unavailable " + className + "#" + methodName);
                return false;
            }
            HookTransformer transformer = (original, frame) -> {
                if (predicate.matches(frame)) {
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, replacement);
                    return;
                }
                Transformers.invokeExactNoChecks(original, frame);
            };
            Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
            Log.i(TAG, "hooked " + className + "#" + methodName);
            return true;
        } catch (Throwable error) {
            Log.e(TAG, "hook failed " + className + "#" + methodName, error);
            return false;
        }
    }

    private static Executable findExecutable(Class<?> clazz, String name) {
        for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
            for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                if (name.equals(executable.getName())) return executable;
            }
        }
        return null;
    }

    private static int hookVisibilityChecks() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.android.server.pm.ComputerEngine", true, systemServerLoader);
        int installed = 0;
        for (Executable executable : Reflection.getHiddenExecutables(clazz)) {
            if (!(executable instanceof Method) || !"shouldFilterApplication".equals(executable.getName())) continue;
            Method method = (Method) executable;
            Class<?>[] parameters = method.getParameterTypes();
            if (method.getReturnType() != boolean.class || parameters.length < 3
                    || !parameters[0].getName().equals("com.android.server.pm.pkg.PackageStateInternal")
                    || parameters[1] != int.class) continue;
            try {
                HookTransformer transformer = (original, frame) -> {
                    int uid = intArgument(frame, 2, Binder.getCallingUid());
                    if (CloakPolicy.hasHiddenPackages(uid)
                            && CloakPolicy.hides(uid, objectPackageName(frame, 1))) {
                        frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, true);
                        return;
                    }
                    Transformers.invokeExactNoChecks(original, frame);
                };
                Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                installed++;
                Log.i(TAG, "hooked visibility " + method);
            } catch (Throwable error) {
                Log.e(TAG, "visibility hook failed " + method, error);
            }
        }
        return installed;
    }

    /** Hooks every overload because framework releases use different intent-query wrappers. */
    private static int hookAfter(String className, String methodName, FrameResultFilter filter) {
        try {
            Class<?> clazz = Class.forName(className, true, systemServerLoader);
            int installed = 0;
            for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable target : Reflection.getHiddenExecutables(cursor)) {
                    if (!(target instanceof Method) || !methodName.equals(target.getName())) continue;
                    HookTransformer transformer = (original, frame) -> {
                        Transformers.invokeExactNoChecks(original, frame);
                        filter.filter(frame);
                    };
                    Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer,
                            Hooks.EntryPointType.DIRECT);
                    installed++;
                }
            }
            if (installed == 0) {
                Log.w(TAG, "method unavailable " + className + "#" + methodName);
            } else {
                Log.i(TAG, "hooked " + className + "#" + methodName + " overloads=" + installed);
            }
            return installed;
        } catch (Throwable error) {
            Log.e(TAG, "hook failed " + className + "#" + methodName, error);
            return 0;
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

    private static boolean shouldHideStringQuery(EmulatedStackFrame frame) {
        int uid = findCallingUid(frame);
        String packageName = firstString(frame);
        return CloakPolicy.hides(uid, packageName);
    }

    private static boolean shouldHideObjectQuery(EmulatedStackFrame frame) {
        int uid = findCallingUid(frame);
        String packageName = firstString(frame);
        if (packageName == null) packageName = packageNameFromObjects(frame);
        return CloakPolicy.hides(uid, packageName);
    }

    private static boolean shouldHideGeneratedPackageInfo(EmulatedStackFrame frame) {
        if (!CloakPolicy.hasHiddenPackages(Binder.getCallingUid())) return false;
        String packageName = objectPackageName(frame, 1);
        if (packageName == null) packageName = packageNameFromObjects(frame);
        return CloakPolicy.hides(Binder.getCallingUid(), packageName);
    }

    private static boolean shouldHidePackageUid(EmulatedStackFrame frame) {
        String packageName = firstString(frame);
        return CloakPolicy.hides(intArgument(frame, 4, Binder.getCallingUid()), packageName);
    }

    private static boolean shouldFilterApplication(EmulatedStackFrame frame) {
        int uid = findCallingUid(frame);
        String packageName = packageNameFromObjects(frame);
        if (packageName == null) packageName = firstString(frame);
        return CloakPolicy.hides(uid, packageName);
    }

    /** Android 14+ uses calling UID at arg 2 and PackageSetting at arg 4. */
    private static boolean shouldFilterApplicationApi34(EmulatedStackFrame frame) {
        int uid = intArgument(frame, 2, Binder.getCallingUid());
        if (!CloakPolicy.hasHiddenPackages(uid)) return false;
        String packageName = objectPackageName(frame, 4);
        if (packageName == null) packageName = packageNameFromObjects(frame);
        return CloakPolicy.hides(uid, packageName);
    }

    /** Removes hidden activity or service entries after PackageManager resolved an intent. */
    private static void filterIntentResult(EmulatedStackFrame frame) {
        int uid = Binder.getCallingUid();
        if (!CloakPolicy.hasHiddenPackages(uid)) return;

        Object result = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
        if (result instanceof List<?>) {
            List<?> entries = (List<?>) result;
            ArrayList<Object> visible = new ArrayList<>(entries.size());
            boolean changed = false;
            for (Object entry : entries) {
                if (CloakPolicy.hides(uid, packageName(entry))) {
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
        if (result != null && CloakPolicy.hides(uid, packageName(result))) {
            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, null);
        }
    }

    private static int findCallingUid(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) != 'I') continue;
            return accessor.getInt(i);
        }
        return Binder.getCallingUid();
    }

    private static int intArgument(EmulatedStackFrame frame, int index, int fallback) {
        if (index < frame.type().parameterCount()
                && frame.accessor().getArgumentShorty(index) == 'I') {
            return frame.accessor().getInt(index);
        }
        return fallback;
    }

    private static String firstString(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) == 'L') {
                Object value = accessor.getReference(i);
                if (value instanceof String && ((String) value).contains(".")) return (String) value;
            }
        }
        return null;
    }

    private static String packageNameFromObjects(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) != 'L') continue;
            String result = packageName(accessor.getReference(i));
            if (result != null) return result;
        }
        return null;
    }

    private static String objectPackageName(EmulatedStackFrame frame, int index) {
        if (index >= frame.type().parameterCount()
                || frame.accessor().getArgumentShorty(index) != 'L') return null;
        return packageName(frame.accessor().getReference(index));
    }

    private static String packageName(Object value) {
        return packageName(value, 0);
    }

    private static String packageName(Object value, int depth) {
        if (value == null || depth > 2) return null;
        if (value instanceof ComponentName) return ((ComponentName) value).getPackageName();
        if (value instanceof PackageInfo) return ((PackageInfo) value).packageName;
        if (value instanceof ApplicationInfo) return ((ApplicationInfo) value).packageName;
        if (value instanceof ComponentInfo) return ((ComponentInfo) value).packageName;
        if (value instanceof ResolveInfo) {
            ResolveInfo info = (ResolveInfo) value;
            if (info.activityInfo != null) return info.activityInfo.packageName;
            if (info.serviceInfo != null) return info.serviceInfo.packageName;
            if (info.providerInfo != null) return info.providerInfo.packageName;
            return null;
        }
        if (value instanceof String) {
            String result = (String) value;
            return result.contains(".") ? result : null;
        }
        for (String methodName : new String[]{"getPackageName", "getManifestPackageName"}) {
            for (Class<?> cursor = value.getClass(); cursor != null; cursor = cursor.getSuperclass()) {
                try {
                    Method method = Reflection.getDeclaredMethod(cursor, methodName);
                    method.setAccessible(true);
                    Object result = method.invoke(value);
                    if (result instanceof String) return (String) result;
                } catch (Throwable ignored) {
                    // Hidden framework accessors can live on a superclass.
                }
            }
        }
        for (String fieldName : new String[]{"packageName", "mName", "name",
                "activityInfo", "serviceInfo", "providerInfo", "applicationInfo"}) {
            String result = packageName(readField(value, fieldName), depth + 1);
            if (result != null) return result;
        }
        return null;
    }

    private static Object readField(Object target, String name) {
        for (Class<?> cursor = target.getClass(); cursor != null; cursor = cursor.getSuperclass()) {
            try {
                Field field = cursor.getDeclaredField(name);
                field.setAccessible(true);
                return field.get(target);
            } catch (NoSuchFieldException ignored) {
                // Field can live on ComponentInfo or ApplicationInfo superclass.
            } catch (Throwable ignored) {
                return null;
            }
        }
        return null;
    }

    private interface FramePredicate {
        boolean matches(EmulatedStackFrame frame);
    }

    private interface FrameResultFilter {
        void filter(EmulatedStackFrame frame);
    }
}
