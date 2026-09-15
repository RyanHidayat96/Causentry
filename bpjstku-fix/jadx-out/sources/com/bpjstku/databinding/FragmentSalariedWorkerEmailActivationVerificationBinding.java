package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSalariedWorkerEmailActivationVerificationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ImageView imgMail;
    private final ScrollView rootView;
    public final ConstraintLayout salariedWorkerEmailContainer;
    public final TextInputLayout tilEmail;
    public final TextView tvEnterEmail;
    public final TextView tvEnterEmailInstruction;

    private FragmentSalariedWorkerEmailActivationVerificationBinding(ScrollView scrollView, MaterialButton materialButton, ImageView imageView, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.imgMail = imageView;
        this.salariedWorkerEmailContainer = constraintLayout;
        this.tilEmail = textInputLayout;
        this.tvEnterEmail = textView;
        this.tvEnterEmailInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentSalariedWorkerEmailActivationVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSalariedWorkerEmailActivationVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_salaried_worker_email_activation_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSalariedWorkerEmailActivationVerificationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.imgMail;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMail);
            if (imageView != null) {
                i = R.id.salariedWorkerEmailContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerEmailContainer);
                if (constraintLayout != null) {
                    i = R.id.tilEmail;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                    if (textInputLayout != null) {
                        i = R.id.tvEnterEmail;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterEmail);
                        if (textView != null) {
                            i = R.id.tvEnterEmailInstruction;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterEmailInstruction);
                            if (textView2 != null) {
                                return new FragmentSalariedWorkerEmailActivationVerificationBinding((ScrollView) view, materialButton, imageView, constraintLayout, textInputLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
