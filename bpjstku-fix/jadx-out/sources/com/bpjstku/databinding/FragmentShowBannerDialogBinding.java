package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentShowBannerDialogBinding implements ViewBinding {
    public final ConstraintLayout containerBanner;
    public final ImageView imgBannerPopup;
    private final FrameLayout rootView;
    public final TextView tvCloseBanner;

    private FragmentShowBannerDialogBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = frameLayout;
        this.containerBanner = constraintLayout;
        this.imgBannerPopup = imageView;
        this.tvCloseBanner = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentShowBannerDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentShowBannerDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_show_banner_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentShowBannerDialogBinding bind(View view) {
        int i = R.id.containerBanner;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerBanner);
        if (constraintLayout != null) {
            i = R.id.imgBannerPopup;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBannerPopup);
            if (imageView != null) {
                i = R.id.tvCloseBanner;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCloseBanner);
                if (textView != null) {
                    return new FragmentShowBannerDialogBinding((FrameLayout) view, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
