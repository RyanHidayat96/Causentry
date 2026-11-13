package com.causentry.zygote;

import android.content.ComponentName;
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
import java.util.ArrayList;
import java.util.List;

/** Blocks app-zygote service starts for targets that opt into isolate protection. */
final class AppZygoteHooks {
    private static final String TAG = "CausentryZygote";

    private AppZygoteHooks() {}

    static int install(ClassLoader loader) {
        int installed = 0;
        try {
            Class<?> hostingRecordClass = Class.forName("com.android.server.am.HostingRecord", true, loader);
            for (Method m : hostingRecordClass.getDeclaredMethods()) {
                if ("usesAppZygote".equals(m.getName()) && m.getReturnType() == boolean.class) {
                    Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                        Object hostingRecord = frame.accessor().getReference(0);
                        String packageName = definingPackage(hostingRecord);
                        if (packageName != null && CloakPolicy.blocksAppZygote(packageName)) {
                            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, false);
                            Log.i(TAG, "usesAppZygote returned false for " + packageName);
                            return;
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                    }, Hooks.EntryPointType.DIRECT);
                    installed++;
                    Log.i(TAG, "hooked HostingRecord#usesAppZygote");
                } else if ("byAppZygote".equals(m.getName()) && m.getReturnType() == hostingRecordClass) {
                    Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                        Transformers.invokeExactNoChecks(original, frame);
                        Object record = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                        if (record != null) {
                            String packageName = definingPackage(record);
                            if (packageName != null && CloakPolicy.blocksAppZygote(packageName)) {
                                disableUsesAppZygote(record);
                                Log.i(TAG, "byAppZygote demoted to regular zygote for " + packageName);
                            }
                        }
                    }, Hooks.EntryPointType.DIRECT);
                    installed++;
                    Log.i(TAG, "hooked HostingRecord.byAppZygote");
                }
            }
        } catch (Throwable e) {
            Log.w(TAG, "failed to hook HostingRecord methods", e);
        }

        try {
            Class<?> processList = Class.forName("com.android.server.am.ProcessList", true, loader);
            List<Executable> targets = findStartProcessLockedMethods(processList);
            if (targets.isEmpty()) {
                Log.w(TAG, "appzygote hook unavailable ProcessList#startProcessLocked");
                return installed;
            }

            for (Executable target : targets) {
                try {
                    HookTransformer transformer = (original, frame) -> {
                        for (int i = 1; i < frame.type().parameterCount(); i++) {
                            Object arg = referenceArgument(frame, i);
                            if (arg != null && "com.android.server.am.HostingRecord".equals(arg.getClass().getName())) {
                                String packageName = definingPackage(arg);
                                if (packageName != null && CloakPolicy.blocksAppZygote(packageName)) {
                                    disableUsesAppZygote(arg);
                                    Log.i(TAG, "demoted app zygote in startProcessLocked for " + packageName);
                                }
                            }
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                    };
                    Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    Log.i(TAG, "hooked ProcessList#startProcessLocked overload: " + target);
                    installed++;
                } catch (Throwable t) {
                    Log.w(TAG, "failed to hook startProcessLocked overload: " + target, t);
                }
            }
            return installed;
        } catch (Throwable error) {
            Log.e(TAG, "appzygote hook failed", error);
            return installed;
        }
    }

    private static void disableUsesAppZygote(Object hostingRecord) {
        if (hostingRecord == null) return;
        for (Class<?> cursor = hostingRecord.getClass(); cursor != null; cursor = cursor.getSuperclass()) {
            for (Field field : cursor.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        // 1. Android 10/11 boolean mUsesAppZygote
                        if (field.getType() == boolean.class && field.getBoolean(hostingRecord)
                                && (field.getName().toLowerCase().contains("zygote") || field.getName().equals("mUsesAppZygote"))) {
                            field.setBoolean(hostingRecord, false);
                            Log.i(TAG, "demoted HostingRecord boolean field " + field.getName() + " to false");
                        }
                        // 2. Android 12+ (14/15/16) int mHostingZygote (0=REGULAR_ZYGOTE, 1=WEBVIEW_ZYGOTE, 2=APP_ZYGOTE)
                        if (field.getType() == int.class
                                && (field.getName().equals("mHostingZygote") || field.getName().toLowerCase().contains("zygote"))) {
                            int val = field.getInt(hostingRecord);
                            if (val != 0) {
                                field.setInt(hostingRecord, 0); // REGULAR_ZYGOTE
                                Log.i(TAG, "demoted HostingRecord int field " + field.getName() + " from " + val + " to 0 (REGULAR_ZYGOTE)");
                            }
                        }
                    } catch (Throwable ignored) {}
                }
            }
        }
    }

    private static List<Executable> findStartProcessLockedMethods(Class<?> clazz) {
        List<Executable> list = new ArrayList<>();
        for (Executable executable : executablesInHierarchy(clazz)) {
            if (!(executable instanceof Method)) continue;
            Method method = (Method) executable;
            if (!"startProcessLocked".equals(method.getName())) continue;
            Class<?>[] types = method.getParameterTypes();
            boolean hasHostingRecord = false;
            for (Class<?> t : types) {
                if ("com.android.server.am.HostingRecord".equals(t.getName())) {
                    hasHostingRecord = true;
                    break;
                }
            }
            if (hasHostingRecord) {
                list.add(executable);
            }
        }
        return list;
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

    private static String definingPackage(Object hostingRecord) {
        if (hostingRecord == null) return null;
        CloakPolicy.refreshNow();

        Object result = callNoArg(hostingRecord, "getDefiningPackageName");
        if (result instanceof String && !((String) result).isEmpty()) {
            String pkg = (String) result;
            if (CloakPolicy.blocksAppZygote(pkg)) return pkg;
        }

        Object nameObj = callNoArg(hostingRecord, "getName");
        if (nameObj instanceof String && !((String) nameObj).isEmpty()) {
            String name = (String) nameObj;
            if (name.startsWith("{") && name.contains("/")) {
                String pkg = name.substring(1, name.indexOf('/'));
                if (CloakPolicy.blocksAppZygote(pkg)) return pkg;
            }
            if (CloakPolicy.blocksAppZygote(name)) return name;
        }

        for (Field field : hostingRecord.getClass().getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers())) continue;
            try {
                field.setAccessible(true);
                Object value = field.get(hostingRecord);
                if (value instanceof String) {
                    String str = (String) value;
                    if (str.startsWith("{") && str.contains("/")) {
                        String pkg = str.substring(1, str.indexOf('/'));
                        if (CloakPolicy.blocksAppZygote(pkg)) return pkg;
                    }
                    if (CloakPolicy.blocksAppZygote(str)) return str;
                } else if (value instanceof ComponentName) {
                    ComponentName cn = (ComponentName) value;
                    if (CloakPolicy.blocksAppZygote(cn.getPackageName())) return cn.getPackageName();
                }
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
