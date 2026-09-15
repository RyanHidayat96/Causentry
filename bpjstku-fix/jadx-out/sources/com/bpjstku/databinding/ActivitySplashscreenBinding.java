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

/* JADX INFO: loaded from: classes6.dex */
public final class ActivitySplashscreenBinding implements ViewBinding {
    public final ImageView imgLogo;
    private final ConstraintLayout rootView;
    public final TextView tvInfo;

    private ActivitySplashscreenBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgLogo = imageView;
        this.tvInfo = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySplashscreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashscreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_splashscreen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySplashscreenBinding bind(View view) {
        int i = R.id.imgLogo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
        if (imageView != null) {
            i = R.id.tvInfo;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfo);
            if (textView != null) {
                return new ActivitySplashscreenBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
