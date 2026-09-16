package com.causentry.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.json.JSONObject;

/**
 * Causentry control UI.
 *
 * The whole interface is bundled in assets/index.html and talks to the root
 * daemon through {@link UiBridge}: the app needs no root, no server and no
 * network - the daemon keeps its state snapshot in the app's private files dir.
 */
public class UiActivity extends Activity {   // cache-busting on update

    private static final String PAGE = "file:///android_asset/index.html";

    private WebView web;
    private TextView status;
    private LinearLayout splash;
    private boolean pageReady;

    private static boolean isPackageName(String s) {
        return s != null && s.matches("[A-Za-z0-9_]+(\\.[A-Za-z0-9_]+)+");
    }

    private static boolean isFeatureId(String s) {
        return "d-devOff".equals(s) || "d-mock".equals(s) || "d-isolate".equals(s);
    }

    /** fade the native splash away once the bundled page has painted */
    private void hideSplash() {
        final View s = splash;
        if (s == null) return;
        splash = null;
        s.animate().alpha(0f).setDuration(180).withEndAction(new Runnable() {
            public void run() {
                s.setVisibility(View.GONE);
            }
        }).start();
    }

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if (getIntent() != null && getIntent().getBooleanExtra("probe", false)) {
            // headless mode: run the self-check and finish (used by the daemon/tests)
            try {
                SelfProbe.write(this);
            } catch (Throwable ignored) {
            }
            finish();
            return;
        }

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.parseColor("#0a0e13"));

        // a visible window background: without it the system paints black until the
        // first frame of the WebView is ready (that is the "black flash" on open)
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(
                Color.parseColor("#0a0e13")));

        status = new TextView(this);
        status.setText("Causentry \u2014 waiting for the daemon\u2026");
        status.setTextColor(Color.parseColor("#8b98a5"));
        status.setTextSize(12f);
        status.setPadding(28, 24, 28, 12);

        // native splash shown immediately, removed when the page has painted
        splash = new LinearLayout(this);
        splash.setOrientation(LinearLayout.VERTICAL);
        splash.setGravity(android.view.Gravity.CENTER);
        splash.setBackgroundColor(Color.parseColor("#0a0e13"));
        TextView title = new TextView(this);
        title.setText("Causentry");
        title.setTextColor(Color.parseColor("#e8eef5"));
        title.setTextSize(26f);
        title.setGravity(android.view.Gravity.CENTER);
        TextView sub = new TextView(this);
        sub.setText("loading control panel\u2026");
        sub.setTextColor(Color.parseColor("#8b98a5"));
        sub.setTextSize(13f);
        sub.setGravity(android.view.Gravity.CENTER);
        android.widget.ProgressBar spin = new android.widget.ProgressBar(this);
        LinearLayout.LayoutParams sp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        sp.topMargin = 36;
        splash.addView(title);
        splash.addView(sub, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        splash.addView(spin, sp);

        web = new WebView(this);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setCacheMode(WebSettings.LOAD_NO_CACHE);   // the page ships inside the APK
        s.setAllowFileAccessFromFileURLs(false);
        s.setAllowUniversalAccessFromFileURLs(false);
        s.setDatabaseEnabled(false);
        web.setBackgroundColor(Color.parseColor("#0a0e13"));
        // page console -> logcat (tag CAUSENTRY_JS) so UI problems are diagnosable
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage m) {
                android.util.Log.i("CAUSENTRY_JS", m.message() + " @" + m.lineNumber());
                return true;
            }
        });
        web.setWebViewClient(new android.webkit.WebViewClient() {
            private boolean allow(String url) {
                return url != null && url.startsWith(PAGE);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return !allow(url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, android.webkit.WebResourceRequest request) {
                return request == null || request.getUrl() == null || !allow(request.getUrl().toString());
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                hideSplash();
                pageReady = true;
                openRequestedApp();
                // headless automation: --ez apply true drives the real Apply handler,
                // optionally with a feature forced on/off first (audit / smoke test)
                if (getIntent() != null && getIntent().getBooleanExtra("apply", false)) {
                    String feat = getIntent().getStringExtra("feature");
                    boolean on = getIntent().getBooleanExtra("on", true);
                    if (isFeatureId(feat)) {
                        web.evaluateJavascript("window.CausentrySetFeature("
                                + JSONObject.quote(feat) + ", " + on + ")", null);
                    }
                    web.postDelayed(new Runnable() {
                        public void run() {
                            web.evaluateJavascript("window.CausentryClickApply && window.CausentryClickApply()", null);
                        }
                    }, 1500);
                }
            }
        });
        web.addJavascriptInterface(new UiBridge(this), "Causentry");

        android.widget.FrameLayout stack = new android.widget.FrameLayout(this);
        stack.addView(web, new android.widget.FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        stack.addView(splash, new android.widget.FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        root.addView(status, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        root.addView(stack, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f));
        setContentView(root);

        // cache-busting: the page ships inside this APK, WebView would otherwise
        // keep serving the previous revision after an update
        long stamp = 0;
        try {
            stamp = getPackageManager().getPackageInfo(getPackageName(), 0).lastUpdateTime;
        } catch (Exception ignored) {
        }
        web.loadUrl(PAGE + "?v=" + stamp);

        // the daemon refreshes status.json every few seconds; mirror that here
        web.postDelayed(new Runnable() {
            public void run() {
                String st = new UiBridge(UiActivity.this).status();
                if (st == null || st.length() < 3 || st.equals("{}")) {
                    status.setText("Causentry \u2014 daemon not running yet. Open KernelSU \u2192 Modules \u2192 Causentry \u2192 Action once.");
                } else {
                    status.setVisibility(android.view.View.GONE);   // page shows the state itself
                }
                hideSplash();   // fallback: never leave the splash up if onPageFinished was missed
            }
        }, 2500);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (web != null) {
            // the page keeps its own refresh loop; just nudge it on resume
            web.loadUrl("javascript:typeof refresh === 'function' && refresh();");
            // ask the daemon for a fresh app list (it also refreshes every 30s)
            new UiBridge(this).command("{\"action\":\"refresh\"}");
        }
    }

    @Override
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        openRequestedApp();
    }

    private void openRequestedApp() {
        if (!pageReady || web == null || getIntent() == null) return;
        // am start --es app <pkg> opens that app's detail page directly.
        String app = getIntent().getStringExtra("app");
        if (isPackageName(app)) {
            web.evaluateJavascript(
                    "window.CausentryOpenApp && window.CausentryOpenApp("
                            + JSONObject.quote(app) + ")", null);
        }
    }

    @Override
    public void onBackPressed() {
        if (web == null || !pageReady) {
            super.onBackPressed();
            return;
        }
        web.evaluateJavascript(
                "(function(){try{return !!(window.CausentryBack&&window.CausentryBack());}catch(e){return false;}})()",
                new android.webkit.ValueCallback<String>() {
                    @Override
                    public void onReceiveValue(String value) {
                        if (!"true".equals(value)) {
                            UiActivity.super.onBackPressed();
                        }
                    }
                });
    }
}
