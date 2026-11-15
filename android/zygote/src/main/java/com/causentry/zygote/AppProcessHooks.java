package com.causentry.zygote;

import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * In-process root detection bypass hooks.
 *
 * Libraries like RootBeer and Talsec (freeRASP) run entirely inside the
 * target app's own process. System-server binder hooks cannot reach them.
 * This class intercepts the standard Android APIs they rely on:
 *
 *   - File.exists() / canExecute() / canRead()  → false for root binary paths
 *   - Runtime.exec() / ProcessBuilder.start()   → IOException for su commands
 *   - SystemProperties.get()                    → clean values for root props
 *   - Talsec DataStore files deleted on startup → clears persisted threat state
 *
 * Installed lazily once per process when the calling UID is a Causentry-
 * protected target (CloakPolicy.hasHiddenPackages returns true).
 */
final class AppProcessHooks {
    private static final String TAG = "CausentryZygote";
    private static volatile boolean installed;

    // All file paths that RootBeer, LibSu, Talsec, and similar checkers probe.
    private static final Set<String> ROOT_PATHS = new HashSet<>(Arrays.asList(
            "/sbin/su",
            "/system/bin/su",
            "/system/bin/failsafe/su",
            "/system/xbin/su",
            "/system/sd/xbin/su",
            "/system/app/Superuser.apk",
            "/system/app/SuperSU.apk",
            "/data/local/xbin/su",
            "/data/local/bin/su",
            "/data/local/su",
            "/su/bin",
            "/su/bin/su",
            "/system/etc/init.d/99SuperSUDaemon",
            "/dev/com.koushikdutta.superuser.daemon",
            "/system/xbin/daemonsu",
            "/system/xbin/busybox",
            "/system/bin/busybox",
            "/sbin/busybox",
            "/vendor/bin/busybox",
            "/data/busybox",
            // KernelSU
            "/system/bin/ksud",
            "/data/adb/ksud",
            "/data/adb/ksu",
            "/data/adb/ksu.db",
            // APatch
            "/data/adb/ap.db",
            // Magisk
            "/sbin/.magisk",
            "/sbin/.core/bin",
            "/sbin/.core/db-0",
            "/data/adb/magisk",
            "/data/adb/magisk.img",
            "/data/adb/magisk.db",
            "/cache/magisk.log",
            "/data/adb/modules",
            "/data/adb/post-fs-data.d",
            "/data/adb/service.d"
    ));

    // Root binary filenames to filter from File.list() / File.listFiles() results.
    private static final Set<String> ROOT_BINARY_NAMES = new HashSet<>(Arrays.asList(
            "su", "busybox", "supersu", "daemonsu", "ksud", "apd",
            "magisk", "magiskd", "resetprop", "magiskhide"
    ));

    // Tokens in /proc/self/maps lines that must be hidden (Talsec talsecHook check).
    private static final Set<String> HIDDEN_MAP_TOKENS = new HashSet<>(Arrays.asList(
            "causentry", "zygiskd", "zygisk", "/data/adb/modules",
            "magisk", "ksu", "apatch", "riru", "edxposed", "lspatch"
    ));

    // Build / system props that root detectors read.  Return clean values.
    private static final Map<String, String> CLEAN_PROPS = buildCleanProps();

    private static Map<String, String> buildCleanProps() {
        Map<String, String> m = new HashMap<>();
        m.put("ro.debuggable",          "0");
        m.put("ro.secure",              "1");
        m.put("ro.build.tags",          "release-keys");
        m.put("ro.build.type",          "user");
        m.put("ro.build.flavor",        "user-release");
        m.put("ro.build.selinux",       "1");
        m.put("service.adb.root",       "0");
        m.put("ro.adb.secure",          "1");
        m.put("ro.bootmode",            "normal");
        m.put("persist.sys.usb.config", "mtp");
        return m;
    }

    private AppProcessHooks() {}

    // Settings keys checked by Bibit: checkIsUsbDebug + checkIsWirelessDebug
    private static final Set<String> ZERO_INT_SETTINGS = new HashSet<>(Arrays.asList(
            "adb_enabled",
            "adb_wifi_enabled",
            "adb_wifi_port",
            "development_settings_enabled"
    ));

    static synchronized void install(String packageName) {
        if (installed) return;
        installed = true;
        clearTalsecState(packageName);
        int hooked = 0;
        hooked += hookFile("exists");
        hooked += hookFile("canExecute");
        hooked += hookFile("canRead");
        hooked += hookRuntimeExec();
        hooked += hookProcessBuilder();
        hooked += hookSystemProperties();
        hooked += hookSettings();
        hooked += hookProcMaps();
        hooked += hookFileListing();
        Log.i(TAG, "app process hooks installed=" + hooked + " pkg=" + packageName);
    }

    // -------------------------------------------------------------------------
    // java.io.File
    // -------------------------------------------------------------------------

    private static int hookFile(String methodName) {
        try {
            Method method = File.class.getDeclaredMethod(methodName);
            Hooks.hook(method, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                File f = frame.accessor().getReference(0);
                if (f != null && isRootPath(f.getAbsolutePath())) {
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, false);
                    return;
                }
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            Log.i(TAG, "hooked File#" + methodName);
            return 1;
        } catch (Throwable e) {
            Log.w(TAG, "File#" + methodName + " hook failed", e);
            return 0;
        }
    }

    private static boolean isRootPath(String path) {
        if (path == null) return false;
        if (ROOT_PATHS.contains(path)) return true;
        for (String rp : ROOT_PATHS) {
            if (path.startsWith(rp + "/")) return true;
        }
        return false;
    }

    // -------------------------------------------------------------------------
    // java.lang.Runtime.exec
    // -------------------------------------------------------------------------

    private static int hookRuntimeExec() {
        int hooked = 0;
        // exec(String)
        try {
            Method m = Runtime.class.getDeclaredMethod("exec", String.class);
            Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                // Instance method: frame[0]=this, frame[1]=cmd
                String cmd = frame.accessor().getReference(1);
                if (isSuCommand(cmd)) throw new IOException("causentry: su blocked");
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "Runtime.exec(S) hook failed", e); }
        // exec(String[])
        try {
            Method m = Runtime.class.getDeclaredMethod("exec", String[].class);
            Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                Object arr = frame.accessor().getReference(1);
                if (arr instanceof String[] && isSuCommand((String[]) arr))
                    throw new IOException("causentry: su blocked");
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "Runtime.exec(SA) hook failed", e); }
        // exec(String, String[], File)
        try {
            Method m = Runtime.class.getDeclaredMethod("exec",
                    String.class, String[].class, File.class);
            Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                String cmd = frame.accessor().getReference(1);
                if (isSuCommand(cmd)) throw new IOException("causentry: su blocked");
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "Runtime.exec(SSF) hook failed", e); }
        // exec(String[], String[], File)
        try {
            Method m = Runtime.class.getDeclaredMethod("exec",
                    String[].class, String[].class, File.class);
            Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                Object arr = frame.accessor().getReference(1);
                if (arr instanceof String[] && isSuCommand((String[]) arr))
                    throw new IOException("causentry: su blocked");
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "Runtime.exec(SAAF) hook failed", e); }
        return hooked;
    }

    // -------------------------------------------------------------------------
    // java.lang.ProcessBuilder
    // -------------------------------------------------------------------------

    private static int hookProcessBuilder() {
        try {
            Method start = ProcessBuilder.class.getDeclaredMethod("start");
            Hooks.hook(start, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                ProcessBuilder pb = frame.accessor().getReference(0);
                if (pb != null) {
                    java.util.List<String> cmd = pb.command();
                    if (cmd != null && !cmd.isEmpty() && isSuCommand(cmd.get(0))) {
                        throw new IOException("causentry: su blocked");
                    }
                }
                Transformers.invokeExactNoChecks(original, frame);
            }, Hooks.EntryPointType.DIRECT);
            Log.i(TAG, "hooked ProcessBuilder#start");
            return 1;
        } catch (Throwable e) {
            Log.w(TAG, "ProcessBuilder#start hook failed", e);
            return 0;
        }
    }

    // -------------------------------------------------------------------------
    // android.os.SystemProperties
    // -------------------------------------------------------------------------

    private static int hookSystemProperties() {
        int hooked = 0;
        try {
            Class<?> sp = Class.forName("android.os.SystemProperties");
            for (Class<?> cursor = sp; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable exe : Reflection.getHiddenExecutables(cursor)) {
                    if (!(exe instanceof Method) || !"get".equals(exe.getName())) continue;
                    Method m = (Method) exe;
                    if (m.getReturnType() != String.class) continue;
                    Class<?>[] params = m.getParameterTypes();
                    if (params.length < 1 || params[0] != String.class) continue;
                    try {
                        // Static method: frame[0]=key, frame[1]=def (if present)
                        Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                            String key = frame.accessor().getReference(0);
                            String clean = CLEAN_PROPS.get(key);
                            if (clean != null) {
                                frame.accessor().setValue(
                                        EmulatedStackFrame.RETURN_VALUE_IDX, clean);
                                return;
                            }
                            Transformers.invokeExactNoChecks(original, frame);
                        }, Hooks.EntryPointType.DIRECT);
                        hooked++;
                    } catch (Throwable t) {
                        Log.w(TAG, "SystemProperties.get hook failed for " + m, t);
                    }
                }
            }
            Log.i(TAG, "SystemProperties hooks installed=" + hooked);
        } catch (Throwable e) {
            Log.w(TAG, "SystemProperties hook init failed", e);
        }
        return hooked;
    }

    // -------------------------------------------------------------------------
    // android.provider.Settings — covers adb_enabled, adb_wifi_enabled
    // -------------------------------------------------------------------------

    private static int hookSettings() {
        int hooked = 0;
        String[] providerClasses = {
                "android.provider.Settings$Global",
                "android.provider.Settings$Secure",
                "android.provider.Settings$System",
        };
        for (String cls : providerClasses) {
            try {
                Class<?> sc = Class.forName(cls);
                for (Method m : sc.getDeclaredMethods()) {
                    if (!"getInt".equals(m.getName()) && !"getString".equals(m.getName())) continue;
                    Class<?>[] p = m.getParameterTypes();
                    if (p.length < 2 || p[1] != String.class) continue;
                    final boolean returnsInt = "getInt".equals(m.getName())
                            && m.getReturnType() == int.class;
                    final boolean returnsStr = "getString".equals(m.getName())
                            && m.getReturnType() == String.class;
                    if (!returnsInt && !returnsStr) continue;
                    try {
                        Hooks.hook(m, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                            String key = frame.accessor().getReference(1);
                            if (key != null && ZERO_INT_SETTINGS.contains(key)) {
                                if (returnsInt) {
                                    frame.accessor().setValue(
                                            EmulatedStackFrame.RETURN_VALUE_IDX, 0);
                                } else {
                                    frame.accessor().setValue(
                                            EmulatedStackFrame.RETURN_VALUE_IDX, "0");
                                }
                                return;
                            }
                            Transformers.invokeExactNoChecks(original, frame);
                        }, Hooks.EntryPointType.DIRECT);
                        hooked++;
                    } catch (Throwable t) { /* per-method ignore */ }
                }
            } catch (Throwable e) {
                Log.w(TAG, "Settings hook failed for " + cls, e);
            }
        }
        Log.i(TAG, "Settings hooks installed=" + hooked);
        return hooked;
    }

    // -------------------------------------------------------------------------
    // /proc/self/maps filter — hides Zygisk/Causentry from talsecHook scan
    // -------------------------------------------------------------------------

    private static int hookProcMaps() {
        try {
            Method readMethod = java.io.FileInputStream.class
                    .getDeclaredMethod("read", byte[].class, int.class, int.class);
            Hooks.hook(readMethod, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                Transformers.invokeExactNoChecks(original, frame);
                int n = frame.accessor().getInt(EmulatedStackFrame.RETURN_VALUE_IDX);
                if (n <= 0) return;
                byte[] buf = frame.accessor().getReference(1);
                int off = frame.accessor().getInt(2);
                if (buf == null || !looksLikeMapsBuffer(buf, off, n)) return;
                int filtered = filterMapsBuffer(buf, off, n);
                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, filtered);
            }, Hooks.EntryPointType.DIRECT);
            Log.i(TAG, "hooked FileInputStream#read (procmaps filter)");
            return 1;
        } catch (Throwable e) {
            Log.w(TAG, "procmaps hook failed", e);
            return 0;
        }
    }

    private static boolean looksLikeMapsBuffer(byte[] buf, int off, int n) {
        if (n < 8 || off < 0 || off >= buf.length) return false;
        for (int i = off; i < off + 8 && i < buf.length; i++) {
            byte b = buf[i];
            if (!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'f') || b == '-')) return false;
        }
        return true;
    }

    private static int filterMapsBuffer(byte[] buf, int off, int n) {
        int end = Math.min(off + n, buf.length);
        int dst = off;
        int lineStart = off;
        for (int i = off; i <= end; i++) {
            if (i == end || buf[i] == '\n') {
                int lineEnd = i;
                boolean hide = false;
                String line = new String(buf, lineStart, lineEnd - lineStart,
                        StandardCharsets.US_ASCII).toLowerCase(Locale.ROOT);
                for (String token : HIDDEN_MAP_TOKENS) {
                    if (line.contains(token)) { hide = true; break; }
                }
                if (!hide) {
                    int len = lineEnd - lineStart + (i < end ? 1 : 0);
                    if (dst != lineStart) System.arraycopy(buf, lineStart, buf, dst, len);
                    dst += len;
                }
                lineStart = i + 1;
            }
        }
        return dst - off;
    }

    // -------------------------------------------------------------------------
    // Persistent security-SDK state cleanup
    // -------------------------------------------------------------------------

    /**
     * Removes files that security SDKs write to persist root/tamper verdicts
     * across launches.  Must run before the Application class loads.
     *
     * Covers both storage locations used by Android DataStore and
     * SharedPreferences, and matches file-name patterns from every major SDK:
     *   freeRASP / Talsec, RootBeer, Appdome / DexProtect,
     *   GuardSquare / DexGuard, and generic "security/integrity/tamper" keys.
     */
    private static void clearTalsecState(String packageName) {
        if (packageName == null || packageName.isEmpty()) return;
        String[] bases = {"/data/data/", "/data/user/0/"};
        String[][] subdirs = {
                {"files/datastore", ".preferences_pb"},
                {"shared_prefs",    ".xml"},
        };
        for (String base : bases) {
            for (String[] sd : subdirs) {
                try {
                    File dir = new File(base + packageName + "/" + sd[0]);
                    if (!dir.isDirectory()) continue;
                    File[] files = dir.listFiles();
                    if (files == null) continue;
                    for (File f : files) {
                        if (!f.isFile()) continue;
                        String name = f.getName().toLowerCase(Locale.ROOT);
                        if (!isSecuritySdkFile(name)) continue;
                        f.setWritable(true); // unlock if previous run locked it
                        boolean deleted = f.delete();
                        if (deleted || !f.exists()) {
                            // Recreate as immutable empty file. An empty protobuf
                            // means all boolean fields default to false → no threats.
                            // setReadOnly() prevents the SDK writing its verdict back.
                            try {
                                if (f.createNewFile()) {
                                    f.setReadOnly();
                                    Log.i(TAG, "locked security state: " + f.getAbsolutePath());
                                }
                            } catch (Throwable t) {
                                Log.w(TAG, "lock failed: " + f.getAbsolutePath(), t);
                            }
                        } else {
                            Log.w(TAG, "could not delete: " + f.getAbsolutePath());
                        }
                    }
                } catch (Throwable e) {
                    Log.w(TAG, "clearSecurityState failed for " + packageName
                            + "/" + sd[0], e);
                }
            }
        }
    }

    private static boolean isSecuritySdkFile(String nameLower) {
        // freeRASP / Talsec
        if (nameLower.contains("talsec") || nameLower.contains("freerasp")
                || nameLower.contains("threat")) return true;
        // RootBeer / generic root checkers
        if (nameLower.contains("rootbeer") || nameLower.contains("rootcheck")) return true;
        // Appdome / DexProtect
        if (nameLower.contains("appdome") || nameLower.contains("dexprotect")) return true;
        // GuardSquare / DexGuard
        if (nameLower.contains("guardsquare") || nameLower.contains("dexguard")) return true;
        // Generic security-state keys used by multiple SDKs
        if (nameLower.contains("security") || nameLower.contains("integrity")
                || nameLower.contains("tamper") || nameLower.contains("jailbreak")) return true;
        return false;
    }

    // -------------------------------------------------------------------------
    // java.io.File.list() / listFiles() — filter root binaries from directory scan
    // -------------------------------------------------------------------------

    private static int hookFileListing() {
        int hooked = 0;
        // list() → String[]
        try {
            Method listMethod = File.class.getDeclaredMethod("list");
            Hooks.hook(listMethod, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                Transformers.invokeExactNoChecks(original, frame);
                Object raw = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                if (!(raw instanceof String[])) return;
                String[] orig = (String[]) raw;
                String[] filtered = filterRootNames(orig);
                if (filtered != orig) {
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, filtered);
                }
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "File#list() hook failed", e); }
        // listFiles() → File[]
        try {
            Method listFilesMethod = File.class.getDeclaredMethod("listFiles");
            Hooks.hook(listFilesMethod, Hooks.EntryPointType.DIRECT, (original, frame) -> {
                Transformers.invokeExactNoChecks(original, frame);
                Object raw = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
                if (!(raw instanceof File[])) return;
                File[] orig = (File[]) raw;
                java.util.List<File> kept = new java.util.ArrayList<>(orig.length);
                boolean changed = false;
                for (File f : orig) {
                    if (ROOT_BINARY_NAMES.contains(f.getName().toLowerCase(Locale.ROOT))
                            || isRootPath(f.getAbsolutePath())) {
                        changed = true;
                    } else {
                        kept.add(f);
                    }
                }
                if (changed) {
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX,
                            kept.toArray(new File[0]));
                }
            }, Hooks.EntryPointType.DIRECT);
            hooked++;
        } catch (Throwable e) { Log.w(TAG, "File#listFiles() hook failed", e); }
        Log.i(TAG, "file listing hooks installed=" + hooked);
        return hooked;
    }

    private static String[] filterRootNames(String[] names) {
        java.util.List<String> kept = new java.util.ArrayList<>(names.length);
        boolean changed = false;
        for (String n : names) {
            if (ROOT_BINARY_NAMES.contains(n.toLowerCase(Locale.ROOT))) {
                changed = true;
            } else {
                kept.add(n);
            }
        }
        return changed ? kept.toArray(new String[0]) : names;
    }

    // -------------------------------------------------------------------------
    // Helpers
    // -------------------------------------------------------------------------

    private static boolean isSuCommand(String cmd) {
        if (cmd == null) return false;
        String t = cmd.trim();
        // Match exact binary name or any path ending with it
        int slash = t.lastIndexOf('/');
        String bin = (slash >= 0) ? t.substring(slash + 1).split(" ")[0] : t.split(" ")[0];
        return ROOT_BINARY_NAMES.contains(bin.toLowerCase(Locale.ROOT));
    }

    private static boolean isSuCommand(String[] args) {
        return args != null && args.length > 0 && isSuCommand(args[0]);
    }
}
