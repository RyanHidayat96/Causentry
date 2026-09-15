package com.causentry.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

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

        status = new TextView(this);
        status.setText("Causentry \u2014 waiting for the daemon\u2026");
        status.setTextColor(Color.parseColor("#8b98a5"));
        status.setTextSize(12f);
        status.setPadding(28, 24, 28, 12);

        web = new WebView(this);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setCacheMode(WebSettings.LOAD_NO_CACHE);   // the page ships inside the APK
        web.setBackgroundColor(Color.parseColor("#0a0e13"));
        // page console -> logcat (tag CAUSENTRY_JS) so UI problems are diagnosable
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage m) {
                android.util.Log.i("CAUSENTRY_JS", m.message() + " @" + m.lineNumber());
                return true;
            }
        });
        web.addJavascriptInterface(new UiBridge(this), "Causentry");

        root.addView(status, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        root.addView(web, new LinearLayout.LayoutParams(
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
}
