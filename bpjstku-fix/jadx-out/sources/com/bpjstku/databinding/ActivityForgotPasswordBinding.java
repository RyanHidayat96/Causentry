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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityForgotPasswordBinding implements ViewBinding {
    public final MaterialButton btnBackToLogin;
    public final MaterialButton btnResetPassword;
    public final TextInputEditText edtEmail;
    public final ImageView imgLogo;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextView tvForgotPassword;
    public final TextView tvForgotPasswordInstruction;

    private ActivityForgotPasswordBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, ImageView imageView, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnBackToLogin = materialButton;
        this.btnResetPassword = materialButton2;
        this.edtEmail = textInputEditText;
        this.imgLogo = imageView;
        this.tilEmail = textInputLayout;
        this.tvForgotPassword = textView;
        this.tvForgotPasswordInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityForgotPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityForgotPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_forgot_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityForgotPasswordBinding bind(View view) {
        int i = R.id.btnBackToLogin;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBackToLogin);
        if (materialButton != null) {
            i = R.id.btnResetPassword;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnResetPassword);
            if (materialButton2 != null) {
                i = R.id.edtEmail;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
                if (textInputEditText != null) {
                    i = R.id.imgLogo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                    if (imageView != null) {
                        i = R.id.tilEmail;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                        if (textInputLayout != null) {
                            i = R.id.tvForgotPassword;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvForgotPassword);
                            if (textView != null) {
                                i = R.id.tvForgotPasswordInstruction;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvForgotPasswordInstruction);
                                if (textView2 != null) {
                                    return new ActivityForgotPasswordBinding((ConstraintLayout) view, materialButton, materialButton2, textInputEditText, imageView, textInputLayout, textView, textView2);
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
