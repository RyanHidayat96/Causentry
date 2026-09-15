package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.mukesh.OtpView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAsikActiveParticipantConfirmationPhoneBinding implements ViewBinding {
    public final MaterialButton btnChangeMethod;
    public final MaterialButton btnVerification;
    public final OtpView otpVerify;
    private final ScrollView rootView;
    public final TextView tvPhone;
    public final TextView tvResendCode;
    public final TextView tvVerificationCode;
    public final TextView tvVerificationInstruction;

    private FragmentAsikActiveParticipantConfirmationPhoneBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, OtpView otpView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnChangeMethod = materialButton;
        this.btnVerification = materialButton2;
        this.otpVerify = otpView;
        this.tvPhone = textView;
        this.tvResendCode = textView2;
        this.tvVerificationCode = textView3;
        this.tvVerificationInstruction = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantConfirmationPhoneBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantConfirmationPhoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_confirmation_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantConfirmationPhoneBinding bind(View view) {
        int i = R.id.btnChangeMethod;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChangeMethod);
        if (materialButton != null) {
            i = R.id.btnVerification;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnVerification);
            if (materialButton2 != null) {
                i = R.id.otpVerify;
                OtpView otpView = (OtpView) ViewBindings.findChildViewById(view, R.id.otpVerify);
                if (otpView != null) {
                    i = R.id.tvPhone;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhone);
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
                                    return new FragmentAsikActiveParticipantConfirmationPhoneBinding((ScrollView) view, materialButton, materialButton2, otpView, textView, textView2, textView3, textView4);
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
