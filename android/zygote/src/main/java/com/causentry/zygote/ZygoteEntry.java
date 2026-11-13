package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

import java.lang.reflect.Method;

import com.v7878.r8.annotations.DoNotObfuscate;
import com.v7878.r8.annotations.DoNotObfuscateType;
import com.v7878.r8.annotations.DoNotShrink;
import com.v7878.r8.annotations.DoNotShrinkType;
import com.v7878.zygisk.ZygoteLoader;

/** Entry point invoked by ZygoteLoader only in Causentry's system-side processes. */
@SuppressWarnings("all")
@DoNotObfuscateType
@DoNotShrinkType
public class ZygoteEntry {
    public static final String TAG = "CausentryZygote";

    private ZygoteEntry() {}

    @DoNotObfuscate
    @DoNotShrink
    public static void premain() throws Throwable {
    }

    @DoNotObfuscate
    @DoNotShrink
    public static void main() throws Throwable {
        String packageName = null;
        String processName = null;
        try {
            packageName = ZygoteLoader.getPackageName();
            processName = ZygoteLoader.getProcessName();
        } catch (Throwable ignored) {
        }
        if (packageName == null || processName == null) {
            if (Process.myUid() == Process.SYSTEM_UID) {
                packageName = "android";
                processName = "system_server";
            } else {
                try {
                    Class<?> atClass = Class.forName("android.app.ActivityThread");
                    Method currentPackage = atClass.getDeclaredMethod("currentPackageName");
                    Method currentProcess = atClass.getDeclaredMethod("currentProcessName");
                    packageName = (String) currentPackage.invoke(null);
                    processName = (String) currentProcess.invoke(null);
                } catch (Throwable ignored) {}
            }
        }

        Log.i(TAG, "Injected into " + packageName + "/" + processName
                + " uid=" + Process.myUid() + " pid=" + Process.myPid());
        try {
            if ("android".equals(packageName) || Process.myUid() == Process.SYSTEM_UID) {
                SystemServerBackend.start();
            } else if (SettingsProviderBackend.PACKAGE_NAME.equals(packageName)) {
                SettingsProviderBackend.start();
            } else {
                Log.w(TAG, "Ignoring unconfigured package " + packageName);
            }
        } catch (Throwable error) {
            Log.e(TAG, "backend failed for " + packageName, error);
        }
    }
}
