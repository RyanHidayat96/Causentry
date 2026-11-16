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
    val isSyncing: StateFlow<Boolean> = daemonBridge.isSyncing

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedFilter = MutableStateFlow(AppFilter.ALL)
    val selectedFilter: StateFlow<AppFilter> = _selectedFilter.asStateFlow()

    private val _selectedApp = MutableStateFlow<AppInfo?>(null)
    val selectedApp: StateFlow<AppInfo?> = _selectedApp.asStateFlow()

    private val _currentTab = MutableStateFlow(0) // 0 = Apps, 1 = Features, 2 = Templates, 3 = Forensics, 4 = Diagnostics
    val currentTab: StateFlow<Int> = _currentTab.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    // --- Forensic & LogFox Engine ---
    val isLiveStreaming: StateFlow<Boolean> = forensicManager.isLiveStreaming
    val crashReports: StateFlow<List<CrashThreatReport>> = forensicManager.crashReportsFlow
    val isRecording: StateFlow<Boolean> = forensicManager.isRecording
    val recordedCount: StateFlow<Int> = forensicManager.recordedCount

    private val _forensicSearchQuery = MutableStateFlow("")
    val forensicSearchQuery: StateFlow<String> = _forensicSearchQuery.asStateFlow()

    private val _forensicSelectedPackage = MutableStateFlow<String?>(null)
    val forensicSelectedPackage: StateFlow<String?> = _forensicSelectedPackage.asStateFlow()

    private val _forensicSelectedLevel = MutableStateFlow<LogLevel?>(null)
    val forensicSelectedLevel: StateFlow<LogLevel?> = _forensicSelectedLevel.asStateFlow()

    // LogFox-style advanced filters: tag substring, PID exact, and regex mode
    private val _forensicTagFilter = MutableStateFlow("")
    val forensicTagFilter: StateFlow<String> = _forensicTagFilter.asStateFlow()

    private val _forensicPidFilter = MutableStateFlow("")
    val forensicPidFilter: StateFlow<String> = _forensicPidFilter.asStateFlow()

    private val _forensicRegexMode = MutableStateFlow(false)
    val forensicRegexMode: StateFlow<Boolean> = _forensicRegexMode.asStateFlow()

    private val _forensicRegexError = MutableStateFlow<String?>(null)
    val forensicRegexError: StateFlow<String?> = _forensicRegexError.asStateFlow()

    private data class ForensicFilterState(
        val query: String,
        val pkg: String?,
        val level: LogLevel?,
        val tag: String,
        val pid: String,
        val regexMode: Boolean
    )

    private val forensicFilterFlow = combine(
        combine(
            _forensicSearchQuery.debounce(100),
            _forensicSelectedPackage,
            _forensicSelectedLevel,
            _forensicTagFilter.debounce(100),
            _forensicPidFilter.debounce(100)
        ) { query, pkg, level, tag, pid ->
            ForensicFilterState(query, pkg, level, tag, pid, false)
        },
        _forensicRegexMode
    ) { base, regexMode ->
        base.copy(regexMode = regexMode)
    }

    val filteredLogs: StateFlow<List<LogEntry>> = combine(
        forensicManager.logsFlow,
        forensicFilterFlow
    ) { logs, filters ->
        val q = filters.query.trim().lowercase()
        val tagQ = filters.tag.trim().lowercase()
        val pidQ = filters.pid.trim()

        // Pre-compile the regex once; invalid patterns surface an error and fall back to substring
        var regex: Regex? = null
        if (filters.regexMode && filters.query.isNotBlank()) {
            regex = try {
                Regex(filters.query, RegexOption.IGNORE_CASE)
            } catch (e: Exception) {
                _forensicRegexError.value = e.message ?: "Invalid regex"
                null
            }
        }
        if (!filters.regexMode || filters.query.isBlank() || regex != null) {
            _forensicRegexError.value = null
        }

        logs.filter { entry ->
            val matchesPkg = filters.pkg.isNullOrEmpty() ||
                entry.packageName.equals(filters.pkg, ignoreCase = true) ||
                entry.message.contains(filters.pkg, ignoreCase = true) ||
                entry.tag.contains(filters.pkg, ignoreCase = true) ||
                forensicManager.isPidForPackage(entry.pid, filters.pkg)

            val matchesLevel = filters.level == null || entry.level == filters.level ||
                (filters.level == LogLevel.ERROR && (entry.level == LogLevel.FATAL || entry.level == LogLevel.ERROR))

            val matchesTag = tagQ.isEmpty() || entry.tag.lowercase().contains(tagQ)

            val matchesPid = pidQ.isEmpty() || entry.pid.toString() == pidQ

            val matchesQuery = when {
                q.isEmpty() -> true
                regex != null -> regex.containsMatchIn(entry.message) || regex.containsMatchIn(entry.tag)
                else -> entry.message.lowercase().contains(q) ||
                    entry.tag.lowercase().contains(q) ||
                    entry.pid.toString().contains(q)
            }

            matchesPkg && matchesLevel && matchesTag && matchesPid && matchesQuery
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
        accOff: Boolean = true,
        template: String?
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.setApp(pkg, devOff, mock, isolate, accOff, template)
        }
    }

    fun batchConfigureApps(
        pkgs: List<String>,
        devOff: Boolean? = null,
        mock: Boolean? = null,
        isolate: Boolean? = null,
        accOff: Boolean? = null,
        template: String? = null,
        remove: Boolean = false
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.batchConfigureApps(pkgs, devOff, mock, isolate, accOff, template, remove)
        }
    }

    fun batchConfigureFeature(
        featureKey: String,
        enabledPackages: Set<String>,
        allPackages: Set<String>
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.batchConfigureFeature(featureKey, enabledPackages, allPackages)
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

    /**
     * "Implement" an existing hidden-app template onto one, several or every app:
     * attaches each chosen package to the cloak target list AND assigns it this
     * template, then detaches the template from any app the user unchecked -- all
     * in a single atomic config write (importcfg -> cloak.sh) so there is exactly
     * one reconcile (no flicker). The optimistic in-memory update keeps the UI
     * instant.
     *
     * @param packages apps that should now USE this template (attach / enable)
     * @param detach   apps that previously used it and must be released (detach)
     */
    fun applyTemplateToApps(
        template: String,
        packages: List<String>,
        detach: List<String> = emptyList()
    ) {
        val tpl = template.trim()
        val add = packages.filter { it.isNotBlank() }.distinct()
        val rem = detach.filter { it.isNotBlank() }.distinct().filter { it !in add }
        if (tpl.isEmpty() || (add.isEmpty() && rem.isEmpty())) return
        viewModelScope.launch(Dispatchers.IO) {
            daemonBridge.applyTemplateDiff(tpl, add, rem)
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
    fun setForensicTagFilter(tag: String) { _forensicTagFilter.value = tag }
    fun setForensicPidFilter(pid: String) { _forensicPidFilter.value = pid.filter { it.isDigit() }.take(7) }
    fun setForensicRegexMode(enabled: Boolean) {
        _forensicRegexMode.value = enabled
        if (!enabled) _forensicRegexError.value = null
    }
    fun clearForensicFilters() {
        _forensicSearchQuery.value = ""
        _forensicSelectedPackage.value = null
        _forensicSelectedLevel.value = null
        _forensicTagFilter.value = ""
        _forensicPidFilter.value = ""
        _forensicRegexMode.value = false
        _forensicRegexError.value = null
    }
    fun exportLogsToFile(): File? = forensicManager.exportLogsToFile()
    fun exportSessionZip(): File? = forensicManager.exportSessionZip()
    fun toggleRecording(): Boolean = forensicManager.toggleRecording()
    fun stopRecording() { forensicManager.stopRecording() }

    fun inspectAppLogs(packageName: String) {
        _forensicSelectedPackage.value = packageName
        _currentTab.value = 3 // Tab Forensics
        _selectedApp.value = null
    }
}
