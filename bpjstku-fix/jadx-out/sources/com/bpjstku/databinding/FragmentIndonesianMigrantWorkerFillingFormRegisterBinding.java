package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIndonesianMigrantWorkerFillingFormRegisterBinding implements ViewBinding {
    public final AutoCompleteTextView actvSpinnerCountryCode;
    public final MaterialButton btnNext;
    public final MaterialCardView cvEmployerPhoneNumber;
    public final MaterialCardView cvPhoneNumberEmployee;
    public final TextInputEditText edtEmployerPhoneNumber;
    public final TextInputEditText edtEndDateAgreement;
    public final TextInputEditText edtPhoneNumberEmployee;
    public final TextInputEditText edtPublishedPassportDate;
    public final TextInputEditText edtPublishedVisaDate;
    public final TextInputEditText edtStartDateAgreement;
    public final ConstraintLayout indonesianMigrantWorkerFormContainer;
    public final RadioButton rbFormal;
    public final RadioButton rbInformal;
    public final RadioGroup rgJobStatus;
    private final ScrollView rootView;
    public final TextInputLayout tilAgreementNumber;
    public final TextInputLayout tilChooseCountryCode;
    public final TextInputLayout tilChooseJobType;
    public final TextInputLayout tilChooseWorkingCountry;
    public final TextInputLayout tilEChooseEmployerCity;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilEmailConfirmation;
    public final TextInputLayout tilEmployerAddress;
    public final TextInputLayout tilEmployerIdentityNumber;
    public final TextInputLayout tilEmployerName;
    public final TextInputLayout tilEmployerPhoneNumber;
    public final TextInputLayout tilEndDateAgreement;
    public final TextInputLayout tilIssuedPassportDate;
    public final TextInputLayout tilPassportNumber;
    public final TextInputLayout tilPhoneNumberEmployee;
    public final TextInputLayout tilPublishedVisaDate;
    public final TextInputLayout tilStartDateAgreement;
    public final TextInputLayout tilVisaNumber;
    public final AppCompatTextView tvContactInfo;
    public final AppCompatTextView tvEmailInformation;
    public final AppCompatTextView tvEmployerInfo;
    public final AppCompatTextView tvJobInfo;
    public final AppCompatTextView tvJobStatus;
    public final TextView tvPrefix;

    private FragmentIndonesianMigrantWorkerFillingFormRegisterBinding(ScrollView scrollView, AutoCompleteTextView autoCompleteTextView, MaterialButton materialButton, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, ConstraintLayout constraintLayout, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextInputLayout textInputLayout13, TextInputLayout textInputLayout14, TextInputLayout textInputLayout15, TextInputLayout textInputLayout16, TextInputLayout textInputLayout17, TextInputLayout textInputLayout18, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, TextView textView) {
        this.rootView = scrollView;
        this.actvSpinnerCountryCode = autoCompleteTextView;
        this.btnNext = materialButton;
        this.cvEmployerPhoneNumber = materialCardView;
        this.cvPhoneNumberEmployee = materialCardView2;
        this.edtEmployerPhoneNumber = textInputEditText;
        this.edtEndDateAgreement = textInputEditText2;
        this.edtPhoneNumberEmployee = textInputEditText3;
        this.edtPublishedPassportDate = textInputEditText4;
        this.edtPublishedVisaDate = textInputEditText5;
        this.edtStartDateAgreement = textInputEditText6;
        this.indonesianMigrantWorkerFormContainer = constraintLayout;
        this.rbFormal = radioButton;
        this.rbInformal = radioButton2;
        this.rgJobStatus = radioGroup;
        this.tilAgreementNumber = textInputLayout;
        this.tilChooseCountryCode = textInputLayout2;
        this.tilChooseJobType = textInputLayout3;
        this.tilChooseWorkingCountry = textInputLayout4;
        this.tilEChooseEmployerCity = textInputLayout5;
        this.tilEmail = textInputLayout6;
        this.tilEmailConfirmation = textInputLayout7;
        this.tilEmployerAddress = textInputLayout8;
        this.tilEmployerIdentityNumber = textInputLayout9;
        this.tilEmployerName = textInputLayout10;
        this.tilEmployerPhoneNumber = textInputLayout11;
        this.tilEndDateAgreement = textInputLayout12;
        this.tilIssuedPassportDate = textInputLayout13;
        this.tilPassportNumber = textInputLayout14;
        this.tilPhoneNumberEmployee = textInputLayout15;
        this.tilPublishedVisaDate = textInputLayout16;
        this.tilStartDateAgreement = textInputLayout17;
        this.tilVisaNumber = textInputLayout18;
        this.tvContactInfo = appCompatTextView;
        this.tvEmailInformation = appCompatTextView2;
        this.tvEmployerInfo = appCompatTextView3;
        this.tvJobInfo = appCompatTextView4;
        this.tvJobStatus = appCompatTextView5;
        this.tvPrefix = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesianMigrantWorkerFillingFormRegisterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesianMigrantWorkerFillingFormRegisterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesian_migrant_worker_filling_form_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesianMigrantWorkerFillingFormRegisterBinding bind(View view) {
        int i = R.id.actvSpinnerCountryCode;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvSpinnerCountryCode);
        if (autoCompleteTextView != null) {
            i = R.id.btnNext;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton != null) {
                i = R.id.cvEmployerPhoneNumber;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEmployerPhoneNumber);
                if (materialCardView != null) {
                    i = R.id.cvPhoneNumberEmployee;
                    MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumberEmployee);
                    if (materialCardView2 != null) {
                        i = R.id.edtEmployerPhoneNumber;
                        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmployerPhoneNumber);
                        if (textInputEditText != null) {
                            i = R.id.edtEndDateAgreement;
                            TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEndDateAgreement);
                            if (textInputEditText2 != null) {
                                i = R.id.edtPhoneNumberEmployee;
                                TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumberEmployee);
                                if (textInputEditText3 != null) {
                                    i = R.id.edtPublishedPassportDate;
                                    TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPublishedPassportDate);
                                    if (textInputEditText4 != null) {
                                        i = R.id.edtPublishedVisaDate;
                                        TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPublishedVisaDate);
                                        if (textInputEditText5 != null) {
                                            i = R.id.edtStartDateAgreement;
                                            TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtStartDateAgreement);
                                            if (textInputEditText6 != null) {
                                                i = R.id.indonesianMigrantWorkerFormContainer;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.indonesianMigrantWorkerFormContainer);
                                                if (constraintLayout != null) {
                                                    i = R.id.rbFormal;
                                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbFormal);
                                                    if (radioButton != null) {
                                                        i = R.id.rbInformal;
                                                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbInformal);
                                                        if (radioButton2 != null) {
                                                            i = R.id.rgJobStatus;
                                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgJobStatus);
                                                            if (radioGroup != null) {
                                                                i = R.id.tilAgreementNumber;
                                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAgreementNumber);
                                                                if (textInputLayout != null) {
                                                                    i = R.id.tilChooseCountryCode;
                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseCountryCode);
                                                                    if (textInputLayout2 != null) {
                                                                        i = R.id.tilChooseJobType;
                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobType);
                                                                        if (textInputLayout3 != null) {
                                                                            i = R.id.tilChooseWorkingCountry;
                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseWorkingCountry);
                                                                            if (textInputLayout4 != null) {
                                                                                i = R.id.tilEChooseEmployerCity;
                                                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEChooseEmployerCity);
                                                                                if (textInputLayout5 != null) {
                                                                                    i = R.id.tilEmail;
                                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                                                                    if (textInputLayout6 != null) {
                                                                                        i = R.id.tilEmailConfirmation;
                                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmailConfirmation);
                                                                                        if (textInputLayout7 != null) {
                                                                                            i = R.id.tilEmployerAddress;
                                                                                            TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmployerAddress);
                                                                                            if (textInputLayout8 != null) {
                                                                                                TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmployerIdentityNumber);
                                                                                                if (textInputLayout9 != null) {
                                                                                                    TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmployerName);
                                                                                                    if (textInputLayout10 != null) {
                                                                                                        TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmployerPhoneNumber);
                                                                                                        if (textInputLayout11 != null) {
                                                                                                            TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEndDateAgreement);
                                                                                                            if (textInputLayout12 != null) {
                                                                                                                TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIssuedPassportDate);
                                                                                                                if (textInputLayout13 != null) {
                                                                                                                    TextInputLayout textInputLayout14 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassportNumber);
                                                                                                                    if (textInputLayout14 != null) {
                                                                                                                        TextInputLayout textInputLayout15 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumberEmployee);
                                                                                                                        if (textInputLayout15 != null) {
                                                                                                                            TextInputLayout textInputLayout16 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPublishedVisaDate);
                                                                                                                            if (textInputLayout16 != null) {
                                                                                                                                TextInputLayout textInputLayout17 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilStartDateAgreement);
                                                                                                                                if (textInputLayout17 != null) {
                                                                                                                                    TextInputLayout textInputLayout18 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilVisaNumber);
                                                                                                                                    if (textInputLayout18 != null) {
                                                                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvContactInfo);
                                                                                                                                        if (appCompatTextView != null) {
                                                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvEmailInformation);
                                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvEmployerInfo);
                                                                                                                                                if (appCompatTextView3 != null) {
                                                                                                                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJobInfo);
                                                                                                                                                    if (appCompatTextView4 != null) {
                                                                                                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJobStatus);
                                                                                                                                                        if (appCompatTextView5 != null) {
                                                                                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                                                                                                                                            if (textView != null) {
                                                                                                                                                                return new FragmentIndonesianMigrantWorkerFillingFormRegisterBinding((ScrollView) view, autoCompleteTextView, materialButton, materialCardView, materialCardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, constraintLayout, radioButton, radioButton2, radioGroup, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout14, textInputLayout15, textInputLayout16, textInputLayout17, textInputLayout18, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, textView);
                                                                                                                                                            }
                                                                                                                                                            i = R.id.tvPrefix;
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvJobStatus;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvJobInfo;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvEmployerInfo;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvEmailInformation;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvContactInfo;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tilVisaNumber;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tilStartDateAgreement;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tilPublishedVisaDate;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tilPhoneNumberEmployee;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tilPassportNumber;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tilIssuedPassportDate;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tilEndDateAgreement;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tilEmployerPhoneNumber;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tilEmployerName;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tilEmployerIdentityNumber;
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
