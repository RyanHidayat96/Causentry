package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutWebviewToolbarCenterBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private LayoutWebviewToolbarCenterBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.progressBar = progressBar;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutWebviewToolbarCenterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutWebviewToolbarCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_webview_toolbar_center, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutWebviewToolbarCenterBinding bind(View view) {
        int i = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
        if (progressBar != null) {
            i = R.id.webView;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
            if (webView != null) {
                return new LayoutWebviewToolbarCenterBinding((ConstraintLayout) view, progressBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
