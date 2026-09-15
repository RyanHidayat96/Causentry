package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJpnSimulationBinding implements ViewBinding {
    public final MaterialButton btnCountSimulation;
    public final MaterialCardView cvAverageSalary;
    public final TextInputEditText edtAverageSalary;
    public final TextInputEditText edtBirthDate;
    public final TextInputEditText edtJpnStart;
    public final ConstraintLayout informationContainer;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextInputLayout tilAverageSalary;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilIncreaseSalaryperYear;
    public final TextInputLayout tilJpnStart;
    public final TextView tvAssumptionDesc;
    public final TextView tvAssumptionTitle;
    public final TextView tvDescription;
    public final TextInputEditText tvIncreaseSalaryperYear;
    public final TextView tvPrefixAverageSalary;
    public final TextView tvSimulationResult;

    private ActivityJpnSimulationBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, ConstraintLayout constraintLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, TextInputEditText textInputEditText4, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnCountSimulation = materialButton;
        this.cvAverageSalary = materialCardView;
        this.edtAverageSalary = textInputEditText;
        this.edtBirthDate = textInputEditText2;
        this.edtJpnStart = textInputEditText3;
        this.informationContainer = constraintLayout;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilAverageSalary = textInputLayout;
        this.tilBirthDate = textInputLayout2;
        this.tilIncreaseSalaryperYear = textInputLayout3;
        this.tilJpnStart = textInputLayout4;
        this.tvAssumptionDesc = textView;
        this.tvAssumptionTitle = textView2;
        this.tvDescription = textView3;
        this.tvIncreaseSalaryperYear = textInputEditText4;
        this.tvPrefixAverageSalary = textView4;
        this.tvSimulationResult = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityJpnSimulationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJpnSimulationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jpn_simulation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJpnSimulationBinding bind(View view) {
        int i = R.id.btnCountSimulation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCountSimulation);
        if (materialButton != null) {
            i = R.id.cvAverageSalary;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvAverageSalary);
            if (materialCardView != null) {
                i = R.id.edtAverageSalary;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtAverageSalary);
                if (textInputEditText != null) {
                    i = R.id.edtBirthDate;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                    if (textInputEditText2 != null) {
                        i = R.id.edtJpnStart;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtJpnStart);
                        if (textInputEditText3 != null) {
                            i = R.id.informationContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.informationContainer);
                            if (constraintLayout != null) {
                                i = R.id.layout_toolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                if (viewFindChildViewById != null) {
                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                    i = R.id.tilAverageSalary;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAverageSalary);
                                    if (textInputLayout != null) {
                                        i = R.id.tilBirthDate;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilIncreaseSalaryperYear;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIncreaseSalaryperYear);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tilJpnStart;
                                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilJpnStart);
                                                if (textInputLayout4 != null) {
                                                    i = R.id.tvAssumptionDesc;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAssumptionDesc);
                                                    if (textView != null) {
                                                        i = R.id.tvAssumptionTitle;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAssumptionTitle);
                                                        if (textView2 != null) {
                                                            i = R.id.tvDescription;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescription);
                                                            if (textView3 != null) {
                                                                i = R.id.tvIncreaseSalaryperYear;
                                                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tvIncreaseSalaryperYear);
                                                                if (textInputEditText4 != null) {
                                                                    i = R.id.tvPrefixAverageSalary;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefixAverageSalary);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tvSimulationResult;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSimulationResult);
                                                                        if (textView5 != null) {
                                                                            return new ActivityJpnSimulationBinding((ScrollView) view, materialButton, materialCardView, textInputEditText, textInputEditText2, textInputEditText3, constraintLayout, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3, textInputEditText4, textView4, textView5);
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
