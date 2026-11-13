package com.causentry.app.data

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.causentry.app.model.AppInfo
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val daemonBridge: DaemonBridge
) {
    // In-memory cache for fast label lookup without IPC
    private val labelCache = ConcurrentHashMap<String, String>()

    // Raw installed app definitions: (packageName, isSystem)
    private val rawInstalledApps = MutableStateFlow<List<RawApp>>(emptyList())

    private data class RawApp(
        val packageName: String,
        val label: String,
        val isSystem: Boolean
    )

    init {
        // Initial async load
        kotlinx.coroutines.CoroutineScope(Dispatchers.IO).launch {
            refreshInstalledApps()
        }
    }

    suspend fun refreshInstalledApps() = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val installed = pm.getInstalledApplications(PackageManager.MATCH_UNINSTALLED_PACKAGES or 0)
        val list = ArrayList<RawApp>(installed.size)

        for (ai in installed) {
            val pkg = ai.packageName ?: continue
            val isSys = (ai.flags and ApplicationInfo.FLAG_SYSTEM) != 0
            val cachedLabel = labelCache[pkg]
            val label = if (cachedLabel != null) {
                cachedLabel
            } else {
                val l = pm.getApplicationLabel(ai).toString().trim()
                val cleaned = if (l.isEmpty()) pkg else l
                labelCache[pkg] = cleaned
                cleaned
            }
            list.add(RawApp(pkg, label, isSys))
        }

        rawInstalledApps.value = list
    }

    val appsFlow: Flow<List<AppInfo>> = combine(
        rawInstalledApps,
        daemonBridge.statusFlow
    ) { rawList, status ->
        val targetsSet = status.targets.toHashSet()
        val hardenedSet = status.hardened.toHashSet()
        val templatesMap = status.templates
        val perAppMap = status.perAppConfigs

        val allHiddenPackages = HashSet<String>()
        templatesMap.values.forEach { allHiddenPackages.addAll(it) }

        rawList.map { raw ->
            val pkg = raw.packageName
            val cfg = perAppMap[pkg]
            val isTarget = targetsSet.contains(pkg)

            AppInfo(
                packageName = pkg,
                label = raw.label,
                isProtected = isTarget,
                isHardened = isTarget && (cfg?.isolate == true || hardenedSet.contains(pkg)),
                isSystem = raw.isSystem,
                devOff = cfg?.devOff ?: (isTarget && status.autoDevOff),
                mock = cfg?.mock ?: (isTarget && status.hideMockLocation),
                isolate = cfg?.isolate ?: (isTarget && hardenedSet.contains(pkg)),
                hideTemplate = cfg?.hideTemplate,
                isHiddenInAnyTemplate = allHiddenPackages.contains(pkg)
            )
        }
    }

    fun getLabel(packageName: String): String = labelCache[packageName] ?: packageName
}
