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
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityNonSalariedWorkerRegistrationResultBinding implements ViewBinding {
    public final Button btnPaymentProcess;
    public final ImageView imgNonSalariedWorkerRegistrationResult;
    public final MultiStateView msvVocationResult;
    private final ConstraintLayout rootView;
    public final TextView tvNonSalariedWorkerRegistrationResult;
    public final TextView tvRegistrationResultDescription;

    private ActivityNonSalariedWorkerRegistrationResultBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, MultiStateView multiStateView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnPaymentProcess = button;
        this.imgNonSalariedWorkerRegistrationResult = imageView;
        this.msvVocationResult = multiStateView;
        this.tvNonSalariedWorkerRegistrationResult = textView;
        this.tvRegistrationResultDescription = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNonSalariedWorkerRegistrationResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNonSalariedWorkerRegistrationResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_non_salaried_worker_registration_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNonSalariedWorkerRegistrationResultBinding bind(View view) {
        int i = R.id.btnPaymentProcess;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnPaymentProcess);
        if (button != null) {
            i = R.id.imgNonSalariedWorkerRegistrationResult;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNonSalariedWorkerRegistrationResult);
            if (imageView != null) {
                i = R.id.msvVocationResult;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvVocationResult);
                if (multiStateView != null) {
                    i = R.id.tvNonSalariedWorkerRegistrationResult;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNonSalariedWorkerRegistrationResult);
                    if (textView != null) {
                        i = R.id.tvRegistrationResultDescription;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationResultDescription);
                        if (textView2 != null) {
                            return new ActivityNonSalariedWorkerRegistrationResultBinding((ConstraintLayout) view, button, imageView, multiStateView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
