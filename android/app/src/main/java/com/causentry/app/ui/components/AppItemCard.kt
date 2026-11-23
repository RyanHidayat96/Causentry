package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppInfo
import com.causentry.app.ui.theme.LocalCausentryColors

@Composable
fun AppItemCard(
    app: AppInfo,
    iconLoader: IconLoader,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    val cardBorderColor = if (app.isProtected) {
        cs.primary.copy(alpha = 0.4f)
    } else {
        ext.border.copy(alpha = 0.6f)
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 3.5.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(cs.surface)
            .border(1.dp, cardBorderColor, RoundedCornerShape(12.dp))
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 12.dp, vertical = 9.dp)
    ) {
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
                    fontSize = 14.5.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.height(1.dp))

                Text(
                    text = app.packageName,
                    color = cs.onSurfaceVariant.copy(alpha = 0.85f),
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Row(
                    modifier = Modifier
                        .padding(top = 5.dp)
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (app.devOff) {
                        FeatureBadge(text = "DevCloak", color = ext.warning)
                    }
                    if (app.isolate) {
                        FeatureBadge(text = "Zygote", color = ext.accentPurple)
                    }
                    if (app.accOff) {
                        FeatureBadge(text = "A11yCloak", color = ext.accentOrange)
                    }
                    if (app.mock) {
                        FeatureBadge(text = "MockCloak", color = cs.primary)
                    }
                    if (!app.hideTemplate.isNullOrEmpty() && app.hideTemplate.lowercase() != "none") {
                        FeatureBadge(
                            text = app.hideTemplate.uppercase(),
                            color = ext.success,
                            iconRes = R.drawable.ic_shield
                        )
                    }
                    if (!app.isProtected && !app.devOff && !app.mock && !app.isolate && !app.accOff && app.hideTemplate == null) {
                        FeatureBadge(text = "Unprotected", color = cs.onSurfaceVariant.copy(alpha = 0.6f))
                    }
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                if (app.isProtected) {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .clip(CircleShape)
                            .background(ext.success.copy(alpha = 0.14f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_shield),
                            contentDescription = "Protected",
                            tint = ext.success,
                            modifier = Modifier.size(13.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                }

                Icon(
                    painter = painterResource(id = R.drawable.ic_chevron_right),
                    contentDescription = null,
                    tint = cs.onSurfaceVariant.copy(alpha = 0.45f),
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}

@Composable
private fun FeatureBadge(
    text: String,
    color: Color,
    iconRes: Int? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .background(color.copy(alpha = 0.12f), RoundedCornerShape(5.dp))
            .border(0.7.dp, color.copy(alpha = 0.4f), RoundedCornerShape(5.dp))
            .padding(horizontal = 5.dp, vertical = 1.5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (iconRes != null) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(10.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
        }
        Text(
            text = text,
            color = color,
            fontSize = 9.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.2.sp,
            maxLines = 1
        )
    }
}
