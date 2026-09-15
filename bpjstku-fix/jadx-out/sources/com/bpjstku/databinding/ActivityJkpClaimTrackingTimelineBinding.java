package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJkpClaimTrackingTimelineBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final RecyclerView rvClaimTrackingTimeline;
    public final TextView tvClaimCode;
    public final TextView tvKpjNumber;
    public final TextView tvOldDaySecurity;

    private ActivityJkpClaimTrackingTimelineBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnBack = materialButton;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvClaimTrackingTimeline = recyclerView;
        this.tvClaimCode = textView;
        this.tvKpjNumber = textView2;
        this.tvOldDaySecurity = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityJkpClaimTrackingTimelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJkpClaimTrackingTimelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jkp_claim_tracking_timeline, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJkpClaimTrackingTimelineBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.rvClaimTrackingTimeline;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvClaimTrackingTimeline);
                if (recyclerView != null) {
                    i = R.id.tvClaimCode;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimCode);
                    if (textView != null) {
                        i = R.id.tvKpjNumber;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjNumber);
                        if (textView2 != null) {
                            i = R.id.tvOldDaySecurity;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOldDaySecurity);
                            if (textView3 != null) {
                                return new ActivityJkpClaimTrackingTimelineBinding((ConstraintLayout) view, materialButton, layoutToolbarCenterBindingBind, recyclerView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
