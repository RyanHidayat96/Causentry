package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJkpClaimTrackingBinding implements ViewBinding {
    public final MaterialButton btnCheck;
    public final TextInputEditText edtChooseKpj;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseKpj;

    private ActivityJkpClaimTrackingBinding(ScrollView scrollView, MaterialButton materialButton, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout) {
        this.rootView = scrollView;
        this.btnCheck = materialButton;
        this.edtChooseKpj = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilChooseKpj = textInputLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityJkpClaimTrackingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJkpClaimTrackingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jkp_claim_tracking, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJkpClaimTrackingBinding bind(View view) {
        int i = R.id.btnCheck;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCheck);
        if (materialButton != null) {
            i = R.id.edtChooseKpj;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseKpj);
            if (textInputEditText != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.tilChooseKpj;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseKpj);
                    if (textInputLayout != null) {
                        return new ActivityJkpClaimTrackingBinding((ScrollView) view, materialButton, textInputEditText, layoutToolbarCenterBindingBind, textInputLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
