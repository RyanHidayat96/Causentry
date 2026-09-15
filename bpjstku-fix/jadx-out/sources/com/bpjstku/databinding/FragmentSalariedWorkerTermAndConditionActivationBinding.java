package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSalariedWorkerTermAndConditionActivationBinding implements ViewBinding {
    public final MaterialButton btnAgree;
    public final MaterialButton btnDisagree;
    public final LinearLayout llTermBox;
    private final ScrollView rootView;
    public final ConstraintLayout salariedWorkerPersonalDataContainer;
    public final TextView tvJmoTitle;
    public final TextView tvJmoTitle2;
    public final TextView tvPageSubtitle;
    public final TextView tvPageTitle;
    public final TextView tvTermConditions;
    public final TextView tvTermConditions2;

    private FragmentSalariedWorkerTermAndConditionActivationBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.btnAgree = materialButton;
        this.btnDisagree = materialButton2;
        this.llTermBox = linearLayout;
        this.salariedWorkerPersonalDataContainer = constraintLayout;
        this.tvJmoTitle = textView;
        this.tvJmoTitle2 = textView2;
        this.tvPageSubtitle = textView3;
        this.tvPageTitle = textView4;
        this.tvTermConditions = textView5;
        this.tvTermConditions2 = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentSalariedWorkerTermAndConditionActivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSalariedWorkerTermAndConditionActivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_salaried_worker_term_and_condition_activation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSalariedWorkerTermAndConditionActivationBinding bind(View view) {
        int i = R.id.btnAgree;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAgree);
        if (materialButton != null) {
            i = R.id.btnDisagree;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDisagree);
            if (materialButton2 != null) {
                i = R.id.llTermBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTermBox);
                if (linearLayout != null) {
                    i = R.id.salariedWorkerPersonalDataContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerPersonalDataContainer);
                    if (constraintLayout != null) {
                        i = R.id.tvJmoTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvJmoTitle);
                        if (textView != null) {
                            i = R.id.tvJmoTitle2;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJmoTitle2);
                            if (textView2 != null) {
                                i = R.id.tvPageSubtitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageSubtitle);
                                if (textView3 != null) {
                                    i = R.id.tvPageTitle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageTitle);
                                    if (textView4 != null) {
                                        i = R.id.tvTermConditions;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditions);
                                        if (textView5 != null) {
                                            i = R.id.tvTermConditions2;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditions2);
                                            if (textView6 != null) {
                                                return new FragmentSalariedWorkerTermAndConditionActivationBinding((ScrollView) view, materialButton, materialButton2, linearLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
