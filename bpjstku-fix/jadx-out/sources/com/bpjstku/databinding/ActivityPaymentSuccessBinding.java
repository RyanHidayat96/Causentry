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
public final class ActivityPaymentSuccessBinding implements ViewBinding {
    public final Button btnOk;
    public final ImageView imgPaymentResult;
    public final MultiStateView msvPaymentResult;
    private final ConstraintLayout rootView;
    public final TextView tvIdPayment;
    public final TextView tvIdPaymentValue;
    public final TextView tvPaymentResultDescription;
    public final TextView tvStatusPaymentResult;

    private ActivityPaymentSuccessBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, MultiStateView multiStateView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnOk = button;
        this.imgPaymentResult = imageView;
        this.msvPaymentResult = multiStateView;
        this.tvIdPayment = textView;
        this.tvIdPaymentValue = textView2;
        this.tvPaymentResultDescription = textView3;
        this.tvStatusPaymentResult = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPaymentSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_payment_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPaymentSuccessBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (button != null) {
            i = R.id.imgPaymentResult;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaymentResult);
            if (imageView != null) {
                i = R.id.msvPaymentResult;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvPaymentResult);
                if (multiStateView != null) {
                    i = R.id.tvIdPayment;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdPayment);
                    if (textView != null) {
                        i = R.id.tvIdPaymentValue;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdPaymentValue);
                        if (textView2 != null) {
                            i = R.id.tvPaymentResultDescription;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentResultDescription);
                            if (textView3 != null) {
                                i = R.id.tvStatusPaymentResult;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusPaymentResult);
                                if (textView4 != null) {
                                    return new ActivityPaymentSuccessBinding((ConstraintLayout) view, button, imageView, multiStateView, textView, textView2, textView3, textView4);
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
