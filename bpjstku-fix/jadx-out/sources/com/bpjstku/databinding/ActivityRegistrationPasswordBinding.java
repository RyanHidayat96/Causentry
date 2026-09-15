package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegistrationPasswordBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final MaterialCardView cvEnterPasswordWarning;
    public final ImageView imgLogo;
    public final ImageView imgWarning1;
    public final LinearLayout llPasswordRules;
    public final ConstraintLayout passwordContainer;
    private final ScrollView rootView;
    public final TextInputLayout tilConfirmedPassword;
    public final TextInputLayout tilPassword;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvDigitValid;
    public final TextView tvLengthValid;
    public final TextView tvNewPassword;
    public final TextView tvSpecialCharValid;
    public final TextView tvUpperLowerValid;

    private ActivityRegistrationPasswordBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvEnterPasswordWarning = materialCardView;
        this.imgLogo = imageView;
        this.imgWarning1 = imageView2;
        this.llPasswordRules = linearLayout;
        this.passwordContainer = constraintLayout;
        this.tilConfirmedPassword = textInputLayout;
        this.tilPassword = textInputLayout2;
        this.tvClaimNonSalariedWorkerInfo1 = textView;
        this.tvDigitValid = textView2;
        this.tvLengthValid = textView3;
        this.tvNewPassword = textView4;
        this.tvSpecialCharValid = textView5;
        this.tvUpperLowerValid = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityRegistrationPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegistrationPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_registration_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegistrationPasswordBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvEnterPasswordWarning;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEnterPasswordWarning);
            if (materialCardView != null) {
                i = R.id.imgLogo;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                if (imageView != null) {
                    i = R.id.imgWarning1;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                    if (imageView2 != null) {
                        i = R.id.llPasswordRules;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPasswordRules);
                        if (linearLayout != null) {
                            i = R.id.passwordContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.passwordContainer);
                            if (constraintLayout != null) {
                                i = R.id.tilConfirmedPassword;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilConfirmedPassword);
                                if (textInputLayout != null) {
                                    i = R.id.tilPassword;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassword);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tvClaimNonSalariedWorkerInfo1;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                        if (textView != null) {
                                            i = R.id.tvDigitValid;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDigitValid);
                                            if (textView2 != null) {
                                                i = R.id.tvLengthValid;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLengthValid);
                                                if (textView3 != null) {
                                                    i = R.id.tvNewPassword;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewPassword);
                                                    if (textView4 != null) {
                                                        i = R.id.tvSpecialCharValid;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSpecialCharValid);
                                                        if (textView5 != null) {
                                                            i = R.id.tvUpperLowerValid;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUpperLowerValid);
                                                            if (textView6 != null) {
                                                                return new ActivityRegistrationPasswordBinding((ScrollView) view, materialButton, materialCardView, imageView, imageView2, linearLayout, constraintLayout, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4, textView5, textView6);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
