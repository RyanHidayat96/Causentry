package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySyariahActivationDetailBinding implements ViewBinding {
    public final MaterialButton btnActivate;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final LayoutToolbarBinding layoutToolbar;
    private final LinearLayout rootView;
    public final TextView tvAkadTermsDescriptionContentFifth;
    public final TextView tvAkadTermsDescriptionContentFifthA;
    public final TextView tvAkadTermsDescriptionContentFifthB;
    public final TextView tvAkadTermsDescriptionContentFifthPoint;
    public final TextView tvAkadTermsDescriptionContentFifthPointA;
    public final TextView tvAkadTermsDescriptionContentFifthPointB;
    public final TextView tvAkadTermsDescriptionContentFirst;
    public final TextView tvAkadTermsDescriptionContentFirstPoint;
    public final TextView tvAkadTermsDescriptionContentFourth;
    public final TextView tvAkadTermsDescriptionContentFourthPoint;
    public final TextView tvAkadTermsDescriptionContentSecond;
    public final TextView tvAkadTermsDescriptionContentSecondPoint;
    public final TextView tvAkadTermsDescriptionContentSeventh;
    public final TextView tvAkadTermsDescriptionContentSeventhPoint;
    public final TextView tvAkadTermsDescriptionContentSixth;
    public final TextView tvAkadTermsDescriptionContentSixthPoint;
    public final TextView tvAkadTermsDescriptionContentThird;
    public final TextView tvAkadTermsDescriptionContentThirdPoint;
    public final TextView tvAkadTermsDescriptionHead;
    public final TextView tvConfirmationApprovalDescription;
    public final TextView tvConfirmationApprovalDescriptionContentPointA;
    public final TextView tvConfirmationApprovalDescriptionContentPointB;
    public final TextView tvConfirmationApprovalDescriptionPointA;
    public final TextView tvConfirmationApprovalDescriptionPointB;
    public final TextView tvTitleAkadTerms;
    public final TextView tvTitleConfirmationApproval;
    public final TextView tvTitleSyariahTermsConditions;

    private ActivitySyariahActivationDetailBinding(LinearLayout linearLayout, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27) {
        this.rootView = linearLayout;
        this.btnActivate = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.layoutToolbar = layoutToolbarBinding;
        this.tvAkadTermsDescriptionContentFifth = textView;
        this.tvAkadTermsDescriptionContentFifthA = textView2;
        this.tvAkadTermsDescriptionContentFifthB = textView3;
        this.tvAkadTermsDescriptionContentFifthPoint = textView4;
        this.tvAkadTermsDescriptionContentFifthPointA = textView5;
        this.tvAkadTermsDescriptionContentFifthPointB = textView6;
        this.tvAkadTermsDescriptionContentFirst = textView7;
        this.tvAkadTermsDescriptionContentFirstPoint = textView8;
        this.tvAkadTermsDescriptionContentFourth = textView9;
        this.tvAkadTermsDescriptionContentFourthPoint = textView10;
        this.tvAkadTermsDescriptionContentSecond = textView11;
        this.tvAkadTermsDescriptionContentSecondPoint = textView12;
        this.tvAkadTermsDescriptionContentSeventh = textView13;
        this.tvAkadTermsDescriptionContentSeventhPoint = textView14;
        this.tvAkadTermsDescriptionContentSixth = textView15;
        this.tvAkadTermsDescriptionContentSixthPoint = textView16;
        this.tvAkadTermsDescriptionContentThird = textView17;
        this.tvAkadTermsDescriptionContentThirdPoint = textView18;
        this.tvAkadTermsDescriptionHead = textView19;
        this.tvConfirmationApprovalDescription = textView20;
        this.tvConfirmationApprovalDescriptionContentPointA = textView21;
        this.tvConfirmationApprovalDescriptionContentPointB = textView22;
        this.tvConfirmationApprovalDescriptionPointA = textView23;
        this.tvConfirmationApprovalDescriptionPointB = textView24;
        this.tvTitleAkadTerms = textView25;
        this.tvTitleConfirmationApproval = textView26;
        this.tvTitleSyariahTermsConditions = textView27;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySyariahActivationDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySyariahActivationDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_syariah_activation_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySyariahActivationDetailBinding bind(View view) {
        int i = R.id.btnActivate;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnActivate);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                    i = R.id.tvAkadTermsDescriptionContentFifth;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifth);
                    if (textView != null) {
                        i = R.id.tvAkadTermsDescriptionContentFifthA;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifthA);
                        if (textView2 != null) {
                            i = R.id.tvAkadTermsDescriptionContentFifthB;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifthB);
                            if (textView3 != null) {
                                i = R.id.tvAkadTermsDescriptionContentFifthPoint;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifthPoint);
                                if (textView4 != null) {
                                    i = R.id.tvAkadTermsDescriptionContentFifthPointA;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifthPointA);
                                    if (textView5 != null) {
                                        i = R.id.tvAkadTermsDescriptionContentFifthPointB;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFifthPointB);
                                        if (textView6 != null) {
                                            i = R.id.tvAkadTermsDescriptionContentFirst;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFirst);
                                            if (textView7 != null) {
                                                i = R.id.tvAkadTermsDescriptionContentFirstPoint;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFirstPoint);
                                                if (textView8 != null) {
                                                    i = R.id.tvAkadTermsDescriptionContentFourth;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFourth);
                                                    if (textView9 != null) {
                                                        i = R.id.tvAkadTermsDescriptionContentFourthPoint;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentFourthPoint);
                                                        if (textView10 != null) {
                                                            i = R.id.tvAkadTermsDescriptionContentSecond;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSecond);
                                                            if (textView11 != null) {
                                                                i = R.id.tvAkadTermsDescriptionContentSecondPoint;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSecondPoint);
                                                                if (textView12 != null) {
                                                                    i = R.id.tvAkadTermsDescriptionContentSeventh;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSeventh);
                                                                    if (textView13 != null) {
                                                                        i = R.id.tvAkadTermsDescriptionContentSeventhPoint;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSeventhPoint);
                                                                        if (textView14 != null) {
                                                                            i = R.id.tvAkadTermsDescriptionContentSixth;
                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSixth);
                                                                            if (textView15 != null) {
                                                                                i = R.id.tvAkadTermsDescriptionContentSixthPoint;
                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentSixthPoint);
                                                                                if (textView16 != null) {
                                                                                    i = R.id.tvAkadTermsDescriptionContentThird;
                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentThird);
                                                                                    if (textView17 != null) {
                                                                                        i = R.id.tvAkadTermsDescriptionContentThirdPoint;
                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionContentThirdPoint);
                                                                                        if (textView18 != null) {
                                                                                            i = R.id.tvAkadTermsDescriptionHead;
                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAkadTermsDescriptionHead);
                                                                                            if (textView19 != null) {
                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationApprovalDescription);
                                                                                                if (textView20 != null) {
                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationApprovalDescriptionContentPointA);
                                                                                                    if (textView21 != null) {
                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationApprovalDescriptionContentPointB);
                                                                                                        if (textView22 != null) {
                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationApprovalDescriptionPointA);
                                                                                                            if (textView23 != null) {
                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationApprovalDescriptionPointB);
                                                                                                                if (textView24 != null) {
                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleAkadTerms);
                                                                                                                    if (textView25 != null) {
                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleConfirmationApproval);
                                                                                                                        if (textView26 != null) {
                                                                                                                            TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleSyariahTermsConditions);
                                                                                                                            if (textView27 != null) {
                                                                                                                                return new ActivitySyariahActivationDetailBinding((LinearLayout) view, materialButton, appCompatCheckBox, layoutToolbarBindingBind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27);
                                                                                                                            }
                                                                                                                            i = R.id.tvTitleSyariahTermsConditions;
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTitleConfirmationApproval;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTitleAkadTerms;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvConfirmationApprovalDescriptionPointB;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvConfirmationApprovalDescriptionPointA;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvConfirmationApprovalDescriptionContentPointB;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvConfirmationApprovalDescriptionContentPointA;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvConfirmationApprovalDescription;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
