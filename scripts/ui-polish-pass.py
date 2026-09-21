#!/usr/bin/env python3
"""Re-apply the UI polish pass to Causentry's native UiActivity (no AI/God-mode code).

One gutter, one vertical rhythm, working tab scroll reset, and deep-link automation hooks.
Idempotent: prints which substitutions no longer match instead of corrupting the file.
"""
import io
import sys

P = "payload-src/src/com/causentry/app/UiActivity.java"

SUBS = [
    # ---- layout tokens + shell references ------------------------------------------------
    ("""    private final Handler handler = new Handler(Looper.getMainLooper());
    private UiBridge bridge;
    private LinearLayout content;
    private LinearLayout appRows;""",
     """    // ---- layout tokens: ONE gutter and ONE vertical rhythm for the whole app ----
    private static final int GUTTER = 20;        // page gutter, dp - everything aligns to this
    private static final int SECTION_TOP = 18;   // space above a section label
    private static final int SECTION_BOTTOM = 8; // space below a section label
    private static final int ROW_MIN = 56;       // min height of a list row

    private final Handler handler = new Handler(Looper.getMainLooper());
    private UiBridge bridge;
    private LinearLayout content;
    private ScrollView shellScroll;
    private LinearLayout titles;
    private LinearLayout appRows;"""),

    # ---- app bar: keep the title on the page gutter --------------------------------------
    ("""        LinearLayout titles = new LinearLayout(this);
        titles.setOrientation(LinearLayout.VERTICAL);
        titles.setGravity(Gravity.CENTER_VERTICAL);
        title = tv(20, FG, Typeface.BOLD);""",
     """        titles = new LinearLayout(this);
        titles.setOrientation(LinearLayout.VERTICAL);
        titles.setGravity(Gravity.CENTER_VERTICAL);
        title = tv(20, FG, Typeface.BOLD);"""),

    ("""        ScrollView scroll = new ScrollView(this);
        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        scroll.addView(content, new ScrollView.LayoutParams(-1, -2));
        root.addView(scroll, new LinearLayout.LayoutParams(-1, 0, 1));""",
     """        shellScroll = new ScrollView(this);
        shellScroll.setFillViewport(true);
        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(0, dp(4), 0, dp(12));
        shellScroll.addView(content, new ScrollView.LayoutParams(-1, -2));
        root.addView(shellScroll, new LinearLayout.LayoutParams(-1, 0, 1));"""),

    ("""        bottomBar.setPadding(dp(16), dp(8), dp(16), navigationBarHeight() + dp(8));""",
     """        bottomBar.setPadding(dp(GUTTER), dp(8), dp(GUTTER), navigationBarHeight() + dp(8));"""),

    # ---- render(): never open a tab mid-scroll + deep links ------------------------------
    ("""    private void render() {
        rendering = true;
        content.removeAllViews();""",
     """    private void render() {
        String before = viewKey();
        rendering = true;
        content.removeAllViews();"""),

    ("""        else renderHome();
        rendering = false;
    }""",
     """        else renderHome();
        rendering = false;
        // switching tab / page must start the page at the top, never mid-scroll
        if (shellScroll != null && !viewKey().equals(before)) shellScroll.scrollTo(0, 0);
    }

    private String viewKey() {
        if (detailMode && isPackageName(selectedPkg)) return "d:" + selectedPkg;
        if (templateDetail) return "t:" + currentTemplate;
        return "h:" + homeTab;
    }"""),

    ("""        boolean showingDetail = detailMode || templateDetail;
        back.setVisibility(showingDetail ? View.VISIBLE : View.GONE);""",
     """        boolean showingDetail = detailMode || templateDetail;
        back.setVisibility(showingDetail ? View.VISIBLE : View.GONE);
        // keep the title on the same 20dp gutter as the page body
        if (titles != null) titles.setPadding(showingDetail ? 0 : dp(12), 0, dp(4), 0);"""),

    ("""        buildShell();
        readAll();
        String app = getIntent() == null ? "" : getIntent().getStringExtra("app");
        if (isPackageName(app)) {
            selectedPkg = app;
            detailMode = true;
            templateDetail = false;
        }
        render();
        command(json("action", "refresh"));
    }""",
     """        buildShell();
        readAll();
        applyIntent(getIntent());
        render();
        command(json("action", "refresh"));
    }

    /**
     * Deep links so the UI can be driven without taps (adb `input tap` is unreliable on this
     * device): `--es app <pkg>` detail view, `--ei tab 0..2` home tab, `--es template <name>`.
     */
    private void applyIntent(android.content.Intent intent) {
        if (intent == null) return;
        if (intent.hasExtra("tab")) {
            int t = intent.getIntExtra("tab", TAB_APPS);
            if (t >= TAB_APPS && t <= TAB_ACTIONS) {
                homeTab = t;
                detailMode = false;
                templateDetail = false;
                selectedPkg = null;
            }
        }
        String app = intent.getStringExtra("app");
        if (isPackageName(app)) {
            selectedPkg = app;
            detailMode = true;
            templateDetail = false;
        }
        String tpl = intent.getStringExtra("template");
        if (isTemplateName(tpl) && templates.containsKey(tpl)) {
            currentTemplate = tpl;
            templateDetail = true;
            detailMode = false;
        }
        if (intent.getBooleanExtra("top", false) && shellScroll != null) shellScroll.scrollTo(0, 0);
    }"""),

    ("""        String app = intent == null ? "" : intent.getStringExtra("app");
        if (isPackageName(app)) {
            selectedPkg = app;
            detailMode = true;
            templateDetail = false;
            readAll();
            render();
        }
    }""",
     """        readAll();
        applyIntent(intent);
        render();
    }"""),

    # ---- overview strip ------------------------------------------------------------------
    ("""        row.setPadding(dp(16), dp(6), dp(16), dp(6));""",
     """        row.setPadding(dp(GUTTER), dp(8), dp(GUTTER), dp(4));"""),

    # ---- tab bar -------------------------------------------------------------------------
    ("""        tabs.addView(homeTab("Apps", TAB_APPS), lp1);
        tabs.addView(homeTab("Templates", TAB_TEMPLATES), lp2);
        tabs.addView(homeTab("Actions", TAB_ACTIONS), new LinearLayout.LayoutParams(0, dp(48), 1));
        content.addView(wrap(tabs, 16, 10, 16, 8));""",
     """        tabs.addView(homeTab("Apps", TAB_APPS), lp1);
        tabs.addView(homeTab("Templates", TAB_TEMPLATES), lp2);
        tabs.addView(homeTab("Actions", TAB_ACTIONS), new LinearLayout.LayoutParams(0, dp(48), 1));
        content.addView(wrap(tabs, GUTTER, 10, GUTTER, 4));"""),

    ("""        item.setAllCaps(false);
        item.setTextSize(14);""",
     """        item.setAllCaps(false);
        item.setTextSize(13);
        item.setSingleLine(true);
        item.setEllipsize(android.text.TextUtils.TruncateAt.END);
        item.setPadding(dp(2), 0, dp(2), 0);"""),

    # ---- section labels / rows -----------------------------------------------------------
    ("""    private void addGroupTitle(String s) {
        TextView v = tv(13, MUTED, Typeface.BOLD);
        v.setText(s.toUpperCase());
        v.setPadding(dp(20), dp(14), dp(20), dp(6));""",
     """    private void addGroupTitle(String s) {
        TextView v = tv(12, MUTED, Typeface.BOLD);
        v.setText(s.toUpperCase());
        v.setLetterSpacing(0.08f);
        v.setPadding(dp(GUTTER), dp(SECTION_TOP), dp(GUTTER), dp(SECTION_BOTTOM));"""),

    ("""        row.setPadding(dp(20), dp(12), dp(20), dp(6));
        TextView n = tv(13, MUTED, Typeface.BOLD);
        n.setText(name.toUpperCase());""",
     """        row.setPadding(dp(GUTTER), dp(SECTION_TOP), dp(GUTTER), dp(SECTION_BOTTOM));
        TextView n = tv(12, MUTED, Typeface.BOLD);
        n.setLetterSpacing(0.08f);
        n.setText(name.toUpperCase());"""),

    ("""        s.setSingleLine(true);
        s.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        row.addView(n, new LinearLayout.LayoutParams(0, -2, 1));
        row.addView(s);""",
     """        s.setSingleLine(true);
        s.setEllipsize(android.text.TextUtils.TruncateAt.END);
        s.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams slp = new LinearLayout.LayoutParams(0, -2, 1);
        slp.setMargins(dp(12), 0, 0, 0);
        row.addView(n);
        row.addView(s, slp);"""),

    ("""    private void addMuted(LinearLayout parent, String s) { parent.addView(wrap(muted(s), 24, 8, 24, 12)); }""",
     """    private void addMuted(LinearLayout parent, String s) {
        TextView v = muted(s);
        v.setLineSpacing(dp(3), 1f);
        parent.addView(wrap(v, GUTTER, 2, GUTTER, 12));
    }"""),

    ("""        row.setPadding(dp(20), dp(7), dp(20), dp(7));
        row.setMinimumHeight(dp(56));
        if (clickable) row.setBackgroundColor(BG);
        return row;
    }""",
     """        row.setPadding(dp(GUTTER), dp(8), dp(GUTTER), dp(8));
        row.setMinimumHeight(dp(ROW_MIN));
        if (clickable) row.setBackground(rippleBg());
        return row;
    }

    /** transparent row background with a soft ripple so taps feel responsive */
    private android.graphics.drawable.Drawable rippleBg() {
        android.graphics.drawable.GradientDrawable mask = new android.graphics.drawable.GradientDrawable();
        mask.setColor(Color.WHITE);
        return new android.graphics.drawable.RippleDrawable(
                android.content.res.ColorStateList.valueOf(Color.argb(40, 255, 255, 255)), null, mask);
    }"""),

    ("""        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, 1);
        lp.setMargins(dp(24), 0, dp(24), 0);""",
     """        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, 1);
        lp.setMargins(dp(GUTTER), 0, dp(GUTTER), 0);"""),

    # ---- chips / chevrons / buttons ------------------------------------------------------
    ("""        c.setPadding(dp(8), dp(3), dp(8), dp(3));
        c.setBackground(round(Color.TRANSPARENT, color, 10));""",
     """        c.setPadding(dp(10), dp(4), dp(10), dp(4));
        c.setLetterSpacing(0.04f);
        c.setBackground(round(Color.TRANSPARENT, color, 12));"""),

    ("""        lp.setMargins(dp(8), 0, dp(8), 0);
        row.addView(chip(text, color), lp);""",
     """        lp.setMargins(dp(6), 0, dp(6), 0);
        row.addView(chip(text, color), lp);"""),

    ("""        TextView arrow = tv(24, MUTED, Typeface.NORMAL); arrow.setText(">");
        row.addView(arrow);""",
     """        row.addView(chevron());"""),

    ("""        TextView arrow = tv(24, MUTED, Typeface.NORMAL);
        arrow.setText(">");
        row.addView(arrow);""",
     """        row.addView(chevron());"""),

    ("""    private TextView chip(String text, int color) {""",
     """    /** one consistent chevron for every tappable row */
    private TextView chevron() {
        TextView a = tv(20, MUTED, Typeface.NORMAL);
        a.setText("\\u203a");
        a.setPadding(dp(10), 0, 0, 0);
        return a;
    }

    private TextView chip(String text, int color) {"""),

    ("""        b.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        b.setBackground(primary ? round(ACCENT, ACCENT, 12) : round(SURFACE, 0, 12));""",
     """        b.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        b.setTextSize(15);
        b.setBackground(primary ? round(ACCENT, ACCENT, 12) : round(SURFACE, LINE, 12));"""),

    # ---- remaining gutters ----------------------------------------------------------------
    ("""        content.addView(wrap(search, 16, 0, 16, 8));""",
     """        content.addView(wrap(search, GUTTER, 0, GUTTER, 8));"""),
    ("""        content.addView(wrap(search, 16, 4, 16, 8));""",
     """        content.addView(wrap(search, GUTTER, 4, GUTTER, 8));"""),
    ("""        content.addView(wrap(restore, 16, 0, 16, 18));""",
     """        content.addView(wrap(restore, GUTTER, 8, GUTTER, 18));"""),
    ("""            content.addView(wrap(sp, 16, 0, 16, 8));""",
     """            content.addView(wrap(sp, GUTTER, 0, GUTTER, 8));"""),
    ("""            content.addView(wrap(count, 24, 0, 24, 12));""",
     """            content.addView(wrap(count, GUTTER, 0, GUTTER, 12));"""),
    ("""            content.addView(wrap(unavailable, 24, 0, 24, 12));""",
     """            content.addView(wrap(unavailable, GUTTER, 0, GUTTER, 12));"""),
]


def main():
    with io.open(P, encoding="utf-8", newline="") as fh:
        src = fh.read()
    crlf = "\r\n" in src
    flat = src.replace("\r\n", "\n")
    missed, applied = [], 0
    for old, new in SUBS:
        o = old.replace("\r\n", "\n")
        n = new.replace("\r\n", "\n")
        if o not in flat:
            missed.append(old.strip().split("\n")[0][:64])
            continue
        flat = flat.replace(o, n, 1)
        applied += 1
    out = flat.replace("\n", "\r\n") if crlf else flat
    with io.open(P, "w", encoding="utf-8", newline="") as fh:
        fh.write(out)
    print("applied %d/%d" % (applied, len(SUBS)))
    for m in missed:
        print("  MISS:", m)
    return 0


if __name__ == "__main__":
    sys.exit(main())
