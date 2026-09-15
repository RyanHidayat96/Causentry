package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikActiveParticipantEmergencyContactBinding implements ViewBinding {
    public final Button btnNext;
    public final TextInputEditText edtAddressPostalCode;
    public final TextInputEditText edtBloodType;
    public final TextInputEditText edtFamilyStatus;
    public final TextInputEditText edtLastEducation;
    public final TextInputEditText edtReligion;
    private final ScrollView rootView;
    public final TextInputLayout tilAddressEmergency;
    public final TextInputLayout tilAddressPostalCode;
    public final TextInputLayout tilBloodType;
    public final TextInputLayout tilFamilyStatus;
    public final TextInputLayout tilFullNameEmergency;
    public final TextInputLayout tilLastEducation;
    public final TextInputLayout tilPhoneNumberEmergency;
    public final TextInputLayout tilReligion;
    public final TextView tvEmergencyContact;
    public final TextView tvReminderVerifyDataPersonal;

    private FragmentAsikActiveParticipantEmergencyContactBinding(ScrollView scrollView, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.edtAddressPostalCode = textInputEditText;
        this.edtBloodType = textInputEditText2;
        this.edtFamilyStatus = textInputEditText3;
        this.edtLastEducation = textInputEditText4;
        this.edtReligion = textInputEditText5;
        this.tilAddressEmergency = textInputLayout;
        this.tilAddressPostalCode = textInputLayout2;
        this.tilBloodType = textInputLayout3;
        this.tilFamilyStatus = textInputLayout4;
        this.tilFullNameEmergency = textInputLayout5;
        this.tilLastEducation = textInputLayout6;
        this.tilPhoneNumberEmergency = textInputLayout7;
        this.tilReligion = textInputLayout8;
        this.tvEmergencyContact = textView;
        this.tvReminderVerifyDataPersonal = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantEmergencyContactBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantEmergencyContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_emergency_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantEmergencyContactBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.edtAddressPostalCode;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtAddressPostalCode);
            if (textInputEditText != null) {
                i = R.id.edtBloodType;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBloodType);
                if (textInputEditText2 != null) {
                    i = R.id.edtFamilyStatus;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFamilyStatus);
                    if (textInputEditText3 != null) {
                        i = R.id.edtLastEducation;
                        TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtLastEducation);
                        if (textInputEditText4 != null) {
                            i = R.id.edtReligion;
                            TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReligion);
                            if (textInputEditText5 != null) {
                                i = R.id.tilAddressEmergency;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressEmergency);
                                if (textInputLayout != null) {
                                    i = R.id.tilAddressPostalCode;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressPostalCode);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilBloodType;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBloodType);
                                        if (textInputLayout3 != null) {
                                            i = R.id.tilFamilyStatus;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFamilyStatus);
                                            if (textInputLayout4 != null) {
                                                i = R.id.tilFullNameEmergency;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullNameEmergency);
                                                if (textInputLayout5 != null) {
                                                    i = R.id.tilLastEducation;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilLastEducation);
                                                    if (textInputLayout6 != null) {
                                                        i = R.id.tilPhoneNumberEmergency;
                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumberEmergency);
                                                        if (textInputLayout7 != null) {
                                                            i = R.id.tilReligion;
                                                            TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReligion);
                                                            if (textInputLayout8 != null) {
                                                                i = R.id.tvEmergencyContact;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmergencyContact);
                                                                if (textView != null) {
                                                                    i = R.id.tvReminderVerifyDataPersonal;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                    if (textView2 != null) {
                                                                        return new FragmentAsikActiveParticipantEmergencyContactBinding((ScrollView) view, button, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textView, textView2);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
