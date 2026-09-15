package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityLoginActivationBinding implements ViewBinding {
    public final FrameLayout containerFragment;
    public final LayoutRegistrationProgressBinding layoutProgress;
    public final LayoutToolbarBinding layoutToolbar;
    private final RelativeLayout rootView;

    private ActivityLoginActivationBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, LayoutRegistrationProgressBinding layoutRegistrationProgressBinding, LayoutToolbarBinding layoutToolbarBinding) {
        this.rootView = relativeLayout;
        this.containerFragment = frameLayout;
        this.layoutProgress = layoutRegistrationProgressBinding;
        this.layoutToolbar = layoutToolbarBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLoginActivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLoginActivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_login_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLoginActivationBinding bind(View view) {
        int i = R.id.containerFragment;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.containerFragment);
        if (frameLayout != null) {
            i = R.id.layout_progress;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_progress);
            if (viewFindChildViewById != null) {
                LayoutRegistrationProgressBinding layoutRegistrationProgressBindingBind = LayoutRegistrationProgressBinding.bind(viewFindChildViewById);
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById2 != null) {
                    return new ActivityLoginActivationBinding((RelativeLayout) view, frameLayout, layoutRegistrationProgressBindingBind, LayoutToolbarBinding.bind(viewFindChildViewById2));
                }
                i = R.id.layout_toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
