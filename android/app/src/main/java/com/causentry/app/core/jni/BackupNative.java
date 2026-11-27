package com.causentry.app.core.jni;

/**
 * JNI bindings for {@code libbackup_core_rs.so}.
 */
public final class BackupNative {
    private BackupNative() {}

    static {
        System.loadLibrary("backup_core_rs");
    }

    private static native String n_inspectBackupJson(String rawJson, String[] slot);
    private static native String n_mergeBackupConfigJson(String currentJson, String importedJson, boolean replaceAll, String[] slot);

    public static String inspectBackupJson(String rawJson) {
        String[] slot = NativeBridgeError.slot();
        String out = n_inspectBackupJson(rawJson, slot);
        NativeBridgeError.check(slot);
        return out;
    }

    public static String mergeBackupConfigJson(String currentJson, String importedJson, boolean replaceAll) {
        String[] slot = NativeBridgeError.slot();
        String out = n_mergeBackupConfigJson(currentJson, importedJson, replaceAll, slot);
        NativeBridgeError.check(slot);
        return out;
    }
}
