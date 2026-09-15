package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLayoutOttRctiPlusBinding implements ViewBinding {
    public final Button btnTryAgain;
    public final ConstraintLayout containerError;
    public final ImageView imgError;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private ActivityLayoutOttRctiPlusBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ProgressBar progressBar, WebView webView) {
        this.rootView = constraintLayout;
        this.btnTryAgain = button;
        this.containerError = constraintLayout2;
        this.imgError = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.progressBar = progressBar;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLayoutOttRctiPlusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLayoutOttRctiPlusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_layout_ott_rcti_plus, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLayoutOttRctiPlusBinding bind(View view) {
        int i = R.id.btnTryAgain;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnTryAgain);
        if (button != null) {
            i = R.id.containerError;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerError);
            if (constraintLayout != null) {
                i = R.id.imgError;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgError);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                        if (progressBar != null) {
                            i = R.id.webView;
                            WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
                            if (webView != null) {
                                return new ActivityLayoutOttRctiPlusBinding((ConstraintLayout) view, button, constraintLayout, imageView, layoutToolbarCenterBindingBind, progressBar, webView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
