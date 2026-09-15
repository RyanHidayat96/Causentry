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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final MaterialCardView cvSalary;
    public final TextInputEditText edtChooseJob;
    public final TextInputEditText edtChooseLocation;
    public final TextInputEditText edtSalary;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseJob;
    public final TextInputLayout tilChooseLocation;
    public final TextInputLayout tilSalary;
    public final TextView tvPrefixSalary;
    public final TextView tvWarningPleaseFillYourPersonalDataNow;

    private FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvSalary = materialCardView;
        this.edtChooseJob = textInputEditText;
        this.edtChooseLocation = textInputEditText2;
        this.edtSalary = textInputEditText3;
        this.tilChooseJob = textInputLayout;
        this.tilChooseLocation = textInputLayout2;
        this.tilSalary = textInputLayout3;
        this.tvPrefixSalary = textView;
        this.tvWarningPleaseFillYourPersonalDataNow = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_resign_non_salaried_job_description_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvSalary;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvSalary);
            if (materialCardView != null) {
                i = R.id.edtChooseJob;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJob);
                if (textInputEditText != null) {
                    i = R.id.edtChooseLocation;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseLocation);
                    if (textInputEditText2 != null) {
                        i = R.id.edtSalary;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtSalary);
                        if (textInputEditText3 != null) {
                            i = R.id.tilChooseJob;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJob);
                            if (textInputLayout != null) {
                                i = R.id.tilChooseLocation;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseLocation);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilSalary;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSalary);
                                    if (textInputLayout3 != null) {
                                        i = R.id.tvPrefixSalary;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixSalary);
                                        if (textView != null) {
                                            i = R.id.tvWarningPleaseFillYourPersonalDataNow;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWarningPleaseFillYourPersonalDataNow);
                                            if (textView2 != null) {
                                                return new FragmentAsikResignNonSalariedJobDescriptionRegistrationBinding((ScrollView) view, materialButton, materialCardView, textInputEditText, textInputEditText2, textInputEditText3, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2);
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
