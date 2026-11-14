package com.causentry.app.data

import android.content.Context
import android.os.FileObserver
import com.causentry.app.model.DaemonStatus
import com.causentry.app.model.PerAppConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DaemonBridge @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    private val _statusFlow = MutableStateFlow(DaemonStatus())
    val statusFlow: StateFlow<DaemonStatus> = _statusFlow.asStateFlow()

    private val _isSyncing = MutableStateFlow(false)
    val isSyncing: StateFlow<Boolean> = _isSyncing.asStateFlow()

    private var lastStatusModified: Long = 0L
    private var lastStatusLength: Long = 0L
    private var fileObserver: FileObserver? = null

    init {
        // Fast instant FileObserver on files directory to catch status.json MOVED_TO immediately
        try {
            fileObserver = object : FileObserver(context.filesDir, CLOSE_WRITE or MOVED_TO) {
                override fun onEvent(event: Int, path: String?) {
                    if (path == "status.json") {
                        scope.launch {
                            checkAndUpdateStatus()
                            _isSyncing.value = false
                        }
                    }
                }
            }
            fileObserver?.startWatching()
        } catch (t: Throwable) {
            android.util.Log.w("DaemonBridge", "FileObserver initialization skipped", t)
        }

        // Heartbeat fallback polling loop (every 2.5s)
        scope.launch {
            while (isActive) {
                checkAndUpdateStatus()
                delay(2500L)
            }
        }
    }

    suspend fun refresh() = withContext(Dispatchers.IO) {
        sendCommand(JSONObject().apply {
            put("action", "refresh")
        })
        checkAndUpdateStatus()
    }

    /**
     * Instant Optimistic UI Update: Mutates in-memory StateFlow immediately (0ms latency),
     * so Jetpack Compose UI updates at 120Hz without waiting for root shell I/O.
     */
    private fun applyOptimisticUpdate(
        targetPackages: Collection<String>,
        devOff: Boolean? = null,
        mock: Boolean? = null,
        isolate: Boolean? = null,
        accOff: Boolean? = null,
        template: String? = null,
        remove: Boolean = false
    ) {
        val current = _statusFlow.value
        val targetsList = current.targets.toMutableList()
        val hardenedList = current.hardened.toMutableList()
        val perAppMap = current.perAppConfigs.toMutableMap()

        for (pkg in targetPackages) {
            if (remove) {
                targetsList.remove(pkg)
                hardenedList.remove(pkg)
                perAppMap.remove(pkg)
            } else {
                if (!targetsList.contains(pkg)) {
                    targetsList.add(pkg)
                }
                val existing = perAppMap[pkg] ?: PerAppConfig()
                val nextDev = devOff ?: existing.devOff
                val nextMock = mock ?: existing.mock
                val nextIsolate = isolate ?: existing.isolate
                val nextAcc = accOff ?: existing.accOff
                val nextTpl = if (template != null) template.takeIf { it.isNotEmpty() } else existing.hideTemplate

                if (nextIsolate) {
                    if (!hardenedList.contains(pkg)) hardenedList.add(pkg)
                } else {
                    hardenedList.remove(pkg)
                }

                perAppMap[pkg] = PerAppConfig(
                    devOff = nextDev,
                    mock = nextMock,
                    isolate = nextIsolate,
                    accOff = nextAcc,
                    hideTemplate = nextTpl
                )
            }
        }

        _statusFlow.value = current.copy(
            targets = targetsList,
            hardened = hardenedList,
            perAppConfigs = perAppMap
        )
    }

    suspend fun setApp(
        pkg: String,
        devOff: Boolean,
        mock: Boolean,
        isolate: Boolean,
        accOff: Boolean = true,
        template: String?
    ): String = withContext(Dispatchers.IO) {
        // 1. Instant optimistic in-memory update (0ms UI latency)
        applyOptimisticUpdate(listOf(pkg), devOff, mock, isolate, accOff, template, remove = false)

        val op = "set-" + System.currentTimeMillis()
        val feats = mutableListOf<String>()
        if (devOff) feats.add("devOff")
        if (mock) feats.add("mock")
        if (isolate) feats.add("isolate")
        if (accOff) feats.add("accOff")

        // 2. Persist to daemon via RPC
        sendCommand(JSONObject().apply {
            put("action", "setapp")
            put("pkg", pkg)
            put("features", feats.joinToString(","))
            if (!template.isNullOrEmpty()) {
                put("template", template)
            }
            put("op", op)
        })
        op
    }

    suspend fun batchConfigureApps(
        targetPackages: List<String>,
        devOff: Boolean? = null,
        mock: Boolean? = null,
        isolate: Boolean? = null,
        accOff: Boolean? = null,
        template: String? = null,
        remove: Boolean = false
    ): String = withContext(Dispatchers.IO) {
        // 1. Instant optimistic in-memory update (0ms UI latency)
        applyOptimisticUpdate(targetPackages, devOff, mock, isolate, accOff, template, remove)

        val file = File(context.filesDir, "status.json")
        val content = if (file.exists()) file.readText(Charsets.UTF_8).replace("﻿", "").trim() else ""
        val statusJson = try { JSONObject(content) } catch (_: Throwable) { JSONObject() }
        val configJson = statusJson.optJSONObject("config") ?: JSONObject()

        val targetsArray = configJson.optJSONArray("targets") ?: JSONArray()
        val targetsList = (0 until targetsArray.length()).map { targetsArray.getString(it) }.toMutableList()

        val appsObj = configJson.optJSONObject("apps") ?: JSONObject()

        for (pkg in targetPackages) {
            if (remove) {
                targetsList.remove(pkg)
                appsObj.remove(pkg)
            } else {
                if (!targetsList.contains(pkg)) {
                    targetsList.add(pkg)
                }
                val existing = appsObj.optJSONObject(pkg) ?: JSONObject()
                if (devOff != null) existing.put("devOff", devOff)
                if (mock != null) existing.put("mock", mock)
                if (isolate != null) existing.put("isolate", isolate)
                if (accOff != null) existing.put("accOff", accOff)
                if (template != null) existing.put("hideTemplate", template)
                appsObj.put(pkg, existing)
            }
        }

        configJson.put("targets", JSONArray(targetsList))
        configJson.put("apps", appsObj)

        importConfig(configJson.toString())
    }

    suspend fun batchConfigureFeature(
        featureKey: String,
        enabledPackages: Set<String>,
        allPackages: Set<String>
    ): String = withContext(Dispatchers.IO) {
        // 1. Instant optimistic update for the selected feature
        val current = _statusFlow.value
        val targetsList = current.targets.toMutableList()
        val hardenedList = current.hardened.toMutableList()
        val perAppMap = current.perAppConfigs.toMutableMap()

        for (pkg in allPackages) {
            val isEnabled = enabledPackages.contains(pkg)
            val existing = perAppMap[pkg] ?: PerAppConfig()

            val nextDev = if (featureKey == "devOff") isEnabled else existing.devOff
            val nextMock = if (featureKey == "mock") isEnabled else existing.mock
            val nextIsolate = if (featureKey == "isolate") isEnabled else existing.isolate
            val nextAcc = if (featureKey == "accOff") isEnabled else existing.accOff

            val hasAny = nextDev || nextMock || nextIsolate || nextAcc
            if (hasAny) {
                if (!targetsList.contains(pkg)) targetsList.add(pkg)
                if (nextIsolate) {
                    if (!hardenedList.contains(pkg)) hardenedList.add(pkg)
                } else {
                    hardenedList.remove(pkg)
                }
                perAppMap[pkg] = existing.copy(
                    devOff = nextDev,
                    mock = nextMock,
                    isolate = nextIsolate,
                    accOff = nextAcc
                )
            } else {
                targetsList.remove(pkg)
                hardenedList.remove(pkg)
                perAppMap.remove(pkg)
            }
        }

        _statusFlow.value = current.copy(
            targets = targetsList,
            hardened = hardenedList,
            perAppConfigs = perAppMap
        )

        // 2. Persist to config.json
        val file = File(context.filesDir, "status.json")
        val content = if (file.exists()) file.readText(Charsets.UTF_8).replace("﻿", "").trim() else ""
        val statusJson = try { JSONObject(content) } catch (_: Throwable) { JSONObject() }
        val configJson = statusJson.optJSONObject("config") ?: JSONObject()

        val cfgTargetsArray = configJson.optJSONArray("targets") ?: JSONArray()
        val cfgTargetsList = (0 until cfgTargetsArray.length()).map { cfgTargetsArray.getString(it) }.toMutableList()
        val appsObj = configJson.optJSONObject("apps") ?: JSONObject()

        for (pkg in allPackages) {
            val isEnabled = enabledPackages.contains(pkg)
            val existing = appsObj.optJSONObject(pkg)

            if (isEnabled) {
                if (!cfgTargetsList.contains(pkg)) {
                    cfgTargetsList.add(pkg)
                }
                val o = existing ?: JSONObject().apply {
                    put("devOff", false)
                    put("mock", false)
                    put("isolate", false)
                    put("accOff", false)
                }
                o.put(featureKey, true)
                appsObj.put(pkg, o)
            } else {
                if (existing != null) {
                    existing.put(featureKey, false)
                    val hasAny = existing.optBoolean("devOff", false) ||
                                 existing.optBoolean("mock", false) ||
                                 existing.optBoolean("isolate", false) ||
                                 existing.optBoolean("accOff", false)
                    if (!hasAny) {
                        cfgTargetsList.remove(pkg)
                        appsObj.remove(pkg)
                    } else {
                        appsObj.put(pkg, existing)
                    }
                }
            }
        }

        configJson.put("targets", JSONArray(cfgTargetsList))
        configJson.put("apps", appsObj)

        importConfig(configJson.toString())
    }

    suspend fun delApp(pkg: String): String = withContext(Dispatchers.IO) {
        applyOptimisticUpdate(listOf(pkg), remove = true)
        val op = "del-" + System.currentTimeMillis()
        sendCommand(JSONObject().apply {
            put("action", "delapp")
            put("pkg", pkg)
            put("op", op)
        })
        op
    }

    suspend fun saveTemplate(
        name: String,
        packages: List<String>,
        deleteName: String? = null
    ): String = withContext(Dispatchers.IO) {
        val op = "tpl-" + System.currentTimeMillis()
        sendCommand(JSONObject().apply {
            put("action", "save")
            put("scope", "template")
            put("templateName", name)
            put("templatePackages", packages.joinToString(","))
            if (!deleteName.isNullOrEmpty()) {
                put("templateDelete", deleteName)
            }
            put("op", op)
        })
        checkAndUpdateStatus()
        op
    }

    suspend fun deleteTemplate(name: String): String = saveTemplate("", emptyList(), deleteName = name)

    suspend fun apply(): String = withContext(Dispatchers.IO) {
        val op = "apply-" + System.currentTimeMillis()
        sendCommand(JSONObject().apply {
            put("action", "apply")
            put("op", op)
        })
        checkAndUpdateStatus()
        op
    }

    suspend fun restore(): String = withContext(Dispatchers.IO) {
        val op = "rst-" + System.currentTimeMillis()
        sendCommand(JSONObject().apply {
            put("action", "restore")
            put("op", op)
        })
        checkAndUpdateStatus()
        op
    }

    suspend fun importConfig(jsonString: String): String = withContext(Dispatchers.IO) {
        val op = "imp-" + System.currentTimeMillis()
        val b64 = android.util.Base64.encodeToString(
            jsonString.toByteArray(Charsets.UTF_8),
            android.util.Base64.NO_WRAP
        )
        sendCommand(JSONObject().apply {
            put("action", "importcfg")
            put("configBase64", b64)
            put("op", op)
        })
        checkAndUpdateStatus()
        op
    }

    suspend fun saveStorageRules(roots: List<String>, relatives: List<String>): String = withContext(Dispatchers.IO) {
        val file = File(context.filesDir, "status.json")
        val currentJson = if (file.exists()) {
            val content = file.readText(Charsets.UTF_8).replace("﻿", "").trim()
            try {
                JSONObject(content).optJSONObject("config") ?: JSONObject()
            } catch (_: Throwable) {
                JSONObject()
            }
        } else {
            JSONObject()
        }

        val storageObj = JSONObject().apply {
            put("hiddenRootEntryNames", JSONArray(roots))
            put("hiddenRelativePaths", JSONArray(relatives))
        }
        currentJson.put("storageRules", storageObj)

        importConfig(currentJson.toString())
    }

    private fun sendCommand(obj: JSONObject): Boolean {
        _isSyncing.value = true
        val success = try {
            val cmdDir = File(context.filesDir, "cmd")
            if (!cmdDir.exists() && !cmdDir.mkdirs()) return false

            val id = "cmd-" + System.nanoTime()
            val tmp = File(cmdDir, "$id.tmp")
            val target = File(cmdDir, "$id.json")

            FileOutputStream(tmp).use { out ->
                out.write(obj.toString().toByteArray(Charsets.UTF_8))
                out.fd.sync()
            }
            if (!tmp.renameTo(target)) {
                tmp.delete()
                false
            } else {
                true
            }
        } catch (t: Throwable) {
            false
        }

        if (success) {
            // Immediate root execution wake-up so daemon does not wait for inotify interval
            scope.launch {
                try {
                    val p = ProcessBuilder("su", "-c", "timeout 6 sh /data/adb/modules/causentry/bin/uirpc.sh serve >/dev/null 2>&1")
                        .redirectErrorStream(true)
                        .start()
                    p.waitFor(5000, java.util.concurrent.TimeUnit.MILLISECONDS)
                } catch (_: Throwable) {}
                checkAndUpdateStatus(force = true)
                _isSyncing.value = false
            }
        } else {
            _isSyncing.value = false
        }
        return success
    }

    suspend fun checkAndUpdateStatus(force: Boolean = false) = withContext(Dispatchers.IO) {
        try {
            val file = File(context.filesDir, "status.json")
            if (!file.exists()) {
                if (_statusFlow.value.timestamp != 0L) {
                    _statusFlow.value = DaemonStatus()
                }
                return@withContext
            }

            val modified = file.lastModified()
            val length = file.length()
            if (!force && modified == lastStatusModified && length == lastStatusLength) {
                // File unchanged on disk, keep memory state
                return@withContext
            }

            val content = file.readText(Charsets.UTF_8).replace("\uFEFF", "").trim()
            val json = JSONObject(content)
            val parsed = parseStatus(json)

            lastStatusModified = modified
            lastStatusLength = length
            _statusFlow.value = parsed
        } catch (t: Throwable) {
            android.util.Log.e("DaemonBridge", "failed to read or parse status.json", t)
        }
    }

    private fun parseStatus(json: JSONObject): DaemonStatus {
        val targetsList = jsonList(json.optJSONArray("targets"))
        val hardenedList = jsonList(json.optJSONArray("hardened"))
        val denylistList = jsonList(json.optJSONArray("denylist"))
        val rootAppsList = json.optString("rootApps", "")
            .split(",").map { it.trim() }.filter { it.isNotEmpty() }
        val rootSuggestList = json.optString("rootSuggest", "")
            .split(",").map { it.trim() }.filter { it.isNotEmpty() }

        val cfg = json.optJSONObject("config") ?: JSONObject()
        val appsObj = cfg.optJSONObject("apps") ?: json.optJSONObject("apps") ?: JSONObject()
        val perAppMap = mutableMapOf<String, PerAppConfig>()
        val appKeys = appsObj.keys()
        while (appKeys.hasNext()) {
            val k = appKeys.next()
            val o = appsObj.optJSONObject(k) ?: continue
            perAppMap[k] = PerAppConfig(
                devOff = o.optBoolean("devOff", false),
                mock = o.optBoolean("mock", false),
                isolate = o.optBoolean("isolate", false),
                accOff = o.optBoolean("accOff", false),
                hideTemplate = o.optString("hideTemplate", "").takeIf { it.isNotEmpty() }
            )
        }

        val templatesObj = cfg.optJSONObject("hideTemplates") ?: json.optJSONObject("hideTemplates") ?: JSONObject()
        val templatesMap = mutableMapOf<String, List<String>>()
        val tplKeys = templatesObj.keys()
        while (tplKeys.hasNext()) {
            val name = tplKeys.next()
            val arr = templatesObj.optJSONArray(name)
            templatesMap[name] = jsonList(arr)
        }

        val fuseObj = json.optJSONObject("fuse")
        val fuseActive = fuseObj?.optBoolean("active", false) ?: false
        val fuseCovered = fuseObj?.optBoolean("covered", false) ?: false
        val fuseTargetCount = fuseObj?.optInt("targetCount", 0) ?: targetsList.size

        val storageRulesObj = cfg.optJSONObject("storageRules") ?: json.optJSONObject("storageRules")
        val storageRoots = jsonList(storageRulesObj?.optJSONArray("hiddenRootEntryNames"))
        val storageRelatives = jsonList(storageRulesObj?.optJSONArray("hiddenRelativePaths"))

        return DaemonStatus(
            state = json.optString("state", "unknown"),
            daemonAlive = json.optBoolean("daemon", false),
            heartbeatAge = json.optLong("age", 999999L),
            timestamp = json.optLong("ts", 0L),
            susfs = json.optString("susfs", "unsupported"),
            zygisk = json.optString("zygisk", "unknown"),
            cloakReady = json.optBoolean("cloakReady", false),
            targets = targetsList,
            hardened = hardenedList,
            denylist = denylistList,
            autoDevOff = json.optBoolean("autoDevOff", true),
            hideMockLocation = json.optBoolean("hideMockLocation", true),
            alwaysHidden = json.optBoolean("alwaysHidden", false),
            susfsOn = json.optBoolean("susfsOn", false),
            hideRootApps = json.optBoolean("hideRootApps", false),
            uiApk = json.optBoolean("uiApk", true),
            rootApps = rootAppsList,
            rootSuggest = rootSuggestList,
            applyBusy = json.optBoolean("applyBusy", false),
            applyDone = json.optInt("applyDone", 0),
            applyRc = json.optInt("applyRc", 0),
            applyToken = json.optString("applyToken", ""),
            commandRc = json.optInt("commandRc", 0),
            commandToken = json.optString("commandToken", ""),
            templates = templatesMap,
            perAppConfigs = perAppMap,
            log = json.optString("log", ""),
            fuseActive = fuseActive,
            fuseCovered = fuseCovered,
            fuseTargetCount = fuseTargetCount,
            storageHiddenRoots = storageRoots,
            storageHiddenRelatives = storageRelatives
        )
    }

    private fun jsonList(arr: JSONArray?): List<String> {
        if (arr == null) return emptyList()
        val list = ArrayList<String>(arr.length())
        for (i in 0 until arr.length()) {
            val item = arr.optString(i, "")
            if (item.isNotEmpty()) list.add(item)
        }
        return list
    }
}
