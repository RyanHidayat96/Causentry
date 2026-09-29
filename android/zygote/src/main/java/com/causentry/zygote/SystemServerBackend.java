package com.causentry.zygote;

import android.annotation.SuppressLint;
import android.os.Process;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

/** Minimal system_server lifecycle proof; package hooks are installed after boot readiness. */
final class SystemServerBackend {
    private static final String TAG = "CausentryZygote";
    private static final File STATE_DIR = new File("/data/system/causentry");

    private SystemServerBackend() {}

    static void start() {
        if (Process.myUid() != Process.SYSTEM_UID) {
            Log.e(TAG, "refusing non-system_server process uid=" + Process.myUid());
            return;
        }

        try {
            if (!STATE_DIR.exists() && !STATE_DIR.mkdirs()) {
                throw new IllegalStateException("cannot create " + STATE_DIR);
            }
            writeMarker("zygisk.loaded", Integer.toString(Process.myPid()));
            writeMarker("zygisk.system_server", "ready\n" + Process.myPid());
            Log.i(TAG, "loaded in system_server pid=" + Process.myPid());
        } catch (Throwable error) {
            Log.e(TAG, "backend status unavailable", error);
        }
        // A diagnostics write failure must not prevent the actual backend from starting.
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
        PackageCloakHooks.install();
        installSystemSettingsHooks();
    }

    private static void installSystemSettingsHooks() {
        // AOSP may host SettingsProvider in its own package process, while MIUI
        // hosts it inside system_server. The dedicated package marker covers the
        // former; retry briefly for the latter while framework providers finish
        // initializing, without target-app injection.
        for (int attempt = 0; attempt < 10; attempt++) {
            int hooks = SettingsProviderHooks.install();
            if (hooks > 0) {
                markSettingsProviderReady(hooks);
                return;
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException interrupted) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        Log.i(TAG, "SettingsProvider not hosted in system_server");
    }

    static void markCloakReady(int hookCount) {
        try {
            writeMarker("zygisk.cloak.ready", Integer.toString(Process.myPid()) + " " + hookCount);
            Log.i(TAG, "package cloak ready hooks=" + hookCount);
        } catch (Throwable error) {
            Log.e(TAG, "failed to write cloak-ready marker", error);
        }
    }

    static void markSettingsProviderReady(int hookCount) {
        try {
            if (!STATE_DIR.exists() && !STATE_DIR.mkdirs()) {
                throw new IllegalStateException("cannot create " + STATE_DIR);
            }
            writeMarker("zygisk.settings.ready", Integer.toString(Process.myPid()) + " " + hookCount);
            Log.i(TAG, "settings provider cloak ready hooks=" + hookCount);
        } catch (Throwable error) {
            Log.e(TAG, "failed to write settings-ready marker", error);
        }
    }

    private static void writeMarker(String name, String value) throws Exception {
        File target = new File(STATE_DIR, name);
        File temporary = new File(STATE_DIR, "." + name + ".tmp");
        try (FileOutputStream stream = new FileOutputStream(temporary, false)) {
            stream.write((value + "\n").getBytes(StandardCharsets.US_ASCII));
            stream.getFD().sync();
        }
        if (!temporary.renameTo(target)) {
            throw new IllegalStateException("cannot replace " + target);
        }
        target.setReadable(true, false);
    }
}
