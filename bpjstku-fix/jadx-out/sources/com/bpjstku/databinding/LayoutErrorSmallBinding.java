package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutErrorSmallBinding implements ViewBinding {
    public final Button btnError;
    public final LinearLayout errorLayout;
    private final LinearLayout rootView;
    public final TextView tvError;
    public final TextView tvTitle;

    private LayoutErrorSmallBinding(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.btnError = button;
        this.errorLayout = linearLayout2;
        this.tvError = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutErrorSmallBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutErrorSmallBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_error_small, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutErrorSmallBinding bind(View view) {
        int i = R.id.btn_error;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_error);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.tv_error;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_error);
            if (textView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new LayoutErrorSmallBinding(linearLayout, button, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
