package com.causentry.app.core.jni;

/**
 * JNI bindings for {@code libforensic_core_rs.so}.
 */
public final class ForensicNative {
    private ForensicNative() {}

    static {
        System.loadLibrary("forensic_core_rs");
    }

    private static native String n_parseLogcatLine(String raw, String[] slot);
    private static native String n_classifyCrashTrace(String trace, String pkg, String crashType, String[] slot);
    private static native String n_formatUptimeSeconds(long seconds, String[] slot);

    public static String parseLogcatLine(String raw) {
        String[] slot = NativeBridgeError.slot();
        String out = n_parseLogcatLine(raw, slot);
        NativeBridgeError.check(slot);
        return out;
    }

    public static String classifyCrashTrace(String trace, String pkg, String crashType) {
        String[] slot = NativeBridgeError.slot();
        String out = n_classifyCrashTrace(trace, pkg, crashType, slot);
        NativeBridgeError.check(slot);
        return out;
    }

    public static String formatUptimeSeconds(long seconds) {
        String[] slot = NativeBridgeError.slot();
        String out = n_formatUptimeSeconds(seconds, slot);
        NativeBridgeError.check(slot);
        return out;
    }
}
