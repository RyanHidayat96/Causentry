package com.causentry.app.data

import android.content.Context
import android.os.Build
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.CrashType
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedOutputStream
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Lazy LogCat & Crash/RASP Threat Forensics engine.
 *
 * Zero background overhead: logcat subprocess runs ONLY while the Forensics screen is visible
 * OR an explicit recording session is active. Uses READ_LOGS directly (no `su` prompt).
 */
@Singleton
class ForensicManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val notifier: ForensicNotifier,
    private val userPreferences: UserPreferences
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val streamLock = Any()
    private var streamJob: Job? = null
    private var currentProcess: Process? = null
    private var screenVisible = false

    private val entryIdGen = AtomicLong(1)
    private val crashIdGen = AtomicLong(1)

    private val maxBufferEntries = 5000
    private val ringBuffer = ArrayDeque<LogEntry>(maxBufferEntries + 128)
    private val bufferLock = Any()

    private val _logsFlow = MutableStateFlow<List<LogEntry>>(emptyList())
    val logsFlow: StateFlow<List<LogEntry>> = _logsFlow.asStateFlow()

    private val _crashReportsFlow = MutableStateFlow<List<CrashThreatReport>>(emptyList())
    val crashReportsFlow: StateFlow<List<CrashThreatReport>> = _crashReportsFlow.asStateFlow()

    val isLiveStreaming: StateFlow<Boolean> = userPreferences.forensicsLiveStreaming

    private val _isRecording = MutableStateFlow(false)
    val isRecording: StateFlow<Boolean> = _isRecording.asStateFlow()

    private val _recordedCount = MutableStateFlow(0)
    val recordedCount: StateFlow<Int> = _recordedCount.asStateFlow()

    private val pidToPackage = ConcurrentHashMap<Int, String>()

    private var activeCrashTrace = StringBuilder()
    private var activeCrashPkg: String? = null
    private var activeCrashPid = 0
    private var activeCrashTimestamp = ""
    private var activeCrashType = CrashType.JAVA_CRASH
    private var activeCrashLastTime = 0L

    private val recordLock = Any()
    private var recordWriter: BufferedWriter? = null
    private var sessionFile: File? = null
    private var sessionCrashes = mutableListOf<CrashThreatReport>()

    fun setScreenActive(active: Boolean) {
        synchronized(streamLock) {
            screenVisible = active
            reconcileStreamLocked()
        }
    }

    private fun reconcileStreamLocked() {
        val shouldRun = (screenVisible && isLiveStreaming.value) || _isRecording.value
        if (shouldRun) {
            if (streamJob?.isActive != true) {
                preloadRunningProcesses()
                streamJob = scope.launch { runLogcatLoop() }
            }
        } else {
            streamJob?.cancel()
            streamJob = null
            try { currentProcess?.destroy() } catch (_: Throwable) {}
            currentProcess = null
        }
    }

    private fun preloadRunningProcesses() {
        try {
            val am = context.getSystemService(Context.ACTIVITY_SERVICE) as? android.app.ActivityManager
            val running = am?.runningAppProcesses ?: return
            for (proc in running) {
                if (proc.pkgList != null && proc.pkgList.isNotEmpty()) {
                    pidToPackage[proc.pid] = proc.pkgList[0]
                } else if (proc.processName != null) {
                    pidToPackage[proc.pid] = proc.processName.split(":")[0]
                }
            }
        } catch (_: Throwable) {}
    }

    fun isPidForPackage(pid: Int, packageName: String): Boolean {
        val cached = pidToPackage[pid] ?: return false
        return cached.equals(packageName, ignoreCase = true) || cached.startsWith("$packageName:")
    }

    fun toggleLiveStreaming() {
        synchronized(streamLock) {
            userPreferences.setForensicsLiveStreaming(!isLiveStreaming.value)
            reconcileStreamLocked()
        }
    }

    fun clearLogs() {
        synchronized(bufferLock) {
            ringBuffer.clear()
        }
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
                // Directly invoke logcat using granted READ_LOGS permission (no `su` prompt)
                val proc = ProcessBuilder("logcat", "-v", "threadtime", "-b", "main", "-b", "system", "-b", "crash", "-T", "250")
                    .redirectErrorStream(true)
                    .start()

                currentProcess = proc
                val reader = BufferedReader(InputStreamReader(proc.inputStream, Charsets.UTF_8))
                val batchList = ArrayList<LogEntry>(64)
                var lastBatchEmit = System.currentTimeMillis()

                var line: String? = null
                while (isActive && reader.readLine().also { line = it } != null) {
                    val currentLine = line ?: continue
                    val entry = parseLogLine(currentLine)
                    if (entry != null) {
                        detectThreatsAndCrashes(entry)
                        if (isLiveStreaming.value) {
                            batchList.add(entry)
                        }
                        if (_isRecording.value) {
                            appendToRecord(entry)
                        }
                    }

                    val now = System.currentTimeMillis()
                    if (batchList.size >= 60 || (now - lastBatchEmit > 180 && batchList.isNotEmpty())) {
                        val snapshot = synchronized(bufferLock) {
                            for (e in batchList) {
                                if (ringBuffer.size >= maxBufferEntries) {
                                    ringBuffer.removeFirst()
                                }
                                ringBuffer.addLast(e)
                            }
                            ArrayList(ringBuffer)
                        }
                        _logsFlow.value = snapshot
                        batchList.clear()
                        lastBatchEmit = now
                    }
                }
            } catch (_: Exception) {
                delay(2000)
            } finally {
                try { currentProcess?.destroy() } catch (_: Throwable) {}
                currentProcess = null
            }
        }
    }

    private fun parseLogLine(raw: String): LogEntry? {
        val parsedJson = com.causentry.app.core.CausentryRustBridge.parseLogcatLine(raw)
        if (parsedJson.isEmpty()) return null
        return try {
            val obj = org.json.JSONObject(parsedJson)
            val ts = obj.optString("ts", "")
            val pid = obj.optInt("pid", 0)
            val tid = obj.optInt("tid", 0)
            val lvlChar = obj.optString("lvl", "I")
            val tag = obj.optString("tag", "")
            val msg = obj.optString("msg", "")
            val hintPid = obj.optInt("hintPid", 0)
            val hintPkg = obj.optString("hintPkg", "")
            if (hintPid > 0 && hintPkg.isNotEmpty()) {
                pidToPackage[hintPid] = hintPkg
            }
            val level = when (lvlChar) {
                "V" -> LogLevel.VERBOSE
                "D" -> LogLevel.DEBUG
                "I" -> LogLevel.INFO
                "W" -> LogLevel.WARN
                "E" -> LogLevel.ERROR
                "F" -> LogLevel.FATAL
                else -> LogLevel.INFO
            }
            LogEntry(
                id = entryIdGen.getAndIncrement(),
                timestamp = ts,
                pid = pid,
                tid = tid,
                level = level,
                tag = tag,
                message = msg,
                packageName = pidToPackage[pid]
            )
        } catch (_: Throwable) {
            null
        }
    }

    private fun detectThreatsAndCrashes(entry: LogEntry) {
        val tag = entry.tag
        val msg = entry.message
        val now = System.currentTimeMillis()

        if (activeCrashTrace.isNotEmpty() && activeCrashLastTime > 0 && now - activeCrashLastTime > 1500) {
            commitActiveCrash()
        }

        if (tag == "AndroidRuntime" && msg.contains("FATAL EXCEPTION:")) {
            commitActiveCrash()
            activeCrashTrace.clear()
            activeCrashTrace.appendLine(msg)
            activeCrashTimestamp = entry.timestamp
            activeCrashPid = entry.pid
            activeCrashLastTime = now
            activeCrashType = CrashType.JAVA_CRASH
            val procIdx = msg.indexOf("Process: ")
            if (procIdx >= 0) {
                val procSub = msg.substring(procIdx + 9).split(",")[0].trim()
                activeCrashPkg = procSub
                pidToPackage[entry.pid] = procSub
            }
            return
        }

        if (tag == "AndroidRuntime" && activeCrashTrace.isNotEmpty() && activeCrashPid == entry.pid) {
            activeCrashTrace.appendLine(msg)
            activeCrashLastTime = now
            if (msg.contains("Process: ")) {
                val sub = msg.substringAfter("Process: ").substringBefore(",").trim()
                activeCrashPkg = sub
                pidToPackage[entry.pid] = sub
            }
            if (activeCrashTrace.length > 15000) commitActiveCrash()
            return
        }

        if (tag == "DEBUG" && (msg.contains("*** *** ***") || msg.contains("signal 11 (SIGSEGV)") || msg.contains("signal 6 (SIGABRT)"))) {
            commitActiveCrash()
            activeCrashTrace.clear()
            activeCrashTrace.appendLine(msg)
            activeCrashTimestamp = entry.timestamp
            activeCrashPid = entry.pid
            activeCrashLastTime = now
            activeCrashType = CrashType.NATIVE_CRASH
            activeCrashPkg = pidToPackage[entry.pid]
            return
        }

        if (tag == "DEBUG" && activeCrashTrace.isNotEmpty() && activeCrashType == CrashType.NATIVE_CRASH) {
            activeCrashTrace.appendLine(msg)
            activeCrashLastTime = now
            return
        }

        if (tag == "ActivityManager" && msg.contains("ANR in ")) {
            val pkg = msg.substringAfter("ANR in ").substringBefore(" ").substringBefore("/").trim()
            addCrashReport(
                CrashThreatReport(
                    id = crashIdGen.getAndIncrement(),
                    timestamp = entry.timestamp,
                    packageName = pkg.ifEmpty { "unknown" },
                    pid = entry.pid,
                    type = CrashType.ANR,
                    title = "Application Not Responding (ANR)",
                    summary = msg,
                    fullTrace = msg,
                    threatDiagnosis = "Main thread blocked by prolonged execution or security probe.",
                    recommendedFix = "Inspect hook latency or disable App-Zygote demotion for this app."
                )
            )
            return
        }

        if (tag == "ActivityManager") {
            if (activeCrashTrace.isNotEmpty() && activeCrashPid > 0 && msg.contains("pid $activeCrashPid")) {
                commitActiveCrash()
            } else if (msg.contains("has died")) {
                val procPart = msg.substringAfter("Process ").substringBefore(" ")
                val pidPart = msg.substringAfter("(pid ").substringBefore(")").toIntOrNull() ?: 0
                val reason = msg.substringAfter("has died: ", "terminated")
                if (procPart.contains(".") && !procPart.startsWith("com.android.") && !procPart.startsWith("android.")) {
                    val alreadyReported = _crashReportsFlow.value.any {
                        it.packageName == procPart && (pidPart == 0 || it.pid == pidPart)
                    }
                    if (!alreadyReported) {
                        addCrashReport(
                            CrashThreatReport(
                                id = crashIdGen.getAndIncrement(),
                                timestamp = entry.timestamp,
                                packageName = procPart,
                                pid = pidPart,
                                type = CrashType.PROCESS_KILL,
                                title = "Process Terminated (Silent / RASP Exit)",
                                summary = "Process $procPart (PID $pidPart) died: $reason",
                                fullTrace = msg,
                                threatDiagnosis = "Process exited without an uncaught Java exception (often RASP self-exit or OOM kill).",
                                recommendedFix = "Check package cloak template and verify App-Zygote demotion compatibility."
                            )
                        )
                    }
                }
            }
        }
    }

    private fun commitActiveCrash() {
        if (activeCrashTrace.isEmpty()) return
        val trace = activeCrashTrace.toString().trim()
        activeCrashTrace.clear()
        val pkg = activeCrashPkg ?: pidToPackage[activeCrashPid] ?: "unknown"

        val classified = org.json.JSONObject(
            com.causentry.app.core.CausentryRustBridge.classifyCrashTrace(trace, pkg, activeCrashType.name)
        )
        val title = classified.optString("title", "App Crash (FATAL EXCEPTION)")
        val threatDiagnosis = classified.optString("diagnosis", "").ifEmpty { null }
        val recommendedFix = classified.optString("fix", "").ifEmpty { null }

        addCrashReport(
            CrashThreatReport(
                id = crashIdGen.getAndIncrement(),
                timestamp = activeCrashTimestamp.ifEmpty { "Recent" },
                packageName = pkg,
                pid = activeCrashPid,
                type = activeCrashType,
                title = title,
                summary = trace.lineSequence().take(4).joinToString("\n"),
                fullTrace = trace,
                threatDiagnosis = threatDiagnosis,
                recommendedFix = recommendedFix
            )
        )
        activeCrashPkg = null
        activeCrashPid = 0
        activeCrashLastTime = 0L
    }

    private fun addCrashReport(report: CrashThreatReport) {
        _crashReportsFlow.value = listOf(report) + _crashReportsFlow.value.take(49)
        try { notifier.notifyCrash(report) } catch (_: Throwable) {}
        synchronized(recordLock) {
            if (_isRecording.value) sessionCrashes.add(report)
        }
    }

    fun startRecording(): Boolean {
        val started = synchronized(recordLock) {
            if (_isRecording.value) return true
            try {
                val dir = File(context.cacheDir, "logs")
                if (!dir.exists()) dir.mkdirs()
                val file = File(dir, "causentry-session-${timestampForFile()}.log")
                val writer = BufferedWriter(OutputStreamWriter(FileOutputStream(file), Charsets.UTF_8), 32 * 1024)
                writer.appendLine("# Causentry Forensic Session Recording")
                writer.appendLine("# Started: ${SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date())}")
                writer.appendLine()
                sessionFile = file
                recordWriter = writer
                sessionCrashes = mutableListOf()
                _recordedCount.value = 0
                _isRecording.value = true
                try { notifier.showRecordingOngoing(0) } catch (_: Throwable) {}
                true
            } catch (_: Throwable) {
                recordWriter = null
                sessionFile = null
                false
            }
        }
        if (started) {
            synchronized(streamLock) { reconcileStreamLocked() }
        }
        return started
    }

    fun stopRecording(): File? {
        val file = synchronized(recordLock) {
            val f = sessionFile
            try {
                recordWriter?.flush()
                recordWriter?.close()
            } catch (_: Throwable) {}
            recordWriter = null
            _isRecording.value = false
            try { notifier.cancelRecordingOngoing() } catch (_: Throwable) {}
            f
        }
        synchronized(streamLock) { reconcileStreamLocked() }
        return file
    }

    fun toggleRecording(): Boolean =
        if (_isRecording.value) { stopRecording(); false } else { startRecording(); _isRecording.value }

    private fun appendToRecord(entry: LogEntry) {
        synchronized(recordLock) {
            val writer = recordWriter ?: return
            try {
                writer.append(entry.timestamp).append(' ')
                    .append(entry.pid.toString()).append(' ')
                    .append(entry.tid.toString()).append(' ')
                    .append(entry.level.letter).append(' ')
                    .append(entry.tag).append(": ")
                    .append(entry.message).append('\n')
                val c = _recordedCount.value + 1
                _recordedCount.value = c
                if (c % 200 == 0) writer.flush()
                if (c % 500 == 0) {
                    try { notifier.showRecordingOngoing(c) } catch (_: Throwable) {}
                }
            } catch (_: Throwable) {}
        }
    }

    private fun timestampForFile(): String =
        SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(Date())

    private fun collectDeviceInfo(): String = buildString {
        appendLine("Manufacturer: ${Build.MANUFACTURER}")
        appendLine("Model: ${Build.MODEL}")
        appendLine("Device: ${Build.DEVICE}")
        appendLine("Android: ${Build.VERSION.RELEASE} (SDK ${Build.VERSION.SDK_INT})")
        appendLine("Fingerprint: ${Build.FINGERPRINT}")
        appendLine("ABIs: ${Build.SUPPORTED_ABIS.joinToString(", ")}")
        appendLine("Kernel: ${System.getProperty("os.version") ?: "unknown"}")
        appendLine("Exported: ${SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date())}")
    }

    private fun buildCrashDigest(crashes: List<CrashThreatReport>): String = buildString {
        appendLine("=== CAUSENTRY CRASH & THREAT REPORT ===")
        appendLine("Total: ${crashes.size}")
        appendLine()
        for (c in crashes) {
            appendLine("[#${c.id}] ${c.timestamp} - ${c.packageName} (PID ${c.pid}) [${c.type}]")
            appendLine("Title: ${c.title}")
            c.threatDiagnosis?.let { appendLine("Diagnosis: $it") }
            c.recommendedFix?.let { appendLine("Fix: $it") }
            appendLine(c.fullTrace)
            appendLine("--------------------------------------------------")
        }
    }

    fun exportSessionZip(): File? {
        return try {
            val rawFile: File?
            var crashes: List<CrashThreatReport>
            synchronized(recordLock) {
                if (_isRecording.value) {
                    try { recordWriter?.flush() } catch (_: Throwable) {}
                }
                rawFile = sessionFile
                crashes = sessionCrashes.toList()
            }

            val logText = if (rawFile != null && rawFile.exists()) {
                rawFile.readText()
            } else {
                buildString {
                    for (l in _logsFlow.value) {
                        appendLine("${l.timestamp} ${l.pid} ${l.tid} ${l.level.letter} ${l.tag}: ${l.message}")
                    }
                }
            }
            if (crashes.isEmpty()) crashes = _crashReportsFlow.value

            val dir = File(context.cacheDir, "logs")
            if (!dir.exists()) dir.mkdirs()
            val zipFile = File(dir, "causentry-forensic-${timestampForFile()}.zip")

            ZipOutputStream(BufferedOutputStream(FileOutputStream(zipFile))).use { zip ->
                fun put(name: String, content: String) {
                    zip.putNextEntry(ZipEntry(name))
                    zip.write(content.toByteArray(Charsets.UTF_8))
                    zip.closeEntry()
                }
                put("logs.txt", logText)
                put("crashes.txt", buildCrashDigest(crashes))
                put("device-info.txt", collectDeviceInfo())
            }
            zipFile
        } catch (_: Throwable) {
            null
        }
    }

    fun exportLogsToFile(): File? = exportSessionZip()
}
