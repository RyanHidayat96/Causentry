package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityOneTimePaymentBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final WebView webViewOneTimePayment;

    private ActivityOneTimePaymentBinding(RelativeLayout relativeLayout, WebView webView) {
        this.rootView = relativeLayout;
        this.webViewOneTimePayment = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOneTimePaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOneTimePaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_one_time_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOneTimePaymentBinding bind(View view) {
        WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webViewOneTimePayment);
        if (webView != null) {
            return new ActivityOneTimePaymentBinding((RelativeLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.webViewOneTimePayment)));
    }
}
