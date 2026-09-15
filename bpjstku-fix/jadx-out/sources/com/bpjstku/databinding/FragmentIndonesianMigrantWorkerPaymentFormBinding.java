package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIndonesianMigrantWorkerPaymentFormBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final MaterialCardView cvProgramChoosed;
    public final TextInputEditText edtBirthDate;
    public final TextInputEditText edtBranchOffice;
    public final TextInputEditText edtChoosedCity;
    public final TextInputEditText edtChoosedProvince;
    public final TextInputEditText edtFathersName;
    public final TextInputEditText edtFullname;
    public final TextInputEditText edtGender;
    public final TextInputEditText edtIdentityNumber;
    public final TextInputEditText edtMothersName;
    public final AppCompatImageView imgProgramChoosed;
    private final ScrollView rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilBranchOffice;
    public final TextInputLayout tilChooseCity;
    public final TextInputLayout tilChooseProvince;
    public final TextInputLayout tilFathersName;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilGender;
    public final TextInputLayout tilIdentityNumber;
    public final TextInputLayout tilMothersName;
    public final AppCompatTextView tvChoosedProgram;
    public final AppCompatTextView tvProgramChoosed;

    private FragmentIndonesianMigrantWorkerPaymentFormBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, TextInputEditText textInputEditText8, TextInputEditText textInputEditText9, AppCompatImageView appCompatImageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = scrollView;
        this.btnConfirmation = materialButton;
        this.cvProgramChoosed = materialCardView;
        this.edtBirthDate = textInputEditText;
        this.edtBranchOffice = textInputEditText2;
        this.edtChoosedCity = textInputEditText3;
        this.edtChoosedProvince = textInputEditText4;
        this.edtFathersName = textInputEditText5;
        this.edtFullname = textInputEditText6;
        this.edtGender = textInputEditText7;
        this.edtIdentityNumber = textInputEditText8;
        this.edtMothersName = textInputEditText9;
        this.imgProgramChoosed = appCompatImageView;
        this.tilBirthDate = textInputLayout;
        this.tilBranchOffice = textInputLayout2;
        this.tilChooseCity = textInputLayout3;
        this.tilChooseProvince = textInputLayout4;
        this.tilFathersName = textInputLayout5;
        this.tilFullName = textInputLayout6;
        this.tilGender = textInputLayout7;
        this.tilIdentityNumber = textInputLayout8;
        this.tilMothersName = textInputLayout9;
        this.tvChoosedProgram = appCompatTextView;
        this.tvProgramChoosed = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesianMigrantWorkerPaymentFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesianMigrantWorkerPaymentFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesian_migrant_worker_payment_form, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesianMigrantWorkerPaymentFormBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cvProgramChoosed;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvProgramChoosed);
            if (materialCardView != null) {
                i = R.id.edtBirthDate;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                if (textInputEditText != null) {
                    i = R.id.edtBranchOffice;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBranchOffice);
                    if (textInputEditText2 != null) {
                        i = R.id.edtChoosedCity;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChoosedCity);
                        if (textInputEditText3 != null) {
                            i = R.id.edtChoosedProvince;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChoosedProvince);
                            if (textInputEditText4 != null) {
                                i = R.id.edtFathersName;
                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFathersName);
                                if (textInputEditText5 != null) {
                                    i = R.id.edtFullname;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFullname);
                                    if (textInputEditText6 != null) {
                                        i = R.id.edtGender;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtGender);
                                        if (textInputEditText7 != null) {
                                            i = R.id.edtIdentityNumber;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdentityNumber);
                                            if (textInputEditText8 != null) {
                                                i = R.id.edtMothersName;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtMothersName);
                                                if (textInputEditText9 != null) {
                                                    i = R.id.imgProgramChoosed;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramChoosed);
                                                    if (appCompatImageView != null) {
                                                        i = R.id.tilBirthDate;
                                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                                        if (textInputLayout != null) {
                                                            i = R.id.tilBranchOffice;
                                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBranchOffice);
                                                            if (textInputLayout2 != null) {
                                                                i = R.id.tilChooseCity;
                                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseCity);
                                                                if (textInputLayout3 != null) {
                                                                    i = R.id.tilChooseProvince;
                                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseProvince);
                                                                    if (textInputLayout4 != null) {
                                                                        i = R.id.tilFathersName;
                                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFathersName);
                                                                        if (textInputLayout5 != null) {
                                                                            i = R.id.tilFullName;
                                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                                            if (textInputLayout6 != null) {
                                                                                i = R.id.tilGender;
                                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilGender);
                                                                                if (textInputLayout7 != null) {
                                                                                    i = R.id.tilIdentityNumber;
                                                                                    TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                                                                    if (textInputLayout8 != null) {
                                                                                        i = R.id.tilMothersName;
                                                                                        TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMothersName);
                                                                                        if (textInputLayout9 != null) {
                                                                                            i = R.id.tvChoosedProgram;
                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChoosedProgram);
                                                                                            if (appCompatTextView != null) {
                                                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvProgramChoosed);
                                                                                                if (appCompatTextView2 != null) {
                                                                                                    return new FragmentIndonesianMigrantWorkerPaymentFormBinding((ScrollView) view, materialButton, materialCardView, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, appCompatImageView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, appCompatTextView, appCompatTextView2);
                                                                                                }
                                                                                                i = R.id.tvProgramChoosed;
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
