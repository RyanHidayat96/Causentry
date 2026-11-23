package com.causentry.app

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.core.content.ContextCompat
import com.causentry.app.data.AppLanguage
import com.causentry.app.ui.CausentryApp
import com.causentry.app.ui.MainViewModel
import com.causentry.app.ui.theme.CausentryTheme
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    private val notificationPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { }

    override fun attachBaseContext(newBase: Context) {
        val prefs = newBase.getSharedPreferences("causentry_ui_prefs", Context.MODE_PRIVATE)
        val langKey = prefs.getString("app_language", AppLanguage.SYSTEM.key)
        val wrapped = if (langKey == null || langKey == AppLanguage.SYSTEM.key) {
            newBase
        } else {
            val locale = Locale(langKey)
            Locale.setDefault(locale)
            val cfg = Configuration(newBase.resources.configuration)
            cfg.setLocale(locale)
            newBase.createConfigurationContext(cfg)
        }
        super.attachBaseContext(wrapped)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        ensureNotificationPermission()
        handleIntent(intent)

        setContent {
            val themeMode by viewModel.themeMode.collectAsState()
            val dynamicColor by viewModel.dynamicColor.collectAsState()

            CausentryTheme(
                themeMode = themeMode,
                dynamicColor = dynamicColor
            ) {
                CausentryApp(
                    viewModel = viewModel,
                    onLanguageChanged = { lang ->
                        viewModel.setLanguage(lang)
                        recreate()
                    }
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        val targetApp = intent?.getStringExtra("app")
        if (!targetApp.isNullOrBlank()) {
            viewModel.requestOpenApp(targetApp)
        }
    }

    private fun ensureNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            val granted = ContextCompat.checkSelfPermission(
                this, android.Manifest.permission.POST_NOTIFICATIONS
            ) == PackageManager.PERMISSION_GRANTED
            if (!granted) {
                notificationPermissionLauncher.launch(android.Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }
}
