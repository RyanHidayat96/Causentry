package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAsikActiveParticipantCompanyDataBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtChooseDomicile;
    public final TextInputEditText edtChooseLocation;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseDomicile;
    public final TextInputLayout tilChooseLocation;
    public final TextInputLayout tilCompanyName;
    public final TextView tvReminderVerifyDataCompany;

    private FragmentAsikActiveParticipantCompanyDataBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.edtChooseDomicile = textInputEditText;
        this.edtChooseLocation = textInputEditText2;
        this.tilChooseDomicile = textInputLayout;
        this.tilChooseLocation = textInputLayout2;
        this.tilCompanyName = textInputLayout3;
        this.tvReminderVerifyDataCompany = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantCompanyDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantCompanyDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_company_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantCompanyDataBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.edtChooseDomicile;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseDomicile);
            if (textInputEditText != null) {
                i = R.id.edtChooseLocation;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseLocation);
                if (textInputEditText2 != null) {
                    i = R.id.tilChooseDomicile;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseDomicile);
                    if (textInputLayout != null) {
                        i = R.id.tilChooseLocation;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseLocation);
                        if (textInputLayout2 != null) {
                            i = R.id.tilCompanyName;
                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCompanyName);
                            if (textInputLayout3 != null) {
                                i = R.id.tvReminderVerifyDataCompany;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataCompany);
                                if (textView != null) {
                                    return new FragmentAsikActiveParticipantCompanyDataBinding((ScrollView) view, materialButton, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textInputLayout3, textView);
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
