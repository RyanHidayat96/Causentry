package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTermsAndAgreementBillerBinding implements ViewBinding {
    public final MaterialButton btnBackBiller;
    public final MaterialButton btnConfirmBiller;
    public final ConstraintLayout constraintLayoutPayment;
    public final RelativeLayout constraintLayoutPaymentActivity;
    public final RelativeLayout footer;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextView tvDescVisionPlusFirst;
    public final TextView tvDescVisionPlusFourth;
    public final TextView tvDescVisionPlusSecond;
    public final TextView tvDescVisionPlusThird;
    public final TextView tvTermsConditionFirst;
    public final TextView tvTermsConditionFirstDesc;
    public final TextView tvTermsConditionFourth;
    public final TextView tvTermsConditionFourthDesc;
    public final TextView tvTermsConditionSecond;
    public final TextView tvTermsConditionSecondDesc;
    public final TextView tvTermsConditionThird;
    public final TextView tvTermsConditionThirdDesc;
    public final TextView tvTitleTermsConditionVision;
    public final View viewLineFooter;

    private ActivityTermsAndAgreementBillerBinding(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, View view) {
        this.rootView = relativeLayout;
        this.btnBackBiller = materialButton;
        this.btnConfirmBiller = materialButton2;
        this.constraintLayoutPayment = constraintLayout;
        this.constraintLayoutPaymentActivity = relativeLayout2;
        this.footer = relativeLayout3;
        this.scrollView = scrollView;
        this.tvDescVisionPlusFirst = textView;
        this.tvDescVisionPlusFourth = textView2;
        this.tvDescVisionPlusSecond = textView3;
        this.tvDescVisionPlusThird = textView4;
        this.tvTermsConditionFirst = textView5;
        this.tvTermsConditionFirstDesc = textView6;
        this.tvTermsConditionFourth = textView7;
        this.tvTermsConditionFourthDesc = textView8;
        this.tvTermsConditionSecond = textView9;
        this.tvTermsConditionSecondDesc = textView10;
        this.tvTermsConditionThird = textView11;
        this.tvTermsConditionThirdDesc = textView12;
        this.tvTitleTermsConditionVision = textView13;
        this.viewLineFooter = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTermsAndAgreementBillerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndAgreementBillerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_terms_and_agreement_biller, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTermsAndAgreementBillerBinding bind(View view) {
        int i = R.id.btnBackBiller;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBackBiller);
        if (materialButton != null) {
            i = R.id.btnConfirmBiller;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmBiller);
            if (materialButton2 != null) {
                i = R.id.constraintLayoutPayment;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayoutPayment);
                if (constraintLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.footer;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.footer);
                    if (relativeLayout2 != null) {
                        i = R.id.scroll_view;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_view);
                        if (scrollView != null) {
                            i = R.id.tvDescVisionPlusFirst;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVisionPlusFirst);
                            if (textView != null) {
                                i = R.id.tvDescVisionPlusFourth;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVisionPlusFourth);
                                if (textView2 != null) {
                                    i = R.id.tvDescVisionPlusSecond;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVisionPlusSecond);
                                    if (textView3 != null) {
                                        i = R.id.tvDescVisionPlusThird;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVisionPlusThird);
                                        if (textView4 != null) {
                                            i = R.id.tvTermsConditionFirst;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionFirst);
                                            if (textView5 != null) {
                                                i = R.id.tvTermsConditionFirstDesc;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionFirstDesc);
                                                if (textView6 != null) {
                                                    i = R.id.tvTermsConditionFourth;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionFourth);
                                                    if (textView7 != null) {
                                                        i = R.id.tvTermsConditionFourthDesc;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionFourthDesc);
                                                        if (textView8 != null) {
                                                            i = R.id.tvTermsConditionSecond;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionSecond);
                                                            if (textView9 != null) {
                                                                i = R.id.tvTermsConditionSecondDesc;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionSecondDesc);
                                                                if (textView10 != null) {
                                                                    i = R.id.tvTermsConditionThird;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionThird);
                                                                    if (textView11 != null) {
                                                                        i = R.id.tvTermsConditionThirdDesc;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionThirdDesc);
                                                                        if (textView12 != null) {
                                                                            i = R.id.tvTitleTermsConditionVision;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleTermsConditionVision);
                                                                            if (textView13 != null) {
                                                                                i = R.id.viewLineFooter;
                                                                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineFooter);
                                                                                if (viewFindChildViewById != null) {
                                                                                    return new ActivityTermsAndAgreementBillerBinding(relativeLayout, materialButton, materialButton2, constraintLayout, relativeLayout, relativeLayout2, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, viewFindChildViewById);
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
