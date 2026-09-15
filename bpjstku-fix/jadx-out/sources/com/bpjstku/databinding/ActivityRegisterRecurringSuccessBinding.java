package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegisterRecurringSuccessBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final Button btnRegRecurringSuccess;
    private final ConstraintLayout rootView;
    public final TextView tvInfoRecurringMonthly;
    public final TextView tvStatusRecurring;
    public final TextView tvThanks;

    private ActivityRegisterRecurringSuccessBinding(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, Button button, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.animationView = lottieAnimationView;
        this.btnRegRecurringSuccess = button;
        this.tvInfoRecurringMonthly = textView;
        this.tvStatusRecurring = textView2;
        this.tvThanks = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegisterRecurringSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegisterRecurringSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_register_recurring_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegisterRecurringSuccessBinding bind(View view) {
        int i = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animationView);
        if (lottieAnimationView != null) {
            i = R.id.btnRegRecurringSuccess;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnRegRecurringSuccess);
            if (button != null) {
                i = R.id.tvInfoRecurringMonthly;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRecurringMonthly);
                if (textView != null) {
                    i = R.id.tvStatusRecurring;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusRecurring);
                    if (textView2 != null) {
                        i = R.id.tvThanks;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvThanks);
                        if (textView3 != null) {
                            return new ActivityRegisterRecurringSuccessBinding((ConstraintLayout) view, lottieAnimationView, button, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
