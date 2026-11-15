package com.causentry.zygote;

import android.content.Intent;
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
 * Masks the ADB flag inside the sticky USB_STATE broadcast emitted by
 * system_server.
 *
 * SettingsProvider hooks alone cannot stop this leak: UsbDeviceManager sends
 * {@code android.hardware.usb.action.USB_STATE} straight from system_server, so
 * a hardened app that reads the Intent extras observes
 * {@code bundle.getBoolean("adb") == true && getBoolean("connected") == true}
 * (Bibit: SecurityUseCase$DeviceSignals$checkIsUsbDebug) even when
 * Settings.Global.adb_enabled is reported as 0. Rewriting the extra before the
 * sticky broadcast leaves system_server is non-destructive: the real USB
 * function switch, adbd and the developer tile keep working, while protected
 * apps see a plain data link.
 */
final class UsbStateHooks {
    private static final String TAG = "CausentryZygote";
    private static final String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    private static final String EXTRA_ADB = "adb";
    /** Every AOSP path that publishes a sticky broadcast goes through ContextImpl. */
    private static final Set<String> STICKY_SENDERS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    "sendStickyBroadcast",
                    "sendStickyBroadcastAsUser",
                    "sendStickyOrderedBroadcast",
                    "sendStickyOrderedBroadcastAsUser")));
    private static volatile int installedHooks;

    private UsbStateHooks() {}

    static synchronized int install() {
        if (installedHooks > 0) return installedHooks;
        try {
            CloakPolicy.refreshNow();
            Class<?> contextImpl;
            try {
                contextImpl = Class.forName("android.app.ContextImpl");
            } catch (ClassNotFoundException missing) {
                Log.w(TAG, "ContextImpl unavailable; usb state hook skipped");
                return 0;
            }
            int installed = 0;
            Set<Executable> seen = new HashSet<>();
            for (Class<?> cursor = contextImpl; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method)) continue;
                    if (!STICKY_SENDERS.contains(executable.getName())) continue;
                    if (!seen.add(executable)) continue;
                    Class<?>[] parameters = ((Method) executable).getParameterTypes();
                    if (parameters.length < 1 || parameters.length > 2) continue;
                    if (parameters[0] != Intent.class) continue;
                    try {
                        Hooks.hook((Method) executable, Hooks.EntryPointType.DIRECT,
                                UsbStateHooks::intercept, Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked usb state sender " + executable);
                    } catch (Throwable error) {
                        Log.w(TAG, "usb state hook unavailable " + executable, error);
                    }
                }
            }
            installedHooks = installed;
            return installed;
        } catch (Throwable error) {
            Log.e(TAG, "usb state hook initialization failed", error);
            return 0;
        }
    }

    private static void intercept(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        try {
            if (CloakPolicy.anyDeveloperOptionsHidden()) {
                // Argument 0 is the ContextImpl instance; argument 1 is the Intent.
                Object candidate = frame.accessor().getReference(1);
                if (candidate instanceof Intent) spoof((Intent) candidate);
            }
        } catch (Throwable error) {
            // A failed rewrite must never break USB state delivery.
            Log.w(TAG, "usb state rewrite failed", error);
        }
        Transformers.invokeExactNoChecks(original, frame);
    }

    private static void spoof(Intent intent) {
        if (intent == null || !ACTION_USB_STATE.equals(intent.getAction())) return;
        if (!intent.getBooleanExtra(EXTRA_ADB, false)) return;
        intent.putExtra(EXTRA_ADB, false);
        Log.i(TAG, "usb state adb extra masked");
    }
}
