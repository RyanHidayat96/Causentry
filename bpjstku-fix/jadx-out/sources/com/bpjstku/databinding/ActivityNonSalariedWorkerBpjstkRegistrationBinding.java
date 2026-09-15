package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityNonSalariedWorkerBpjstkRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtBirthDate;
    public final LayoutToolbarBinding layoutToolbar;
    public final ConstraintLayout nonSalariedWorkerRegistrationContainer;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextView tvCompleteYourPersonalData;

    private ActivityNonSalariedWorkerBpjstkRegistrationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, LayoutToolbarBinding layoutToolbarBinding, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.edtBirthDate = textInputEditText;
        this.layoutToolbar = layoutToolbarBinding;
        this.nonSalariedWorkerRegistrationContainer = constraintLayout2;
        this.tilBirthDate = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdNumber = textInputLayout3;
        this.tvCompleteYourPersonalData = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNonSalariedWorkerBpjstkRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNonSalariedWorkerBpjstkRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_non_salaried_worker_bpjstk_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNonSalariedWorkerBpjstkRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.edtBirthDate;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
            if (textInputEditText != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.tilBirthDate;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                    if (textInputLayout != null) {
                        i = R.id.tilFullName;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                        if (textInputLayout2 != null) {
                            i = R.id.tilIdNumber;
                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                            if (textInputLayout3 != null) {
                                i = R.id.tvCompleteYourPersonalData;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCompleteYourPersonalData);
                                if (textView != null) {
                                    return new ActivityNonSalariedWorkerBpjstkRegistrationBinding(constraintLayout, materialButton, textInputEditText, layoutToolbarBindingBind, constraintLayout, textInputLayout, textInputLayout2, textInputLayout3, textView);
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
