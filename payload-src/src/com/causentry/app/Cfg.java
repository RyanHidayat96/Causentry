package com.causentry.app;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Causentry runtime configuration.
 *
 * Config is looked up (first readable wins):
 *   1. /sdcard/Android/media/com.causentry.app/config.json
 *   2. /storage/emulated/0/Android/media/com.causentry.app/config.json
 *   3. /data/local/tmp/causentry/config.json
 *
 * If none is readable, built-in defaults apply (targets = DEFAULT_TARGETS).
 */
public final class Cfg {

    public static final String TAG = "Causentry";
    public static final String PKG = "com.causentry.app";

    private static final String[] CONFIG_PATHS = new String[]{
            "/sdcard/Android/media/com.causentry.app/config.json",
            "/storage/emulated/0/Android/media/com.causentry.app/config.json",
            "/data/local/tmp/causentry/config.json",
            "/data/media/0/Android/media/com.causentry.app/config.json"
    };

    /** Apps protected out of the box. */
    public static final Set<String> DEFAULT_TARGETS = setOf("com.bpjstku");

    public String mode = "targets";          // "targets" | "all"
    public Set<String> targets = new LinkedHashSet<>(DEFAULT_TARGETS);
    public Set<String> hidePackages = new LinkedHashSet<>(Hide.PACKAGES);
    public boolean cloakSettings = true;
    public boolean cloakPackages = true;
    public boolean cloakRoot = true;
    public boolean cloakLocation = true;
    public boolean cloakDebug = true;
    public boolean cloakFramework = true;
    public boolean spoofProps = true;
    public boolean spoofBuild = true;
    public boolean verbose = true;
    public String loadedFrom = "builtin";

    private static volatile Cfg instance;

    public static Cfg get() {
        Cfg c = instance;
        if (c == null) {
            synchronized (Cfg.class) {
                c = instance;
                if (c == null) {
                    c = load();
                    instance = c;
                }
            }
        }
        return c;
    }

    public boolean isProtected(String pkg) {
        if (pkg == null || PKG.equals(pkg)) return false;
        if ("all".equalsIgnoreCase(mode)) {
            // Never cloak critical system plumbing, or the device breaks.
            if (pkg.startsWith("android") || pkg.startsWith("com.android.systemui")
                    || pkg.startsWith("com.android.phone") || pkg.startsWith("com.google.android.gms")
                    || pkg.startsWith("com.android.providers") || pkg.startsWith("com.android.settings")) {
                return false;
            }
            return true;
        }
        return targets.contains(pkg);
    }

    public boolean isPackageHidden(String pkg) {
        if (pkg == null) return false;
        if (hidePackages.contains(pkg)) return true;
        String lower = pkg.toLowerCase();
        return lower.contains("fakegps") || lower.contains("mocklocation");
    }

    private static Cfg load() {
        Cfg c = new Cfg();
        for (String path : CONFIG_PATHS) {
            try {
                File f = new File(path);
                if (!f.isFile() || !f.canRead()) continue;
                byte[] buf = new byte[(int) f.length()];
                try (FileInputStream in = new FileInputStream(f)) {
                    int off = 0;
                    while (off < buf.length) {
                        int n = in.read(buf, off, buf.length - off);
                        if (n <= 0) break;
                        off += n;
                    }
                }
                JSONObject o = new JSONObject(new String(buf, StandardCharsets.UTF_8));
                c.mode = o.optString("mode", c.mode);
                c.targets = readSet(o, "targets", c.targets);
                c.hidePackages = readSet(o, "hidePackages", c.hidePackages);
                c.cloakSettings = o.optBoolean("cloakSettings", true);
                c.cloakPackages = o.optBoolean("cloakPackages", true);
                c.cloakRoot = o.optBoolean("cloakRoot", true);
                c.cloakLocation = o.optBoolean("cloakLocation", true);
                c.cloakDebug = o.optBoolean("cloakDebug", true);
                c.cloakFramework = o.optBoolean("cloakFramework", true);
                c.spoofProps = o.optBoolean("spoofProps", true);
                c.spoofBuild = o.optBoolean("spoofBuild", true);
                c.verbose = o.optBoolean("verbose", true);
                c.loadedFrom = path;
                return c;
            } catch (Throwable t) {
                Log.w(TAG, "config read failed at " + path + ": " + t);
            }
        }
        return c;
    }

    private static Set<String> readSet(JSONObject o, String key, Set<String> def) {
        JSONArray arr = o.optJSONArray(key);
        if (arr == null) return def;
        Set<String> out = new LinkedHashSet<>();
        for (int i = 0; i < arr.length(); i++) {
            String v = arr.optString(i, null);
            if (v != null && !v.isEmpty()) out.add(v);
        }
        return out;
    }

    private static Set<String> setOf(String... items) {
        Set<String> s = new HashSet<>();
        Collections.addAll(s, items);
        return s;
    }
}
