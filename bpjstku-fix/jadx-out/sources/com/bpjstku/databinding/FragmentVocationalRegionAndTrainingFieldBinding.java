package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentVocationalRegionAndTrainingFieldBinding implements ViewBinding {
    public final Button btnFindTraining;
    public final TextInputEditText edtCity;
    public final TextInputEditText edtProvince;
    public final AutoCompleteTextView edtTrainingField;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilTrainingField;
    public final TextInputLayout tilTrainingProvince;
    public final TextInputLayout tilTrainingRegion;

    private FragmentVocationalRegionAndTrainingFieldBinding(ConstraintLayout constraintLayout, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.rootView = constraintLayout;
        this.btnFindTraining = button;
        this.edtCity = textInputEditText;
        this.edtProvince = textInputEditText2;
        this.edtTrainingField = autoCompleteTextView;
        this.tilTrainingField = textInputLayout;
        this.tilTrainingProvince = textInputLayout2;
        this.tilTrainingRegion = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalRegionAndTrainingFieldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalRegionAndTrainingFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_region_and_training_field, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalRegionAndTrainingFieldBinding bind(View view) {
        int i = R.id.btnFindTraining;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnFindTraining);
        if (button != null) {
            i = R.id.edtCity;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtCity);
            if (textInputEditText != null) {
                i = R.id.edtProvince;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtProvince);
                if (textInputEditText2 != null) {
                    i = R.id.edtTrainingField;
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.edtTrainingField);
                    if (autoCompleteTextView != null) {
                        i = R.id.tilTrainingField;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTrainingField);
                        if (textInputLayout != null) {
                            i = R.id.tilTrainingProvince;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTrainingProvince);
                            if (textInputLayout2 != null) {
                                i = R.id.tilTrainingRegion;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTrainingRegion);
                                if (textInputLayout3 != null) {
                                    return new FragmentVocationalRegionAndTrainingFieldBinding((ConstraintLayout) view, button, textInputEditText, textInputEditText2, autoCompleteTextView, textInputLayout, textInputLayout2, textInputLayout3);
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
