package com.causentry.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.model.AppFilter
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.TextTertiary

@Composable
fun FilterChipRow(
    selectedFilter: AppFilter,
    onFilterSelect: (AppFilter) -> Unit,
    allCount: Int,
    protectedCount: Int,
    userCount: Int,
    systemCount: Int,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        item {
            FilterChipItem(
                label = "All",
                count = allCount,
                selected = selectedFilter == AppFilter.ALL,
                onClick = { onFilterSelect(AppFilter.ALL) }
            )
        }
        item {
            FilterChipItem(
                label = "Protected",
                count = protectedCount,
                selected = selectedFilter == AppFilter.PROTECTED,
                onClick = { onFilterSelect(AppFilter.PROTECTED) }
            )
        }
        item {
            FilterChipItem(
                label = "User",
                count = userCount,
                selected = selectedFilter == AppFilter.USER,
                onClick = { onFilterSelect(AppFilter.USER) }
            )
        }
        item {
            FilterChipItem(
                label = "System",
                count = systemCount,
                selected = selectedFilter == AppFilter.SYSTEM,
                onClick = { onFilterSelect(AppFilter.SYSTEM) }
            )
        }
    }
}

@Composable
private fun FilterChipItem(
    label: String,
    count: Int,
    selected: Boolean,
    onClick: () -> Unit
) {
    val haptic = LocalHapticFeedback.current

    val bg = if (selected) PrimaryBlue.copy(alpha = 0.16f) else SurfaceDark
    val borderCol = if (selected) PrimaryBlue else BorderDark.copy(alpha = 0.7f)
    val textCol = if (selected) PrimaryBlue else TextSecondary

    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(bg)
            .border(1.dp, borderCol, RoundedCornerShape(8.dp))
            .clickable {
                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                onClick()
            }
            .padding(horizontal = 10.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            fontSize = 12.sp,
            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
            color = textCol
        )

        if (count > 0) {
            Spacer(modifier = Modifier.width(6.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(if (selected) PrimaryBlue.copy(alpha = 0.25f) else Color.White.copy(alpha = 0.07f))
                    .padding(horizontal = 5.dp, vertical = 1.dp)
            ) {
                Text(
                    text = "$count",
                    fontSize = 10.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    color = if (selected) PrimaryBlue else TextTertiary
                )
            }
        }
    }
}
