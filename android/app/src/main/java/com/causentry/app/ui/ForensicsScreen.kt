package com.causentry.app.ui

import android.content.Intent
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.core.content.FileProvider
import com.causentry.app.R
import com.causentry.app.model.AppInfo
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import com.causentry.app.ui.components.ForensicAppPickerDialog
import com.causentry.app.ui.components.LogItemRow
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber
import kotlinx.coroutines.launch
import java.io.File

@Composable
fun ForensicsScreen(
    logs: List<LogEntry>,
    crashReports: List<CrashThreatReport>,
    allApps: List<AppInfo>,
    iconLoader: com.causentry.app.data.IconLoader,
    isStreaming: Boolean,
    isRecording: Boolean,
    recordedCount: Int,
    searchQuery: String,
    tagFilter: String,
    pidFilter: String,
    regexMode: Boolean,
    regexError: String?,
    selectedPackage: String?,
    selectedLevel: LogLevel?,
    onToggleStream: () -> Unit,
    onToggleRecording: () -> Unit,
    onClearLogs: () -> Unit,
    onClearCrashes: () -> Unit,
    onDismissCrash: (Long) -> Unit,
    onSelectPackage: (String?) -> Unit,
    onSelectLevel: (LogLevel?) -> Unit,
    onSearchQueryChange: (String) -> Unit,
    onTagFilterChange: (String) -> Unit,
    onPidFilterChange: (String) -> Unit,
    onToggleRegexMode: () -> Unit,
    onResetFilters: () -> Unit,
    onExportZip: (() -> File?)?,
    onExportLogs: () -> File?,
    onInspectApp: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    val haptic = LocalHapticFeedback.current

    var showAppPickerDialog by remember { mutableStateOf(false) }
    var showAdvanced by remember { mutableStateOf(false) }
    var isCompactMode by remember { mutableStateOf(false) }

    val selectedApp = remember(selectedPackage, allApps) {
        allApps.find { it.packageName == selectedPackage }
    }
    val hasAdvancedFilter = tagFilter.isNotBlank() || pidFilter.isNotBlank() || regexMode
    val hasActiveFilter = selectedPackage != null || selectedLevel != null ||
        searchQuery.isNotBlank() || hasAdvancedFilter

    // --- Auto-Scroll Engine (reverseLayout: index 0 = newest log at bottom) ---
    val isDragged by listState.interactionSource.collectIsDraggedAsState()
    var autoScrollEnabled by remember { mutableStateOf(true) }
    var pauseAnchorLogId by remember { mutableLongStateOf(0L) }

    // When filter changes, reset pause anchor if paused
    LaunchedEffect(searchQuery, tagFilter, pidFilter, regexMode, selectedPackage, selectedLevel) {
        if (!autoScrollEnabled) {
            pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
        }
    }

    // When user touches/scrolls the list: pause auto-scroll so the screen stays at user's reading position
    LaunchedEffect(listState.interactionSource) {
        listState.interactionSource.interactions.collect { interaction ->
            if (interaction is androidx.compose.foundation.interaction.DragInteraction.Start) {
                if (autoScrollEnabled) {
                    autoScrollEnabled = false
                    pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
                }
            }
        }
    }
    LaunchedEffect(isDragged) {
        if (isDragged && autoScrollEnabled) {
            autoScrollEnabled = false
            pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
        }
    }

    // Unread count badge: new logs that arrived in real-time while auto-scroll is paused
    val unreadCount = remember(logs, autoScrollEnabled, pauseAnchorLogId) {
        if (!autoScrollEnabled && pauseAnchorLogId > 0L) {
            logs.count { it.id > pauseAnchorLogId }
        } else 0
    }

    // Live auto-scroll: when autoScrollEnabled is true and isStreaming is true, stay pinned to index 0 (newest log at bottom)
    LaunchedEffect(autoScrollEnabled, logs.lastOrNull()?.id, isStreaming) {
        if (isStreaming && autoScrollEnabled && logs.isNotEmpty()) {
            listState.scrollToItem(0)
        }
    }

    // Reversed list for reverseLayout: Index 0 is the newest log, rendered at the bottom edge.
    // Logs continuously stream and capture in real time without stopping.
    val reversedLogs = remember(logs) { logs.asReversed() }

    if (showAppPickerDialog) {
        ForensicAppPickerDialog(
            allApps = allApps,
            currentPackage = selectedPackage,
            iconLoader = iconLoader,
            onSelectPackage = { pkg ->
                onSelectPackage(pkg)
                showAppPickerDialog = false
            },
            onDismiss = { showAppPickerDialog = false }
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.2f))
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Control & Filter Header Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                // Search Input Field & Quick Action Buttons (Pause/Resume, Compact Mode, Clear, Export)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Search bar
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .height(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(SurfaceDark)
                            .border(1.dp, if (regexError != null) DangerRed.copy(alpha = 0.6f) else BorderDark, RoundedCornerShape(9.dp))
                            .padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null,
                            tint = TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Box(
                            modifier = Modifier.weight(1f),
                            contentAlignment = Alignment.CenterStart
                        ) {
                            if (searchQuery.isEmpty()) {
                                Text(
                                    text = if (regexMode) "Regex pattern…" else "Search logs, tags…",
                                    color = TextSecondary.copy(alpha = 0.6f),
                                    fontSize = 12.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                            BasicTextField(
                                value = searchQuery,
                                onValueChange = onSearchQueryChange,
                                singleLine = true,
                                textStyle = TextStyle(
                                    color = TextPrimary,
                                    fontSize = 12.sp,
                                    fontFamily = if (regexMode) FontFamily.Monospace else FontFamily.Default
                                ),
                                cursorBrush = SolidColor(PrimaryBlue),
                                modifier = Modifier.fillMaxWidth()
                            )
                        }

                        // Regex toggle (.*)
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(if (regexMode) PrimaryBlue.copy(alpha = 0.22f) else Color.Transparent)
                                .border(1.dp, if (regexMode) PrimaryBlue.copy(alpha = 0.5f) else Color.Transparent, RoundedCornerShape(6.dp))
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    onToggleRegexMode()
                                }
                                .padding(horizontal = 6.dp, vertical = 3.dp)
                        ) {
                            Text(
                                text = ".*",
                                color = if (regexMode) PrimaryBlue else TextSecondary,
                                fontSize = 12.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        if (searchQuery.isNotEmpty()) {
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .clickable { onSearchQueryChange("") },
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_close),
                                    contentDescription = "Clear search",
                                    tint = TextSecondary,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }

                    // Play/Pause button
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(SurfaceDark)
                            .border(1.dp, if (isStreaming) WarningAmber.copy(alpha = 0.5f) else SuccessGreen.copy(alpha = 0.5f), RoundedCornerShape(9.dp))
                            .clickable {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                onToggleStream()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = if (isStreaming) R.drawable.ic_pause else R.drawable.ic_play),
                            contentDescription = if (isStreaming) "Pause Stream" else "Resume Stream",
                            tint = if (isStreaming) WarningAmber else SuccessGreen,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    // Compact mode toggle (<>)
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(if (isCompactMode) PrimaryBlue.copy(alpha = 0.2f) else SurfaceDark)
                            .border(1.dp, if (isCompactMode) PrimaryBlue else BorderDark, RoundedCornerShape(9.dp))
                            .clickable {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                isCompactMode = !isCompactMode
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_code),
                            contentDescription = if (isCompactMode) "Detailed Card Mode" else "Compact Terminal Mode",
                            tint = if (isCompactMode) PrimaryBlue else TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    // Clear logs button (Trash)
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(SurfaceDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(9.dp))
                            .clickable {
                                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                onClearLogs()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_delete),
                            contentDescription = "Clear Logs",
                            tint = TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    // Export logs button (Download)
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(9.dp))
                            .background(SurfaceDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(9.dp))
                            .clickable {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                val exporter = onExportZip ?: onExportLogs
                                val file = exporter()
                                if (file != null) {
                                    try {
                                        val uri = FileProvider.getUriForFile(
                                            context,
                                            "${context.packageName}.fileprovider",
                                            file
                                        )
                                        val mime = if (file.extension.equals("zip", true)) "application/zip" else "text/plain"
                                        val intent = Intent(Intent.ACTION_SEND).apply {
                                            type = mime
                                            putExtra(Intent.EXTRA_STREAM, uri)
                                            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                        }
                                        context.startActivity(Intent.createChooser(intent, "Share Forensic Log"))
                                    } catch (_: Exception) {
                                        Toast.makeText(context, "Exported to: ${file.absolutePath}", Toast.LENGTH_LONG).show()
                                    }
                                } else {
                                    Toast.makeText(context, "Failed to export", Toast.LENGTH_SHORT).show()
                                }
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_download),
                            contentDescription = "Export ZIP",
                            tint = PrimaryBlue,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }

                // Regex error hint
                if (regexError != null) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "⚠ Invalid regex: $regexError",
                        color = DangerRed,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(horizontal = 4.dp)
                    )
                }

                // Row 2b: Advanced filters (Tag / PID)
                AnimatedVisibility(visible = showAdvanced) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp),
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CompactFilterField(
                            value = tagFilter,
                            placeholder = "Tag filter",
                            onChange = onTagFilterChange,
                            modifier = Modifier.weight(1f)
                        )
                        CompactFilterField(
                            value = pidFilter,
                            placeholder = "PID",
                            onChange = onPidFilterChange,
                            modifier = Modifier.width(96.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Row 3: Horizontal Filter Chips
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // App Selector Chip
                    FilterChip(
                        selected = selectedPackage != null,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            showAppPickerDialog = true
                        },
                        label = {
                            Text(
                                text = if (selectedApp != null) "App: ${selectedApp.label}" else if (selectedPackage != null) "App: $selectedPackage" else "All Apps ▾",
                                fontSize = 11.sp,
                                fontWeight = if (selectedPackage != null) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        },
                        trailingIcon = if (selectedPackage != null) {
                            {
                                Text(
                                    text = "✕",
                                    color = PrimaryBlue,
                                    fontSize = 10.sp,
                                    modifier = Modifier
                                        .clickable { onSelectPackage(null) }
                                        .padding(horizontal = 2.dp)
                                )
                            }
                        } else null,
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryBlue.copy(alpha = 0.2f),
                            selectedLabelColor = PrimaryBlue,
                            containerColor = SurfaceDark,
                            labelColor = TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedPackage != null,
                            borderColor = if (selectedPackage != null) PrimaryBlue else BorderDark
                        ),
                        modifier = Modifier.height(32.dp)
                    )

                    // Level Filter Chips (All, Debug+, Info+, Warn+, Error)
                    LevelChip(
                        label = "All",
                        selected = selectedLevel == null,
                        onClick = { onSelectLevel(null) }
                    )
                    LevelChip(
                        label = "Debug+",
                        selected = selectedLevel == LogLevel.DEBUG,
                        activeColor = PrimaryBlue,
                        onClick = { onSelectLevel(if (selectedLevel == LogLevel.DEBUG) null else LogLevel.DEBUG) }
                    )
                    LevelChip(
                        label = "Info+",
                        selected = selectedLevel == LogLevel.INFO,
                        activeColor = SuccessGreen,
                        onClick = { onSelectLevel(if (selectedLevel == LogLevel.INFO) null else LogLevel.INFO) }
                    )
                    LevelChip(
                        label = "Warn+",
                        selected = selectedLevel == LogLevel.WARN,
                        activeColor = WarningAmber,
                        onClick = { onSelectLevel(if (selectedLevel == LogLevel.WARN) null else LogLevel.WARN) }
                    )
                    LevelChip(
                        label = "Error & Crash",
                        selected = selectedLevel == LogLevel.ERROR,
                        activeColor = DangerRed,
                        onClick = { onSelectLevel(if (selectedLevel == LogLevel.ERROR) null else LogLevel.ERROR) }
                    )

                    // Advanced filters toggle
                    FilterChip(
                        selected = showAdvanced || hasAdvancedFilter,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            showAdvanced = !showAdvanced
                        },
                        label = {
                            Text(
                                text = if (hasAdvancedFilter) "Filters •" else "Filters",
                                fontSize = 11.sp,
                                fontWeight = if (hasAdvancedFilter) FontWeight.Bold else FontWeight.Medium
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = null,
                                modifier = Modifier.size(12.dp)
                            )
                        },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryBlue.copy(alpha = 0.2f),
                            selectedLabelColor = PrimaryBlue,
                            containerColor = SurfaceDark,
                            labelColor = TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = showAdvanced || hasAdvancedFilter,
                            borderColor = if (showAdvanced || hasAdvancedFilter) PrimaryBlue else BorderDark
                        ),
                        modifier = Modifier.height(32.dp)
                    )

                    // Reset Filters Chip
                    if (hasActiveFilter) {
                        FilterChip(
                            selected = false,
                            onClick = {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                onResetFilters()
                                showAdvanced = false
                            },
                            label = {
                                Text(
                                    text = "Reset ✕",
                                    color = DangerRed,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = FilterChipDefaults.filterChipColors(
                                containerColor = DangerRed.copy(alpha = 0.12f),
                                labelColor = DangerRed
                            ),
                            border = FilterChipDefaults.filterChipBorder(
                                enabled = true,
                                selected = false,
                                borderColor = DangerRed.copy(alpha = 0.4f)
                            ),
                            modifier = Modifier.height(32.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))
                }
            }

            HorizontalDivider(color = BorderDark.copy(alpha = 0.6f), thickness = 1.dp)

            // Live Logcat View (Virtualized LazyColumn)
            if (logs.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "No logcat events matching current filters.",
                            color = TextSecondary,
                            fontSize = 13.sp
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Logs stream in real-time as processes execute.",
                            color = TextSecondary.copy(alpha = 0.6f),
                            fontSize = 11.sp
                        )
                    }
                }
            } else {
                LazyColumn(
                    state = listState,
                    reverseLayout = true,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.45f)),
                    contentPadding = PaddingValues(top = 6.dp, bottom = 48.dp)
                ) {
                    items(
                        items = reversedLogs,
                        key = { it.id }
                    ) { entry ->
                        LogItemRow(
                            entry = entry,
                            searchQuery = searchQuery,
                            regexMode = regexMode,
                            isCompact = isCompactMode
                        )
                    }
                }
            }
        }

        // Floating "Jump to latest" Action Pill (appears when user pauses scroll or scrolls up)
        androidx.compose.animation.AnimatedVisibility(
            visible = !autoScrollEnabled && logs.isNotEmpty(),
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(PrimaryBlue)
                    .border(1.dp, Color.White.copy(alpha = 0.25f), RoundedCornerShape(20.dp))
                    .clickable {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        autoScrollEnabled = true
                        coroutineScope.launch {
                            listState.scrollToItem(0)
                        }
                    }
                    .padding(horizontal = 14.dp, vertical = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "↓ Jump to latest",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    if (unreadCount > 0) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                text = "+$unreadCount",
                                color = Color.White,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Monospace
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CompactFilterField(
    value: String,
    placeholder: String,
    onChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(36.dp)
            .clip(RoundedCornerShape(9.dp))
            .background(SurfaceDark)
            .border(1.dp, if (value.isNotEmpty()) PrimaryBlue.copy(alpha = 0.5f) else BorderDark, RoundedCornerShape(9.dp))
            .padding(horizontal = 10.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        if (value.isEmpty()) {
            Text(placeholder, color = TextSecondary.copy(alpha = 0.6f), fontSize = 12.sp)
        }
        BasicTextField(
            value = value,
            onValueChange = onChange,
            singleLine = true,
            textStyle = TextStyle(color = TextPrimary, fontSize = 12.sp, fontFamily = FontFamily.Monospace),
            cursorBrush = SolidColor(PrimaryBlue),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun LevelChip(
    label: String,
    selected: Boolean,
    activeColor: Color = PrimaryBlue,
    onClick: () -> Unit
) {
    val haptic = LocalHapticFeedback.current
    FilterChip(
        selected = selected,
        onClick = {
            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
            onClick()
        },
        label = {
            Text(
                text = label,
                fontSize = 11.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = activeColor.copy(alpha = 0.22f),
            selectedLabelColor = activeColor,
            containerColor = SurfaceDark,
            labelColor = TextSecondary
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) activeColor else BorderDark
        ),
        modifier = Modifier.height(32.dp)
    )
}
