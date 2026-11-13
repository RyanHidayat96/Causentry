package com.causentry.app.data

import android.content.Context
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.CrashType
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import java.util.regex.Pattern
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ForensicManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val scope = CoroutineScope(Dispatchers.IO)
    private var streamJob: Job? = null
    private var currentProcess: Process? = null

    private val entryIdGen = AtomicLong(1)
    private val crashIdGen = AtomicLong(1)

    // SharedPreferences to persist live streaming state across app restarts
    private val prefs = context.getSharedPreferences("causentry_forensics", Context.MODE_PRIVATE)
    private val KEY_LIVE_STREAMING = "live_streaming_enabled"

    // Maximum log entries kept in memory to maintain 120Hz smooth UI
    private val maxBufferEntries = 1500

    private val _logsFlow = MutableStateFlow<List<LogEntry>>(emptyList())
    val logsFlow: StateFlow<List<LogEntry>> = _logsFlow.asStateFlow()

    private val _crashReportsFlow = MutableStateFlow<List<CrashThreatReport>>(emptyList())
    val crashReportsFlow: StateFlow<List<CrashThreatReport>> = _crashReportsFlow.asStateFlow()

    private val _isLiveStreaming = MutableStateFlow(
        prefs.getBoolean(KEY_LIVE_STREAMING, true)
    )
    val isLiveStreaming: StateFlow<Boolean> = _isLiveStreaming.asStateFlow()

    // Cache of PID -> Package Name
    private val pidToPackage = ConcurrentHashMap<Int, String>()

    // ThreadTime pattern: 05-18 11:21:45.123  1234  5678 E Tag: Message
    private val threadTimePattern = Pattern.compile(
        "^([0-9]{2}-[0-9]{2}\\s+[0-9]{2}:[0-9]{2}:[0-9]{2}\\.[0-9]+)\\s+([0-9]+)\\s+([0-9]+)\\s+([VDIWEF])\\s+([^:]+):\\s*(.*)$"
    )

    // Crash detection state machine
    private var activeCrashTrace = StringBuilder()
    private var activeCrashPkg: String? = null
    private var activeCrashPid = 0
    private var activeCrashTimestamp = ""
    private var activeCrashType = CrashType.JAVA_CRASH

    init {
        streamJob = scope.launch {
            runLogcatLoop()
        }
    }

    fun startStreaming() {
        _isLiveStreaming.value = true
        prefs.edit().putBoolean(KEY_LIVE_STREAMING, true).apply()
        if (streamJob?.isActive != true) {
            streamJob = scope.launch {
                runLogcatLoop()
            }
        }
    }

    fun pauseStreaming() {
        _isLiveStreaming.value = false
        prefs.edit().putBoolean(KEY_LIVE_STREAMING, false).apply()
    }

    fun resumeStreaming() {
        _isLiveStreaming.value = true
        prefs.edit().putBoolean(KEY_LIVE_STREAMING, true).apply()
        if (streamJob?.isActive != true) {
            streamJob = scope.launch {
                runLogcatLoop()
            }
        }
    }

    fun toggleLiveStreaming() {
        if (_isLiveStreaming.value) {
            pauseStreaming()
        } else {
            resumeStreaming()
        }
    }

    fun clearLogs() {
        _logsFlow.value = emptyList()
    }

    fun clearCrashes() {
        _crashReportsFlow.value = emptyList()
    }

    fun dismissCrash(reportId: Long) {
        _crashReportsFlow.value = _crashReportsFlow.value.filter { it.id != reportId }
    }

    private suspend fun runLogcatLoop() = withContext(Dispatchers.IO) {
        while (isActive) {
            try {
                // Try reading logcat via root su first for all buffers (main, system, crash)
                val proc = try {
                    ProcessBuilder("su", "-c", "logcat -v threadtime -b main -b system -b crash")
                        .redirectErrorStream(true)
                        .start()
                } catch (_: Exception) {
                    ProcessBuilder("logcat", "-v", "threadtime")
                        .redirectErrorStream(true)
                        .start()
                }

                currentProcess = proc
                val reader = BufferedReader(InputStreamReader(proc.inputStream, Charsets.UTF_8))

                val batchList = ArrayList<LogEntry>(100)
                var lastBatchEmit = System.currentTimeMillis()

                var line: String? = null
                while (isActive && reader.readLine().also { line = it } != null) {
                    val currentLine = line ?: continue
                    val entry = parseLogLine(currentLine)

                    if (entry != null) {
                        detectThreatsAndCrashes(entry)
                        if (_isLiveStreaming.value) {
                            batchList.add(entry)
                        }
                    }

                    // Flush in batches every 150ms or when 60 lines accumulate
                    val now = System.currentTimeMillis()
                    if (batchList.size >= 60 || (now - lastBatchEmit > 150 && batchList.isNotEmpty())) {
                        val current = _logsFlow.value
                        val updated = (current + batchList).takeLast(maxBufferEntries)
                        _logsFlow.value = updated
                        batchList.clear()
                        lastBatchEmit = now
                    }
                }
            } catch (_: Exception) {
                // Wait briefly before reconnecting
                kotlinx.coroutines.delay(2000)
            } finally {
                currentProcess?.destroy()
                currentProcess = null
            }
        }
    }

    private fun parseLogLine(raw: String): LogEntry? {
        val matcher = threadTimePattern.matcher(raw)
        if (!matcher.matches()) return null

        val ts = matcher.group(1) ?: ""
        val pid = matcher.group(2)?.toIntOrNull() ?: 0
        val tid = matcher.group(3)?.toIntOrNull() ?: 0
        val lvlChar = matcher.group(4) ?: "I"
        val tag = matcher.group(5)?.trim() ?: ""
        val msg = matcher.group(6) ?: ""

        val level = when (lvlChar) {
            "V" -> LogLevel.VERBOSE
            "D" -> LogLevel.DEBUG
            "I" -> LogLevel.INFO
            "W" -> LogLevel.WARN
            "E" -> LogLevel.ERROR
            "F" -> LogLevel.FATAL
            else -> LogLevel.INFO
        }

        // Cache package mappings from system activity logs
        if (tag == "ActivityManager") {
            if (msg.contains("Start proc") && msg.contains(":")) {
                extractPkgFromStartProc(pid, msg)
            }
        }

        val pkg = pidToPackage[pid]

        return LogEntry(
            id = entryIdGen.getAndIncrement(),
            timestamp = ts,
            pid = pid,
            tid = tid,
            level = level,
            tag = tag,
            message = msg,
            packageName = pkg
        )
    }

    private fun extractPkgFromStartProc(pid: Int, msg: String) {
        // e.g.: Start proc 29573:com.bpjstku/u0a405 for activity ...
        val idx = msg.indexOf("Start proc ")
        if (idx >= 0) {
            val sub = msg.substring(idx + 11)
            val parts = sub.split(":")
            if (parts.size >= 2) {
                val p = parts[0].trim().toIntOrNull() ?: return
                val pkgWithExtra = parts[1].split("/")[0].trim()
                if (pkgWithExtra.isNotEmpty()) {
                    pidToPackage[p] = pkgWithExtra
                }
            }
        }
    }

    private fun detectThreatsAndCrashes(entry: LogEntry) {
        val tag = entry.tag
        val msg = entry.message

        // 1. AndroidRuntime FATAL EXCEPTION (Java crash or RASP trap)
        if (tag == "AndroidRuntime" && msg.contains("FATAL EXCEPTION:")) {
            commitActiveCrash()
            activeCrashTrace.clear()
            activeCrashTrace.appendLine(msg)
            activeCrashTimestamp = entry.timestamp
            activeCrashPid = entry.pid
            activeCrashType = CrashType.JAVA_CRASH

            // Parse process name if present in line
            val procIdx = msg.indexOf("Process: ")
            if (procIdx >= 0) {
                val procSub = msg.substring(procIdx + 9).split(",")[0].trim()
                activeCrashPkg = procSub
                pidToPackage[entry.pid] = procSub
            }
            return
        }

        // Append ongoing crash stack trace
        if (tag == "AndroidRuntime" && activeCrashTrace.isNotEmpty() && activeCrashPid == entry.pid) {
            activeCrashTrace.appendLine(msg)

            if (msg.contains("Process: ")) {
                val sub = msg.substringAfter("Process: ").substringBefore(",").trim()
                activeCrashPkg = sub
                pidToPackage[entry.pid] = sub
            }

            // End of crash stack trace (common indicator or exception complete)
            if (msg.startsWith("\tat ") || msg.contains("Caused by:")) {
                // continuing trace
            }
            return
        }

        // 2. Native Crash (DEBUG tombstone)
        if (tag == "DEBUG" && (msg.contains("*** *** ***") || msg.contains("signal 11 (SIGSEGV)") || msg.contains("signal 6 (SIGABRT)"))) {
            commitActiveCrash()
            activeCrashTrace.clear()
            activeCrashTrace.appendLine(msg)
            activeCrashTimestamp = entry.timestamp
            activeCrashPid = entry.pid
            activeCrashType = CrashType.NATIVE_CRASH

            val pkg = pidToPackage[entry.pid]
            activeCrashPkg = pkg
            return
        }

        // 3. ActivityManager ANR
        if (tag == "ActivityManager" && msg.contains("ANR in ")) {
            val pkg = msg.substringAfter("ANR in ").substringBefore(" ").substringBefore("/").trim()
            val report = CrashThreatReport(
                id = crashIdGen.getAndIncrement(),
                timestamp = entry.timestamp,
                packageName = pkg.ifEmpty { "unknown" },
                pid = entry.pid,
                type = CrashType.ANR,
                title = "Application Not Responding (ANR)",
                summary = msg,
                fullTrace = msg,
                threatDiagnosis = "Main thread was blocked by prolonged execution or security probe deadlock.",
                recommendedFix = "Verify if synchronous hooks or App-Zygote probes are holding the main looper."
            )
            addCrashReport(report)
            return
        }

        // Commit active Java/Native crash if other tags arrive
        if (activeCrashTrace.isNotEmpty() && tag != "AndroidRuntime" && tag != "DEBUG") {
            commitActiveCrash()
        }
    }

    private fun commitActiveCrash() {
        if (activeCrashTrace.isEmpty()) return

        val trace = activeCrashTrace.toString().trim()
        activeCrashTrace.clear()

        val pkg = activeCrashPkg ?: pidToPackage[activeCrashPid] ?: "unknown"

        var threatDiagnosis: String? = null
        var recommendedFix: String? = null
        var title = "App Crash (FATAL EXCEPTION)"

        // Intelligent RASP & Anti-Detection Heuristics
        when {
            trace.contains("ArrayIndexOutOfBoundsException: length=") && trace.contains("index=-1") -> {
                title = "🚨 PairIP Anti-Tamper Crash Trap"
                threatDiagnosis = "Target application detected root or an uncloaked component and triggered a deliberate ArrayIndexOutOfBounds trap."
                recommendedFix = "Enable 'Block App-Zygote Probes' + 'Hide Developer Options' for $pkg in Causentry."
            }
            trace.contains("OutOfMemoryError: Failed to allocate") && trace.contains("allocation with") -> {
                title = "🚨 RASP Intentional OOM Bomb"
                threatDiagnosis = "Target application intentionally attempted to allocate an impossible buffer to self-terminate after detecting a modification."
                recommendedFix = "Enable 'Block App-Zygote Probes' (usesAppZygote=false) to prevent isolated security worker execution."
            }
            trace.contains("libzimperium") || trace.contains("libpairipcore") || trace.contains("libsecneo") || trace.contains("libdexguard") -> {
                title = "🚨 Commercial RASP Shield Self-Defense"
                threatDiagnosis = "Security library detected an integrity anomaly and called abort() or exit()."
                recommendedFix = "Ensure target is added to Causentry Cloaked Targets with system_server hooks enabled."
            }
            activeCrashType == CrashType.NATIVE_CRASH -> {
                title = "Native Signal Crash (SIGSEGV/SIGABRT)"
                threatDiagnosis = "Process crashed in native C/C++ memory space."
                recommendedFix = "Inspect fault address and library offset in stack trace below."
            }
        }

        val summary = trace.lineSequence().take(4).joinToString("\n")

        val report = CrashThreatReport(
            id = crashIdGen.getAndIncrement(),
            timestamp = activeCrashTimestamp.ifEmpty { "Recent" },
            packageName = pkg,
            pid = activeCrashPid,
            type = activeCrashType,
            title = title,
            summary = summary,
            fullTrace = trace,
            threatDiagnosis = threatDiagnosis,
            recommendedFix = recommendedFix
        )

        addCrashReport(report)
        activeCrashPkg = null
        activeCrashPid = 0
    }

    private fun addCrashReport(report: CrashThreatReport) {
        val current = _crashReportsFlow.value
        _crashReportsFlow.value = listOf(report) + current.take(49)
    }

    fun exportLogsToFile(): File? {
        return try {
            val dir = File(context.cacheDir, "logs")
            if (!dir.exists()) dir.mkdirs()

            val file = File(dir, "causentry-forensic-${System.currentTimeMillis()}.txt")
            file.bufferedWriter().use { writer ->
                writer.appendLine("=== CAUSENTRY FORENSIC & CRASH LOG DUMP ===")
                writer.appendLine("Generated: ${java.util.Date()}")
                writer.appendLine("Total Entries: ${_logsFlow.value.size}")
                writer.appendLine("Total Crashes Recorded: ${_crashReportsFlow.value.size}")
                writer.appendLine()

                if (_crashReportsFlow.value.isNotEmpty()) {
                    writer.appendLine("--- DETECTED CRASHES & THREATS ---")
                    for (crash in _crashReportsFlow.value) {
                        writer.appendLine("[CRASH #${crash.id}] ${crash.timestamp} - ${crash.packageName} (PID ${crash.pid})")
                        writer.appendLine("Title: ${crash.title}")
                        if (crash.threatDiagnosis != null) {
                            writer.appendLine("Diagnosis: ${crash.threatDiagnosis}")
                            writer.appendLine("Recommendation: ${crash.recommendedFix}")
                        }
                        writer.appendLine("Stack Trace:")
                        writer.appendLine(crash.fullTrace)
                        writer.appendLine("--------------------------------------------------")
                    }
                    writer.appendLine()
                }

                writer.appendLine("--- LOGCAT STREAM ---")
                for (log in _logsFlow.value) {
                    writer.appendLine("${log.timestamp} ${log.pid} ${log.tid} ${log.level.letter} ${log.tag}: ${log.message}")
                }
            }
            file
        } catch (_: Exception) {
            null
        }
    }
}
