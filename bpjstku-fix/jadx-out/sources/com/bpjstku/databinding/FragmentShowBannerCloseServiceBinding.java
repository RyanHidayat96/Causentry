package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentShowBannerCloseServiceBinding implements ViewBinding {
    public final ConstraintLayout containerBanner;
    public final AppCompatImageView imgBanner;
    private final FrameLayout rootView;
    public final TextView tvCloseBanner;

    private FragmentShowBannerCloseServiceBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = frameLayout;
        this.containerBanner = constraintLayout;
        this.imgBanner = appCompatImageView;
        this.tvCloseBanner = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentShowBannerCloseServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentShowBannerCloseServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_show_banner_close_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentShowBannerCloseServiceBinding bind(View view) {
        int i = R.id.containerBanner;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerBanner);
        if (constraintLayout != null) {
            i = R.id.imgBanner;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBanner);
            if (appCompatImageView != null) {
                i = R.id.tvCloseBanner;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCloseBanner);
                if (textView != null) {
                    return new FragmentShowBannerCloseServiceBinding((FrameLayout) view, constraintLayout, appCompatImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
