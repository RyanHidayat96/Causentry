package com.causentry.zygote;

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
            if (hookBefore("com.android.server.pm.ComputerEngine", "generatePackageInfo",
                    PackageCloakHooks::shouldHideGeneratedPackageInfo, null)) installed++;
            if (hookBefore("com.android.server.pm.ComputerEngine", "getPackageUidInternal",
                    PackageCloakHooks::shouldHidePackageUid, -1)) installed++;
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
        String packageName = objectPackageName(frame, 4);
        if (packageName == null) packageName = packageNameFromObjects(frame);
        return CloakPolicy.hides(uid, packageName);
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
        if (value == null || value instanceof String) return null;
        for (String methodName : new String[]{"getPackageName", "getManifestPackageName"}) {
            try {
                Method method = value.getClass().getMethod(methodName);
                Object result = method.invoke(value);
                if (result instanceof String && ((String) result).contains(".")) return (String) result;
            } catch (Throwable ignored) {
                // PackageSetting and PackageImpl expose different accessors across releases.
            }
        }
        for (String fieldName : new String[]{"mName", "name"}) {
            try {
                Field field = value.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                Object result = field.get(value);
                if (result instanceof String && ((String) result).contains(".")) return (String) result;
            } catch (Throwable ignored) {
                // Fail open when a framework implementation hides its package field.
            }
        }
        return null;
    }

    private interface FramePredicate {
        boolean matches(EmulatedStackFrame frame);
    }
}
