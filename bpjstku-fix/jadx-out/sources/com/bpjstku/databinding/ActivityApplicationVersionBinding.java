package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityApplicationVersionBinding implements ViewBinding {
    public final MaterialButton btnAppVersion;
    public final ImageView imgAppVersion;
    private final ConstraintLayout rootView;
    public final TextView tvAppVersionContent;
    public final TextView tvAppVersionTitle;

    private ActivityApplicationVersionBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnAppVersion = materialButton;
        this.imgAppVersion = imageView;
        this.tvAppVersionContent = textView;
        this.tvAppVersionTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityApplicationVersionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityApplicationVersionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_application_version, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityApplicationVersionBinding bind(View view) {
        int i = R.id.btnAppVersion;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAppVersion);
        if (materialButton != null) {
            i = R.id.imgAppVersion;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgAppVersion);
            if (imageView != null) {
                i = R.id.tvAppVersionContent;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAppVersionContent);
                if (textView != null) {
                    i = R.id.tvAppVersionTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAppVersionTitle);
                    if (textView2 != null) {
                        return new ActivityApplicationVersionBinding((ConstraintLayout) view, materialButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
