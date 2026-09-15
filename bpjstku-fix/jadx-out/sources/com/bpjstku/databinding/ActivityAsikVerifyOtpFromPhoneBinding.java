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

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAsikVerifyOtpFromPhoneBinding implements ViewBinding {
    public final MaterialButton btnPhoneNumberAsik;
    public final MaterialButton btnVerificationOtpPhone;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final OtpView otpVerifyPhoneAsik;
    private final ConstraintLayout rootView;
    public final TextView tvPhoneNumberAsik;
    public final TextView tvResendCodeAsik;
    public final TextView tvVerificationCode;
    public final TextView tvVerificationInstruction;

    private ActivityAsikVerifyOtpFromPhoneBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnPhoneNumberAsik = materialButton;
        this.btnVerificationOtpPhone = materialButton2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.otpVerifyPhoneAsik = otpView;
        this.tvPhoneNumberAsik = textView;
        this.tvResendCodeAsik = textView2;
        this.tvVerificationCode = textView3;
        this.tvVerificationInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAsikVerifyOtpFromPhoneBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAsikVerifyOtpFromPhoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_asik_verify_otp_from_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAsikVerifyOtpFromPhoneBinding bind(View view) {
        int i = R.id.btnPhoneNumberAsik;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPhoneNumberAsik);
        if (materialButton != null) {
            i = R.id.btnVerificationOtpPhone;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerificationOtpPhone);
            if (materialButton2 != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.otpVerifyPhoneAsik;
                    OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerifyPhoneAsik);
                    if (otpView != null) {
                        i = R.id.tvPhoneNumberAsik;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumberAsik);
                        if (textView != null) {
                            i = R.id.tvResendCodeAsik;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResendCodeAsik);
                            if (textView2 != null) {
                                i = R.id.tvVerificationCode;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationCode);
                                if (textView3 != null) {
                                    i = R.id.tvVerificationInstruction;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVerificationInstruction);
                                    if (textView4 != null) {
                                        return new ActivityAsikVerifyOtpFromPhoneBinding((ConstraintLayout) view, materialButton, materialButton2, layoutToolbarCenterBindingBind, otpView, textView, textView2, textView3, textView4);
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
