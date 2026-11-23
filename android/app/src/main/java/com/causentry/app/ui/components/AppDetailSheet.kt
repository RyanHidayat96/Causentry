package com.causentry.app.ui.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

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
                .fillMaxHeight(0.86f)
                .clip(RoundedCornerShape(20.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(20.dp))
                .padding(16.dp)
        ) {
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
                        color = cs.onSurface,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = app.packageName,
                        color = cs.onSurfaceVariant,
                        fontSize = 11.sp,
                        fontFamily = FontFamily.Monospace,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                if (launchIntent != null) {
                    IconButton(
                        onClick = {
                            try { context.startActivity(launchIntent) } catch (_: Exception) {}
                        }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_launch),
                            contentDescription = "Launch App",
                            tint = cs.primary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                IconButton(onClick = onDismiss) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_close),
                        contentDescription = stringResource(R.string.action_close),
                        tint = cs.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = stringResource(R.string.label_quick_preset),
                    color = cs.onSurfaceVariant,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.height(6.dp))

                val isBankingPreset = devOff && mock && accOff && (selectedTemplate != null)
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
                            // Safe default: leave App-Zygote demotion off unless explicitly needed
                            isolate = false
                            accOff = true
                            selectedTemplate = if (availableTemplates.contains("stealth")) "stealth" else availableTemplates.firstOrNull() ?: "stealth"
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_bank),
                                contentDescription = null,
                                tint = if (isBankingPreset) ext.success else cs.onSurfaceVariant,
                                modifier = Modifier.size(15.dp)
                            )
                        },
                        label = {
                            Text(
                                text = stringResource(R.string.preset_banking),
                                fontSize = 11.sp,
                                fontWeight = if (isBankingPreset) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1
                            )
                        },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ext.success.copy(alpha = 0.18f),
                            selectedLabelColor = ext.success,
                            containerColor = ext.surfaceHigh,
                            labelColor = cs.onSurfaceVariant
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isBankingPreset,
                            borderColor = if (isBankingPreset) ext.success else ext.border
                        ),
                        modifier = Modifier.weight(1f)
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
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_shield),
                                contentDescription = null,
                                tint = if (isBasicPreset) cs.primary else cs.onSurfaceVariant,
                                modifier = Modifier.size(15.dp)
                            )
                        },
                        label = {
                            Text(
                                text = stringResource(R.string.preset_basic),
                                fontSize = 11.sp,
                                fontWeight = if (isBasicPreset) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1
                            )
                        },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = cs.primary.copy(alpha = 0.18f),
                            selectedLabelColor = cs.primary,
                            containerColor = ext.surfaceHigh,
                            labelColor = cs.onSurfaceVariant
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isBasicPreset,
                            borderColor = if (isBasicPreset) cs.primary else ext.border
                        ),
                        modifier = Modifier.weight(0.9f)
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
                        label = {
                            Text(
                                text = stringResource(R.string.preset_none),
                                fontSize = 11.sp,
                                fontWeight = if (isDisabledPreset) FontWeight.Bold else FontWeight.Medium,
                                maxLines = 1
                            )
                        },
                        shape = RoundedCornerShape(8.dp),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = ext.danger.copy(alpha = 0.16f),
                            selectedLabelColor = ext.danger,
                            containerColor = ext.surfaceHigh,
                            labelColor = cs.onSurfaceVariant
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = isDisabledPreset,
                            borderColor = if (isDisabledPreset) ext.danger else ext.border
                        ),
                        modifier = Modifier.weight(0.75f)
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = stringResource(R.string.label_granular_features),
                    color = cs.onSurfaceVariant,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.height(6.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(ext.surfaceHigh)
                        .border(1.dp, ext.border, RoundedCornerShape(12.dp))
                ) {
                    CompactFeatureRow(
                        title = stringResource(R.string.feature_dev_title),
                        subtitle = stringResource(R.string.feature_dev_desc),
                        checked = devOff,
                        onCheckedChange = { devOff = it },
                        iconRes = R.drawable.ic_code,
                        accentColor = ext.warning
                    )

                    CompactFeatureRow(
                        title = stringResource(R.string.feature_mock_title),
                        subtitle = stringResource(R.string.feature_mock_desc),
                        checked = mock,
                        onCheckedChange = { mock = it },
                        iconRes = R.drawable.ic_location,
                        accentColor = cs.primary
                    )

                    CompactFeatureRow(
                        title = stringResource(R.string.feature_a11y_title),
                        subtitle = stringResource(R.string.feature_a11y_desc),
                        checked = accOff,
                        onCheckedChange = { accOff = it },
                        iconRes = R.drawable.ic_accessibility,
                        accentColor = ext.accentOrange
                    )

                    CompactFeatureRow(
                        title = stringResource(R.string.feature_isolate_title),
                        subtitle = stringResource(R.string.feature_isolate_desc),
                        checked = isolate,
                        onCheckedChange = { isolate = it },
                        iconRes = R.drawable.ic_shield,
                        accentColor = ext.accentPurple,
                        showDivider = false
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = stringResource(R.string.label_root_cloaking),
                    color = cs.onSurfaceVariant,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 0.5.sp
                )
                Spacer(modifier = Modifier.height(6.dp))

                Box(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(ext.surfaceHigh)
                            .border(1.dp, ext.border, RoundedCornerShape(10.dp))
                            .clickable { templateDropdownExpanded = true }
                            .padding(horizontal = 12.dp, vertical = 11.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_shield),
                                contentDescription = null,
                                tint = if (selectedTemplate != null) ext.success else cs.onSurfaceVariant,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = selectedTemplate?.let { stringResource(R.string.template_selected, it) }
                                    ?: stringResource(R.string.template_none),
                                color = if (selectedTemplate != null) ext.success else cs.onSurfaceVariant,
                                fontSize = 12.5.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                        Icon(
                            painter = painterResource(id = R.drawable.ic_chevron_right),
                            contentDescription = null,
                            tint = cs.onSurfaceVariant,
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    DropdownMenu(
                        expanded = templateDropdownExpanded,
                        onDismissRequest = { templateDropdownExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text(stringResource(R.string.preset_none)) },
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

                Spacer(modifier = Modifier.height(12.dp))

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
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = cs.primary),
                            border = BorderStroke(1.dp, cs.primary.copy(alpha = 0.45f))
                        ) {
                            Text(stringResource(R.string.action_inspect_logs), fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }

                    if (app.isProtected || devOff || mock || isolate || accOff || selectedTemplate != null) {
                        OutlinedButton(
                            onClick = {
                                onDelete()
                                onDismiss()
                            },
                            modifier = Modifier.weight(1f).height(44.dp),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp),
                            colors = ButtonDefaults.outlinedButtonColors(contentColor = ext.danger),
                            border = BorderStroke(1.dp, ext.danger.copy(alpha = 0.45f))
                        ) {
                            Text(stringResource(R.string.action_clear_rules), fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = {
                    onSave(devOff, mock, isolate, accOff, selectedTemplate)
                    onDismiss()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
            ) {
                Text(
                    text = stringResource(R.string.action_apply_protection),
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
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onCheckedChange(!checked)
            }
            .padding(horizontal = 12.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(if (checked) accentColor.copy(alpha = 0.18f) else cs.surface),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = if (checked) accentColor else cs.onSurfaceVariant.copy(alpha = 0.65f),
                modifier = Modifier.size(15.dp)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                color = if (checked) cs.onSurface else cs.onSurfaceVariant,
                fontSize = 12.5.sp,
                fontWeight = if (checked) FontWeight.SemiBold else FontWeight.Medium
            )
            Text(
                text = subtitle,
                color = cs.onSurfaceVariant.copy(alpha = 0.75f),
                fontSize = 10.5.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Switch(
            checked = checked,
            onCheckedChange = {
                haptic.performHapticFeedback(HapticFeedbackType.LongPress)
                onCheckedChange(it)
            },
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.White,
                checkedTrackColor = accentColor
            )
        )
    }

    if (showDivider) {
        HorizontalDivider(
            color = ext.border.copy(alpha = 0.45f),
            thickness = 0.5.dp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}
