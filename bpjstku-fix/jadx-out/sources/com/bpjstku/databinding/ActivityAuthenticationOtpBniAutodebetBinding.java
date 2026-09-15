package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAuthenticationOtpBniAutodebetBinding implements ViewBinding {
    public final Button btnCancel;
    public final Button btnVerification;
    public final ImageView imgIconDirectDebit;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final OtpView otpVerify;
    private final ConstraintLayout rootView;
    public final TextView tvDetailInstructionLineFirst;
    public final TextView tvDetailInstructionLineSecond;
    public final TextView tvResendCode;
    public final TextView tvTitleMobileInstruction;

    private ActivityAuthenticationOtpBniAutodebetBinding(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnCancel = button;
        this.btnVerification = button2;
        this.imgIconDirectDebit = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.otpVerify = otpView;
        this.tvDetailInstructionLineFirst = textView;
        this.tvDetailInstructionLineSecond = textView2;
        this.tvResendCode = textView3;
        this.tvTitleMobileInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAuthenticationOtpBniAutodebetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAuthenticationOtpBniAutodebetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_authentication_otp_bni_autodebet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAuthenticationOtpBniAutodebetBinding bind(View view) {
        int i = R.id.btnCancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (button != null) {
            i = R.id.btnVerification;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnVerification);
            if (button2 != null) {
                i = R.id.imgIconDirectDebit;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIconDirectDebit);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.otpVerify;
                        OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerify);
                        if (otpView != null) {
                            i = R.id.tvDetailInstructionLineFirst;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDetailInstructionLineFirst);
                            if (textView != null) {
                                i = R.id.tvDetailInstructionLineSecond;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDetailInstructionLineSecond);
                                if (textView2 != null) {
                                    i = R.id.tvResendCode;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResendCode);
                                    if (textView3 != null) {
                                        i = R.id.tvTitleMobileInstruction;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleMobileInstruction);
                                        if (textView4 != null) {
                                            return new ActivityAuthenticationOtpBniAutodebetBinding((ConstraintLayout) view, button, button2, imageView, layoutToolbarCenterBindingBind, otpView, textView, textView2, textView3, textView4);
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
