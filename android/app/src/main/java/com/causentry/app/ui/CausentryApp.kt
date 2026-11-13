package com.causentry.app.ui

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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.causentry.app.model.AppFilter
import com.causentry.app.model.AppInfo
import com.causentry.app.model.DaemonStatus
import com.causentry.app.ui.components.AppDetailDialog
import com.causentry.app.ui.components.AppItemCard
import com.causentry.app.ui.components.HeroStatusCard
import com.causentry.app.ui.components.StatusPill
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
                status = status,
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

            when (currentTab) {
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
                    // Templates Tab
                    TemplatesScreen(
                        status = status,
                        onSaveTemplate = { name, pkgs -> viewModel.saveTemplate(name, pkgs) }
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
    status: DaemonStatus,
    isRefreshing: Boolean,
    onRefresh: () -> Unit
) {
    val pillColor = when {
        !status.daemonAlive -> DangerRed
        status.state == "active" -> SuccessGreen
        else -> WarningAmber
    }
    val pillText = when {
        !status.daemonAlive -> "STOPPED"
        status.state == "active" -> "ACTIVE"
        else -> "STANDBY"
    }

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

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            StatusPill(text = pillText, color = pillColor)

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
                    Text(
                        text = "↻",
                        color = TextPrimary,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Composable
private fun TabRowSelector(
    selectedTab: Int,
    onTabSelect: (Int) -> Unit
) {
    val tabs = listOf("Apps", "Templates", "Status & Actions")

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
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(if (isSelected) PrimaryBlue else Color.Transparent)
                    .clickable { onTabSelect(index) }
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
                        Text(
                            text = "✕",
                            color = TextSecondary,
                            modifier = Modifier
                                .clickable { onSearchChange("") }
                                .padding(8.dp)
                        )
                    }
                }
            )
        }

        item {
            // Filter chip row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilterChipItem(
                    label = "All",
                    selected = selectedFilter == AppFilter.ALL,
                    onClick = { onFilterSelect(AppFilter.ALL) }
                )
                FilterChipItem(
                    label = "Protected (${status.targets.size})",
                    selected = selectedFilter == AppFilter.PROTECTED,
                    onClick = { onFilterSelect(AppFilter.PROTECTED) }
                )
                FilterChipItem(
                    label = "User",
                    selected = selectedFilter == AppFilter.USER,
                    onClick = { onFilterSelect(AppFilter.USER) }
                )
                FilterChipItem(
                    label = "System",
                    selected = selectedFilter == AppFilter.SYSTEM,
                    onClick = { onFilterSelect(AppFilter.SYSTEM) }
                )
            }
        }

        if (apps.isEmpty()) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 40.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (searchQuery.isEmpty()) "Loading applications..." else "No applications match your search",
                        color = TextSecondary,
                        fontSize = 14.sp
                    )
                }
            }
        } else {
            // Keyed virtualized items: only the 8-10 items on screen are composed!
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
private fun FilterChipItem(
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    FilterChip(
        selected = selected,
        onClick = onClick,
        label = {
            Text(
                text = label,
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal
            )
        },
        shape = RoundedCornerShape(8.dp),
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = PrimaryBlue.copy(alpha = 0.2f),
            selectedLabelColor = PrimaryBlue,
            containerColor = SurfaceDark,
            labelColor = TextSecondary
        ),
        border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            borderColor = if (selected) PrimaryBlue else BorderDark
        )
    )
}

@Composable
private fun TemplatesScreen(
    status: DaemonStatus,
    onSaveTemplate: (String, List<String>) -> Unit
) {
    var newTemplateName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Hidden-App Templates",
            color = TextPrimary,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Templates define groups of apps cloaked from target package queries in system_server.",
            color = TextSecondary,
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Create Template Input Card
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(SurfaceDark)
                .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = newTemplateName,
                onValueChange = { newTemplateName = it },
                placeholder = { Text("New template name...", color = TextSecondary, fontSize = 13.sp) },
                singleLine = true,
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = PrimaryBlue,
                    unfocusedBorderColor = BorderDark,
                    focusedTextColor = TextPrimary,
                    unfocusedTextColor = TextPrimary
                )
            )

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = {
                    val name = newTemplateName.trim()
                    if (name.isNotEmpty()) {
                        onSaveTemplate(name, emptyList())
                        newTemplateName = ""
                    }
                },
                enabled = newTemplateName.isNotBlank(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryBlue)
            ) {
                Text("Create", color = TextPrimary, fontWeight = FontWeight.Bold)
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
                    text = "No custom templates configured yet.",
                    color = TextSecondary,
                    fontSize = 14.sp
                )
            }
        } else {
            status.templates.forEach { (name, pkgs) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(SurfaceDark)
                        .border(1.dp, BorderDark, RoundedCornerShape(12.dp))
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = name,
                            color = TextPrimary,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${pkgs.size} apps cloaked in this template",
                            color = TextSecondary,
                            fontSize = 12.sp
                        )
                    }

                    StatusPill(text = "${pkgs.size} APPS", color = PrimaryBlue)
                }
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Engine Actions",
            color = TextPrimary,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Control root daemon state, resync Zygisk policy, or restore default phone flags.",
            color = TextSecondary,
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

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
                onClick = onRestore,
                modifier = Modifier.weight(1f).height(48.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = DangerRed.copy(alpha = 0.8f))
            ) {
                Text("Restore All", color = TextPrimary, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "DAEMON LOG OUTPUT",
            color = TextSecondary,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.5.sp
        )

        Spacer(modifier = Modifier.height(6.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.Black.copy(alpha = 0.4f))
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
