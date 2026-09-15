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
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegistrationActivationPasswordBinding implements ViewBinding {
    public final Button btnNext;
    public final MaterialCardView cvEnterPasswordWarning;
    public final ImageView imgLogo;
    public final ImageView imgWarning1;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilConfirmedPassword;
    public final TextInputLayout tilPassword;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvNewPassword;

    private ActivityRegistrationActivationPasswordBinding(ConstraintLayout constraintLayout, Button button, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnNext = button;
        this.cvEnterPasswordWarning = materialCardView;
        this.imgLogo = imageView;
        this.imgWarning1 = imageView2;
        this.tilConfirmedPassword = textInputLayout;
        this.tilPassword = textInputLayout2;
        this.tvClaimNonSalariedWorkerInfo1 = textView;
        this.tvNewPassword = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegistrationActivationPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegistrationActivationPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_registration_activation_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegistrationActivationPasswordBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.cvEnterPasswordWarning;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEnterPasswordWarning);
            if (materialCardView != null) {
                i = R.id.imgLogo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                if (imageView != null) {
                    i = R.id.imgWarning1;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                    if (imageView2 != null) {
                        i = R.id.tilConfirmedPassword;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilConfirmedPassword);
                        if (textInputLayout != null) {
                            i = R.id.tilPassword;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassword);
                            if (textInputLayout2 != null) {
                                i = R.id.tvClaimNonSalariedWorkerInfo1;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                if (textView != null) {
                                    i = R.id.tvNewPassword;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewPassword);
                                    if (textView2 != null) {
                                        return new ActivityRegistrationActivationPasswordBinding((ConstraintLayout) view, button, materialCardView, imageView, imageView2, textInputLayout, textInputLayout2, textView, textView2);
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
