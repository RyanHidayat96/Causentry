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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.FileProvider
import com.causentry.app.R
import com.causentry.app.model.AppInfo
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import com.causentry.app.ui.components.CrashAlertCard
import com.causentry.app.ui.components.LogItemRow
import com.causentry.app.ui.components.StatusPill
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
    isStreaming: Boolean,
    searchQuery: String,
    selectedPackage: String?,
    selectedLevel: LogLevel?,
    onToggleStream: () -> Unit,
    onClearLogs: () -> Unit,
    onClearCrashes: () -> Unit,
    onDismissCrash: (Long) -> Unit,
    onSelectPackage: (String?) -> Unit,
    onSelectLevel: (LogLevel?) -> Unit,
    onSearchQueryChange: (String) -> Unit,
    onExportLogs: () -> File?,
    onInspectApp: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val listState = rememberLazyListState()
    var packageDropdownExpanded by remember { mutableStateOf(false) }

    val selectedApp = remember(selectedPackage, allApps) {
        allApps.find { it.packageName == selectedPackage }
    }
    val hasActiveFilter = selectedPackage != null || selectedLevel != null || searchQuery.isNotBlank()

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
                .padding(horizontal = 14.dp, vertical = 8.dp)
        ) {
            // Row 1: Stream Status & Action Buttons
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(SurfaceDark)
                    .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Left: Stream status + line counter (clickable to toggle pause/stream)
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable { onToggleStream() }
                        .padding(horizontal = 4.dp, vertical = 2.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(9.dp)
                            .clip(CircleShape)
                            .background(if (isStreaming) SuccessGreen else WarningAmber)
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(
                        text = if (isStreaming) "LIVE STREAM" else "PAUSED",
                        color = if (isStreaming) SuccessGreen else WarningAmber,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(SurfaceHighDark)
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "${logs.size} lines",
                            color = TextSecondary,
                            fontSize = 11.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }

                // Right: Action buttons with consistent styling and touch targets
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Play/Pause button
                    IconButton(
                        onClick = onToggleStream,
                        modifier = Modifier
                            .size(34.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, if (isStreaming) WarningAmber.copy(alpha = 0.5f) else SuccessGreen.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = if (isStreaming) R.drawable.ic_pause else R.drawable.ic_play),
                            contentDescription = if (isStreaming) "Pause Stream" else "Resume Stream",
                            tint = if (isStreaming) WarningAmber else SuccessGreen,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    // Clear logs button
                    IconButton(
                        onClick = onClearLogs,
                        modifier = Modifier
                            .size(34.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(8.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_delete),
                            contentDescription = "Clear Logs",
                            tint = TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    // Export / Share button
                    IconButton(
                        onClick = {
                            val file = onExportLogs()
                            if (file != null) {
                                try {
                                    val uri = FileProvider.getUriForFile(
                                        context,
                                        "${context.packageName}.fileprovider",
                                        file
                                    )
                                    val intent = Intent(Intent.ACTION_SEND).apply {
                                        type = "text/plain"
                                        putExtra(Intent.EXTRA_STREAM, uri)
                                        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                                    }
                                    context.startActivity(Intent.createChooser(intent, "Share Log Dump"))
                                } catch (_: Exception) {
                                    Toast.makeText(context, "Exported to: ${file.absolutePath}", Toast.LENGTH_LONG).show()
                                }
                            } else {
                                Toast.makeText(context, "Failed to export logs", Toast.LENGTH_SHORT).show()
                            }
                        },
                        modifier = Modifier
                            .size(34.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(8.dp))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_copy),
                            contentDescription = "Export Logs",
                            tint = PrimaryBlue,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Row 2: Search Input Field (Proper height, no text clipping)
            OutlinedTextField(
                value = searchQuery,
                onValueChange = onSearchQueryChange,
                placeholder = {
                    Text(
                        "Search logs, tags, or PIDs...",
                        color = TextSecondary.copy(alpha = 0.7f),
                        fontSize = 12.sp
                    )
                },
                singleLine = true,
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = TextSecondary,
                        modifier = Modifier.size(16.dp)
                    )
                },
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = { onSearchQueryChange("") }, modifier = Modifier.size(24.dp)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_close),
                                contentDescription = "Clear search",
                                tint = TextSecondary,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryBlue,
                    unfocusedBorderColor = BorderDark,
                    focusedContainerColor = SurfaceDark,
                    unfocusedContainerColor = SurfaceDark,
                    focusedTextColor = TextPrimary,
                    unfocusedTextColor = TextPrimary
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Row 3: Horizontal Filter Chips (App selector + Log Levels + Reset)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // App Selector Chip
                Box {
                    FilterChip(
                        selected = selectedPackage != null,
                        onClick = { packageDropdownExpanded = true },
                        label = {
                            Text(
                                text = if (selectedApp != null) "App: ${selectedApp.label}" else if (selectedPackage != null) "App: $selectedPackage" else "All Apps ▾",
                                fontSize = 11.sp,
                                fontWeight = if (selectedPackage != null) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1,
                                overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
                            )
                        },
                        trailingIcon = if (selectedPackage != null) {
                            {
                                Text(
                                    text = "✕",
                                    color = PrimaryBlue,
                                    fontSize = 10.sp,
                                    modifier = Modifier.clickable { onSelectPackage(null) }
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

                    DropdownMenu(
                        expanded = packageDropdownExpanded,
                        onDismissRequest = { packageDropdownExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("All Applications (Global Stream)", fontWeight = FontWeight.Bold) },
                            onClick = {
                                onSelectPackage(null)
                                packageDropdownExpanded = false
                            }
                        )
                        allApps.forEach { app ->
                            DropdownMenuItem(
                                text = {
                                    Column {
                                        Text(app.label, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                                        Text(app.packageName, fontSize = 11.sp, color = TextSecondary, fontFamily = FontFamily.Monospace)
                                    }
                                },
                                onClick = {
                                    onSelectPackage(app.packageName)
                                    packageDropdownExpanded = false
                                }
                            )
                        }
                    }
                }

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

                // Reset Filters Chip
                if (hasActiveFilter) {
                    FilterChip(
                        selected = false,
                        onClick = {
                            onSelectPackage(null)
                            onSelectLevel(null)
                            onSearchQueryChange("")
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
            }
        }

        // Active Crash & Threat Alert Banner (if crashes recorded)
        AnimatedVisibility(visible = crashReports.isNotEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp)
            ) {
                crashReports.take(2).forEach { report ->
                    CrashAlertCard(
                        report = report,
                        onDismiss = { onDismissCrash(report.id) },
                        onInspectApp = onInspectApp,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                }
            }
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
                    .background(Color.Black.copy(alpha = 0.45f))
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
