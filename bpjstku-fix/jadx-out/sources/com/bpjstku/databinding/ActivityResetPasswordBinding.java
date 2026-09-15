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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityResetPasswordBinding implements ViewBinding {
    public final Button btnResetPassword;
    public final MaterialCardView cvEnterPasswordWarning;
    public final TextInputEditText edtConfirmedPassword;
    public final TextInputEditText edtNewPassword;
    public final ImageView imgLogo;
    public final ImageView imgWarning1;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilConfirmedPassword;
    public final TextInputLayout tilNewPassword;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvNewPassword;

    private ActivityResetPasswordBinding(ConstraintLayout constraintLayout, Button button, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, ImageView imageView2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnResetPassword = button;
        this.cvEnterPasswordWarning = materialCardView;
        this.edtConfirmedPassword = textInputEditText;
        this.edtNewPassword = textInputEditText2;
        this.imgLogo = imageView;
        this.imgWarning1 = imageView2;
        this.tilConfirmedPassword = textInputLayout;
        this.tilNewPassword = textInputLayout2;
        this.tvClaimNonSalariedWorkerInfo1 = textView;
        this.tvNewPassword = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_reset_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityResetPasswordBinding bind(View view) {
        int i = R.id.btnResetPassword;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnResetPassword);
        if (button != null) {
            i = R.id.cvEnterPasswordWarning;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEnterPasswordWarning);
            if (materialCardView != null) {
                i = R.id.edtConfirmedPassword;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtConfirmedPassword);
                if (textInputEditText != null) {
                    i = R.id.edtNewPassword;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtNewPassword);
                    if (textInputEditText2 != null) {
                        i = R.id.imgLogo;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                        if (imageView != null) {
                            i = R.id.imgWarning1;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                            if (imageView2 != null) {
                                i = R.id.tilConfirmedPassword;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilConfirmedPassword);
                                if (textInputLayout != null) {
                                    i = R.id.tilNewPassword;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNewPassword);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tvClaimNonSalariedWorkerInfo1;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                        if (textView != null) {
                                            i = R.id.tvNewPassword;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewPassword);
                                            if (textView2 != null) {
                                                return new ActivityResetPasswordBinding((ConstraintLayout) view, button, materialCardView, textInputEditText, textInputEditText2, imageView, imageView2, textInputLayout, textInputLayout2, textView, textView2);
                                            }
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
