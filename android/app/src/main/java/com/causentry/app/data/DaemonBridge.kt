package com.causentry.app.data

import android.content.Context
import android.net.LocalSocket
import android.net.LocalSocketAddress
import com.causentry.app.model.DaemonStatus
import com.causentry.app.model.PerAppConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.File
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Event-driven LocalSocket RPC bridge to the native Rust `causentryd` daemon.
 *
 * - Zero `su` prompts (authenticated by causentryd via SO_PEERCRED UID check).
 * - Zero background polling (every RPC returns the authoritative updated DaemonStatus in < 20ms).
 * - Zero file drops or world-readable state files.
 */
@Singleton
class DaemonBridge @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val rpcMutex = Mutex()

    private val _statusFlow = MutableStateFlow(DaemonStatus())
    val statusFlow: StateFlow<DaemonStatus> = _statusFlow.asStateFlow()

    private val _isSyncing = MutableStateFlow(false)
    val isSyncing: StateFlow<Boolean> = _isSyncing.asStateFlow()

    private var lastRawConfigJson: JSONObject = JSONObject()

    private val socketPath: String
        get() = File(context.noBackupFilesDir, ".rpc.sock").absolutePath

    init {
        // Ensure no_backup dir exists so causentryd can bind .rpc.sock inside it
        try {
            context.noBackupFilesDir.mkdirs()
        } catch (_: Throwable) {}

        scope.launch {
            fetchStatus()
        }
    }

    suspend fun fetchStatus(): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "get_status")
    })

    suspend fun refresh(): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "refresh")
    })

    suspend fun setApp(
        pkg: String,
        devOff: Boolean,
        mock: Boolean,
        isolate: Boolean,
        accOff: Boolean,
        template: String?
    ): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "set_app")
        put("pkg", pkg)
        put("devOff", devOff)
        put("mock", mock)
        put("isolate", isolate)
        put("accOff", accOff)
        if (!template.isNullOrBlank()) {
            put("template", template.trim())
        }
    })

    suspend fun delApp(pkg: String): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "del_app")
        put("pkg", pkg)
    })

    suspend fun saveTemplate(
        name: String,
        packages: List<String>,
        deleteName: String? = null
    ): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "save_template")
        put("name", name.trim())
        put("packages", JSONArray(packages))
        if (!deleteName.isNullOrBlank()) {
            put("deleteName", deleteName.trim())
        }
    })

    suspend fun deleteTemplate(name: String): DaemonStatus =
        saveTemplate("", emptyList(), deleteName = name)

    suspend fun saveStorageRules(roots: List<String>, relatives: List<String>): DaemonStatus =
        executeRpc(JSONObject().apply {
            put("action", "save_storage_rules")
            put("hiddenRootEntryNames", JSONArray(roots))
            put("hiddenRelativePaths", JSONArray(relatives))
        })

    suspend fun applyTemplateDiff(
        template: String,
        pkgAdd: List<String>,
        pkgRemove: List<String>
    ): DaemonStatus = withContext(Dispatchers.IO) {
        val cfg = cloneCurrentConfig()
        val appsObj = cfg.optJSONObject("apps") ?: JSONObject()
        val targets = jsonList(cfg.optJSONArray("targets")).toMutableList()

        for (pkg in pkgAdd.distinct()) {
            if (!targets.contains(pkg)) targets.add(pkg)
            val entry = appsObj.optJSONObject(pkg) ?: JSONObject()
            entry.put("hideTemplate", template)
            appsObj.put(pkg, entry)
        }

        for (pkg in pkgRemove.distinct().filter { it !in pkgAdd }) {
            val entry = appsObj.optJSONObject(pkg)
            if (entry != null) {
                entry.remove("hideTemplate")
                val hasFeature = entry.optBoolean("devOff", false) ||
                    entry.optBoolean("mock", false) ||
                    entry.optBoolean("isolate", false) ||
                    entry.optBoolean("accOff", false)
                if (hasFeature) {
                    appsObj.put(pkg, entry)
                } else {
                    appsObj.remove(pkg)
                    targets.remove(pkg)
                }
            } else {
                targets.remove(pkg)
            }
        }

        cfg.put("targets", JSONArray(targets))
        cfg.put("apps", appsObj)
        importConfigObject(cfg)
    }

    suspend fun batchConfigureFeature(
        featureKey: String,
        enabledPackages: Set<String>,
        allPackages: Set<String>
    ): DaemonStatus = withContext(Dispatchers.IO) {
        val cfg = cloneCurrentConfig()
        val appsObj = cfg.optJSONObject("apps") ?: JSONObject()
        val targets = jsonList(cfg.optJSONArray("targets")).toMutableList()

        for (pkg in allPackages) {
            val enabled = enabledPackages.contains(pkg)
            val existing = appsObj.optJSONObject(pkg)
            if (enabled) {
                if (!targets.contains(pkg)) targets.add(pkg)
                val entry = existing ?: JSONObject().apply {
                    put("devOff", false)
                    put("mock", false)
                    put("isolate", false)
                    put("accOff", false)
                }
                entry.put(featureKey, true)
                appsObj.put(pkg, entry)
            } else if (existing != null) {
                existing.put(featureKey, false)
                val tpl = existing.optString("hideTemplate", "").trim()
                val hasTemplate = tpl.isNotEmpty() && !tpl.equals("none", ignoreCase = true)
                val hasAny = existing.optBoolean("devOff", false) ||
                    existing.optBoolean("mock", false) ||
                    existing.optBoolean("isolate", false) ||
                    existing.optBoolean("accOff", false) ||
                    hasTemplate
                if (!hasAny) {
                    appsObj.remove(pkg)
                    targets.remove(pkg)
                } else {
                    appsObj.put(pkg, existing)
                }
            }
        }

        cfg.put("targets", JSONArray(targets))
        cfg.put("apps", appsObj)
        importConfigObject(cfg)
    }

    suspend fun importConfig(jsonString: String): DaemonStatus = withContext(Dispatchers.IO) {
        val obj = JSONObject(jsonString)
        importConfigObject(obj)
    }

    suspend fun importConfigObject(configObj: JSONObject): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "import_config")
        put("config", configObj)
    })

    suspend fun apply(): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "apply")
    })

    suspend fun restore(): DaemonStatus = executeRpc(JSONObject().apply {
        put("action", "restore")
    })

    private fun cloneCurrentConfig(): JSONObject =
        try {
            JSONObject(lastRawConfigJson.toString())
        } catch (_: Throwable) {
            JSONObject()
        }

    private suspend fun executeRpc(request: JSONObject): DaemonStatus = withContext(Dispatchers.IO) {
        rpcMutex.withLock {
            _isSyncing.value = true
            try {
                val payload = request.toString().toByteArray(Charsets.UTF_8)
                val responseBytes = sendOverLocalSocket(payload)
                val json = JSONObject(String(responseBytes, Charsets.UTF_8))
                val parsed = parseStatus(json)
                _statusFlow.value = parsed
                parsed
            } catch (t: Throwable) {
                android.util.Log.w("DaemonBridge", "RPC failed: ${t.message}")
                val offline = _statusFlow.value.copy(
                    daemonAlive = false,
                    rpcError = t.message ?: "Unable to connect to causentryd"
                )
                _statusFlow.value = offline
                offline
            } finally {
                _isSyncing.value = false
            }
        }
    }

    private fun sendOverLocalSocket(payload: ByteArray): ByteArray {
        val socket = LocalSocket(LocalSocket.SOCKET_STREAM)
        try {
            socket.connect(LocalSocketAddress(socketPath, LocalSocketAddress.Namespace.FILESYSTEM))
            socket.soTimeout = 6000

            val out = DataOutputStream(socket.outputStream)
            out.writeInt(payload.size)
            out.write(payload)
            out.flush()

            val inp = DataInputStream(socket.inputStream)
            val respLen = inp.readInt()
            if (respLen <= 0 || respLen > 4 * 1024 * 1024) {
                throw IllegalStateException("Invalid RPC response length: $respLen")
            }
            val respBuf = ByteArray(respLen)
            inp.readFully(respBuf)
            return respBuf
        } finally {
            try {
                socket.close()
            } catch (_: Throwable) {}
        }
    }

    private fun parseStatus(json: JSONObject): DaemonStatus {
        val cfg = json.optJSONObject("config") ?: JSONObject()
        lastRawConfigJson = cfg

        val targetsList = jsonList(json.optJSONArray("targets"))
        val hardenedList = jsonList(json.optJSONArray("hardened"))
        val denylistList = jsonList(json.optJSONArray("denylist"))

        val appsObj = cfg.optJSONObject("apps") ?: JSONObject()
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

        val templatesObj = cfg.optJSONObject("hideTemplates") ?: JSONObject()
        val templatesMap = mutableMapOf<String, List<String>>()
        val tplKeys = templatesObj.keys()
        while (tplKeys.hasNext()) {
            val name = tplKeys.next()
            templatesMap[name] = jsonList(templatesObj.optJSONArray(name))
        }

        val fuseObj = json.optJSONObject("fuse")
        val fuseActive = fuseObj?.optBoolean("active", false) ?: false
        val fuseCovered = fuseObj?.optBoolean("covered", false) ?: false
        val fuseTargetCount = fuseObj?.optInt("targetCount", 0) ?: 0

        val storageRulesObj = cfg.optJSONObject("storageRules")
        val storageRoots = jsonList(storageRulesObj?.optJSONArray("hiddenRootEntryNames"))
        val storageRelatives = jsonList(storageRulesObj?.optJSONArray("hiddenRelativePaths"))

        val defaultRoots = jsonList(json.optJSONArray("defaultStorageRoots"))
        val defaultRelatives = jsonList(json.optJSONArray("defaultStorageRelatives"))

        val errStr = if (json.isNull("error")) null else json.optString("error", "").takeIf { it.isNotEmpty() }

        return DaemonStatus(
            state = json.optString("state", "unknown"),
            daemonAlive = json.optBoolean("daemon", false),
            daemonPid = json.optInt("daemonPid", 0),
            daemonUptimeSec = json.optLong("daemonUptimeSec", 0L),
            rootProvider = json.optString("rootProvider", "Unknown"),
            timestamp = json.optLong("ts", 0L),
            susfs = json.optString("susfs", "unsupported"),
            zygisk = json.optString("zygisk", "standby"),
            cloakReady = json.optBoolean("cloakReady", false),
            pkgHookCount = json.optInt("pkgHookCount", 0),
            settingsHookReady = json.optBoolean("settingsHookReady", false),
            settingsHookCount = json.optInt("settingsHookCount", 0),
            usbHookReady = json.optBoolean("usbHookReady", false),
            usbHookCount = json.optInt("usbHookCount", 0),
            a11yHookCount = json.optInt("a11yHookCount", 0),
            appZygoteHookCount = json.optInt("appZygoteHookCount", 0),
            targets = targetsList,
            hardened = hardenedList,
            denylist = denylistList,
            autoDevOff = json.optBoolean("autoDevOff", true),
            hideMockLocation = json.optBoolean("hideMockLocation", true),
            alwaysHidden = json.optBoolean("alwaysHidden", false),
            susfsOn = json.optBoolean("susfsOn", true),
            hideRootApps = json.optBoolean("hideRootApps", false),
            uiApk = json.optBoolean("uiApk", true),
            systemCloak = json.optBoolean("systemCloak", true),
            hideMode = json.optString("hideMode", "cloak"),
            cloakPackages = jsonList(json.optJSONArray("cloakPackages")),
            templates = templatesMap,
            perAppConfigs = perAppMap,
            log = json.optString("log", ""),
            fuseActive = fuseActive,
            fuseCovered = fuseCovered,
            fuseTargetCount = fuseTargetCount,
            storageHiddenRoots = storageRoots,
            storageHiddenRelatives = storageRelatives,
            defaultStorageRoots = defaultRoots,
            defaultStorageRelatives = defaultRelatives,
            rpcError = errStr
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
