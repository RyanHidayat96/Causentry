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
public final class ActivityTermsAndAgreementVisionPlusBinding implements ViewBinding {
    public final Button btnClose;
    private final ScrollView rootView;
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

    private ActivityTermsAndAgreementVisionPlusBinding(ScrollView scrollView, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = scrollView;
        this.btnClose = button;
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
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityTermsAndAgreementVisionPlusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndAgreementVisionPlusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_terms_and_agreement_vision_plus, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTermsAndAgreementVisionPlusBinding bind(View view) {
        int i = R.id.btnClose;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnClose);
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
                                                                return new ActivityTermsAndAgreementVisionPlusBinding((ScrollView) view, button, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
