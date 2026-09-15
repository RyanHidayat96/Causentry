package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityScholarBenefitBinding implements ViewBinding {
    public final FrameLayout actScholarFrame;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final SeekBar sbRegisterProgression;

    private ActivityScholarBenefitBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, SeekBar seekBar) {
        this.rootView = constraintLayout;
        this.actScholarFrame = frameLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.sbRegisterProgression = seekBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityScholarBenefitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScholarBenefitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_scholar_benefit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityScholarBenefitBinding bind(View view) {
        int i = R.id.act_scholar_frame;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.act_scholar_frame);
        if (frameLayout != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.sbRegisterProgression);
                if (seekBar != null) {
                    return new ActivityScholarBenefitBinding((ConstraintLayout) view, frameLayout, layoutToolbarCenterBindingBind, seekBar);
                }
                i = R.id.sbRegisterProgression;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
