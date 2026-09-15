package dev.causentry.android.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val CausentryLightColorScheme = lightColorScheme()

@Composable
fun CausentryTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CausentryLightColorScheme,
        content = content,
    )
}
