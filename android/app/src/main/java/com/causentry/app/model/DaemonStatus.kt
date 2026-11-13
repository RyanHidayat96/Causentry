package com.causentry.app.model

data class DaemonStatus(
    val state: String = "unknown",
    val daemonAlive: Boolean = false,
    val heartbeatAge: Long = 999999L,
    val timestamp: Long = 0L,
    val susfs: String = "unsupported",
    val zygisk: String = "unknown",
    val cloakReady: Boolean = false,
    val targets: List<String> = emptyList(),
    val hardened: List<String> = emptyList(),
    val denylist: List<String> = emptyList(),
    val autoDevOff: Boolean = true,
    val hideMockLocation: Boolean = true,
    val alwaysHidden: Boolean = false,
    val susfsOn: Boolean = false,
    val hideRootApps: Boolean = false,
    val uiApk: Boolean = true,
    val rootApps: List<String> = emptyList(),
    val rootSuggest: List<String> = emptyList(),
    val applyBusy: Boolean = false,
    val applyDone: Int = 0,
    val applyRc: Int = 0,
    val applyToken: String = "",
    val commandRc: Int = 0,
    val commandToken: String = "",
    val templates: Map<String, List<String>> = emptyMap(),
    val perAppConfigs: Map<String, PerAppConfig> = emptyMap(),
    val log: String = ""
)

data class PerAppConfig(
    val devOff: Boolean = false,
    val mock: Boolean = false,
    val isolate: Boolean = false,
    val hideTemplate: String? = null
)
