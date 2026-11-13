package com.causentry.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.view.WindowCompat
import com.causentry.app.ui.CausentryApp
import com.causentry.app.ui.MainViewModel
import com.causentry.app.ui.theme.CausentryTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        handleIntent(intent)

        setContent {
            CausentryTheme {
                CausentryApp(viewModel = viewModel)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        if (intent == null) return
        val targetApp = intent.getStringExtra("app")
        if (!targetApp.isNullOrBlank()) {
            val matching = viewModel.filteredApps.value.find { it.packageName == targetApp }
            viewModel.onSelectApp(matching)
        }
    }
}
