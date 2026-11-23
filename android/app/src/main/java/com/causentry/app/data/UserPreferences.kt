package com.causentry.app.data

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

enum class ThemeMode(val key: String) {
    SYSTEM("system"),
    LIGHT("light"),
    DARK("dark"),
    AMOLED("amoled");

    companion object {
        fun fromKey(key: String?): ThemeMode = entries.find { it.key == key } ?: DARK
    }
}

enum class AppLanguage(val key: String) {
    SYSTEM("system"),
    EN("en"),
    ID("in");

    companion object {
        fun fromKey(key: String?): AppLanguage = entries.find { it.key == key } ?: SYSTEM
    }
}

@Singleton
class UserPreferences @Inject constructor(
    @ApplicationContext context: Context
) {
    private val prefs = context.getSharedPreferences("causentry_ui_prefs", Context.MODE_PRIVATE)

    private val _themeMode = MutableStateFlow(ThemeMode.fromKey(prefs.getString("theme_mode", ThemeMode.DARK.key)))
    val themeMode: StateFlow<ThemeMode> = _themeMode.asStateFlow()

    private val _dynamicColor = MutableStateFlow(prefs.getBoolean("dynamic_color", true))
    val dynamicColor: StateFlow<Boolean> = _dynamicColor.asStateFlow()

    private val _language = MutableStateFlow(AppLanguage.fromKey(prefs.getString("app_language", AppLanguage.SYSTEM.key)))
    val language: StateFlow<AppLanguage> = _language.asStateFlow()

    fun setThemeMode(mode: ThemeMode) {
        _themeMode.value = mode
        prefs.edit().putString("theme_mode", mode.key).apply()
    }

    fun setDynamicColor(enabled: Boolean) {
        _dynamicColor.value = enabled
        prefs.edit().putBoolean("dynamic_color", enabled).apply()
    }

    fun setLanguage(lang: AppLanguage) {
        _language.value = lang
        prefs.edit().putString("app_language", lang.key).apply()
    }
}
