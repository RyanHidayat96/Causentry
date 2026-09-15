package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTuitionBinding implements ViewBinding {
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TabLayout tabPaymentDetail;
    public final ViewPager vpPaymentDetail;

    private ActivityTuitionBinding(ConstraintLayout constraintLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TabLayout tabLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tabPaymentDetail = tabLayout;
        this.vpPaymentDetail = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTuitionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTuitionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tuition, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTuitionBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
            int i2 = R.id.tabPaymentDetail;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabPaymentDetail);
            if (tabLayout != null) {
                i2 = R.id.vpPaymentDetail;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vpPaymentDetail);
                if (viewPager != null) {
                    return new ActivityTuitionBinding((ConstraintLayout) view, layoutToolbarCenterBindingBind, tabLayout, viewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
