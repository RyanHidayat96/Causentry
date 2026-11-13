package com.causentry.app.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.model.AppFilter
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.TextSecondary

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
    Row(
        modifier = modifier.horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ChipItem(
            label = "All",
            count = allCount,
            selected = selectedFilter == AppFilter.ALL,
            onClick = { onFilterSelect(AppFilter.ALL) }
        )
        ChipItem(
            label = "Protected",
            count = protectedCount,
            selected = selectedFilter == AppFilter.PROTECTED,
            onClick = { onFilterSelect(AppFilter.PROTECTED) }
        )
        ChipItem(
            label = "User",
            count = userCount,
            selected = selectedFilter == AppFilter.USER,
            onClick = { onFilterSelect(AppFilter.USER) }
        )
        ChipItem(
            label = "System",
            count = systemCount,
            selected = selectedFilter == AppFilter.SYSTEM,
            onClick = { onFilterSelect(AppFilter.SYSTEM) }
        )
    }
}

@Composable
private fun ChipItem(
    label: String,
    count: Int,
    selected: Boolean,
    onClick: () -> Unit
) {
    val haptic = LocalHapticFeedback.current

    FilterChip(
        selected = selected,
        onClick = {
            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
            onClick()
        },
        label = {
            Text(
                text = if (count > 0) "$label ($count)" else label,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = PrimaryBlue.copy(alpha = 0.2f),
            selectedLabelColor = PrimaryBlue,
            containerColor = SurfaceDark,
            labelColor = TextSecondary
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) PrimaryBlue else BorderDark
        )
    )
}
