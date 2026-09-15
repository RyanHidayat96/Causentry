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

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegistrationSuccessBinding implements ViewBinding {
    public final MaterialButton btnOk;
    public final ImageView imgSuccess;
    private final ConstraintLayout rootView;
    public final TextView tvRegistrationSuccess;
    public final TextView tvRegistrationSuccessMessage;

    private ActivityRegistrationSuccessBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnOk = materialButton;
        this.imgSuccess = imageView;
        this.tvRegistrationSuccess = textView;
        this.tvRegistrationSuccessMessage = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegistrationSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegistrationSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_registration_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegistrationSuccessBinding bind(View view) {
        int i = R.id.btnOk;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (materialButton != null) {
            i = R.id.imgSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
            if (imageView != null) {
                i = R.id.tvRegistrationSuccess;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationSuccess);
                if (textView != null) {
                    i = R.id.tvRegistrationSuccessMessage;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationSuccessMessage);
                    if (textView2 != null) {
                        return new ActivityRegistrationSuccessBinding((ConstraintLayout) view, materialButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
