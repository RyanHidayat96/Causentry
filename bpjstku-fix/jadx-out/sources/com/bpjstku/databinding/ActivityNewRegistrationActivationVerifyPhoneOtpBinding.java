package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityNewRegistrationActivationVerifyPhoneOtpBinding implements ViewBinding {
    public final MaterialButton btnChangePhone;
    public final MaterialButton btnVerification;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final OtpView otpVerify;
    private final ConstraintLayout rootView;
    public final TextView tvPhoneNumber;
    public final TextView tvResendCode;
    public final TextView tvVerificationCode;
    public final TextView tvVerificationInstruction;

    private ActivityNewRegistrationActivationVerifyPhoneOtpBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnChangePhone = materialButton;
        this.btnVerification = materialButton2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.otpVerify = otpView;
        this.tvPhoneNumber = textView;
        this.tvResendCode = textView2;
        this.tvVerificationCode = textView3;
        this.tvVerificationInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNewRegistrationActivationVerifyPhoneOtpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNewRegistrationActivationVerifyPhoneOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_new_registration_activation_verify_phone_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNewRegistrationActivationVerifyPhoneOtpBinding bind(View view) {
        int i = R.id.btnChangePhone;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChangePhone);
        if (materialButton != null) {
            i = R.id.btnVerification;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerification);
            if (materialButton2 != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.otpVerify;
                    OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerify);
                    if (otpView != null) {
                        i = R.id.tvPhoneNumber;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumber);
                        if (textView != null) {
                            i = R.id.tvResendCode;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResendCode);
                            if (textView2 != null) {
                                i = R.id.tvVerificationCode;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationCode);
                                if (textView3 != null) {
                                    i = R.id.tvVerificationInstruction;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationInstruction);
                                    if (textView4 != null) {
                                        return new ActivityNewRegistrationActivationVerifyPhoneOtpBinding((ConstraintLayout) view, materialButton, materialButton2, layoutToolbarCenterBindingBind, otpView, textView, textView2, textView3, textView4);
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
