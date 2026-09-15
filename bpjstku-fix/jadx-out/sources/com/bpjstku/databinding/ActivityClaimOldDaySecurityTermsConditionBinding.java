package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimOldDaySecurityTermsConditionBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ConstraintLayout containerClaim;
    public final MaterialCardView cvCurrentRsjht;
    public final MaterialCardView cvLastRsjht;
    public final TextView cvSelfieInfo;
    public final Group gbMaxBalance;
    public final View imgLineBottomSheet;
    public final View imgLineBottomSheet2;
    public final ImageView imgViewMaximalBalanceStatus;
    public final ImageView imgViewMembershipStatus;
    public final ImageView imgViewUpdateDataStatus;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MaterialButton linkInfoRsjht;
    private final ConstraintLayout rootView;
    public final TextView tvDevelopmentEstimation;
    public final TextView tvDevelopmentEstimationRupiah;
    public final TextView tvDevelopmentEstimationValue;
    public final TextView tvInfoRsjhtDetailBalance;
    public final TextView tvInfoRsjhtDetailBalanceBeginning;
    public final TextView tvInfoRsjhtDetailBalanceBeginningRupiah;
    public final TextView tvInfoRsjhtDetailBalanceTuition;
    public final TextView tvInfoRsjhtDetailTotalBalance;
    public final TextView tvInfoRsjhtDetailTotalRupiah;
    public final TextView tvInfoRsjhtDetailTuition;
    public final TextView tvInfoRsjhtDetailTuitionRupiah;
    public final TextView tvMaximalBalanceStatus;
    public final TextView tvMaximalBalanceStatus2;
    public final TextView tvMembershipStatus;
    public final TextView tvTitleInfoBalanceJht;
    public final TextView tvTitleInfoRsjhtDetailBalanceBeginning;
    public final TextView tvTitleInfoRsjhtDetailTotal;
    public final TextView tvTitleInformationJht;
    public final TextView tvTitleInformationJhtLast;
    public final TextView tvTitlePrerequesiteClaimJht;
    public final TextView tvTuitionDetail;
    public final TextView tvUpdateDataStatus;

    private ActivityClaimOldDaySecurityTermsConditionBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, Group group, View view, View view2, ImageView imageView, ImageView imageView2, ImageView imageView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MaterialButton materialButton2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.containerClaim = constraintLayout2;
        this.cvCurrentRsjht = materialCardView;
        this.cvLastRsjht = materialCardView2;
        this.cvSelfieInfo = textView;
        this.gbMaxBalance = group;
        this.imgLineBottomSheet = view;
        this.imgLineBottomSheet2 = view2;
        this.imgViewMaximalBalanceStatus = imageView;
        this.imgViewMembershipStatus = imageView2;
        this.imgViewUpdateDataStatus = imageView3;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.linkInfoRsjht = materialButton2;
        this.tvDevelopmentEstimation = textView2;
        this.tvDevelopmentEstimationRupiah = textView3;
        this.tvDevelopmentEstimationValue = textView4;
        this.tvInfoRsjhtDetailBalance = textView5;
        this.tvInfoRsjhtDetailBalanceBeginning = textView6;
        this.tvInfoRsjhtDetailBalanceBeginningRupiah = textView7;
        this.tvInfoRsjhtDetailBalanceTuition = textView8;
        this.tvInfoRsjhtDetailTotalBalance = textView9;
        this.tvInfoRsjhtDetailTotalRupiah = textView10;
        this.tvInfoRsjhtDetailTuition = textView11;
        this.tvInfoRsjhtDetailTuitionRupiah = textView12;
        this.tvMaximalBalanceStatus = textView13;
        this.tvMaximalBalanceStatus2 = textView14;
        this.tvMembershipStatus = textView15;
        this.tvTitleInfoBalanceJht = textView16;
        this.tvTitleInfoRsjhtDetailBalanceBeginning = textView17;
        this.tvTitleInfoRsjhtDetailTotal = textView18;
        this.tvTitleInformationJht = textView19;
        this.tvTitleInformationJhtLast = textView20;
        this.tvTitlePrerequesiteClaimJht = textView21;
        this.tvTuitionDetail = textView22;
        this.tvUpdateDataStatus = textView23;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimOldDaySecurityTermsConditionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimOldDaySecurityTermsConditionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_old_day_security_terms_condition, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimOldDaySecurityTermsConditionBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.cvCurrentRsjht;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvCurrentRsjht);
            if (materialCardView != null) {
                i = R.id.cvLastRsjht;
                MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvLastRsjht);
                if (materialCardView2 != null) {
                    i = R.id.cvSelfieInfo;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cvSelfieInfo);
                    if (textView != null) {
                        i = R.id.gbMaxBalance;
                        Group group = (Group) ViewBindings.findChildViewById(view, R.id.gbMaxBalance);
                        if (group != null) {
                            i = R.id.imgLineBottomSheet;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
                            if (viewFindChildViewById != null) {
                                i = R.id.imgLineBottomSheet2;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet2);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.imgViewMaximalBalanceStatus;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgViewMaximalBalanceStatus);
                                    if (imageView != null) {
                                        i = R.id.imgViewMembershipStatus;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgViewMembershipStatus);
                                        if (imageView2 != null) {
                                            i = R.id.imgViewUpdateDataStatus;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgViewUpdateDataStatus);
                                            if (imageView3 != null) {
                                                i = R.id.layout_toolbar;
                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                if (viewFindChildViewById3 != null) {
                                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById3);
                                                    i = R.id.linkInfoRsjht;
                                                    MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.linkInfoRsjht);
                                                    if (materialButton2 != null) {
                                                        i = R.id.tvDevelopmentEstimation;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDevelopmentEstimation);
                                                        if (textView2 != null) {
                                                            i = R.id.tvDevelopmentEstimationRupiah;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDevelopmentEstimationRupiah);
                                                            if (textView3 != null) {
                                                                i = R.id.tvDevelopmentEstimationValue;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDevelopmentEstimationValue);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvInfoRsjhtDetailBalance;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailBalance);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvInfoRsjhtDetailBalanceBeginning;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailBalanceBeginning);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tvInfoRsjhtDetailBalanceBeginningRupiah;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailBalanceBeginningRupiah);
                                                                            if (textView7 != null) {
                                                                                i = R.id.tvInfoRsjhtDetailBalanceTuition;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailBalanceTuition);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.tvInfoRsjhtDetailTotalBalance;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailTotalBalance);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.tvInfoRsjhtDetailTotalRupiah;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailTotalRupiah);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.tvInfoRsjhtDetailTuition;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailTuition);
                                                                                            if (textView11 != null) {
                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoRsjhtDetailTuitionRupiah);
                                                                                                if (textView12 != null) {
                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMaximalBalanceStatus);
                                                                                                    if (textView13 != null) {
                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMaximalBalanceStatus2);
                                                                                                        if (textView14 != null) {
                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipStatus);
                                                                                                            if (textView15 != null) {
                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoBalanceJht);
                                                                                                                if (textView16 != null) {
                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoRsjhtDetailBalanceBeginning);
                                                                                                                    if (textView17 != null) {
                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoRsjhtDetailTotal);
                                                                                                                        if (textView18 != null) {
                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationJht);
                                                                                                                            if (textView19 != null) {
                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationJhtLast);
                                                                                                                                if (textView20 != null) {
                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePrerequesiteClaimJht);
                                                                                                                                    if (textView21 != null) {
                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionDetail);
                                                                                                                                        if (textView22 != null) {
                                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUpdateDataStatus);
                                                                                                                                            if (textView23 != null) {
                                                                                                                                                return new ActivityClaimOldDaySecurityTermsConditionBinding(constraintLayout, materialButton, constraintLayout, materialCardView, materialCardView2, textView, group, viewFindChildViewById, viewFindChildViewById2, imageView, imageView2, imageView3, layoutToolbarCenterBindingBind, materialButton2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23);
                                                                                                                                            }
                                                                                                                                            i = R.id.tvUpdateDataStatus;
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvTuitionDetail;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvTitlePrerequesiteClaimJht;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvTitleInformationJhtLast;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvTitleInformationJht;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTitleInfoRsjhtDetailTotal;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTitleInfoRsjhtDetailBalanceBeginning;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvTitleInfoBalanceJht;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvMembershipStatus;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvMaximalBalanceStatus2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvMaximalBalanceStatus;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvInfoRsjhtDetailTuitionRupiah;
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
