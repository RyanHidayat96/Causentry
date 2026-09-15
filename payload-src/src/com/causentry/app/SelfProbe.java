package com.causentry.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Self-check: "what does an app on this device actually see?"
 *
 * Detection is about signals an app can read, so the honest way to audit a bypass is to
 * run the same reads *from an app process* (this one) and print the answers. Causentry's
 * own package can be added to the target list, which turns this report into exactly what
 * the protected app sees.
 */
public final class SelfProbe {

    private static final String[] PATHS = {
            "/system/bin/su", "/system/xbin/su", "/system/sbin/su", "/sbin/su", "/vendor/bin/su",
            "/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/data/local/tmp/su",
            "/system/bin/busybox", "/system/xbin/busybox",
            "/data/adb", "/data/adb/modules", "/data/adb/ksu", "/sbin/.magisk", "/data/magisk",
    };

    private static final String[] PROPS = {
            "ro.debuggable", "ro.secure", "ro.build.tags", "ro.build.type",
            "ro.boot.verifiedbootstate", "ro.boot.flash.locked", "init.svc.adbd",
            "service.adb.root", "ro.kernel.qemu", "sys.oem_unlock_allowed",
    };

    private static final String[] PACKAGES = {
            "com.topjohnwu.magisk", "ru.gavrikov.mocklocations",
            "eu.chainfire.supersu", "com.dimonvideo.luckypatcher", "de.robv.android.xposed.installer",
    };

    private SelfProbe() {
    }

    /** run the checks and persist the report as files/probe.json (readable by the daemon) */
    public static String write(Context ctx) {
        String json = run(ctx).toString();
        try {
            java.io.FileOutputStream out = new java.io.FileOutputStream(new java.io.File(ctx.getFilesDir(), "probe.json"));
            try {
                out.write(json.getBytes("UTF-8"));
            } finally {
                out.close();
            }
        } catch (Throwable ignored) {
        }
        return json;
    }

    public static JSONObject run(Context ctx) {
        JSONObject out = new JSONObject();
        try {
            out.put("uid", Process.myUid());
            out.put("package", ctx.getPackageName());

            JSONObject files = new JSONObject();
            for (String p : PATHS) {
                boolean exists, readable;
                try {
                    File f = new File(p);
                    exists = f.exists();
                    readable = exists && f.canRead();
                } catch (Throwable t) {
                    exists = false;
                    readable = false;
                }
                files.put(p, (exists ? "EXISTS" : "-") + (readable ? " (readable)" : ""));
            }
            out.put("files", files);

            JSONObject props = new JSONObject();
            for (String p : PROPS) props.put(p, prop(p));
            out.put("props", props);

            JSONObject build = new JSONObject();
            build.put("TAGS", String.valueOf(Build.TAGS));
            build.put("TYPE", String.valueOf(Build.TYPE));
            build.put("FINGERPRINT", String.valueOf(Build.FINGERPRINT));
            build.put("DEBUGGABLE", (Build.TAGS != null && Build.TAGS.contains("test-keys")));
            out.put("build", build);

            JSONObject settings = new JSONObject();
            settings.put("global.development_settings_enabled",
                    Settings.Global.getString(ctx.getContentResolver(), "development_settings_enabled"));
            settings.put("global.adb_enabled",
                    Settings.Global.getString(ctx.getContentResolver(), "adb_enabled"));
            settings.put("secure.development_settings_enabled",
                    Settings.Secure.getString(ctx.getContentResolver(), "development_settings_enabled"));
            settings.put("secure.mock_location",
                    Settings.Secure.getString(ctx.getContentResolver(), "mock_location"));
            out.put("settings", settings);

            JSONObject pkgs = new JSONObject();
            for (String p : PACKAGES) {
                String state;
                try {
                    PackageInfo pi = ctx.getPackageManager().getPackageInfo(p, 0);
                    state = "SEEN (enabled=" + (pi.applicationInfo != null && pi.applicationInfo.enabled) + ")";
                } catch (Throwable t) {
                    state = "not visible (" + t.getClass().getSimpleName() + ")";
                }
                pkgs.put(p, state);
            }
            out.put("packages", pkgs);

            JSONArray listed = new JSONArray();
            try {
                List<ApplicationInfo> apps = ctx.getPackageManager().getInstalledApplications(0);
                for (String p : PACKAGES) {
                    for (ApplicationInfo ai : apps) {
                        if (p.equals(ai.packageName)) {
                            listed.put(p);
                            break;
                        }
                    }
                }
            } catch (Throwable ignored) {
            }
            out.put("listedInGetInstalledApplications", listed);

            JSONObject ops = new JSONObject();
            AppOpsManager aom = (AppOpsManager) ctx.getSystemService(Context.APP_OPS_SERVICE);
            if (aom != null) {
                for (String p : PACKAGES) {
                    try {
                        int uid = ctx.getPackageManager().getPackageInfo(p, 0).applicationInfo.uid;
                        ops.put(p, aom.checkOpNoThrow(AppOpsManager.OPSTR_MOCK_LOCATION, uid, p));
                    } catch (Throwable t) {
                        ops.put(p, "n/a");
                    }
                }
            }
            out.put("mockLocationAppOp", ops);

            out.put("whichSu", exec("which su"));
            out.put("whichBusybox", exec("which busybox"));
            out.put("maps", mapsHits());
        } catch (Throwable t) {
            try {
                out.put("error", String.valueOf(t));
            } catch (Throwable ignored) {
            }
        }
        return out;
    }

    private static String prop(String key) {
        try {
            Class<?> sp = Class.forName("android.os.SystemProperties");
            Method get = sp.getMethod("get", String.class);
            Object v = get.invoke(null, key);
            return v == null ? "" : String.valueOf(v);
        } catch (Throwable t) {
            return "?";
        }
    }

    private static String exec(String cmd) {
        try {
            java.lang.Process p = Runtime.getRuntime().exec(new String[]{"sh", "-c", cmd});
            BufferedReader r = new BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) sb.append(line).append(' ');
            r.close();
            p.waitFor();
            return sb.toString().trim();
        } catch (Throwable t) {
            return "?";
        }
    }

    /** hooking / root artifacts an app can see in its own memory map */
    private static String mapsHits() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader r = new BufferedReader(new FileReader("/proc/self/maps"));
            String line;
            int magisk = 0, ksu = 0, xposed = 0, frida = 0;
            while ((line = r.readLine()) != null) {
                String l = line.toLowerCase();
                if (l.contains("magisk")) magisk++;
                if (l.contains("ksu") || l.contains("kernelsu")) {
                    ksu++;
                    if (ksu <= 3) sb.append(" | ").append(line.trim());
                }
                if (l.contains("xposed") || l.contains("lsposed")) xposed++;
                if (l.contains("frida")) frida++;
            }
            r.close();
            sb.insert(0, "magisk=" + magisk + " ksu=" + ksu + " xposed=" + xposed + " frida=" + frida);
        } catch (Throwable t) {
            sb.append("?");
        }
        return sb.toString();
    }
}
