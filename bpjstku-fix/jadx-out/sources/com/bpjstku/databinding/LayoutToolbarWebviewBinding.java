package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutToolbarWebviewBinding implements ViewBinding {
    private final MaterialToolbar rootView;
    public final MaterialToolbar toolbarWebview;
    public final TextView tvToolbarBack;
    public final TextView tvToolbarClose;
    public final TextView tvToolbarWebviewTitle;

    private LayoutToolbarWebviewBinding(MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialToolbar;
        this.toolbarWebview = materialToolbar2;
        this.tvToolbarBack = textView;
        this.tvToolbarClose = textView2;
        this.tvToolbarWebviewTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialToolbar getRoot() {
        return this.rootView;
    }

    public static LayoutToolbarWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutToolbarWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_toolbar_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutToolbarWebviewBinding bind(View view) {
        MaterialToolbar materialToolbar = (MaterialToolbar) view;
        int i = R.id.tvToolbarBack;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarBack);
        if (textView != null) {
            i = R.id.tvToolbarClose;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarClose);
            if (textView2 != null) {
                i = R.id.tvToolbarWebviewTitle;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarWebviewTitle);
                if (textView3 != null) {
                    return new LayoutToolbarWebviewBinding(materialToolbar, materialToolbar, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
