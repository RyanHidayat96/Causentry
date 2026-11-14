package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
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
    onSave: (devOff: Boolean, mock: Boolean, isolate: Boolean, accOff: Boolean, template: String?) -> Unit,
    onDelete: () -> Unit,
    onDismiss: () -> Unit,
    onInspectLogs: (() -> Unit)? = null
) {
    var devOff by remember(app) { mutableStateOf(app.devOff) }
    var mock by remember(app) { mutableStateOf(app.mock) }
    var isolate by remember(app) { mutableStateOf(app.isolate) }
    var accOff by remember(app) { mutableStateOf(app.accOff) }
    var selectedTemplate by remember(app) { mutableStateOf(app.hideTemplate) }
    var templateDropdownExpanded by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.85f)
                .clip(RoundedCornerShape(20.dp))
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(20.dp))
                .padding(16.dp)
        ) {
            // Header (Sticky)
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
                    size = 42.dp
                )

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = app.label,
                        color = TextPrimary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = app.packageName,
                        color = TextSecondary,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                if (launchIntent != null) {
                    IconButton(
                        onClick = {
                            try {
                                context.startActivity(launchIntent)
                            } catch (_: Exception) {}
                        },
                        modifier = Modifier.size(34.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_launch),
                            contentDescription = "Launch App",
                            tint = PrimaryBlue,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                }

                IconButton(
                    onClick = onDismiss,
                    modifier = Modifier.size(34.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = "Close",
                        tint = TextSecondary,
                        modifier = Modifier.size(17.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Scrollable Content
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                // Quick Shield Presets
                Text(
                    text = "QUICK PRESET",
                    color = TextSecondary,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                val isBankingPreset = devOff && mock && isolate && accOff && (selectedTemplate != null)
                val isBasicPreset = devOff && !mock && !isolate && accOff
                val isDisabledPreset = !devOff && !mock && !isolate && !accOff && (selectedTemplate == null)

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    FilterChip(
                        selected = isBankingPreset,
                        onClick = {
                            devOff = true
                            mock = true
                            isolate = true
                            accOff = true
                            selectedTemplate = if (availableTemplates.contains("stealth")) "stealth" else availableTemplates.firstOrNull() ?: "stealth"
                        },
                        label = { Text("🏦 Banking", fontSize = 10.5.sp, fontWeight = if (isBankingPreset) FontWeight.Bold else FontWeight.Medium) },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = SuccessGreen.copy(alpha = 0.2f),
                            selectedLabelColor = SuccessGreen,
                            containerColor = SurfaceHighDark,
                            labelColor = TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isBankingPreset,
                            borderColor = if (isBankingPreset) SuccessGreen else BorderDark
                        ),
                        modifier = Modifier.weight(1f).height(30.dp)
                    )

                    FilterChip(
                        selected = isBasicPreset,
                        onClick = {
                            devOff = true
                            mock = false
                            isolate = false
                            accOff = true
                            selectedTemplate = if (availableTemplates.contains("basic")) "basic" else availableTemplates.firstOrNull()
                        },
                        label = { Text("🛡️ Basic", fontSize = 10.5.sp, fontWeight = if (isBasicPreset) FontWeight.Bold else FontWeight.Medium) },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = PrimaryBlue.copy(alpha = 0.2f),
                            selectedLabelColor = PrimaryBlue,
                            containerColor = SurfaceHighDark,
                            labelColor = TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isBasicPreset,
                            borderColor = if (isBasicPreset) PrimaryBlue else BorderDark
                        ),
                        modifier = Modifier.weight(0.85f).height(30.dp)
                    )

                    FilterChip(
                        selected = isDisabledPreset,
                        onClick = {
                            devOff = false
                            mock = false
                            isolate = false
                            accOff = false
                            selectedTemplate = null
                        },
                        label = { Text("None", fontSize = 10.5.sp, fontWeight = if (isDisabledPreset) FontWeight.Bold else FontWeight.Medium) },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = DangerRed.copy(alpha = 0.15f),
                            selectedLabelColor = DangerRed,
                            containerColor = SurfaceHighDark,
                            labelColor = TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isDisabledPreset,
                            borderColor = if (isDisabledPreset) DangerRed else BorderDark
                        ),
                        modifier = Modifier.weight(0.7f).height(30.dp)
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Unified Simple Features Card
                Text(
                    text = "GRANULAR BYPASS FEATURES",
                    color = TextSecondary,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Grouped Simple Feature List Card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(SurfaceHighDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                ) {
                    CompactFeatureRow(
                        title = "Hide Developer Options & ADB",
                        subtitle = "Spoofs adb_enabled & dev mode as 0",
                        checked = devOff,
                        onCheckedChange = { devOff = it },
                        iconRes = R.drawable.ic_code,
                        accentColor = WarningAmber
                    )

                    CompactFeatureRow(
                        title = "Hide Mock Location (GPS)",
                        subtitle = "Forces mock_location=0 to conceal fake GPS",
                        checked = mock,
                        onCheckedChange = { mock = it },
                        iconRes = R.drawable.ic_location,
                        accentColor = PrimaryBlue
                    )

                    CompactFeatureRow(
                        title = "Spoof Accessibility Services",
                        subtitle = "Conceals active accessibility services",
                        checked = accOff,
                        onCheckedChange = { accOff = it },
                        iconRes = R.drawable.ic_shield,
                        accentColor = Color(0xFFFFB74D)
                    )

                    CompactFeatureRow(
                        title = "Neutralize RASP & Isolated Services",
                        subtitle = "Demotes isolated service to stop exit & OOM bombs",
                        checked = isolate,
                        onCheckedChange = { isolate = it },
                        iconRes = R.drawable.ic_shield,
                        accentColor = Color(0xFFB388FF),
                        showDivider = false
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Root Cloaking Template Selector
                Text(
                    text = "ROOT APP CLOAKING",
                    color = TextSecondary,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(SurfaceHighDark)
                            .border(1.dp, BorderDark, RoundedCornerShape(10.dp))
                            .clickable { templateDropdownExpanded = true }
                            .padding(horizontal = 12.dp, vertical = 9.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = selectedTemplate?.let { "🛡️ Template: $it" } ?: "🛡️ No cloaked root packages",
                            color = if (selectedTemplate != null) SuccessGreen else TextSecondary,
                            fontSize = 12.5.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(text = "▼", color = TextSecondary, fontSize = 10.sp)
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

                Spacer(modifier = Modifier.height(10.dp))

                // Quick secondary actions
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (onInspectLogs != null) {
                        OutlinedButton(
                            onClick = {
                                onDismiss()
                                onInspectLogs()
                            },
                            modifier = Modifier.weight(1f).height(34.dp),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = PrimaryBlue),
                            border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryBlue.copy(alpha = 0.4f))
                        ) {
                            Text("Inspect Logs", fontSize = 11.5.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }

                    if (app.isProtected || devOff || mock || isolate || accOff || selectedTemplate != null) {
                        OutlinedButton(
                            onClick = {
                                onDelete()
                                onDismiss()
                            },
                            modifier = Modifier.weight(1f).height(34.dp),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = DangerRed),
                            border = androidx.compose.foundation.BorderStroke(1.dp, DangerRed.copy(alpha = 0.4f))
                        ) {
                            Text("Clear Rules", fontSize = 11.5.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Sticky Save Button
            Button(
                onClick = {
                    onSave(devOff, mock, isolate, accOff, selectedTemplate)
                    onDismiss()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(42.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text(
                    text = "Apply Protection",
                    color = TextPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
private fun CompactFeatureRow(
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    iconRes: Int,
    accentColor: Color,
    showDivider: Boolean = true
) {
    val haptic = LocalHapticFeedback.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onCheckedChange(!checked)
            }
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(26.dp)
                .clip(CircleShape)
                .background(if (checked) accentColor.copy(alpha = 0.18f) else SurfaceDark),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = if (checked) accentColor else TextSecondary.copy(alpha = 0.6f),
                modifier = Modifier.size(13.dp)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = if (checked) TextPrimary else TextSecondary,
                fontSize = 12.5.sp,
                fontWeight = if (checked) FontWeight.SemiBold else FontWeight.Medium
            )
            Text(
                text = subtitle,
                color = TextSecondary.copy(alpha = 0.65f),
                fontSize = 10.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        Spacer(modifier = Modifier.width(6.dp))

        Switch(
            checked = checked,
            onCheckedChange = {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onCheckedChange(it)
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = accentColor,
                uncheckedThumbColor = TextSecondary,
                uncheckedTrackColor = SurfaceDark,
                uncheckedBorderColor = BorderDark
            ),
            modifier = Modifier.scale(0.75f)
        )
    }

    if (showDivider) {
        HorizontalDivider(
            color = BorderDark.copy(alpha = 0.4f),
            thickness = 0.5.dp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}
