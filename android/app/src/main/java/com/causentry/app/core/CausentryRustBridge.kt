package com.causentry.app.core

import com.causentry.app.core.backup.BackupCore
import com.causentry.app.core.forensic.ForensicCore
import com.causentry.app.core.jni.BackupNative
import com.causentry.app.core.jni.ForensicNative

/**
 * Runtime facade over native JNI libraries (`libforensic_core_rs.so` and
 * `libbackup_core_rs.so`). Executes native Rust on Android devices and falls back
 * to the pure Java implementation during host JVM unit tests.
 */
object CausentryRustBridge {
    private val forensicNativeAvailable: Boolean by lazy {
        try {
            ForensicNative.formatUptimeSeconds(0L) == "0s"
        } catch (_: Throwable) {
            false
        }
    }

    private val backupNativeAvailable: Boolean by lazy {
        try {
            BackupNative.inspectBackupJson("{}").contains("\"ok\":false")
        } catch (_: Throwable) {
            false
        }
    }

    fun isNativeActive(): Boolean = forensicNativeAvailable && backupNativeAvailable

    fun parseLogcatLine(raw: String): String =
        if (forensicNativeAvailable) {
            try { ForensicNative.parseLogcatLine(raw) } catch (_: Throwable) { ForensicCore.parseLogcatLine(raw) }
        } else {
            ForensicCore.parseLogcatLine(raw)
        }

    fun classifyCrashTrace(trace: String, pkg: String, crashType: String): String =
        if (forensicNativeAvailable) {
            try { ForensicNative.classifyCrashTrace(trace, pkg, crashType) } catch (_: Throwable) { ForensicCore.classifyCrashTrace(trace, pkg, crashType) }
        } else {
            ForensicCore.classifyCrashTrace(trace, pkg, crashType)
        }

    fun formatUptimeSeconds(seconds: Long): String =
        if (forensicNativeAvailable) {
            try { ForensicNative.formatUptimeSeconds(seconds) } catch (_: Throwable) { ForensicCore.formatUptimeSeconds(seconds) }
        } else {
            ForensicCore.formatUptimeSeconds(seconds)
        }

    fun inspectBackupJson(rawJson: String): String =
        if (backupNativeAvailable) {
            try { BackupNative.inspectBackupJson(rawJson) } catch (_: Throwable) { BackupCore.inspectBackupJson(rawJson) }
        } else {
            BackupCore.inspectBackupJson(rawJson)
        }

    fun mergeBackupConfigJson(currentJson: String, importedJson: String, replaceAll: Boolean): String =
        if (backupNativeAvailable) {
            try { BackupNative.mergeBackupConfigJson(currentJson, importedJson, replaceAll) } catch (_: Throwable) { BackupCore.mergeBackupConfigJson(currentJson, importedJson, replaceAll) }
        } else {
            BackupCore.mergeBackupConfigJson(currentJson, importedJson, replaceAll)
        }
}
