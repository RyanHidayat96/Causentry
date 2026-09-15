package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTermsAndAgreementRctiPlusBinding implements ViewBinding {
    public final Button btnCloseRctiPlus;
    private final ScrollView rootView;
    public final TextView tvDescVisionPlusFirst;
    public final TextView tvDescVisionPlusFourth;
    public final TextView tvDescVisionPlusSecond;
    public final TextView tvDescVisionPlusThird;
    public final TextView tvTermsConditionFirst;
    public final TextView tvTermsConditionFirstDesc;
    public final TextView tvTermsConditionSecond;
    public final TextView tvTermsConditionSecondDesc;
    public final TextView tvTermsConditionThird;
    public final TextView tvTermsConditionThirdDesc;
    public final TextView tvTitleTermsConditionVision;

    private ActivityTermsAndAgreementRctiPlusBinding(ScrollView scrollView, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = scrollView;
        this.btnCloseRctiPlus = button;
        this.tvDescVisionPlusFirst = textView;
        this.tvDescVisionPlusFourth = textView2;
        this.tvDescVisionPlusSecond = textView3;
        this.tvDescVisionPlusThird = textView4;
        this.tvTermsConditionFirst = textView5;
        this.tvTermsConditionFirstDesc = textView6;
        this.tvTermsConditionSecond = textView7;
        this.tvTermsConditionSecondDesc = textView8;
        this.tvTermsConditionThird = textView9;
        this.tvTermsConditionThirdDesc = textView10;
        this.tvTitleTermsConditionVision = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityTermsAndAgreementRctiPlusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndAgreementRctiPlusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_terms_and_agreement_rcti_plus, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTermsAndAgreementRctiPlusBinding bind(View view) {
        int i = R.id.btnCloseRctiPlus;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCloseRctiPlus);
        if (button != null) {
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
                                    i = R.id.tvTermsConditionSecond;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionSecond);
                                    if (textView7 != null) {
                                        i = R.id.tvTermsConditionSecondDesc;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionSecondDesc);
                                        if (textView8 != null) {
                                            i = R.id.tvTermsConditionThird;
                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionThird);
                                            if (textView9 != null) {
                                                i = R.id.tvTermsConditionThirdDesc;
                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditionThirdDesc);
                                                if (textView10 != null) {
                                                    i = R.id.tvTitleTermsConditionVision;
                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleTermsConditionVision);
                                                    if (textView11 != null) {
                                                        return new ActivityTermsAndAgreementRctiPlusBinding((ScrollView) view, button, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
