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
public final class FragmentAsikActiveParticipantOthersMembershipDataBinding implements ViewBinding {
    public final Button btnNext;
    public final TextInputEditText edtBankName;
    public final TextInputEditText edtPassportExpired;
    public final TextInputEditText edtPassportNumber;
    public final TextInputEditText edtPhoneNumber;
    private final ScrollView rootView;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankName;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilNpwp;
    public final TextInputLayout tilPassportExpired;
    public final TextInputLayout tilPassportNumber;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvBankData;
    public final TextView tvContactData;
    public final TextView tvNpwpPassport;
    public final TextView tvReminderVerifyDataPersonal;

    private FragmentAsikActiveParticipantOthersMembershipDataBinding(ScrollView scrollView, Button button, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.edtBankName = textInputEditText;
        this.edtPassportExpired = textInputEditText2;
        this.edtPassportNumber = textInputEditText3;
        this.edtPhoneNumber = textInputEditText4;
        this.tilBankAccountName = textInputLayout;
        this.tilBankAccountNumber = textInputLayout2;
        this.tilBankName = textInputLayout3;
        this.tilEmail = textInputLayout4;
        this.tilNpwp = textInputLayout5;
        this.tilPassportExpired = textInputLayout6;
        this.tilPassportNumber = textInputLayout7;
        this.tilPhoneNumber = textInputLayout8;
        this.tvBankData = textView;
        this.tvContactData = textView2;
        this.tvNpwpPassport = textView3;
        this.tvReminderVerifyDataPersonal = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantOthersMembershipDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantOthersMembershipDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_others_membership_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantOthersMembershipDataBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.edtBankName;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBankName);
            if (textInputEditText != null) {
                i = R.id.edtPassportExpired;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPassportExpired);
                if (textInputEditText2 != null) {
                    i = R.id.edtPassportNumber;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPassportNumber);
                    if (textInputEditText3 != null) {
                        i = R.id.edtPhoneNumber;
                        TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                        if (textInputEditText4 != null) {
                            i = R.id.tilBankAccountName;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                            if (textInputLayout != null) {
                                i = R.id.tilBankAccountNumber;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilBankName;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                    if (textInputLayout3 != null) {
                                        i = R.id.tilEmail;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                        if (textInputLayout4 != null) {
                                            i = R.id.tilNpwp;
                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNpwp);
                                            if (textInputLayout5 != null) {
                                                i = R.id.tilPassportExpired;
                                                TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassportExpired);
                                                if (textInputLayout6 != null) {
                                                    i = R.id.tilPassportNumber;
                                                    TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassportNumber);
                                                    if (textInputLayout7 != null) {
                                                        i = R.id.tilPhoneNumber;
                                                        TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                        if (textInputLayout8 != null) {
                                                            i = R.id.tvBankData;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBankData);
                                                            if (textView != null) {
                                                                i = R.id.tvContactData;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvContactData);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvNpwpPassport;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNpwpPassport);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvReminderVerifyDataPersonal;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                        if (textView4 != null) {
                                                                            return new FragmentAsikActiveParticipantOthersMembershipDataBinding((ScrollView) view, button, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textView, textView2, textView3, textView4);
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
