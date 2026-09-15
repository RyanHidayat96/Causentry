package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimSubmissionBinding implements ViewBinding {
    public final FrameLayout claimSubmissionContainer;
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llProgress;
    private final ConstraintLayout rootView;

    private ActivityClaimSubmissionBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.claimSubmissionContainer = frameLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.llProgress = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimSubmissionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimSubmissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_submission, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimSubmissionBinding bind(View view) {
        int i = R.id.claimSubmissionContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.claimSubmissionContainer);
        if (frameLayout != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
                if (linearLayout != null) {
                    return new ActivityClaimSubmissionBinding((ConstraintLayout) view, frameLayout, layoutToolbarBindingBind, linearLayout);
                }
                i = R.id.llProgress;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
