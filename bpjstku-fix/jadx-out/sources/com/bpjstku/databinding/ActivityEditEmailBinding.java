package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityEditEmailBinding implements ViewBinding {
    public final Button btnSaveEmail;
    public final TextInputEditText edtEmail;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextView tvEditEmailInstruction;

    private ActivityEditEmailBinding(ConstraintLayout constraintLayout, Button button, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.btnSaveEmail = button;
        this.edtEmail = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilEmail = textInputLayout;
        this.tvEditEmailInstruction = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEditEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEditEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_edit_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEditEmailBinding bind(View view) {
        int i = R.id.btnSaveEmail;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSaveEmail);
        if (button != null) {
            i = R.id.edtEmail;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
            if (textInputEditText != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.tilEmail;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                    if (textInputLayout != null) {
                        i = R.id.tvEditEmailInstruction;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditEmailInstruction);
                        if (textView != null) {
                            return new ActivityEditEmailBinding((ConstraintLayout) view, button, textInputEditText, layoutToolbarCenterBindingBind, textInputLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
