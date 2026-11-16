package com.causentry.app.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.causentry.app.R
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

private enum class ApplyAppFilter {
    ACTIVE,
    ALL,
    USER,
    SYSTEM,
    SELECTED
}

/**
 * Lets the user "implement" an existing hidden-app template onto a chosen set of apps
 * (one app, a hand-picked subset, or every app at once) AND lets them disable the
 * template on apps that already use it -- all from one place.
 *
 * The selection is seeded from the apps that already carry this template
 * (AppInfo.hideTemplate == templateName), so they appear pre-checked under the
 * "Active" tab. Unchecking one of them detaches the template on Apply; checking a new
 * app attaches it. Nothing is applied until the user presses Apply, and the add +
 * remove are persisted atomically in a single config write (no flicker).
 */
@Composable
fun TemplateApplyDialog(
    templateName: String,
    templatePackages: List<String>,
    allApps: List<AppInfo>,
    iconLoader: IconLoader,
    initialSelected: List<String> = emptyList(),
    onApply: (toAdd: List<String>, toRemove: List<String>) -> Unit,
    onDismiss: () -> Unit
) {
    // Apps that ALREADY have this template applied -- source of truth for the "Active"
    // section and for computing what the user un-checked.
    val alreadyActive = remember(allApps, templateName) {
        allApps.filter { it.hideTemplate == templateName }
            .map { it.packageName }
            .toSet()
    }

    // Selection = "should use this template after Apply". Seeded from the apps that
    // already use it (plus any explicit initial selection), so unchecking an active app
    // means "detach it".
    var selectedPackages by remember(templateName) {
        mutableStateOf(alreadyActive + initialSelected.toSet())
    }
    var searchQuery by remember { mutableStateOf("") }
    var appFilter by remember { mutableStateOf(ApplyAppFilter.ALL) }

    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }

    val toAdd = remember(selectedPackages, alreadyActive) {
        selectedPackages.filter { it !in alreadyActive }
    }
    val toRemove = remember(selectedPackages, alreadyActive) {
        alreadyActive.filter { it !in selectedPackages }
    }
    val selectedSystemCount = remember(selectedPackages, allApps) {
        allApps.count { selectedPackages.contains(it.packageName) && it.isSystem }
    }

    val filteredApps = remember(allApps, searchQuery, appFilter, selectedPackages, alreadyActive) {
        val q = searchQuery.trim().lowercase()
        allApps.filter { app ->
            val matchesCategory = when (appFilter) {
                ApplyAppFilter.ALL -> true
                ApplyAppFilter.ACTIVE -> alreadyActive.contains(app.packageName)
                ApplyAppFilter.SELECTED -> selectedPackages.contains(app.packageName)
                ApplyAppFilter.USER -> !app.isSystem
                ApplyAppFilter.SYSTEM -> app.isSystem
            }
            if (!matchesCategory) return@filter false
            if (q.isNotEmpty()) {
                app.label.lowercase().contains(q) || app.packageName.lowercase().contains(q)
            } else {
                true
            }
        // Already-active apps first (so the user immediately sees what currently uses
        // this template and can toggle it off); then alphabetical.
        }.sortedWith(
            compareByDescending<AppInfo> { alreadyActive.contains(it.packageName) }
                .thenBy { it.label.lowercase() }
        )
    }

    val haptic = LocalHapticFeedback.current
    val hasChanges = toAdd.isNotEmpty() || toRemove.isNotEmpty()

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.96f)
                .fillMaxHeight(0.94f)
                .clip(RoundedCornerShape(24.dp))
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(24.dp))
        ) {
            // ---------- Header (compact) ----------
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 11.dp, bottom = 7.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Apply Template",
                                color = TextPrimary,
                                fontSize = 17.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(PrimaryBlue.copy(alpha = 0.16f))
                                    .border(1.dp, PrimaryBlue.copy(alpha = 0.5f), RoundedCornerShape(6.dp))
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = templateName,
                                    color = PrimaryBlue,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Cloak ${templatePackages.size} package(s) per app",
                            color = TextSecondary,
                            fontSize = 11.sp
                        )
                    }
                    IconButton(onClick = onDismiss, modifier = Modifier.size(30.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Close",
                            tint = TextSecondary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Summary strip: active count + pending add/remove (compact)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(10.dp))
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SummaryStat(
                        value = alreadyActive.size.toString(),
                        label = "active now",
                        tint = SuccessGreen,
                        modifier = Modifier.weight(1f)
                    )
                    SummaryDivider()
                    SummaryStat(
                        value = "+${toAdd.size}",
                        label = "to enable",
                        tint = PrimaryBlue,
                        modifier = Modifier.weight(1f)
                    )
                    SummaryDivider()
                    SummaryStat(
                        value = "\u2212${toRemove.size}",
                        label = "to disable",
                        tint = WarningAmber,
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            HorizontalDivider(color = BorderDark)

            // ---------- Controls (compact) ----------
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Search apps\u2026", color = TextSecondary, fontSize = 13.sp) },
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
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_close),
                                    contentDescription = "Clear search",
                                    tint = TextSecondary,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PrimaryBlue,
                        unfocusedBorderColor = BorderDark,
                        focusedContainerColor = SurfaceHighDark,
                        unfocusedContainerColor = SurfaceHighDark,
                        focusedTextColor = TextPrimary,
                        unfocusedTextColor = TextPrimary
                    )
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Filter chips (Active first -- apps that already use this template)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    ApplyFilterChip(
                        label = "Active",
                        count = alreadyActive.size,
                        selected = appFilter == ApplyAppFilter.ACTIVE,
                        accent = SuccessGreen,
                        onClick = { appFilter = ApplyAppFilter.ACTIVE }
                    )
                    ApplyFilterChip(
                        label = "All",
                        count = allApps.size,
                        selected = appFilter == ApplyAppFilter.ALL,
                        onClick = { appFilter = ApplyAppFilter.ALL }
                    )
                    ApplyFilterChip(
                        label = "User",
                        count = userCount,
                        selected = appFilter == ApplyAppFilter.USER,
                        onClick = { appFilter = ApplyAppFilter.USER }
                    )
                    ApplyFilterChip(
                        label = "System",
                        count = systemCount,
                        selected = appFilter == ApplyAppFilter.SYSTEM,
                        onClick = { appFilter = ApplyAppFilter.SYSTEM }
                    )
                    ApplyFilterChip(
                        label = "Selected",
                        count = toAdd.size,
                        selected = appFilter == ApplyAppFilter.SELECTED,
                        onClick = { appFilter = ApplyAppFilter.SELECTED }
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Bulk controls
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${selectedPackages.size} app(s) will use this template",
                        color = if (hasChanges) PrimaryBlue else TextSecondary,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.weight(1f)
                    )
                    TextAction(
                        text = "Select all (${filteredApps.size})",
                        tint = PrimaryBlue,
                        enabled = filteredApps.isNotEmpty(),
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            selectedPackages = selectedPackages + filteredApps.map { it.packageName }
                        }
                    )
                    TextAction(
                        text = "Reset",
                        tint = TextSecondary,
                        enabled = hasChanges,
                        onClick = {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            selectedPackages = alreadyActive
                        }
                    )
                }

                if (selectedSystemCount > 0) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "\u26A0 $selectedSystemCount system app(s) selected \u2014 cloaking system apps may destabilise the device.",
                        color = WarningAmber,
                        fontSize = 11.sp
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))
            }

            // ---------- App list ----------
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(SurfaceHighDark)
                    .border(1.dp, BorderDark, RoundedCornerShape(14.dp))
            ) {
                if (filteredApps.isEmpty()) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            text = if (appFilter == ApplyAppFilter.ACTIVE) {
                                "No app uses this template yet"
                            } else {
                                "No applications found"
                            },
                            color = TextSecondary,
                            fontSize = 13.sp
                        )
                    }
                } else {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(filteredApps, key = { it.packageName }) { app ->
                            val isChecked = selectedPackages.contains(app.packageName)
                            val isActive = alreadyActive.contains(app.packageName)
                            AppSelectRow(
                                app = app,
                                iconLoader = iconLoader,
                                isChecked = isChecked,
                                isActive = isActive,
                                onToggle = { checked ->
                                    selectedPackages = if (checked) {
                                        selectedPackages + app.packageName
                                    } else {
                                        selectedPackages - app.packageName
                                    }
                                }
                            )
                        }
                    }
                }
            }

            // ---------- Footer ----------
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 9.dp, bottom = 11.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = onDismiss,
                    modifier = Modifier.weight(0.4f).height(44.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary),
                    border = BorderStroke(1.dp, BorderDark)
                ) {
                    Text("Cancel", fontSize = 14.sp, fontWeight = FontWeight.Medium)
                }

                Button(
                    onClick = {
                        if (hasChanges) {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            onApply(toAdd, toRemove)
                            onDismiss()
                        }
                    },
                    enabled = hasChanges,
                    modifier = Modifier.weight(0.6f).height(44.dp),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PrimaryBlue,
                        disabledContainerColor = PrimaryBlue.copy(alpha = 0.30f)
                    )
                ) {
                    Text(
                        text = when {
                            !hasChanges -> "No changes"
                            toAdd.isNotEmpty() && toRemove.isNotEmpty() -> "Apply \u00B7 +${toAdd.size} \u2212${toRemove.size}"
                            toAdd.isNotEmpty() -> "Enable on ${toAdd.size} app(s)"
                            else -> "Disable on ${toRemove.size} app(s)"
                        },
                        color = if (hasChanges) TextPrimary else TextSecondary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
private fun AppSelectRow(
    app: AppInfo,
    iconLoader: IconLoader,
    isChecked: Boolean,
    isActive: Boolean,
    onToggle: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onToggle(!isChecked) }
            .padding(horizontal = 12.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = onToggle,
            colors = CheckboxDefaults.colors(
                checkedColor = PrimaryBlue,
                uncheckedColor = TextSecondary,
                checkmarkColor = TextPrimary
            )
        )

        Spacer(modifier = Modifier.width(4.dp))

        AppIconItem(
            packageName = app.packageName,
            label = app.label,
            iconLoader = iconLoader,
            size = 34.dp
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = app.label,
                color = TextPrimary,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = app.packageName,
                color = TextSecondary,
                fontSize = 11.sp,
                fontFamily = FontFamily.Monospace,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        // Status badges: ACTIVE (already uses this template) / NEW (being enabled) /
        // PROTECTED (app has other protections on).
        Column(horizontalAlignment = Alignment.End) {
            if (isActive) {
                StatusBadge(text = "ACTIVE", color = SuccessGreen)
            } else if (isChecked) {
                StatusBadge(text = "NEW", color = PrimaryBlue)
            }
            if (app.isProtected) {
                Spacer(modifier = Modifier.height(4.dp))
                StatusBadge(text = "PROTECTED", color = TextSecondary)
            }
        }
    }
}

@Composable
private fun StatusBadge(text: String, color: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(color.copy(alpha = 0.14f))
            .padding(horizontal = 6.dp, vertical = 2.dp)
    ) {
        Text(
            text = text,
            color = color,
            fontSize = 9.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.4.sp
        )
    }
}

@Composable
private fun SummaryStat(
    value: String,
    label: String,
    tint: Color,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, color = tint, fontSize = 17.sp, fontWeight = FontWeight.Bold)
        Text(text = label, color = TextSecondary, fontSize = 10.sp)
    }
}

@Composable
private fun SummaryDivider() {
    Box(
        modifier = Modifier
            .width(1.dp)
            .height(26.dp)
            .background(BorderDark)
    )
}

@Composable
private fun TextAction(
    text: String,
    tint: Color,
    enabled: Boolean,
    onClick: () -> Unit
) {
    val alpha = if (enabled) 1f else 0.4f
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(enabled = enabled) { onClick() }
            .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            color = tint.copy(alpha = alpha),
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1
        )
    }
}

@Composable
private fun ApplyFilterChip(
    label: String,
    count: Int,
    selected: Boolean,
    onClick: () -> Unit,
    accent: Color = PrimaryBlue
) {
    val haptic = LocalHapticFeedback.current

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(9.dp))
            .background(if (selected) accent.copy(alpha = 0.18f) else SurfaceDark)
            .border(1.dp, if (selected) accent else BorderDark, RoundedCornerShape(9.dp))
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 7.dp, vertical = 5.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$label $count",
            fontSize = 10.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
            color = if (selected) accent else TextSecondary,
            maxLines = 1
        )
    }
}
