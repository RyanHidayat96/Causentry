package com.causentry.zygote;

import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/** Blocks app-zygote service starts for targets that opt into isolate protection. */
final class AppZygoteHooks {
    private static final String TAG = "CausentryZygote";

    private AppZygoteHooks() {}

    static int install(ClassLoader loader) {
        try {
            Class<?> processList = Class.forName("com.android.server.am.ProcessList", true, loader);
            Executable target = findStartProcessLocked(processList);
            if (target == null) {
                Log.w(TAG, "appzygote hook unavailable ProcessList#startProcessLocked");
                return 0;
            }

            HookTransformer transformer = (original, frame) -> {
                Object hostingRecord = referenceArgument(frame, 1);
                String packageName = definingPackage(hostingRecord);
                if (usesAppZygote(hostingRecord) && CloakPolicy.blocksAppZygote(packageName)) {
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, true);
                    Log.i(TAG, "blocked app zygote start for " + packageName);
                    return;
                }
                Transformers.invokeExactNoChecks(original, frame);
            };
            Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
            Log.i(TAG, "hooked ProcessList#startProcessLocked for app zygote");
            return 1;
        } catch (Throwable error) {
            Log.e(TAG, "appzygote hook failed", error);
            return 0;
        }
    }

    private static Executable findStartProcessLocked(Class<?> clazz) {
        for (Executable executable : executablesInHierarchy(clazz)) {
            if (!(executable instanceof Method)) continue;
            Method method = (Method) executable;
            if (!"startProcessLocked".equals(method.getName())) continue;
            if (method.getReturnType() != boolean.class) continue;
            Class<?>[] types = method.getParameterTypes();
            if (types.length < 3) continue;
            if (!"com.android.server.am.HostingRecord".equals(types[0].getName())) continue;
            if (!"com.android.server.am.ProcessRecord".equals(types[2].getName())) continue;
            return executable;
        }
        return null;
    }

    private static Executable[] executablesInHierarchy(Class<?> clazz) {
        for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
            Executable[] found = Reflection.getHiddenExecutables(cursor);
            if (found.length > 0) return found;
        }
        return new Executable[0];
    }

    private static Object referenceArgument(EmulatedStackFrame frame, int index) {
        if (index >= frame.type().parameterCount()
                || frame.accessor().getArgumentShorty(index) != 'L') return null;
        return frame.accessor().getReference(index);
    }

    private static boolean usesAppZygote(Object hostingRecord) {
        Object result = callNoArg(hostingRecord, "usesAppZygote");
        return result instanceof Boolean && (Boolean) result;
    }

    private static String definingPackage(Object hostingRecord) {
        Object result = callNoArg(hostingRecord, "getDefiningPackageName");
        if (result instanceof String && !((String) result).isEmpty()) return (String) result;

        if (hostingRecord == null) return null;
        CloakPolicy.refreshNow();
        for (Field field : hostingRecord.getClass().getDeclaredFields()) {
            if (field.getType() != String.class || Modifier.isStatic(field.getModifiers())) continue;
            try {
                field.setAccessible(true);
                Object value = field.get(hostingRecord);
                if (!(value instanceof String)) continue;
                String packageName = (String) value;
                if (CloakPolicy.blocksAppZygote(packageName)) return packageName;
            } catch (Throwable ignored) {
                // Some framework builds rename or harden HostingRecord fields.
            }
        }
        return null;
    }

    private static Object callNoArg(Object target, String name) {
        if (target == null) return null;
        try {
            Method method = target.getClass().getDeclaredMethod(name);
            method.setAccessible(true);
            return method.invoke(target);
        } catch (Throwable ignored) {
            return null;
        }
    }
}
