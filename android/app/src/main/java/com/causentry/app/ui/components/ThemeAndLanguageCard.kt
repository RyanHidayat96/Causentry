package com.causentry.app.ui.components

import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.AppLanguage
import com.causentry.app.data.ThemeMode
import com.causentry.app.ui.theme.LocalCausentryColors

@Composable
fun ThemeAndLanguageCard(
    themeMode: ThemeMode,
    dynamicColor: Boolean,
    language: AppLanguage,
    onThemeModeChange: (ThemeMode) -> Unit,
    onDynamicColorChange: (Boolean) -> Unit,
    onLanguageChange: (AppLanguage) -> Unit,
    modifier: Modifier = Modifier
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val haptic = LocalHapticFeedback.current

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(cs.surface)
            .border(1.dp, ext.border, RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_tune),
                contentDescription = null,
                tint = cs.primary,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = stringResource(R.string.appearance_title),
                    color = cs.onSurface,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.appearance_subtitle),
                    color = cs.onSurfaceVariant,
                    fontSize = 11.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = stringResource(R.string.theme_label),
            color = cs.onSurfaceVariant,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val themes = listOf(
                ThemeMode.SYSTEM to R.string.theme_system,
                ThemeMode.LIGHT to R.string.theme_light,
                ThemeMode.DARK to R.string.theme_dark,
                ThemeMode.AMOLED to R.string.theme_amoled
            )
            themes.forEach { (mode, labelRes) ->
                val selected = themeMode == mode
                FilterChip(
                    selected = selected,
                    onClick = {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onThemeModeChange(mode)
                    },
                    label = {
                        Text(
                            text = stringResource(labelRes),
                            fontSize = 12.sp,
                            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = cs.primaryContainer,
                        selectedLabelColor = cs.onPrimaryContainer
                    )
                )
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.dynamic_color_title),
                        color = cs.onSurface,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = stringResource(R.string.dynamic_color_desc),
                        color = cs.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Switch(
                    checked = dynamicColor,
                    onCheckedChange = {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onDynamicColorChange(it)
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        HorizontalDivider(color = ext.border.copy(alpha = 0.45f), thickness = 0.5.dp)
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = stringResource(R.string.language_label),
            color = cs.onSurfaceVariant,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val languages = listOf(
                AppLanguage.SYSTEM to R.string.lang_system,
                AppLanguage.EN to R.string.lang_en,
                AppLanguage.ID to R.string.lang_id
            )
            languages.forEach { (lang, labelRes) ->
                val selected = language == lang
                FilterChip(
                    selected = selected,
                    onClick = {
                        if (lang != language) {
                            haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                            onLanguageChange(lang)
                        }
                    },
                    label = {
                        Text(
                            text = stringResource(labelRes),
                            fontSize = 12.sp,
                            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = cs.primaryContainer,
                        selectedLabelColor = cs.onPrimaryContainer
                    )
                )
            }
        }
    }
}
