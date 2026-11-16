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
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary

private val DEFAULT_ROOT_NAMES = setOf(
    "MT2", "TWRP", "Fox", "su", "daemonsu", ".magisk", "busybox",
    "TitaniumBackup", "SwiftBackup", "xinhao"
)

private val DEFAULT_RELATIVE_PATHS = setOf(
    "Download/KernelSU", "Download/Magisk", "Download/APatch"
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun StorageCloakCard(
    status: DaemonStatus,
    onSaveStorageRules: (roots: List<String>, relatives: List<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val haptic = LocalHapticFeedback.current

    val customRoots = remember(status.storageHiddenRoots) {
        status.storageHiddenRoots.filter { !DEFAULT_ROOT_NAMES.contains(it) }.sorted()
    }
    val customRelatives = remember(status.storageHiddenRelatives) {
        status.storageHiddenRelatives.filter { !DEFAULT_RELATIVE_PATHS.contains(it) }.sorted()
    }
    val totalCustomCount = customRoots.size + customRelatives.size

    val allDefaultRoots = remember { DEFAULT_ROOT_NAMES.sorted() }
    val allDefaultRelatives = remember { DEFAULT_RELATIVE_PATHS.sorted() }
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
                    color = TextPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp
                )
            },
            text = {
                Column {
                    Text(
                        text = "Enter a first-level folder name (e.g. 'private') or relative path (e.g. 'Download/my_folder'). Paths containing '/' are treated as relative subpaths.",
                        color = TextSecondary,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = inputPath,
                        onValueChange = { inputPath = it },
                        placeholder = { Text("e.g. Download/secret", color = TextSecondary, fontSize = 13.sp) },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = PrimaryBlue,
                            unfocusedBorderColor = BorderDark,
                            focusedContainerColor = SurfaceHighDark,
                            unfocusedContainerColor = SurfaceHighDark,
                            focusedTextColor = TextPrimary,
                            unfocusedTextColor = TextPrimary
                        )
                    )
                }
            },
            containerColor = SurfaceDark,
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
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
                ) {
                    Text("Add Path", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    showAddDialog = false
                    inputPath = ""
                }) {
                    Text("Cancel", color = TextSecondary)
                }
            }
        )
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(SurfaceDark)
            .border(1.dp, BorderDark, RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        // Header
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
                    tint = PrimaryBlue,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "FUSE Storage Cloak",
                        color = TextPrimary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "/storage/emulated/0 filesystem hook",
                        color = TextSecondary,
                        fontSize = 11.sp
                    )
                }
            }

            StatusPill(
                text = if (status.fuseCovered) "COVERED" else if (status.fuseActive) "ACTIVE" else "STANDBY",
                color = if (status.fuseCovered || status.fuseActive) SuccessGreen else PrimaryBlue
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Scope description banner
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(SurfaceHighDark)
                .padding(horizontal = 12.dp, vertical = 9.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Protection Scope: ${status.targets.size} Protected App(s)",
                    color = TextPrimary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Target apps observe virtual file absence (ENOENT) on cloaked paths",
                    color = TextSecondary,
                    fontSize = 11.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Custom Rules Section
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Custom Rules ($totalCustomCount)",
                color = TextPrimary,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
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
                color = TextSecondary.copy(alpha = 0.8f),
                fontSize = 11.5.sp,
                lineHeight = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Built-in System Rules (Collapsible accordion)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .clickable {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    showDefaultRules = !showDefaultRules
                }
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Built-in System Rules ($totalDefaultCount)",
                color = TextPrimary,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = if (showDefaultRules) "Hide Rules ▴" else "Show All ▾",
                color = PrimaryBlue,
                fontSize = 11.5.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = Modifier.height(6.dp))

        if (!showDefaultRules) {
            // Collapsed preview: show first 4 chips + more pill
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
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(8.dp))
                        .clickable { showDefaultRules = true }
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "+${totalDefaultCount - 4} more…",
                        color = PrimaryBlue,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        } else {
            // Expanded view
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

        // Action Buttons
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
                    .height(42.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text("+ Add Path", fontSize = 12.sp, fontWeight = FontWeight.Bold, maxLines = 1)
            }

            OutlinedButton(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    onSaveStorageRules(emptyList(), emptyList())
                    Toast.makeText(context, "Restored default storage paths", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.height(42.dp),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, BorderDark),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary)
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
    val haptic = LocalHapticFeedback.current

    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(SurfaceHighDark)
            .border(
                1.dp,
                if (isDefault) BorderDark else PrimaryBlue.copy(alpha = 0.5f),
                RoundedCornerShape(8.dp)
            )
            .padding(start = 8.dp, end = if (isDefault) 8.dp else 4.dp, top = 4.dp, bottom = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            color = if (isDefault) TextSecondary else PrimaryBlue,
            fontSize = 11.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = if (isDefault) FontWeight.Normal else FontWeight.Medium
        )

        if (!isDefault) {
            Spacer(modifier = Modifier.width(4.dp))
            Box(
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
                    .clickable {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onDelete()
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close),
                    contentDescription = "Remove",
                    tint = DangerRed,
                    modifier = Modifier.size(12.dp)
                )
            }
        }
    }
}
