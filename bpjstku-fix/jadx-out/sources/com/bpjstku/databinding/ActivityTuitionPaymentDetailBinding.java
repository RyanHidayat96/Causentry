package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTuitionPaymentDetailBinding implements ViewBinding {
    public final ConstraintLayout billDetailContainer;
    public final MaterialButton btnAddProgram;
    public final MaterialButton btnPayment;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final LinearLayout rootView;
    public final RecyclerView rvMembershipChoosen;
    public final TextView tvBillDetail;
    public final TextView tvChoosenProgram;
    public final AppCompatTextView tvDetailPaymentLabel;
    public final AppCompatTextView tvFinalPaymentLabel;
    public final AppCompatTextView tvFinalPaymentValue;
    public final AppCompatTextView tvIdCard;
    public final AppCompatTextView tvIdCardLabel;
    public final AppCompatTextView tvJHTLabel;
    public final AppCompatTextView tvJHTTuituionLabel;
    public final AppCompatTextView tvJKKLabel;
    public final AppCompatTextView tvJKKTuituionLabel;
    public final AppCompatTextView tvJKMLabel;
    public final AppCompatTextView tvJKMTuituionLabel;
    public final AppCompatTextView tvMembershipPeriod;
    public final AppCompatTextView tvMembershipPeriodLabel;
    public final AppCompatTextView tvPeriod;
    public final AppCompatTextView tvPeriodLabel;
    public final AppCompatTextView tvTotalPay;
    public final AppCompatTextView tvTotalPayLabel;
    public final AppCompatTextView tvUserName;
    public final AppCompatTextView tvUserNameLabel;
    public final View viewLineIDCard;
    public final View viewLineJHT;
    public final View viewLineJKK;
    public final View viewLineJKM;
    public final View viewLineMembershipPeriod;
    public final View viewLineName;
    public final View viewLinePeriod;
    public final View viewLineTotalPay;

    private ActivityTuitionPaymentDetailBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, AppCompatTextView appCompatTextView13, AppCompatTextView appCompatTextView14, AppCompatTextView appCompatTextView15, AppCompatTextView appCompatTextView16, AppCompatTextView appCompatTextView17, AppCompatTextView appCompatTextView18, AppCompatTextView appCompatTextView19, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8) {
        this.rootView = linearLayout;
        this.billDetailContainer = constraintLayout;
        this.btnAddProgram = materialButton;
        this.btnPayment = materialButton2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvMembershipChoosen = recyclerView;
        this.tvBillDetail = textView;
        this.tvChoosenProgram = textView2;
        this.tvDetailPaymentLabel = appCompatTextView;
        this.tvFinalPaymentLabel = appCompatTextView2;
        this.tvFinalPaymentValue = appCompatTextView3;
        this.tvIdCard = appCompatTextView4;
        this.tvIdCardLabel = appCompatTextView5;
        this.tvJHTLabel = appCompatTextView6;
        this.tvJHTTuituionLabel = appCompatTextView7;
        this.tvJKKLabel = appCompatTextView8;
        this.tvJKKTuituionLabel = appCompatTextView9;
        this.tvJKMLabel = appCompatTextView10;
        this.tvJKMTuituionLabel = appCompatTextView11;
        this.tvMembershipPeriod = appCompatTextView12;
        this.tvMembershipPeriodLabel = appCompatTextView13;
        this.tvPeriod = appCompatTextView14;
        this.tvPeriodLabel = appCompatTextView15;
        this.tvTotalPay = appCompatTextView16;
        this.tvTotalPayLabel = appCompatTextView17;
        this.tvUserName = appCompatTextView18;
        this.tvUserNameLabel = appCompatTextView19;
        this.viewLineIDCard = view;
        this.viewLineJHT = view2;
        this.viewLineJKK = view3;
        this.viewLineJKM = view4;
        this.viewLineMembershipPeriod = view5;
        this.viewLineName = view6;
        this.viewLinePeriod = view7;
        this.viewLineTotalPay = view8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityTuitionPaymentDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTuitionPaymentDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tuition_payment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTuitionPaymentDetailBinding bind(View view) {
        int i = R.id.billDetailContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.billDetailContainer);
        if (constraintLayout != null) {
            i = R.id.btnAddProgram;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAddProgram);
            if (materialButton != null) {
                i = R.id.btnPayment;
                MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPayment);
                if (materialButton2 != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.rvMembershipChoosen;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvMembershipChoosen);
                        if (recyclerView != null) {
                            i = R.id.tvBillDetail;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBillDetail);
                            if (textView != null) {
                                i = R.id.tvChoosenProgram;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChoosenProgram);
                                if (textView2 != null) {
                                    i = R.id.tvDetailPaymentLabel;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDetailPaymentLabel);
                                    if (appCompatTextView != null) {
                                        i = R.id.tvFinalPaymentLabel;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvFinalPaymentLabel);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.tvFinalPaymentValue;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvFinalPaymentValue);
                                            if (appCompatTextView3 != null) {
                                                i = R.id.tvIdCard;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvIdCard);
                                                if (appCompatTextView4 != null) {
                                                    i = R.id.tvIdCardLabel;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvIdCardLabel);
                                                    if (appCompatTextView5 != null) {
                                                        i = R.id.tvJHTLabel;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJHTLabel);
                                                        if (appCompatTextView6 != null) {
                                                            i = R.id.tvJHTTuituionLabel;
                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJHTTuituionLabel);
                                                            if (appCompatTextView7 != null) {
                                                                i = R.id.tvJKKLabel;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKKLabel);
                                                                if (appCompatTextView8 != null) {
                                                                    i = R.id.tvJKKTuituionLabel;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKKTuituionLabel);
                                                                    if (appCompatTextView9 != null) {
                                                                        i = R.id.tvJKMLabel;
                                                                        AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKMLabel);
                                                                        if (appCompatTextView10 != null) {
                                                                            i = R.id.tvJKMTuituionLabel;
                                                                            AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKMTuituionLabel);
                                                                            if (appCompatTextView11 != null) {
                                                                                i = R.id.tvMembershipPeriod;
                                                                                AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvMembershipPeriod);
                                                                                if (appCompatTextView12 != null) {
                                                                                    i = R.id.tvMembershipPeriodLabel;
                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvMembershipPeriodLabel);
                                                                                    if (appCompatTextView13 != null) {
                                                                                        i = R.id.tvPeriod;
                                                                                        AppCompatTextView appCompatTextView14 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPeriod);
                                                                                        if (appCompatTextView14 != null) {
                                                                                            i = R.id.tvPeriodLabel;
                                                                                            AppCompatTextView appCompatTextView15 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPeriodLabel);
                                                                                            if (appCompatTextView15 != null) {
                                                                                                AppCompatTextView appCompatTextView16 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTotalPay);
                                                                                                if (appCompatTextView16 != null) {
                                                                                                    AppCompatTextView appCompatTextView17 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTotalPayLabel);
                                                                                                    if (appCompatTextView17 != null) {
                                                                                                        AppCompatTextView appCompatTextView18 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvUserName);
                                                                                                        if (appCompatTextView18 != null) {
                                                                                                            AppCompatTextView appCompatTextView19 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvUserNameLabel);
                                                                                                            if (appCompatTextView19 != null) {
                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineIDCard);
                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewLineJHT);
                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewLineJKK);
                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewLineJKM);
                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewLineMembershipPeriod);
                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.viewLineName);
                                                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.viewLinePeriod);
                                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                                            View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.viewLineTotalPay);
                                                                                                                                            if (viewFindChildViewById9 != null) {
                                                                                                                                                return new ActivityTuitionPaymentDetailBinding((LinearLayout) view, constraintLayout, materialButton, materialButton2, layoutToolbarCenterBindingBind, recyclerView, textView, textView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, appCompatTextView12, appCompatTextView13, appCompatTextView14, appCompatTextView15, appCompatTextView16, appCompatTextView17, appCompatTextView18, appCompatTextView19, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9);
                                                                                                                                            }
                                                                                                                                            i = R.id.viewLineTotalPay;
                                                                                                                                        } else {
                                                                                                                                            i = R.id.viewLinePeriod;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.viewLineName;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.viewLineMembershipPeriod;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.viewLineJKM;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.viewLineJKK;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.viewLineJHT;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.viewLineIDCard;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvUserNameLabel;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvUserName;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTotalPayLabel;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvTotalPay;
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
