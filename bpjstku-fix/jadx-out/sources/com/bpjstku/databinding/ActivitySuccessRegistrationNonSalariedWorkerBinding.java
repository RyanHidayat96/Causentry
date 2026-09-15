package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySuccessRegistrationNonSalariedWorkerBinding implements ViewBinding {
    public final Button btnOk;
    public final ImageView imgStatusPayment;
    private final ConstraintLayout rootView;
    public final TextView tvDescriptionPayment;
    public final TextView tvTitlePayment;

    private ActivitySuccessRegistrationNonSalariedWorkerBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnOk = button;
        this.imgStatusPayment = imageView;
        this.tvDescriptionPayment = textView;
        this.tvTitlePayment = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySuccessRegistrationNonSalariedWorkerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySuccessRegistrationNonSalariedWorkerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_success_registration_non_salaried_worker, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySuccessRegistrationNonSalariedWorkerBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (button != null) {
            i = R.id.imgStatusPayment;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgStatusPayment);
            if (imageView != null) {
                i = R.id.tvDescriptionPayment;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionPayment);
                if (textView != null) {
                    i = R.id.tvTitlePayment;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePayment);
                    if (textView2 != null) {
                        return new ActivitySuccessRegistrationNonSalariedWorkerBinding((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
