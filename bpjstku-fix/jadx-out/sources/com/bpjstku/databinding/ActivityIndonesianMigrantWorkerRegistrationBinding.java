package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityIndonesianMigrantWorkerRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtBirthDate;
    public final LayoutToolbarBinding layoutToolbar;
    public final RadioButton rbNIK;
    public final RadioButton rbPaspor;
    public final RadioGroup rgChooseIdentity;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdPassport;
    public final TextInputLayout tilIdentityNumber;
    public final TextView tvCompleteYourPersonalData;
    public final TextView tvLabelIdentity;

    private ActivityIndonesianMigrantWorkerRegistrationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, LayoutToolbarBinding layoutToolbarBinding, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.edtBirthDate = textInputEditText;
        this.layoutToolbar = layoutToolbarBinding;
        this.rbNIK = radioButton;
        this.rbPaspor = radioButton2;
        this.rgChooseIdentity = radioGroup;
        this.tilBirthDate = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdPassport = textInputLayout3;
        this.tilIdentityNumber = textInputLayout4;
        this.tvCompleteYourPersonalData = textView;
        this.tvLabelIdentity = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityIndonesianMigrantWorkerRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityIndonesianMigrantWorkerRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_indonesian_migrant_worker_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityIndonesianMigrantWorkerRegistrationBinding bind(View view) {
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
                    i = R.id.rbNIK;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbNIK);
                    if (radioButton != null) {
                        i = R.id.rbPaspor;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbPaspor);
                        if (radioButton2 != null) {
                            i = R.id.rgChooseIdentity;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseIdentity);
                            if (radioGroup != null) {
                                i = R.id.tilBirthDate;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                if (textInputLayout != null) {
                                    i = R.id.tilFullName;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilIdPassport;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdPassport);
                                        if (textInputLayout3 != null) {
                                            i = R.id.tilIdentityNumber;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                            if (textInputLayout4 != null) {
                                                i = R.id.tvCompleteYourPersonalData;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCompleteYourPersonalData);
                                                if (textView != null) {
                                                    i = R.id.tvLabelIdentity;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelIdentity);
                                                    if (textView2 != null) {
                                                        return new ActivityIndonesianMigrantWorkerRegistrationBinding((ConstraintLayout) view, materialButton, textInputEditText, layoutToolbarBindingBind, radioButton, radioButton2, radioGroup, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2);
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
