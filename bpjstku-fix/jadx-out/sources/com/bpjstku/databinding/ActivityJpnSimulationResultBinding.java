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
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityJpnSimulationResultBinding implements ViewBinding {
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvContent;
    private final ConstraintLayout rootView;
    public final TabLayout tabJpnSimulationResult;
    public final ViewPager vpJpnSimulationResult;

    private ActivityJpnSimulationResultBinding(ConstraintLayout constraintLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, TabLayout tabLayout, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvContent = multiStateView;
        this.tabJpnSimulationResult = tabLayout;
        this.vpJpnSimulationResult = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityJpnSimulationResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJpnSimulationResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jpn_simulation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJpnSimulationResultBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
            i = R.id.msvContent;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvContent);
            if (multiStateView != null) {
                i = R.id.tabJpnSimulationResult;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabJpnSimulationResult);
                if (tabLayout != null) {
                    i = R.id.vpJpnSimulationResult;
                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vpJpnSimulationResult);
                    if (viewPager != null) {
                        return new ActivityJpnSimulationResultBinding((ConstraintLayout) view, layoutToolbarCenterBindingBind, multiStateView, tabLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
