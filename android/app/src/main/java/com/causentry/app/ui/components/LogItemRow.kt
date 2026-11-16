package com.causentry.app.ui.components

import android.widget.Toast
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LogItemRow(
    entry: LogEntry,
    searchQuery: String = "",
    regexMode: Boolean = false,
    isCompact: Boolean = false,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val clipboard = LocalClipboardManager.current
    val haptic = LocalHapticFeedback.current
    var isExpanded by remember { mutableStateOf(false) }

    val (badgeBg, badgeText) = when (entry.level) {
        LogLevel.VERBOSE -> Color(0xFF22262B) to TextSecondary
        LogLevel.DEBUG -> PrimaryBlue.copy(alpha = 0.18f) to PrimaryBlue
        LogLevel.INFO -> SuccessGreen.copy(alpha = 0.18f) to SuccessGreen
        LogLevel.WARN -> WarningAmber.copy(alpha = 0.22f) to WarningAmber
        LogLevel.ERROR, LogLevel.FATAL -> DangerRed.copy(alpha = 0.25f) to DangerRed
    }

    val isError = entry.level == LogLevel.ERROR || entry.level == LogLevel.FATAL
    val baseMessageColor = if (isError) Color(0xFFFF9494) else TextSecondary

    val highlightedMessage = remember(entry.message, searchQuery, regexMode) {
        buildHighlightedLogText(entry.message, searchQuery, regexMode, baseMessageColor)
    }

    val highlightedTag = remember(entry.tag, searchQuery, regexMode) {
        buildHighlightedLogText(entry.tag, searchQuery, regexMode, if (isError) DangerRed else TextPrimary)
    }

    val copyFullLine = {
        haptic.performHapticFeedback(HapticFeedbackType.LongPress)
        val fullLine = "${entry.timestamp} ${entry.pid} ${entry.level.letter}/${entry.tag}: ${entry.message}"
        clipboard.setText(AnnotatedString(fullLine))
        Toast.makeText(context, "Log line copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    // --- Compact Terminal Mode (When not expanded) ---
    if (isCompact && !isExpanded) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 1.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(if (isError) DangerRed.copy(alpha = 0.08f) else Color.Transparent)
                .combinedClickable(
                    onClick = {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        isExpanded = true
                    },
                    onLongClick = copyFullLine
                )
                .padding(horizontal = 6.dp, vertical = 2.5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Level badge letter
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clip(RoundedCornerShape(3.dp))
                    .background(badgeBg),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = entry.level.letter,
                    color = badgeText,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Monospace
                )
            }

            Spacer(modifier = Modifier.width(6.dp))

            // Time
            Text(
                text = entry.timestamp.substringAfter(" "),
                color = TextSecondary.copy(alpha = 0.7f),
                fontSize = 10.sp,
                fontFamily = FontFamily.Monospace
            )

            Spacer(modifier = Modifier.width(6.dp))

            // Tag
            Text(
                text = highlightedTag,
                color = if (isError) DangerRed else TextPrimary,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                maxLines = 1
            )

            Spacer(modifier = Modifier.width(6.dp))

            // Single line message preview
            Text(
                text = highlightedMessage,
                color = baseMessageColor,
                fontSize = 10.sp,
                fontFamily = FontFamily.Monospace,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f)
            )
        }
        return
    }

    // --- Detailed Card Mode (or Compact mode when expanded) ---
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(if (isError) DangerRed.copy(alpha = 0.08f) else SurfaceDark.copy(alpha = 0.85f))
            .border(
                1.dp,
                if (isError) DangerRed.copy(alpha = 0.35f) else BorderDark.copy(alpha = 0.45f),
                RoundedCornerShape(8.dp)
            )
            .combinedClickable(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    isExpanded = !isExpanded
                },
                onLongClick = copyFullLine
            )
            .padding(horizontal = 10.dp, vertical = 7.dp)
            .animateContentSize()
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            // Header: Level Badge, Tag, and Metadata (PID, Time)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    // Level Badge
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

                    Spacer(modifier = Modifier.width(6.dp))

                    // Tag
                    Text(
                        text = highlightedTag,
                        color = if (isError) DangerRed else TextPrimary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Time & PID Metadata
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(SurfaceHighDark)
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "PID ${entry.pid}",
                        color = TextSecondary.copy(alpha = 0.8f),
                        fontSize = 10.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " • ",
                        color = TextSecondary.copy(alpha = 0.4f),
                        fontSize = 10.sp
                    )
                    Text(
                        text = entry.timestamp.substringAfter(" "),
                        color = TextSecondary,
                        fontSize = 10.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            // Body Message
            if (isExpanded) {
                SelectionContainer {
                    Text(
                        text = highlightedMessage,
                        color = baseMessageColor,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        lineHeight = 15.sp
                    )
                }
            } else {
                Text(
                    text = highlightedMessage,
                    color = baseMessageColor,
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace,
                    lineHeight = 15.sp,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }

            if (!isExpanded && entry.message.count { it == '\n' } > 2) {
                Text(
                    text = "tap to expand (${entry.message.lines().size} lines)...",
                    color = PrimaryBlue.copy(alpha = 0.7f),
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
        }
    }
}

private fun buildHighlightedLogText(
    text: String,
    query: String,
    isRegex: Boolean,
    baseColor: Color
): AnnotatedString {
    val q = query.trim()
    if (q.isEmpty()) {
        return AnnotatedString(text)
    }

    return try {
        if (isRegex) {
            val regex = Regex(q, RegexOption.IGNORE_CASE)
            buildAnnotatedString {
                append(text)
                for (match in regex.findAll(text)) {
                    addStyle(
                        SpanStyle(
                            background = WarningAmber.copy(alpha = 0.4f),
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        ),
                        start = match.range.first,
                        end = match.range.last + 1
                    )
                }
            }
        } else {
            val lowerText = text.lowercase()
            val lowerQ = q.lowercase()
            buildAnnotatedString {
                append(text)
                var start = 0
                while (start < text.length) {
                    val idx = lowerText.indexOf(lowerQ, start)
                    if (idx == -1) break
                    addStyle(
                        SpanStyle(
                            background = PrimaryBlue.copy(alpha = 0.45f),
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        ),
                        start = idx,
                        end = idx + lowerQ.length
                    )
                    start = idx + lowerQ.length
                }
            }
        }
    } catch (_: Exception) {
        AnnotatedString(text)
    }
}
