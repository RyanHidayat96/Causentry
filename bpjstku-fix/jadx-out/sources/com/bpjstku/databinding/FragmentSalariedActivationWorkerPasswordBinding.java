package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
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
public final class FragmentSalariedActivationWorkerPasswordBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final MaterialCardView cvEnterPasswordWarning;
    public final ImageView imgKeyIcon;
    public final GridLayout llPasswordRules;
    private final ScrollView rootView;
    public final ConstraintLayout salariedWorkerPasswordContainer;
    public final TextInputLayout tilConfirmedPassword;
    public final TextInputLayout tilPassword;
    public final TextView tvDigitValid;
    public final TextView tvLengthValid;
    public final TextView tvPageSubtitle;
    public final TextView tvSpecialCharValid;
    public final TextView tvTitlePassword;
    public final TextView tvUpperLowerValid;

    private FragmentSalariedActivationWorkerPasswordBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, ImageView imageView, GridLayout gridLayout, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.btnConfirmation = materialButton;
        this.cvEnterPasswordWarning = materialCardView;
        this.imgKeyIcon = imageView;
        this.llPasswordRules = gridLayout;
        this.salariedWorkerPasswordContainer = constraintLayout;
        this.tilConfirmedPassword = textInputLayout;
        this.tilPassword = textInputLayout2;
        this.tvDigitValid = textView;
        this.tvLengthValid = textView2;
        this.tvPageSubtitle = textView3;
        this.tvSpecialCharValid = textView4;
        this.tvTitlePassword = textView5;
        this.tvUpperLowerValid = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentSalariedActivationWorkerPasswordBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSalariedActivationWorkerPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_salaried_activation_worker_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSalariedActivationWorkerPasswordBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cvEnterPasswordWarning;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEnterPasswordWarning);
            if (materialCardView != null) {
                i = R.id.imgKeyIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKeyIcon);
                if (imageView != null) {
                    i = R.id.llPasswordRules;
                    GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, R.id.llPasswordRules);
                    if (gridLayout != null) {
                        i = R.id.salariedWorkerPasswordContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerPasswordContainer);
                        if (constraintLayout != null) {
                            i = R.id.tilConfirmedPassword;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilConfirmedPassword);
                            if (textInputLayout != null) {
                                i = R.id.tilPassword;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassword);
                                if (textInputLayout2 != null) {
                                    i = R.id.tvDigitValid;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDigitValid);
                                    if (textView != null) {
                                        i = R.id.tvLengthValid;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLengthValid);
                                        if (textView2 != null) {
                                            i = R.id.tvPageSubtitle;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageSubtitle);
                                            if (textView3 != null) {
                                                i = R.id.tvSpecialCharValid;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSpecialCharValid);
                                                if (textView4 != null) {
                                                    i = R.id.tvTitlePassword;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePassword);
                                                    if (textView5 != null) {
                                                        i = R.id.tvUpperLowerValid;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUpperLowerValid);
                                                        if (textView6 != null) {
                                                            return new FragmentSalariedActivationWorkerPasswordBinding((ScrollView) view, materialButton, materialCardView, imageView, gridLayout, constraintLayout, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4, textView5, textView6);
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
