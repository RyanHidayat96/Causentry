package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentVocationalFillParticipantDataBinding implements ViewBinding {
    public final TextInputEditText actvBankName;
    public final TextInputEditText actvFormalEducation;
    public final Button btnNext;
    public final CardView cvExpectedSalaries;
    public final TextInputEditText edtChooseJamsostekIdNumber;
    public final TextInputEditText edtExpectedSalaries;
    private final ScrollView rootView;
    public final TextInputLayout tilAddress;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankBranchOffice;
    public final TextInputLayout tilBankName;
    public final TextInputLayout tilExpectedSalaries;
    public final TextInputLayout tilExpertiseArea;
    public final TextInputLayout tilFormalEducation;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdentityNumber;
    public final TextInputLayout tilJamsostekIdNumber;
    public final TextInputLayout tilNpwp;
    public final TextInputLayout tilWorkExperience;
    public final TextView tvAccountInformation;
    public final TextView tvOtherInformations;
    public final TextView tvPersonalData;
    public final TextView tvWorkExperience;
    public final TextView tvWorkExperienceExample;

    private FragmentVocationalFillParticipantDataBinding(ScrollView scrollView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, Button button, CardView cardView, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextInputLayout textInputLayout13, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.actvBankName = textInputEditText;
        this.actvFormalEducation = textInputEditText2;
        this.btnNext = button;
        this.cvExpectedSalaries = cardView;
        this.edtChooseJamsostekIdNumber = textInputEditText3;
        this.edtExpectedSalaries = textInputEditText4;
        this.tilAddress = textInputLayout;
        this.tilBankAccountName = textInputLayout2;
        this.tilBankAccountNumber = textInputLayout3;
        this.tilBankBranchOffice = textInputLayout4;
        this.tilBankName = textInputLayout5;
        this.tilExpectedSalaries = textInputLayout6;
        this.tilExpertiseArea = textInputLayout7;
        this.tilFormalEducation = textInputLayout8;
        this.tilFullName = textInputLayout9;
        this.tilIdentityNumber = textInputLayout10;
        this.tilJamsostekIdNumber = textInputLayout11;
        this.tilNpwp = textInputLayout12;
        this.tilWorkExperience = textInputLayout13;
        this.tvAccountInformation = textView;
        this.tvOtherInformations = textView2;
        this.tvPersonalData = textView3;
        this.tvWorkExperience = textView4;
        this.tvWorkExperienceExample = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalFillParticipantDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalFillParticipantDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_fill_participant_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalFillParticipantDataBinding bind(View view) {
        int i = R.id.actvBankName;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.actvBankName);
        if (textInputEditText != null) {
            i = R.id.actvFormalEducation;
            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.actvFormalEducation);
            if (textInputEditText2 != null) {
                i = R.id.btnNext;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
                if (button != null) {
                    i = R.id.cvExpectedSalaries;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvExpectedSalaries);
                    if (cardView != null) {
                        i = R.id.edtChooseJamsostekIdNumber;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJamsostekIdNumber);
                        if (textInputEditText3 != null) {
                            i = R.id.edtExpectedSalaries;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtExpectedSalaries);
                            if (textInputEditText4 != null) {
                                i = R.id.tilAddress;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddress);
                                if (textInputLayout != null) {
                                    i = R.id.tilBankAccountName;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilBankAccountNumber;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                        if (textInputLayout3 != null) {
                                            i = R.id.tilBankBranchOffice;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankBranchOffice);
                                            if (textInputLayout4 != null) {
                                                i = R.id.tilBankName;
                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                                if (textInputLayout5 != null) {
                                                    i = R.id.tilExpectedSalaries;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilExpectedSalaries);
                                                    if (textInputLayout6 != null) {
                                                        i = R.id.tilExpertiseArea;
                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilExpertiseArea);
                                                        if (textInputLayout7 != null) {
                                                            i = R.id.tilFormalEducation;
                                                            TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFormalEducation);
                                                            if (textInputLayout8 != null) {
                                                                i = R.id.tilFullName;
                                                                TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                                if (textInputLayout9 != null) {
                                                                    i = R.id.tilIdentityNumber;
                                                                    TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                                                    if (textInputLayout10 != null) {
                                                                        i = R.id.tilJamsostekIdNumber;
                                                                        TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilJamsostekIdNumber);
                                                                        if (textInputLayout11 != null) {
                                                                            i = R.id.tilNpwp;
                                                                            TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNpwp);
                                                                            if (textInputLayout12 != null) {
                                                                                i = R.id.tilWorkExperience;
                                                                                TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilWorkExperience);
                                                                                if (textInputLayout13 != null) {
                                                                                    i = R.id.tvAccountInformation;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAccountInformation);
                                                                                    if (textView != null) {
                                                                                        i = R.id.tvOtherInformations;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherInformations);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.tvPersonalData;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPersonalData);
                                                                                            if (textView3 != null) {
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkExperience);
                                                                                                if (textView4 != null) {
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkExperienceExample);
                                                                                                    if (textView5 != null) {
                                                                                                        return new FragmentVocationalFillParticipantDataBinding((ScrollView) view, textInputEditText, textInputEditText2, button, cardView, textInputEditText3, textInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textView, textView2, textView3, textView4, textView5);
                                                                                                    }
                                                                                                    i = R.id.tvWorkExperienceExample;
                                                                                                } else {
                                                                                                    i = R.id.tvWorkExperience;
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
