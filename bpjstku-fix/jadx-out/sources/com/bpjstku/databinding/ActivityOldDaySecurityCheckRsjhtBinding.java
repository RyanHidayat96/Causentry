package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityOldDaySecurityCheckRsjhtBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final TextInputEditText edtChooseKpj;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvCheckRsjht;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilChooseKpj;

    private ActivityOldDaySecurityCheckRsjhtBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, TextInputLayout textInputLayout) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.edtChooseKpj = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvCheckRsjht = multiStateView;
        this.tilChooseKpj = textInputLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOldDaySecurityCheckRsjhtBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOldDaySecurityCheckRsjhtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_old_day_security_check_rsjht, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOldDaySecurityCheckRsjhtBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.edtChooseKpj;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseKpj);
            if (textInputEditText != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.msvCheckRsjht;
                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvCheckRsjht);
                    if (multiStateView != null) {
                        i = R.id.tilChooseKpj;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseKpj);
                        if (textInputLayout != null) {
                            return new ActivityOldDaySecurityCheckRsjhtBinding((ConstraintLayout) view, materialButton, textInputEditText, layoutToolbarCenterBindingBind, multiStateView, textInputLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
