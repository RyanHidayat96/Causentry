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
public final class LayoutOnboardingBinding implements ViewBinding {
    public final ConstraintLayout cvOnboardingInfo;
    public final ImageView imgOnboarding;
    private final ConstraintLayout rootView;
    public final TextView tvDescOnBoarding;
    public final TextView tvTitleOnBoarding;

    private LayoutOnboardingBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cvOnboardingInfo = constraintLayout2;
        this.imgOnboarding = imageView;
        this.tvDescOnBoarding = textView;
        this.tvTitleOnBoarding = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutOnboardingBinding bind(View view) {
        int i = R.id.cvOnboardingInfo;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cvOnboardingInfo);
        if (constraintLayout != null) {
            i = R.id.imgOnboarding;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOnboarding);
            if (imageView != null) {
                i = R.id.tvDescOnBoarding;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescOnBoarding);
                if (textView != null) {
                    i = R.id.tvTitleOnBoarding;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleOnBoarding);
                    if (textView2 != null) {
                        return new LayoutOnboardingBinding((ConstraintLayout) view, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
