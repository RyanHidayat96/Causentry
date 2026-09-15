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
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDeviceUnlinkingOtpBinding implements ViewBinding {
    public final MaterialButton btnChangeEmail;
    public final MaterialButton btnVerification;
    public final ImageView imgMail;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final OtpView otpVerify;
    private final ConstraintLayout rootView;
    public final TextView tvEmail;
    public final TextView tvResendCode;
    public final TextView tvVerificationCode;
    public final TextView tvVerificationInstruction;

    private ActivityDeviceUnlinkingOtpBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnChangeEmail = materialButton;
        this.btnVerification = materialButton2;
        this.imgMail = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.otpVerify = otpView;
        this.tvEmail = textView;
        this.tvResendCode = textView2;
        this.tvVerificationCode = textView3;
        this.tvVerificationInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceUnlinkingOtpBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceUnlinkingOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_device_unlinking_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDeviceUnlinkingOtpBinding bind(View view) {
        int i = R.id.btnChangeEmail;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChangeEmail);
        if (materialButton != null) {
            i = R.id.btnVerification;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerification);
            if (materialButton2 != null) {
                i = R.id.imgMail;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMail);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.otpVerify;
                        OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerify);
                        if (otpView != null) {
                            i = R.id.tvEmail;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmail);
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
                                            return new ActivityDeviceUnlinkingOtpBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, layoutToolbarCenterBindingBind, otpView, textView, textView2, textView3, textView4);
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
