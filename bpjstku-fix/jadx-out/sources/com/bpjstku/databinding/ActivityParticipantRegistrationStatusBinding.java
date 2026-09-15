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
public final class ActivityParticipantRegistrationStatusBinding implements ViewBinding {
    public final MaterialButton btnAlreadyRegistered;
    public final MaterialButton btnRegisterNewUser;
    public final ImageView ivQueueingIllustration;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvParticipantRegisterStatusQuestion;

    private ActivityParticipantRegistrationStatusBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView) {
        this.rootView = constraintLayout;
        this.btnAlreadyRegistered = materialButton;
        this.btnRegisterNewUser = materialButton2;
        this.ivQueueingIllustration = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvParticipantRegisterStatusQuestion = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityParticipantRegistrationStatusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityParticipantRegistrationStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_participant_registration_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityParticipantRegistrationStatusBinding bind(View view) {
        int i = R.id.btnAlreadyRegistered;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAlreadyRegistered);
        if (materialButton != null) {
            i = R.id.btnRegisterNewUser;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRegisterNewUser);
            if (materialButton2 != null) {
                i = R.id.ivQueueingIllustration;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivQueueingIllustration);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tvParticipantRegisterStatusQuestion;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvParticipantRegisterStatusQuestion);
                        if (textView != null) {
                            return new ActivityParticipantRegistrationStatusBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, layoutToolbarCenterBindingBind, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
