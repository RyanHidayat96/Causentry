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
public final class ActivityNewRegistrationBinding implements ViewBinding {
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llProgress;
    public final ConstraintLayout main;
    private final ConstraintLayout rootView;
    public final FrameLayout salariedWorkerContainer;

    private ActivityNewRegistrationBinding(ConstraintLayout constraintLayout, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.llProgress = linearLayout;
        this.main = constraintLayout2;
        this.salariedWorkerContainer = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNewRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNewRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_new_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNewRegistrationBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
            i = R.id.llProgress;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llProgress);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.salariedWorkerContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerContainer);
                if (frameLayout != null) {
                    return new ActivityNewRegistrationBinding(constraintLayout, layoutToolbarBindingBind, linearLayout, constraintLayout, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
