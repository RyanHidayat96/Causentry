package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun HeroStatusCard(
    status: DaemonStatus,
    modifier: Modifier = Modifier
) {
    val daemonColor = when {
        !status.daemonAlive -> DangerRed
        status.state == "active" -> SuccessGreen
        else -> WarningAmber
    }

    val daemonText = when {
        !status.daemonAlive -> "STOPPED"
        status.state == "active" -> "ACTIVE"
        else -> "STANDBY"
    }

    val zygiskColor = if (status.cloakReady) SuccessGreen else WarningAmber

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(SurfaceDark, RoundedCornerShape(16.dp))
            .border(1.dp, BorderDark, RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "System Protection",
                    color = TextPrimary,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = if (status.cloakReady) "Zygisk system_server hook active" else "Hook standby / starting",
                    color = TextSecondary,
                    fontSize = 12.sp
                )
            }

            StatusPill(
                text = daemonText,
                color = daemonColor
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            MetricTile(
                label = "TARGETS",
                value = status.targets.size.toString(),
                accent = SuccessGreen,
                modifier = Modifier.weight(1f)
            )
            MetricTile(
                label = "TEMPLATES",
                value = status.templates.size.toString(),
                accent = PrimaryBlue,
                modifier = Modifier.weight(1f)
            )
            MetricTile(
                label = "HEARTBEAT",
                value = if (status.heartbeatAge > 999) "--" else "${status.heartbeatAge}s",
                accent = if (status.heartbeatAge <= 15) SuccessGreen else DangerRed,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun MetricTile(
    label: String,
    value: String,
    accent: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color.Black.copy(alpha = 0.25f), RoundedCornerShape(10.dp))
            .border(1.dp, BorderDark.copy(alpha = 0.6f), RoundedCornerShape(10.dp))
            .padding(vertical = 8.dp, horizontal = 10.dp)
    ) {
        Text(
            text = label,
            color = TextSecondary,
            fontSize = 10.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.5.sp
        )
        Text(
            text = value,
            color = accent,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
