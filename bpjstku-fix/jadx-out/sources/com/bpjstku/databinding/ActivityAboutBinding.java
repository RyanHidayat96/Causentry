package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityAboutBinding implements ViewBinding {
    public final MultiStateView msv;
    private final LinearLayout rootView;
    public final TextView tvAbout;
    public final TextView tvEmail;
    public final TextView tvPhone;

    private ActivityAboutBinding(LinearLayout linearLayout, MultiStateView multiStateView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.msv = multiStateView;
        this.tvAbout = textView;
        this.tvEmail = textView2;
        this.tvPhone = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAboutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_about, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAboutBinding bind(View view) {
        int i = R.id.msv;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msv);
        if (multiStateView != null) {
            i = R.id.tv_about;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_about);
            if (textView != null) {
                i = R.id.tv_email;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_email);
                if (textView2 != null) {
                    i = R.id.tv_phone;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_phone);
                    if (textView3 != null) {
                        return new ActivityAboutBinding((LinearLayout) view, multiStateView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
