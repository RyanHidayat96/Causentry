package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPinangWebviewBinding implements ViewBinding {
    public final WebView browser;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RelativeLayout secondRL;

    private ActivityPinangWebviewBinding(RelativeLayout relativeLayout, WebView webView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ProgressBar progressBar, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.browser = webView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.progressBar = progressBar;
        this.secondRL = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPinangWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPinangWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pinang_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPinangWebviewBinding bind(View view) {
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
                    i = R.id.second_RL;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.second_RL);
                    if (relativeLayout != null) {
                        return new ActivityPinangWebviewBinding((RelativeLayout) view, webView, layoutToolbarCenterBindingBind, progressBar, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
