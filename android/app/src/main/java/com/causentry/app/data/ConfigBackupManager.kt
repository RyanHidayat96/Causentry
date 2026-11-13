package com.causentry.app.data

import android.content.Context
import android.net.Uri
import android.os.Build
import com.causentry.app.model.DaemonStatus
import com.causentry.app.model.PerAppConfig
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject
import javax.inject.Singleton

data class ParsedBackupInfo(
    val format: String,
    val targetCount: Int,
    val templateCount: Int,
    val targetNames: List<String>,
    val templateNames: List<String>,
    val fullConfigJson: JSONObject
)

@Singleton
class ConfigBackupManager @Inject constructor(
    @ApplicationContext private val context: Context,
    private val daemonBridge: DaemonBridge
) {
    /**
     * Creates a formatted Causentry JSON backup.
     */
    fun createBackupJson(status: DaemonStatus): String {
        val root = JSONObject()
        root.put("format", "causentry_backup")
        root.put("version", 1)
        root.put("timestamp", System.currentTimeMillis())
        root.put("date", SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date()))
        root.put("device", "${Build.MANUFACTURER} ${Build.MODEL} (Android ${Build.VERSION.RELEASE})")

        val summary = JSONObject()
        summary.put("targetCount", status.targets.size)
        summary.put("templateCount", status.templates.size)
        root.put("summary", summary)

        val cfg = JSONObject()
        val targetsArr = JSONArray()
        status.targets.forEach { targetsArr.put(it) }
        cfg.put("targets", targetsArr)

        val appsObj = JSONObject()
        status.perAppConfigs.forEach { (pkg, appCfg) ->
            val o = JSONObject()
            o.put("devOff", appCfg.devOff)
            o.put("mock", appCfg.mock)
            o.put("isolate", appCfg.isolate)
            if (!appCfg.hideTemplate.isNullOrEmpty()) {
                o.put("hideTemplate", appCfg.hideTemplate)
            }
            appsObj.put(pkg, o)
        }
        cfg.put("apps", appsObj)

        val tplsObj = JSONObject()
        status.templates.forEach { (name, pkgs) ->
            val arr = JSONArray()
            pkgs.forEach { arr.put(it) }
            tplsObj.put(name, arr)
        }
        cfg.put("hideTemplates", tplsObj)

        cfg.put("autoDevOff", status.autoDevOff)
        cfg.put("hideMockLocation", status.hideMockLocation)
        cfg.put("alwaysHidden", status.alwaysHidden)
        cfg.put("susfs", status.susfsOn)
        cfg.put("hideRootApps", status.hideRootApps)
        cfg.put("uiApk", status.uiApk)
        cfg.put("systemCloak", false)
        cfg.put("hideMode", "none")
        cfg.put("cloakPackages", JSONArray())

        root.put("config", cfg)

        return root.toString(2)
    }

    /**
     * Exports backup to a shareable file in the app cache directory.
     */
    suspend fun exportToCache(status: DaemonStatus): File = withContext(Dispatchers.IO) {
        val dir = File(context.cacheDir, "backups")
        if (!dir.exists()) dir.mkdirs()

        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val file = File(dir, "causentry_backup_$timestamp.json")
        val json = createBackupJson(status)

        file.writeText(json, Charsets.UTF_8)
        file
    }

    /**
     * Parses and validates a JSON backup from URI (supports Causentry and HMA-OSS).
     */
    suspend fun parseBackupUri(uri: Uri): Result<ParsedBackupInfo> = withContext(Dispatchers.IO) {
        try {
            val content = context.contentResolver.openInputStream(uri)?.use { stream ->
                BufferedReader(InputStreamReader(stream, Charsets.UTF_8)).readText()
            } ?: return@withContext Result.failure(Exception("Cannot open file stream"))

            val clean = content.replace("\uFEFF", "").trim()
            val root = JSONObject(clean)

            if (root.optString("format") == "causentry_backup") {
                val cfg = root.optJSONObject("config") ?: JSONObject()
                val targets = jsonArrayToList(cfg.optJSONArray("targets"))
                val tpls = cfg.optJSONObject("hideTemplates") ?: JSONObject()
                val tplNames = mutableListOf<String>()
                val keys = tpls.keys()
                while (keys.hasNext()) tplNames.add(keys.next())

                return@withContext Result.success(
                    ParsedBackupInfo(
                        format = "Causentry v1",
                        targetCount = targets.size,
                        templateCount = tplNames.size,
                        targetNames = targets,
                        templateNames = tplNames,
                        fullConfigJson = cfg
                    )
                )
            }

            // HMA-OSS or direct config.json format detection
            if (root.has("hideTemplates") || root.has("apps") || root.has("templates")) {
                val targets = jsonArrayToList(root.optJSONArray("targets"))
                val tpls = root.optJSONObject("hideTemplates") ?: root.optJSONObject("templates") ?: JSONObject()
                val tplNames = mutableListOf<String>()
                val keys = tpls.keys()
                while (keys.hasNext()) tplNames.add(keys.next())

                val configObj = JSONObject(clean)
                // Normalize templates key if coming from HMA
                if (!configObj.has("hideTemplates") && configObj.has("templates")) {
                    configObj.put("hideTemplates", configObj.get("templates"))
                }

                return@withContext Result.success(
                    ParsedBackupInfo(
                        format = if (root.has("templates")) "HMA-OSS" else "Direct Config",
                        targetCount = targets.size,
                        templateCount = tplNames.size,
                        targetNames = targets,
                        templateNames = tplNames,
                        fullConfigJson = configObj
                    )
                )
            }

            Result.failure(Exception("Unrecognized backup format. File must be a Causentry or HMA-OSS JSON backup."))
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }

    /**
     * Merges or replaces the imported backup into the current live configuration.
     * @param replaceAll If true, replaces current rules entirely; if false, merges with existing rules.
     */
    suspend fun applyBackup(
        backupInfo: ParsedBackupInfo,
        replaceAll: Boolean
    ): Result<String> = withContext(Dispatchers.IO) {
        try {
            val currentStatus = daemonBridge.statusFlow.value

            val finalCfg = if (replaceAll) {
                // Take imported config as base, ensure mandatory defaults
                val cfg = backupInfo.fullConfigJson
                ensureConfigDefaults(cfg)
                cfg
            } else {
                // Merge imported config with current live status
                mergeConfigs(currentStatus, backupInfo.fullConfigJson)
            }

            val resultJsonString = finalCfg.toString()
            val op = daemonBridge.importConfig(resultJsonString)
            Result.success(op)
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }

    private fun mergeConfigs(current: DaemonStatus, imported: JSONObject): JSONObject {
        val out = JSONObject()

        // 1. Merge Targets
        val mergedTargets = current.targets.toMutableSet()
        val importedTargets = jsonArrayToList(imported.optJSONArray("targets"))
        mergedTargets.addAll(importedTargets)
        val targetsArr = JSONArray()
        mergedTargets.forEach { targetsArr.put(it) }
        out.put("targets", targetsArr)

        // 2. Merge Apps
        val appsObj = JSONObject()
        current.perAppConfigs.forEach { (pkg, cfg) ->
            val o = JSONObject()
            o.put("devOff", cfg.devOff)
            o.put("mock", cfg.mock)
            o.put("isolate", cfg.isolate)
            if (!cfg.hideTemplate.isNullOrEmpty()) o.put("hideTemplate", cfg.hideTemplate)
            appsObj.put(pkg, o)
        }

        val importedApps = imported.optJSONObject("apps")
        if (importedApps != null) {
            val keys = importedApps.keys()
            while (keys.hasNext()) {
                val pkg = keys.next()
                val o = importedApps.optJSONObject(pkg) ?: continue
                appsObj.put(pkg, o)
            }
        }
        out.put("apps", appsObj)

        // 3. Merge HideTemplates
        val tplsObj = JSONObject()
        current.templates.forEach { (name, pkgs) ->
            val arr = JSONArray()
            pkgs.forEach { arr.put(it) }
            tplsObj.put(name, arr)
        }

        val importedTpls = imported.optJSONObject("hideTemplates") ?: imported.optJSONObject("templates")
        if (importedTpls != null) {
            val keys = importedTpls.keys()
            while (keys.hasNext()) {
                val name = keys.next()
                val arr = importedTpls.optJSONArray(name) ?: JSONArray()
                tplsObj.put(name, arr)
            }
        }
        out.put("hideTemplates", tplsObj)

        // 4. Inherit flags
        out.put("autoDevOff", imported.optBoolean("autoDevOff", current.autoDevOff))
        out.put("hideMockLocation", imported.optBoolean("hideMockLocation", current.hideMockLocation))
        out.put("alwaysHidden", imported.optBoolean("alwaysHidden", current.alwaysHidden))
        out.put("susfs", imported.optBoolean("susfs", current.susfsOn))
        out.put("hideRootApps", imported.optBoolean("hideRootApps", current.hideRootApps))
        out.put("uiApk", true)
        out.put("systemCloak", false)
        out.put("hideMode", "none")
        out.put("cloakPackages", JSONArray())
        out.put("denylist", JSONArray())
        out.put("hardened", JSONArray())

        return out
    }

    private fun ensureConfigDefaults(cfg: JSONObject) {
        if (!cfg.has("targets")) cfg.put("targets", JSONArray())
        if (!cfg.has("apps")) cfg.put("apps", JSONObject())
        if (!cfg.has("hideTemplates")) cfg.put("hideTemplates", JSONObject())
        if (!cfg.has("autoDevOff")) cfg.put("autoDevOff", true)
        if (!cfg.has("hideMockLocation")) cfg.put("hideMockLocation", true)
        if (!cfg.has("susfs")) cfg.put("susfs", true)
        if (!cfg.has("uiApk")) cfg.put("uiApk", true)
        if (!cfg.has("hideMode")) cfg.put("hideMode", "none")
        if (!cfg.has("cloakPackages")) cfg.put("cloakPackages", JSONArray())
        if (!cfg.has("denylist")) cfg.put("denylist", JSONArray())
        if (!cfg.has("hardened")) cfg.put("hardened", JSONArray())
    }

    private fun jsonArrayToList(arr: JSONArray?): List<String> {
        if (arr == null) return emptyList()
        val list = ArrayList<String>(arr.length())
        for (i in 0 until arr.length()) {
            val item = arr.optString(i, "")
            if (item.isNotEmpty()) list.add(item)
        }
        return list
    }
}
