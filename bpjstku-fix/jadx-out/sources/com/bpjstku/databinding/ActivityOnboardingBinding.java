package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityOnboardingBinding implements ViewBinding {
    public final DotsIndicator dotsIndicator;
    private final ConstraintLayout rootView;
    public final TextView tvNext;
    public final TextView tvSkip;
    public final ViewPager vpOnboarding;

    private ActivityOnboardingBinding(ConstraintLayout constraintLayout, DotsIndicator dotsIndicator, TextView textView, TextView textView2, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.dotsIndicator = dotsIndicator;
        this.tvNext = textView;
        this.tvSkip = textView2;
        this.vpOnboarding = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOnboardingBinding bind(View view) {
        int i = R.id.dotsIndicator;
        DotsIndicator dotsIndicator = (DotsIndicator) ViewBindings.findChildViewById(view, R.id.dotsIndicator);
        if (dotsIndicator != null) {
            i = R.id.tvNext;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNext);
            if (textView != null) {
                i = R.id.tvSkip;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSkip);
                if (textView2 != null) {
                    i = R.id.vpOnboarding;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vpOnboarding);
                    if (viewPager != null) {
                        return new ActivityOnboardingBinding((ConstraintLayout) view, dotsIndicator, textView, textView2, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
