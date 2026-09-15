package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNonSalariedWorkerProgramRegistrationBinding implements ViewBinding {
    public final TextInputEditText actvBranchOfficeSearch;
    public final Button btnNext;
    public final ConstraintLayout containerBenefitDescription;
    public final ConstraintLayout containerChooseBranchOffice;
    public final MaterialCardView cvBenefitProgram;
    public final MaterialCardView cvChooseBranchOfficeBasedOnDomicile;
    public final TextInputEditText edtChoseTuitionRate;
    public final ImageView imgWarning1;
    public final AppCompatRadioButton rbOneMonthPeriod;
    public final AppCompatRadioButton rbProgramJkkJkm;
    public final AppCompatRadioButton rbProgramJkkJkmJht;
    public final AppCompatRadioButton rbSixMonthPeriod;
    public final AppCompatRadioButton rbThreeMonthPeriod;
    public final AppCompatRadioButton rbTwelveMonthPeriod;
    public final AppCompatRadioButton rbTwoMonthPeriod;
    public final RadioGroup rgPaymentPeriod;
    public final RadioGroup rgProgram;
    private final ScrollView rootView;
    public final TextInputLayout tilBranchOffice;
    public final TextInputLayout tilChoseTuitionRate;
    public final TextView tvChoosePaymentPeriod;
    public final TextView tvChooseProgram;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvInfoJht;
    public final TextView tvInfoJkk;
    public final TextView tvInfoJkm;
    public final TextView tvTitleBenefitProgram;
    public final View viewLineJht;
    public final View viewLineJkm;

    private FragmentNonSalariedWorkerProgramRegistrationBinding(ScrollView scrollView, TextInputEditText textInputEditText, Button button, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextInputEditText textInputEditText2, ImageView imageView, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, AppCompatRadioButton appCompatRadioButton4, AppCompatRadioButton appCompatRadioButton5, AppCompatRadioButton appCompatRadioButton6, AppCompatRadioButton appCompatRadioButton7, RadioGroup radioGroup, RadioGroup radioGroup2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, View view2) {
        this.rootView = scrollView;
        this.actvBranchOfficeSearch = textInputEditText;
        this.btnNext = button;
        this.containerBenefitDescription = constraintLayout;
        this.containerChooseBranchOffice = constraintLayout2;
        this.cvBenefitProgram = materialCardView;
        this.cvChooseBranchOfficeBasedOnDomicile = materialCardView2;
        this.edtChoseTuitionRate = textInputEditText2;
        this.imgWarning1 = imageView;
        this.rbOneMonthPeriod = appCompatRadioButton;
        this.rbProgramJkkJkm = appCompatRadioButton2;
        this.rbProgramJkkJkmJht = appCompatRadioButton3;
        this.rbSixMonthPeriod = appCompatRadioButton4;
        this.rbThreeMonthPeriod = appCompatRadioButton5;
        this.rbTwelveMonthPeriod = appCompatRadioButton6;
        this.rbTwoMonthPeriod = appCompatRadioButton7;
        this.rgPaymentPeriod = radioGroup;
        this.rgProgram = radioGroup2;
        this.tilBranchOffice = textInputLayout;
        this.tilChoseTuitionRate = textInputLayout2;
        this.tvChoosePaymentPeriod = textView;
        this.tvChooseProgram = textView2;
        this.tvClaimNonSalariedWorkerInfo1 = textView3;
        this.tvInfoJht = textView4;
        this.tvInfoJkk = textView5;
        this.tvInfoJkm = textView6;
        this.tvTitleBenefitProgram = textView7;
        this.viewLineJht = view;
        this.viewLineJkm = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerProgramRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerProgramRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_program_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerProgramRegistrationBinding bind(View view) {
        int i = R.id.actvBranchOfficeSearch;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.actvBranchOfficeSearch);
        if (textInputEditText != null) {
            i = R.id.btnNext;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (button != null) {
                i = R.id.containerBenefitDescription;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerBenefitDescription);
                if (constraintLayout != null) {
                    i = R.id.containerChooseBranchOffice;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerChooseBranchOffice);
                    if (constraintLayout2 != null) {
                        i = R.id.cvBenefitProgram;
                        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvBenefitProgram);
                        if (materialCardView != null) {
                            i = R.id.cvChooseBranchOfficeBasedOnDomicile;
                            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvChooseBranchOfficeBasedOnDomicile);
                            if (materialCardView2 != null) {
                                i = R.id.edtChoseTuitionRate;
                                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChoseTuitionRate);
                                if (textInputEditText2 != null) {
                                    i = R.id.imgWarning1;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                                    if (imageView != null) {
                                        i = R.id.rbOneMonthPeriod;
                                        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbOneMonthPeriod);
                                        if (appCompatRadioButton != null) {
                                            i = R.id.rbProgramJkkJkm;
                                            AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbProgramJkkJkm);
                                            if (appCompatRadioButton2 != null) {
                                                i = R.id.rbProgramJkkJkmJht;
                                                AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbProgramJkkJkmJht);
                                                if (appCompatRadioButton3 != null) {
                                                    i = R.id.rbSixMonthPeriod;
                                                    AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbSixMonthPeriod);
                                                    if (appCompatRadioButton4 != null) {
                                                        i = R.id.rbThreeMonthPeriod;
                                                        AppCompatRadioButton appCompatRadioButton5 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbThreeMonthPeriod);
                                                        if (appCompatRadioButton5 != null) {
                                                            i = R.id.rbTwelveMonthPeriod;
                                                            AppCompatRadioButton appCompatRadioButton6 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbTwelveMonthPeriod);
                                                            if (appCompatRadioButton6 != null) {
                                                                i = R.id.rbTwoMonthPeriod;
                                                                AppCompatRadioButton appCompatRadioButton7 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbTwoMonthPeriod);
                                                                if (appCompatRadioButton7 != null) {
                                                                    i = R.id.rgPaymentPeriod;
                                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgPaymentPeriod);
                                                                    if (radioGroup != null) {
                                                                        i = R.id.rgProgram;
                                                                        RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgProgram);
                                                                        if (radioGroup2 != null) {
                                                                            i = R.id.tilBranchOffice;
                                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBranchOffice);
                                                                            if (textInputLayout != null) {
                                                                                i = R.id.tilChoseTuitionRate;
                                                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChoseTuitionRate);
                                                                                if (textInputLayout2 != null) {
                                                                                    i = R.id.tvChoosePaymentPeriod;
                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChoosePaymentPeriod);
                                                                                    if (textView != null) {
                                                                                        i = R.id.tvChooseProgram;
                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseProgram);
                                                                                        if (textView2 != null) {
                                                                                            i = R.id.tvClaimNonSalariedWorkerInfo1;
                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                                                                            if (textView3 != null) {
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJht);
                                                                                                if (textView4 != null) {
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJkk);
                                                                                                    if (textView5 != null) {
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJkm);
                                                                                                        if (textView6 != null) {
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBenefitProgram);
                                                                                                            if (textView7 != null) {
                                                                                                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineJht);
                                                                                                                if (viewFindChildViewById != null) {
                                                                                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineJkm);
                                                                                                                    if (viewFindChildViewById2 != null) {
                                                                                                                        return new FragmentNonSalariedWorkerProgramRegistrationBinding((ScrollView) view, textInputEditText, button, constraintLayout, constraintLayout2, materialCardView, materialCardView2, textInputEditText2, imageView, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, appCompatRadioButton4, appCompatRadioButton5, appCompatRadioButton6, appCompatRadioButton7, radioGroup, radioGroup2, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewFindChildViewById, viewFindChildViewById2);
                                                                                                                    }
                                                                                                                    i = R.id.viewLineJkm;
                                                                                                                } else {
                                                                                                                    i = R.id.viewLineJht;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvTitleBenefitProgram;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvInfoJkm;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvInfoJkk;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvInfoJht;
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
