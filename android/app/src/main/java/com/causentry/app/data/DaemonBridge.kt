package com.causentry.app.data

import android.content.Context
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
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DaemonBridge @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    private val _statusFlow = MutableStateFlow(DaemonStatus())
    val statusFlow: StateFlow<DaemonStatus> = _statusFlow.asStateFlow()

    private var lastStatusModified: Long = 0L
    private var lastStatusLength: Long = 0L

    init {
        // Start background polling loop
        scope.launch {
            while (isActive) {
                checkAndUpdateStatus()
                delay(2000L)
            }
        }
    }

    suspend fun refresh() = withContext(Dispatchers.IO) {
        sendCommand(JSONObject().apply {
            put("action", "refresh")
        })
        checkAndUpdateStatus()
    }

    suspend fun setApp(
        pkg: String,
        devOff: Boolean,
        mock: Boolean,
        isolate: Boolean,
        template: String?
    ): String = withContext(Dispatchers.IO) {
        val op = "set-" + System.currentTimeMillis()
        val feats = mutableListOf<String>()
        if (devOff) feats.add("devOff")
        if (mock) feats.add("mock")
        if (isolate) feats.add("isolate")

        sendCommand(JSONObject().apply {
            put("action", "setapp")
            put("pkg", pkg)
            put("features", feats.joinToString(","))
            if (!template.isNullOrEmpty()) {
                put("template", template)
            }
            put("op", op)
        })
        checkAndUpdateStatus()
        op
    }

    suspend fun delApp(pkg: String): String = withContext(Dispatchers.IO) {
        val op = "del-" + System.currentTimeMillis()
        sendCommand(JSONObject().apply {
            put("action", "delapp")
            put("pkg", pkg)
            put("op", op)
        })
        checkAndUpdateStatus()
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
        val op = "app-" + System.currentTimeMillis()
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

    private fun sendCommand(obj: JSONObject): Boolean {
        return try {
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
    }

    suspend fun checkAndUpdateStatus() = withContext(Dispatchers.IO) {
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
            if (modified == lastStatusModified && length == lastStatusLength) {
                // File unchanged, avoid JSON re-parse
                return@withContext
            }

            val content = file.readText(Charsets.UTF_8)
            val json = JSONObject(content)
            val parsed = parseStatus(json)

            lastStatusModified = modified
            lastStatusLength = length
            _statusFlow.value = parsed
        } catch (t: Throwable) {
            // Keep previous status or mark daemon down on I/O error
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
                hideTemplate = o.optString("hideTemplate", "").takeIf { it.isNotEmpty() }
            )
        }

        val templatesObj = cfg.optJSONObject("hideTemplates") ?: JSONObject()
        val templatesMap = mutableMapOf<String, List<String>>()
        val tplKeys = templatesObj.keys()
        while (tplKeys.hasNext()) {
            val name = tplKeys.next()
            val arr = templatesObj.optJSONArray(name)
            templatesMap[name] = jsonList(arr)
        }

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
            log = json.optString("log", "")
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
