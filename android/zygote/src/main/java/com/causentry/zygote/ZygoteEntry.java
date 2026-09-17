package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

/** Entry point invoked by ZygoteLoader in system_server only. */
public final class ZygoteEntry {
    private static final String TAG = "CausentryZygote";

    private ZygoteEntry() {}

    public static void premain() {
        Log.i(TAG, "premain uid=" + Process.myUid() + " pid=" + Process.myPid());
    }

    public static void main() {
        Log.i(TAG, "main uid=" + Process.myUid() + " pid=" + Process.myPid());
        SystemServerBackend.start();
    }
}
