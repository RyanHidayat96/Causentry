package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentScholarBenefitStep3Binding implements ViewBinding {
    public final TextInputEditText fragScholarAmount;
    public final TextInputLayout fragScholarAmountLay;
    public final TextInputEditText fragScholarEdu;
    public final TextInputLayout fragScholarEduLay;
    public final TextInputEditText fragScholarInstitution;
    public final TextInputLayout fragScholarInstitutionLay;
    public final TextInputEditText fragScholarKind;
    public final TextInputLayout fragScholarKindLay;
    public final TextInputEditText fragScholarLevel;
    public final TextInputLayout fragScholarLevelLay;
    public final TextInputEditText fragScholarLevelNew;
    public final TextInputLayout fragScholarLevelNewLay;
    public final RecyclerView fragScholarProveImgs;
    public final RadioGroup fragScholarSn;
    public final AppCompatRadioButton fragScholarSnN;
    public final TextView fragScholarSnTitle;
    public final AppCompatRadioButton fragScholarSnTn;
    public final MaterialButton fragScholarStep3Next;
    public final TextInputEditText fragScholarYear;
    public final TextInputLayout fragScholarYearLay;
    private final NestedScrollView rootView;

    private FragmentScholarBenefitStep3Binding(NestedScrollView nestedScrollView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4, TextInputEditText textInputEditText5, TextInputLayout textInputLayout5, TextInputEditText textInputEditText6, TextInputLayout textInputLayout6, RecyclerView recyclerView, RadioGroup radioGroup, AppCompatRadioButton appCompatRadioButton, TextView textView, AppCompatRadioButton appCompatRadioButton2, MaterialButton materialButton, TextInputEditText textInputEditText7, TextInputLayout textInputLayout7) {
        this.rootView = nestedScrollView;
        this.fragScholarAmount = textInputEditText;
        this.fragScholarAmountLay = textInputLayout;
        this.fragScholarEdu = textInputEditText2;
        this.fragScholarEduLay = textInputLayout2;
        this.fragScholarInstitution = textInputEditText3;
        this.fragScholarInstitutionLay = textInputLayout3;
        this.fragScholarKind = textInputEditText4;
        this.fragScholarKindLay = textInputLayout4;
        this.fragScholarLevel = textInputEditText5;
        this.fragScholarLevelLay = textInputLayout5;
        this.fragScholarLevelNew = textInputEditText6;
        this.fragScholarLevelNewLay = textInputLayout6;
        this.fragScholarProveImgs = recyclerView;
        this.fragScholarSn = radioGroup;
        this.fragScholarSnN = appCompatRadioButton;
        this.fragScholarSnTitle = textView;
        this.fragScholarSnTn = appCompatRadioButton2;
        this.fragScholarStep3Next = materialButton;
        this.fragScholarYear = textInputEditText7;
        this.fragScholarYearLay = textInputLayout7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentScholarBenefitStep3Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScholarBenefitStep3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_scholar_benefit_step3, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentScholarBenefitStep3Binding bind(View view) {
        int i = R.id.frag_scholar_amount;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_amount);
        if (textInputEditText != null) {
            i = R.id.frag_scholar_amount_lay;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_amount_lay);
            if (textInputLayout != null) {
                i = R.id.frag_scholar_edu;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_edu);
                if (textInputEditText2 != null) {
                    i = R.id.frag_scholar_edu_lay;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_edu_lay);
                    if (textInputLayout2 != null) {
                        i = R.id.frag_scholar_institution;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_institution);
                        if (textInputEditText3 != null) {
                            i = R.id.frag_scholar_institution_lay;
                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_institution_lay);
                            if (textInputLayout3 != null) {
                                i = R.id.frag_scholar_kind;
                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_kind);
                                if (textInputEditText4 != null) {
                                    i = R.id.frag_scholar_kind_lay;
                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_kind_lay);
                                    if (textInputLayout4 != null) {
                                        i = R.id.frag_scholar_level;
                                        TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_level);
                                        if (textInputEditText5 != null) {
                                            i = R.id.frag_scholar_level_lay;
                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_level_lay);
                                            if (textInputLayout5 != null) {
                                                i = R.id.frag_scholar_level_new;
                                                TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_level_new);
                                                if (textInputEditText6 != null) {
                                                    i = R.id.frag_scholar_level_new_lay;
                                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_level_new_lay);
                                                    if (textInputLayout6 != null) {
                                                        i = R.id.frag_scholar_prove_imgs;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.frag_scholar_prove_imgs);
                                                        if (recyclerView != null) {
                                                            i = R.id.frag_scholar_sn;
                                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.frag_scholar_sn);
                                                            if (radioGroup != null) {
                                                                i = R.id.frag_scholar_sn_n;
                                                                AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.frag_scholar_sn_n);
                                                                if (appCompatRadioButton != null) {
                                                                    i = R.id.frag_scholar_sn_title;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_sn_title);
                                                                    if (textView != null) {
                                                                        i = R.id.frag_scholar_sn_tn;
                                                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.frag_scholar_sn_tn);
                                                                        if (appCompatRadioButton2 != null) {
                                                                            i = R.id.frag_scholar_step3_next;
                                                                            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.frag_scholar_step3_next);
                                                                            if (materialButton != null) {
                                                                                i = R.id.frag_scholar_year;
                                                                                TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_year);
                                                                                if (textInputEditText7 != null) {
                                                                                    i = R.id.frag_scholar_year_lay;
                                                                                    TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_year_lay);
                                                                                    if (textInputLayout7 != null) {
                                                                                        return new FragmentScholarBenefitStep3Binding((NestedScrollView) view, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, textInputEditText3, textInputLayout3, textInputEditText4, textInputLayout4, textInputEditText5, textInputLayout5, textInputEditText6, textInputLayout6, recyclerView, radioGroup, appCompatRadioButton, textView, appCompatRadioButton2, materialButton, textInputEditText7, textInputLayout7);
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
