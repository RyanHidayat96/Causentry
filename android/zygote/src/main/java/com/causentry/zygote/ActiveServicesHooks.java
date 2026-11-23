package com.causentry.zygote;

import android.content.pm.ServiceInfo;
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
 * Safely clears ONLY FLAG_USE_APP_ZYGOTE from ServiceInfo for opted-in target packages.
 *
 * Deliberately preserves FLAG_ISOLATED_PROCESS and ServiceRecord.isolatedProcess so apps
 * relying on isolated IPC services (e.g. WebView, Play Integrity, Gojek/GoPay) never break.
 * Zero disk I/O and cached reflection fields on the hot path.
 */
final class ActiveServicesHooks {
    private static final String TAG = "CausentryZygote";
    private static final int FLAG_USE_APP_ZYGOTE = 0x0008;

    private static volatile Field sResultRecordField;
    private static volatile Field sServiceInfoField;

    private ActiveServicesHooks() {}

    static int install(ClassLoader loader) {
        int installed = 0;
        try {
            Class<?> activeServices = Class.forName(
                    "com.android.server.am.ActiveServices", true, loader);
            for (Class<?> cursor = activeServices; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method)) continue;
                    Method method = (Method) executable;
                    if (!"retrieveServiceLocked".equals(method.getName())) continue;
                    try {
                        HookTransformer transformer = (original, frame) -> {
                            Transformers.invokeExactNoChecks(original, frame);
                            Object result = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                            stripAppZygoteFlag(result);
                        };
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer, Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked ActiveServices#retrieveServiceLocked");
                    } catch (Throwable t) {
                        Log.w(TAG, "failed to hook retrieveServiceLocked: " + method, t);
                    }
                }
            }
        } catch (Throwable error) {
            Log.e(TAG, "ActiveServices hook initialization failed", error);
        }
        return installed;
    }

    private static void stripAppZygoteFlag(Object lookupResult) {
        if (lookupResult == null) return;
        try {
            Field recordField = sResultRecordField;
            if (recordField == null) {
                recordField = findField(lookupResult.getClass(), "record");
                sResultRecordField = recordField;
            }
            if (recordField == null) return;
            Object serviceRecord = recordField.get(lookupResult);
            if (serviceRecord == null) return;

            Field infoField = sServiceInfoField;
            if (infoField == null) {
                infoField = findField(serviceRecord.getClass(), "serviceInfo");
                sServiceInfoField = infoField;
            }
            if (infoField == null) return;
            Object info = infoField.get(serviceRecord);
            if (!(info instanceof ServiceInfo)) return;

            ServiceInfo serviceInfo = (ServiceInfo) info;
            if ((serviceInfo.flags & FLAG_USE_APP_ZYGOTE) != 0
                    && CloakPolicy.blocksAppZygote(serviceInfo.packageName)) {
                serviceInfo.flags &= ~FLAG_USE_APP_ZYGOTE;
            }
        } catch (Throwable ignored) {}
    }

    private static Field findField(Class<?> clazz, String name) {
        for (Class<?> c = clazz; c != null; c = c.getSuperclass()) {
            try {
                Field f = c.getDeclaredField(name);
                f.setAccessible(true);
                return f;
            } catch (NoSuchFieldException ignored) {}
        }
        return null;
    }
}
