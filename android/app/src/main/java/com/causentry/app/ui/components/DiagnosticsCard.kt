package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.theme.LocalCausentryColors

@Composable
fun DiagnosticsCard(
    status: DaemonStatus,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    val isolateAppCount = status.perAppConfigs.values.count { it.isolate }
    val healthText = stringResource(
        when {
            status.daemonAlive && status.cloakReady -> R.string.status_healthy
            status.daemonAlive -> R.string.status_degraded
            else -> R.string.status_offline
        }
    )
    val healthColor = when {
        status.daemonAlive && status.cloakReady -> ext.success
        status.daemonAlive -> ext.warning
        else -> ext.danger
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
                        text = stringResource(R.string.diag_title),
                        color = cs.onSurface,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(R.string.diag_subtitle),
                        color = cs.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            StatusPill(text = healthText, color = healthColor)
        }

        if (!status.rpcError.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .background(ext.danger.copy(alpha = 0.12f))
                    .border(1.dp, ext.danger.copy(alpha = 0.35f), RoundedCornerShape(10.dp))
                    .padding(horizontal = 10.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_warning),
                    contentDescription = null,
                    tint = ext.danger,
                    modifier = Modifier.size(15.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = status.rpcError,
                    color = ext.danger,
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        DiagRow(
            label = stringResource(R.string.diag_root_provider),
            value = status.rootProvider,
            statusColor = if (status.daemonAlive) cs.primary else cs.onSurfaceVariant
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_daemon),
            value = if (status.daemonAlive) {
                "PID ${status.daemonPid} · ${formatUptime(status.daemonUptimeSec)}"
            } else {
                "Offline"
            },
            statusColor = if (status.daemonAlive) ext.success else ext.danger
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_zygisk),
            value = if (status.cloakReady) {
                "Active (${status.pkgHookCount} hooks)"
            } else {
                status.zygisk
            },
            statusColor = if (status.cloakReady) ext.success else ext.warning
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_settings),
            value = if (status.settingsHookReady) {
                "Active (${status.settingsHookCount} hooks)"
            } else {
                "Standby"
            },
            statusColor = if (status.settingsHookReady) ext.success else cs.onSurfaceVariant
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_usb),
            value = if (status.usbHookReady) {
                "Per-UID (${status.usbHookCount} hooks)"
            } else {
                "Standby"
            },
            statusColor = if (status.usbHookReady) ext.success else cs.onSurfaceVariant
        )
        DiagDivider()

        val a11yZygoteActive = status.a11yHookCount > 0 || status.appZygoteHookCount > 0
        DiagRow(
            label = stringResource(R.string.diag_a11y_zygote),
            value = if (a11yZygoteActive) {
                "A11y:${status.a11yHookCount} · Zygote:${status.appZygoteHookCount} ($isolateAppCount)"
            } else {
                "Standby"
            },
            statusColor = if (a11yZygoteActive) cs.primary else cs.onSurfaceVariant
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_fuse),
            value = when {
                status.fuseCovered -> "Covered (${status.fuseTargetCount} apps)"
                status.fuseActive -> "Active (${status.fuseTargetCount} apps)"
                else -> "Standby (${status.targets.size} apps)"
            },
            statusColor = if (status.fuseCovered || status.fuseActive) ext.success else cs.primary
        )
        DiagDivider()

        DiagRow(
            label = stringResource(R.string.diag_susfs),
            value = status.susfs,
            statusColor = if (status.susfs.startsWith("active")) ext.success else cs.onSurfaceVariant
        )
    }
}

@Composable
private fun DiagDivider() {
    val ext = LocalCausentryColors.current
    HorizontalDivider(color = ext.border.copy(alpha = 0.35f), thickness = 0.5.dp)
}

@Composable
private fun DiagRow(
    label: String,
    value: String,
    statusColor: Color
) {
    val cs = MaterialTheme.colorScheme
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .size(7.dp)
                    .clip(CircleShape)
                    .background(statusColor)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                color = cs.onSurfaceVariant,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = value,
            color = cs.onSurface,
            fontSize = 11.5.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.End
        )
    }
}

internal fun formatUptime(seconds: Long): String =
    com.causentry.app.core.CausentryRustBridge.formatUptimeSeconds(seconds)
