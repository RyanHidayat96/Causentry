package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

import com.v7878.r8.annotations.DoNotObfuscate;
import com.v7878.r8.annotations.DoNotObfuscateType;
import com.v7878.r8.annotations.DoNotShrink;
import com.v7878.r8.annotations.DoNotShrinkType;
import com.v7878.zygisk.ZygoteLoader;

/** Entry point invoked by ZygoteLoader in system_server only. */
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
        Log.i(TAG, "Injected into " + ZygoteLoader.getPackageName()
                + " uid=" + Process.myUid() + " pid=" + Process.myPid());
        try {
            SystemServerBackend.start();
            Log.i(TAG, "Done");
        } catch (Throwable error) {
            Log.e(TAG, "system_server backend failed", error);
        }
    }
}
