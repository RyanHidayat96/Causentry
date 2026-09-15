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
public final class ActivityTermsAndConditionDeviceLinkingBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final MaterialButton btnConfirm;
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llTermBox;
    private final ScrollView rootView;
    public final ConstraintLayout salariedWorkerPersonalDataContainer;
    public final TextView tvJmoTitle;
    public final TextView tvJmoTitle2;
    public final TextView tvPageSubtitle;
    public final TextView tvPageTitle;
    public final TextView tvTermConditions;
    public final TextView tvTermConditions2;

    private ActivityTermsAndConditionDeviceLinkingBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.btnBack = materialButton;
        this.btnConfirm = materialButton2;
        this.layoutToolbar = layoutToolbarBinding;
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

    public static ActivityTermsAndConditionDeviceLinkingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndConditionDeviceLinkingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_terms_and_condition_device_linking, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTermsAndConditionDeviceLinkingBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.layoutToolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
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
                                                    return new ActivityTermsAndConditionDeviceLinkingBinding((ScrollView) view, materialButton, materialButton2, layoutToolbarBindingBind, linearLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
