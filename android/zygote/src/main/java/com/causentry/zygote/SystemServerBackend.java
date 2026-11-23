package com.causentry.zygote;

import android.annotation.SuppressLint;
import android.os.Process;
import android.util.Log;

import org.json.JSONObject;

import java.lang.reflect.Method;

/** Coordinates system_server hook installation and live telemetry reporting to causentryd. */
final class SystemServerBackend {
    private static final String TAG = "CausentryZygote";

    private SystemServerBackend() {}

    static void start() {
        if (Process.myUid() != Process.SYSTEM_UID) {
            Log.e(TAG, "refusing non-system_server process uid=" + Process.myUid());
            return;
        }

        PolicyChannel.addListener(CloakPolicy::applyPushPolicy);
        PolicyChannel.start("system_server");
        CloakPolicy.loadColdStartFallback();

        Log.i(TAG, "loaded in system_server pid=" + Process.myPid());

        Thread hookThread = new Thread(SystemServerBackend::installWhenPackageManagerReady, "causentry-hooks");
        hookThread.setDaemon(true);
        hookThread.start();
    }

    @SuppressLint("BlockedPrivateApi")
    private static void installWhenPackageManagerReady() {
        try {
            Class<?> serviceManager = Class.forName("android.os.ServiceManager");
            Method waitForService = serviceManager.getDeclaredMethod("waitForService", String.class);
            waitForService.invoke(null, "package");
        } catch (Throwable error) {
            Log.w(TAG, "package service wait failed; delaying hook install", error);
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        PackageCloakHooks.InstallResult pkgResult = PackageCloakHooks.install();
        int settingsHooks = installSystemSettingsHooks();
        int usbHooks = installUsbStateHooks();

        try {
            JSONObject telemetry = new JSONObject();
            telemetry.put("pkgHooks", pkgResult.pkgHooks);
            telemetry.put("appZygoteHooks", pkgResult.appZygoteHooks);
            telemetry.put("a11yHooks", pkgResult.a11yHooks);
            telemetry.put("settingsHooks", settingsHooks);
            telemetry.put("usbHooks", usbHooks);
            PolicyChannel.sendTelemetry(telemetry);
        } catch (Throwable ignored) {}
    }

    private static int installUsbStateHooks() {
        try {
            ClassLoader loader = findSystemServerLoader();
            int hooks = UsbStateHooks.install(loader);
            Log.i(TAG, "usb state hooks=" + hooks);
            return hooks;
        } catch (Throwable error) {
            Log.w(TAG, "usb state hook install failed", error);
            return 0;
        }
    }

    private static int installSystemSettingsHooks() {
        for (int attempt = 0; attempt < 8; attempt++) {
            int hooks = SettingsProviderHooks.install(true);
            if (hooks > 0) {
                Log.i(TAG, "system_server hosted SettingsProvider hooks=" + hooks);
                return hooks;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
                return 0;
            }
        }
        Log.i(TAG, "SettingsProvider not hosted in system_server");
        return 0;
    }

    private static ClassLoader findSystemServerLoader() {
        try {
            Class<?> zygoteInit = Class.forName("com.android.internal.os.ZygoteInit");
            Method method = zygoteInit.getDeclaredMethod("getOrCreateSystemServerClassLoader");
            method.setAccessible(true);
            Object loader = method.invoke(null);
            if (loader instanceof ClassLoader) return (ClassLoader) loader;
        } catch (Throwable ignored) {}
        return SystemServerBackend.class.getClassLoader();
    }
}
