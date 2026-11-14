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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
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

    val zygiskText = when {
        status.cloakReady -> "Zygisk active"
        status.zygisk.contains("ready") -> "Zygisk ready"
        else -> "Zygisk standby"
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(SurfaceDark, RoundedCornerShape(12.dp))
            .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
            .padding(horizontal = 14.dp, vertical = 9.dp)
    ) {
        // Top line: Status indicator dot + Title & Subtitle + Status Pill
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Box(
                    modifier = Modifier
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(daemonColor)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "System Protection",
                    color = TextPrimary,
                    fontSize = 13.5.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text(
                    text = "• $zygiskText",
                    color = TextSecondary,
                    fontSize = 11.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

            StatusPill(
                text = daemonText,
                color = daemonColor
            )
        }

        Spacer(modifier = Modifier.height(7.dp))

        // Bottom line: 3 compact horizontal metric chips
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CompactMetricChip(
                label = "TARGETS",
                value = status.targets.size.toString(),
                accent = SuccessGreen,
                modifier = Modifier.weight(1f)
            )
            CompactMetricChip(
                label = "TEMPLATES",
                value = status.templates.size.toString(),
                accent = PrimaryBlue,
                modifier = Modifier.weight(1f)
            )
            CompactMetricChip(
                label = "HEARTBEAT",
                value = if (status.heartbeatAge > 999) "--" else "${status.heartbeatAge}s",
                accent = if (status.heartbeatAge <= 15) SuccessGreen else DangerRed,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun CompactMetricChip(
    label: String,
    value: String,
    accent: Color,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(Color.Black.copy(alpha = 0.25f), RoundedCornerShape(7.dp))
            .border(1.dp, BorderDark.copy(alpha = 0.5f), RoundedCornerShape(7.dp))
            .padding(horizontal = 9.dp, vertical = 5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            color = TextSecondary,
            fontSize = 9.5.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.4.sp
        )
        Text(
            text = value,
            color = accent,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
