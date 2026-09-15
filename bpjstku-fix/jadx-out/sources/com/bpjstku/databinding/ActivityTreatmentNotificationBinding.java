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
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTreatmentNotificationBinding implements ViewBinding {
    public final MaterialButton btnVerification;
    public final ImageView ivIllustration;
    public final LayoutToolbarBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvHospitalName;
    public final TextView tvHospitalNameLabel;
    public final TextView tvMessage;
    public final TextView tvTitle;
    public final TextView tvUserName;
    public final TextView tvUserNameLabel;

    private ActivityTreatmentNotificationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.btnVerification = materialButton;
        this.ivIllustration = imageView;
        this.layoutToolbar = layoutToolbarBinding;
        this.tvHospitalName = textView;
        this.tvHospitalNameLabel = textView2;
        this.tvMessage = textView3;
        this.tvTitle = textView4;
        this.tvUserName = textView5;
        this.tvUserNameLabel = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTreatmentNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTreatmentNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_treatment_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTreatmentNotificationBinding bind(View view) {
        int i = R.id.btnVerification;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerification);
        if (materialButton != null) {
            i = R.id.ivIllustration;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivIllustration);
            if (imageView != null) {
                i = R.id.layoutToolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                    i = R.id.tvHospitalName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvHospitalName);
                    if (textView != null) {
                        i = R.id.tvHospitalNameLabel;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvHospitalNameLabel);
                        if (textView2 != null) {
                            i = R.id.tvMessage;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMessage);
                            if (textView3 != null) {
                                i = R.id.tvTitle;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                if (textView4 != null) {
                                    i = R.id.tvUserName;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserName);
                                    if (textView5 != null) {
                                        i = R.id.tvUserNameLabel;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserNameLabel);
                                        if (textView6 != null) {
                                            return new ActivityTreatmentNotificationBinding((ConstraintLayout) view, materialButton, imageView, layoutToolbarBindingBind, textView, textView2, textView3, textView4, textView5, textView6);
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
