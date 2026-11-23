package com.causentry.app.ui

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
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.components.AppIconItem
import com.causentry.app.ui.theme.LocalCausentryColors

enum class FeatureCategory(
    val key: String,
    val titleRes: Int,
    val shortRes: Int,
    val descRes: Int,
    val iconRes: Int
) {
    DEV_OPTIONS(
        "devOff",
        R.string.feature_dev_title,
        R.string.feature_dev_short,
        R.string.feature_dev_desc,
        R.drawable.ic_code
    ),
    MOCK_LOCATION(
        "mock",
        R.string.feature_mock_title,
        R.string.feature_mock_short,
        R.string.feature_mock_desc,
        R.drawable.ic_location
    ),
    ACCESSIBILITY(
        "accOff",
        R.string.feature_a11y_title,
        R.string.feature_a11y_short,
        R.string.feature_a11y_desc,
        R.drawable.ic_accessibility
    ),
    ISOLATION_RASP(
        "isolate",
        R.string.feature_isolate_title,
        R.string.feature_isolate_short,
        R.string.feature_isolate_desc,
        R.drawable.ic_shield
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
private fun FeatureCategory.accentColor(): Color {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    return when (this) {
        FeatureCategory.DEV_OPTIONS -> ext.warning
        FeatureCategory.MOCK_LOCATION -> cs.primary
        FeatureCategory.ACCESSIBILITY -> ext.accentOrange
        FeatureCategory.ISOLATION_RASP -> ext.accentPurple
    }
}

private fun extractEnabledSet(apps: List<AppInfo>, feature: FeatureCategory): Set<String> =
    apps.filter { app ->
        when (feature) {
            FeatureCategory.DEV_OPTIONS -> app.devOff
            FeatureCategory.MOCK_LOCATION -> app.mock
            FeatureCategory.ACCESSIBILITY -> app.accOff
            FeatureCategory.ISOLATION_RASP -> app.isolate
        }
    }.map { it.packageName }.toSet()

@Composable
fun FeaturesScreen(
    allApps: List<AppInfo>,
    iconLoader: IconLoader,
    isSyncing: Boolean = false,
    onSaveFeature: (featureKey: String, enabledPackages: Set<String>, allPackages: Set<String>) -> Unit,
    listState: LazyListState = rememberLazyListState(),
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    var selectedFeature by remember { mutableStateOf(FeatureCategory.DEV_OPTIONS) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedFilter by remember { mutableStateOf(FeatureFilter.ALL) }

    val selectedAccent = selectedFeature.accentColor()

    var savedFeaturePackages by remember(selectedFeature.key) {
        mutableStateOf(extractEnabledSet(allApps, selectedFeature))
    }
    var draftEnabledPackages by remember(selectedFeature.key) {
        mutableStateOf(savedFeaturePackages)
    }

    val isDirty = draftEnabledPackages != savedFeaturePackages

    // Keep baseline in sync when daemon updates arrive while the user has no unsaved local edits
    LaunchedEffect(allApps, selectedFeature.key) {
        val latest = extractEnabledSet(allApps, selectedFeature)
        if (!isDirty) {
            savedFeaturePackages = latest
            draftEnabledPackages = latest
        }
    }

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

    val enabledCount = remember(allApps, draftEnabledPackages) {
        allApps.count { draftEnabledPackages.contains(it.packageName) }
    }
    val disabledCount = allApps.size - enabledCount
    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(cs.background)
    ) {
        // Bar 1: Feature Category Selector Chips (Vector icons, zero emojis)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FeatureCategory.entries.forEach { feature ->
                val isSelected = selectedFeature == feature
                val color = feature.accentColor()
                FilterChip(
                    selected = isSelected,
                    onClick = {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        selectedFeature = feature
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = feature.iconRes),
                            contentDescription = null,
                            tint = if (isSelected) color else cs.onSurfaceVariant,
                            modifier = Modifier.size(15.dp)
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(feature.shortRes),
                            fontSize = 11.5.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                        )
                    },
                    shape = RoundedCornerShape(8.dp),
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = color.copy(alpha = 0.16f),
                        selectedLabelColor = color,
                        containerColor = cs.surface,
                        labelColor = cs.onSurfaceVariant
                    ),
                    border = FilterChipDefaults.filterChipBorder(
                        enabled = true,
                        selected = isSelected,
                        borderColor = if (isSelected) color else ext.border
                    )
                )
            }
        }

        // Bar 2: Compact Feature Header + Quick Select
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = stringResource(selectedFeature.titleRes),
                        color = cs.onBackground,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f, fill = false)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(selectedAccent.copy(alpha = 0.18f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "${draftEnabledPackages.size}/${allApps.size}",
                            color = selectedAccent,
                            fontSize = 10.5.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }
                Text(
                    text = stringResource(selectedFeature.descRes),
                    color = cs.onSurfaceVariant,
                    fontSize = 11.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(ext.surfaceHigh)
                        .border(1.dp, ext.border, RoundedCornerShape(8.dp))
                        .clickable {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            draftEnabledPackages = draftEnabledPackages + filteredApps.map { it.packageName }
                        }
                        .padding(horizontal = 8.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = stringResource(R.string.action_select_all),
                        color = cs.primary,
                        fontSize = 10.5.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(ext.surfaceHigh)
                        .border(1.dp, ext.border, RoundedCornerShape(8.dp))
                        .clickable {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            draftEnabledPackages = draftEnabledPackages - filteredApps.map { it.packageName }.toSet()
                        }
                        .padding(horizontal = 8.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = stringResource(R.string.action_deselect),
                        color = ext.danger,
                        fontSize = 10.5.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        // Bar 3: Compact Search Field
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 2.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(10.dp))
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                tint = cs.onSurfaceVariant,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                if (searchQuery.isEmpty()) {
                    Text(
                        text = stringResource(R.string.search_apps_hint),
                        color = cs.onSurfaceVariant.copy(alpha = 0.65f),
                        fontSize = 12.sp
                    )
                }
                BasicTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    singleLine = true,
                    textStyle = TextStyle(color = cs.onSurface, fontSize = 12.sp),
                    cursorBrush = SolidColor(cs.primary),
                    modifier = Modifier.fillMaxWidth()
                )
            }
            if (searchQuery.isNotEmpty()) {
                IconButton(onClick = { searchQuery = "" }, modifier = Modifier.size(32.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = "Clear",
                        tint = cs.onSurfaceVariant,
                        modifier = Modifier.size(14.dp)
                    )
                }
            }
        }

        // Bar 4: Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 4.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            FeatureFilterChip(
                "${stringResource(R.string.filter_all)} (${allApps.size})",
                selectedFilter == FeatureFilter.ALL
            ) { selectedFilter = FeatureFilter.ALL }
            FeatureFilterChip(
                "${stringResource(R.string.filter_enabled)} ($enabledCount)",
                selectedFilter == FeatureFilter.ENABLED,
                activeColor = selectedAccent
            ) { selectedFilter = FeatureFilter.ENABLED }
            FeatureFilterChip(
                "${stringResource(R.string.filter_disabled)} ($disabledCount)",
                selectedFilter == FeatureFilter.DISABLED
            ) { selectedFilter = FeatureFilter.DISABLED }
            FeatureFilterChip(
                "${stringResource(R.string.filter_user)} ($userCount)",
                selectedFilter == FeatureFilter.USER
            ) { selectedFilter = FeatureFilter.USER }
            FeatureFilterChip(
                "${stringResource(R.string.filter_system)} ($systemCount)",
                selectedFilter == FeatureFilter.SYSTEM
            ) { selectedFilter = FeatureFilter.SYSTEM }
        }

        Box(modifier = Modifier.weight(1f)) {
            if (filteredApps.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.empty_no_apps),
                        color = cs.onSurfaceVariant,
                        fontSize = 13.sp
                    )
                }
            } else {
                LazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(top = 2.dp, bottom = 88.dp)
                ) {
                    items(items = filteredApps, key = { it.packageName }) { app ->
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
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppIconItem(
                                packageName = app.packageName,
                                label = app.label,
                                iconLoader = iconLoader,
                                size = 38.dp
                            )

                            Spacer(modifier = Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = app.label,
                                    color = cs.onBackground,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Text(
                                    text = app.packageName,
                                    color = cs.onSurfaceVariant,
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
                                    checkedTrackColor = selectedAccent
                                )
                            )
                        }
                    }
                }
            }

            if (isDirty) {
                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(16.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(cs.surface)
                        .border(1.dp, selectedAccent, RoundedCornerShape(14.dp))
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(R.string.unsaved_changes_title),
                            color = selectedAccent,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = stringResource(R.string.unsaved_changes_subtitle, draftEnabledPackages.size),
                            color = cs.onSurfaceVariant,
                            fontSize = 10.5.sp
                        )
                    }

                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp), verticalAlignment = Alignment.CenterVertically) {
                        TextButton(
                            onClick = {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                draftEnabledPackages = savedFeaturePackages
                            }
                        ) {
                            Text(stringResource(R.string.action_reset), fontSize = 12.sp, color = cs.onSurfaceVariant)
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
                                containerColor = selectedAccent,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            if (isSyncing) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(14.dp),
                                    strokeWidth = 2.dp,
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(stringResource(R.string.action_applying), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                            } else {
                                Text(stringResource(R.string.action_save_changes), fontSize = 12.sp, fontWeight = FontWeight.Bold)
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
    activeColor: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
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
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = activeColor.copy(alpha = 0.18f),
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
