package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityNonSalariedWorkerConfirmationBinding implements ViewBinding {
    public final FrameLayout containerConfirmation;
    public final LayoutToolbarBinding layoutToolbar;
    private final RelativeLayout rootView;

    private ActivityNonSalariedWorkerConfirmationBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, LayoutToolbarBinding layoutToolbarBinding) {
        this.rootView = relativeLayout;
        this.containerConfirmation = frameLayout;
        this.layoutToolbar = layoutToolbarBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNonSalariedWorkerConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNonSalariedWorkerConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_non_salaried_worker_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNonSalariedWorkerConfirmationBinding bind(View view) {
        int i = R.id.containerConfirmation;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.containerConfirmation);
        if (frameLayout != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                return new ActivityNonSalariedWorkerConfirmationBinding((RelativeLayout) view, frameLayout, LayoutToolbarBinding.bind(viewFindChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
