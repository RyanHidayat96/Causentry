package com.causentry.zygote;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import io.github.xiaotong6666.fusehide.config.HideConfigNativeBridge;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Causentry FUSE Storage Cloak Backend.
 * Injected into MediaProvider (android.process.media).
 * Receives policy pushes directly from causentryd via PolicyChannel (zero /sdcard files, zero public broadcasts)
 * and sends live FUSE coverage telemetry back to causentryd.
 */
public final class MediaProviderBackend {
    private static final String TAG = "CausentryFuse";

    public static final String PACKAGE_NAME = "com.android.providers.media.module";
    public static final String PACKAGE_NAME_GOOGLE = "com.google.android.providers.media.module";

    private static final String[] DEFAULT_HIDDEN_ROOT_ENTRIES = {
            "MT2", "TWRP", "twrp", "Fox", "OrangeFox", "su", "daemonsu",
            "Magisk", "magisk", ".magisk", "SuperSU", "KernelSU", "APatch",
            "busybox", "TitaniumBackup", "SwiftBackup", "xinhao"
    };

    private static final String[] DEFAULT_HIDDEN_RELATIVE_PATHS = {
            "Download/KernelSU", "Download/KernelSU.apk", "Download/kernelsu.apk",
            "Download/Magisk", "Download/Magisk.apk", "Download/magisk.apk",
            "Download/Magisk.zip", "Download/APatch", "Download/APatch.apk",
            "TWRP/TWRP.app"
    };

    private static volatile boolean sInitialized = false;
    private static volatile JSONObject sPendingPolicy;

    private MediaProviderBackend() {}

    public static void init(Context context) {
        if (sInitialized) return;
        sInitialized = true;
        Log.i(TAG, "MediaProviderBackend initialized for " + context.getPackageName());

        PolicyChannel.addListener(MediaProviderBackend::onPolicyReceived);
        PolicyChannel.start("mediaprovider");

        // Ensure default baseline applies even before first push arrives
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            JSONObject pending = sPendingPolicy;
            if (pending != null) {
                applyPolicy(pending);
            } else {
                applyRules(
                        new ArrayList<>(),
                        new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_ROOT_ENTRIES)),
                        new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_RELATIVE_PATHS))
                );
            }
        }, 500L);
    }

    private static void onPolicyReceived(JSONObject policy) {
        sPendingPolicy = policy;
        applyPolicy(policy);
    }

    private static synchronized void applyPolicy(JSONObject json) {
        try {
            List<String> targetPackages = new ArrayList<>();
            List<String> hiddenRootEntries = new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_ROOT_ENTRIES));
            List<String> hiddenRelativePaths = new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_RELATIVE_PATHS));

            if (json.has("targets")) {
                JSONArray targetsArray = json.optJSONArray("targets");
                if (targetsArray != null) {
                    for (int i = 0; i < targetsArray.length(); i++) {
                        String pkg = targetsArray.optString(i, "");
                        if (!pkg.isEmpty() && !targetPackages.contains(pkg)) {
                            targetPackages.add(pkg);
                        }
                    }
                }
            }

            JSONObject rules = json.optJSONObject("storageRules");
            if (rules != null) {
                JSONArray roots = rules.optJSONArray("hiddenRootEntryNames");
                if (roots != null) {
                    for (int i = 0; i < roots.length(); i++) {
                        String name = roots.optString(i, "");
                        if (!name.isEmpty() && !hiddenRootEntries.contains(name)) {
                            hiddenRootEntries.add(name);
                        }
                    }
                }
                JSONArray rels = rules.optJSONArray("hiddenRelativePaths");
                if (rels != null) {
                    for (int i = 0; i < rels.length(); i++) {
                        String path = rels.optString(i, "");
                        if (!path.isEmpty() && !hiddenRelativePaths.contains(path)) {
                            hiddenRelativePaths.add(path);
                        }
                    }
                }
            }

            applyRules(targetPackages, hiddenRootEntries, hiddenRelativePaths);
        } catch (Throwable t) {
            Log.e(TAG, "Failed to apply FUSE policy", t);
        }
    }

    private static synchronized void applyRules(
            List<String> targetPackages,
            List<String> hiddenRootEntries,
            List<String> hiddenRelativePaths
    ) {
        try {
            String[] emptyArr = new String[0];
            HideConfigNativeBridge.applyHideConfig(
                    false,
                    emptyArr,
                    hiddenRootEntries.toArray(new String[0]),
                    hiddenRelativePaths.toArray(new String[0]),
                    targetPackages.toArray(new String[0]),
                    emptyArr,
                    emptyArr,
                    emptyArr,
                    false,
                    emptyArr
            );

            HideConfigNativeBridge.notifyPackageSetChanged("causentry_policy_push");
            HideConfigNativeBridge.waitForHideInvalidations(2000L);

            boolean isCovered = HideConfigNativeBridge.hasCompleteFuseCallbackCoverage();
            Log.i(TAG, "FUSE cloak applied: targets=" + targetPackages.size()
                    + " roots=" + hiddenRootEntries.size()
                    + " rels=" + hiddenRelativePaths.size()
                    + " covered=" + isCovered);

            JSONObject telemetry = new JSONObject();
            telemetry.put("fuseActive", true);
            telemetry.put("fuseCovered", isCovered);
            telemetry.put("targetCount", targetPackages.size());
            telemetry.put("rootCount", hiddenRootEntries.size());
            telemetry.put("relativeCount", hiddenRelativePaths.size());
            PolicyChannel.sendTelemetry(telemetry);
        } catch (Throwable t) {
            Log.e(TAG, "Failed to invoke HideConfigNativeBridge", t);
        }
    }
}
