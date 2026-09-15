package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentJpnPeriodicInformationDetailBinding implements ViewBinding {
    public final ConstraintLayout billDetailContainer;
    public final Button btnBenefitDetail;
    public final CircleImageView civProfile;
    public final CardView cvInfoJp;
    public final AppCompatImageView imgCompensation;
    public final AppCompatImageView imgJpnBenefit;
    public final AppCompatImageView imgRapel;
    private final NestedScrollView rootView;
    public final AppCompatTextView tvCompensation;
    public final AppCompatTextView tvConfirmationMonth;
    public final TextView tvGreeting;
    public final AppCompatTextView tvJpnBenefit1;
    public final AppCompatTextView tvJpnBenefit2;
    public final TextView tvNamesWorker;
    public final TextView tvProgramsCovered;
    public final AppCompatTextView tvRapel1;
    public final AppCompatTextView tvRapel2;
    public final TextView tvStatusPayment;
    public final TextView tvTermConditionsBenefit1;
    public final TextView tvTermConditionsBenefit2;
    public final TextView tvTermConditionsBenefit3;
    public final TextView tvTermConditionsBenefit4;
    public final AppCompatTextView tvTitle1;
    public final AppCompatTextView tvTitle2;
    public final TextView tvTotalBenefit;
    public final TextView tvTotalBenefitJpn;
    public final TextView tvTotalCompensation;
    public final TextView tvTotalJpnBenefit;
    public final TextView tvTotalRapel;

    private FragmentJpnPeriodicInformationDetailBinding(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, Button button, CircleImageView circleImageView, CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = nestedScrollView;
        this.billDetailContainer = constraintLayout;
        this.btnBenefitDetail = button;
        this.civProfile = circleImageView;
        this.cvInfoJp = cardView;
        this.imgCompensation = appCompatImageView;
        this.imgJpnBenefit = appCompatImageView2;
        this.imgRapel = appCompatImageView3;
        this.tvCompensation = appCompatTextView;
        this.tvConfirmationMonth = appCompatTextView2;
        this.tvGreeting = textView;
        this.tvJpnBenefit1 = appCompatTextView3;
        this.tvJpnBenefit2 = appCompatTextView4;
        this.tvNamesWorker = textView2;
        this.tvProgramsCovered = textView3;
        this.tvRapel1 = appCompatTextView5;
        this.tvRapel2 = appCompatTextView6;
        this.tvStatusPayment = textView4;
        this.tvTermConditionsBenefit1 = textView5;
        this.tvTermConditionsBenefit2 = textView6;
        this.tvTermConditionsBenefit3 = textView7;
        this.tvTermConditionsBenefit4 = textView8;
        this.tvTitle1 = appCompatTextView7;
        this.tvTitle2 = appCompatTextView8;
        this.tvTotalBenefit = textView9;
        this.tvTotalBenefitJpn = textView10;
        this.tvTotalCompensation = textView11;
        this.tvTotalJpnBenefit = textView12;
        this.tvTotalRapel = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentJpnPeriodicInformationDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentJpnPeriodicInformationDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_jpn_periodic_information_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentJpnPeriodicInformationDetailBinding bind(View view) {
        int i = R.id.billDetailContainer;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.billDetailContainer);
        if (constraintLayout != null) {
            i = R.id.btnBenefitDetail;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBenefitDetail);
            if (button != null) {
                i = R.id.civProfile;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
                if (circleImageView != null) {
                    i = R.id.cvInfoJp;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
                    if (cardView != null) {
                        i = R.id.imgCompensation;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgCompensation);
                        if (appCompatImageView != null) {
                            i = R.id.imgJpnBenefit;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJpnBenefit);
                            if (appCompatImageView2 != null) {
                                i = R.id.imgRapel;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgRapel);
                                if (appCompatImageView3 != null) {
                                    i = R.id.tvCompensation;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCompensation);
                                    if (appCompatTextView != null) {
                                        i = R.id.tvConfirmationMonth;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationMonth);
                                        if (appCompatTextView2 != null) {
                                            i = R.id.tvGreeting;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGreeting);
                                            if (textView != null) {
                                                i = R.id.tvJpnBenefit1;
                                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpnBenefit1);
                                                if (appCompatTextView3 != null) {
                                                    i = R.id.tvJpnBenefit2;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpnBenefit2);
                                                    if (appCompatTextView4 != null) {
                                                        i = R.id.tvNamesWorker;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesWorker);
                                                        if (textView2 != null) {
                                                            i = R.id.tvProgramsCovered;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramsCovered);
                                                            if (textView3 != null) {
                                                                i = R.id.tvRapel1;
                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvRapel1);
                                                                if (appCompatTextView5 != null) {
                                                                    i = R.id.tvRapel2;
                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvRapel2);
                                                                    if (appCompatTextView6 != null) {
                                                                        i = R.id.tvStatusPayment;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusPayment);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvTermConditionsBenefit1;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditionsBenefit1);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvTermConditionsBenefit2;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditionsBenefit2);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvTermConditionsBenefit3;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditionsBenefit3);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tvTermConditionsBenefit4;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditionsBenefit4);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.tvTitle1;
                                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle1);
                                                                                            if (appCompatTextView7 != null) {
                                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle2);
                                                                                                if (appCompatTextView8 != null) {
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalBenefit);
                                                                                                    if (textView9 != null) {
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalBenefitJpn);
                                                                                                        if (textView10 != null) {
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalCompensation);
                                                                                                            if (textView11 != null) {
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalJpnBenefit);
                                                                                                                if (textView12 != null) {
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalRapel);
                                                                                                                    if (textView13 != null) {
                                                                                                                        return new FragmentJpnPeriodicInformationDetailBinding((NestedScrollView) view, constraintLayout, button, circleImageView, cardView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView, appCompatTextView2, textView, appCompatTextView3, appCompatTextView4, textView2, textView3, appCompatTextView5, appCompatTextView6, textView4, textView5, textView6, textView7, textView8, appCompatTextView7, appCompatTextView8, textView9, textView10, textView11, textView12, textView13);
                                                                                                                    }
                                                                                                                    i = R.id.tvTotalRapel;
                                                                                                                } else {
                                                                                                                    i = R.id.tvTotalJpnBenefit;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvTotalCompensation;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvTotalBenefitJpn;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTotalBenefit;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvTitle2;
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
