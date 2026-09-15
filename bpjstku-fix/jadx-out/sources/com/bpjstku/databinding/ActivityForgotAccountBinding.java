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
public final class ActivityForgotAccountBinding implements ViewBinding {
    public final MaterialButton btnCariAkun;
    public final MaterialButton btnToLogin;
    public final TextInputEditText edtIdNumber;
    public final TextInputEditText edtKPJNumber;
    public final ImageView imgLogo;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilKPJNumber;
    public final TextView tvForgotAccount;
    public final TextView tvForgotPasswordInstruction;

    private ActivityForgotAccountBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnCariAkun = materialButton;
        this.btnToLogin = materialButton2;
        this.edtIdNumber = textInputEditText;
        this.edtKPJNumber = textInputEditText2;
        this.imgLogo = imageView;
        this.tilIdNumber = textInputLayout;
        this.tilKPJNumber = textInputLayout2;
        this.tvForgotAccount = textView;
        this.tvForgotPasswordInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityForgotAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityForgotAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_forgot_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityForgotAccountBinding bind(View view) {
        int i = R.id.btnCariAkun;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCariAkun);
        if (materialButton != null) {
            i = R.id.btnToLogin;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnToLogin);
            if (materialButton2 != null) {
                i = R.id.edtIdNumber;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdNumber);
                if (textInputEditText != null) {
                    i = R.id.edtKPJNumber;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtKPJNumber);
                    if (textInputEditText2 != null) {
                        i = R.id.imgLogo;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                        if (imageView != null) {
                            i = R.id.tilIdNumber;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                            if (textInputLayout != null) {
                                i = R.id.tilKPJNumber;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilKPJNumber);
                                if (textInputLayout2 != null) {
                                    i = R.id.tvForgotAccount;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvForgotAccount);
                                    if (textView != null) {
                                        i = R.id.tvForgotPasswordInstruction;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvForgotPasswordInstruction);
                                        if (textView2 != null) {
                                            return new ActivityForgotAccountBinding((ConstraintLayout) view, materialButton, materialButton2, textInputEditText, textInputEditText2, imageView, textInputLayout, textInputLayout2, textView, textView2);
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
