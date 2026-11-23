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

enum class TemplateAppFilter {
    ALL,
    SELECTED,
    USER,
    SYSTEM
}

@Composable
fun TemplateEditorDialog(
    initialName: String = "",
    initialPackages: List<String> = emptyList(),
    allApps: List<AppInfo>,
    iconLoader: IconLoader,
    onSave: (name: String, packages: List<String>) -> Unit,
    onDismiss: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    var templateName by remember { mutableStateOf(initialName) }
    var selectedPackages by remember { mutableStateOf(initialPackages.toSet()) }
    var searchQuery by remember { mutableStateOf("") }
    var appFilter by remember { mutableStateOf(TemplateAppFilter.ALL) }

    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }

    val filteredApps = remember(allApps, searchQuery, appFilter, selectedPackages) {
        val q = searchQuery.trim().lowercase()
        allApps.filter { app ->
            val matchesCategory = when (appFilter) {
                TemplateAppFilter.ALL -> true
                TemplateAppFilter.SELECTED -> selectedPackages.contains(app.packageName)
                TemplateAppFilter.USER -> !app.isSystem
                TemplateAppFilter.SYSTEM -> app.isSystem
            }
            if (!matchesCategory) return@filter false
            if (q.isNotEmpty()) {
                app.label.lowercase().contains(q) || app.packageName.lowercase().contains(q)
            } else true
        }.sortedWith(
            compareByDescending<AppInfo> { selectedPackages.contains(it.packageName) }
                .thenBy { it.label.lowercase() }
        )
    }

    val isNameValid = templateName.isNotBlank()
    val haptic = LocalHapticFeedback.current

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.86f)
                .clip(RoundedCornerShape(20.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(20.dp))
                .padding(20.dp)
        ) {
            Text(
                text = if (initialName.isEmpty()) "Create Template" else "Edit Template: $initialName",
                color = cs.onSurface,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Select apps to cloak from target package queries (${selectedPackages.size} selected)",
                color = cs.onSurfaceVariant,
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                value = templateName,
                onValueChange = { templateName = it.replace(Regex("[^a-zA-Z0-9_.-]"), "") },
                placeholder = { Text("Template Name (e.g. banking, games)", color = cs.onSurfaceVariant, fontSize = 13.sp) },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = cs.primary,
                    unfocusedBorderColor = ext.border,
                    focusedContainerColor = ext.surfaceHigh,
                    unfocusedContainerColor = ext.surfaceHigh,
                    focusedTextColor = cs.onSurface,
                    unfocusedTextColor = cs.onSurface
                ),
                supportingText = if (!isNameValid) {
                    { Text("Name is required to save template", color = ext.warning, fontSize = 10.sp) }
                } else null
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Filter apps to cloak…", color = cs.onSurfaceVariant, fontSize = 13.sp) },
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
                                contentDescription = "Clear",
                                tint = cs.onSurfaceVariant,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = cs.primary,
                    unfocusedBorderColor = ext.border,
                    focusedContainerColor = ext.surfaceHigh,
                    unfocusedContainerColor = ext.surfaceHigh,
                    focusedTextColor = cs.onSurface,
                    unfocusedTextColor = cs.onSurface
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TemplateFilterChipItem("All", allApps.size, appFilter == TemplateAppFilter.ALL) { appFilter = TemplateAppFilter.ALL }
                TemplateFilterChipItem("Selected", selectedPackages.size, appFilter == TemplateAppFilter.SELECTED) { appFilter = TemplateAppFilter.SELECTED }
                TemplateFilterChipItem("User", userCount, appFilter == TemplateAppFilter.USER) { appFilter = TemplateAppFilter.USER }
                TemplateFilterChipItem("System", systemCount, appFilter == TemplateAppFilter.SYSTEM) { appFilter = TemplateAppFilter.SYSTEM }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(ext.surfaceHigh)
                    .border(1.dp, ext.border, RoundedCornerShape(10.dp))
            ) {
                if (filteredApps.isEmpty()) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Text("No applications found", color = cs.onSurfaceVariant, fontSize = 13.sp)
                    }
                } else {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(filteredApps, key = { it.packageName }) { app ->
                            val isChecked = selectedPackages.contains(app.packageName)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        selectedPackages = if (isChecked) selectedPackages - app.packageName else selectedPackages + app.packageName
                                    }
                                    .padding(horizontal = 12.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Checkbox(
                                    checked = isChecked,
                                    onCheckedChange = { checked ->
                                        selectedPackages = if (checked) selectedPackages + app.packageName else selectedPackages - app.packageName
                                    },
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = cs.primary,
                                        uncheckedColor = cs.onSurfaceVariant,
                                        checkmarkColor = cs.onPrimary
                                    )
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                AppIconItem(packageName = app.packageName, label = app.label, iconLoader = iconLoader, size = 36.dp)
                                Spacer(modifier = Modifier.width(10.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(app.label, color = cs.onSurface, fontSize = 14.sp, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                    Text(app.packageName, color = cs.onSurfaceVariant, fontSize = 11.sp, fontFamily = FontFamily.Monospace, maxLines = 1, overflow = TextOverflow.Ellipsis)
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = onDismiss,
                    modifier = Modifier.weight(1f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = cs.onSurfaceVariant),
                    border = BorderStroke(1.dp, ext.border)
                ) {
                    Text("Cancel", fontSize = 14.sp, fontWeight = FontWeight.Medium)
                }

                Button(
                    onClick = {
                        val name = templateName.trim()
                        if (name.isNotEmpty()) {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            onSave(name, selectedPackages.toList())
                            onDismiss()
                        }
                    },
                    enabled = isNameValid,
                    modifier = Modifier.weight(1f).height(48.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = cs.primary,
                        contentColor = cs.onPrimary,
                        disabledContainerColor = cs.primary.copy(alpha = 0.35f)
                    )
                ) {
                    Text(
                        text = if (selectedPackages.isNotEmpty()) "Save (${selectedPackages.size})" else "Save",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1
                    )
                }
            }
        }
    }
}

@Composable
private fun TemplateFilterChipItem(
    label: String,
    count: Int,
    selected: Boolean,
    onClick: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(if (selected) cs.primary.copy(alpha = 0.18f) else cs.surface)
            .border(1.dp, if (selected) cs.primary else ext.border, RoundedCornerShape(8.dp))
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 8.dp, vertical = 6.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "$label ($count)",
            fontSize = 11.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
            color = if (selected) cs.primary else cs.onSurfaceVariant,
            maxLines = 1
        )
    }
}
