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
public final class ActivityAsikResignNonSalariedWorkerRegistrationBinding implements ViewBinding {
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llProgress;
    public final FrameLayout nonSalariedWorkerContainer;
    private final ConstraintLayout rootView;

    private ActivityAsikResignNonSalariedWorkerRegistrationBinding(ConstraintLayout constraintLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.llProgress = linearLayout;
        this.nonSalariedWorkerContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAsikResignNonSalariedWorkerRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAsikResignNonSalariedWorkerRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_asik_resign_non_salaried_worker_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAsikResignNonSalariedWorkerRegistrationBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
            int i2 = R.id.llProgress;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
            if (linearLayout != null) {
                i2 = R.id.nonSalariedWorkerContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.nonSalariedWorkerContainer);
                if (frameLayout != null) {
                    return new ActivityAsikResignNonSalariedWorkerRegistrationBinding((ConstraintLayout) view, layoutToolbarBindingBind, linearLayout, frameLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
