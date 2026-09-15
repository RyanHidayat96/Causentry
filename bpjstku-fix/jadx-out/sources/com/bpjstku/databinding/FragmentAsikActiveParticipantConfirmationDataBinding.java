package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikActiveParticipantConfirmationDataBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final TextInputEditText edtEmail;
    public final TextInputEditText edtFullname;
    public final TextInputEditText edtIdentityNumber;
    public final TextInputEditText edtNPWP;
    public final TextInputEditText edtPhoneNumber;
    public final LinearLayout kpjContainer;
    private final LinearLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdentityNumber;
    public final TextInputLayout tilNPWP;
    public final TextInputLayout tilPhoneNumber;

    private FragmentAsikActiveParticipantConfirmationDataBinding(LinearLayout linearLayout, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, LinearLayout linearLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5) {
        this.rootView = linearLayout;
        this.btnConfirmation = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.edtEmail = textInputEditText;
        this.edtFullname = textInputEditText2;
        this.edtIdentityNumber = textInputEditText3;
        this.edtNPWP = textInputEditText4;
        this.edtPhoneNumber = textInputEditText5;
        this.kpjContainer = linearLayout2;
        this.tilEmail = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdentityNumber = textInputLayout3;
        this.tilNPWP = textInputLayout4;
        this.tilPhoneNumber = textInputLayout5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantConfirmationDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantConfirmationDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_confirmation_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantConfirmationDataBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.edtEmail;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
                if (textInputEditText != null) {
                    i = R.id.edtFullname;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFullname);
                    if (textInputEditText2 != null) {
                        i = R.id.edtIdentityNumber;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdentityNumber);
                        if (textInputEditText3 != null) {
                            i = R.id.edtNPWP;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtNPWP);
                            if (textInputEditText4 != null) {
                                i = R.id.edtPhoneNumber;
                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                                if (textInputEditText5 != null) {
                                    i = R.id.kpjContainer;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.kpjContainer);
                                    if (linearLayout != null) {
                                        i = R.id.tilEmail;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                        if (textInputLayout != null) {
                                            i = R.id.tilFullName;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                            if (textInputLayout2 != null) {
                                                i = R.id.tilIdentityNumber;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.tilNPWP;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNPWP);
                                                    if (textInputLayout4 != null) {
                                                        i = R.id.tilPhoneNumber;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                        if (textInputLayout5 != null) {
                                                            return new FragmentAsikActiveParticipantConfirmationDataBinding((LinearLayout) view, materialButton, appCompatCheckBox, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, linearLayout, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5);
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
