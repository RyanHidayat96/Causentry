package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

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
        String packageName = ZygoteLoader.getPackageName();
        String processName = ZygoteLoader.getProcessName();
        Log.i(TAG, "Injected into " + packageName + "/" + processName
                + " uid=" + Process.myUid() + " pid=" + Process.myPid());
        try {
            if (ZygoteLoader.PACKAGE_SYSTEM_SERVER.equals(packageName)) {
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
