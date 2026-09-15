package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPartnerFilterBinding implements ViewBinding {
    public final MaterialButton btnApply;
    public final TextInputEditText edtCity;
    public final TextInputEditText edtProvince;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilCity;
    public final TextInputLayout tilProvince;
    public final AppCompatTextView tvChooseProvinceAndCity;

    private ActivityPartnerFilterBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.btnApply = materialButton;
        this.edtCity = textInputEditText;
        this.edtProvince = textInputEditText2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilCity = textInputLayout;
        this.tilProvince = textInputLayout2;
        this.tvChooseProvinceAndCity = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPartnerFilterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPartnerFilterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_partner_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPartnerFilterBinding bind(View view) {
        int i = R.id.btnApply;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnApply);
        if (materialButton != null) {
            i = R.id.edtCity;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtCity);
            if (textInputEditText != null) {
                i = R.id.edtProvince;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtProvince);
                if (textInputEditText2 != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tilCity;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCity);
                        if (textInputLayout != null) {
                            i = R.id.tilProvince;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilProvince);
                            if (textInputLayout2 != null) {
                                i = R.id.tvChooseProvinceAndCity;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChooseProvinceAndCity);
                                if (appCompatTextView != null) {
                                    return new ActivityPartnerFilterBinding((ConstraintLayout) view, materialButton, textInputEditText, textInputEditText2, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, appCompatTextView);
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
