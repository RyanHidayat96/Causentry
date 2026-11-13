package com.causentry.app.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.R
import com.causentry.app.model.AppFilter
import com.causentry.app.model.AppInfo
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.components.AppDetailDialog
import com.causentry.app.ui.components.AppItemCard
import com.causentry.app.ui.components.DiagnosticsCard
import com.causentry.app.ui.components.FilterChipRow
import com.causentry.app.ui.components.HeroStatusCard
import com.causentry.app.ui.components.ShimmerAppList
import com.causentry.app.ui.components.StatusPill
import com.causentry.app.ui.components.TemplateCard
import com.causentry.app.ui.components.TemplateEditorDialog
import com.causentry.app.ui.theme.BgDark
import com.causentry.app.ui.theme.BorderDark
import com.causentry.app.ui.theme.DangerRed
import com.causentry.app.ui.theme.PrimaryBlue
import com.causentry.app.ui.theme.SuccessGreen
import com.causentry.app.ui.theme.SurfaceDark
import com.causentry.app.ui.theme.SurfaceHighDark
import com.causentry.app.ui.theme.TextPrimary
import com.causentry.app.ui.theme.TextSecondary
import com.causentry.app.ui.theme.WarningAmber

@Composable
fun CausentryApp(
    viewModel: MainViewModel
) {
    val status by viewModel.daemonStatus.collectAsState()
    val apps by viewModel.filteredApps.collectAsState()
    val allApps by viewModel.allApps.collectAsState()
    val query by viewModel.searchQuery.collectAsState()
    val filter by viewModel.selectedFilter.collectAsState()
    val selectedApp by viewModel.selectedApp.collectAsState()
    val currentTab by viewModel.currentTab.collectAsState()
    val isRefreshing by viewModel.isRefreshing.collectAsState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = BgDark,
        topBar = {
            TopAppBar(
                isRefreshing = isRefreshing,
                onRefresh = { viewModel.refreshAll() }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Tab Selector (Apps, Templates, Status & Actions)
            TabRowSelector(
                selectedTab = currentTab,
                onTabSelect = { viewModel.onTabChanged(it) }
            )

            AnimatedContent(
                targetState = currentTab,
                transitionSpec = {
                    if (targetState > initialState) {
                        (slideInHorizontally { width -> width / 4 } + fadeIn(animationSpec = tween(220)))
                            .togetherWith(slideOutHorizontally { width -> -width / 4 } + fadeOut(animationSpec = tween(220)))
                    } else {
                        (slideInHorizontally { width -> -width / 4 } + fadeIn(animationSpec = tween(220)))
                            .togetherWith(slideOutHorizontally { width -> width / 4 } + fadeOut(animationSpec = tween(220)))
                    }
                },
                label = "TabTransition",
                modifier = Modifier.fillMaxSize()
            ) { tab ->
                when (tab) {
                    0 -> {
                        // Apps Tab: Search, Filter, Hero Card, Virtualized 120Hz List
                        AppsScreen(
                            status = status,
                            apps = apps,
                            searchQuery = query,
                            onSearchChange = { viewModel.onSearchQueryChanged(it) },
                            selectedFilter = filter,
                            onFilterSelect = { viewModel.onFilterSelected(it) },
                            onAppClick = { viewModel.onSelectApp(it) },
                            iconLoader = viewModel.iconLoader
                        )
                    }
                    1 -> {
                        // Templates Tab: Multi-select interactive cloaking manager
                        TemplatesScreen(
                            status = status,
                            allApps = allApps,
                            iconLoader = viewModel.iconLoader,
                            onSaveTemplate = { name, pkgs -> viewModel.saveTemplate(name, pkgs) },
                            onDeleteTemplate = { name -> viewModel.deleteTemplate(name) }
                        )
                    }
                    2 -> {
                        // Actions & Diagnostics Tab
                        ActionsScreen(
                            status = status,
                            onApply = { viewModel.applyChanges() },
                            onRestore = { viewModel.restoreAll() },
                            onRefresh = { viewModel.refreshAll() }
                        )
                    }
                }
            }
        }
    }

    // App Detail dialog when an app is tapped
    selectedApp?.let { app ->
        AppDetailDialog(
            app = app,
            availableTemplates = status.templates.keys.toList(),
            iconLoader = viewModel.iconLoader,
            onSave = { devOff, mock, isolate, template ->
                viewModel.setAppConfig(app.packageName, devOff, mock, isolate, template)
                viewModel.onSelectApp(null)
            },
            onDelete = {
                viewModel.deleteAppConfig(app.packageName)
                viewModel.onSelectApp(null)
            },
            onDismiss = { viewModel.onSelectApp(null) }
        )
    }
}

@Composable
private fun TopAppBar(
    isRefreshing: Boolean,
    onRefresh: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(horizontal = 20.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Causentry",
                color = TextPrimary,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Anti-Detection Control",
                color = TextSecondary,
                fontSize = 12.sp
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .clickable(enabled = !isRefreshing, onClick = onRefresh)
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(10.dp))
                .padding(8.dp)
        ) {
            if (isRefreshing) {
                CircularProgressIndicator(
                    modifier = Modifier.width(18.dp).height(18.dp),
                    strokeWidth = 2.dp,
                    color = PrimaryBlue
                )
            } else {
                Icon(
                    painter = painterResource(id = R.drawable.ic_refresh),
                    contentDescription = "Refresh",
                    tint = TextPrimary,
                    modifier = Modifier.padding(2.dp).width(16.dp).height(16.dp)
                )
            }
        }
    }
}

@Composable
private fun TabRowSelector(
    selectedTab: Int,
    onTabSelect: (Int) -> Unit
) {
    val tabs = listOf("Apps", "Templates", "Diagnostics")
    val haptic = LocalHapticFeedback.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(SurfaceDark)
            .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
            .padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        tabs.forEachIndexed { index, label ->
            val isSelected = selectedTab == index
            val animatedTabBg by animateColorAsState(
                targetValue = if (isSelected) PrimaryBlue else Color.Transparent,
                animationSpec = tween(180),
                label = "tabBg"
            )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(animatedTabBg)
                    .clickable {
                        haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                        onTabSelect(index)
                    }
                    .padding(vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = label,
                    color = if (isSelected) TextPrimary else TextSecondary,
                    fontSize = 13.sp,
                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                )
            }
        }
    }
}

@Composable
private fun AppsScreen(
    status: DaemonStatus,
    apps: List<AppInfo>,
    searchQuery: String,
    onSearchChange: (String) -> Unit,
    selectedFilter: AppFilter,
    onFilterSelect: (AppFilter) -> Unit,
    onAppClick: (AppInfo) -> Unit,
    iconLoader: com.causentry.app.data.IconLoader
) {
    val focusManager = LocalFocusManager.current

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            HeroStatusCard(
                status = status,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp)
            )
        }

        item {
            // High-performance search bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = onSearchChange,
                placeholder = { Text("Search app name or package...", color = TextSecondary, fontSize = 14.sp) },
                singleLine = true,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                keyboardActions = KeyboardActions(onSearch = { focusManager.clearFocus() }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(12.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        tint = TextSecondary,
                        modifier = Modifier.padding(2.dp).width(18.dp).height(18.dp)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryBlue,
                    unfocusedBorderColor = BorderDark,
                    focusedContainerColor = SurfaceDark,
                    unfocusedContainerColor = SurfaceDark,
                    focusedTextColor = TextPrimary,
                    unfocusedTextColor = TextPrimary
                ),
                trailingIcon = {
                    if (searchQuery.isNotEmpty()) {
                        IconButton(onClick = { onSearchChange("") }) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_close),
                                contentDescription = "Clear",
                                tint = TextSecondary,
                                modifier = Modifier.padding(2.dp).width(16.dp).height(16.dp)
                            )
                        }
                    }
                }
            )
        }

        item {
            FilterChipRow(
                selectedFilter = selectedFilter,
                onFilterSelect = onFilterSelect,
                allCount = apps.size,
                protectedCount = status.targets.size,
                userCount = apps.count { !it.isSystem },
                systemCount = apps.count { it.isSystem },
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
            )
        }

        if (apps.isEmpty()) {
            if (searchQuery.isEmpty()) {
                item {
                    ShimmerAppList(count = 7)
                }
            } else {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No applications match '$searchQuery'",
                            color = TextSecondary,
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
                    SectionHeader(title = "PROTECTED APPLICATIONS", count = protectedApps.size)
                }
                items(
                    items = protectedApps,
                    key = { it.packageName }
                ) { app ->
                    AppItemCard(
                        app = app,
                        iconLoader = iconLoader,
                        onClick = { onAppClick(app) }
                    )
                }
            }

            if (otherApps.isNotEmpty()) {
                item {
                    SectionHeader(title = "ALL OTHER APPLICATIONS", count = otherApps.size)
                }
                items(
                    items = otherApps,
                    key = { it.packageName }
                ) { app ->
                    AppItemCard(
                        app = app,
                        iconLoader = iconLoader,
                        onClick = { onAppClick(app) }
                    )
                }
            }
        } else {
            items(
                items = apps,
                key = { it.packageName }
            ) { app ->
                AppItemCard(
                    app = app,
                    iconLoader = iconLoader,
                    onClick = { onAppClick(app) }
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
private fun SectionHeader(title: String, count: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = TextSecondary,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        )
        Text(
            text = "$count",
            color = TextSecondary,
            fontSize = 11.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun TemplatesScreen(
    status: DaemonStatus,
    allApps: List<AppInfo>,
    iconLoader: com.causentry.app.data.IconLoader,
    onSaveTemplate: (String, List<String>) -> Unit,
    onDeleteTemplate: (String) -> Unit
) {
    var showEditor by remember { mutableStateOf(false) }
    var editingName by remember { mutableStateOf("") }
    var editingPackages by remember { mutableStateOf<List<String>>(emptyList()) }

    if (showEditor) {
        TemplateEditorDialog(
            initialName = editingName,
            initialPackages = editingPackages,
            allApps = allApps,
            iconLoader = iconLoader,
            onSave = { name, pkgs ->
                onSaveTemplate(name, pkgs)
                showEditor = false
            },
            onDismiss = { showEditor = false }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Hidden-App Templates",
                    color = TextPrimary,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Configure groups of apps to cloak from target package queries in system_server.",
                    color = TextSecondary,
                    fontSize = 12.sp
                )
            }

            Button(
                onClick = {
                    editingName = ""
                    editingPackages = emptyList()
                    showEditor = true
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text("+ New", color = TextPrimary, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (status.templates.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 40.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "No custom templates configured yet. Tap '+ New' to create one.",
                    color = TextSecondary,
                    fontSize = 14.sp
                )
            }
        } else {
            status.templates.forEach { (name, pkgs) ->
                TemplateCard(
                    name = name,
                    packages = pkgs,
                    onEdit = {
                        editingName = name
                        editingPackages = pkgs
                        showEditor = true
                    },
                    onDelete = { onDeleteTemplate(name) },
                    modifier = Modifier.padding(vertical = 6.dp)
                )
            }
        }
    }
}

@Composable
private fun ActionsScreen(
    status: DaemonStatus,
    onApply: () -> Unit,
    onRestore: () -> Unit,
    onRefresh: () -> Unit
) {
    var showRestoreConfirm by remember { mutableStateOf(false) }
    val clipboardManager = LocalClipboardManager.current

    if (showRestoreConfirm) {
        AlertDialog(
            onDismissRequest = { showRestoreConfirm = false },
            title = { Text("Restore Default Settings?", color = TextPrimary, fontWeight = FontWeight.Bold) },
            text = { Text("This will revert all developer options, mock location, and app cloak overrides to system defaults. Are you sure?", color = TextSecondary) },
            containerColor = SurfaceDark,
            confirmButton = {
                TextButton(
                    onClick = {
                        showRestoreConfirm = false
                        onRestore()
                    },
                    colors = ButtonDefaults.textButtonColors(contentColor = DangerRed)
                ) {
                    Text("Restore Defaults", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showRestoreConfirm = false }) {
                    Text("Cancel", color = TextSecondary)
                }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        DiagnosticsCard(status = status)

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Engine Management",
            color = TextPrimary,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Apply pending rules, force reload Zygisk policy, or rollback changes.",
            color = TextSecondary,
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = onApply,
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text("Re-sync Engine", color = TextPrimary, fontWeight = FontWeight.Bold)
            }

            Button(
                onClick = { showRestoreConfirm = true },
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = DangerRed.copy(alpha = 0.85f))
            ) {
                Text("Restore All", color = TextPrimary, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "DAEMON & ZYGISK LOGS",
                color = TextSecondary,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.5.sp
            )

            TextButton(
                onClick = {
                    clipboardManager.setText(AnnotatedString(status.log))
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_copy),
                    contentDescription = "Copy Logs",
                    tint = PrimaryBlue,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("Copy Logs", color = PrimaryBlue, fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(6.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Black.copy(alpha = 0.45f))
                .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = if (status.log.isBlank()) "No recent log events recorded by daemon." else status.log,
                color = TextSecondary,
                fontSize = 11.sp,
                fontFamily = FontFamily.Monospace,
                lineHeight = 16.sp
            )
        }
    }
}
