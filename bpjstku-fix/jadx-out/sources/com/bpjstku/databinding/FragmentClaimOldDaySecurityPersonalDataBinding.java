package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentClaimOldDaySecurityPersonalDataBinding implements ViewBinding {
    public final MaterialButton btnNo;
    public final MaterialButton btnYes;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final TextInputEditText edtBirthDate;
    public final TextInputEditText edtPhoneNumber;
    private final ScrollView rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilGender;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilKPJNumber;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvCorrectDataConfirmation;
    public final TextView tvReminderNoSipp;

    private FragmentClaimOldDaySecurityPersonalDataBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatCheckBox appCompatCheckBox, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnNo = materialButton;
        this.btnYes = materialButton2;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.edtBirthDate = textInputEditText;
        this.edtPhoneNumber = textInputEditText2;
        this.tilBirthDate = textInputLayout;
        this.tilEmail = textInputLayout2;
        this.tilFullName = textInputLayout3;
        this.tilGender = textInputLayout4;
        this.tilIdNumber = textInputLayout5;
        this.tilKPJNumber = textInputLayout6;
        this.tilPhoneNumber = textInputLayout7;
        this.tvCorrectDataConfirmation = textView;
        this.tvReminderNoSipp = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDaySecurityPersonalDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDaySecurityPersonalDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_day_security_personal_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDaySecurityPersonalDataBinding bind(View view) {
        int i = R.id.btnNo;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNo);
        if (materialButton != null) {
            i = R.id.btnYes;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnYes);
            if (materialButton2 != null) {
                i = R.id.cbAgreeTermCondition;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
                if (appCompatCheckBox != null) {
                    i = R.id.edtBirthDate;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                    if (textInputEditText != null) {
                        i = R.id.edtPhoneNumber;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                        if (textInputEditText2 != null) {
                            i = R.id.tilBirthDate;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                            if (textInputLayout != null) {
                                i = R.id.tilEmail;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilFullName;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                    if (textInputLayout3 != null) {
                                        i = R.id.tilGender;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilGender);
                                        if (textInputLayout4 != null) {
                                            i = R.id.tilIdNumber;
                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                            if (textInputLayout5 != null) {
                                                i = R.id.tilKPJNumber;
                                                TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilKPJNumber);
                                                if (textInputLayout6 != null) {
                                                    i = R.id.tilPhoneNumber;
                                                    TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                    if (textInputLayout7 != null) {
                                                        i = R.id.tvCorrectDataConfirmation;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCorrectDataConfirmation);
                                                        if (textView != null) {
                                                            i = R.id.tvReminderNoSipp;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderNoSipp);
                                                            if (textView2 != null) {
                                                                return new FragmentClaimOldDaySecurityPersonalDataBinding((ScrollView) view, materialButton, materialButton2, appCompatCheckBox, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textView, textView2);
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
