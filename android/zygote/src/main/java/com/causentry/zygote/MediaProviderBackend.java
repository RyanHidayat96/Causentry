package com.causentry.zygote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import io.github.xiaotong6666.fusehide.config.HideConfigNativeBridge;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Causentry FUSE Storage Cloak Backend
 * Injected into MediaProvider (android.process.media) to filter /sdcard/ filesystem queries
 * for protected applications.
 */
public final class MediaProviderBackend {
    private static final String TAG = "CausentryFuse";

    public static final String PACKAGE_NAME = "com.android.providers.media.module";
    public static final String PACKAGE_NAME_GOOGLE = "com.google.android.providers.media.module";
    public static final String ACTION_RELOAD_STORAGE_CLOAK = "com.causentry.action.RELOAD_STORAGE_CLOAK";
    public static final String ACTION_APPLY_CLOAK = "com.causentry.action.APPLY_CLOAK";

    private static final File CLOAK_STORAGE_FILE = new File("/data/media/0/Android/media/com.causentry.app/cloak.json");
    private static final File CLOAK_SYSTEM_FILE = new File("/data/system/causentry/cloak.json");

    private static final String[] DEFAULT_HIDDEN_ROOT_ENTRIES = {
            "MT2",
            "TWRP",
            "Fox",
            "su",
            "daemonsu",
            ".magisk",
            "busybox",
            "TitaniumBackup",
            "SwiftBackup",
            "xinhao"
    };

    private static final String[] DEFAULT_HIDDEN_RELATIVE_PATHS = {
            "Download/KernelSU",
            "Download/Magisk",
            "Download/APatch"
    };

    private static volatile Context sContext;
    private static volatile boolean sInitialized = false;

    private MediaProviderBackend() {}

    public static void init(Context context) {
        if (sInitialized) {
            return;
        }
        sContext = context;
        sInitialized = true;
        Log.i(TAG, "MediaProviderBackend initialized with context: " + context.getPackageName());

        // Register broadcast receiver for real-time rule updates
        registerReceiver(context);

        // Load and apply rules initially
        new Handler(Looper.getMainLooper()).postDelayed(MediaProviderBackend::reloadConfig, 1000L);
    }

    public static void start() {
        Log.i(TAG, "MediaProviderBackend.start invoked");
        reloadConfig();
    }

    private static void registerReceiver(Context context) {
        try {
            BroadcastReceiver receiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context ctx, Intent intent) {
                    Log.i(TAG, "Received broadcast to reload FUSE storage cloak: " + intent.getAction());
                    reloadConfig();
                }
            };

            IntentFilter filter = new IntentFilter();
            filter.addAction(ACTION_RELOAD_STORAGE_CLOAK);
            filter.addAction(ACTION_APPLY_CLOAK);

            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(receiver, filter, Context.RECEIVER_EXPORTED);
            } else {
                context.registerReceiver(receiver, filter);
            }
            Log.i(TAG, "Registered storage cloak broadcast receiver");
        } catch (Throwable t) {
            Log.e(TAG, "Failed to register broadcast receiver", t);
        }
    }

    public static synchronized void reloadConfig() {
        try {
            File configFile = null;
            if (CLOAK_STORAGE_FILE.canRead()) {
                configFile = CLOAK_STORAGE_FILE;
            } else if (CLOAK_SYSTEM_FILE.canRead()) {
                configFile = CLOAK_SYSTEM_FILE;
            }

            List<String> targetPackages = new ArrayList<>();
            List<String> hiddenRootEntries = new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_ROOT_ENTRIES));
            List<String> hiddenRelativePaths = new ArrayList<>(Arrays.asList(DEFAULT_HIDDEN_RELATIVE_PATHS));

            if (configFile != null && configFile.exists()) {
                String content = readFileToString(configFile);
                if (content != null && !content.isEmpty()) {
                    content = content.replace("\uFEFF", "").trim();
                    JSONObject json = new JSONObject(content);

                    // 1. Target packages receiving the storage cloak
                    if (json.has("targets")) {
                        JSONArray targetsArray = json.getJSONArray("targets");
                        for (int i = 0; i < targetsArray.length(); i++) {
                            String pkg = targetsArray.getString(i);
                            if (pkg != null && !pkg.isEmpty() && !targetPackages.contains(pkg)) {
                                targetPackages.add(pkg);
                            }
                        }
                    }

                    // 2. Custom storage rules if defined in Causentry config
                    if (json.has("storageRules")) {
                        JSONObject rules = json.getJSONObject("storageRules");
                        if (rules.has("hiddenRootEntryNames")) {
                            JSONArray arr = rules.getJSONArray("hiddenRootEntryNames");
                            for (int i = 0; i < arr.length(); i++) {
                                String name = arr.getString(i);
                                if (name != null && !name.isEmpty() && !hiddenRootEntries.contains(name)) {
                                    hiddenRootEntries.add(name);
                                }
                            }
                        }
                        if (rules.has("hiddenRelativePaths")) {
                            JSONArray arr = rules.getJSONArray("hiddenRelativePaths");
                            for (int i = 0; i < arr.length(); i++) {
                                String path = arr.getString(i);
                                if (path != null && !path.isEmpty() && !hiddenRelativePaths.contains(path)) {
                                    hiddenRelativePaths.add(path);
                                }
                            }
                        }
                    }
                }
            }

            String[] hiddenPackagesArr = targetPackages.toArray(new String[0]);
            String[] hiddenRootEntriesArr = hiddenRootEntries.toArray(new String[0]);
            String[] hiddenRelativePathsArr = hiddenRelativePaths.toArray(new String[0]);
            String[] emptyArr = new String[0];

            Log.i(TAG, "Applying FUSE hide config: " + targetPackages.size() + " target apps, "
                    + hiddenRootEntries.size() + " root entries, " + hiddenRelativePaths.size() + " relative paths");

            HideConfigNativeBridge.applyHideConfig(
                    false,                          // enableHideAllRootEntries
                    emptyArr,                       // hideAllRootEntriesExemptions
                    hiddenRootEntriesArr,           // hiddenRootEntryNames
                    hiddenRelativePathsArr,         // hiddenRelativePaths
                    hiddenPackagesArr,              // hiddenPackages
                    emptyArr,                       // packageRulePackages
                    emptyArr,                       // packageRuleHiddenRootEntryNames
                    emptyArr,                       // packageRuleHiddenRelativePaths
                    false,                          // enableHideAllPublicRootEntries
                    emptyArr                        // hideAllPublicRootEntriesExemptions
            );

            HideConfigNativeBridge.notifyPackageSetChanged("causentry_config_reload");
            HideConfigNativeBridge.waitForHideInvalidations(2000L);

            boolean isCovered = HideConfigNativeBridge.hasCompleteFuseCallbackCoverage();
            Log.i(TAG, "FUSE storage cloak applied successfully! Coverage=" + isCovered);

            // Write status marker for Causentry UI / daemon
            try {
                File dir = new File("/data/media/0/Android/media/com.causentry.app");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                File statusFile = new File(dir, "fuse_status.json");
                JSONObject statusObj = new JSONObject();
                statusObj.put("active", true);
                statusObj.put("covered", isCovered);
                statusObj.put("targetCount", targetPackages.size());
                statusObj.put("rootCount", hiddenRootEntries.size());
                statusObj.put("relativeCount", hiddenRelativePaths.size());
                statusObj.put("timestamp", System.currentTimeMillis());

                try (java.io.FileOutputStream fos = new java.io.FileOutputStream(statusFile)) {
                    fos.write(statusObj.toString().getBytes(StandardCharsets.UTF_8));
                    fos.flush();
                }
                statusFile.setReadable(true, false);
            } catch (Throwable t) {
                Log.w(TAG, "Could not write fuse_status.json", t);
            }
        } catch (Throwable t) {
            Log.e(TAG, "Failed to reload and apply FUSE storage cloak config", t);
        }
    }

    private static String readFileToString(File file) {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            int read = fis.read(data);
            if (read > 0) {
                return new String(data, 0, read, StandardCharsets.UTF_8);
            }
        } catch (Throwable ignored) {}
        return null;
    }
}
