package com.causentry.app.ui.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.theme.LocalCausentryColors

private val CANONICAL_DEFAULT_ROOTS = listOf(
    "MT2", "TWRP", "twrp", "Fox", "OrangeFox", "su", "daemonsu",
    "Magisk", "magisk", ".magisk", "SuperSU", "KernelSU", "APatch",
    "busybox", "TitaniumBackup", "SwiftBackup", "xinhao"
)

private val CANONICAL_DEFAULT_RELATIVES = listOf(
    "Download/KernelSU", "Download/KernelSU.apk", "Download/kernelsu.apk",
    "Download/Magisk", "Download/Magisk.apk", "Download/magisk.apk",
    "Download/Magisk.zip", "Download/APatch", "Download/APatch.apk",
    "TWRP/TWRP.app"
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun StorageCloakCard(
    status: DaemonStatus,
    onSaveStorageRules: (roots: List<String>, relatives: List<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val context = LocalContext.current
    val haptic = LocalHapticFeedback.current

    val allDefaultRoots = remember(status.defaultStorageRoots) {
        (if (status.defaultStorageRoots.isNotEmpty()) status.defaultStorageRoots else CANONICAL_DEFAULT_ROOTS).sorted()
    }
    val allDefaultRelatives = remember(status.defaultStorageRelatives) {
        (if (status.defaultStorageRelatives.isNotEmpty()) status.defaultStorageRelatives else CANONICAL_DEFAULT_RELATIVES).sorted()
    }
    val defaultRootSet = remember(allDefaultRoots) { allDefaultRoots.toSet() }
    val defaultRelSet = remember(allDefaultRelatives) { allDefaultRelatives.toSet() }

    val customRoots = remember(status.storageHiddenRoots, defaultRootSet) {
        status.storageHiddenRoots.filter { !defaultRootSet.contains(it) }.sorted()
    }
    val customRelatives = remember(status.storageHiddenRelatives, defaultRelSet) {
        status.storageHiddenRelatives.filter { !defaultRelSet.contains(it) }.sorted()
    }
    val totalCustomCount = customRoots.size + customRelatives.size
    val totalDefaultCount = allDefaultRoots.size + allDefaultRelatives.size

    var showDefaultRules by remember { mutableStateOf(false) }
    var showAddDialog by remember { mutableStateOf(false) }
    var inputPath by remember { mutableStateOf("") }

    if (showAddDialog) {
        AlertDialog(
            onDismissRequest = {
                showAddDialog = false
                inputPath = ""
            },
            title = {
                Text(
                    text = "Add Hidden Storage Path",
                    color = cs.onSurface,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )
            },
            text = {
                Column {
                    Text(
                        text = "Enter a first-level folder name (e.g. 'private') or relative path (e.g. 'Download/my_folder'). Paths containing '/' are treated as relative subpaths.",
                        color = cs.onSurfaceVariant,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = inputPath,
                        onValueChange = { inputPath = it },
                        placeholder = { Text("e.g. Download/secret", color = cs.onSurfaceVariant, fontSize = 13.sp) },
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
                        )
                    )
                }
            },
            containerColor = cs.surface,
            confirmButton = {
                Button(
                    onClick = {
                        val trimmed = inputPath.trim().trim('/')
                        if (trimmed.isNotEmpty()) {
                            haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                            if (trimmed.contains('/')) {
                                val updated = (status.storageHiddenRelatives + trimmed).distinct()
                                onSaveStorageRules(status.storageHiddenRoots, updated)
                            } else {
                                val updated = (status.storageHiddenRoots + trimmed).distinct()
                                onSaveStorageRules(updated, status.storageHiddenRelatives)
                            }
                            Toast.makeText(context, "Added hidden path: $trimmed", Toast.LENGTH_SHORT).show()
                            showAddDialog = false
                            inputPath = ""
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
                ) {
                    Text("Add Path", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    showAddDialog = false
                    inputPath = ""
                }) {
                    Text("Cancel", color = cs.onSurfaceVariant)
                }
            }
        )
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(cs.surface)
            .border(1.dp, ext.border, RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f, fill = false)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shield),
                    contentDescription = null,
                    tint = cs.primary,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "FUSE Storage Cloak",
                        color = cs.onSurface,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "/storage/emulated/0 filesystem hook",
                        color = cs.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
            }

            StatusPill(
                text = if (status.fuseCovered) "COVERED" else if (status.fuseActive) "ACTIVE" else "STANDBY",
                color = if (status.fuseCovered || status.fuseActive) ext.success else cs.primary
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(ext.surfaceHigh)
                .padding(horizontal = 12.dp, vertical = 9.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Protection Scope: ${status.targets.size} Protected App(s)",
                    color = cs.onSurface,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Target apps observe virtual file absence (ENOENT) on cloaked paths",
                    color = cs.onSurfaceVariant,
                    fontSize = 11.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Custom Rules ($totalCustomCount)",
            color = cs.onSurface,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(6.dp))

        if (totalCustomCount > 0) {
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                customRoots.forEach { name ->
                    PathChipItem(
                        name = name,
                        isDefault = false,
                        onDelete = {
                            val updated = status.storageHiddenRoots - name
                            onSaveStorageRules(updated, status.storageHiddenRelatives)
                            Toast.makeText(context, "Removed $name", Toast.LENGTH_SHORT).show()
                        }
                    )
                }
                customRelatives.forEach { path ->
                    PathChipItem(
                        name = path,
                        isDefault = false,
                        onDelete = {
                            val updated = status.storageHiddenRelatives - path
                            onSaveStorageRules(status.storageHiddenRoots, updated)
                            Toast.makeText(context, "Removed $path", Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            }
        } else {
            Text(
                text = "No custom paths added yet. Tap '+ Add Path' below to hide custom directories from target apps.",
                color = cs.onSurfaceVariant.copy(alpha = 0.85f),
                fontSize = 11.5.sp,
                lineHeight = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .clickable {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    showDefaultRules = !showDefaultRules
                }
                .padding(vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Built-in System Rules ($totalDefaultCount)",
                color = cs.onSurface,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = if (showDefaultRules) "Hide Rules" else "Show All",
                color = cs.primary,
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = Modifier.height(6.dp))

        if (!showDefaultRules) {
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                allDefaultRoots.take(4).forEach { name ->
                    PathChipItem(name = name, isDefault = true, onDelete = {})
                }
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(ext.surfaceHigh)
                        .border(1.dp, ext.border, RoundedCornerShape(8.dp))
                        .clickable { showDefaultRules = true }
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "+${(totalDefaultCount - 4).coerceAtLeast(0)} more…",
                        color = cs.primary,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        } else {
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                allDefaultRoots.forEach { name ->
                    PathChipItem(name = name, isDefault = true, onDelete = {})
                }
                allDefaultRelatives.forEach { path ->
                    PathChipItem(name = path, isDefault = true, onDelete = {})
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    showAddDialog = true
                },
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
            ) {
                Text("+ Add Path", fontSize = 12.sp, fontWeight = FontWeight.Bold, maxLines = 1)
            }

            OutlinedButton(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    onSaveStorageRules(emptyList(), emptyList())
                    Toast.makeText(context, "Restored default storage paths", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.height(48.dp),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, ext.border),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = cs.onSurfaceVariant)
            ) {
                Text("Reset Defaults", fontSize = 12.sp, fontWeight = FontWeight.Medium, maxLines = 1)
            }
        }
    }
}

@Composable
private fun PathChipItem(
    name: String,
    isDefault: Boolean,
    onDelete: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(ext.surfaceHigh)
            .border(
                1.dp,
                if (isDefault) ext.border else cs.primary.copy(alpha = 0.5f),
                RoundedCornerShape(8.dp)
            )
            .then(
                if (!isDefault) {
                    Modifier.clickable {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onDelete()
                    }
                } else Modifier
            )
            .padding(start = 10.dp, end = if (isDefault) 10.dp else 6.dp, top = 6.dp, bottom = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            color = if (isDefault) cs.onSurfaceVariant else cs.primary,
            fontSize = 11.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = if (isDefault) FontWeight.Normal else FontWeight.Medium
        )

        if (!isDefault) {
            Spacer(modifier = Modifier.width(6.dp))
            Box(
                modifier = Modifier
                    .size(22.dp)
                    .clip(CircleShape)
                    .background(ext.danger.copy(alpha = 0.14f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "Remove $name",
                    tint = ext.danger,
                    modifier = Modifier.size(13.dp)
                )
            }
        }
    }
}
