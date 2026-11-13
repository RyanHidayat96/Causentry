package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.causentry.app.R
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

@Composable
fun AppDetailDialog(
    app: AppInfo,
    availableTemplates: List<String>,
    iconLoader: IconLoader,
    onSave: (devOff: Boolean, mock: Boolean, isolate: Boolean, template: String?) -> Unit,
    onDelete: () -> Unit,
    onDismiss: () -> Unit
) {
    var devOff by remember(app) { mutableStateOf(app.devOff) }
    var mock by remember(app) { mutableStateOf(app.mock) }
    var isolate by remember(app) { mutableStateOf(app.isolate) }
    var selectedTemplate by remember(app) { mutableStateOf(app.hideTemplate) }
    var templateDropdownExpanded by remember { mutableStateOf(false) }

    Dialog(onDismissRequest = onDismiss) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(20.dp))
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            // Header
            val context = LocalContext.current
            val launchIntent = remember(app.packageName) {
                context.packageManager.getLaunchIntentForPackage(app.packageName)
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AppIconItem(
                    packageName = app.packageName,
                    label = app.label,
                    iconLoader = iconLoader,
                    size = 52.dp
                )

                Spacer(modifier = Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = app.label,
                        color = TextPrimary,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = app.packageName,
                        color = TextSecondary,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Monospace
                    )
                }

                if (launchIntent != null) {
                    IconButton(
                        onClick = {
                            try {
                                context.startActivity(launchIntent)
                            } catch (_: Exception) {}
                        },
                        modifier = Modifier.size(40.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_launch),
                            contentDescription = "Launch App",
                            tint = PrimaryBlue,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Switch 1: Dev Options
            SwitchCard(
                title = "Hide Developer Options",
                description = "Returns development_settings_enabled and adb_enabled as 0 for this app without changing global phone settings.",
                checked = devOff,
                onCheckedChange = { devOff = it },
                iconRes = R.drawable.ic_code,
                iconTint = PrimaryBlue
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Switch 2: Mock Location
            SwitchCard(
                title = "Hide Mock Location",
                description = "Forces mock_location=0 and isolates location providers so the app cannot detect GPS spoofing tools.",
                checked = mock,
                onCheckedChange = { mock = it },
                iconRes = R.drawable.ic_location,
                iconTint = WarningAmber
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Switch 3: App-Zygote Isolation
            SwitchCard(
                title = "Block App-Zygote Probes",
                description = "Stops app from spawning isolated processes via app-zygote (bypasses SELinux and anti-tamper RASP checks).",
                checked = isolate,
                onCheckedChange = { isolate = it },
                iconRes = R.drawable.ic_shield,
                iconTint = SuccessGreen
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Hidden app template selector
            Text(
                text = "HIDDEN-APP TEMPLATE",
                color = TextSecondary,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Box(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10.dp))
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(10.dp))
                        .clickable { templateDropdownExpanded = true }
                        .padding(horizontal = 14.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = selectedTemplate ?: "None (no extra cloaked packages)",
                        color = if (selectedTemplate != null) TextPrimary else TextSecondary,
                        fontSize = 14.sp
                    )
                    Text(text = "▼", color = TextSecondary, fontSize = 12.sp)
                }

                DropdownMenu(
                    expanded = templateDropdownExpanded,
                    onDismissRequest = { templateDropdownExpanded = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("None") },
                        onClick = {
                            selectedTemplate = null
                            templateDropdownExpanded = false
                        }
                    )
                    availableTemplates.forEach { tpl ->
                        DropdownMenuItem(
                            text = { Text(tpl) },
                            onClick = {
                                selectedTemplate = tpl
                                templateDropdownExpanded = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Action buttons
            Button(
                onClick = {
                    onSave(devOff, mock, isolate, selectedTemplate)
                    onDismiss()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text(
                    text = "Apply for this app",
                    color = TextPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }

            if (app.isProtected) {
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedButton(
                    onClick = {
                        onDelete()
                        onDismiss()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(44.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = DangerRed)
                ) {
                    Text("Remove Protection", fontWeight = FontWeight.SemiBold)
                }
            }

            Spacer(modifier = Modifier.height(4.dp))
            TextButton(
                onClick = onDismiss,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Dismiss", color = TextSecondary)
            }
        }
    }
}
