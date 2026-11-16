package com.causentry.app.data

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import com.causentry.app.MainActivity
import com.causentry.app.R
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.CrashType
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * LogFox-style proactive alerting. Surfaces crash / ANR / RASP-trigger events as system
 * notifications so the operator sees tamper or stability events even while the app is
 * backgrounded — without installing a separate log application.
 */
@Singleton
class ForensicNotifier @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    companion object {
        private const val CHANNEL_ALERTS = "forensic_alerts"
        private const val CHANNEL_RECORDING = "forensic_recording"
        private const val ID_RECORDING = 0x0C001
        private var nextAlertId = 0x0C100
    }

    init {
        createChannels()
    }

    private fun createChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val alerts = NotificationChannel(
                CHANNEL_ALERTS,
                "Forensic Alerts",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Crash, ANR and anti-tamper detection alerts from Causentry Forensics"
                enableVibration(true)
            }
            val recording = NotificationChannel(
                CHANNEL_RECORDING,
                "Log Recording",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Ongoing logcat session recording indicator"
                setShowBadge(false)
            }
            manager.createNotificationChannel(alerts)
            manager.createNotificationChannel(recording)
        }
    }

    private fun canPost(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            return context.checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) ==
                PackageManager.PERMISSION_GRANTED
        }
        return true
    }

    private fun openAppIntent(pkg: String?): PendingIntent {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            if (!pkg.isNullOrBlank()) putExtra("app", pkg)
        }
        return PendingIntent.getActivity(
            context,
            (pkg ?: "forensic").hashCode(),
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
    }

    /** Post a heads-up alert for a detected crash / ANR / RASP trigger. */
    fun notifyCrash(report: CrashThreatReport) {
        if (!canPost()) return
        val isAnr = report.type == CrashType.ANR
        val emoji = when (report.type) {
            CrashType.ANR -> "\u23F1\uFE0F" // stopwatch
            CrashType.NATIVE_CRASH -> "\uD83D\uDCA5" // collision
            CrashType.PROCESS_KILL -> "\u26A0\uFE0F" // warning
            CrashType.RASP_DETECTION -> "\uD83D\uDEE1\uFE0F" // shield
            CrashType.JAVA_CRASH -> "\uD83D\uDCA5"
        }
        val title = "$emoji ${if (isAnr) "ANR Detected" else "Crash Detected"}: ${report.packageName}"
        val body = buildString {
            append(report.title)
            report.threatDiagnosis?.let { append("\n").append(it) }
        }

        val builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Notification.Builder(context, CHANNEL_ALERTS)
        } else {
            @Suppress("DEPRECATION")
            Notification.Builder(context)
        }
        builder
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentTitle(title)
            .setContentText(report.title)
            .setStyle(Notification.BigTextStyle().bigText(body))
            .setContentIntent(openAppIntent(report.packageName))
            .setAutoCancel(true)
            .setCategory(Notification.CATEGORY_ERROR)
            .setOnlyAlertOnce(false)

        try {
            val id = nextAlertId++
            manager.notify(id, builder.build())
        } catch (_: Throwable) {}
    }

    /** Show/hide the ongoing recording indicator (mirrors LogFox's persistent record state). */
    fun showRecordingOngoing(count: Int) {
        if (!canPost()) return
        val builder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Notification.Builder(context, CHANNEL_RECORDING)
        } else {
            @Suppress("DEPRECATION")
            Notification.Builder(context)
        }
        builder
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentTitle("Recording logcat session")
            .setContentText("$count lines captured \u2014 tap to open Forensics")
            .setOngoing(true)
            .setOnlyAlertOnce(true)
            .setContentIntent(openAppIntent(null))
        try {
            manager.notify(ID_RECORDING, builder.build())
        } catch (_: Throwable) {}
    }

    fun cancelRecordingOngoing() {
        try { manager.cancel(ID_RECORDING) } catch (_: Throwable) {}
    }
}
