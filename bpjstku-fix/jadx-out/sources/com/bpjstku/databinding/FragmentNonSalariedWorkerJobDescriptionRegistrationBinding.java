package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNonSalariedWorkerJobDescriptionRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtChooseJobFirst;
    public final TextInputEditText edtChooseJobSecond;
    public final TextInputEditText edtChooseLocation;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseJobFirst;
    public final TextInputLayout tilChooseJobSecond;
    public final TextInputLayout tilChooseLocation;

    private FragmentNonSalariedWorkerJobDescriptionRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.edtChooseJobFirst = textInputEditText;
        this.edtChooseJobSecond = textInputEditText2;
        this.edtChooseLocation = textInputEditText3;
        this.tilChooseJobFirst = textInputLayout;
        this.tilChooseJobSecond = textInputLayout2;
        this.tilChooseLocation = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerJobDescriptionRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerJobDescriptionRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_job_description_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerJobDescriptionRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.edtChooseJobFirst;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJobFirst);
            if (textInputEditText != null) {
                i = R.id.edtChooseJobSecond;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJobSecond);
                if (textInputEditText2 != null) {
                    i = R.id.edtChooseLocation;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseLocation);
                    if (textInputEditText3 != null) {
                        i = R.id.tilChooseJobFirst;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobFirst);
                        if (textInputLayout != null) {
                            i = R.id.tilChooseJobSecond;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobSecond);
                            if (textInputLayout2 != null) {
                                i = R.id.tilChooseLocation;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseLocation);
                                if (textInputLayout3 != null) {
                                    return new FragmentNonSalariedWorkerJobDescriptionRegistrationBinding((ScrollView) view, materialButton, textInputEditText, textInputEditText2, textInputEditText3, textInputLayout, textInputLayout2, textInputLayout3);
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
