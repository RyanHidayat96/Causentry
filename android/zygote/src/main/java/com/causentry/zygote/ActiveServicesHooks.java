package com.causentry.zygote;

import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Strips FLAG_ISOLATED_PROCESS and FLAG_USE_APP_ZYGOTE from ServiceInfo
 * for protected target packages. This prevents VGuard/VOS from running
 * as an isolated process where it gets elevated scanning capabilities
 * (realUid 9xxxx, separate SELinux domain).
 *
 * Hook target: ActiveServices#retrieveServiceLocked — the gatekeeper method
 * called by AMS whenever a service is being started/bound. We intercept the
 * result and strip isolation flags from the ServiceInfo before AMS decides
 * to fork an isolated process.
 */
final class ActiveServicesHooks {
    private static final String TAG = "CausentryZygote";
    /** android.content.pm.ServiceInfo.FLAG_ISOLATED_PROCESS = 0x0002 */
    private static final int FLAG_ISOLATED_PROCESS = 0x0002;
    /** android.content.pm.ServiceInfo.FLAG_USE_APP_ZYGOTE = 0x0008 (API 29+) */
    private static final int FLAG_USE_APP_ZYGOTE = 0x0008;

    private ActiveServicesHooks() {}

    static int install(ClassLoader loader) {
        int installed = 0;
        try {
            Class<?> activeServices = Class.forName(
                    "com.android.server.am.ActiveServices", true, loader);
            // Hook retrieveServiceLocked — returns a ServiceLookupResult containing ServiceRecord
            for (Class<?> cursor = activeServices; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method)) continue;
                    Method method = (Method) executable;
                    if (!"retrieveServiceLocked".equals(method.getName())) continue;
                    try {
                        HookTransformer transformer = (original, frame) -> {
                            Transformers.invokeExactNoChecks(original, frame);
                            // Post-process: strip isolation flags from the result
                            Object result = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                            stripIsolationFlags(result);
                        };
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer,
                                Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked ActiveServices#retrieveServiceLocked: " + method);
                    } catch (Throwable t) {
                        Log.w(TAG, "failed to hook retrieveServiceLocked: " + method, t);
                    }
                }
            }

            // Also hook realStartServiceLocked as a safety net
            for (Class<?> cursor = activeServices; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method)) continue;
                    Method method = (Method) executable;
                    if (!"realStartServiceLocked".equals(method.getName())) continue;
                    try {
                        HookTransformer transformer = (original, frame) -> {
                            // First arg is ServiceRecord (after 'this')
                            Object serviceRecord = null;
                            if (frame.type().parameterCount() > 1
                                    && frame.accessor().getArgumentShorty(1) == 'L') {
                                serviceRecord = frame.accessor().getReference(1);
                            }
                            stripServiceRecordIsolation(serviceRecord);
                            Transformers.invokeExactNoChecks(original, frame);
                        };
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer,
                                Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked ActiveServices#realStartServiceLocked: " + method);
                    } catch (Throwable t) {
                        Log.w(TAG, "failed to hook realStartServiceLocked: " + method, t);
                    }
                }
            }

            if (installed > 0) {
                Log.i(TAG, "ActiveServices isolation hooks installed: " + installed);
            } else {
                Log.w(TAG, "ActiveServices hooks: no methods hooked");
            }
        } catch (Throwable error) {
            Log.e(TAG, "ActiveServices hook initialization failed", error);
        }
        return installed;
    }

    /**
     * Navigates ServiceLookupResult -> ServiceRecord -> ServiceInfo and strips isolation flags
     * if the service belongs to a protected package.
     */
    private static void stripIsolationFlags(Object lookupResult) {
        if (lookupResult == null) return;
        try {
            // ServiceLookupResult has a 'record' field of type ServiceRecord
            Object serviceRecord = readField(lookupResult, "record");
            stripServiceRecordIsolation(serviceRecord);
        } catch (Throwable ignored) {
            // ServiceLookupResult structure varies across Android versions
        }
    }

    private static void stripServiceRecordIsolation(Object serviceRecord) {
        if (serviceRecord == null) return;
        try {
            // ServiceRecord has a 'serviceInfo' field of type ServiceInfo
            Object info = readField(serviceRecord, "serviceInfo");
            if (!(info instanceof ServiceInfo)) return;

            ServiceInfo serviceInfo = (ServiceInfo) info;
            String packageName = serviceInfo.packageName;
            if (packageName == null) return;

            CloakPolicy.refreshNow();
            if (!CloakPolicy.blocksAppZygote(packageName)) return;

            int oldFlags = serviceInfo.flags;
            boolean wasIsolated = (oldFlags & FLAG_ISOLATED_PROCESS) != 0;
            boolean wasAppZygote = (oldFlags & FLAG_USE_APP_ZYGOTE) != 0;

            if (wasIsolated || wasAppZygote) {
                serviceInfo.flags = oldFlags & ~(FLAG_ISOLATED_PROCESS | FLAG_USE_APP_ZYGOTE);
                Log.i(TAG, "stripped isolation flags from " + packageName
                        + "/" + serviceInfo.name
                        + " flags: 0x" + Integer.toHexString(oldFlags)
                        + " -> 0x" + Integer.toHexString(serviceInfo.flags));

                // Also clear the isolatedProcess field on ServiceRecord directly
                setFieldBoolean(serviceRecord, "isolatedProcess", false);
            }
        } catch (Throwable error) {
            Log.w(TAG, "stripServiceRecordIsolation failed", error);
        }
    }

    private static Object readField(Object target, String name) {
        for (Class<?> cursor = target.getClass(); cursor != null; cursor = cursor.getSuperclass()) {
            try {
                Field field = cursor.getDeclaredField(name);
                field.setAccessible(true);
                return field.get(target);
            } catch (NoSuchFieldException ignored) {
                // Try superclass
            } catch (Throwable ignored) {
                return null;
            }
        }
        return null;
    }

    private static void setFieldBoolean(Object target, String name, boolean value) {
        for (Class<?> cursor = target.getClass(); cursor != null; cursor = cursor.getSuperclass()) {
            try {
                Field field = cursor.getDeclaredField(name);
                field.setAccessible(true);
                if (field.getType() == boolean.class) {
                    field.setBoolean(target, value);
                }
                return;
            } catch (NoSuchFieldException ignored) {
                // Try superclass
            } catch (Throwable ignored) {
                return;
            }
        }
    }
}
