package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityWebviewFaqCustomBinding implements ViewBinding {
    public final Button btnTryAgain;
    public final ConstraintLayout containerError;
    public final ConstraintLayout containerWebFaqCustomActivity;
    public final ImageView imgError;
    public final LinearLayout layoutAntrianOnlineInfo;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final TextView tvAntrianOnlineInfo;
    public final WebView webView;

    private ActivityWebviewFaqCustomBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, LinearLayout linearLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ProgressBar progressBar, TextView textView, WebView webView) {
        this.rootView = constraintLayout;
        this.btnTryAgain = button;
        this.containerError = constraintLayout2;
        this.containerWebFaqCustomActivity = constraintLayout3;
        this.imgError = imageView;
        this.layoutAntrianOnlineInfo = linearLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.progressBar = progressBar;
        this.tvAntrianOnlineInfo = textView;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWebviewFaqCustomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityWebviewFaqCustomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_webview_faq_custom, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityWebviewFaqCustomBinding bind(View view) {
        int i = R.id.btnTryAgain;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnTryAgain);
        if (button != null) {
            i = R.id.containerError;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerError);
            if (constraintLayout != null) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                i = R.id.imgError;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgError);
                if (imageView != null) {
                    i = R.id.layoutAntrianOnlineInfo;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutAntrianOnlineInfo);
                    if (linearLayout != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                            if (progressBar != null) {
                                i = R.id.tvAntrianOnlineInfo;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAntrianOnlineInfo);
                                if (textView != null) {
                                    i = R.id.webView;
                                    WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
                                    if (webView != null) {
                                        return new ActivityWebviewFaqCustomBinding(constraintLayout2, button, constraintLayout, constraintLayout2, imageView, linearLayout, layoutToolbarCenterBindingBind, progressBar, textView, webView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
