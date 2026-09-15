package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentVocationalFormalEducationBottomSheetBinding implements ViewBinding {
    public final Button btnApply;
    public final AppCompatRadioButton rbEducationD1;
    public final AppCompatRadioButton rbEducationD2;
    public final AppCompatRadioButton rbEducationD3;
    public final AppCompatRadioButton rbEducationS1;
    public final AppCompatRadioButton rbEducationS2;
    public final AppCompatRadioButton rbEducationS3;
    public final AppCompatRadioButton rbEducationSMA;
    public final RadioGroup rgChooseFormalEducation;
    private final ConstraintLayout rootView;
    public final TextView tvFormalEducation;

    private FragmentVocationalFormalEducationBottomSheetBinding(ConstraintLayout constraintLayout, Button button, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, AppCompatRadioButton appCompatRadioButton4, AppCompatRadioButton appCompatRadioButton5, AppCompatRadioButton appCompatRadioButton6, AppCompatRadioButton appCompatRadioButton7, RadioGroup radioGroup, TextView textView) {
        this.rootView = constraintLayout;
        this.btnApply = button;
        this.rbEducationD1 = appCompatRadioButton;
        this.rbEducationD2 = appCompatRadioButton2;
        this.rbEducationD3 = appCompatRadioButton3;
        this.rbEducationS1 = appCompatRadioButton4;
        this.rbEducationS2 = appCompatRadioButton5;
        this.rbEducationS3 = appCompatRadioButton6;
        this.rbEducationSMA = appCompatRadioButton7;
        this.rgChooseFormalEducation = radioGroup;
        this.tvFormalEducation = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalFormalEducationBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalFormalEducationBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_formal_education_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalFormalEducationBottomSheetBinding bind(View view) {
        int i = R.id.btnApply;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnApply);
        if (button != null) {
            i = R.id.rbEducationD1;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationD1);
            if (appCompatRadioButton != null) {
                i = R.id.rbEducationD2;
                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationD2);
                if (appCompatRadioButton2 != null) {
                    i = R.id.rbEducationD3;
                    AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationD3);
                    if (appCompatRadioButton3 != null) {
                        i = R.id.rbEducationS1;
                        AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationS1);
                        if (appCompatRadioButton4 != null) {
                            i = R.id.rbEducationS2;
                            AppCompatRadioButton appCompatRadioButton5 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationS2);
                            if (appCompatRadioButton5 != null) {
                                i = R.id.rbEducationS3;
                                AppCompatRadioButton appCompatRadioButton6 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationS3);
                                if (appCompatRadioButton6 != null) {
                                    i = R.id.rbEducationSMA;
                                    AppCompatRadioButton appCompatRadioButton7 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbEducationSMA);
                                    if (appCompatRadioButton7 != null) {
                                        i = R.id.rgChooseFormalEducation;
                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseFormalEducation);
                                        if (radioGroup != null) {
                                            i = R.id.tvFormalEducation;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFormalEducation);
                                            if (textView != null) {
                                                return new FragmentVocationalFormalEducationBottomSheetBinding((ConstraintLayout) view, button, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, appCompatRadioButton4, appCompatRadioButton5, appCompatRadioButton6, appCompatRadioButton7, radioGroup, textView);
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
