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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            Text(
                text = "System & Runtime Diagnostics",
                color = TextPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )

            StatusPill(
                text = if (status.daemonAlive) "HEALTHY" else "OFFLINE",
                color = if (status.daemonAlive) SuccessGreen else DangerRed
            )
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Diagnostic Rows
        DiagRow(
            label = "KernelSU Daemon",
            value = if (status.daemonAlive) "Active (${status.state})" else "Stopped",
            statusColor = if (status.daemonAlive) SuccessGreen else DangerRed
        )

        DiagRow(
            label = "Zygisk Hook Engine",
            value = if (status.cloakReady) "Injected to system_server" else "Standby / Loading",
            statusColor = if (status.cloakReady) SuccessGreen else WarningAmber
        )

        DiagRow(
            label = "SettingsProvider Cloak",
            value = if (status.cloakReady) "development_settings + adb hooks ON" else "Standby",
            statusColor = if (status.cloakReady) SuccessGreen else TextSecondary
        )

        DiagRow(
            label = "App-Zygote Isolation",
            value = "usesAppZygote=false (Anti-RASP active)",
            statusColor = PrimaryBlue
        )

        DiagRow(
            label = "Heartbeat Monitor",
            value = if (status.heartbeatAge > 999) "No signal" else "${status.heartbeatAge}s ago (Interval 4-5s)",
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
            .padding(vertical = 5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(0.45f)
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
                fontSize = 12.sp
            )
        }

        Text(
            text = value,
            color = TextPrimary,
            fontSize = 12.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(0.55f)
        )
    }
}
