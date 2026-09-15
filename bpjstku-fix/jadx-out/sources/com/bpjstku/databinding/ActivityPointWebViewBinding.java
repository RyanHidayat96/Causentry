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
public final class ActivityPointWebViewBinding implements ViewBinding {
    public final WebView browser;
    public final ConstraintLayout main;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final LayoutToolbarCenterCrossBinding toolbar;

    private ActivityPointWebViewBinding(ConstraintLayout constraintLayout, WebView webView, ConstraintLayout constraintLayout2, ProgressBar progressBar, LayoutToolbarCenterCrossBinding layoutToolbarCenterCrossBinding) {
        this.rootView = constraintLayout;
        this.browser = webView;
        this.main = constraintLayout2;
        this.progressBar = progressBar;
        this.toolbar = layoutToolbarCenterCrossBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPointWebViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPointWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_point_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPointWebViewBinding bind(View view) {
        int i = R.id.browser;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.browser);
        if (webView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
            if (progressBar != null) {
                i = R.id.toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.toolbar);
                if (viewFindChildViewById != null) {
                    return new ActivityPointWebViewBinding(constraintLayout, webView, constraintLayout, progressBar, LayoutToolbarCenterCrossBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
