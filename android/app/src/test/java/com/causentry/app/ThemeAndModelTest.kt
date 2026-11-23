package com.causentry.app

import com.causentry.app.data.AppLanguage
import com.causentry.app.data.ThemeMode
import com.causentry.app.model.DaemonStatus
import com.causentry.app.model.PerAppConfig
import com.causentry.app.ui.components.formatUptime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ThemeAndModelTest {
    @Test
    fun themeModeRoundTrip() {
        assertEquals(ThemeMode.SYSTEM, ThemeMode.fromKey("system"))
        assertEquals(ThemeMode.LIGHT, ThemeMode.fromKey("light"))
        assertEquals(ThemeMode.DARK, ThemeMode.fromKey("dark"))
        assertEquals(ThemeMode.AMOLED, ThemeMode.fromKey("amoled"))
        assertEquals(ThemeMode.DARK, ThemeMode.fromKey("unknown"))
        assertEquals(ThemeMode.DARK, ThemeMode.fromKey(null))
    }

    @Test
    fun languageRoundTrip() {
        assertEquals(AppLanguage.SYSTEM, AppLanguage.fromKey("system"))
        assertEquals(AppLanguage.EN, AppLanguage.fromKey("en"))
        assertEquals(AppLanguage.ID, AppLanguage.fromKey("in"))
        assertEquals(AppLanguage.SYSTEM, AppLanguage.fromKey(null))
    }

    @Test
    fun uptimeFormatting() {
        assertEquals("0s", formatUptime(0))
        assertEquals("45s", formatUptime(45))
        assertEquals("2m 5s", formatUptime(125))
        assertEquals("1h 1m", formatUptime(3665))
    }

    @Test
    fun daemonStatusDefaultsAreSafeAndOffline() {
        val status = DaemonStatus()
        assertFalse(status.daemonAlive)
        assertFalse(status.cloakReady)
        assertEquals(0, status.daemonPid)
        assertEquals(0, status.pkgHookCount)
        assertNull(status.rpcError)
        assertTrue(status.targets.isEmpty())

        val perApp = PerAppConfig(devOff = true, mock = true, isolate = false, accOff = true, hideTemplate = "stealth")
        assertTrue(perApp.devOff)
        assertFalse(perApp.isolate)
        assertEquals("stealth", perApp.hideTemplate)
    }
}
