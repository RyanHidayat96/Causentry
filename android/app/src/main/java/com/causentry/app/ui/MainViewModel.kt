package com.causentry.app.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.causentry.app.data.AppRepository
import com.causentry.app.data.ConfigBackupManager
import com.causentry.app.data.DaemonBridge
import com.causentry.app.data.ForensicManager
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppFilter
import com.causentry.app.model.AppInfo
import com.causentry.app.model.CrashThreatReport
import com.causentry.app.model.DaemonStatus
import com.causentry.app.model.LogEntry
import com.causentry.app.model.LogLevel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

@OptIn(FlowPreview::class)
@HiltViewModel
class MainViewModel @Inject constructor(
    private val appRepository: AppRepository,
    val daemonBridge: DaemonBridge,
    val iconLoader: IconLoader,
    val forensicManager: ForensicManager,
    val configBackupManager: ConfigBackupManager
) : ViewModel() {

    val daemonStatus: StateFlow<DaemonStatus> = daemonBridge.statusFlow

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedFilter = MutableStateFlow(AppFilter.ALL)
    val selectedFilter: StateFlow<AppFilter> = _selectedFilter.asStateFlow()

    private val _selectedApp = MutableStateFlow<AppInfo?>(null)
    val selectedApp: StateFlow<AppInfo?> = _selectedApp.asStateFlow()

    private val _currentTab = MutableStateFlow(0) // 0 = Apps, 1 = Templates, 2 = Forensics, 3 = Diagnostics
    val currentTab: StateFlow<Int> = _currentTab.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    // --- Forensic & LogFox Engine ---
    val isLiveStreaming: StateFlow<Boolean> = forensicManager.isLiveStreaming
    val crashReports: StateFlow<List<CrashThreatReport>> = forensicManager.crashReportsFlow

    private val _forensicSearchQuery = MutableStateFlow("")
    val forensicSearchQuery: StateFlow<String> = _forensicSearchQuery.asStateFlow()

    private val _forensicSelectedPackage = MutableStateFlow<String?>(null)
    val forensicSelectedPackage: StateFlow<String?> = _forensicSelectedPackage.asStateFlow()

    private val _forensicSelectedLevel = MutableStateFlow<LogLevel?>(null)
    val forensicSelectedLevel: StateFlow<LogLevel?> = _forensicSelectedLevel.asStateFlow()

    private val _forensicFilterNoise = MutableStateFlow(true)
    val forensicFilterNoise: StateFlow<Boolean> = _forensicFilterNoise.asStateFlow()

    private val _forensicOnlyHooks = MutableStateFlow(false)
    val forensicOnlyHooks: StateFlow<Boolean> = _forensicOnlyHooks.asStateFlow()

    private data class ForensicFilterState(
        val query: String,
        val pkg: String?,
        val level: LogLevel?,
        val filterNoise: Boolean,
        val onlyHooks: Boolean
    )

    private val forensicFilterFlow = combine(
        _forensicSearchQuery.debounce(100),
        _forensicSelectedPackage,
        _forensicSelectedLevel,
        _forensicFilterNoise,
        _forensicOnlyHooks
    ) { query, pkg, level, filterNoise, onlyHooks ->
        ForensicFilterState(query, pkg, level, filterNoise, onlyHooks)
    }

    val filteredLogs: StateFlow<List<LogEntry>> = combine(
        forensicManager.logsFlow,
        forensicFilterFlow
    ) { logs, filters ->
        val q = filters.query.trim().lowercase()
        val NOISE_TAGS = setOf(
            "HWComposer", "SurfaceFlinger", "chatty", "InputTransport",
            "OpenGLRenderer", "Gralloc4", "TrafficStats", "BufferQueueProducer",
            "ViewRootImpl", "Choreographer", "BufferItemConsumer"
        )
        val HOOK_KEYWORDS = listOf(
            "causentry", "zygisk", "cloak", "activeservices", "settingsprovider",
            "appzygote", "packagecloak", "stripped isolation", "demoted app zygote"
        )

        logs.filter { entry ->
            if (filters.filterNoise && NOISE_TAGS.contains(entry.tag)) {
                return@filter false
            }

            if (filters.onlyHooks) {
                val tagLower = entry.tag.lowercase()
                val msgLower = entry.message.lowercase()
                val matchesHook = HOOK_KEYWORDS.any { tagLower.contains(it) || msgLower.contains(it) }
                if (!matchesHook) return@filter false
            }

            val matchesPkg = filters.pkg.isNullOrEmpty() ||
                entry.packageName.equals(filters.pkg, ignoreCase = true) ||
                entry.message.contains(filters.pkg, ignoreCase = true) ||
                entry.tag.contains(filters.pkg, ignoreCase = true) ||
                forensicManager.isPidForPackage(entry.pid, filters.pkg)

            val matchesLevel = filters.level == null || entry.level == filters.level ||
                (filters.level == LogLevel.ERROR && (entry.level == LogLevel.FATAL || entry.level == LogLevel.ERROR))

            val matchesQuery = q.isEmpty() ||
                entry.message.lowercase().contains(q) ||
                entry.tag.lowercase().contains(q) ||
                entry.pid.toString().contains(q)

            matchesPkg && matchesLevel && matchesQuery
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // Full list of installed apps for templates & bulk operations
    val allApps: StateFlow<List<AppInfo>> = appRepository.appsFlow
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    // 120Hz smooth debounced search & filter pipeline
    val filteredApps: StateFlow<List<AppInfo>> = combine(
        appRepository.appsFlow,
        _searchQuery.debounce(150),
        _selectedFilter
    ) { apps, query, filter ->
        val q = query.trim().lowercase()
        apps.filter { app ->
            val matchesFilter = when (filter) {
                AppFilter.ALL -> true
                AppFilter.PROTECTED -> app.isProtected
                AppFilter.USER -> !app.isSystem
                AppFilter.SYSTEM -> app.isSystem
            }
            val matchesQuery = q.isEmpty() ||
                app.label.lowercase().contains(q) ||
                app.packageName.lowercase().contains(q)

            matchesFilter && matchesQuery
        }.sortedWith(
            compareByDescending<AppInfo> { it.isProtected }
                .thenBy { it.label.lowercase() }
                .thenBy { it.packageName.lowercase() }
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
    }

    fun onFilterSelected(filter: AppFilter) {
        _selectedFilter.value = filter
    }

    fun onSelectApp(app: AppInfo?) {
        _selectedApp.value = app
    }

    fun onTabChanged(tab: Int) {
        _currentTab.value = tab
    }

    fun refreshAll() {
        viewModelScope.launch(Dispatchers.IO) {
            _isRefreshing.value = true
            try {
                appRepository.refreshInstalledApps()
                daemonBridge.refresh()
            } finally {
                _isRefreshing.value = false
            }
        }
    }

    fun setAppConfig(
        pkg: String,
        devOff: Boolean,
        mock: Boolean,
        isolate: Boolean,
        template: String?
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.setApp(pkg, devOff, mock, isolate, template)
        }
    }

    fun deleteAppConfig(pkg: String) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.delApp(pkg)
        }
    }

    fun saveTemplate(name: String, packages: List<String>, deleteName: String? = null) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.saveTemplate(name, packages, deleteName)
        }
    }

    fun deleteTemplate(name: String) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.deleteTemplate(name)
        }
    }

    fun applyChanges() {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.apply()
        }
    }

    fun restoreAll() {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.restore()
        }
    }

    fun updateStorageRules(roots: List<String>, relatives: List<String>) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.saveStorageRules(roots, relatives)
        }
    }

    // --- Forensic & LogFox Controls ---
    fun toggleLiveStreaming() = forensicManager.toggleLiveStreaming()
    fun clearLogs() = forensicManager.clearLogs()
    fun clearCrashes() = forensicManager.clearCrashes()
    fun dismissCrash(id: Long) = forensicManager.dismissCrash(id)
    fun setForensicPackage(pkg: String?) { _forensicSelectedPackage.value = pkg }
    fun setForensicLevel(level: LogLevel?) { _forensicSelectedLevel.value = level }
    fun setForensicSearchQuery(q: String) { _forensicSearchQuery.value = q }
    fun toggleForensicNoiseFilter() { _forensicFilterNoise.value = !_forensicFilterNoise.value }
    fun toggleForensicOnlyHooks() { _forensicOnlyHooks.value = !_forensicOnlyHooks.value }
    fun exportLogsToFile(): File? = forensicManager.exportLogsToFile()

    fun inspectAppLogs(packageName: String) {
        _forensicSelectedPackage.value = packageName
        _currentTab.value = 2 // Tab Forensics
        _selectedApp.value = null
    }
}
