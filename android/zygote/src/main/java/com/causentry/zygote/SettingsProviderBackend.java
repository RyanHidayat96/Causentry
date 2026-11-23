package com.causentry.zygote;

import android.os.Process;
import android.util.Log;

import org.json.JSONObject;

/** Starts only inside the dedicated framework SettingsProvider process (AOSP). */
final class SettingsProviderBackend {
    static final String PACKAGE_NAME = "com.android.providers.settings";
    private static final String TAG = "CausentryZygote";

    private SettingsProviderBackend() {}

    static void start() {
        try {
            PolicyChannel.addListener(CloakPolicy::applyPushPolicy);
            PolicyChannel.start("settings");
            CloakPolicy.loadColdStartFallback();

            int hooks = SettingsProviderHooks.install(false);
            if (hooks > 0) {
                JSONObject telemetry = new JSONObject();
                telemetry.put("settingsHooks", hooks);
                PolicyChannel.sendTelemetry(telemetry);
                Log.i(TAG, "settings provider hooks=" + hooks);
            } else {
                Log.e(TAG, "settings provider cloak not ready; hooks=0");
            }
        } catch (Throwable error) {
            Log.e(TAG, "settings provider backend failed uid=" + Process.myUid(), error);
        }
    }
}
