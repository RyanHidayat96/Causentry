package com.causentry.app.model

enum class LogLevel(val letter: String) {
    VERBOSE("V"),
    DEBUG("D"),
    INFO("I"),
    WARN("W"),
    ERROR("E"),
    FATAL("F")
}

data class LogEntry(
    val id: Long,
    val timestamp: String,
    val pid: Int,
    val tid: Int,
    val level: LogLevel,
    val tag: String,
    val message: String,
    val packageName: String? = null
)

enum class CrashType {
    JAVA_CRASH,
    NATIVE_CRASH,
    ANR,
    RASP_DETECTION,
    PROCESS_KILL
}

data class CrashThreatReport(
    val id: Long,
    val timestamp: String,
    val packageName: String,
    val pid: Int,
    val type: CrashType,
    val title: String,
    val summary: String,
    val fullTrace: String,
    val threatDiagnosis: String? = null,
    val recommendedFix: String? = null
)
