package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityVerifyAccountBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextView tvEnterEmail;
    public final TextView tvEnterEmailInstruction;

    private ActivityVerifyAccountBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilEmail = textInputLayout;
        this.tvEnterEmail = textView;
        this.tvEnterEmailInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVerifyAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVerifyAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVerifyAccountBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.tilEmail;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                if (textInputLayout != null) {
                    i = R.id.tvEnterEmail;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterEmail);
                    if (textView != null) {
                        i = R.id.tvEnterEmailInstruction;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterEmailInstruction);
                        if (textView2 != null) {
                            return new ActivityVerifyAccountBinding((ConstraintLayout) view, materialButton, layoutToolbarCenterBindingBind, textInputLayout, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
