package com.causentry.app.ui

import android.content.Intent
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
import com.causentry.app.model.CrashType
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
    var showAppPickerDialog by remember { mutableStateOf(false) }
    var showAdvanced by remember { mutableStateOf(false) }

    val selectedApp = remember(selectedPackage, allApps) {
        allApps.find { it.packageName == selectedPackage }
    }
    val hasAdvancedFilter = tagFilter.isNotBlank() || pidFilter.isNotBlank() || regexMode
    val hasActiveFilter = selectedPackage != null || selectedLevel != null ||
        searchQuery.isNotBlank() || hasAdvancedFilter

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

    // Auto-scroll to bottom when streaming is active and new logs arrive
    LaunchedEffect(logs.size, isStreaming) {
        if (isStreaming && logs.isNotEmpty()) {
            listState.animateScrollToItem(logs.size - 1)
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.2f))
    ) {
        // Control & Filter Header Section
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 6.dp)
        ) {
            // Row 1: Stream Status & Compact Action Buttons
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(SurfaceDark)
                    .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                    .padding(horizontal = 10.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Left: Stream status + line counter + recording badge
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Status Pill (clickable to toggle stream)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(if (isStreaming) SuccessGreen.copy(alpha = 0.12f) else WarningAmber.copy(alpha = 0.12f))
                            .border(1.dp, if (isStreaming) SuccessGreen.copy(alpha = 0.35f) else WarningAmber.copy(alpha = 0.35f), RoundedCornerShape(6.dp))
                            .clickable { onToggleStream() }
                            .padding(horizontal = 7.dp, vertical = 4.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(7.dp)
                                .clip(CircleShape)
                                .background(if (isStreaming) SuccessGreen else WarningAmber)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = if (isStreaming) "LIVE" else "PAUSED",
                            color = if (isStreaming) SuccessGreen else WarningAmber,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.5.sp
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(6.dp))
                            .padding(horizontal = 7.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "${logs.size} lines",
                            color = TextSecondary,
                            fontSize = 11.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    // Recording indicator (LogFox-style persistent capture badge)
                    if (isRecording) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(DangerRed.copy(alpha = 0.14f))
                                .border(1.dp, DangerRed.copy(alpha = 0.4f), RoundedCornerShape(6.dp))
                                .padding(horizontal = 7.dp, vertical = 4.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(7.dp)
                                    .clip(CircleShape)
                                    .background(DangerRed)
                            )
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = "REC $recordedCount",
                                color = DangerRed,
                                fontSize = 11.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                // Right: Action buttons (Compact Box, zero collision, strictly sized)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Record toggle (starts / stops session capture to disk)
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(if (isRecording) DangerRed.copy(alpha = 0.16f) else SurfaceHighDark)
                            .border(1.dp, if (isRecording) DangerRed.copy(alpha = 0.6f) else BorderDark, RoundedCornerShape(7.dp))
                            .clickable { onToggleRecording() },
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .size(if (isRecording) 11.dp else 12.dp)
                                .clip(if (isRecording) RoundedCornerShape(2.dp) else CircleShape)
                                .background(if (isRecording) DangerRed else TextSecondary)
                        )
                    }

                    // Play/Pause button
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, if (isStreaming) WarningAmber.copy(alpha = 0.5f) else SuccessGreen.copy(alpha = 0.5f), RoundedCornerShape(7.dp))
                            .clickable { onToggleStream() },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = if (isStreaming) R.drawable.ic_pause else R.drawable.ic_play),
                            contentDescription = if (isStreaming) "Pause Stream" else "Resume Stream",
                            tint = if (isStreaming) WarningAmber else SuccessGreen,
                            modifier = Modifier.size(14.dp)
                        )
                    }

                    // Clear logs button
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(7.dp))
                            .clickable { onClearLogs() },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_delete),
                            contentDescription = "Clear Logs",
                            tint = TextSecondary,
                            modifier = Modifier.size(14.dp)
                        )
                    }

                    // Export ZIP (session log + crash digest + device info)
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(7.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(7.dp))
                            .clickable {
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
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Row 2: Search Input Field (regex-aware hint)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(42.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(SurfaceDark)
                    .border(1.dp, if (regexError != null) DangerRed.copy(alpha = 0.6f) else BorderDark, RoundedCornerShape(10.dp))
                    .padding(horizontal = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null,
                    tint = TextSecondary,
                    modifier = Modifier.size(16.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                Box(
                    modifier = Modifier.weight(1f),
                    contentAlignment = Alignment.CenterStart
                ) {
                    if (searchQuery.isEmpty()) {
                        Text(
                            text = if (regexMode) "Regex pattern (e.g. time.*out|denied)…" else "Search logs, tags, or PIDs…",
                            color = TextSecondary.copy(alpha = 0.6f),
                            fontSize = 12.sp
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

                // Regex mode toggle (.*)
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(if (regexMode) PrimaryBlue.copy(alpha = 0.18f) else Color.Transparent)
                        .clickable { onToggleRegexMode() }
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

            // Row 2b: Advanced filters (Tag / PID) — collapsible
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

            // Row 3: Horizontal Filter Chips (App selector + Log Levels + Advanced + Reset)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // App Selector Chip (Opens searchable dialog)
                FilterChip(
                    selected = selectedPackage != null,
                    onClick = { showAppPickerDialog = true },
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

                // Level Filter Chips
                LevelChip(
                    label = "All Levels",
                    selected = selectedLevel == null,
                    onClick = { onSelectLevel(null) }
                )
                LevelChip(
                    label = "Info+",
                    selected = selectedLevel == LogLevel.INFO,
                    onClick = { onSelectLevel(if (selectedLevel == LogLevel.INFO) null else LogLevel.INFO) }
                )
                LevelChip(
                    label = "Warn",
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

                // Advanced filters toggle (Tag / PID)
                FilterChip(
                    selected = showAdvanced || hasAdvancedFilter,
                    onClick = { showAdvanced = !showAdvanced },
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

        // Crash / Threat alert section (LogFox-style surfacing of detected events)
        if (crashReports.isNotEmpty()) {
            CrashAlertSection(
                reports = crashReports,
                onDismiss = onDismissCrash,
                onClearAll = onClearCrashes,
                onInspectApp = onInspectApp
            )
            HorizontalDivider(color = BorderDark.copy(alpha = 0.6f), thickness = 1.dp)
        }

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
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.45f)),
                contentPadding = PaddingValues(top = 8.dp, bottom = 24.dp)
            ) {
                items(
                    items = logs,
                    key = { it.id }
                ) { entry ->
                    LogItemRow(entry = entry)
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
private fun CrashAlertSection(
    reports: List<CrashThreatReport>,
    onDismiss: (Long) -> Unit,
    onClearAll: () -> Unit,
    onInspectApp: (String) -> Unit
) {
    var expandedId by remember { mutableStateOf<Long?>(null) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(DangerRed.copy(alpha = 0.05f))
            .padding(horizontal = 14.dp, vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "⚠ ${reports.size} crash / threat ${if (reports.size == 1) "event" else "events"} detected",
                color = DangerRed,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Clear all",
                color = DangerRed.copy(alpha = 0.8f),
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .clickable { onClearAll() }
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        // Show newest 3; older events collapse into a count
        val shown = reports.take(3)
        for (report in shown) {
            CrashAlertCard(
                report = report,
                expanded = expandedId == report.id,
                onToggle = { expandedId = if (expandedId == report.id) null else report.id },
                onDismiss = { onDismiss(report.id) },
                onInspect = { onInspectApp(report.packageName) }
            )
            Spacer(modifier = Modifier.height(4.dp))
        }
        if (reports.size > shown.size) {
            Text(
                text = "+${reports.size - shown.size} more older events",
                color = TextSecondary,
                fontSize = 10.sp,
                modifier = Modifier.padding(start = 4.dp)
            )
        }
    }
}

@Composable
private fun CrashAlertCard(
    report: CrashThreatReport,
    expanded: Boolean,
    onToggle: () -> Unit,
    onDismiss: () -> Unit,
    onInspect: () -> Unit
) {
    val accent = when (report.type) {
        CrashType.ANR -> WarningAmber
        CrashType.RASP_DETECTION -> PrimaryBlue
        CrashType.PROCESS_KILL -> WarningAmber
        CrashType.NATIVE_CRASH, CrashType.JAVA_CRASH -> DangerRed
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(9.dp))
            .background(SurfaceDark)
            .border(1.dp, accent.copy(alpha = 0.4f), RoundedCornerShape(9.dp))
            .clickable { onToggle() }
            .padding(horizontal = 10.dp, vertical = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(7.dp)
                    .clip(CircleShape)
                    .background(accent)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = report.title,
                    color = TextPrimary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = if (expanded) 4 else 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "${report.packageName} • PID ${report.pid} • ${report.timestamp}",
                    color = TextSecondary,
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Monospace,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Text(
                text = "✕",
                color = TextSecondary,
                fontSize = 12.sp,
                modifier = Modifier
                    .clip(CircleShape)
                    .clickable { onDismiss() }
                    .padding(horizontal = 6.dp, vertical = 2.dp)
            )
        }

        if (expanded) {
            Spacer(modifier = Modifier.height(6.dp))
            if (!report.threatDiagnosis.isNullOrBlank()) {
                Text(
                    text = "Diagnosis",
                    color = accent,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = report.threatDiagnosis,
                    color = TextPrimary,
                    fontSize = 11.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
            if (!report.recommendedFix.isNullOrBlank()) {
                Text(
                    text = "Recommended fix",
                    color = SuccessGreen,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = report.recommendedFix,
                    color = TextPrimary,
                    fontSize = 11.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
            }
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Text(
                    text = "Inspect app logs →",
                    color = PrimaryBlue,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .clickable { onInspect() }
                        .padding(vertical = 2.dp)
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = report.fullTrace,
                color = TextSecondary,
                fontSize = 10.sp,
                fontFamily = FontFamily.Monospace,
                maxLines = 14,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun LevelChip(
    label: String,
    selected: Boolean,
    activeColor: Color = PrimaryBlue,
    onClick: () -> Unit
) {
    FilterChip(
        selected = selected,
        onClick = onClick,
        label = {
            Text(
                text = label,
                fontSize = 11.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
            )
        },
        shape = RoundedCornerShape(6.dp),
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
        modifier = Modifier.height(30.dp)
    )
}
