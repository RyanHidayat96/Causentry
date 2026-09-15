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

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAsikActiveUpdateSecondaryDataBinding implements ViewBinding {
    public final Button btnNext;
    public final TextInputEditText edtAddressPostalCode;
    public final TextInputEditText edtAddressPostalCodeEmergency;
    public final TextInputEditText edtBankName;
    public final TextInputEditText edtFamilyStatus;
    public final TextInputEditText edtLastEducation;
    public final TextInputEditText edtPhoneNumber;
    public final TextInputEditText edtReligion;
    private final ScrollView rootView;
    public final TextInputLayout tilAddressEmergency;
    public final TextInputLayout tilAddressPostalCode;
    public final TextInputLayout tilAddressPostalCodeEmergency;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankName;
    public final TextInputLayout tilFamilyStatus;
    public final TextInputLayout tilFullNameEmergency;
    public final TextInputLayout tilLastEducation;
    public final TextInputLayout tilParticipantAddress;
    public final TextInputLayout tilPhoneNumber;
    public final TextInputLayout tilPhoneNumberEmergency;
    public final TextInputLayout tilReligion;
    public final TextView tvAddressAndContactData;
    public final TextView tvBankData;
    public final TextView tvEducationAndReligion;
    public final TextView tvEmergencyContact;
    public final TextView tvReminderVerifyDataPersonal;

    private FragmentAsikActiveUpdateSecondaryDataBinding(ScrollView scrollView, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextInputLayout textInputLayout13, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.edtAddressPostalCode = textInputEditText;
        this.edtAddressPostalCodeEmergency = textInputEditText2;
        this.edtBankName = textInputEditText3;
        this.edtFamilyStatus = textInputEditText4;
        this.edtLastEducation = textInputEditText5;
        this.edtPhoneNumber = textInputEditText6;
        this.edtReligion = textInputEditText7;
        this.tilAddressEmergency = textInputLayout;
        this.tilAddressPostalCode = textInputLayout2;
        this.tilAddressPostalCodeEmergency = textInputLayout3;
        this.tilBankAccountName = textInputLayout4;
        this.tilBankAccountNumber = textInputLayout5;
        this.tilBankName = textInputLayout6;
        this.tilFamilyStatus = textInputLayout7;
        this.tilFullNameEmergency = textInputLayout8;
        this.tilLastEducation = textInputLayout9;
        this.tilParticipantAddress = textInputLayout10;
        this.tilPhoneNumber = textInputLayout11;
        this.tilPhoneNumberEmergency = textInputLayout12;
        this.tilReligion = textInputLayout13;
        this.tvAddressAndContactData = textView;
        this.tvBankData = textView2;
        this.tvEducationAndReligion = textView3;
        this.tvEmergencyContact = textView4;
        this.tvReminderVerifyDataPersonal = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveUpdateSecondaryDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveUpdateSecondaryDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_update_secondary_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveUpdateSecondaryDataBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.edtAddressPostalCode;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtAddressPostalCode);
            if (textInputEditText != null) {
                i = R.id.edtAddressPostalCodeEmergency;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtAddressPostalCodeEmergency);
                if (textInputEditText2 != null) {
                    i = R.id.edtBankName;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBankName);
                    if (textInputEditText3 != null) {
                        i = R.id.edtFamilyStatus;
                        TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFamilyStatus);
                        if (textInputEditText4 != null) {
                            i = R.id.edtLastEducation;
                            TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtLastEducation);
                            if (textInputEditText5 != null) {
                                i = R.id.edtPhoneNumber;
                                TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                                if (textInputEditText6 != null) {
                                    i = R.id.edtReligion;
                                    TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReligion);
                                    if (textInputEditText7 != null) {
                                        i = R.id.tilAddressEmergency;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressEmergency);
                                        if (textInputLayout != null) {
                                            i = R.id.tilAddressPostalCode;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressPostalCode);
                                            if (textInputLayout2 != null) {
                                                i = R.id.tilAddressPostalCodeEmergency;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressPostalCodeEmergency);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.tilBankAccountName;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                                                    if (textInputLayout4 != null) {
                                                        i = R.id.tilBankAccountNumber;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                                        if (textInputLayout5 != null) {
                                                            i = R.id.tilBankName;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                                            if (textInputLayout6 != null) {
                                                                i = R.id.tilFamilyStatus;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFamilyStatus);
                                                                if (textInputLayout7 != null) {
                                                                    i = R.id.tilFullNameEmergency;
                                                                    TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullNameEmergency);
                                                                    if (textInputLayout8 != null) {
                                                                        i = R.id.tilLastEducation;
                                                                        TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilLastEducation);
                                                                        if (textInputLayout9 != null) {
                                                                            i = R.id.tilParticipantAddress;
                                                                            TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilParticipantAddress);
                                                                            if (textInputLayout10 != null) {
                                                                                i = R.id.tilPhoneNumber;
                                                                                TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                                                if (textInputLayout11 != null) {
                                                                                    i = R.id.tilPhoneNumberEmergency;
                                                                                    TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumberEmergency);
                                                                                    if (textInputLayout12 != null) {
                                                                                        i = R.id.tilReligion;
                                                                                        TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReligion);
                                                                                        if (textInputLayout13 != null) {
                                                                                            i = R.id.tvAddressAndContactData;
                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAddressAndContactData);
                                                                                            if (textView != null) {
                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBankData);
                                                                                                if (textView2 != null) {
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEducationAndReligion);
                                                                                                    if (textView3 != null) {
                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmergencyContact);
                                                                                                        if (textView4 != null) {
                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                            if (textView5 != null) {
                                                                                                                return new FragmentAsikActiveUpdateSecondaryDataBinding((ScrollView) view, button, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textView, textView2, textView3, textView4, textView5);
                                                                                                            }
                                                                                                            i = R.id.tvReminderVerifyDataPersonal;
                                                                                                        } else {
                                                                                                            i = R.id.tvEmergencyContact;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvEducationAndReligion;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvBankData;
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
