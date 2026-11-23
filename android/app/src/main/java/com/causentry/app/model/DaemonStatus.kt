package com.causentry.app.model

data class DaemonStatus(
    val state: String = "unknown",
    val daemonAlive: Boolean = false,
    val daemonPid: Int = 0,
    val daemonUptimeSec: Long = 0L,
    val rootProvider: String = "Unknown",
    val timestamp: Long = 0L,
    val susfs: String = "unsupported",
    val zygisk: String = "standby",
    val cloakReady: Boolean = false,
    val pkgHookCount: Int = 0,
    val settingsHookReady: Boolean = false,
    val settingsHookCount: Int = 0,
    val usbHookReady: Boolean = false,
    val usbHookCount: Int = 0,
    val a11yHookCount: Int = 0,
    val appZygoteHookCount: Int = 0,
    val targets: List<String> = emptyList(),
    val hardened: List<String> = emptyList(),
    val denylist: List<String> = emptyList(),
    val autoDevOff: Boolean = true,
    val hideMockLocation: Boolean = true,
    val alwaysHidden: Boolean = false,
    val susfsOn: Boolean = true,
    val hideRootApps: Boolean = false,
    val uiApk: Boolean = true,
    val systemCloak: Boolean = true,
    val hideMode: String = "cloak",
    val cloakPackages: List<String> = emptyList(),
    val templates: Map<String, List<String>> = emptyMap(),
    val perAppConfigs: Map<String, PerAppConfig> = emptyMap(),
    val log: String = "",
    // FUSE Storage Cloak Status & Rules
    val fuseActive: Boolean = false,
    val fuseCovered: Boolean = false,
    val fuseTargetCount: Int = 0,
    val storageHiddenRoots: List<String> = emptyList(),
    val storageHiddenRelatives: List<String> = emptyList(),
    val defaultStorageRoots: List<String> = emptyList(),
    val defaultStorageRelatives: List<String> = emptyList(),
    val rpcError: String? = null
)

data class PerAppConfig(
    val devOff: Boolean = false,
    val mock: Boolean = false,
    val isolate: Boolean = false,
    val accOff: Boolean = false,
    val hideTemplate: String? = null
)
