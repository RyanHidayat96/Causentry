package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final LinearLayout containerRegistrationDetail;
    public final TextInputEditText edtBirthDate;
    public final TextInputEditText edtChooseCity;
    public final TextInputEditText edtChooseProvince;
    public final TextInputEditText edtPublishedPassportDate;
    public final TextInputEditText edtWorkingCountry;
    public final ConstraintLayout indonesianMigrantWorkerContainer;
    public final RadioButton rbFemale;
    public final RadioButton rbKTP;
    public final RadioButton rbMale;
    public final RadioButton rbPasspor;
    public final RadioGroup rgGender;
    public final RadioGroup rgRegistrationOption;
    private final ScrollView rootView;
    public final TextInputLayout tilAddress;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilBirthplace;
    public final TextInputLayout tilChooseCity;
    public final TextInputLayout tilChooseProvince;
    public final TextInputLayout tilExpirationPassportDate;
    public final TextInputLayout tilFathersName;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdentityNumber;
    public final TextInputLayout tilMothersName;
    public final TextInputLayout tilPassportNumber;
    public final TextInputLayout tilPlacementCountry;
    public final TextView tvGender;
    public final TextView tvRegistrationOptionId;

    private FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding(ScrollView scrollView, MaterialButton materialButton, LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, ConstraintLayout constraintLayout, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioGroup radioGroup, RadioGroup radioGroup2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.containerRegistrationDetail = linearLayout;
        this.edtBirthDate = textInputEditText;
        this.edtChooseCity = textInputEditText2;
        this.edtChooseProvince = textInputEditText3;
        this.edtPublishedPassportDate = textInputEditText4;
        this.edtWorkingCountry = textInputEditText5;
        this.indonesianMigrantWorkerContainer = constraintLayout;
        this.rbFemale = radioButton;
        this.rbKTP = radioButton2;
        this.rbMale = radioButton3;
        this.rbPasspor = radioButton4;
        this.rgGender = radioGroup;
        this.rgRegistrationOption = radioGroup2;
        this.tilAddress = textInputLayout;
        this.tilBirthDate = textInputLayout2;
        this.tilBirthplace = textInputLayout3;
        this.tilChooseCity = textInputLayout4;
        this.tilChooseProvince = textInputLayout5;
        this.tilExpirationPassportDate = textInputLayout6;
        this.tilFathersName = textInputLayout7;
        this.tilFullName = textInputLayout8;
        this.tilIdentityNumber = textInputLayout9;
        this.tilMothersName = textInputLayout10;
        this.tilPassportNumber = textInputLayout11;
        this.tilPlacementCountry = textInputLayout12;
        this.tvGender = textView;
        this.tvRegistrationOptionId = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesian_migrant_worker_identity_verification_register, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.containerRegistrationDetail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.containerRegistrationDetail);
            if (linearLayout != null) {
                i = R.id.edtBirthDate;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                if (textInputEditText != null) {
                    i = R.id.edtChooseCity;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseCity);
                    if (textInputEditText2 != null) {
                        i = R.id.edtChooseProvince;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseProvince);
                        if (textInputEditText3 != null) {
                            i = R.id.edtPublishedPassportDate;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPublishedPassportDate);
                            if (textInputEditText4 != null) {
                                i = R.id.edtWorkingCountry;
                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtWorkingCountry);
                                if (textInputEditText5 != null) {
                                    i = R.id.indonesianMigrantWorkerContainer;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.indonesianMigrantWorkerContainer);
                                    if (constraintLayout != null) {
                                        i = R.id.rbFemale;
                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbFemale);
                                        if (radioButton != null) {
                                            i = R.id.rbKTP;
                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbKTP);
                                            if (radioButton2 != null) {
                                                i = R.id.rbMale;
                                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbMale);
                                                if (radioButton3 != null) {
                                                    i = R.id.rbPasspor;
                                                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbPasspor);
                                                    if (radioButton4 != null) {
                                                        i = R.id.rgGender;
                                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgGender);
                                                        if (radioGroup != null) {
                                                            i = R.id.rgRegistrationOption;
                                                            RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgRegistrationOption);
                                                            if (radioGroup2 != null) {
                                                                i = R.id.tilAddress;
                                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddress);
                                                                if (textInputLayout != null) {
                                                                    i = R.id.tilBirthDate;
                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                                                    if (textInputLayout2 != null) {
                                                                        i = R.id.tilBirthplace;
                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthplace);
                                                                        if (textInputLayout3 != null) {
                                                                            i = R.id.tilChooseCity;
                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseCity);
                                                                            if (textInputLayout4 != null) {
                                                                                i = R.id.tilChooseProvince;
                                                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseProvince);
                                                                                if (textInputLayout5 != null) {
                                                                                    i = R.id.tilExpirationPassportDate;
                                                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilExpirationPassportDate);
                                                                                    if (textInputLayout6 != null) {
                                                                                        i = R.id.tilFathersName;
                                                                                        TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFathersName);
                                                                                        if (textInputLayout7 != null) {
                                                                                            i = R.id.tilFullName;
                                                                                            TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                                                            if (textInputLayout8 != null) {
                                                                                                TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                                                                                if (textInputLayout9 != null) {
                                                                                                    TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMothersName);
                                                                                                    if (textInputLayout10 != null) {
                                                                                                        TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPassportNumber);
                                                                                                        if (textInputLayout11 != null) {
                                                                                                            TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPlacementCountry);
                                                                                                            if (textInputLayout12 != null) {
                                                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                if (textView != null) {
                                                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationOptionId);
                                                                                                                    if (textView2 != null) {
                                                                                                                        return new FragmentIndonesianMigrantWorkerIdentityVerificationRegisterBinding((ScrollView) view, materialButton, linearLayout, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, constraintLayout, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, radioGroup2, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textView, textView2);
                                                                                                                    }
                                                                                                                    i = R.id.tvRegistrationOptionId;
                                                                                                                } else {
                                                                                                                    i = R.id.tvGender;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tilPlacementCountry;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tilPassportNumber;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tilMothersName;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tilIdentityNumber;
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
