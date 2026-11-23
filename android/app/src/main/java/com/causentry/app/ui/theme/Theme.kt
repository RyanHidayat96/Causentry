package com.causentry.app.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.causentry.app.data.ThemeMode

@Immutable
data class CausentryExtendedColors(
    val success: Color,
    val warning: Color,
    val danger: Color,
    val accentPurple: Color,
    val accentOrange: Color,
    val border: Color,
    val surfaceHigh: Color,
    val isDark: Boolean
)

val LocalCausentryColors = staticCompositionLocalOf {
    CausentryExtendedColors(
        success = SuccessGreen,
        warning = WarningAmber,
        danger = DangerRed,
        accentPurple = AccentPurple,
        accentOrange = AccentOrange,
        border = BorderDark,
        surfaceHigh = SurfaceHighDark,
        isDark = true
    )
}

private val DefaultDarkScheme = darkColorScheme(
    primary = PrimaryBlue,
    onPrimary = Color.White,
    primaryContainer = PrimaryContainerBlue,
    onPrimaryContainer = OnPrimaryContainerBlue,
    secondary = PrimaryBlue,
    onSecondary = Color.White,
    background = BgDark,
    onBackground = TextPrimary,
    surface = SurfaceDark,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceHighDark,
    onSurfaceVariant = TextSecondary,
    outline = BorderDark,
    outlineVariant = BorderDark,
    error = DangerRed,
    onError = Color.White,
)

private val DefaultLightScheme = lightColorScheme(
    primary = PrimaryBlueLight,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFDBEAFE),
    onPrimaryContainer = Color(0xFF1E3A8A),
    secondary = PrimaryBlueLight,
    onSecondary = Color.White,
    background = BgLight,
    onBackground = TextPrimaryLight,
    surface = SurfaceLight,
    onSurface = TextPrimaryLight,
    surfaceVariant = SurfaceHighLight,
    onSurfaceVariant = TextSecondaryLight,
    outline = BorderLight,
    outlineVariant = BorderLight,
    error = DangerRedLight,
    onError = Color.White,
)

@Composable
fun CausentryTheme(
    themeMode: ThemeMode = ThemeMode.DARK,
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val systemDark = isSystemInDarkTheme()
    val useDark = when (themeMode) {
        ThemeMode.SYSTEM -> systemDark
        ThemeMode.LIGHT -> false
        ThemeMode.DARK, ThemeMode.AMOLED -> true
    }
    val isAmoled = themeMode == ThemeMode.AMOLED

    val context = LocalContext.current
    val baseScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (useDark) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        useDark -> DefaultDarkScheme
        else -> DefaultLightScheme
    }

    val colorScheme = if (isAmoled) {
        baseScheme.copy(
            background = BgAmoled,
            surface = SurfaceAmoled
        )
    } else {
        baseScheme
    }

    val extended = if (useDark) {
        CausentryExtendedColors(
            success = SuccessGreen,
            warning = WarningAmber,
            danger = DangerRed,
            accentPurple = AccentPurple,
            accentOrange = AccentOrange,
            border = colorScheme.outlineVariant,
            surfaceHigh = colorScheme.surfaceVariant,
            isDark = true
        )
    } else {
        CausentryExtendedColors(
            success = SuccessGreenLight,
            warning = WarningAmberLight,
            danger = DangerRedLight,
            accentPurple = AccentPurpleLight,
            accentOrange = AccentOrangeLight,
            border = colorScheme.outlineVariant,
            surfaceHigh = colorScheme.surfaceVariant,
            isDark = false
        )
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window ?: return@SideEffect
            val controller = WindowCompat.getInsetsController(window, view)
            controller.isAppearanceLightStatusBars = !useDark
            controller.isAppearanceLightNavigationBars = !useDark
        }
    }

    CompositionLocalProvider(LocalCausentryColors provides extended) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}
