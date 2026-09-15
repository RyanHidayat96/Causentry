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
public final class ActivityWebViewLapakAsikBinding implements ViewBinding {
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private ActivityWebViewLapakAsikBinding(ConstraintLayout constraintLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.progressBar = progressBar;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWebViewLapakAsikBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebViewLapakAsikBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_web_view_lapak_asik, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityWebViewLapakAsikBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
            int i2 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
            if (progressBar != null) {
                i2 = R.id.webView;
                WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
                if (webView != null) {
                    return new ActivityWebViewLapakAsikBinding((ConstraintLayout) view, layoutToolbarCenterBindingBind, progressBar, webView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
