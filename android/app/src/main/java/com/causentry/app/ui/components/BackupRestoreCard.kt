package com.causentry.app.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.DocumentsContract
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.ConfigBackupManager
import com.causentry.app.data.ParsedBackupInfo
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.theme.LocalCausentryColors
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun BackupRestoreCard(
    status: DaemonStatus,
    backupManager: ConfigBackupManager,
    onRefresh: () -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var isExporting by remember { mutableStateOf(false) }
    var isImporting by remember { mutableStateOf(false) }
    var parsedBackup by remember { mutableStateOf<ParsedBackupInfo?>(null) }
    var replaceAllMode by remember { mutableStateOf(false) }

    val createDocumentLauncher = rememberLauncherForActivityResult(
        contract = object : ActivityResultContracts.CreateDocument("application/json") {
            override fun createIntent(context: Context, input: String): Intent {
                val intent = super.createIntent(context, input)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    try {
                        val downloadUri = Uri.parse("content://com.android.externalstorage.documents/document/primary%3ADownload")
                        intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, downloadUri)
                    } catch (_: Exception) {}
                }
                return intent
            }
        }
    ) { uri: Uri? ->
        if (uri == null) return@rememberLauncherForActivityResult
        scope.launch {
            isExporting = true
            try {
                // Offload JSON serialization & SAF stream write to Dispatchers.IO
                withContext(Dispatchers.IO) {
                    val json = backupManager.createBackupJson(status)
                    context.contentResolver.openOutputStream(uri)?.use { stream ->
                        stream.write(json.toByteArray(Charsets.UTF_8))
                    } ?: error("Unable to open output stream")
                }
                val fileName = uri.lastPathSegment?.substringAfterLast('/') ?: "Download"
                Toast.makeText(context, "Backup saved to: $fileName", Toast.LENGTH_LONG).show()
            } catch (t: Throwable) {
                Toast.makeText(context, "Save failed: ${t.message}", Toast.LENGTH_SHORT).show()
            } finally {
                isExporting = false
            }
        }
    }

    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = object : ActivityResultContracts.OpenDocument() {
            override fun createIntent(context: Context, input: Array<String>): Intent {
                val intent = super.createIntent(context, input)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    try {
                        val downloadUri = Uri.parse("content://com.android.externalstorage.documents/document/primary%3ADownload")
                        intent.putExtra(DocumentsContract.EXTRA_INITIAL_URI, downloadUri)
                    } catch (_: Exception) {}
                }
                return intent
            }
        }
    ) { uri: Uri? ->
        if (uri == null) return@rememberLauncherForActivityResult
        scope.launch {
            isImporting = true
            val result = backupManager.parseBackupUri(uri)
            isImporting = false
            result.onSuccess { info ->
                parsedBackup = info
            }.onFailure { err ->
                Toast.makeText(context, "Error: ${err.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    parsedBackup?.let { info ->
        AlertDialog(
            onDismissRequest = { parsedBackup = null },
            title = {
                Text(
                    text = "Restore Configuration",
                    color = cs.onSurface,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column {
                    Text(
                        text = "Format: ${info.format}",
                        color = cs.primary,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Contains ${info.targetCount} protected app(s) and ${info.templateCount} cloaking template(s).",
                        color = cs.onSurfaceVariant,
                        fontSize = 12.sp
                    )

                    if (info.sourceVersion >= 2) {
                        Spacer(modifier = Modifier.height(6.dp))
                        val bits = buildList {
                            add("system cloak ${if (info.systemCloak) "ON" else "off"}")
                            add("hide mode ${info.hideMode}")
                            add("${info.hardenedCount} hardened")
                            add("${info.appPolicyCount} per-app policies")
                            if (info.storageRuleCount > 0) add("${info.storageRuleCount} storage rules")
                        }
                        Text(
                            text = "Protection state: ${bits.joinToString(" · ")}",
                            color = cs.primary,
                            fontSize = 11.sp
                        )
                    } else {
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Legacy backup (v${info.sourceVersion}) - current cloak settings are kept.",
                            color = cs.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    }

                    if (info.targetNames.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Apps: ${info.targetNames.take(4).joinToString(", ")}${if (info.targetNames.size > 4) "…" else ""}",
                            color = cs.onSurfaceVariant,
                            fontSize = 11.sp,
                            fontFamily = FontFamily.Monospace
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "RESTORE MODE",
                        color = cs.onSurfaceVariant,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(ext.surfaceHigh)
                            .clickable { replaceAllMode = false }
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = !replaceAllMode,
                            onClick = { replaceAllMode = false },
                            colors = RadioButtonDefaults.colors(selectedColor = cs.primary)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text("Merge (Recommended)", color = cs.onSurface, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                            Text("Add to current rules without deleting other apps", color = cs.onSurfaceVariant, fontSize = 11.sp)
                        }
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(ext.surfaceHigh)
                            .clickable { replaceAllMode = true }
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = replaceAllMode,
                            onClick = { replaceAllMode = true },
                            colors = RadioButtonDefaults.colors(selectedColor = ext.danger)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text("Replace All", color = ext.danger, fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                            Text("Overwrite entire config with backup file", color = cs.onSurfaceVariant, fontSize = 11.sp)
                        }
                    }
                }
            },
            containerColor = cs.surface,
            confirmButton = {
                Button(
                    onClick = {
                        val currentInfo = info
                        parsedBackup = null
                        scope.launch {
                            val res = backupManager.applyBackup(currentInfo, replaceAllMode)
                            res.onSuccess {
                                onRefresh()
                                Toast.makeText(context, "Configuration restored successfully!", Toast.LENGTH_SHORT).show()
                            }.onFailure { err ->
                                Toast.makeText(context, "Failed to apply backup: ${err.message}", Toast.LENGTH_LONG).show()
                            }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
                ) {
                    Text("Apply Restore", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { parsedBackup = null }) {
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
        Text(
            text = "Config Backup & Restore",
            color = cs.onSurface,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Export or restore protected apps, per-app bypass switches, and cloaking templates as JSON (HMA-OSS compatible).",
            color = cs.onSurfaceVariant,
            fontSize = 11.5.sp
        )

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = {
                    val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
                    createDocumentLauncher.launch("causentry_backup_$timestamp.json")
                },
                enabled = !isExporting,
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(horizontal = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
            ) {
                if (isExporting) {
                    CircularProgressIndicator(modifier = Modifier.size(18.dp), color = cs.onPrimary, strokeWidth = 2.dp)
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_download),
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Export Backup", fontWeight = FontWeight.Bold, fontSize = 12.sp, maxLines = 1)
                }
            }

            OutlinedButton(
                onClick = { filePickerLauncher.launch(arrayOf("application/json", "text/*", "*/*")) },
                enabled = !isImporting,
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(horizontal = 8.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = cs.onSurface),
                border = BorderStroke(1.dp, ext.border)
            ) {
                if (isImporting) {
                    CircularProgressIndicator(modifier = Modifier.size(18.dp), color = cs.primary, strokeWidth = 2.dp)
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_upload),
                        contentDescription = null,
                        tint = cs.primary,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("Restore Backup", fontWeight = FontWeight.SemiBold, fontSize = 12.sp, maxLines = 1)
                }
            }
        }
    }
}
