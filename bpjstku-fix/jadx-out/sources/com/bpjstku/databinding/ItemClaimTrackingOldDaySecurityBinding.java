package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.github.vipulasri.timelineview.TimelineView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemClaimTrackingOldDaySecurityBinding implements ViewBinding {
    public final Guideline guideline;
    private final ConstraintLayout rootView;
    public final TimelineView timeline;
    public final TextView tvEventDateTime;
    public final TextView tvEventName;
    public final TextView tvStatus;
    public final View viewSeparator;

    private ItemClaimTrackingOldDaySecurityBinding(ConstraintLayout constraintLayout, Guideline guideline, TimelineView timelineView, TextView textView, TextView textView2, TextView textView3, View view) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.timeline = timelineView;
        this.tvEventDateTime = textView;
        this.tvEventName = textView2;
        this.tvStatus = textView3;
        this.viewSeparator = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemClaimTrackingOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemClaimTrackingOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_claim_tracking_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemClaimTrackingOldDaySecurityBinding bind(View view) {
        int i = R.id.guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
        if (guideline != null) {
            i = R.id.timeline;
            TimelineView timelineView = (TimelineView) ViewBindings.findChildViewById(view, R.id.timeline);
            if (timelineView != null) {
                i = R.id.tvEventDateTime;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEventDateTime);
                if (textView != null) {
                    i = R.id.tvEventName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEventName);
                    if (textView2 != null) {
                        i = R.id.tvStatus;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatus);
                        if (textView3 != null) {
                            i = R.id.viewSeparator;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewSeparator);
                            if (viewFindChildViewById != null) {
                                return new ItemClaimTrackingOldDaySecurityBinding((ConstraintLayout) view, guideline, timelineView, textView, textView2, textView3, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
