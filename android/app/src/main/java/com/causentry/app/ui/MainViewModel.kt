package com.causentry.app.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.causentry.app.data.AppRepository
import com.causentry.app.data.DaemonBridge
import com.causentry.app.data.IconLoader
import com.causentry.app.model.AppFilter
import com.causentry.app.model.AppInfo
import com.causentry.app.model.DaemonStatus
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
import javax.inject.Inject

@OptIn(FlowPreview::class)
@HiltViewModel
class MainViewModel @Inject constructor(
    private val appRepository: AppRepository,
    val daemonBridge: DaemonBridge,
    val iconLoader: IconLoader
) : ViewModel() {

    val daemonStatus: StateFlow<DaemonStatus> = daemonBridge.statusFlow

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedFilter = MutableStateFlow(AppFilter.ALL)
    val selectedFilter: StateFlow<AppFilter> = _selectedFilter.asStateFlow()

    private val _selectedApp = MutableStateFlow<AppInfo?>(null)
    val selectedApp: StateFlow<AppInfo?> = _selectedApp.asStateFlow()

    private val _currentTab = MutableStateFlow(0) // 0 = Apps, 1 = Templates, 2 = Actions/Status
    val currentTab: StateFlow<Int> = _currentTab.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

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
}
