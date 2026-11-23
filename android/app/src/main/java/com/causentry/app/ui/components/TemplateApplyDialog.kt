package com.causentry.app.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import com.causentry.app.ui.theme.LocalCausentryColors

private enum class ApplyAppFilter {
    ACTIVE,
    ALL,
    USER,
    SYSTEM,
    SELECTED
}

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
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    val alreadyActive = remember(allApps, templateName) {
        allApps.filter { it.hideTemplate == templateName }.map { it.packageName }.toSet()
    }
    var selectedPackages by remember(templateName) {
        mutableStateOf(alreadyActive + initialSelected.toSet())
    }
    var searchQuery by remember { mutableStateOf("") }
    var appFilter by remember { mutableStateOf(ApplyAppFilter.ALL) }

    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }
    val toAdd = remember(selectedPackages, alreadyActive) { selectedPackages.filter { it !in alreadyActive } }
    val toRemove = remember(selectedPackages, alreadyActive) { alreadyActive.filter { it !in selectedPackages } }
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
            } else true
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
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(24.dp))
        ) {
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp, bottom = 8.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Apply Template", color = cs.onSurface, fontSize = 17.sp, fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(cs.primary.copy(alpha = 0.16f))
                                    .border(1.dp, cs.primary.copy(alpha = 0.5f), RoundedCornerShape(6.dp))
                                    .padding(horizontal = 8.dp, vertical = 2.dp)
                            ) {
                                Text(templateName, color = cs.primary, fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text("Cloak ${templatePackages.size} package(s) per app", color = cs.onSurfaceVariant, fontSize = 11.sp)
                    }
                    IconButton(onClick = onDismiss) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Close",
                            tint = cs.onSurfaceVariant,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(ext.surfaceHigh)
                        .border(1.dp, ext.border, RoundedCornerShape(10.dp))
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SummaryStat(alreadyActive.size.toString(), "active now", ext.success, Modifier.weight(1f))
                    SummaryDivider()
                    SummaryStat("+${toAdd.size}", "to enable", cs.primary, Modifier.weight(1f))
                    SummaryDivider()
                    SummaryStat("\u2212${toRemove.size}", "to disable", ext.warning, Modifier.weight(1f))
                }
            }

            HorizontalDivider(color = ext.border)

            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)) {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Search apps…", color = cs.onSurfaceVariant, fontSize = 13.sp) },
                    singleLine = true,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = null,
                            tint = cs.onSurfaceVariant,
                            modifier = Modifier.size(16.dp)
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_close),
                                    contentDescription = "Clear search",
                                    tint = cs.onSurfaceVariant,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = cs.primary,
                        unfocusedBorderColor = ext.border,
                        focusedContainerColor = ext.surfaceHigh,
                        unfocusedContainerColor = ext.surfaceHigh,
                        focusedTextColor = cs.onSurface,
                        unfocusedTextColor = cs.onSurface
                    )
                )

                Spacer(modifier = Modifier.height(6.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    ApplyFilterChip("Active", alreadyActive.size, appFilter == ApplyAppFilter.ACTIVE, { appFilter = ApplyAppFilter.ACTIVE }, ext.success)
                    ApplyFilterChip("All", allApps.size, appFilter == ApplyAppFilter.ALL, { appFilter = ApplyAppFilter.ALL })
                    ApplyFilterChip("User", userCount, appFilter == ApplyAppFilter.USER, { appFilter = ApplyAppFilter.USER })
                    ApplyFilterChip("System", systemCount, appFilter == ApplyAppFilter.SYSTEM, { appFilter = ApplyAppFilter.SYSTEM })
                    ApplyFilterChip("Selected", toAdd.size, appFilter == ApplyAppFilter.SELECTED, { appFilter = ApplyAppFilter.SELECTED })
                }

                Spacer(modifier = Modifier.height(6.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${selectedPackages.size} app(s) will use this template",
                        color = if (hasChanges) cs.primary else cs.onSurfaceVariant,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.weight(1f)
                    )
                    TextAction("Select all (${filteredApps.size})", cs.primary, filteredApps.isNotEmpty()) {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        selectedPackages = selectedPackages + filteredApps.map { it.packageName }
                    }
                    TextAction("Reset", cs.onSurfaceVariant, hasChanges) {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        selectedPackages = alreadyActive
                    }
                }

                if (selectedSystemCount > 0) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "$selectedSystemCount system app(s) selected — cloaking system apps may destabilise the device.",
                        color = ext.warning,
                        fontSize = 11.sp
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(ext.surfaceHigh)
                    .border(1.dp, ext.border, RoundedCornerShape(14.dp))
            ) {
                if (filteredApps.isEmpty()) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text(
                            text = if (appFilter == ApplyAppFilter.ACTIVE) "No app uses this template yet" else "No applications found",
                            color = cs.onSurfaceVariant,
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
                                    selectedPackages = if (checked) selectedPackages + app.packageName else selectedPackages - app.packageName
                                }
                            )
                        }
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 12.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = onDismiss,
                    modifier = Modifier.weight(0.4f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = cs.onSurfaceVariant),
                    border = BorderStroke(1.dp, ext.border)
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
                    modifier = Modifier.weight(0.6f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = cs.primary,
                        contentColor = cs.onPrimary,
                        disabledContainerColor = cs.primary.copy(alpha = 0.30f)
                    )
                ) {
                    Text(
                        text = when {
                            !hasChanges -> "No changes"
                            toAdd.isNotEmpty() && toRemove.isNotEmpty() -> "Apply · +${toAdd.size} \u2212${toRemove.size}"
                            toAdd.isNotEmpty() -> "Enable on ${toAdd.size} app(s)"
                            else -> "Disable on ${toRemove.size} app(s)"
                        },
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
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

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
                checkedColor = cs.primary,
                uncheckedColor = cs.onSurfaceVariant,
                checkmarkColor = cs.onPrimary
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        AppIconItem(packageName = app.packageName, label = app.label, iconLoader = iconLoader, size = 34.dp)
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(app.label, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
            Spacer(modifier = Modifier.height(2.dp))
            Text(app.packageName, color = cs.onSurfaceVariant, fontSize = 11.sp, fontFamily = FontFamily.Monospace, maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column(horizontalAlignment = Alignment.End) {
            if (isActive) {
                StatusBadge("ACTIVE", ext.success)
            } else if (isChecked) {
                StatusBadge("NEW", cs.primary)
            }
            if (app.isProtected) {
                Spacer(modifier = Modifier.height(4.dp))
                StatusBadge("PROTECTED", cs.onSurfaceVariant)
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
        Text(text, color = color, fontSize = 9.sp, fontWeight = FontWeight.Bold, letterSpacing = 0.4.sp)
    }
}

@Composable
private fun SummaryStat(value: String, label: String, tint: Color, modifier: Modifier = Modifier) {
    val cs = MaterialTheme.colorScheme
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = value, color = tint, fontSize = 17.sp, fontWeight = FontWeight.Bold)
        Text(text = label, color = cs.onSurfaceVariant, fontSize = 10.sp)
    }
}

@Composable
private fun SummaryDivider() {
    val ext = LocalCausentryColors.current
    Box(modifier = Modifier.width(1.dp).height(26.dp).background(ext.border))
}

@Composable
private fun TextAction(text: String, tint: Color, enabled: Boolean, onClick: () -> Unit) {
    val alpha = if (enabled) 1f else 0.4f
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(enabled = enabled) { onClick() }
            .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Text(text, color = tint.copy(alpha = alpha), fontSize = 11.sp, fontWeight = FontWeight.SemiBold, maxLines = 1)
    }
}

@Composable
private fun ApplyFilterChip(
    label: String,
    count: Int,
    selected: Boolean,
    onClick: () -> Unit,
    accent: Color = MaterialTheme.colorScheme.primary
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(9.dp))
            .background(if (selected) accent.copy(alpha = 0.18f) else cs.surface)
            .border(1.dp, if (selected) accent else ext.border, RoundedCornerShape(9.dp))
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 8.dp, vertical = 6.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$label $count",
            fontSize = 10.5.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
            color = if (selected) accent else cs.onSurfaceVariant,
            maxLines = 1
        )
    }
}
