package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

/** Starts only inside the framework SettingsProvider process. */
final class SettingsProviderBackend {
    static final String PACKAGE_NAME = "com.android.providers.settings";
    private static final String TAG = "CausentryZygote";

    private SettingsProviderBackend() {}

    static void start() {
        try {
            int hooks = SettingsProviderHooks.install();
            if (hooks > 0) {
                SystemServerBackend.markSettingsProviderReady(hooks);
            } else {
                Log.e(TAG, "settings provider cloak not ready; hooks=0");
            }
        } catch (Throwable error) {
            Log.e(TAG, "settings provider backend failed uid=" + Process.myUid(), error);
        }
    }
}
