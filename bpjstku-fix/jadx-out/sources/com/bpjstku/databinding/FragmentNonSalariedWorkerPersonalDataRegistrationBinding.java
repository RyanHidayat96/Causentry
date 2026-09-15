package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNonSalariedWorkerPersonalDataRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtBirthDate;
    public final ConstraintLayout nonSalariedWorkerPersonalDataContainer;
    private final ScrollView rootView;
    public final TextInputLayout tilAddress;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilPostalCode;

    private FragmentNonSalariedWorkerPersonalDataRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.edtBirthDate = textInputEditText;
        this.nonSalariedWorkerPersonalDataContainer = constraintLayout;
        this.tilAddress = textInputLayout;
        this.tilBirthDate = textInputLayout2;
        this.tilFullName = textInputLayout3;
        this.tilIdNumber = textInputLayout4;
        this.tilPostalCode = textInputLayout5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerPersonalDataRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerPersonalDataRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_personal_data_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerPersonalDataRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.edtBirthDate;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
            if (textInputEditText != null) {
                i = R.id.nonSalariedWorkerPersonalDataContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.nonSalariedWorkerPersonalDataContainer);
                if (constraintLayout != null) {
                    i = R.id.tilAddress;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddress);
                    if (textInputLayout != null) {
                        i = R.id.tilBirthDate;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                        if (textInputLayout2 != null) {
                            i = R.id.tilFullName;
                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                            if (textInputLayout3 != null) {
                                i = R.id.tilIdNumber;
                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                if (textInputLayout4 != null) {
                                    i = R.id.tilPostalCode;
                                    TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPostalCode);
                                    if (textInputLayout5 != null) {
                                        return new FragmentNonSalariedWorkerPersonalDataRegistrationBinding((ScrollView) view, materialButton, textInputEditText, constraintLayout, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5);
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
