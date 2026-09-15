package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
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
public final class FragmentAsikActiveParticipantContactDataBinding implements ViewBinding {
    public final AutoCompleteTextView actvSpinnerCountryCode;
    public final MaterialButton btnNext;
    public final MaterialCardView cvPhoneNumber;
    public final TextInputEditText edtPhoneNumber;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseCountryCode;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilMotherName;
    public final TextInputLayout tilNpwp;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvReminderVerifyDataContact;

    private FragmentAsikActiveParticipantContactDataBinding(ScrollView scrollView, AutoCompleteTextView autoCompleteTextView, MaterialButton materialButton, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextView textView) {
        this.rootView = scrollView;
        this.actvSpinnerCountryCode = autoCompleteTextView;
        this.btnNext = materialButton;
        this.cvPhoneNumber = materialCardView;
        this.edtPhoneNumber = textInputEditText;
        this.tilChooseCountryCode = textInputLayout;
        this.tilEmail = textInputLayout2;
        this.tilMotherName = textInputLayout3;
        this.tilNpwp = textInputLayout4;
        this.tilPhoneNumber = textInputLayout5;
        this.tvReminderVerifyDataContact = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantContactDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantContactDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_contact_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantContactDataBinding bind(View view) {
        int i = R.id.actvSpinnerCountryCode;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvSpinnerCountryCode);
        if (autoCompleteTextView != null) {
            i = R.id.btnNext;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton != null) {
                i = R.id.cvPhoneNumber;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumber);
                if (materialCardView != null) {
                    i = R.id.edtPhoneNumber;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                    if (textInputEditText != null) {
                        i = R.id.tilChooseCountryCode;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseCountryCode);
                        if (textInputLayout != null) {
                            i = R.id.tilEmail;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                            if (textInputLayout2 != null) {
                                i = R.id.tilMotherName;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMotherName);
                                if (textInputLayout3 != null) {
                                    i = R.id.tilNpwp;
                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNpwp);
                                    if (textInputLayout4 != null) {
                                        i = R.id.tilPhoneNumber;
                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                        if (textInputLayout5 != null) {
                                            i = R.id.tvReminderVerifyDataContact;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataContact);
                                            if (textView != null) {
                                                return new FragmentAsikActiveParticipantContactDataBinding((ScrollView) view, autoCompleteTextView, materialButton, materialCardView, textInputEditText, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textView);
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
