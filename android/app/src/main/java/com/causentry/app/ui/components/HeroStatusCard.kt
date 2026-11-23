package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.theme.LocalCausentryColors

@Composable
fun HeroStatusCard(
    status: DaemonStatus,
    protectedCount: Int = status.targets.size,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    val isEnforcing = status.daemonAlive && status.cloakReady
    val statusColor = when {
        !status.daemonAlive -> ext.danger
        isEnforcing -> ext.success
        else -> ext.warning
    }

    val statusText = stringResource(
        when {
            !status.daemonAlive -> R.string.status_offline
            isEnforcing -> R.string.status_active
            else -> R.string.status_standby
        }
    )

    val zygiskText = stringResource(
        when {
            status.cloakReady -> R.string.zygisk_active
            status.zygisk.contains("ready") -> R.string.zygisk_ready
            else -> R.string.zygisk_standby
        }
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(cs.surface)
            .border(1.dp, ext.border, RoundedCornerShape(10.dp))
            .padding(horizontal = 14.dp, vertical = 8.dp),
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
                text = stringResource(R.string.hero_system_protection),
                color = cs.onSurface,
                fontSize = 12.5.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "· $zygiskText ($protectedCount)",
                color = cs.onSurfaceVariant,
                fontSize = 11.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        StatusPill(text = statusText, color = statusColor)
    }
}
