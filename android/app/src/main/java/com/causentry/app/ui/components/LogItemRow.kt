package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

@Composable
fun LogItemRow(
    entry: LogEntry,
    modifier: Modifier = Modifier
) {
    val clipboard = LocalClipboardManager.current
    val haptic = LocalHapticFeedback.current

    val (badgeBg, badgeText) = when (entry.level) {
        LogLevel.VERBOSE -> Color.DarkGray.copy(alpha = 0.5f) to TextSecondary
        LogLevel.DEBUG -> PrimaryBlue.copy(alpha = 0.2f) to PrimaryBlue
        LogLevel.INFO -> SuccessGreen.copy(alpha = 0.2f) to SuccessGreen
        LogLevel.WARN -> WarningAmber.copy(alpha = 0.2f) to WarningAmber
        LogLevel.ERROR, LogLevel.FATAL -> DangerRed.copy(alpha = 0.25f) to DangerRed
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                val fullLine = "${entry.timestamp} ${entry.pid} ${entry.level.letter}/${entry.tag}: ${entry.message}"
                clipboard.setText(AnnotatedString(fullLine))
            }
            .padding(horizontal = 14.dp, vertical = 4.dp),
        verticalAlignment = Alignment.Top
    ) {
        // Log Level indicator
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(badgeBg)
                .padding(horizontal = 5.dp, vertical = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = entry.level.letter,
                color = badgeText,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.weight(1f)) {
            // Header row: Tag and PID/Time
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = entry.tag,
                    color = if (entry.level == LogLevel.ERROR || entry.level == LogLevel.FATAL) DangerRed else TextPrimary,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text(
                    text = "PID ${entry.pid} • ${entry.timestamp.substringAfter(" ")}",
                    color = TextSecondary.copy(alpha = 0.7f),
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Monospace
                )
            }

            Text(
                text = entry.message,
                color = if (entry.level == LogLevel.ERROR || entry.level == LogLevel.FATAL) Color(0xFFFF8080) else TextSecondary,
                fontSize = 11.sp,
                fontFamily = FontFamily.Monospace,
                lineHeight = 15.sp
            )
        }
    }
}
