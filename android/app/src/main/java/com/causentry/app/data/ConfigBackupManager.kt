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
    val fullConfigJson: JSONObject,
    val sourceVersion: Int = 1,
    // Protection state carried by the file (v2+). Shown in the restore dialog so the
    // user can see what will actually be re-applied, not just the app list.
    val hardenedCount: Int = 0,
    val appPolicyCount: Int = 0,
    val storageRuleCount: Int = 0,
    val systemCloak: Boolean = false,
    val hideMode: String = "none"
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
        root.put("version", 2)
        root.put("timestamp", System.currentTimeMillis())
        root.put("date", SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Date()))
        root.put("device", "${Build.MANUFACTURER} ${Build.MODEL} (Android ${Build.VERSION.RELEASE})")

        val summary = JSONObject()
        summary.put("targetCount", status.targets.size)
        summary.put("templateCount", status.templates.size)
        summary.put("hardenedCount", status.hardened.size)
        summary.put("hiddenCount", status.denylist.size)
        root.put("summary", summary)

        val cfg = JSONObject()
        val targetsArr = JSONArray()
        status.targets.forEach { targetsArr.put(it) }
        cfg.put("targets", targetsArr)

        val appsObj = JSONObject()
        status.perAppConfigs.forEach { (pkg, appCfg) ->
            appsObj.put(pkg, appConfigToJson(appCfg))
        }
        cfg.put("apps", appsObj)

        val tplsObj = JSONObject()
        status.templates.forEach { (name, pkgs) ->
            val arr = JSONArray()
            pkgs.forEach { arr.put(it) }
            tplsObj.put(name, arr)
        }
        cfg.put("hideTemplates", tplsObj)

        // Protection lists + subsystems: without these a restore silently drops
        // hardening, the hidden-app list, system cloak rules and storage cloak rules.
        cfg.put("hardened", toJsonArray(status.hardened))
        cfg.put("denylist", toJsonArray(status.denylist))
        cfg.put("hideMode", status.hideMode)
        cfg.put("cloakPackages", toJsonArray(status.cloakPackages))
        cfg.put("systemCloak", status.systemCloak)
        cfg.put("storageRules", JSONObject().apply {
            put("hiddenRootEntryNames", toJsonArray(status.storageHiddenRoots))
            put("hiddenRelativePaths", toJsonArray(status.storageHiddenRelatives))
        })

        cfg.put("autoDevOff", status.autoDevOff)
        cfg.put("hideMockLocation", status.hideMockLocation)
        cfg.put("alwaysHidden", status.alwaysHidden)
        cfg.put("susfs", status.susfsOn)
        cfg.put("hideRootApps", status.hideRootApps)
        cfg.put("uiApk", status.uiApk)

        root.put("config", cfg)

        return root.toString(2)
    }

    private fun appConfigToJson(appCfg: PerAppConfig): JSONObject = JSONObject().apply {
        put("devOff", appCfg.devOff)
        put("mock", appCfg.mock)
        put("isolate", appCfg.isolate)
        put("accOff", appCfg.accOff)
        if (!appCfg.hideTemplate.isNullOrEmpty()) put("hideTemplate", appCfg.hideTemplate)
    }

    private fun toJsonArray(values: List<String>): JSONArray {
        val arr = JSONArray()
        values.forEach { arr.put(it) }
        return arr
    }

    /**
     * Exports backup to a shareable file in the app cache directory.
     */
    suspend fun exportToCache(status: DaemonStatus): File = withContext(Dispatchers.IO) {
        val dir = File(context.cacheDir, "backups")
        if (!dir.exists()) dir.mkdirs()

        // Export the live state, not a possibly stale UI snapshot: the cloak fields
        // (systemCloak/hideMode/cloakPackages) are exactly what must survive a restore.
        val live = runCatching { daemonBridge.refresh(); daemonBridge.statusFlow.value }
            .getOrElse { status }

        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(Date())
        val file = File(dir, "causentry_backup_$timestamp.json")
        val json = createBackupJson(live)

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

            val inspectedJson = com.causentry.app.core.CausentryRustBridge.inspectBackupJson(content)
            val inspected = JSONObject(inspectedJson)
            if (!inspected.optBoolean("ok", false)) {
                return@withContext Result.failure(
                    Exception(inspected.optString("error", "Unrecognized backup format."))
                )
            }
            Result.success(
                ParsedBackupInfo(
                    format = inspected.optString("format", "Causentry"),
                    targetCount = inspected.optInt("targetCount", 0),
                    templateCount = inspected.optInt("templateCount", 0),
                    targetNames = jsonArrayToList(inspected.optJSONArray("targetNames")),
                    templateNames = jsonArrayToList(inspected.optJSONArray("templateNames")),
                    fullConfigJson = inspected.optJSONObject("config") ?: JSONObject(),
                    sourceVersion = inspected.optInt("sourceVersion", 1),
                    hardenedCount = inspected.optInt("hardenedCount", 0),
                    appPolicyCount = inspected.optInt("appPolicyCount", 0),
                    storageRuleCount = inspected.optInt("storageRuleCount", 0),
                    systemCloak = inspected.optBoolean("systemCloak", false),
                    hideMode = inspected.optString("hideMode", "none")
                )
            )
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
            // Pull the live state first: inherit-if-absent depends on statusFlow being
            // current, and a stale snapshot (UNKNOWN / pre-cloak) would let the restore
            // fall back to defaults and silently switch protection off.
            runCatching { daemonBridge.refresh() }
            val currentStatus = daemonBridge.statusFlow.value
            val currentJson = JSONObject(createBackupJson(currentStatus)).optJSONObject("config")?.toString() ?: "{}"
            val resultJsonString = com.causentry.app.core.CausentryRustBridge.mergeBackupConfigJson(
                currentJson,
                backupInfo.fullConfigJson.toString(),
                replaceAll
            )
            if (resultJsonString.isEmpty()) {
                return@withContext Result.failure(Exception("Failed to merge backup configuration"))
            }
            val op = daemonBridge.importConfig(resultJsonString)
            if (op.rpcError == null) Result.success("applied")
            else Result.failure(Exception(op.rpcError))
        } catch (t: Throwable) {
            Result.failure(t)
        }
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
