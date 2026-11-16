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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

@Composable
fun DiagnosticsCard(
    status: DaemonStatus,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(SurfaceDark)
            .border(1.dp, BorderDark, RoundedCornerShape(16.dp))
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
                    tint = PrimaryBlue,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "System Diagnostics",
                        color = TextPrimary,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Core security hooks & daemon health",
                        color = TextSecondary,
                        fontSize = 11.sp
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            StatusPill(
                text = if (status.daemonAlive && status.cloakReady) "HEALTHY" else if (status.daemonAlive) "DEGRADED" else "OFFLINE",
                color = if (status.daemonAlive && status.cloakReady) SuccessGreen else if (status.daemonAlive) WarningAmber else DangerRed
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Diagnostic Rows with subtle divider
        DiagRow(
            label = "KernelSU Daemon",
            value = if (status.daemonAlive) "Active (${status.state})" else "Stopped",
            statusColor = if (status.daemonAlive) SuccessGreen else DangerRed
        )

        HorizontalDivider(color = BorderDark.copy(alpha = 0.35f), thickness = 0.5.dp)

        DiagRow(
            label = "Zygisk Hook Engine",
            value = if (status.cloakReady) "Injected (system_server)" else "Standby",
            statusColor = if (status.cloakReady) SuccessGreen else WarningAmber
        )

        HorizontalDivider(color = BorderDark.copy(alpha = 0.35f), thickness = 0.5.dp)

        DiagRow(
            label = "SettingsProvider Cloak",
            value = if (status.cloakReady) "Active (dev + adb)" else "Standby",
            statusColor = if (status.cloakReady) SuccessGreen else TextSecondary
        )

        HorizontalDivider(color = BorderDark.copy(alpha = 0.35f), thickness = 0.5.dp)

        DiagRow(
            label = "App-Zygote Isolation",
            value = "Anti-RASP Active",
            statusColor = PrimaryBlue
        )

        HorizontalDivider(color = BorderDark.copy(alpha = 0.35f), thickness = 0.5.dp)

        DiagRow(
            label = "FUSE Storage Cloak",
            value = if (status.fuseCovered) "Active & Covered" else if (status.fuseActive) "Active (${status.targets.size} apps)" else "Standby (${status.targets.size} apps)",
            statusColor = if (status.fuseCovered || status.fuseActive) SuccessGreen else PrimaryBlue
        )

        HorizontalDivider(color = BorderDark.copy(alpha = 0.35f), thickness = 0.5.dp)

        DiagRow(
            label = "Heartbeat Monitor",
            value = if (status.heartbeatAge > 999) "No signal" else if (status.heartbeatAge <= 15) "${status.heartbeatAge}s ago (Normal)" else "${status.heartbeatAge}s ago (Delayed)",
            statusColor = if (status.heartbeatAge <= 15) SuccessGreen else DangerRed
        )
    }
}

@Composable
private fun DiagRow(
    label: String,
    value: String,
    statusColor: Color
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .size(7.dp)
                    .clip(CircleShape)
                    .background(statusColor)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                color = TextSecondary,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = value,
            color = TextPrimary,
            fontSize = 11.5.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.End
        )
    }
}
