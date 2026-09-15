package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityDeviceUnlinkingEmailBinding implements ViewBinding {
    public final MaterialButton btnContinue;
    public final TextInputEditText edtEmail;
    public final TextInputEditText etNik;
    public final TextInputEditText etNomorPeserta;
    public final ImageView ivEmailIcon;
    public final LayoutToolbarBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilNik;
    public final TextInputLayout tilNomorPeserta;
    public final TextView tvSubtitle;
    public final TextView tvTitle;

    private ActivityDeviceUnlinkingEmailBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, ImageView imageView, LayoutToolbarBinding layoutToolbarBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnContinue = materialButton;
        this.edtEmail = textInputEditText;
        this.etNik = textInputEditText2;
        this.etNomorPeserta = textInputEditText3;
        this.ivEmailIcon = imageView;
        this.layoutToolbar = layoutToolbarBinding;
        this.tilEmail = textInputLayout;
        this.tilNik = textInputLayout2;
        this.tilNomorPeserta = textInputLayout3;
        this.tvSubtitle = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceUnlinkingEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceUnlinkingEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_device_unlinking_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDeviceUnlinkingEmailBinding bind(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.edtEmail;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
            if (textInputEditText != null) {
                i = R.id.etNik;
                TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etNik);
                if (textInputEditText2 != null) {
                    i = R.id.etNomorPeserta;
                    TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etNomorPeserta);
                    if (textInputEditText3 != null) {
                        i = R.id.ivEmailIcon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivEmailIcon);
                        if (imageView != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                                i = R.id.tilEmail;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                if (textInputLayout != null) {
                                    i = R.id.tilNik;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNik);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilNomorPeserta;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNomorPeserta);
                                        if (textInputLayout3 != null) {
                                            i = R.id.tvSubtitle;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvSubtitle);
                                            if (textView != null) {
                                                i = R.id.tvTitle;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                if (textView2 != null) {
                                                    return new ActivityDeviceUnlinkingEmailBinding((ConstraintLayout) view, materialButton, textInputEditText, textInputEditText2, textInputEditText3, imageView, layoutToolbarBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2);
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
