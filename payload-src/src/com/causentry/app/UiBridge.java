package com.causentry.app;

import android.webkit.JavascriptInterface;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Bridge between the UI page (bundled in assets) and the root daemon.
 *
 * The app never needs root: it reads the snapshot the daemon leaves in its own
 * private files dir and drops command files next to it. The daemon picks them up
 * on its next cycle (about 5 seconds).
 */
public class UiBridge {

    private static final Set<String> ACTIONS = new HashSet<>(Arrays.asList(
            "refresh", "apply", "restore", "roothide", "hideone", "setapp", "delapp", "save"));

    private final UiActivity activity;

    UiBridge(UiActivity activity) {
        this.activity = activity;
    }

    /** state snapshot written by the daemon (status.json) */
    @JavascriptInterface
    public String status() {
        return read("status.json");
    }

    /** installed apps snapshot (apps.json), refreshed by the daemon */
    @JavascriptInterface
    public String apps() {
        return read("apps.json");
    }

    /** installed app labels: {"com.bpjstku":"JMO", ...} */
    @JavascriptInterface
    public String labels() {
        JSONObject outJson = new JSONObject();
        try {
            android.content.pm.PackageManager pm = activity.getPackageManager();
            java.util.List<android.content.pm.ApplicationInfo> apps =
                    pm.getInstalledApplications(android.content.pm.PackageManager.GET_META_DATA);
            for (android.content.pm.ApplicationInfo ai : apps) {
                if (ai == null || ai.packageName == null) continue;
                CharSequence l = pm.getApplicationLabel(ai);
                String label = l == null ? "" : l.toString();
                label = label.replace("\n", " ").replace("\r", " ").trim();
                outJson.put(ai.packageName, label);
            }
        } catch (Exception ignored) {
        }
        String json = outJson.toString();
        try {   // share the names with the daemon so the browser view gets them too
            File f = new File(activity.getFilesDir(), "labels.json");
            FileOutputStream out = new FileOutputStream(f);
            try { out.write(json.getBytes("UTF-8")); } finally { out.close(); }
        } catch (Exception ignored) {
        }
        return json;
    }

    /** the app's real launcher icon as a data URI (empty when unavailable) */
    @JavascriptInterface
    public String icon(String pkg) {
        try {
            if (!isPackageName(pkg)) return "";
            android.content.pm.PackageManager pm = activity.getPackageManager();
            android.graphics.drawable.Drawable d = pm.getApplicationIcon(pkg);
            int size = Math.round(activity.getResources().getDisplayMetrics().density * 40f);  // 40dp
            android.graphics.Bitmap bmp = android.graphics.Bitmap.createBitmap(
                    size, size, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bmp);
            d.setBounds(0, 0, size, size);
            d.draw(canvas);
            java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
            bmp.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, out);
            String b64 = android.util.Base64.encodeToString(out.toByteArray(), android.util.Base64.NO_WRAP);
            bmp.recycle();
            return "data:image/png;base64," + b64;
        } catch (Exception e) {
            return "";
        }
    }

    /** queue a command for the daemon, e.g. {"action":"apply"} */
    @JavascriptInterface
    public String command(String json) {
        try {
            if (json == null || json.length() > 8192) {
                return "{\"ok\":false,\"error\":\"invalid command\"}";
            }
            JSONObject obj = new JSONObject(json);
            if (!isAllowed(obj)) {
                return "{\"ok\":false,\"error\":\"rejected command\"}";
            }
            File dir = new File(activity.getFilesDir(), "cmd");
            if (!dir.exists() && !dir.mkdirs()) {
                return "{\"ok\":false,\"error\":\"cannot create command dir\"}";
            }
            File f = new File(dir, "cmd-" + System.currentTimeMillis() + ".json");
            FileOutputStream out = new FileOutputStream(f);
            try {
                out.write(obj.toString().getBytes("UTF-8"));
            } finally {
                out.close();
            }
            return "{\"ok\":true}";
        } catch (Exception e) {
            return "{\"ok\":false,\"error\":\"" + String.valueOf(e.getMessage()).replace("\"", "'") + "\"}";
        }
    }

    /** run the self-check in this app process and store it for the UI/daemon */
    @JavascriptInterface
    public String probe() {
        try {
            String json = SelfProbe.run(activity).toString();
            File f = new File(activity.getFilesDir(), "probe.json");
            FileOutputStream out = new FileOutputStream(f);
            try {
                out.write(json.getBytes("UTF-8"));
            } finally {
                out.close();
            }
            return json;
        } catch (Exception e) {
            return "{\"error\":\"" + String.valueOf(e.getMessage()).replace("\"", "'") + "\"}";
        }
    }

    private String read(String name) {
        try {
            File f = new File(activity.getFilesDir(), name);
            if (!f.exists()) {
                return "{}";
            }
            BufferedReader r = new BufferedReader(new FileReader(f));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            r.close();
            return sb.toString();
        } catch (Exception e) {
            return "{}";
        }
    }

    private static boolean isAllowed(JSONObject obj) {
        String action = obj.optString("action", "");
        if (!ACTIONS.contains(action)) return false;
        if ("setapp".equals(action) || "delapp".equals(action) || "hideone".equals(action)) {
            if (!isPackageName(obj.optString("pkg", ""))) return false;
        }
        if ("setapp".equals(action)) {
            String[] parts = obj.optString("features", "").split(",");
            for (String p : parts) {
                if (p.isEmpty()) continue;
                if (!"devOff".equals(p) && !"mock".equals(p) && !"isolate".equals(p)) return false;
            }
        }
        return true;
    }

    private static boolean isPackageName(String s) {
        return s != null && s.matches("[A-Za-z0-9_]+(\\.[A-Za-z0-9_]+)+");
    }
}
