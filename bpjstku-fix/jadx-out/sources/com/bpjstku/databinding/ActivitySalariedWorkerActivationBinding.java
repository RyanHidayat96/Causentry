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
public final class ActivitySalariedWorkerActivationBinding implements ViewBinding {
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llProgress;
    private final ConstraintLayout rootView;
    public final FrameLayout salariedWorkerContainer;

    private ActivitySalariedWorkerActivationBinding(ConstraintLayout constraintLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.llProgress = linearLayout;
        this.salariedWorkerContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySalariedWorkerActivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySalariedWorkerActivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_salaried_worker_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySalariedWorkerActivationBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
            int i2 = R.id.llProgress;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
            if (linearLayout != null) {
                i2 = R.id.salariedWorkerContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerContainer);
                if (frameLayout != null) {
                    return new ActivitySalariedWorkerActivationBinding((ConstraintLayout) view, layoutToolbarBindingBind, linearLayout, frameLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
