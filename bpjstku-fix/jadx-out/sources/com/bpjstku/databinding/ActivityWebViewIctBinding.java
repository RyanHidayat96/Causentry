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

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityWebViewIctBinding implements ViewBinding {
    public final WebView browser;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rootWebView;

    private ActivityWebViewIctBinding(ConstraintLayout constraintLayout, WebView webView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ProgressBar progressBar, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.browser = webView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.progressBar = progressBar;
        this.rootWebView = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWebViewIctBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebViewIctBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_web_view_ict, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityWebViewIctBinding bind(View view) {
        int i = R.id.browser;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.browser);
        if (webView != null) {
            i = R.id.layout_toolbar_center;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                if (progressBar != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new ActivityWebViewIctBinding(constraintLayout, webView, layoutToolbarCenterBindingBind, progressBar, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
