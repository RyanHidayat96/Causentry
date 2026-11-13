package com.causentry.app.ui.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.causentry.app.ui.theme.WarningAmber

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

    val currentRoots = remember(status.storageHiddenRoots) {
        (DEFAULT_ROOT_NAMES + status.storageHiddenRoots).sorted()
    }
    val currentRelatives = remember(status.storageHiddenRelatives) {
        (DEFAULT_RELATIVE_PATHS + status.storageHiddenRelatives).sorted()
    }

    var showAddDialog by remember { mutableStateOf(false) }
    var inputPath by remember { mutableStateOf("") }
    var isSaving by remember { mutableStateOf(false) }

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
                .padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Protection Scope: ${status.targets.size} App(s)",
                    color = TextPrimary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = "Protected apps receive ENOENT (file absent) on cloaked paths",
                    color = TextSecondary,
                    fontSize = 10.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Cloaked Root Entries
        Text(
            text = "Root Entries (${currentRoots.size})",
            color = TextPrimary,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(6.dp))

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            currentRoots.forEach { name ->
                val isDefault = DEFAULT_ROOT_NAMES.contains(name)
                PathChipItem(
                    name = name,
                    isDefault = isDefault,
                    onDelete = {
                        val updated = status.storageHiddenRoots - name
                        onSaveStorageRules(updated, status.storageHiddenRelatives)
                        Toast.makeText(context, "Removed $name", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Cloaked Relative Paths
        Text(
            text = "Relative Paths (${currentRelatives.size})",
            color = TextPrimary,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(6.dp))

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            currentRelatives.forEach { path ->
                val isDefault = DEFAULT_RELATIVE_PATHS.contains(path)
                PathChipItem(
                    name = path,
                    isDefault = isDefault,
                    onDelete = {
                        val updated = status.storageHiddenRelatives - path
                        onSaveStorageRules(status.storageHiddenRoots, updated)
                        Toast.makeText(context, "Removed $path", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    showAddDialog = true
                },
                modifier = Modifier
                    .weight(1f)
                    .height(44.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text("+ Add Custom Path", fontSize = 12.sp, fontWeight = FontWeight.Bold)
            }

            OutlinedButton(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                    onSaveStorageRules(emptyList(), emptyList())
                    Toast.makeText(context, "Restored default storage paths", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.height(44.dp),
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, BorderDark),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary)
            ) {
                Text("Reset Defaults", fontSize = 12.sp, fontWeight = FontWeight.Medium)
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
            color = if (isDefault) TextPrimary else PrimaryBlue,
            fontSize = 11.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Medium
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
