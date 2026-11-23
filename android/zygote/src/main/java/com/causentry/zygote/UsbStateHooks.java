package com.causentry.zygote;

import android.content.Intent;
import android.os.Binder;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.Hooks;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Per-UID USB_STATE sticky broadcast masking.
 *
 * Hooks ActivityManagerService#registerReceiverWithFeature / registerReceiver so only
 * protected caller UIDs receive a cloned Intent with adb=false, while SystemUI, Settings,
 * and ADB keep the genuine sticky broadcast untouched.
 */
final class UsbStateHooks {
    private static final String TAG = "CausentryZygote";
    private static final String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    private static final String EXTRA_ADB = "adb";
    private static final Set<String> REGISTER_METHODS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    "registerReceiverWithFeature",
                    "registerReceiver"
            )));
    private static volatile int installedHooks;

    private UsbStateHooks() {}

    static synchronized int install(ClassLoader loader) {
        if (installedHooks > 0) return installedHooks;
        int installed = 0;
        try {
            Class<?> amsClass = Class.forName("com.android.server.am.ActivityManagerService", true, loader);
            Set<Executable> seen = new HashSet<>();
            for (Class<?> cursor = amsClass; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !seen.add(exe)) continue;
                    Method method = (Method) exe;
                    if (!REGISTER_METHODS.contains(method.getName())) continue;
                    if (method.getReturnType() != Intent.class) continue;
                    try {
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT,
                                UsbStateHooks::interceptRegisterReceiver, Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked AMS receiver: " + method.getName());
                    } catch (Throwable err) {
                        Log.w(TAG, "usb hook unavailable: " + method, err);
                    }
                }
            }
        } catch (Throwable error) {
            Log.e(TAG, "usb state hook initialization failed", error);
        }
        installedHooks = installed;
        return installed;
    }

    private static void interceptRegisterReceiver(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        Transformers.invokeExactNoChecks(original, frame);
        int callingUid = Binder.getCallingUid();
        if (!CloakPolicy.hidesDeveloperOptions(callingUid)) return;

        Object ret = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
        if (!(ret instanceof Intent)) return;
        Intent sticky = (Intent) ret;
        if (ACTION_USB_STATE.equals(sticky.getAction()) && sticky.getBooleanExtra(EXTRA_ADB, false)) {
            Intent sanitized = new Intent(sticky);
            sanitized.putExtra(EXTRA_ADB, false);
            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, sanitized);
        }
    }
}
