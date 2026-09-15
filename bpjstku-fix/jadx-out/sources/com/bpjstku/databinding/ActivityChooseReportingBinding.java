package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityChooseReportingBinding implements ViewBinding {
    public final MaterialCardView cvDeathReporting;
    public final MaterialCardView cvWorkAccidentReporting;
    public final ImageView imgDeath;
    public final ImageView imgWorkAccident;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvDeathReporting;
    public final TextView tvDeathReportingDescription;
    public final TextView tvWorkAccidentDescription;
    public final TextView tvWorkAccidentReporting;

    private ActivityChooseReportingBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.cvDeathReporting = materialCardView;
        this.cvWorkAccidentReporting = materialCardView2;
        this.imgDeath = imageView;
        this.imgWorkAccident = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvDeathReporting = textView;
        this.tvDeathReportingDescription = textView2;
        this.tvWorkAccidentDescription = textView3;
        this.tvWorkAccidentReporting = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChooseReportingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChooseReportingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_choose_reporting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityChooseReportingBinding bind(View view) {
        int i = R.id.cvDeathReporting;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvDeathReporting);
        if (materialCardView != null) {
            i = R.id.cvWorkAccidentReporting;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvWorkAccidentReporting);
            if (materialCardView2 != null) {
                i = R.id.imgDeath;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDeath);
                if (imageView != null) {
                    i = R.id.imgWorkAccident;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWorkAccident);
                    if (imageView2 != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.tvDeathReporting;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDeathReporting);
                            if (textView != null) {
                                i = R.id.tvDeathReportingDescription;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDeathReportingDescription);
                                if (textView2 != null) {
                                    i = R.id.tvWorkAccidentDescription;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkAccidentDescription);
                                    if (textView3 != null) {
                                        i = R.id.tvWorkAccidentReporting;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkAccidentReporting);
                                        if (textView4 != null) {
                                            return new ActivityChooseReportingBinding((ConstraintLayout) view, materialCardView, materialCardView2, imageView, imageView2, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4);
                                        }
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
