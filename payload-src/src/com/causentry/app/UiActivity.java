package com.causentry.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UiActivity extends Activity {
    private static final int BG = Color.rgb(11, 15, 20);
    private static final int SURFACE = Color.rgb(22, 29, 38);
    private static final int LINE = Color.rgb(31, 41, 54);
    private static final int FG = Color.rgb(232, 238, 246);
    private static final int MUTED = Color.rgb(147, 161, 177);
    private static final int ACCENT = Color.rgb(59, 130, 246);
    private static final int OK = Color.rgb(34, 197, 94);
    private static final int WARN = Color.rgb(245, 158, 11);
    private static final int DANGER = Color.rgb(239, 68, 68);
    private static final int FILTER_USER = 0;
    private static final int FILTER_ALL = 1;
    private static final int FILTER_SYSTEM = 2;

    private final Handler handler = new Handler(Looper.getMainLooper());
    private UiBridge bridge;
    private LinearLayout content;
    private LinearLayout appRows;
    private LinearLayout hiddenRows;
    private FrameLayout bottomBar;
    private Button bottomApply;
    private TextView title;
    private TextView subtitle;
    private TextView pill;
    private ImageButton back;

    private JSONObject status = new JSONObject();
    private JSONObject config = new JSONObject();
    private final List<AppEntry> apps = new ArrayList<>();
    private final Map<String, String> labels = new HashMap<>();
    private final Map<String, JSONObject> appConfig = new HashMap<>();
    private final List<String> targets = new ArrayList<>();
    private final List<String> hardened = new ArrayList<>();
    private final Map<String, List<String>> templates = new HashMap<>();
    private final List<String> rootVisible = new ArrayList<>();
    private final List<String> rootSuggested = new ArrayList<>();
    private boolean pendingTemplateSave;
    private String pendingTemplateOp = "";
    private String pendingTemplateName = "";
    private List<String> pendingTemplatePackages = new ArrayList<>();
    private String pendingTemplateDelete = "";
    private boolean detailMode;
    private boolean templateDetail;
    private String selectedPkg;
    private String currentTemplate = "";
    private String appSearch = "";
    private String hiddenSearch = "";
    private int homeTab = TAB_APPS;
    private int appFilter = FILTER_USER;
    private int hiddenFilter = FILTER_USER;
    private boolean rendering;

    private static final int TAB_APPS = 0;
    private static final int TAB_TEMPLATES = 1;
    private static final int TAB_ACTIONS = 2;

    private static final class AppEntry {
        String pkg;
        boolean prot;
        boolean hardened;
        boolean hidden;
        boolean system;
    }

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        if (getIntent() != null && getIntent().getBooleanExtra("probe", false)) {
            try { SelfProbe.write(this); } catch (Throwable ignored) {}
            finish();
            return;
        }
        bridge = new UiBridge(this);
        getWindow().setStatusBarColor(BG);
        getWindow().setNavigationBarColor(BG);
        if (Build.VERSION.SDK_INT >= 30) getWindow().setDecorFitsSystemWindows(true);
        buildShell();
        readAll();
        String app = getIntent() == null ? "" : getIntent().getStringExtra("app");
        if (isPackageName(app)) {
            selectedPkg = app;
            detailMode = true;
            templateDetail = false;
        }
        render();
        command(json("action", "refresh"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        readAll();
        render();
        command(json("action", "refresh"));
    }

    @Override
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String app = intent == null ? "" : intent.getStringExtra("app");
        if (isPackageName(app)) {
            selectedPkg = app;
            detailMode = true;
            templateDetail = false;
            readAll();
            render();
        }
    }

    @Override
    public void onBackPressed() {
        if (detailMode) {
            detailMode = false;
            selectedPkg = null;
            render();
            return;
        }
        if (templateDetail) {
            templateDetail = false;
            hiddenSearch = "";
            render();
            return;
        }
        super.onBackPressed();
    }

    private void buildShell() {
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(BG);

        LinearLayout toolbar = new LinearLayout(this);
        toolbar.setOrientation(LinearLayout.HORIZONTAL);
        toolbar.setGravity(Gravity.CENTER_VERTICAL);
        toolbar.setPadding(dp(8), statusBarHeight() + dp(8), dp(8), dp(8));
        root.addView(toolbar, new LinearLayout.LayoutParams(-1, statusBarHeight() + dp(64)));

        back = new ImageButton(this);
        back.setImageResource(android.R.drawable.ic_media_previous);
        back.setBackgroundColor(Color.TRANSPARENT);
        back.setColorFilter(FG);
        back.setOnClickListener(v -> onBackPressed());
        toolbar.addView(back, new LinearLayout.LayoutParams(dp(48), dp(48)));

        LinearLayout titles = new LinearLayout(this);
        titles.setOrientation(LinearLayout.VERTICAL);
        titles.setGravity(Gravity.CENTER_VERTICAL);
        title = tv(20, FG, Typeface.BOLD);
        subtitle = tv(12, MUTED, Typeface.NORMAL);
        titles.addView(title);
        titles.addView(subtitle);
        toolbar.addView(titles, new LinearLayout.LayoutParams(0, -1, 1));

        pill = tv(11, WARN, Typeface.BOLD);
        pill.setGravity(Gravity.CENTER);
        pill.setPadding(dp(10), dp(4), dp(10), dp(4));
        toolbar.addView(pill);

        ImageButton refresh = new ImageButton(this);
        refresh.setImageResource(android.R.drawable.ic_popup_sync);
        refresh.setBackgroundColor(Color.TRANSPARENT);
        refresh.setColorFilter(FG);
        refresh.setOnClickListener(v -> {
            readAll();
            render();
            command(json("action", "refresh"));
        });
        toolbar.addView(refresh, new LinearLayout.LayoutParams(dp(48), dp(48)));

        ScrollView scroll = new ScrollView(this);
        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        scroll.addView(content, new ScrollView.LayoutParams(-1, -2));
        root.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));

        bottomApply = button("Apply for this app", true);
        bottomBar = new FrameLayout(this);
        bottomBar.setPadding(dp(16), dp(8), dp(16), navigationBarHeight() + dp(8));
        bottomBar.addView(bottomApply, new FrameLayout.LayoutParams(-1, dp(52)));
        bottomBar.setVisibility(View.GONE);
        root.addView(bottomBar, new LinearLayout.LayoutParams(-1, navigationBarHeight() + dp(68)));
        setContentView(root);
    }

    private void readAll() {
        readStatus();
        config = status.optJSONObject("config");
        if (config == null) config = new JSONObject();
        labels.clear();
        try {
            JSONObject got = new JSONObject(bridge.labels());
            JSONArray names = got.names();
            if (names != null) for (int i = 0; i < names.length(); i++) {
                String k = names.optString(i);
                labels.put(k, got.optString(k, k));
            }
        } catch (Throwable ignored) {}
        readLists();
        readApps();
    }

    private void readStatus() {
        try { status = new JSONObject(bridge.status()); } catch (Throwable t) { status = new JSONObject(); }
    }

    private void readLists() {
        targets.clear(); hardened.clear(); appConfig.clear(); templates.clear();
        rootVisible.clear(); rootSuggested.clear();
        addArray(targets, status.optJSONArray("targets"));
        addArray(hardened, status.optJSONArray("hardened"));
        JSONObject appsObj = config.optJSONObject("apps");
        if (appsObj != null) {
            JSONArray names = appsObj.names();
            if (names != null) for (int i = 0; i < names.length(); i++) {
                String p = names.optString(i);
                JSONObject o = appsObj.optJSONObject(p);
                if (isPackageName(p) && o != null) appConfig.put(p, o);
            }
        }
        JSONObject tpl = config.optJSONObject("hideTemplates");
        if (tpl != null) {
            JSONArray names = tpl.names();
            if (names != null) for (int i = 0; i < names.length(); i++) {
                String name = names.optString(i);
                if (!isTemplateName(name)) continue;
                List<String> list = new ArrayList<>();
                addArray(list, tpl.optJSONArray(name));
                templates.put(name, uniquePkgs(list));
            }
        }
        applyPendingTemplateSave();
        if (!templates.containsKey(currentTemplate)) {
            currentTemplate = "";
            templateDetail = false;
        }
        splitPackages(rootVisible, status.optString("rootApps", ""));
        splitPackages(rootSuggested, status.optString("rootSuggest", ""));
    }

    private void readApps() {
        apps.clear();
        Map<String, AppEntry> byPkg = new HashMap<>();
        try {
            JSONObject json = new JSONObject(bridge.apps());
            JSONArray arr = json.optJSONArray("apps");
            if (arr != null) for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.optJSONObject(i);
                if (o == null) continue;
                String pkg = o.optString("pkg");
                if (!isPackageName(pkg)) continue;
                AppEntry e = new AppEntry();
                e.pkg = pkg;
                e.prot = o.optBoolean("protected") || targets.contains(pkg);
                e.hardened = o.optBoolean("hardened") || hardened.contains(pkg);
                e.hidden = o.optBoolean("hidden") || hiddenInAnyTemplate(pkg);
                e.system = isSystemPackage(pkg);
                byPkg.put(pkg, e);
            }
        } catch (Throwable ignored) {}
        try {
            List<android.content.pm.ApplicationInfo> installed = getPackageManager().getInstalledApplications(0);
            for (android.content.pm.ApplicationInfo ai : installed) {
                if (ai == null || !isPackageName(ai.packageName)) continue;
                AppEntry e = byPkg.get(ai.packageName);
                if (e == null) {
                    e = new AppEntry();
                    e.pkg = ai.packageName;
                    byPkg.put(e.pkg, e);
                }
                e.prot = e.prot || targets.contains(e.pkg);
                e.hardened = e.hardened || hardened.contains(e.pkg);
                e.hidden = e.hidden || hiddenInAnyTemplate(e.pkg);
                e.system = (ai.flags & (android.content.pm.ApplicationInfo.FLAG_SYSTEM
                        | android.content.pm.ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)) != 0;
            }
        } catch (Throwable ignored) {}
        apps.addAll(byPkg.values());
        Collections.sort(apps, this::compareApps);
    }

    private void render() {
        rendering = true;
        content.removeAllViews();
        if (templateDetail && !templates.containsKey(currentTemplate)) {
            templateDetail = false;
            currentTemplate = "";
        }
        updateToolbar();
        if (detailMode && isPackageName(selectedPkg)) renderDetail();
        else if (templateDetail) renderTemplateDetail();
        else renderHome();
        rendering = false;
    }

    private void updateToolbar() {
        boolean daemon = status.optBoolean("daemon", false);
        String state = status.optString("state", "idle");
        boolean showingDetail = detailMode || templateDetail;
        back.setVisibility(showingDetail ? View.VISIBLE : View.GONE);
        title.setText(detailMode ? label(selectedPkg) : (templateDetail ? currentTemplate : "Causentry"));
        subtitle.setText(detailMode ? selectedPkg
                : (templateDetail ? templatePackages(currentTemplate).size() + " hidden apps" : ""));
        pill.setText(!daemon ? "STOPPED" : ("active".equals(state) ? "ACTIVE" : "STANDBY"));
        int c = !daemon ? DANGER : ("active".equals(state) ? OK : WARN);
        pill.setTextColor(c);
        pill.setBackground(round(Color.TRANSPARENT, c, 18));
        boolean showBottom = detailMode || templateDetail;
        if (bottomBar != null) bottomBar.setVisibility(showBottom ? View.VISIBLE : View.GONE);
        bottomApply.setVisibility(showBottom ? View.VISIBLE : View.GONE);
    }

    private void renderHome() {
        addOverviewStrip();
        addHomeTabs();
        if (homeTab == TAB_TEMPLATES) addTemplateGroup();
        else if (homeTab == TAB_ACTIONS) addActionsGroup();
        else addAppsGroup();
    }

    private void addOverviewStrip() {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setPadding(dp(16), dp(6), dp(16), dp(6));
        boolean daemon = status.optBoolean("daemon", false);
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(0, dp(52), 1);
        lp1.setMargins(0, 0, dp(8), 0);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(0, dp(52), 1);
        lp2.setMargins(0, 0, dp(8), 0);
        row.addView(statusTile("Targets", String.valueOf(targets.size()), OK), lp1);
        row.addView(statusTile("Templates", String.valueOf(templateNames().size()), ACCENT), lp2);
        row.addView(statusTile("Daemon", daemon ? "running" : "stopped", daemon ? OK : DANGER),
                new LinearLayout.LayoutParams(0, dp(52), 1));
        content.addView(row);
    }

    private View statusTile(String label, String value, int color) {
        LinearLayout tile = new LinearLayout(this);
        tile.setOrientation(LinearLayout.VERTICAL);
        tile.setGravity(Gravity.CENTER_VERTICAL);
        tile.setPadding(dp(14), dp(8), dp(14), dp(8));
        tile.setBackground(round(SURFACE, 0, 12));
        TextView l = tv(11, MUTED, Typeface.BOLD);
        l.setText(label.toUpperCase());
        TextView v = tv(15, color, Typeface.BOLD);
        v.setSingleLine(true);
        v.setText(value);
        tile.addView(l);
        tile.addView(v);
        return tile;
    }

    private void addHomeTabs() {
        LinearLayout tabs = new LinearLayout(this);
        tabs.setOrientation(LinearLayout.HORIZONTAL);
        tabs.setPadding(dp(4), dp(4), dp(4), dp(4));
        tabs.setBackground(round(SURFACE, LINE, 10));
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(0, dp(48), 1);
        lp1.setMargins(0, 0, dp(8), 0);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(0, dp(48), 1);
        lp2.setMargins(0, 0, dp(8), 0);
        tabs.addView(homeTab("Apps", TAB_APPS), lp1);
        tabs.addView(homeTab("Templates", TAB_TEMPLATES), lp2);
        tabs.addView(homeTab("Actions", TAB_ACTIONS), new LinearLayout.LayoutParams(0, dp(48), 1));
        content.addView(wrap(tabs, 16, 10, 16, 8));
    }

    private Button homeTab(String text, int tab) {
        boolean selected = homeTab == tab;
        Button item = new Button(this);
        item.setText(text);
        item.setAllCaps(false);
        item.setTextSize(14);
        item.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        item.setTextColor(selected ? Color.rgb(6, 18, 31) : FG);
        item.setBackground(round(selected ? ACCENT : Color.TRANSPARENT, 0, 7));
        item.setContentDescription("Open " + text);
        item.setOnClickListener(v -> {
            if (homeTab != tab) {
                homeTab = tab;
                render();
            }
        });
        return item;
    }

    private void addAppsGroup() {
        addSectionHeader("Apps", protectedCount() + " protected / " + visibleAppCount(appFilter) + " apps");
        EditText search = edit("Search app name or package", appSearch);
        search.addTextChangedListener(new SimpleWatcher() {
            public void afterTextChanged(Editable s) {
                if (!rendering) {
                    appSearch = s.toString();
                    populateAppRows();
                }
            }
        });
        content.addView(wrap(search, 16, 0, 16, 8));
        addAppFilterRow(true);
        appRows = new LinearLayout(this);
        appRows.setOrientation(LinearLayout.VERTICAL);
        content.addView(appRows);
        populateAppRows();
    }

    private void populateAppRows() {
        if (appRows == null) return;
        appRows.removeAllViews();
        String q = appSearch.trim().toLowerCase();
        List<AppEntry> filtered = new ArrayList<>();
        for (AppEntry app : apps) {
            if (!matchesAppFilter(app, appFilter)) continue;
            if (!q.isEmpty() && !(app.pkg + " " + label(app.pkg)).toLowerCase().contains(q)) continue;
            filtered.add(app);
        }
        Collections.sort(filtered, this::compareApps);
        for (AppEntry app : filtered) addAppRow(app, appRows);
        if (filtered.isEmpty()) addMuted(appRows, "No app matches this search.");
    }

    private void addTemplateGroup() {
        List<String> names = templateNames();
        addSectionHeader("Templates", names.isEmpty() ? "No templates yet" : names.size() + " saved");
        if (names.isEmpty()) {
            addMuted("Create a template to choose hidden apps.");
        } else {
            for (String name : names) addTemplateRow(name);
        }
        addGroupTitle("Create template");
        addTemplateCreateRow();
    }

    private void addTemplateRow(String name) {
        LinearLayout row = rowBase(true);
        row.setContentDescription("Open template " + name);
        row.setOnClickListener(v -> {
            currentTemplate = name;
            templateDetail = true;
            hiddenSearch = "";
            render();
        });
        TextView badge = tv(16, ACCENT, Typeface.BOLD);
        badge.setText(name.substring(0, 1).toUpperCase());
        badge.setGravity(Gravity.CENTER);
        badge.setBackground(round(SURFACE, ACCENT, 20));
        LinearLayout.LayoutParams badgeLp = new LinearLayout.LayoutParams(dp(40), dp(40));
        badgeLp.setMargins(0, 0, dp(12), 0);
        row.addView(badge, badgeLp);
        LinearLayout texts = new LinearLayout(this);
        texts.setOrientation(LinearLayout.VERTICAL);
        TextView title = tv(16, FG, Typeface.NORMAL);
        title.setText(name);
        title.setSingleLine(true);
        title.setEllipsize(android.text.TextUtils.TruncateAt.END);
        TextView summary = tv(12, MUTED, Typeface.NORMAL);
        int count = templatePackages(name).size();
        summary.setText(count + (count == 1 ? " app hidden" : " apps hidden"));
        texts.addView(title);
        texts.addView(summary);
        row.addView(texts, new LinearLayout.LayoutParams(0, -2, 1));
        TextView arrow = tv(24, MUTED, Typeface.NORMAL);
        arrow.setText(">");
        row.addView(arrow);
        content.addView(row);
        addDivider();
    }

    private void renderTemplateDetail() {
        addSectionHeader("Apps to hide", templatePackages(currentTemplate).size() + " selected");
        addTemplateManageRow();
        addHiddenSearch();
        addAppFilterRow(false);
        hiddenRows = new LinearLayout(this);
        hiddenRows.setOrientation(LinearLayout.VERTICAL);
        content.addView(hiddenRows);
        populateHiddenRows();
        bottomApply.setText("Save hidden apps");
        bottomApply.setOnClickListener(v -> saveTemplates());
    }

    private void addTemplateManageRow() {
        LinearLayout row = rowBase(false);
        Button edit = button("Edit name", false);
        Button delete = button("Delete", false);
        delete.setTextColor(DANGER);
        edit.setOnClickListener(v -> editCurrentTemplate());
        delete.setOnClickListener(v -> confirmDeleteTemplate());
        LinearLayout.LayoutParams editLp = new LinearLayout.LayoutParams(0, dp(48), 1);
        editLp.setMargins(0, 0, dp(8), 0);
        row.addView(edit, editLp);
        row.addView(delete, new LinearLayout.LayoutParams(0, dp(48), 1));
        content.addView(row);
    }

    private void addTemplateCreateRow() {
        LinearLayout create = rowBase(false);
        EditText name = edit("New template name", "");
        Button add = button("Create", false);
        add.setOnClickListener(v -> createTemplate(name.getText().toString()));
        LinearLayout.LayoutParams nameLp = new LinearLayout.LayoutParams(0, dp(48), 1);
        nameLp.setMargins(0, 0, dp(8), 0);
        create.addView(name, nameLp);
        create.addView(add, new LinearLayout.LayoutParams(dp(104), dp(48)));
        content.addView(create);
    }

    private void addHiddenSearch() {
        EditText search = edit("Search app/package to hide", hiddenSearch);
        search.addTextChangedListener(new SimpleWatcher() {
            public void afterTextChanged(Editable s) {
                if (!rendering) {
                    hiddenSearch = s.toString();
                    populateHiddenRows();
                }
            }
        });
        content.addView(wrap(search, 16, 4, 16, 8));
    }

    private void addActionsGroup() {
        addSectionHeader("Actions", status.optString("susfs", "unsupported") + " kernel path hiding");
        LinearLayout buttons = rowBase(false);
        Button apply = button("Re-sync", false);
        apply.setOnClickListener(v -> {
            String op = op();
            command(json("action", "apply", "op", op));
            waitApply(op, "Applying...");
        });
        Button log = button("Log", false);
        log.setOnClickListener(v -> showLog());
        LinearLayout.LayoutParams applyLp = new LinearLayout.LayoutParams(0, dp(48), 1);
        applyLp.setMargins(0, 0, dp(8), 0);
        buttons.addView(apply, applyLp);
        buttons.addView(log, new LinearLayout.LayoutParams(0, dp(48), 1));
        content.addView(buttons);
        Button restore = button("Restore everything", false);
        restore.setTextColor(DANGER);
        restore.setOnClickListener(v -> confirmRestore());
        content.addView(wrap(restore, 16, 0, 16, 18));
    }

    private void renderDetail() {
        JSONObject cfg = appConfig.get(selectedPkg);
        bottomApply.setText("Apply for this app");
        addAppHeader(selectedPkg);
        Switch dev = switchRow("Hide developer options", "The app sees dev-mode OFF while it runs",
                cfg != null ? cfg.optBoolean("devOff", false) : (targets.contains(selectedPkg) && status.optBoolean("autoDevOff", true)));
        Switch mock = switchRow("Hide mock location", "Sets mock_location=0 while this app runs. Package templates need an active Zygisk hook.",
                cfg != null ? cfg.optBoolean("mock", false) : (targets.contains(selectedPkg) && status.optBoolean("hideMockLocation", true)));
        Switch isolate = switchRow("Block app-zygote self-checks", "Stops privileged per-app zygote checks",
                cfg != null ? cfg.optBoolean("isolate", false) : (targets.contains(selectedPkg) && hardened.contains(selectedPkg)));
        String tpl = cfg != null && isTemplateName(cfg.optString("hideTemplate")) ? cfg.optString("hideTemplate") : "";
        List<String> names = templateNames();
        addGroupTitle("Hidden-app template");
        final Spinner sp;
        if (names.isEmpty()) {
            sp = null;
            addMuted("No hidden-app template. Create one in Templates.");
        } else {
            List<String> options = new ArrayList<>();
            options.add("No template");
            options.addAll(templateLabels());
            int templatePosition = names.indexOf(tpl);
            sp = spinner(options, templatePosition < 0 ? 0 : templatePosition + 1);
            content.addView(wrap(sp, 16, 0, 16, 8));
            TextView count = muted(templatePosition < 0 ? "No hidden-app template selected"
                    : tpl + ": " + templatePackages(tpl).size() + " hidden");
            content.addView(wrap(count, 24, 0, 24, 12));
            sp.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
                public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                    List<String> names = templateNames();
                    if (position > 0 && position <= names.size()) {
                        String name = names.get(position - 1);
                        count.setText(name + ": " + templatePackages(name).size() + " hidden");
                    } else count.setText("No hidden-app template selected");
                }
                public void onNothingSelected(android.widget.AdapterView<?> parent) {}
            });
        }
        if (!status.optBoolean("cloakReady", false)) {
            TextView unavailable = tv(13, WARN, Typeface.NORMAL);
            unavailable.setText("Package hiding unavailable: Zygisk system hook is inactive. Templates are saved but target apps can still list their packages.");
            content.addView(wrap(unavailable, 24, 0, 24, 12));
        }
        addValueRow("Kernel path hiding", status.optString("susfs", "unsupported"), null);
        bottomApply.setOnClickListener(v -> applyDetail(dev, mock, isolate, sp));
    }

    private void addAppHeader(String pkg) {
        LinearLayout row = rowBase(false);
        LinearLayout.LayoutParams iconLp = new LinearLayout.LayoutParams(dp(44), dp(44));
        iconLp.setMargins(0, 0, dp(14), 0);
        row.addView(icon(pkg, 44), iconLp);
        LinearLayout texts = new LinearLayout(this);
        texts.setOrientation(LinearLayout.VERTICAL);
        TextView name = tv(18, FG, Typeface.BOLD); name.setText(label(pkg));
        name.setSingleLine(true);
        name.setEllipsize(android.text.TextUtils.TruncateAt.END);
        TextView pack = tv(12, MUTED, Typeface.NORMAL); pack.setText(pkg);
        pack.setSingleLine(true);
        pack.setEllipsize(android.text.TextUtils.TruncateAt.END);
        texts.addView(name); texts.addView(pack);
        row.addView(texts, new LinearLayout.LayoutParams(0, -2, 1));
        if (targets.contains(pkg)) addChip(row, "PROTECTED", OK);
        content.addView(row);
    }

    private void applyDetail(Switch dev, Switch mock, Switch isolate, Spinner sp) {
        String tpl = "";
        List<String> names = templateNames();
        if (sp != null && !names.isEmpty()) {
            int position = Math.max(0, sp.getSelectedItemPosition());
            if (position > 0 && position <= names.size()) tpl = names.get(position - 1);
        }
        List<String> feats = new ArrayList<>();
        if (dev.isChecked()) feats.add("devOff");
        if (mock.isChecked()) feats.add("mock");
        if (isolate.isChecked()) feats.add("isolate");
        String op = op();
        if (feats.isEmpty() && templatePackages(tpl).isEmpty()) {
            command(json("action", "delapp", "pkg", selectedPkg, "op", op));
            waitCommand(op, "", "Protection removed", true);
        } else {
            command(json("action", "setapp", "pkg", selectedPkg, "features", join(feats), "template", tpl, "op", op));
            waitCommand(op, tpl, "Applied: " + label(selectedPkg), false);
        }
    }

    private void saveTemplates() {
        if (!templates.containsKey(currentTemplate)) return;
        saveTemplate(currentTemplate, templatePackages(currentTemplate), "", "Saving and applying...");
    }

    private void saveTemplate(String name, List<String> packages, String deleteName, String message) {
        String op = op();
        List<String> savedPackages = packages == null ? new ArrayList<>() : uniquePkgs(packages);
        stagePendingTemplateSave(op, name, savedPackages, deleteName);
        JSONObject cmd = new JSONObject();
        try {
            cmd.put("action", "save");
            cmd.put("op", op);
            cmd.put("targets", join(targets));
            cmd.put("hardened", join(hardened));
            cmd.put("templateName", name == null ? "" : name);
            cmd.put("templatePackages", join(savedPackages));
            if (isTemplateName(deleteName)) cmd.put("templateDelete", deleteName);
            cmd.put("autoDevOff", status.optBoolean("autoDevOff", true) ? 1 : 0);
            cmd.put("hideMockLocation", status.optBoolean("hideMockLocation", true) ? 1 : 0);
            cmd.put("alwaysHidden", status.optBoolean("alwaysHidden", false) ? 1 : 0);
            cmd.put("susfs", status.optBoolean("susfsOn", true) ? 1 : 0);
            cmd.put("uiApk", status.optBoolean("uiApk", true) ? 1 : 0);
        } catch (Throwable ignored) {}
        command(cmd);
        waitApply(op, message);
    }

    private void waitApply(String token, String msg) {
        toast(msg);
        final int[] tries = {0};
        Runnable r = new Runnable() {
            public void run() {
                tries[0]++;
                readStatus();
                boolean done = token.equals(status.optString("applyToken", "")) && !status.optBoolean("applyBusy", false);
                if (done) {
                    boolean success = status.optInt("applyRc", 1) == 0;
                    readAll();
                    if (success && !pendingTemplateSaveReflected(token)) {
                        if (tries[0] == 120) toast("Saved. Waiting for state refresh");
                        handler.postDelayed(this, tries[0] < 120 ? 500 : 2000);
                        return;
                    }
                    clearPendingTemplateSave(token);
                    readAll();
                    if (success) {
                        toast(templateCloakNeeded() && !status.optBoolean("cloakReady", false)
                                ? "Saved. Package hiding unavailable: Zygisk hook inactive" : "Done");
                    } else toast("Apply failed");
                    render();
                } else if (tries[0] < 120) handler.postDelayed(this, 500);
                else toast("Queued - still applying");
            }
        };
        handler.postDelayed(r, 500);
    }

    private void stagePendingTemplateSave(String token, String name, List<String> packages, String deleteName) {
        pendingTemplateOp = token;
        pendingTemplateName = isTemplateName(name) ? name : "";
        pendingTemplatePackages = packages == null ? new ArrayList<>() : uniquePkgs(packages);
        pendingTemplateDelete = isTemplateName(deleteName) ? deleteName : "";
        pendingTemplateSave = isTemplateName(pendingTemplateName) || isTemplateName(pendingTemplateDelete);
    }

    private void applyPendingTemplateSave() {
        if (!pendingTemplateSave) return;
        if (isTemplateName(pendingTemplateDelete)) templates.remove(pendingTemplateDelete);
        if (isTemplateName(pendingTemplateName)) {
            templates.put(pendingTemplateName, new ArrayList<>(pendingTemplatePackages));
        }
    }

    private boolean pendingTemplateSaveReflected(String token) {
        if (!token.equals(pendingTemplateOp) || !pendingTemplateSave) return true;
        JSONObject remote = config.optJSONObject("hideTemplates");
        if (remote == null) return false;
        if (isTemplateName(pendingTemplateDelete) && remote.has(pendingTemplateDelete)) return false;
        if (!isTemplateName(pendingTemplateName)) return true;
        JSONArray packages = remote.optJSONArray(pendingTemplateName);
        if (packages == null) return false;
        List<String> remotePackages = new ArrayList<>();
        addArray(remotePackages, packages);
        return new LinkedHashSet<>(pendingTemplatePackages).equals(new LinkedHashSet<>(uniquePkgs(remotePackages)));
    }

    private void clearPendingTemplateSave(String token) {
        if (!token.equals(pendingTemplateOp)) return;
        pendingTemplateSave = false;
        pendingTemplateOp = "";
        pendingTemplateName = "";
        pendingTemplatePackages = new ArrayList<>();
        pendingTemplateDelete = "";
    }

    private void waitCommand(String token, String template, String success, boolean removing) {
        toast("Saving...");
        final int[] tries = {0};
        Runnable r = new Runnable() {
            public void run() {
                tries[0]++;
                readAll();
                boolean reported = token.equals(status.optString("commandToken", ""));
                boolean legacyApplied = !status.has("commandToken") && tries[0] >= 12
                        && legacyCommandApplied(template, removing);
                if (reported || legacyApplied) {
                    if (legacyApplied || status.optInt("commandRc", 1) == 0) {
                        toast(!templatePackages(template).isEmpty() && !status.optBoolean("cloakReady", false)
                                ? "Saved. Package hiding unavailable: Zygisk hook inactive" : success);
                        detailMode = false;
                        selectedPkg = null;
                        render();
                    } else toast("Save failed");
                } else if (tries[0] < 40) handler.postDelayed(this, 500);
                else toast("Queued - waiting for daemon");
            }
        };
        handler.postDelayed(r, 500);
    }

    private boolean legacyCommandApplied(String template, boolean removing) {
        if (removing) return !appConfig.containsKey(selectedPkg);
        JSONObject entry = appConfig.get(selectedPkg);
        return entry != null && (template.isEmpty() || template.equals(entry.optString("hideTemplate", "")));
    }

    private boolean templateCloakNeeded() {
        for (String pkg : targets) {
            JSONObject entry = appConfig.get(pkg);
            if (entry != null && !templatePackages(entry.optString("hideTemplate", "")).isEmpty()) return true;
        }
        return false;
    }

    private void createTemplate(String name) {
        name = name == null ? "" : name.trim();
        if (!isTemplateName(name)) { toast("Invalid template name"); return; }
        if (templates.containsKey(name)) { toast("Template already exists"); return; }
        templates.put(name, new ArrayList<>());
        currentTemplate = "";
        templateDetail = false;
        render();
        saveTemplate(name, Collections.emptyList(), "", "Creating template...");
    }

    private void editCurrentTemplate() {
        if (!isTemplateName(currentTemplate)) return;
        EditText name = edit("Template name", currentTemplate);
        name.selectAll();
        new AlertDialog.Builder(this)
                .setTitle("Edit template name")
                .setView(name)
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Save", (d, w) -> renameTemplate(name.getText().toString()))
                .show();
    }

    private void renameTemplate(String name) {
        String oldName = currentTemplate;
        name = name == null ? "" : name.trim();
        if (!isTemplateName(name)) { toast("Invalid template name"); return; }
        if (name.equals(oldName)) return;
        if (templates.containsKey(name)) { toast("Template already exists"); return; }
        List<String> packages = templatePackages(oldName);
        templates.remove(oldName);
        templates.put(name, packages);
        currentTemplate = name;
        render();
        saveTemplate(name, packages, oldName, "Renaming template...");
    }

    private void confirmDeleteTemplate() {
        String name = currentTemplate;
        if (!isTemplateName(name)) return;
        new AlertDialog.Builder(this)
                .setTitle("Delete template?")
                .setMessage(name + " will be removed. Apps using it keep protection but no hidden-app template.")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Delete", (d, w) -> deleteTemplate(name))
                .show();
    }

    private void deleteTemplate(String name) {
        if (!templates.containsKey(name)) return;
        templates.remove(name);
        currentTemplate = "";
        templateDetail = false;
        render();
        saveTemplate("", Collections.emptyList(), name, "Deleting template...");
    }

    private void addTemplateChips() {
        HorizontalScrollView hsv = new HorizontalScrollView(this);
        hsv.setHorizontalScrollBarEnabled(false);
        LinearLayout chips = new LinearLayout(this);
        chips.setOrientation(LinearLayout.HORIZONTAL);
        chips.setPadding(dp(16), dp(4), dp(16), dp(8));
        for (String name : templateNames()) {
            Button b = button(name + "  " + templatePackages(name).size(), false);
            b.setTextColor(name.equals(currentTemplate) ? OK : FG);
            b.setOnClickListener(v -> { currentTemplate = name; render(); });
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, dp(40));
            lp.setMargins(0, 0, dp(8), 0);
            chips.addView(b, lp);
        }
        hsv.addView(chips);
        content.addView(hsv);
    }

    private void populateHiddenRows() {
        if (hiddenRows == null) return;
        hiddenRows.removeAllViews();
        Set<String> out = new LinkedHashSet<>();
        out.addAll(templatePackages(currentTemplate));
        out.addAll(rootVisible);
        out.addAll(rootSuggested);
        for (AppEntry a : apps) out.add(a.pkg);
        String q = hiddenSearch.trim().toLowerCase();
        List<String> filtered = new ArrayList<>();
        for (String pkg : out) {
            if (!isPackageName(pkg)) continue;
            if (!matchesHiddenFilter(pkg, hiddenFilter)) continue;
            if (!q.isEmpty() && !(pkg + " " + label(pkg)).toLowerCase().contains(q)) continue;
            filtered.add(pkg);
        }
        Collections.sort(filtered, this::comparePackages);
        for (String pkg : filtered) addHiddenAppRow(pkg);
        if (filtered.isEmpty()) addMuted(hiddenRows, "No app matches this search.");
    }

    private void addHiddenAppRow(String pkg) {
        LinearLayout row = rowBase(true);
        row.setOnClickListener(v -> toggleHidden(pkg));
        CheckBox cb = new CheckBox(this);
        cb.setChecked(templatePackages(currentTemplate).contains(pkg));
        cb.setOnClickListener(v -> toggleHidden(pkg));
        row.addView(cb, new LinearLayout.LayoutParams(dp(48), dp(48)));
        LinearLayout.LayoutParams iconLp = new LinearLayout.LayoutParams(dp(40), dp(40));
        iconLp.setMargins(0, 0, dp(12), 0);
        row.addView(icon(pkg, 40), iconLp);
        LinearLayout texts = new LinearLayout(this);
        texts.setOrientation(LinearLayout.VERTICAL);
        TextView name = tv(15, FG, Typeface.NORMAL);
        name.setText(label(pkg));
        name.setSingleLine(true);
        name.setEllipsize(android.text.TextUtils.TruncateAt.END);
        TextView pack = tv(11, MUTED, Typeface.NORMAL);
        pack.setText(pkg);
        pack.setSingleLine(true);
        pack.setEllipsize(android.text.TextUtils.TruncateAt.END);
        texts.addView(name);
        texts.addView(pack);
        row.addView(texts, new LinearLayout.LayoutParams(0, -2, 1));
        if (isSystemPackage(pkg)) addChip(row, "SYSTEM", MUTED);
        hiddenRows.addView(row);
        addDivider(hiddenRows);
    }

    private void toggleHidden(String pkg) {
        List<String> list = new ArrayList<>(templatePackages(currentTemplate));
        if (list.contains(pkg)) list.remove(pkg); else list.add(pkg);
        templates.put(currentTemplate, uniquePkgs(list));
        populateHiddenRows();
    }

    private void addAppRow(AppEntry app, LinearLayout parent) {
        LinearLayout row = rowBase(true);
        row.setOnClickListener(v -> {
            selectedPkg = app.pkg;
            detailMode = true;
            render();
        });
        LinearLayout.LayoutParams iconLp = new LinearLayout.LayoutParams(dp(40), dp(40));
        iconLp.setMargins(0, 0, dp(12), 0);
        row.addView(icon(app.pkg, 40), iconLp);
        LinearLayout texts = new LinearLayout(this);
        texts.setOrientation(LinearLayout.VERTICAL);
        TextView n = tv(15, FG, Typeface.NORMAL); n.setText(label(app.pkg));
        n.setSingleLine(true);
        n.setEllipsize(android.text.TextUtils.TruncateAt.END);
        TextView p = tv(11, MUTED, Typeface.NORMAL); p.setText(app.pkg);
        p.setSingleLine(true);
        p.setEllipsize(android.text.TextUtils.TruncateAt.END);
        texts.addView(n); texts.addView(p);
        row.addView(texts, new LinearLayout.LayoutParams(0, -2, 1));
        if (app.prot || targets.contains(app.pkg)) addChip(row, "PROTECTED", OK);
        else if (hiddenInAnyTemplate(app.pkg)) addChip(row, "HIDDEN", WARN);
        if (app.system) addChip(row, "SYSTEM", MUTED);
        TextView arrow = tv(24, MUTED, Typeface.NORMAL); arrow.setText(">");
        row.addView(arrow);
        parent.addView(row);
        addDivider(parent);
    }

    private Switch switchRow(String name, String desc, boolean checked) {
        LinearLayout row = rowBase(false);
        LinearLayout texts = new LinearLayout(this);
        texts.setOrientation(LinearLayout.VERTICAL);
        TextView n = tv(15, FG, Typeface.NORMAL); n.setText(name);
        TextView d = tv(11, MUTED, Typeface.NORMAL); d.setText(desc);
        texts.addView(n); texts.addView(d);
        Switch sw = new Switch(this); sw.setChecked(checked);
        row.addView(texts, new LinearLayout.LayoutParams(0, -2, 1));
        row.addView(sw);
        content.addView(row);
        addDivider();
        return sw;
    }

    private void addValueRow(String name, String value, Integer color) {
        LinearLayout row = rowBase(false);
        TextView n = tv(15, FG, Typeface.NORMAL); n.setText(name);
        TextView v = tv(13, color == null ? MUTED : color, Typeface.NORMAL); v.setText(value);
        v.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        row.addView(n, new LinearLayout.LayoutParams(0, -2, 1));
        row.addView(v);
        content.addView(row);
        addDivider();
    }

    private void addAppFilterRow(boolean appsTab) {
        LinearLayout row = rowBase(false);
        int selected = appsTab ? appFilter : hiddenFilter;
        CheckBox all = filterBox("All apps", selected == FILTER_ALL);
        CheckBox user = filterBox("User apps", selected == FILTER_USER);
        CheckBox system = filterBox("System apps", selected == FILTER_SYSTEM);
        all.setOnClickListener(v -> selectFilter(appsTab, FILTER_ALL, all, user, system));
        user.setOnClickListener(v -> selectFilter(appsTab, FILTER_USER, all, user, system));
        system.setOnClickListener(v -> selectFilter(appsTab, FILTER_SYSTEM, all, user, system));
        row.addView(all, new LinearLayout.LayoutParams(0, dp(52), 1));
        row.addView(user, new LinearLayout.LayoutParams(0, dp(52), 1));
        row.addView(system, new LinearLayout.LayoutParams(0, dp(52), 1));
        content.addView(row);
        addDivider();
    }

    private CheckBox filterBox(String text, boolean checked) {
        CheckBox box = new CheckBox(this);
        box.setText(text);
        box.setTextColor(FG);
        box.setTextSize(13);
        box.setGravity(Gravity.CENTER_VERTICAL);
        box.setMinHeight(dp(48));
        box.setChecked(checked);
        return box;
    }

    private void selectFilter(boolean appsTab, int selected, CheckBox all, CheckBox user, CheckBox system) {
        all.setChecked(selected == FILTER_ALL);
        user.setChecked(selected == FILTER_USER);
        system.setChecked(selected == FILTER_SYSTEM);
        if (appsTab) {
            appFilter = selected;
            populateAppRows();
        } else {
            hiddenFilter = selected;
            populateHiddenRows();
        }
    }

    private void addGroupTitle(String s) {
        TextView v = tv(13, MUTED, Typeface.BOLD);
        v.setText(s.toUpperCase());
        v.setPadding(dp(20), dp(14), dp(20), dp(6));
        content.addView(v);
    }

    private void addSectionHeader(String name, String summary) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(20), dp(12), dp(20), dp(6));
        TextView n = tv(13, MUTED, Typeface.BOLD);
        n.setText(name.toUpperCase());
        TextView s = tv(12, MUTED, Typeface.NORMAL);
        s.setText(summary);
        s.setSingleLine(true);
        s.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        row.addView(n, new LinearLayout.LayoutParams(0, -2, 1));
        row.addView(s);
        content.addView(row);
    }

    private void addMuted(String s) { addMuted(content, s); }

    private void addMuted(LinearLayout parent, String s) { parent.addView(wrap(muted(s), 24, 8, 24, 12)); }

    private TextView muted(String s) { TextView v = tv(13, MUTED, Typeface.NORMAL); v.setText(s); return v; }

    private LinearLayout rowBase(boolean clickable) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(20), dp(7), dp(20), dp(7));
        row.setMinimumHeight(dp(56));
        if (clickable) row.setBackgroundColor(BG);
        return row;
    }

    private View wrap(View child, int l, int t, int r, int b) {
        FrameLayout frame = new FrameLayout(this);
        frame.setPadding(dp(l), dp(t), dp(r), dp(b));
        frame.addView(child, new FrameLayout.LayoutParams(-1, -2));
        return frame;
    }

    private void addDivider() {
        addDivider(content);
    }

    private void addDivider(LinearLayout parent) {
        View d = new View(this);
        d.setBackgroundColor(LINE);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, 1);
        lp.setMargins(dp(24), 0, dp(24), 0);
        parent.addView(d, lp);
    }

    private TextView tv(int sp, int color, int style) {
        TextView v = new TextView(this);
        v.setTextColor(color);
        v.setTextSize(sp);
        v.setTypeface(Typeface.DEFAULT, style);
        return v;
    }

    private Button button(String text, boolean primary) {
        Button b = new Button(this);
        b.setText(text);
        b.setAllCaps(false);
        b.setTextColor(primary ? Color.rgb(6, 18, 31) : FG);
        b.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        b.setBackground(primary ? round(ACCENT, ACCENT, 12) : round(SURFACE, 0, 12));
        return b;
    }

    private EditText edit(String hint, String value) {
        EditText e = new EditText(this);
        e.setSingleLine(true);
        e.setHint(hint);
        e.setText(value == null ? "" : value);
        e.setTextColor(FG);
        e.setHintTextColor(MUTED);
        e.setTextSize(15);
        e.setMinHeight(dp(52));
        e.setPadding(dp(16), 0, dp(16), 0);
        e.setBackground(round(SURFACE, 0, 12));
        return e;
    }

    private Spinner spinner(List<String> values, int selected) {
        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, values);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner s = new Spinner(this);
        s.setAdapter(a);
        if (selected >= 0 && selected < values.size()) s.setSelection(selected, false);
        s.setBackground(round(SURFACE, 0, 12));
        s.setPadding(dp(12), 0, dp(12), 0);
        return s;
    }

    private TextView chip(String text, int color) {
        TextView c = tv(11, color, Typeface.BOLD);
        c.setText(text);
        c.setGravity(Gravity.CENTER);
        c.setPadding(dp(8), dp(3), dp(8), dp(3));
        c.setBackground(round(Color.TRANSPARENT, color, 10));
        return c;
    }

    private void addChip(LinearLayout row, String text, int color) {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
        lp.setMargins(dp(8), 0, dp(8), 0);
        row.addView(chip(text, color), lp);
    }

    private ImageView icon(String pkg, int size) {
        ImageView v = new ImageView(this);
        try { v.setImageDrawable(getPackageManager().getApplicationIcon(pkg)); }
        catch (Throwable t) { v.setBackground(round(SURFACE, 0, size / 2)); }
        v.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return v;
    }

    private GradientDrawable round(int fill, int stroke, int radiusDp) {
        GradientDrawable g = new GradientDrawable();
        g.setShape(GradientDrawable.RECTANGLE);
        g.setCornerRadius(dp(radiusDp));
        g.setColor(fill);
        if (stroke != 0) g.setStroke(1, stroke);
        return g;
    }

    private int dp(int v) { return (int) (v * getResources().getDisplayMetrics().density + 0.5f); }

    private int statusBarHeight() {
        int id = getResources().getIdentifier("status_bar_height", "dimen", "android");
        return id > 0 ? getResources().getDimensionPixelSize(id) : 0;
    }

    private int navigationBarHeight() {
        int id = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        return id > 0 ? getResources().getDimensionPixelSize(id) : 0;
    }

    private String label(String pkg) {
        String l = labels.get(pkg);
        if (l != null && !l.isEmpty()) return l;
        try {
            CharSequence cs = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(pkg, 0));
            if (cs != null) return cs.toString();
        } catch (Throwable ignored) {}
        String[] parts = pkg == null ? new String[0] : pkg.split("\\.");
        return parts.length == 0 ? String.valueOf(pkg) : parts[parts.length - 1];
    }

    private void command(JSONObject obj) { try { bridge.command(obj.toString()); } catch (Throwable ignored) {} }

    private JSONObject json(String... kv) {
        JSONObject o = new JSONObject();
        try { for (int i = 0; i + 1 < kv.length; i += 2) o.put(kv[i], kv[i + 1]); }
        catch (Throwable ignored) {}
        return o;
    }

    private String op() { return "native-" + System.currentTimeMillis(); }

    private void showLog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCanceledOnTouchOutside(true);

        LinearLayout shell = new LinearLayout(this);
        shell.setOrientation(LinearLayout.VERTICAL);
        shell.setBackground(round(SURFACE, LINE, 12));

        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(dp(20), dp(16), dp(8), dp(12));
        LinearLayout titles = new LinearLayout(this);
        titles.setOrientation(LinearLayout.VERTICAL);
        TextView heading = tv(20, FG, Typeface.BOLD);
        heading.setText("Activity log");
        final TextView summary = tv(12, MUTED, Typeface.NORMAL);
        titles.addView(heading);
        titles.addView(summary);
        header.addView(titles, new LinearLayout.LayoutParams(0, -2, 1));

        ImageButton refresh = new ImageButton(this);
        refresh.setImageResource(android.R.drawable.ic_popup_sync);
        refresh.setColorFilter(FG);
        refresh.setBackgroundColor(Color.TRANSPARENT);
        refresh.setContentDescription("Refresh log");
        header.addView(refresh, new LinearLayout.LayoutParams(dp(48), dp(48)));
        shell.addView(header);
        addDivider(shell);

        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        final LinearLayout rows = new LinearLayout(this);
        rows.setOrientation(LinearLayout.VERTICAL);
        scroll.addView(rows, new ScrollView.LayoutParams(-1, -2));
        shell.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));

        LinearLayout footer = new LinearLayout(this);
        footer.setPadding(dp(16), dp(8), dp(16), dp(16));
        Button close = button("Close", false);
        close.setOnClickListener(v -> dialog.dismiss());
        footer.addView(close, new LinearLayout.LayoutParams(-1, dp(48)));
        shell.addView(footer);

        Runnable refreshRows = () -> {
            readAll();
            String log = status.optString("log", "");
            summary.setText(logLineCount(log) + " entries, newest first");
            populateLogRows(rows, log);
            scroll.post(() -> scroll.scrollTo(0, 0));
        };
        refresh.setOnClickListener(v -> refreshRows.run());
        refreshRows.run();

        dialog.setContentView(shell);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            window.setDimAmount(0.72f);
            window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.92f);
            int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.78f);
            window.setLayout(width, height);
            window.setGravity(Gravity.CENTER);
        }
    }

    private void populateLogRows(LinearLayout rows, String log) {
        rows.removeAllViews();
        int count = 0;
        String[] lines = logLines(log);
        for (int i = lines.length - 1; i >= 0; i--) {
            String line = lines[i];
            if (line.trim().isEmpty()) continue;
            addLogRow(rows, line.trim());
            count++;
        }
        if (count == 0) addMuted(rows, "No log entries yet.");
    }

    private void addLogRow(LinearLayout parent, String line) {
        String timestamp = "";
        String message = line;
        if (message.matches("^\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}.*")) {
            timestamp = message.substring(0, 14);
            message = message.substring(14).trim();
        }
        String source = "";
        if (message.startsWith("[")) {
            int end = message.indexOf(']');
            if (end > 1 && end < 32) {
                source = message.substring(1, end);
                message = message.substring(end + 1).trim();
            }
        }

        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.VERTICAL);
        row.setPadding(dp(20), dp(10), dp(20), dp(10));
        LinearLayout meta = new LinearLayout(this);
        meta.setGravity(Gravity.CENTER_VERTICAL);
        TextView time = tv(11, timestamp.isEmpty() ? MUTED : ACCENT, Typeface.BOLD);
        time.setText(timestamp.isEmpty() ? "OUTPUT" : timestamp);
        meta.addView(time, new LinearLayout.LayoutParams(0, -2, 1));
        if (!source.isEmpty()) addChip(meta, source.toUpperCase(), ACCENT);
        row.addView(meta);

        TextView text = tv(13, logMessageColor(message), Typeface.NORMAL);
        text.setTypeface(Typeface.MONOSPACE);
        text.setLineSpacing(dp(2), 1f);
        text.setText(message.isEmpty() ? "-" : message);
        row.addView(text, new LinearLayout.LayoutParams(-1, -2));
        parent.addView(row);
        addDivider(parent);
    }

    private int logLineCount(String log) {
        if (log == null || log.trim().isEmpty()) return 0;
        int count = 0;
        for (String line : logLines(log)) {
            if (!line.trim().isEmpty()) count++;
        }
        return count;
    }

    private String[] logLines(String log) {
        String text = log == null ? "" : log.replace("\r\n", "\n");
        if (text.indexOf('\n') >= 0) return text.split("\n");
        return text.split("(?=\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2} )");
    }

    private int logMessageColor(String message) {
        String lower = message.toLowerCase();
        if (lower.contains("fail") || lower.contains("error")) return DANGER;
        if (lower.contains("skipped") || lower.contains("inactive")) return WARN;
        return FG;
    }

    private void confirmRestore() {
        new AlertDialog.Builder(this).setTitle("Restore everything?")
                .setMessage("Hidden packages are restored, flags return to original values, and active protection stops.")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Restore", (d, w) -> {
                    command(json("action", "restore"));
                    toast("Restore queued");
                    handler.postDelayed(() -> { readAll(); render(); }, 2000);
                }).show();
    }

    private void toast(String s) { Toast.makeText(this, s, Toast.LENGTH_SHORT).show(); }

    private int protectedCount() {
        int n = 0;
        for (AppEntry app : apps) if (app.prot || targets.contains(app.pkg)) n++;
        return n;
    }

    private int visibleAppCount(int filter) {
        int n = 0;
        for (AppEntry app : apps) if (matchesAppFilter(app, filter)) n++;
        return n;
    }

    private boolean matchesAppFilter(AppEntry app, int filter) {
        if (filter == FILTER_ALL) return true;
        return filter == FILTER_SYSTEM ? app.system : !app.system;
    }

    private boolean matchesHiddenFilter(String pkg, int filter) {
        if (filter == FILTER_ALL) return true;
        boolean system = isSystemPackage(pkg);
        return filter == FILTER_SYSTEM ? system : !system;
    }

    private int compareApps(AppEntry a, AppEntry b) {
        boolean aActive = a.prot || targets.contains(a.pkg);
        boolean bActive = b.prot || targets.contains(b.pkg);
        if (aActive != bActive) return aActive ? -1 : 1;
        int byName = label(a.pkg).compareToIgnoreCase(label(b.pkg));
        return byName != 0 ? byName : a.pkg.compareToIgnoreCase(b.pkg);
    }

    private int comparePackages(String a, String b) {
        boolean aActive = templatePackages(currentTemplate).contains(a);
        boolean bActive = templatePackages(currentTemplate).contains(b);
        if (aActive != bActive) return aActive ? -1 : 1;
        int byName = label(a).compareToIgnoreCase(label(b));
        return byName != 0 ? byName : a.compareToIgnoreCase(b);
    }

    private List<String> templateNames() {
        ArrayList<String> names = new ArrayList<>(templates.keySet());
        Collections.sort(names, String::compareToIgnoreCase);
        return names;
    }

    private List<String> templateLabels() {
        ArrayList<String> out = new ArrayList<>();
        for (String n : templateNames()) out.add(n + " (" + templatePackages(n).size() + ")");
        return out;
    }

    private int templateIndex(String name) { int idx = templateNames().indexOf(name); return idx < 0 ? 0 : idx; }

    private List<String> templatePackages(String name) {
        List<String> list = templates.get(name);
        return list == null ? new ArrayList<>() : new ArrayList<>(list);
    }

    private boolean hiddenInAnyTemplate(String pkg) {
        for (List<String> list : templates.values()) if (list.contains(pkg)) return true;
        return false;
    }

    private boolean isSystemPackage(String pkg) {
        try {
            android.content.pm.ApplicationInfo ai = getPackageManager().getApplicationInfo(pkg, 0);
            return (ai.flags & (android.content.pm.ApplicationInfo.FLAG_SYSTEM
                    | android.content.pm.ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)) != 0;
        } catch (Throwable ignored) {
            return false;
        }
    }

    private List<String> uniquePkgs(List<String> in) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String p : in) if (isPackageName(p)) set.add(p);
        return new ArrayList<>(set);
    }

    private void addArray(List<String> out, JSONArray arr) {
        if (arr == null) return;
        for (int i = 0; i < arr.length(); i++) {
            String s = arr.optString(i);
            if (isPackageName(s)) out.add(s);
        }
    }

    private void splitPackages(List<String> out, String csv) {
        if (csv == null) return;
        for (String p : csv.split(",")) if (isPackageName(p.trim())) out.add(p.trim());
    }

    private String join(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            if (sb.length() > 0) sb.append(',');
            sb.append(s);
        }
        return sb.toString();
    }

    private static boolean isPackageName(String s) {
        return s != null && s.matches("[A-Za-z0-9_]+(\\.[A-Za-z0-9_]+)+");
    }

    private static boolean isTemplateName(String s) {
        return s != null && !"default".equalsIgnoreCase(s)
                && s.matches("[A-Za-z0-9_.-]{1,48}");
    }

    private abstract static class SimpleWatcher implements TextWatcher {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        public void onTextChanged(CharSequence s, int start, int before, int count) {}
    }
}
