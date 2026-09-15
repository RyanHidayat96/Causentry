package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemBalanceDetailCheckBinding implements ViewBinding {
    public final CardView cvBalanceDetail;
    public final ImageView imgBalanceDetail;
    public final AppCompatImageView imgProgramJHT;
    public final AppCompatImageView imgProgramJKK;
    public final AppCompatImageView imgProgramJKM;
    public final AppCompatImageView imgProgramJKP;
    public final AppCompatImageView imgProgramJP;
    private final ConstraintLayout rootView;
    public final TextView tvBalanceCompany;
    public final TextView tvBalanceCompanyValue;
    public final TextView tvBalanceDetail;
    public final TextView tvBalanceFollowedProgram;
    public final TextView tvBalanceLatestTuition;
    public final TextView tvBalanceLatestTuitionPayment;
    public final TextView tvBalanceLatestTuitionPaymentValue;
    public final TextView tvBalanceLatestTuitionValue;
    public final TextView tvBalanceSegment;
    public final TextView tvBalanceSegmentValue;
    public final TextView tvBalanceStatusDetail;
    public final TextView tvBalanceTotalWorker;
    public final TextView tvBalanceTotalWorkerValue;
    public final TextView tvBalanceValueDetail;
    public final TextView tvMembershiStatusValue;
    public final TextView tvMembershipStatus;
    public final TextView tvProgramFollowedError;
    public final TextView tvProgramItemJHT;
    public final TextView tvProgramItemJKK;
    public final TextView tvProgramItemJKM;
    public final TextView tvProgramItemJKP;
    public final TextView tvProgramItemJP;
    public final View viewDividerBalanceCompanyName;
    public final View viewDividerBalanceLatestTuitionPaymentValue;
    public final View viewDividerBalanceLatestTuitionValue;
    public final View viewDividerBalanceTotalWorkerValue;
    public final View viewDividerSegment;
    public final View viewMembershipStatus;

    private ItemBalanceDetailCheckBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.cvBalanceDetail = cardView;
        this.imgBalanceDetail = imageView;
        this.imgProgramJHT = appCompatImageView;
        this.imgProgramJKK = appCompatImageView2;
        this.imgProgramJKM = appCompatImageView3;
        this.imgProgramJKP = appCompatImageView4;
        this.imgProgramJP = appCompatImageView5;
        this.tvBalanceCompany = textView;
        this.tvBalanceCompanyValue = textView2;
        this.tvBalanceDetail = textView3;
        this.tvBalanceFollowedProgram = textView4;
        this.tvBalanceLatestTuition = textView5;
        this.tvBalanceLatestTuitionPayment = textView6;
        this.tvBalanceLatestTuitionPaymentValue = textView7;
        this.tvBalanceLatestTuitionValue = textView8;
        this.tvBalanceSegment = textView9;
        this.tvBalanceSegmentValue = textView10;
        this.tvBalanceStatusDetail = textView11;
        this.tvBalanceTotalWorker = textView12;
        this.tvBalanceTotalWorkerValue = textView13;
        this.tvBalanceValueDetail = textView14;
        this.tvMembershiStatusValue = textView15;
        this.tvMembershipStatus = textView16;
        this.tvProgramFollowedError = textView17;
        this.tvProgramItemJHT = textView18;
        this.tvProgramItemJKK = textView19;
        this.tvProgramItemJKM = textView20;
        this.tvProgramItemJKP = textView21;
        this.tvProgramItemJP = textView22;
        this.viewDividerBalanceCompanyName = view;
        this.viewDividerBalanceLatestTuitionPaymentValue = view2;
        this.viewDividerBalanceLatestTuitionValue = view3;
        this.viewDividerBalanceTotalWorkerValue = view4;
        this.viewDividerSegment = view5;
        this.viewMembershipStatus = view6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBalanceDetailCheckBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBalanceDetailCheckBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_balance_detail_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBalanceDetailCheckBinding bind(View view) {
        int i = R.id.cvBalanceDetail;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvBalanceDetail);
        if (cardView != null) {
            i = R.id.imgBalanceDetail;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceDetail);
            if (imageView != null) {
                i = R.id.imgProgramJHT;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramJHT);
                if (appCompatImageView != null) {
                    i = R.id.imgProgramJKK;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramJKK);
                    if (appCompatImageView2 != null) {
                        i = R.id.imgProgramJKM;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramJKM);
                        if (appCompatImageView3 != null) {
                            i = R.id.imgProgramJKP;
                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramJKP);
                            if (appCompatImageView4 != null) {
                                i = R.id.imgProgramJP;
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgramJP);
                                if (appCompatImageView5 != null) {
                                    i = R.id.tvBalanceCompany;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceCompany);
                                    if (textView != null) {
                                        i = R.id.tvBalanceCompanyValue;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceCompanyValue);
                                        if (textView2 != null) {
                                            i = R.id.tvBalanceDetail;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceDetail);
                                            if (textView3 != null) {
                                                i = R.id.tvBalanceFollowedProgram;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceFollowedProgram);
                                                if (textView4 != null) {
                                                    i = R.id.tvBalanceLatestTuition;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceLatestTuition);
                                                    if (textView5 != null) {
                                                        i = R.id.tvBalanceLatestTuitionPayment;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceLatestTuitionPayment);
                                                        if (textView6 != null) {
                                                            i = R.id.tvBalanceLatestTuitionPaymentValue;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceLatestTuitionPaymentValue);
                                                            if (textView7 != null) {
                                                                i = R.id.tvBalanceLatestTuitionValue;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceLatestTuitionValue);
                                                                if (textView8 != null) {
                                                                    i = R.id.tvBalanceSegment;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceSegment);
                                                                    if (textView9 != null) {
                                                                        i = R.id.tvBalanceSegmentValue;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceSegmentValue);
                                                                        if (textView10 != null) {
                                                                            i = R.id.tvBalanceStatusDetail;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceStatusDetail);
                                                                            if (textView11 != null) {
                                                                                i = R.id.tvBalanceTotalWorker;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceTotalWorker);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.tvBalanceTotalWorkerValue;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceTotalWorkerValue);
                                                                                    if (textView13 != null) {
                                                                                        i = R.id.tvBalanceValueDetail;
                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceValueDetail);
                                                                                        if (textView14 != null) {
                                                                                            i = R.id.tvMembershiStatusValue;
                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershiStatusValue);
                                                                                            if (textView15 != null) {
                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipStatus);
                                                                                                if (textView16 != null) {
                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramFollowedError);
                                                                                                    if (textView17 != null) {
                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItemJHT);
                                                                                                        if (textView18 != null) {
                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItemJKK);
                                                                                                            if (textView19 != null) {
                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItemJKM);
                                                                                                                if (textView20 != null) {
                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItemJKP);
                                                                                                                    if (textView21 != null) {
                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItemJP);
                                                                                                                        if (textView22 != null) {
                                                                                                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewDividerBalanceCompanyName);
                                                                                                                            if (viewFindChildViewById != null) {
                                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewDividerBalanceLatestTuitionPaymentValue);
                                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewDividerBalanceLatestTuitionValue);
                                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewDividerBalanceTotalWorkerValue);
                                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewDividerSegment);
                                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewMembershipStatus);
                                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                                    return new ItemBalanceDetailCheckBinding((ConstraintLayout) view, cardView, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
                                                                                                                                                }
                                                                                                                                                i = R.id.viewMembershipStatus;
                                                                                                                                            } else {
                                                                                                                                                i = R.id.viewDividerSegment;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.viewDividerBalanceTotalWorkerValue;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.viewDividerBalanceLatestTuitionValue;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.viewDividerBalanceLatestTuitionPaymentValue;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.viewDividerBalanceCompanyName;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvProgramItemJP;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvProgramItemJKP;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvProgramItemJKM;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvProgramItemJKK;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvProgramItemJHT;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvProgramFollowedError;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvMembershipStatus;
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
