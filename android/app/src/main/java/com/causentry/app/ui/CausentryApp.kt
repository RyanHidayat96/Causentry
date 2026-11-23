package com.causentry.app.ui

import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.data.AppLanguage
import com.causentry.app.data.ThemeMode
import com.causentry.app.model.AppFilter
import com.causentry.app.model.AppInfo
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.components.AppDetailDialog
import com.causentry.app.ui.components.AppItemCard
import com.causentry.app.ui.components.BackupRestoreCard
import com.causentry.app.ui.components.DiagnosticsCard
import com.causentry.app.ui.components.FilterChipRow
import com.causentry.app.ui.components.HeroStatusCard
import com.causentry.app.ui.components.ShimmerAppList
import com.causentry.app.ui.components.StorageCloakCard
import com.causentry.app.ui.components.TemplateApplyDialog
import com.causentry.app.ui.components.TemplateCard
import com.causentry.app.ui.components.TemplateEditorDialog
import com.causentry.app.ui.components.ThemeAndLanguageCard
import com.causentry.app.ui.theme.LocalCausentryColors

private data class NavDestination(
    val index: Int,
    val labelRes: Int,
    val iconRes: Int
)

private val NAV_DESTINATIONS = listOf(
    NavDestination(0, R.string.nav_apps, R.drawable.ic_apps),
    NavDestination(1, R.string.nav_features, R.drawable.ic_tune),
    NavDestination(2, R.string.nav_templates, R.drawable.ic_layers),
    NavDestination(3, R.string.nav_forensics, R.drawable.ic_terminal),
    NavDestination(4, R.string.nav_system, R.drawable.ic_settings)
)

@Composable
fun CausentryApp(
    viewModel: MainViewModel,
    onLanguageChanged: (AppLanguage) -> Unit = {}
) {
    val cs = MaterialTheme.colorScheme
    val haptic = LocalHapticFeedback.current

    val status by viewModel.daemonStatus.collectAsState()
    val apps by viewModel.filteredApps.collectAsState()
    val allApps by viewModel.allApps.collectAsState()
    val query by viewModel.searchQuery.collectAsState()
    val filter by viewModel.selectedFilter.collectAsState()
    val selectedApp by viewModel.selectedApp.collectAsState()
    val currentTab by viewModel.currentTab.collectAsState()
    val isRefreshing by viewModel.isRefreshing.collectAsState()
    val isSyncing by viewModel.isSyncing.collectAsState()

    val themeMode by viewModel.themeMode.collectAsState()
    val dynamicColor by viewModel.dynamicColor.collectAsState()
    val language by viewModel.language.collectAsState()

    // Crash count badge only (low-frequency) — high-frequency log stream is collected inside ForensicsTabHost only!
    val crashReports by viewModel.crashReports.collectAsState()

    // Hoisted scroll states so switching tabs preserves scroll position
    val appsListState = rememberLazyListState()
    val featuresListState = rememberLazyListState()
    val templatesScrollState = rememberScrollState()
    val systemScrollState = rememberScrollState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = cs.background,
        topBar = {
            TopAppBar(
                isRefreshing = isRefreshing,
                isSyncing = isSyncing,
                onRefresh = { viewModel.refreshAll() }
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = cs.surface,
                tonalElevation = 2.dp
            ) {
                NAV_DESTINATIONS.forEach { dest ->
                    val selected = currentTab == dest.index
                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            if (!selected) {
                                haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                                viewModel.onTabChanged(dest.index)
                            }
                        },
                        icon = {
                            if (dest.index == 3 && crashReports.isNotEmpty()) {
                                BadgedBox(
                                    badge = {
                                        Badge(containerColor = cs.error, contentColor = cs.onError) {
                                            Text(
                                                text = if (crashReports.size > 99) "99+" else "${crashReports.size}",
                                                fontSize = 9.sp
                                            )
                                        }
                                    }
                                ) {
                                    Icon(
                                        painter = painterResource(id = dest.iconRes),
                                        contentDescription = stringResource(dest.labelRes),
                                        modifier = Modifier.size(21.dp)
                                    )
                                }
                            } else {
                                Icon(
                                    painter = painterResource(id = dest.iconRes),
                                    contentDescription = stringResource(dest.labelRes),
                                    modifier = Modifier.size(21.dp)
                                )
                            }
                        },
                        label = {
                            Text(
                                text = stringResource(dest.labelRes),
                                fontSize = 11.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = cs.onPrimaryContainer,
                            selectedTextColor = cs.primary,
                            indicatorColor = cs.primaryContainer,
                            unselectedIconColor = cs.onSurfaceVariant,
                            unselectedTextColor = cs.onSurfaceVariant
                        )
                    )
                }
            }
        }
    ) { paddingValues ->
        AnimatedContent(
            targetState = currentTab,
            transitionSpec = {
                fadeIn(animationSpec = tween(160)) togetherWith fadeOut(animationSpec = tween(120))
            },
            label = "TabTransition",
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) { tab ->
            when (tab) {
                0 -> AppsScreen(
                    status = status,
                    apps = apps,
                    allApps = allApps,
                    searchQuery = query,
                    onSearchChange = { viewModel.onSearchQueryChanged(it) },
                    selectedFilter = filter,
                    onFilterSelect = { viewModel.onFilterSelected(it) },
                    onAppClick = { viewModel.onSelectApp(it) },
                    iconLoader = viewModel.iconLoader,
                    listState = appsListState
                )

                1 -> FeaturesScreen(
                    allApps = allApps,
                    iconLoader = viewModel.iconLoader,
                    isSyncing = isSyncing,
                    onSaveFeature = { featureKey, enabledPackages, allPackages ->
                        viewModel.batchConfigureFeature(featureKey, enabledPackages, allPackages)
                    },
                    listState = featuresListState
                )

                2 -> TemplatesScreen(
                    status = status,
                    allApps = allApps,
                    iconLoader = viewModel.iconLoader,
                    scrollState = templatesScrollState,
                    onSaveTemplate = { name, pkgs, deleteName -> viewModel.saveTemplate(name, pkgs, deleteName) },
                    onDeleteTemplate = { name -> viewModel.deleteTemplate(name) },
                    onApplyTemplateToApps = { template, pkgs, detach -> viewModel.applyTemplateToApps(template, pkgs, detach) }
                )

                3 -> ForensicsTabHost(
                    viewModel = viewModel,
                    allApps = allApps
                )

                4 -> ActionsScreen(
                    status = status,
                    themeMode = themeMode,
                    dynamicColor = dynamicColor,
                    language = language,
                    scrollState = systemScrollState,
                    backupManager = viewModel.configBackupManager,
                    onThemeModeChange = { viewModel.setThemeMode(it) },
                    onDynamicColorChange = { viewModel.setDynamicColor(it) },
                    onLanguageChange = onLanguageChanged,
                    onSaveStorageRules = { roots, relatives -> viewModel.updateStorageRules(roots, relatives) },
                    onApply = { viewModel.applyChanges() },
                    onRestore = { viewModel.restoreAll() },
                    onRefresh = { viewModel.refreshAll() }
                )
            }
        }
    }

    selectedApp?.let { app ->
        AppDetailDialog(
            app = app,
            availableTemplates = status.templates.keys.toList(),
            iconLoader = viewModel.iconLoader,
            onSave = { devOff, mock, isolate, accOff, template ->
                viewModel.setAppConfig(app.packageName, devOff, mock, isolate, accOff, template)
            },
            onDelete = {
                viewModel.deleteAppConfig(app.packageName)
                viewModel.onSelectApp(null)
            },
            onDismiss = { viewModel.onSelectApp(null) },
            onInspectLogs = { viewModel.inspectAppLogs(app.packageName) }
        )
    }
}

/**
 * Isolates high-frequency forensic logcat StateFlows inside Tab 3 so 150ms log
 * emissions never trigger recompositions of the root Scaffold or other tabs.
 */
@Composable
private fun ForensicsTabHost(
    viewModel: MainViewModel,
    allApps: List<AppInfo>
) {
    DisposableEffect(Unit) {
        viewModel.forensicManager.setScreenActive(true)
        onDispose {
            viewModel.forensicManager.setScreenActive(false)
        }
    }

    val logs by viewModel.filteredLogs.collectAsState()
    val crashReports by viewModel.crashReports.collectAsState()
    val isStreaming by viewModel.isLiveStreaming.collectAsState()
    val isRecording by viewModel.isRecording.collectAsState()
    val recordedCount by viewModel.recordedCount.collectAsState()
    val forensicQuery by viewModel.forensicSearchQuery.collectAsState()
    val forensicPkg by viewModel.forensicSelectedPackage.collectAsState()
    val forensicLevel by viewModel.forensicSelectedLevel.collectAsState()
    val forensicTagFilter by viewModel.forensicTagFilter.collectAsState()
    val forensicPidFilter by viewModel.forensicPidFilter.collectAsState()
    val forensicRegexMode by viewModel.forensicRegexMode.collectAsState()
    val forensicRegexError by viewModel.forensicRegexError.collectAsState()

    ForensicsScreen(
        logs = logs,
        crashReports = crashReports,
        allApps = allApps,
        iconLoader = viewModel.iconLoader,
        isStreaming = isStreaming,
        isRecording = isRecording,
        recordedCount = recordedCount,
        searchQuery = forensicQuery,
        tagFilter = forensicTagFilter,
        pidFilter = forensicPidFilter,
        regexMode = forensicRegexMode,
        regexError = forensicRegexError,
        selectedPackage = forensicPkg,
        selectedLevel = forensicLevel,
        onToggleStream = { viewModel.toggleLiveStreaming() },
        onToggleRecording = { viewModel.toggleRecording() },
        onClearLogs = { viewModel.clearLogs() },
        onClearCrashes = { viewModel.clearCrashes() },
        onDismissCrash = { viewModel.dismissCrash(it) },
        onSelectPackage = { viewModel.setForensicPackage(it) },
        onSelectLevel = { viewModel.setForensicLevel(it) },
        onSearchQueryChange = { viewModel.setForensicSearchQuery(it) },
        onTagFilterChange = { viewModel.setForensicTagFilter(it) },
        onPidFilterChange = { viewModel.setForensicPidFilter(it) },
        onToggleRegexMode = { viewModel.setForensicRegexMode(!forensicRegexMode) },
        onResetFilters = { viewModel.clearForensicFilters() },
        onExportZip = { viewModel.exportSessionZip() },
        onExportLogs = { viewModel.exportLogsToFile() },
        onInspectApp = { pkg ->
            val target = allApps.find { it.packageName == pkg }
            if (target != null) {
                viewModel.onSelectApp(target)
            }
        }
    )
}

@Composable
private fun TopAppBar(
    isRefreshing: Boolean,
    isSyncing: Boolean,
    onRefresh: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = stringResource(R.string.app_name),
                    color = cs.onBackground,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                if (isSyncing) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(6.dp))
                            .background(ext.warning.copy(alpha = 0.18f))
                            .border(1.dp, ext.warning.copy(alpha = 0.4f), RoundedCornerShape(6.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.badge_syncing),
                            color = ext.warning,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace
                        )
                    }
                }
            }
            Text(
                text = stringResource(if (isSyncing) R.string.subtitle_syncing else R.string.subtitle_control),
                color = if (isSyncing) cs.primary else cs.onSurfaceVariant,
                fontSize = 12.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(12.dp))
                .clickable(enabled = !isRefreshing && !isSyncing, onClick = onRefresh)
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            if (isRefreshing || isSyncing) {
                CircularProgressIndicator(
                    modifier = Modifier.size(18.dp),
                    strokeWidth = 2.dp,
                    color = if (isSyncing) ext.warning else cs.primary
                )
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.ic_refresh),
                    contentDescription = "Refresh",
                    tint = cs.onSurface,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}

@Composable
private fun AppsScreen(
    status: DaemonStatus,
    apps: List<AppInfo>,
    allApps: List<AppInfo>,
    searchQuery: String,
    onSearchChange: (String) -> Unit,
    selectedFilter: AppFilter,
    onFilterSelect: (AppFilter) -> Unit,
    onAppClick: (AppInfo) -> Unit,
    iconLoader: com.causentry.app.data.IconLoader,
    listState: LazyListState
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    val focusManager = LocalFocusManager.current

    val protectedCount = remember(allApps) { allApps.count { it.isProtected } }
    val userCount = remember(allApps) { allApps.count { !it.isSystem } }
    val systemCount = remember(allApps) { allApps.count { it.isSystem } }

    Column(modifier = Modifier.fillMaxSize()) {
        // Slim HeroStatusCard (kept per user preference)
        HeroStatusCard(
            status = status,
            protectedCount = protectedCount,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 3.dp)
        )

        OutlinedTextField(
            value = searchQuery,
            onValueChange = onSearchChange,
            placeholder = {
                Text(
                    text = if (allApps.isNotEmpty()) {
                        stringResource(R.string.search_apps_count, allApps.size)
                    } else {
                        stringResource(R.string.search_apps_hint)
                    },
                    color = cs.onSurfaceVariant,
                    fontSize = 13.5.sp
                )
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 2.dp),
            shape = RoundedCornerShape(12.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = null,
                    tint = cs.onSurfaceVariant,
                    modifier = Modifier.size(18.dp)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = cs.primary,
                unfocusedBorderColor = ext.border,
                focusedContainerColor = cs.surface,
                unfocusedContainerColor = cs.surface,
                focusedTextColor = cs.onSurface,
                unfocusedTextColor = cs.onSurface
            ),
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = { onSearchChange("") }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Clear",
                            tint = cs.onSurfaceVariant,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        )

        FilterChipRow(
            selectedFilter = selectedFilter,
            onFilterSelect = onFilterSelect,
            allCount = allApps.size,
            protectedCount = protectedCount,
            userCount = userCount,
            systemCount = systemCount,
            modifier = Modifier.padding(vertical = 6.dp)
        )

        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            if (allApps.isEmpty()) {
                item { ShimmerAppList(count = 7) }
            } else if (apps.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 48.dp, horizontal = 24.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        if (searchQuery.isNotEmpty()) {
                            Text(
                                text = stringResource(R.string.empty_no_match, searchQuery),
                                color = cs.onSurfaceVariant,
                                fontSize = 14.sp
                            )
                        } else if (selectedFilter == AppFilter.PROTECTED) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_shield),
                                    contentDescription = null,
                                    tint = cs.primary.copy(alpha = 0.5f),
                                    modifier = Modifier.size(48.dp)
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                Text(
                                    text = stringResource(R.string.empty_no_protected_title),
                                    color = cs.onBackground,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = stringResource(R.string.empty_no_protected_desc),
                                    color = cs.onSurfaceVariant,
                                    fontSize = 12.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        } else {
                            val res = when (selectedFilter) {
                                AppFilter.USER -> R.string.empty_no_user_apps
                                AppFilter.SYSTEM -> R.string.empty_no_system_apps
                                else -> R.string.empty_no_apps
                            }
                            Text(
                                text = stringResource(res),
                                color = cs.onSurfaceVariant,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            } else if (searchQuery.isEmpty() && selectedFilter == AppFilter.ALL) {
                val protectedApps = apps.filter { it.isProtected }
                val otherApps = apps.filter { !it.isProtected }

                if (protectedApps.isNotEmpty()) {
                    item {
                        SectionHeader(
                            title = stringResource(R.string.section_protected_apps),
                            count = protectedApps.size,
                            isProtected = true
                        )
                    }
                    items(items = protectedApps, key = { it.packageName }) { app ->
                        AppItemCard(app = app, iconLoader = iconLoader, onClick = { onAppClick(app) })
                    }
                }

                if (otherApps.isNotEmpty()) {
                    item {
                        SectionHeader(
                            title = stringResource(R.string.section_other_apps),
                            count = otherApps.size,
                            isProtected = false
                        )
                    }
                    items(items = otherApps, key = { it.packageName }) { app ->
                        AppItemCard(app = app, iconLoader = iconLoader, onClick = { onAppClick(app) })
                    }
                }
            } else {
                items(items = apps, key = { it.packageName }) { app ->
                    AppItemCard(app = app, iconLoader = iconLoader, onClick = { onAppClick(app) })
                }
            }

            item { Spacer(modifier = Modifier.height(24.dp)) }
        }
    }
}

@Composable
private fun SectionHeader(
    title: String,
    count: Int,
    isProtected: Boolean = false
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 7.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (isProtected) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_shield),
                    contentDescription = null,
                    tint = ext.success,
                    modifier = Modifier.size(13.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
            }
            Text(
                text = title,
                color = if (isProtected) cs.onBackground else cs.onSurfaceVariant,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.6.sp
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(cs.surface)
                .border(0.7.dp, ext.border, RoundedCornerShape(4.dp))
                .padding(horizontal = 6.dp, vertical = 1.5.dp)
        ) {
            Text(
                text = "$count",
                color = if (isProtected) ext.success else cs.onSurfaceVariant,
                fontSize = 10.5.sp,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun TemplatesScreen(
    status: DaemonStatus,
    allApps: List<AppInfo>,
    iconLoader: com.causentry.app.data.IconLoader,
    scrollState: androidx.compose.foundation.ScrollState,
    onSaveTemplate: (name: String, packages: List<String>, deleteName: String?) -> Unit,
    onDeleteTemplate: (String) -> Unit,
    onApplyTemplateToApps: (template: String, packages: List<String>, detach: List<String>) -> Unit
) {
    val cs = MaterialTheme.colorScheme

    var showEditor by remember { mutableStateOf(false) }
    var editingInitialName by remember { mutableStateOf("") }
    var editingName by remember { mutableStateOf("") }
    var editingPackages by remember { mutableStateOf<List<String>>(emptyList()) }
    var applyTemplate by remember { mutableStateOf<String?>(null) }

    if (showEditor) {
        TemplateEditorDialog(
            initialName = editingName,
            initialPackages = editingPackages,
            allApps = allApps,
            iconLoader = iconLoader,
            onSave = { name, pkgs ->
                val deleteOld = if (editingInitialName.isNotEmpty() && editingInitialName != name) editingInitialName else null
                onSaveTemplate(name, pkgs, deleteOld)
                showEditor = false
            },
            onDismiss = { showEditor = false }
        )
    }

    applyTemplate?.let { tplName ->
        TemplateApplyDialog(
            templateName = tplName,
            templatePackages = status.templates[tplName] ?: emptyList(),
            allApps = allApps,
            iconLoader = iconLoader,
            onApply = { toAdd, toRemove ->
                onApplyTemplateToApps(tplName, toAdd, toRemove)
                applyTemplate = null
            },
            onDismiss = { applyTemplate = null }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(R.string.templates_title),
                    color = cs.onBackground,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.templates_subtitle),
                    color = cs.onSurfaceVariant,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = {
                    editingInitialName = ""
                    editingName = ""
                    editingPackages = emptyList()
                    showEditor = true
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
            ) {
                Text(stringResource(R.string.action_new_template), fontWeight = FontWeight.Bold)
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(scrollState)
                .padding(bottom = 20.dp)
        ) {
            if (status.templates.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.templates_empty),
                        color = cs.onSurfaceVariant,
                        fontSize = 14.sp,
                        textAlign = TextAlign.Center
                    )
                }
            } else {
                status.templates.forEach { (name, pkgs) ->
                    TemplateCard(
                        name = name,
                        packages = pkgs,
                        onEdit = {
                            editingInitialName = name
                            editingName = name
                            editingPackages = pkgs
                            showEditor = true
                        },
                        onDelete = { onDeleteTemplate(name) },
                        onApplyToApps = { applyTemplate = name },
                        modifier = Modifier.padding(vertical = 6.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun ActionsScreen(
    status: DaemonStatus,
    themeMode: ThemeMode,
    dynamicColor: Boolean,
    language: AppLanguage,
    scrollState: androidx.compose.foundation.ScrollState,
    backupManager: com.causentry.app.data.ConfigBackupManager,
    onThemeModeChange: (ThemeMode) -> Unit,
    onDynamicColorChange: (Boolean) -> Unit,
    onLanguageChange: (AppLanguage) -> Unit,
    onSaveStorageRules: (roots: List<String>, relatives: List<String>) -> Unit,
    onApply: () -> Unit,
    onRestore: () -> Unit,
    onRefresh: () -> Unit
) {
    val cs = MaterialTheme.colorScheme
    val ext = LocalCausentryColors.current
    var showRestoreConfirm by remember { mutableStateOf(false) }
    val clipboardManager = LocalClipboardManager.current
    val context = LocalContext.current
    val copiedToast = stringResource(R.string.logs_copied)

    if (showRestoreConfirm) {
        AlertDialog(
            onDismissRequest = { showRestoreConfirm = false },
            title = { Text(stringResource(R.string.restore_dialog_title), color = cs.onSurface, fontWeight = FontWeight.Bold) },
            text = { Text(stringResource(R.string.restore_dialog_body), color = cs.onSurfaceVariant) },
            containerColor = cs.surface,
            confirmButton = {
                TextButton(
                    onClick = {
                        showRestoreConfirm = false
                        onRestore()
                    },
                    colors = ButtonDefaults.textButtonColors(contentColor = ext.danger)
                ) {
                    Text(stringResource(R.string.action_restore_defaults), fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showRestoreConfirm = false }) {
                    Text(stringResource(R.string.action_cancel), color = cs.onSurfaceVariant)
                }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 10.dp)
            .verticalScroll(scrollState)
    ) {
        DiagnosticsCard(status = status)

        Spacer(modifier = Modifier.height(14.dp))

        ThemeAndLanguageCard(
            themeMode = themeMode,
            dynamicColor = dynamicColor,
            language = language,
            onThemeModeChange = onThemeModeChange,
            onDynamicColorChange = onDynamicColorChange,
            onLanguageChange = onLanguageChange
        )

        Spacer(modifier = Modifier.height(14.dp))

        StorageCloakCard(
            status = status,
            onSaveStorageRules = onSaveStorageRules
        )

        Spacer(modifier = Modifier.height(14.dp))

        BackupRestoreCard(
            status = status,
            backupManager = backupManager,
            onRefresh = onRefresh
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Engine Management Card
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_refresh),
                    contentDescription = null,
                    tint = cs.primary,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = stringResource(R.string.engine_title),
                        color = cs.onSurface,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(R.string.engine_subtitle),
                        color = cs.onSurfaceVariant,
                        fontSize = 11.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = onApply,
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = cs.primary, contentColor = cs.onPrimary)
                ) {
                    Text(stringResource(R.string.action_resync), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }

                Button(
                    onClick = { showRestoreConfirm = true },
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = ext.danger, contentColor = cs.onError)
                ) {
                    Text(stringResource(R.string.action_restore_all), fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Daemon & Zygisk Logs Card
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(cs.surface)
                .border(1.dp, ext.border, RoundedCornerShape(16.dp))
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f, fill = false)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_code),
                        contentDescription = null,
                        tint = cs.primary,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = stringResource(R.string.daemon_logs_title),
                            color = cs.onSurface,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = stringResource(R.string.daemon_logs_subtitle),
                            color = cs.onSurfaceVariant,
                            fontSize = 11.sp
                        )
                    }
                }

                TextButton(
                    onClick = {
                        clipboardManager.setText(AnnotatedString(status.log))
                        Toast.makeText(context, copiedToast, Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_copy),
                        contentDescription = stringResource(R.string.action_copy),
                        tint = cs.primary,
                        modifier = Modifier.size(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(stringResource(R.string.action_copy), color = cs.primary, fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(ext.surfaceHigh)
                    .border(1.dp, ext.border, RoundedCornerShape(10.dp))
                    .padding(12.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = if (status.log.isBlank()) stringResource(R.string.logs_empty) else status.log,
                    color = cs.onSurfaceVariant,
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace,
                    lineHeight = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}
