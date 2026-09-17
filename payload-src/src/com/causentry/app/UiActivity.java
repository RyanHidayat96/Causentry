package com.causentry.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
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
    private boolean detailMode;
    private String selectedPkg;
    private String currentTemplate = "default";
    private String appSearch = "";
    private String hiddenSearch = "";
    private int homeTab = TAB_APPS;
    private boolean showSystemApps;
    private boolean showSystemHiddenApps;
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
        try { status = new JSONObject(bridge.status()); } catch (Throwable t) { status = new JSONObject(); }
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
        List<String> deny = new ArrayList<>();
        addArray(deny, status.optJSONArray("denylist"));
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
        if (!templates.containsKey("default")) templates.put("default", uniquePkgs(deny));
        if (!templates.containsKey(currentTemplate)) currentTemplate = "default";
        splitPackages(rootVisible, status.optString("rootApps", ""));
        splitPackages(rootSuggested, status.optString("rootSuggest", ""));
    }

    private void readApps() {
        apps.clear();
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
                apps.add(e);
            }
        } catch (Throwable ignored) {}
        if (apps.isEmpty()) {
            try {
                List<android.content.pm.ApplicationInfo> installed = getPackageManager().getInstalledApplications(0);
                for (android.content.pm.ApplicationInfo ai : installed) {
                    if (ai == null || !isPackageName(ai.packageName)) continue;
                    if ((ai.flags & android.content.pm.ApplicationInfo.FLAG_SYSTEM) != 0) continue;
                    AppEntry e = new AppEntry();
                    e.pkg = ai.packageName;
                    e.prot = targets.contains(e.pkg);
                    e.hardened = hardened.contains(e.pkg);
                    e.hidden = hiddenInAnyTemplate(e.pkg);
                    apps.add(e);
                }
            } catch (Throwable ignored) {}
        }
        Collections.sort(apps, (a, b) -> {
            int ar = (a.prot || targets.contains(a.pkg)) ? 0 : 1;
            int br = (b.prot || targets.contains(b.pkg)) ? 0 : 1;
            if (ar != br) return ar - br;
            return label(a.pkg).compareToIgnoreCase(label(b.pkg));
        });
    }

    private void render() {
        rendering = true;
        content.removeAllViews();
        updateToolbar();
        if (detailMode && isPackageName(selectedPkg)) renderDetail();
        else renderHome();
        rendering = false;
    }

    private void updateToolbar() {
        boolean daemon = status.optBoolean("daemon", false);
        String state = status.optString("state", "idle");
        back.setVisibility(detailMode ? View.VISIBLE : View.GONE);
        title.setText(detailMode ? label(selectedPkg) : "Causentry");
        subtitle.setText(detailMode ? selectedPkg : "");
        pill.setText(!daemon ? "STOPPED" : ("active".equals(state) ? "ACTIVE" : "STANDBY"));
        int c = !daemon ? DANGER : ("active".equals(state) ? OK : WARN);
        pill.setTextColor(c);
        pill.setBackground(round(Color.TRANSPARENT, c, 18));
        boolean showBottom = detailMode || (!detailMode && homeTab == TAB_TEMPLATES);
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
        tabs.setPadding(dp(16), dp(2), dp(16), dp(6));
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(0, dp(42), 1);
        lp1.setMargins(0, 0, dp(8), 0);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(0, dp(42), 1);
        lp2.setMargins(0, 0, dp(8), 0);
        tabs.addView(tabButton("Apps", TAB_APPS), lp1);
        tabs.addView(tabButton("Templates", TAB_TEMPLATES), lp2);
        tabs.addView(tabButton("Actions", TAB_ACTIONS), new LinearLayout.LayoutParams(0, dp(42), 1));
        content.addView(tabs);
    }

    private Button tabButton(String text, int tab) {
        Button b = button(text, homeTab == tab);
        b.setTextColor(homeTab == tab ? Color.rgb(6, 18, 31) : FG);
        b.setOnClickListener(v -> {
            if (homeTab != tab) {
                homeTab = tab;
                focusAppSearch = false;
                focusHiddenSearch = false;
                render();
            }
        });
        return b;
    }

    private void addAppsGroup() {
        addSectionHeader("Apps", protectedCount() + " protected / " + apps.size() + " apps");
        EditText search = edit("Search app name or package", appSearch);
        search.addTextChangedListener(new SimpleWatcher() {
            public void afterTextChanged(Editable s) {
                if (!rendering) {
                    appSearch = s.toString();
                    focusAppSearch = true;
                    focusHiddenSearch = false;
                    render();
                }
            }
        });
        content.addView(wrap(search, 16, 0, 16, 10));
        if (focusAppSearch) {
            search.requestFocus();
            search.setSelection(search.getText().length());
        }
        String q = appSearch.trim().toLowerCase();
        int shown = 0;
        for (AppEntry app : apps) {
            if (!q.isEmpty() && !(app.pkg + " " + label(app.pkg)).toLowerCase().contains(q)) continue;
            addAppRow(app);
            if (++shown >= 70) break;
        }
        if (shown == 0) addMuted("No app matches this search.");
    }

    private void addTemplateGroup() {
        addSectionHeader("Templates", currentTemplate + " / " + templatePackages(currentTemplate).size() + " hidden");
        Spinner spinner = spinner(templateLabels(), templateIndex(currentTemplate));
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                List<String> names = templateNames();
                if (position >= 0 && position < names.size() && !names.get(position).equals(currentTemplate)) {
                    currentTemplate = names.get(position);
                    render();
                }
            }
            public void onNothingSelected(android.widget.AdapterView<?> parent) {}
        });
        content.addView(wrap(spinner, 16, 0, 16, 6));
        if (templateNames().size() > 1) addTemplateChips();
        addTemplateCreateRow();
        addHiddenSearch();
        addHiddenRows();
        addManualHiddenRow();
        bottomApply.setText("Save hidden apps");
        bottomApply.setOnClickListener(v -> saveTemplates());
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
                    focusHiddenSearch = true;
                    focusAppSearch = false;
                    render();
                }
            }
        });
        content.addView(wrap(search, 16, 4, 16, 8));
        if (focusHiddenSearch) {
            search.requestFocus();
            search.setSelection(search.getText().length());
        }
    }

    private void addManualHiddenRow() {
        LinearLayout manual = rowBase(false);
        EditText pkg = edit("Manual package name", "");
        Button addPkg = button("Add", false);
        addPkg.setOnClickListener(v -> {
            if (isPackageName(pkg.getText().toString())) {
                toggleHidden(pkg.getText().toString());
                pkg.setText("");
            } else toast("Invalid package name");
        });
        LinearLayout.LayoutParams pkgLp = new LinearLayout.LayoutParams(0, dp(48), 1);
        pkgLp.setMargins(0, 0, dp(8), 0);
        manual.addView(pkg, pkgLp);
        manual.addView(addPkg, new LinearLayout.LayoutParams(dp(88), dp(48)));
        content.addView(manual);
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
        Switch mock = switchRow("Hide mock location / fake GPS", "mock_location=0 and template packages hidden while it runs",
                cfg != null ? cfg.optBoolean("mock", false) : (targets.contains(selectedPkg) && status.optBoolean("hideMockLocation", true)));
        Switch isolate = switchRow("Block app-zygote self-checks", "Stops privileged per-app zygote checks",
                cfg != null ? cfg.optBoolean("isolate", false) : (targets.contains(selectedPkg) && hardened.contains(selectedPkg)));
        String tpl = cfg != null && isTemplateName(cfg.optString("hideTemplate")) ? cfg.optString("hideTemplate") : "default";
        addGroupTitle("Hidden-app template");
        Spinner sp = spinner(templateLabels(), templateIndex(tpl));
        content.addView(wrap(sp, 16, 0, 16, 8));
        TextView count = muted(tpl + ": " + templatePackages(tpl).size() + " hidden");
        content.addView(wrap(count, 24, 0, 24, 12));
        sp.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {
            public void onItemSelected(android.widget.AdapterView<?> parent, View view, int position, long id) {
                List<String> names = templateNames();
                if (position >= 0 && position < names.size()) {
                    String name = names.get(position);
                    count.setText(name + ": " + templatePackages(name).size() + " hidden");
                }
            }
            public void onNothingSelected(android.widget.AdapterView<?> parent) {}
        });
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
        String tpl = templateNames().get(Math.max(0, sp.getSelectedItemPosition()));
        List<String> feats = new ArrayList<>();
        if (dev.isChecked()) feats.add("devOff");
        if (mock.isChecked()) feats.add("mock");
        if (isolate.isChecked()) feats.add("isolate");
        if (feats.isEmpty() && templatePackages(tpl).isEmpty()) {
            command(json("action", "delapp", "pkg", selectedPkg));
            toast("Protection removed");
        } else {
            command(json("action", "setapp", "pkg", selectedPkg, "features", join(feats), "template", tpl));
            toast("Applied: " + label(selectedPkg));
        }
        handler.postDelayed(() -> { readAll(); detailMode = false; selectedPkg = null; render(); }, 1200);
    }

    private void saveTemplates() {
        String op = op();
        JSONObject cmd = new JSONObject();
        try {
            cmd.put("action", "save");
            cmd.put("op", op);
            cmd.put("targets", join(targets));
            cmd.put("denylist", join(templatePackages("default")));
            cmd.put("hardened", join(hardened));
            cmd.put("templateName", currentTemplate);
            cmd.put("templatePackages", join(templatePackages(currentTemplate)));
            cmd.put("autoDevOff", 1);
            cmd.put("hideMockLocation", 1);
            cmd.put("alwaysHidden", status.optBoolean("alwaysHidden", false) ? 1 : 0);
            cmd.put("susfs", status.optBoolean("susfsOn", true) ? 1 : 0);
            cmd.put("uiApk", status.optBoolean("uiApk", true) ? 1 : 0);
        } catch (Throwable ignored) {}
        command(cmd);
        waitApply(op, "Saving and applying...");
    }

    private void waitApply(String token, String msg) {
        toast(msg);
        final int[] tries = {0};
        Runnable r = new Runnable() {
            public void run() {
                tries[0]++;
                readAll();
                boolean done = token.equals(status.optString("applyToken", "")) && !status.optBoolean("applyBusy", false);
                if (done) {
                    toast(status.optInt("applyRc", 1) == 0 ? "Done" : "Apply failed");
                    render();
                } else if (tries[0] < 120) handler.postDelayed(this, 500);
                else toast("Queued - still applying");
            }
        };
        handler.postDelayed(r, 500);
    }

    private void createTemplate(String name) {
        name = name == null ? "" : name.trim();
        if (!isTemplateName(name)) { toast("Invalid template name"); return; }
        if (!templates.containsKey(name)) templates.put(name, new ArrayList<>());
        currentTemplate = name;
        render();
        toast("Template ready");
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

    private void addHiddenRows() {
        Set<String> out = new LinkedHashSet<>();
        out.addAll(templatePackages(currentTemplate));
        out.addAll(rootVisible);
        out.addAll(rootSuggested);
        for (AppEntry a : apps) out.add(a.pkg);
        String q = hiddenSearch.trim().toLowerCase();
        int shown = 0;
        for (String pkg : out) {
            if (!isPackageName(pkg)) continue;
            if (!q.isEmpty() && !(pkg + " " + label(pkg)).toLowerCase().contains(q)) continue;
            CheckBox cb = new CheckBox(this);
            cb.setText(label(pkg) + "\n" + pkg);
            cb.setTextColor(FG);
            cb.setTextSize(15);
            cb.setChecked(templatePackages(currentTemplate).contains(pkg));
            cb.setPadding(dp(24), dp(8), dp(24), dp(8));
            cb.setOnClickListener(v -> toggleHidden(pkg));
            content.addView(cb, new LinearLayout.LayoutParams(-1, dp(64)));
            addDivider();
            if (++shown >= 80) break;
        }
    }

    private void toggleHidden(String pkg) {
        List<String> list = new ArrayList<>(templatePackages(currentTemplate));
        if (list.contains(pkg)) list.remove(pkg); else list.add(pkg);
        templates.put(currentTemplate, uniquePkgs(list));
        render();
    }

    private void addAppRow(AppEntry app) {
        LinearLayout row = rowBase(true);
        row.setOnClickListener(v -> {
            focusAppSearch = false;
            focusHiddenSearch = false;
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
        TextView arrow = tv(24, MUTED, Typeface.NORMAL); arrow.setText(">");
        row.addView(arrow);
        content.addView(row);
        addDivider();
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

    private void addMuted(String s) { content.addView(wrap(muted(s), 24, 8, 24, 12)); }

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
        View d = new View(this);
        d.setBackgroundColor(LINE);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, 1);
        lp.setMargins(dp(24), 0, dp(24), 0);
        content.addView(d, lp);
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
        new AlertDialog.Builder(this).setTitle("Causentry log")
                .setMessage(status.optString("log", "No log yet"))
                .setPositiveButton("OK", null).show();
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

    private List<String> templateNames() {
        ArrayList<String> names = new ArrayList<>(templates.keySet());
        Collections.sort(names, (a, b) -> {
            if ("default".equals(a)) return -1;
            if ("default".equals(b)) return 1;
            return a.compareToIgnoreCase(b);
        });
        if (names.isEmpty()) names.add("default");
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
        return s != null && s.matches("[A-Za-z0-9_.-]{1,48}");
    }

    private abstract static class SimpleWatcher implements TextWatcher {
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
        public void onTextChanged(CharSequence s, int start, int before, int count) {}
    }
}
