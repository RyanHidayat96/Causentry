package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityChooseNationalityActivationBinding implements ViewBinding {
    public final AutoCompleteTextView actvChooseNationality;
    public final MaterialButton btnNext;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilChooseNationality;
    public final TextView tvChooseNationality;
    public final TextView tvChooseNationalityInstruction;

    private ActivityChooseNationalityActivationBinding(ConstraintLayout constraintLayout, AutoCompleteTextView autoCompleteTextView, MaterialButton materialButton, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.actvChooseNationality = autoCompleteTextView;
        this.btnNext = materialButton;
        this.tilChooseNationality = textInputLayout;
        this.tvChooseNationality = textView;
        this.tvChooseNationalityInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChooseNationalityActivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChooseNationalityActivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_choose_nationality_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityChooseNationalityActivationBinding bind(View view) {
        int i = R.id.actvChooseNationality;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvChooseNationality);
        if (autoCompleteTextView != null) {
            i = R.id.btnNext;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton != null) {
                i = R.id.tilChooseNationality;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseNationality);
                if (textInputLayout != null) {
                    i = R.id.tvChooseNationality;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseNationality);
                    if (textView != null) {
                        i = R.id.tvChooseNationalityInstruction;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseNationalityInstruction);
                        if (textView2 != null) {
                            return new ActivityChooseNationalityActivationBinding((ConstraintLayout) view, autoCompleteTextView, materialButton, textInputLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
