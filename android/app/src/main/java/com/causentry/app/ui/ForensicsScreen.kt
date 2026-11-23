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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.FileProvider
import com.causentry.app.R
import com.causentry.app.model.AppInfo
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import com.causentry.app.ui.components.ForensicAppPickerDialog
import com.causentry.app.ui.components.LogItemRow
import com.causentry.app.ui.components.StatusPill
import com.causentry.app.ui.theme.LocalCausentryColors
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
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val context = LocalContext.current
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    val haptic = LocalHapticFeedback.current

    var showAppPickerDialog by remember { mutableStateOf(false) }
    var showAdvanced by remember { mutableStateOf(false) }
    var isCompactMode by remember { mutableStateOf(false) }
    var crashesExpanded by remember { mutableStateOf(true) }

    val selectedApp = remember(selectedPackage, allApps) {
        allApps.find { it.packageName == selectedPackage }
    }
    val hasAdvancedFilter = tagFilter.isNotBlank() || pidFilter.isNotBlank() || regexMode
    val hasActiveFilter = selectedPackage != null || selectedLevel != null ||
        searchQuery.isNotBlank() || hasAdvancedFilter

    // Pre-compile regex once for the entire log list instead of per row
    val compiledRegex = remember(searchQuery, regexMode) {
        val q = searchQuery.trim()
        if (regexMode && q.isNotEmpty()) {
            try { Regex(q, RegexOption.IGNORE_CASE) } catch (_: Exception) { null }
        } else null
    }

    val isDragged by listState.interactionSource.collectIsDraggedAsState()
    var autoScrollEnabled by remember { mutableStateOf(true) }
    var pauseAnchorLogId by remember { mutableLongStateOf(0L) }

    LaunchedEffect(searchQuery, tagFilter, pidFilter, regexMode, selectedPackage, selectedLevel) {
        if (!autoScrollEnabled) {
            pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
        }
    }

    LaunchedEffect(listState.interactionSource) {
        listState.interactionSource.interactions.collect { interaction ->
            if (interaction is androidx.compose.foundation.interaction.DragInteraction.Start && autoScrollEnabled) {
                autoScrollEnabled = false
                pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
            }
        }
    }
    LaunchedEffect(isDragged) {
        if (isDragged && autoScrollEnabled) {
            autoScrollEnabled = false
            pauseAnchorLogId = logs.lastOrNull()?.id ?: 0L
        }
    }

    val unreadCount = remember(logs, autoScrollEnabled, pauseAnchorLogId) {
        if (!autoScrollEnabled && pauseAnchorLogId > 0L) logs.count { it.id > pauseAnchorLogId } else 0
    }

    LaunchedEffect(autoScrollEnabled, logs.lastOrNull()?.id, isStreaming) {
        if (isStreaming && autoScrollEnabled && logs.isNotEmpty()) {
            listState.scrollToItem(0)
        }
    }

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
            .background(cs.background)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                // Row 1: Search + Record + Stream + Compact + Clear + Export
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .height(40.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(cs.surface)
                            .border(
                                1.dp,
                                if (regexError != null) ext.danger.copy(alpha = 0.7f) else ext.border,
                                RoundedCornerShape(10.dp)
                            )
                            .padding(horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null,
                            tint = cs.onSurfaceVariant,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                            if (searchQuery.isEmpty()) {
                                Text(
                                    text = stringResource(if (regexMode) R.string.forensics_regex_hint else R.string.forensics_search_hint),
                                    color = cs.onSurfaceVariant.copy(alpha = 0.65f),
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
                                    color = cs.onSurface,
                                    fontSize = 12.sp,
                                    fontFamily = if (regexMode) FontFamily.Monospace else FontFamily.Default
                                ),
                                cursorBrush = SolidColor(cs.primary),
                                modifier = Modifier.fillMaxWidth()
                            )
                        }

                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(if (regexMode) cs.primary.copy(alpha = 0.2f) else Color.Transparent)
                                .border(1.dp, if (regexMode) cs.primary.copy(alpha = 0.5f) else Color.Transparent, RoundedCornerShape(6.dp))
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    onToggleRegexMode()
                                }
                                .padding(horizontal = 5.dp, vertical = 3.dp)
                        ) {
                            Text(
                                text = ".*",
                                color = if (regexMode) cs.primary else cs.onSurfaceVariant,
                                fontSize = 11.5.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        if (searchQuery.isNotEmpty()) {
                            Spacer(modifier = Modifier.width(4.dp))
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
                                    tint = cs.onSurfaceVariant,
                                    modifier = Modifier.size(14.dp)
                                )
                            }
                        }
                    }

                    // Record / Stop Session button
                    ToolbarIconButton(
                        iconRes = if (isRecording) R.drawable.ic_stop else R.drawable.ic_record,
                        contentDescription = stringResource(if (isRecording) R.string.forensics_stop else R.string.forensics_record),
                        tint = if (isRecording) ext.danger else cs.onSurfaceVariant,
                        active = isRecording,
                        activeColor = ext.danger,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            onToggleRecording()
                        }
                    )

                    // Play / Pause stream
                    ToolbarIconButton(
                        iconRes = if (isStreaming) R.drawable.ic_pause else R.drawable.ic_play,
                        contentDescription = if (isStreaming) "Pause" else "Resume",
                        tint = if (isStreaming) ext.warning else ext.success,
                        active = false,
                        activeColor = if (isStreaming) ext.warning else ext.success,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            onToggleStream()
                        }
                    )

                    // Compact mode toggle
                    ToolbarIconButton(
                        iconRes = R.drawable.ic_code,
                        contentDescription = "Toggle Compact",
                        tint = if (isCompactMode) cs.primary else cs.onSurfaceVariant,
                        active = isCompactMode,
                        activeColor = cs.primary,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            isCompactMode = !isCompactMode
                        }
                    )

                    // Clear
                    ToolbarIconButton(
                        iconRes = R.drawable.ic_delete,
                        contentDescription = "Clear Logs",
                        tint = cs.onSurfaceVariant,
                        active = false,
                        activeColor = ext.border,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            onClearLogs()
                        }
                    )

                    // Export ZIP / Log
                    ToolbarIconButton(
                        iconRes = R.drawable.ic_download,
                        contentDescription = "Export ZIP",
                        tint = cs.primary,
                        active = false,
                        activeColor = cs.primary,
                        onClick = {
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
                                    Toast.makeText(context, "Exported: ${file.absolutePath}", Toast.LENGTH_LONG).show()
                                }
                            } else {
                                Toast.makeText(context, "Failed to export", Toast.LENGTH_SHORT).show()
                            }
                        }
                    )
                }

                // Active recording indicator bar
                AnimatedVisibility(visible = isRecording || recordedCount > 0) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 6.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(if (isRecording) ext.danger.copy(alpha = 0.14f) else ext.surfaceHigh)
                            .border(
                                1.dp,
                                if (isRecording) ext.danger.copy(alpha = 0.45f) else ext.border,
                                RoundedCornerShape(8.dp)
                            )
                            .padding(horizontal = 10.dp, vertical = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(8.dp)
                                    .clip(CircleShape)
                                    .background(if (isRecording) ext.danger else cs.primary)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = if (isRecording) {
                                    "REC • $recordedCount lines captured"
                                } else {
                                    "Recorded session ready • $recordedCount lines"
                                },
                                color = if (isRecording) ext.danger else cs.onSurface,
                                fontSize = 11.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                        Text(
                            text = stringResource(if (isRecording) R.string.forensics_stop else R.string.forensics_record),
                            color = if (isRecording) ext.danger else cs.primary,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.clickable { onToggleRecording() }
                        )
                    }
                }

                if (regexError != null) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Invalid regex: $regexError",
                        color = ext.danger,
                        fontSize = 10.5.sp,
                        modifier = Modifier.padding(horizontal = 4.dp)
                    )
                }

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

                // Filter Chips Row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FilterChip(
                        selected = selectedPackage != null,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            showAppPickerDialog = true
                        },
                        label = {
                            Text(
                                text = when {
                                    selectedApp != null -> "App: ${selectedApp.label}"
                                    selectedPackage != null -> "App: $selectedPackage"
                                    else -> "All Apps"
                                },
                                fontSize = 11.sp,
                                fontWeight = if (selectedPackage != null) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        },
                        trailingIcon = if (selectedPackage != null) {
                            {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_close),
                                    contentDescription = "Clear app filter",
                                    tint = cs.primary,
                                    modifier = Modifier
                                        .size(14.dp)
                                        .clickable { onSelectPackage(null) }
                                )
                            }
                        } else null,
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = cs.primary.copy(alpha = 0.18f),
                            selectedLabelColor = cs.primary,
                            containerColor = cs.surface,
                            labelColor = cs.onSurfaceVariant
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedPackage != null,
                            borderColor = if (selectedPackage != null) cs.primary else ext.border
                        )
                    )

                    LevelChip("All", selectedLevel == null) { onSelectLevel(null) }
                    LevelChip("Debug+", selectedLevel == LogLevel.DEBUG, cs.primary) {
                        onSelectLevel(if (selectedLevel == LogLevel.DEBUG) null else LogLevel.DEBUG)
                    }
                    LevelChip("Info+", selectedLevel == LogLevel.INFO, ext.success) {
                        onSelectLevel(if (selectedLevel == LogLevel.INFO) null else LogLevel.INFO)
                    }
                    LevelChip("Warn+", selectedLevel == LogLevel.WARN, ext.warning) {
                        onSelectLevel(if (selectedLevel == LogLevel.WARN) null else LogLevel.WARN)
                    }
                    LevelChip("Error & Crash", selectedLevel == LogLevel.ERROR, ext.danger) {
                        onSelectLevel(if (selectedLevel == LogLevel.ERROR) null else LogLevel.ERROR)
                    }

                    FilterChip(
                        selected = showAdvanced || hasAdvancedFilter,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            showAdvanced = !showAdvanced
                        },
                        label = {
                            Text(
                                text = if (hasAdvancedFilter) "Filters *" else "Filters",
                                fontSize = 11.sp,
                                fontWeight = if (hasAdvancedFilter) FontWeight.Bold else FontWeight.Medium
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_tune),
                                contentDescription = null,
                                modifier = Modifier.size(13.dp)
                            )
                        },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = cs.primary.copy(alpha = 0.18f),
                            selectedLabelColor = cs.primary,
                            containerColor = cs.surface,
                            labelColor = cs.onSurfaceVariant
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = showAdvanced || hasAdvancedFilter,
                            borderColor = if (showAdvanced || hasAdvancedFilter) cs.primary else ext.border
                        )
                    )

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
                                    text = stringResource(R.string.action_reset),
                                    color = ext.danger,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            },
                            shape = RoundedCornerShape(8.dp),
                            colors = FilterChipDefaults.filterChipColors(
                                containerColor = ext.danger.copy(alpha = 0.12f),
                                labelColor = ext.danger
                            ),
                            border = FilterChipDefaults.filterChipBorder(
                                enabled = true,
                                selected = false,
                                borderColor = ext.danger.copy(alpha = 0.4f)
                            )
                        )
                    }
                }
            }

            // Detected Crashes & RASP Traps Panel (rendered live!)
            if (crashReports.isNotEmpty()) {
                CrashReportsPanel(
                    reports = crashReports,
                    expanded = crashesExpanded,
                    onToggleExpand = { crashesExpanded = !crashesExpanded },
                    onDismissCrash = onDismissCrash,
                    onClearCrashes = onClearCrashes,
                    onInspectApp = onInspectApp
                )
            }

            HorizontalDivider(color = ext.border.copy(alpha = 0.6f), thickness = 1.dp)

            if (logs.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(36.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = stringResource(R.string.forensics_empty_title),
                            color = cs.onSurfaceVariant,
                            fontSize = 13.sp
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = stringResource(R.string.forensics_empty_subtitle),
                            color = cs.onSurfaceVariant.copy(alpha = 0.7f),
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
                        .background(if (ext.isDark) Color.Black.copy(alpha = 0.35f) else ext.surfaceHigh.copy(alpha = 0.5f)),
                    contentPadding = PaddingValues(top = 6.dp, bottom = 52.dp)
                ) {
                    items(items = reversedLogs, key = { it.id }) { entry ->
                        LogItemRow(
                            entry = entry,
                            searchQuery = searchQuery,
                            compiledRegex = compiledRegex,
                            isCompact = isCompactMode
                        )
                    }
                }
            }
        }

        AnimatedVisibility(
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
                    .background(cs.primary)
                    .clickable {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        autoScrollEnabled = true
                        coroutineScope.launch { listState.scrollToItem(0) }
                    }
                    .padding(horizontal = 14.dp, vertical = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = stringResource(R.string.forensics_jump_latest),
                        color = cs.onPrimary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    if (unreadCount > 0) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .background(cs.onPrimary.copy(alpha = 0.25f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                text = "+$unreadCount",
                                color = cs.onPrimary,
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
private fun CrashReportsPanel(
    reports: List<CrashThreatReport>,
    expanded: Boolean,
    onToggleExpand: () -> Unit,
    onDismissCrash: (Long) -> Unit,
    onClearCrashes: () -> Unit,
    onInspectApp: (String) -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(ext.danger.copy(alpha = 0.08f))
            .border(1.dp, ext.danger.copy(alpha = 0.35f), RoundedCornerShape(12.dp))
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onToggleExpand),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_warning),
                    contentDescription = null,
                    tint = ext.danger,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = stringResource(R.string.forensics_crashes_title, reports.size),
                    color = ext.danger,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Text(
                text = stringResource(R.string.forensics_clear_all),
                color = ext.danger,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .clickable(onClick = onClearCrashes)
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            )
        }

        AnimatedVisibility(visible = expanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .heightIn(max = 200.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                reports.take(10).forEach { report ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(cs.surface)
                            .border(1.dp, ext.border, RoundedCornerShape(8.dp))
                            .padding(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = report.title,
                                color = cs.onSurface,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.weight(1f)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            StatusPill(text = report.type.name, color = ext.danger)
                        }

                        Text(
                            text = "${report.packageName} • PID ${report.pid} • ${report.timestamp}",
                            color = cs.onSurfaceVariant,
                            fontSize = 10.sp,
                            fontFamily = FontFamily.Monospace,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )

                        report.threatDiagnosis?.let { diag ->
                            Spacer(modifier = Modifier.height(3.dp))
                            Text(
                                text = diag,
                                color = ext.warning,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        report.recommendedFix?.let { fix ->
                            Text(
                                text = fix,
                                color = cs.onSurfaceVariant,
                                fontSize = 10.5.sp
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(
                                onClick = { onInspectApp(report.packageName) },
                                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 0.dp)
                            ) {
                                Text("Inspect App", fontSize = 11.sp, color = cs.primary, fontWeight = FontWeight.Bold)
                            }
                            TextButton(
                                onClick = { onDismissCrash(report.id) },
                                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 0.dp)
                            ) {
                                Text(stringResource(R.string.forensics_dismiss), fontSize = 11.sp, color = cs.onSurfaceVariant)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ToolbarIconButton(
    iconRes: Int,
    contentDescription: String,
    tint: Color,
    active: Boolean,
    activeColor: Color,
    onClick: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(if (active) activeColor.copy(alpha = 0.18f) else cs.surface)
            .border(1.dp, if (active) activeColor else ext.border, RoundedCornerShape(10.dp))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = contentDescription,
            tint = tint,
            modifier = Modifier.size(17.dp)
        )
    }
}

@Composable
private fun CompactFilterField(
    value: String,
    placeholder: String,
    onChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    Box(
        modifier = modifier
            .height(38.dp)
            .clip(RoundedCornerShape(9.dp))
            .background(cs.surface)
            .border(1.dp, if (value.isNotEmpty()) cs.primary.copy(alpha = 0.6f) else ext.border, RoundedCornerShape(9.dp))
            .padding(horizontal = 10.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        if (value.isEmpty()) {
            Text(placeholder, color = cs.onSurfaceVariant.copy(alpha = 0.65f), fontSize = 12.sp)
        }
        BasicTextField(
            value = value,
            onValueChange = onChange,
            singleLine = true,
            textStyle = TextStyle(color = cs.onSurface, fontSize = 12.sp, fontFamily = FontFamily.Monospace),
            cursorBrush = SolidColor(cs.primary),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun LevelChip(
    label: String,
    selected: Boolean,
    activeColor: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
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
            selectedContainerColor = activeColor.copy(alpha = 0.2f),
            selectedLabelColor = activeColor,
            containerColor = cs.surface,
            labelColor = cs.onSurfaceVariant
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) activeColor else ext.border
        )
    )
}
