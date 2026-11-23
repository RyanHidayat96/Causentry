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
import androidx.compose.material3.MaterialTheme
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
import com.causentry.app.ui.theme.LocalCausentryColors

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LogItemRow(
    entry: LogEntry,
    searchQuery: String = "",
    compiledRegex: Regex? = null,
    isCompact: Boolean = false,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val context = LocalContext.current
    val clipboard = LocalClipboardManager.current
    val haptic = LocalHapticFeedback.current
    var isExpanded by remember { mutableStateOf(false) }

    val (badgeBg, badgeText) = when (entry.level) {
        LogLevel.VERBOSE -> ext.surfaceHigh to cs.onSurfaceVariant
        LogLevel.DEBUG -> cs.primary.copy(alpha = 0.18f) to cs.primary
        LogLevel.INFO -> ext.success.copy(alpha = 0.18f) to ext.success
        LogLevel.WARN -> ext.warning.copy(alpha = 0.22f) to ext.warning
        LogLevel.ERROR, LogLevel.FATAL -> ext.danger.copy(alpha = 0.22f) to ext.danger
    }

    val isError = entry.level == LogLevel.ERROR || entry.level == LogLevel.FATAL
    val baseMessageColor = if (isError) ext.danger else cs.onSurfaceVariant
    val highlightBg = if (compiledRegex != null) ext.warning.copy(alpha = 0.4f) else cs.primary.copy(alpha = 0.4f)

    val highlightedMessage = remember(entry.message, searchQuery, compiledRegex, highlightBg) {
        buildHighlightedLogText(entry.message, searchQuery, compiledRegex, highlightBg)
    }

    val highlightedTag = remember(entry.tag, searchQuery, compiledRegex, highlightBg) {
        buildHighlightedLogText(entry.tag, searchQuery, compiledRegex, highlightBg)
    }

    val copyFullLine = {
        haptic.performHapticFeedback(HapticFeedbackType.LongPress)
        val fullLine = "${entry.timestamp} ${entry.pid} ${entry.level.letter}/${entry.tag}: ${entry.message}"
        clipboard.setText(AnnotatedString(fullLine))
        Toast.makeText(context, "Log line copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    if (isCompact && !isExpanded) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 1.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(if (isError) ext.danger.copy(alpha = 0.08f) else Color.Transparent)
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
            Text(
                text = entry.timestamp.substringAfter(" "),
                color = cs.onSurfaceVariant.copy(alpha = 0.7f),
                fontSize = 10.sp,
                fontFamily = FontFamily.Monospace
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = highlightedTag,
                color = if (isError) ext.danger else cs.onSurface,
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                maxLines = 1
            )
            Spacer(modifier = Modifier.width(6.dp))
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

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 2.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(if (isError) ext.danger.copy(alpha = 0.08f) else cs.surface)
            .border(
                1.dp,
                if (isError) ext.danger.copy(alpha = 0.35f) else ext.border.copy(alpha = 0.55f),
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
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
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
                    Text(
                        text = highlightedTag,
                        color = if (isError) ext.danger else cs.onSurface,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(ext.surfaceHigh)
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "PID ${entry.pid}",
                        color = cs.onSurfaceVariant.copy(alpha = 0.85f),
                        fontSize = 10.sp,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " · ",
                        color = cs.onSurfaceVariant.copy(alpha = 0.5f),
                        fontSize = 10.sp
                    )
                    Text(
                        text = entry.timestamp.substringAfter(" "),
                        color = cs.onSurfaceVariant,
                        fontSize = 10.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

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
                    text = "tap to expand (${entry.message.lines().size} lines)…",
                    color = cs.primary.copy(alpha = 0.8f),
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
    compiledRegex: Regex?,
    highlightBg: Color
): AnnotatedString {
    val q = query.trim()
    if (q.isEmpty()) return AnnotatedString(text)

    return try {
        if (compiledRegex != null) {
            buildAnnotatedString {
                append(text)
                for (match in compiledRegex.findAll(text)) {
                    if (match.range.first <= match.range.last) {
                        addStyle(
                            SpanStyle(
                                background = highlightBg,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            ),
                            start = match.range.first,
                            end = match.range.last + 1
                        )
                    }
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
                            background = highlightBg,
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
