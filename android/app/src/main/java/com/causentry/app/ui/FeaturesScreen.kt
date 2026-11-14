package com.causentry.app.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.components.AppIconItem
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

enum class FeatureCategory(
    val key: String,
    val title: String,
    val shortName: String,
    val description: String,
    val iconRes: Int,
    val themeColor: Color
) {
    DEV_OPTIONS(
        "devOff",
        "Hide Developer Options & ADB",
        "⚙️ Hide Dev",
        "Spoofs development_settings_enabled & adb_enabled as 0.",
        R.drawable.ic_code,
        WarningAmber
    ),
    MOCK_LOCATION(
        "mock",
        "Hide Mock Location (GPS)",
        "📍 Hide Mock",
        "Forces mock_location=0 to conceal GPS spoofing tools.",
        R.drawable.ic_location,
        PrimaryBlue
    ),
    ACCESSIBILITY(
        "accOff",
        "Spoof Accessibility Services",
        "♿ Accessibility",
        "Conceals active accessibility services (enabled_accessibility_services='').",
        R.drawable.ic_shield,
        Color(0xFFFFB74D)
    ),
    ISOLATION_RASP(
        "isolate",
        "Neutralize RASP & Isolated Services",
        "🧱 Neutralize RASP",
        "Forces usesAppZygote=false & strips FLAG_ISOLATED_PROCESS.",
        R.drawable.ic_shield,
        Color(0xFFB388FF)
    )
}

enum class FeatureFilter {
    ALL,
    ENABLED,
    DISABLED,
    USER,
    SYSTEM
}

@Composable
fun FeaturesScreen(
    allApps: List<AppInfo>,
    iconLoader: IconLoader,
    isSyncing: Boolean = false,
    onSaveFeature: (featureKey: String, enabledPackages: Set<String>, allPackages: Set<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    val haptic = LocalHapticFeedback.current

    var selectedFeature by remember { mutableStateOf(FeatureCategory.DEV_OPTIONS) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf(FeatureFilter.ALL) }

    // Saved baseline for the currently selected feature
    var savedFeaturePackages by remember(selectedFeature.key) {
        val initial = allApps.filter { app ->
            when (selectedFeature) {
                FeatureCategory.DEV_OPTIONS -> app.devOff
                FeatureCategory.MOCK_LOCATION -> app.mock
                FeatureCategory.ACCESSIBILITY -> app.accOff
                FeatureCategory.ISOLATION_RASP -> app.isolate
            }
        }.map { it.packageName }.toSet()
        mutableStateOf(initial)
    }

    // User's working draft state (toggling switches updates only this set)
    var draftEnabledPackages by remember(selectedFeature.key) {
        mutableStateOf(savedFeaturePackages)
    }

    val isDirty = draftEnabledPackages != savedFeaturePackages

    // Filtered apps with STABLE sort: ordered by savedFeaturePackages, so toggling DOES NOT jump!
    // Apps only reorder to top once "Save Changes" is committed!
    val filteredApps = remember(allApps, searchQuery, selectedFilter, savedFeaturePackages) {
        val q = searchQuery.trim().lowercase()
        allApps.filter { app ->
            val isEnabled = savedFeaturePackages.contains(app.packageName)
            val matchesFilter = when (selectedFilter) {
                FeatureFilter.ALL -> true
                FeatureFilter.ENABLED -> isEnabled
                FeatureFilter.DISABLED -> !isEnabled
                FeatureFilter.USER -> !app.isSystem
                FeatureFilter.SYSTEM -> app.isSystem
            }
            val matchesQuery = q.isEmpty() ||
                app.label.lowercase().contains(q) ||
                app.packageName.lowercase().contains(q)

            matchesFilter && matchesQuery
        }.sortedWith(
            compareByDescending<AppInfo> { savedFeaturePackages.contains(it.packageName) }
                .thenBy { it.label.lowercase() }
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.2f))
    ) {
        // Bar 1: Feature Category Selector Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FeatureCategory.values().forEach { feature ->
                val isSelected = selectedFeature == feature
                FilterChip(
                    selected = isSelected,
                    onClick = {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        selectedFeature = feature
                    },
                    label = {
                        Text(
                            text = feature.shortName,
                            fontSize = 11.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                        )
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = feature.themeColor.copy(alpha = 0.2f),
                        selectedLabelColor = feature.themeColor,
                        containerColor = SurfaceDark,
                        labelColor = TextSecondary
                    ),
                    border = FilterChipDefaults.filterChipBorder(
                        enabled = true,
                        selected = isSelected,
                        borderColor = if (isSelected) feature.themeColor else BorderDark
                    ),
                    modifier = Modifier.height(30.dp)
                )
            }
        }

        // Bar 2: Ultra-Compact Action Bar (Replaces the giant card!)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left: Title + Counter Pill
            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = selectedFeature.title,
                    color = TextPrimary,
                    fontSize = 12.5.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f, fill = false)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(selectedFeature.themeColor.copy(alpha = 0.18f))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "${draftEnabledPackages.size}/${allApps.size}",
                        color = selectedFeature.themeColor,
                        fontSize = 10.5.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Right: Compact Quick Action Pills
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(6.dp))
                        .clickable {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            val toAdd = filteredApps.map { it.packageName }
                            draftEnabledPackages = draftEnabledPackages + toAdd
                        }
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text("Select All", color = PrimaryBlue, fontSize = 10.5.sp, fontWeight = FontWeight.Bold)
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(6.dp))
                        .clickable {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            val toRemove = filteredApps.map { it.packageName }.toSet()
                            draftEnabledPackages = draftEnabledPackages - toRemove
                        }
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text("Deselect", color = DangerRed, fontSize = 10.5.sp, fontWeight = FontWeight.Medium)
                }
            }
        }

        // Bar 3: Compact Search Field
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 2.dp)
                .height(38.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(10.dp))
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                tint = TextSecondary,
                modifier = Modifier.size(15.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.CenterStart
            ) {
                if (searchQuery.isEmpty()) {
                    Text(
                        text = "Search app name or package...",
                        color = TextSecondary.copy(alpha = 0.6f),
                        fontSize = 11.5.sp
                    )
                }
                androidx.compose.foundation.text.BasicTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    singleLine = true,
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = TextPrimary,
                        fontSize = 11.5.sp,
                        fontFamily = FontFamily.Default
                    ),
                    cursorBrush = androidx.compose.ui.graphics.SolidColor(PrimaryBlue),
                    modifier = Modifier.fillMaxWidth()
                )
            }

            if (searchQuery.isNotEmpty()) {
                IconButton(
                    onClick = { searchQuery = "" },
                    modifier = Modifier.size(22.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = "Clear",
                        tint = TextSecondary,
                        modifier = Modifier.size(13.dp)
                    )
                }
            }
        }

        // Bar 4: Filter Chips Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val enabledCount = allApps.count { draftEnabledPackages.contains(it.packageName) }
            val disabledCount = allApps.size - enabledCount
            val userCount = allApps.count { !it.isSystem }
            val systemCount = allApps.count { it.isSystem }

            FeatureFilterChip("All (${allApps.size})", selectedFilter == FeatureFilter.ALL) {
                selectedFilter = FeatureFilter.ALL
            }
            FeatureFilterChip("Enabled ($enabledCount)", selectedFilter == FeatureFilter.ENABLED, activeColor = selectedFeature.themeColor) {
                selectedFilter = FeatureFilter.ENABLED
            }
            FeatureFilterChip("Disabled ($disabledCount)", selectedFilter == FeatureFilter.DISABLED) {
                selectedFilter = FeatureFilter.DISABLED
            }
            FeatureFilterChip("User ($userCount)", selectedFilter == FeatureFilter.USER) {
                selectedFilter = FeatureFilter.USER
            }
            FeatureFilterChip("System ($systemCount)", selectedFilter == FeatureFilter.SYSTEM) {
                selectedFilter = FeatureFilter.SYSTEM
            }
        }

        // Main Expansive Apps List
        Box(modifier = Modifier.weight(1f)) {
            if (filteredApps.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No applications match current query or filter.",
                        color = TextSecondary,
                        fontSize = 13.sp
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(top = 2.dp, bottom = 84.dp)
                ) {
                    items(
                        items = filteredApps,
                        key = { it.packageName }
                    ) { app ->
                        val isEnabled = draftEnabledPackages.contains(app.packageName)

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    draftEnabledPackages = if (isEnabled) {
                                        draftEnabledPackages - app.packageName
                                    } else {
                                        draftEnabledPackages + app.packageName
                                    }
                                }
                                .padding(horizontal = 18.dp, vertical = 7.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppIconItem(
                                packageName = app.packageName,
                                label = app.label,
                                iconLoader = iconLoader,
                                size = 36.dp
                            )

                            Spacer(modifier = Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = app.label,
                                    color = TextPrimary,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    text = app.packageName,
                                    color = TextSecondary,
                                    fontSize = 10.5.sp,
                                    fontFamily = FontFamily.Monospace,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }

                            Spacer(modifier = Modifier.width(8.dp))

                            Switch(
                                checked = isEnabled,
                                onCheckedChange = { checked ->
                                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                    draftEnabledPackages = if (checked) {
                                        draftEnabledPackages + app.packageName
                                    } else {
                                        draftEnabledPackages - app.packageName
                                    }
                                },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = Color.White,
                                    checkedTrackColor = selectedFeature.themeColor,
                                    uncheckedThumbColor = TextSecondary,
                                    uncheckedTrackColor = SurfaceHighDark,
                                    uncheckedBorderColor = BorderDark
                                ),
                                modifier = Modifier.scale(0.8f)
                            )
                        }
                    }
                }
            }

            // Floating Bottom Save Pill (Only prominent when there are unsaved changes)
            if (isDirty) {
                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(SurfaceDark)
                        .border(1.dp, selectedFeature.themeColor, RoundedCornerShape(14.dp))
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Unsaved Policy Changes",
                            color = selectedFeature.themeColor,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${draftEnabledPackages.size} apps will be updated",
                            color = TextSecondary,
                            fontSize = 10.sp
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        TextButton(
                            onClick = {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                draftEnabledPackages = savedFeaturePackages
                            },
                            modifier = Modifier.height(34.dp)
                        ) {
                            Text("Reset", fontSize = 11.5.sp, color = TextSecondary)
                        }

                        Button(
                            onClick = {
                                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                                val committed = draftEnabledPackages
                                savedFeaturePackages = committed
                                onSaveFeature(
                                    selectedFeature.key,
                                    committed,
                                    allApps.map { it.packageName }.toSet()
                                )
                            },
                            enabled = isDirty && !isSyncing,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = selectedFeature.themeColor,
                                disabledContainerColor = selectedFeature.themeColor.copy(alpha = 0.5f)
                            ),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 4.dp),
                            modifier = Modifier.height(34.dp)
                        ) {
                            if (isSyncing) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(13.dp),
                                    strokeWidth = 2.dp,
                                    color = Color.Black
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Applying...",
                                    color = Color.Black,
                                    fontSize = 11.5.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            } else {
                                Text(
                                    text = if (isDirty) "Save Changes" else "Saved",
                                    color = if (isDirty) Color.Black else TextSecondary,
                                    fontSize = 11.5.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FeatureFilterChip(
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
                fontSize = 10.5.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = activeColor.copy(alpha = 0.2f),
            selectedLabelColor = activeColor,
            containerColor = SurfaceDark,
            labelColor = TextSecondary
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) activeColor else BorderDark
        ),
        modifier = Modifier.height(28.dp)
    )
}
