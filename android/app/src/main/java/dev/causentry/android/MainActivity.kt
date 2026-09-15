package dev.causentry.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import dev.causentry.android.ui.CausentryApp
import dev.causentry.android.ui.theme.CausentryTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CausentryTheme {
                CausentryApp()
            }
        }
    }
}
