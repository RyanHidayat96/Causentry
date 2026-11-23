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
            ).ifEmpty { buildFinalConfig(currentStatus, backupInfo.fullConfigJson, replaceAll).toString() }
            val op = daemonBridge.importConfig(resultJsonString)
            if (op.rpcError == null) Result.success("applied")
            else Result.failure(Exception(op.rpcError))
        } catch (t: Throwable) {
            Result.failure(t)
        }
    }

    /**
     * Builds the config that will be written to the daemon.
     *
     * Rule: a key the imported file does not carry is INHERITED from the live config and
     * never reset to a hardcoded default. Restoring a backup must not silently disable
     * protection that is active right now (system cloak, hide mode, storage cloak,
     * hardened list, hidden-app list) — that was the old behaviour and it clobbered
     * protection state on every legacy/HMA import.
     */
    private fun buildFinalConfig(
        current: DaemonStatus,
        imported: JSONObject,
        replaceAll: Boolean
    ): JSONObject {
        val out = JSONObject()

        // 1. Targets
        val mergedTargets = if (replaceAll) LinkedHashSet<String>() else LinkedHashSet(current.targets)
        mergedTargets.addAll(jsonArrayToList(imported.optJSONArray("targets")))
        out.put("targets", toJsonArray(mergedTargets.toList()))

        // 2. Per-app features (per-package absolut — imported entry wins for that package only)
        val appsObj = JSONObject()
        if (!replaceAll) {
            current.perAppConfigs.forEach { (pkg, cfg) -> appsObj.put(pkg, appConfigToJson(cfg)) }
        }
        val importedApps = imported.optJSONObject("apps")
        if (importedApps != null) {
            val keys = importedApps.keys()
            while (keys.hasNext()) {
                val pkg = keys.next()
                val raw = importedApps.optJSONObject(pkg) ?: continue
                val prev = current.perAppConfigs[pkg]
                appsObj.put(pkg, mergeAppEntry(raw, prev))
            }
        }
        out.put("apps", appsObj)

        // 3. Hide templates
        val tplsObj = JSONObject()
        if (!replaceAll) {
            current.templates.forEach { (name, pkgs) ->
                tplsObj.put(name, toJsonArray(pkgs))
            }
        }
        val importedTpls = imported.optJSONObject("hideTemplates") ?: imported.optJSONObject("templates")
        if (importedTpls != null) {
            val keys = importedTpls.keys()
            while (keys.hasNext()) {
                val name = keys.next()
                tplsObj.put(name, importedTpls.optJSONArray(name) ?: JSONArray())
            }
        }
        out.put("hideTemplates", tplsObj)

        // 4. Protection lists — union on merge, imported when present, live state otherwise
        out.put(
            "hardened",
            mergedStringList(current.hardened, imported, "hardened", replaceAll)
        )
        out.put(
            "denylist",
            mergedStringList(current.denylist, imported, "denylist", replaceAll)
        )

        // 5. Protection subsystems — carry over live values when the file omits them
        out.put(
            "systemCloak",
            if (imported.has("systemCloak")) imported.optBoolean("systemCloak", current.systemCloak)
            else current.systemCloak
        )
        out.put(
            "hideMode",
            if (imported.has("hideMode")) imported.optString("hideMode", current.hideMode).ifEmpty { current.hideMode }
            else current.hideMode
        )
        out.put(
            "cloakPackages",
            if (imported.has("cloakPackages")) toJsonArray(jsonArrayToList(imported.optJSONArray("cloakPackages")))
            else toJsonArray(current.cloakPackages)
        )
        out.put(
            "storageRules",
            imported.optJSONObject("storageRules") ?: storageRulesFromStatus(current)
        )

        // 6. Global flags
        out.put("autoDevOff", imported.optBoolean("autoDevOff", current.autoDevOff))
        out.put("hideMockLocation", imported.optBoolean("hideMockLocation", current.hideMockLocation))
        out.put("alwaysHidden", imported.optBoolean("alwaysHidden", current.alwaysHidden))
        out.put("susfs", imported.optBoolean("susfs", current.susfsOn))
        out.put("hideRootApps", imported.optBoolean("hideRootApps", current.hideRootApps))
        out.put("uiApk", imported.optBoolean("uiApk", current.uiApk))

        return out
    }

    private fun mergedStringList(
        currentValues: List<String>,
        imported: JSONObject,
        key: String,
        replaceAll: Boolean
    ): JSONArray {
        if (!imported.has(key)) return toJsonArray(currentValues)
        val importedValues = jsonArrayToList(imported.optJSONArray(key))
        if (replaceAll) return toJsonArray(importedValues)
        val merged = LinkedHashSet(currentValues)
        merged.addAll(importedValues)
        return toJsonArray(merged.toList())
    }

    private fun mergeAppEntry(raw: JSONObject, prev: PerAppConfig?): JSONObject {
        // A legacy (v1) entry never stored accOff; keep what the device actually runs.
        val accOff = raw.optBoolean("accOff", prev?.accOff ?: false)
        val devOff = raw.optBoolean("devOff", prev?.devOff ?: false)
        val mock = raw.optBoolean("mock", prev?.mock ?: false)
        val isolate = raw.optBoolean("isolate", prev?.isolate ?: false)
        val tmpl = raw.optString("hideTemplate").ifEmpty { prev?.hideTemplate ?: "" }
        return JSONObject().apply {
            put("devOff", devOff)
            put("mock", mock)
            put("isolate", isolate)
            put("accOff", accOff)
            if (tmpl.isNotEmpty()) put("hideTemplate", tmpl)
        }
    }

    private fun storageRulesFromStatus(status: DaemonStatus): JSONObject = JSONObject().apply {
        put("hiddenRootEntryNames", toJsonArray(status.storageHiddenRoots))
        put("hiddenRelativePaths", toJsonArray(status.storageHiddenRelatives))
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
