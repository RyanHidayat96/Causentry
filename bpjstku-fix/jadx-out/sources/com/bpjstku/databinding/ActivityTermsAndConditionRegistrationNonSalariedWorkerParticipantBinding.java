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
public final class ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final MaterialButton btnConfirm;
    public final ConstraintLayout constraintLayoutPayment;
    public final RelativeLayout constraintLayoutPaymentActivity;
    public final TextView fifthInstructionPoint;
    public final TextView fifthInstructionPointDetail;
    public final TextView firstInstructionPoint;
    public final TextView firstInstructionPointDetail;
    public final RelativeLayout footer;
    public final TextView fourthInstructionPoint;
    public final TextView fourthInstructionPointDetail;
    public final RelativeLayout header;
    public final LayoutToolbarBinding layoutToolbar;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextView secondInstructionPoint;
    public final TextView secondInstructionPointDetail;
    public final TextView thirdInstructionPoint;
    public final TextView thirdInstructionPointDetail;
    public final TextView tvFirstPage;
    public final TextView tvTermConditionsTitle;
    public final TextView tvTitleTermsCondition;
    public final View viewLineFooter;

    private ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout3, TextView textView5, TextView textView6, RelativeLayout relativeLayout4, LayoutToolbarBinding layoutToolbarBinding, ScrollView scrollView, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, View view) {
        this.rootView = relativeLayout;
        this.btnBack = materialButton;
        this.btnConfirm = materialButton2;
        this.constraintLayoutPayment = constraintLayout;
        this.constraintLayoutPaymentActivity = relativeLayout2;
        this.fifthInstructionPoint = textView;
        this.fifthInstructionPointDetail = textView2;
        this.firstInstructionPoint = textView3;
        this.firstInstructionPointDetail = textView4;
        this.footer = relativeLayout3;
        this.fourthInstructionPoint = textView5;
        this.fourthInstructionPointDetail = textView6;
        this.header = relativeLayout4;
        this.layoutToolbar = layoutToolbarBinding;
        this.scrollView = scrollView;
        this.secondInstructionPoint = textView7;
        this.secondInstructionPointDetail = textView8;
        this.thirdInstructionPoint = textView9;
        this.thirdInstructionPointDetail = textView10;
        this.tvFirstPage = textView11;
        this.tvTermConditionsTitle = textView12;
        this.tvTitleTermsCondition = textView13;
        this.viewLineFooter = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_terms_and_condition_registration_non_salaried_worker_participant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.constraintLayoutPayment;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayoutPayment);
                if (constraintLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.fifthInstructionPoint;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fifthInstructionPoint);
                    if (textView != null) {
                        i = R.id.fifthInstructionPointDetail;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.fifthInstructionPointDetail);
                        if (textView2 != null) {
                            i = R.id.firstInstructionPoint;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.firstInstructionPoint);
                            if (textView3 != null) {
                                i = R.id.firstInstructionPointDetail;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.firstInstructionPointDetail);
                                if (textView4 != null) {
                                    i = R.id.footer;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.footer);
                                    if (relativeLayout2 != null) {
                                        i = R.id.fourthInstructionPoint;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.fourthInstructionPoint);
                                        if (textView5 != null) {
                                            i = R.id.fourthInstructionPointDetail;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.fourthInstructionPointDetail);
                                            if (textView6 != null) {
                                                i = R.id.header;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.header);
                                                if (relativeLayout3 != null) {
                                                    i = R.id.layout_toolbar;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                    if (viewFindChildViewById != null) {
                                                        LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                                                        i = R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_view);
                                                        if (scrollView != null) {
                                                            i = R.id.secondInstructionPoint;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.secondInstructionPoint);
                                                            if (textView7 != null) {
                                                                i = R.id.secondInstructionPointDetail;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.secondInstructionPointDetail);
                                                                if (textView8 != null) {
                                                                    i = R.id.thirdInstructionPoint;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.thirdInstructionPoint);
                                                                    if (textView9 != null) {
                                                                        i = R.id.thirdInstructionPointDetail;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.thirdInstructionPointDetail);
                                                                        if (textView10 != null) {
                                                                            i = R.id.tvFirstPage;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFirstPage);
                                                                            if (textView11 != null) {
                                                                                i = R.id.tvTermConditionsTitle;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditionsTitle);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.tvTitleTermsCondition;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleTermsCondition);
                                                                                    if (textView13 != null) {
                                                                                        i = R.id.viewLineFooter;
                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineFooter);
                                                                                        if (viewFindChildViewById2 != null) {
                                                                                            return new ActivityTermsAndConditionRegistrationNonSalariedWorkerParticipantBinding(relativeLayout, materialButton, materialButton2, constraintLayout, relativeLayout, textView, textView2, textView3, textView4, relativeLayout2, textView5, textView6, relativeLayout3, layoutToolbarBindingBind, scrollView, textView7, textView8, textView9, textView10, textView11, textView12, textView13, viewFindChildViewById2);
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
