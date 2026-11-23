package com.causentry.app.ui.components

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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

private enum class AppCategoryFilter {
    ALL,
    USER,
    SYSTEM,
    PROTECTED
}

@Composable
fun ForensicAppPickerDialog(
    allApps: List<AppInfo>,
    currentPackage: String?,
    iconLoader: IconLoader,
    onSelectPackage: (String?) -> Unit,
    onDismiss: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current
    var searchQuery by remember { mutableStateOf("") }
    var categoryFilter by remember { mutableStateOf(AppCategoryFilter.ALL) }

    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }
    val protectedCount = remember(allApps) { allApps.count { it.isProtected } }

    val filteredApps = remember(allApps, searchQuery, categoryFilter) {
        val q = searchQuery.trim().lowercase()
        allApps.filter { app ->
            val matchesCategory = when (categoryFilter) {
                AppCategoryFilter.ALL -> true
                AppCategoryFilter.USER -> !app.isSystem
                AppCategoryFilter.SYSTEM -> app.isSystem
                AppCategoryFilter.PROTECTED -> app.isProtected
            }
            if (!matchesCategory) return@filter false
            if (q.isNotEmpty()) {
                app.label.lowercase().contains(q) || app.packageName.lowercase().contains(q)
            } else true
        }.sortedWith(
            compareByDescending<AppInfo> { it.packageName == currentPackage }
                .thenByDescending { it.isProtected }
                .thenBy { it.label.lowercase() }
        )
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.85f)
                .clip(RoundedCornerShape(20.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(20.dp))
                .padding(18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Filter Logs by App", color = cs.onSurface, fontSize = 17.sp, fontWeight = FontWeight.Bold)
                    Text("Select an application to inspect live process logs", color = cs.onSurfaceVariant, fontSize = 12.sp)
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

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("Search by app name or package…", color = cs.onSurfaceVariant.copy(alpha = 0.7f), fontSize = 12.sp) },
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
                                modifier = Modifier.size(14.dp)
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
                CategoryChip("All", allApps.size, categoryFilter == AppCategoryFilter.ALL) { categoryFilter = AppCategoryFilter.ALL }
                CategoryChip("Protected", protectedCount, categoryFilter == AppCategoryFilter.PROTECTED) { categoryFilter = AppCategoryFilter.PROTECTED }
                CategoryChip("User", userCount, categoryFilter == AppCategoryFilter.USER) { categoryFilter = AppCategoryFilter.USER }
                CategoryChip("System", systemCount, categoryFilter == AppCategoryFilter.SYSTEM) { categoryFilter = AppCategoryFilter.SYSTEM }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(ext.surfaceHigh)
                    .border(1.dp, ext.border, RoundedCornerShape(12.dp))
            ) {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    item {
                        val isGlobalSelected = currentPackage == null
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    onSelectPackage(null)
                                    onDismiss()
                                }
                                .background(if (isGlobalSelected) cs.primary.copy(alpha = 0.14f) else ext.surfaceHigh)
                                .padding(horizontal = 14.dp, vertical = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(36.dp)
                                    .clip(CircleShape)
                                    .background(cs.surface),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_refresh),
                                    contentDescription = null,
                                    tint = if (isGlobalSelected) cs.primary else cs.onSurfaceVariant,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "All Applications (Global Stream)",
                                    color = if (isGlobalSelected) cs.primary else cs.onSurface,
                                    fontSize = 13.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Inspect all system, user, and background process events",
                                    color = cs.onSurfaceVariant,
                                    fontSize = 10.sp
                                )
                            }
                            if (isGlobalSelected) {
                                Spacer(modifier = Modifier.width(8.dp))
                                StatusPill("ACTIVE", cs.primary)
                            }
                        }
                    }

                    items(filteredApps, key = { it.packageName }) { app ->
                        val isSelected = app.packageName == currentPackage
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                    onSelectPackage(app.packageName)
                                    onDismiss()
                                }
                                .background(if (isSelected) cs.primary.copy(alpha = 0.14f) else ext.surfaceHigh)
                                .padding(horizontal = 14.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            AppIconItem(packageName = app.packageName, label = app.label, iconLoader = iconLoader, size = 36.dp)
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = app.label,
                                        color = if (isSelected) cs.primary else cs.onSurface,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.SemiBold,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        modifier = Modifier.weight(1f, fill = false)
                                    )
                                    if (app.isProtected) {
                                        Spacer(modifier = Modifier.width(6.dp))
                                        StatusPill("PROTECTED", cs.primary)
                                    }
                                }
                                Text(
                                    text = app.packageName,
                                    color = cs.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontFamily = FontFamily.Monospace,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
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
private fun CategoryChip(
    label: String,
    count: Int,
    selected: Boolean,
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
                text = "$label ($count)",
                fontSize = 11.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = cs.primary.copy(alpha = 0.2f),
            selectedLabelColor = cs.primary,
            containerColor = cs.surface,
            labelColor = cs.onSurfaceVariant
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) cs.primary else ext.border
        )
    )
}
