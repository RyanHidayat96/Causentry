package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityCheckEligibilityOldDaySecurityBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ScrollView eligibleView;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvClaimType;
    private final LinearLayout rootView;
    public final RecyclerView rvClaimType;
    public final TextView tvClaimType;
    public final TextView tvKpj;
    public final TextView tvKpjLabel;

    private ActivityCheckEligibilityOldDaySecurityBinding(LinearLayout linearLayout, MaterialButton materialButton, ScrollView scrollView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnNext = materialButton;
        this.eligibleView = scrollView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvClaimType = multiStateView;
        this.rvClaimType = recyclerView;
        this.tvClaimType = textView;
        this.tvKpj = textView2;
        this.tvKpjLabel = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCheckEligibilityOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCheckEligibilityOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_eligibility_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCheckEligibilityOldDaySecurityBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.eligibleView;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.eligibleView);
            if (scrollView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.msvClaimType;
                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvClaimType);
                    if (multiStateView != null) {
                        i = R.id.rvClaimType;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvClaimType);
                        if (recyclerView != null) {
                            i = R.id.tvClaimType;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimType);
                            if (textView != null) {
                                i = R.id.tvKpj;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpj);
                                if (textView2 != null) {
                                    i = R.id.tvKpjLabel;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjLabel);
                                    if (textView3 != null) {
                                        return new ActivityCheckEligibilityOldDaySecurityBinding((LinearLayout) view, materialButton, scrollView, layoutToolbarCenterBindingBind, multiStateView, recyclerView, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
