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

/**
 * Safely demotes APP_ZYGOTE -> REGULAR_ZYGOTE for opted-in target apps.
 * Zero disk I/O in hot paths; reflection handles are cached once at install time.
 */
final class AppZygoteHooks {
    private static final String TAG = "CausentryZygote";

    private static Method sGetDefiningPackageName;
    private static Method sGetName;
    private static Field sUsesAppZygoteBool;
    private static Field sHostingZygoteInt;

    private AppZygoteHooks() {}

    static int install(ClassLoader loader) {
        int installed = 0;
        try {
            Class<?> hostingRecordClass = Class.forName("com.android.server.am.HostingRecord", true, loader);
            cacheHostingRecordMembers(hostingRecordClass);

            for (Method m : hostingRecordClass.getDeclaredMethods()) {
                if ("usesAppZygote".equals(m.getName()) && m.getReturnType() == boolean.class) {
                    Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                        Object hostingRecord = frame.accessor().getReference(0);
                        String packageName = definingPackage(hostingRecord);
                        if (packageName != null && CloakPolicy.blocksAppZygote(packageName)) {
                            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, false);
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
            for (Executable target : targets) {
                try {
                    Class<?>[] params = ((Method) target).getParameterTypes();
                    int hrIndex = -1;
                    for (int i = 0; i < params.length; i++) {
                        if ("com.android.server.am.HostingRecord".equals(params[i].getName())) {
                            hrIndex = i + 1;
                            break;
                        }
                    }
                    if (hrIndex < 0) continue;
                    final int argIdx = hrIndex;
                    HookTransformer transformer = (original, frame) -> {
                        Object arg = frame.accessor().getReference(argIdx);
                        if (arg != null) {
                            String packageName = definingPackage(arg);
                            if (packageName != null && CloakPolicy.blocksAppZygote(packageName)) {
                                disableUsesAppZygote(arg);
                            }
                        }
                        Transformers.invokeExactNoChecks(original, frame);
                    };
                    Hooks.hook(target, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                    installed++;
                } catch (Throwable t) {
                    Log.w(TAG, "failed to hook startProcessLocked overload: " + target, t);
                }
            }
        } catch (Throwable error) {
            Log.e(TAG, "appzygote ProcessList hook failed", error);
        }
        return installed;
    }

    private static void cacheHostingRecordMembers(Class<?> hostingRecordClass) {
        try {
            sGetDefiningPackageName = hostingRecordClass.getDeclaredMethod("getDefiningPackageName");
            sGetDefiningPackageName.setAccessible(true);
        } catch (Throwable ignored) {}
        try {
            sGetName = hostingRecordClass.getDeclaredMethod("getName");
            sGetName.setAccessible(true);
        } catch (Throwable ignored) {}
        for (Class<?> c = hostingRecordClass; c != null; c = c.getSuperclass()) {
            for (Field f : c.getDeclaredFields()) {
                if (Modifier.isStatic(f.getModifiers())) continue;
                String lower = f.getName().toLowerCase();
                if (f.getType() == boolean.class && (lower.contains("zygote") || "mUsesAppZygote".equals(f.getName()))) {
                    f.setAccessible(true);
                    sUsesAppZygoteBool = f;
                } else if (f.getType() == int.class && ("mHostingZygote".equals(f.getName()) || lower.contains("zygote"))) {
                    f.setAccessible(true);
                    sHostingZygoteInt = f;
                }
            }
        }
    }

    private static void disableUsesAppZygote(Object hostingRecord) {
        if (hostingRecord == null) return;
        try {
            if (sUsesAppZygoteBool != null && sUsesAppZygoteBool.getBoolean(hostingRecord)) {
                sUsesAppZygoteBool.setBoolean(hostingRecord, false);
            }
            if (sHostingZygoteInt != null && sHostingZygoteInt.getInt(hostingRecord) == 2) {
                // Only demote APP_ZYGOTE (2) -> REGULAR_ZYGOTE (0); preserve WEBVIEW_ZYGOTE (1)!
                sHostingZygoteInt.setInt(hostingRecord, 0);
            }
        } catch (Throwable ignored) {}
    }

    private static List<Executable> findStartProcessLockedMethods(Class<?> clazz) {
        List<Executable> list = new ArrayList<>();
        for (Class<?> cursor = clazz; cursor != null; cursor = cursor.getSuperclass()) {
            for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                if (!(executable instanceof Method)) continue;
                Method method = (Method) executable;
                if (!"startProcessLocked".equals(method.getName())) continue;
                for (Class<?> t : method.getParameterTypes()) {
                    if ("com.android.server.am.HostingRecord".equals(t.getName())) {
                        list.add(executable);
                        break;
                    }
                }
            }
        }
        return list;
    }

    private static String definingPackage(Object hostingRecord) {
        if (hostingRecord == null) return null;
        try {
            if (sGetDefiningPackageName != null) {
                Object res = sGetDefiningPackageName.invoke(hostingRecord);
                if (res instanceof String && !((String) res).isEmpty()) {
                    return (String) res;
                }
            }
            if (sGetName != null) {
                Object res = sGetName.invoke(hostingRecord);
                if (res instanceof String) {
                    String name = (String) res;
                    if (name.startsWith("{") && name.contains("/")) {
                        return name.substring(1, name.indexOf('/'));
                    }
                    if (!name.isEmpty()) return name;
                }
            }
        } catch (Throwable ignored) {}
        return null;
    }
}
