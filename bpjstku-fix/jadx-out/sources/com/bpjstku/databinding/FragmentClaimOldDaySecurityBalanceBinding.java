package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentClaimOldDaySecurityBalanceBinding implements ViewBinding {
    public final Button btnNext;
    public final Group gbReactivation;
    public final View imgLineBottomSheet;
    public final View imgLineBottomSheet2;
    public final View imgLineBottomSheet3;
    public final View imgLineBottomSheet4;
    private final ScrollView rootView;
    public final TextView tvBalaceDevelopment;
    public final TextView tvBalaceDevelopmentRupiah;
    public final TextView tvBalaceDevelopmentTotal;
    public final TextView tvBalaceDevelopmentTotalRupiah;
    public final TextView tvBalaceDevelopmentTotalValue;
    public final TextView tvBalaceDevelopmentValue;
    public final TextView tvBeginingBalance;
    public final TextView tvBeginingBalanceRupiah;
    public final TextView tvBeginingBalanceValue;
    public final TextView tvBpuFeeBalace;
    public final TextView tvBpuFeeBalaceValue;
    public final TextView tvBpuFeeRupiah;
    public final TextView tvFinalBalace;
    public final TextView tvFinalBalaceRupiah;
    public final TextView tvFinalBalaceValue;
    public final TextView tvFinalTotalRupiah;
    public final TextView tvFinalTotalValue;
    public final TextView tvRoundingOff;
    public final TextView tvRoundingOffRupiah;
    public final TextView tvRoundingOffValue;
    public final TextView tvTaxTotal;
    public final TextView tvTaxTotalRupiah;
    public final TextView tvTaxValue;
    public final TextView tvTotalBalace;

    private FragmentClaimOldDaySecurityBalanceBinding(ScrollView scrollView, Button button, Group group, View view, View view2, View view3, View view4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.gbReactivation = group;
        this.imgLineBottomSheet = view;
        this.imgLineBottomSheet2 = view2;
        this.imgLineBottomSheet3 = view3;
        this.imgLineBottomSheet4 = view4;
        this.tvBalaceDevelopment = textView;
        this.tvBalaceDevelopmentRupiah = textView2;
        this.tvBalaceDevelopmentTotal = textView3;
        this.tvBalaceDevelopmentTotalRupiah = textView4;
        this.tvBalaceDevelopmentTotalValue = textView5;
        this.tvBalaceDevelopmentValue = textView6;
        this.tvBeginingBalance = textView7;
        this.tvBeginingBalanceRupiah = textView8;
        this.tvBeginingBalanceValue = textView9;
        this.tvBpuFeeBalace = textView10;
        this.tvBpuFeeBalaceValue = textView11;
        this.tvBpuFeeRupiah = textView12;
        this.tvFinalBalace = textView13;
        this.tvFinalBalaceRupiah = textView14;
        this.tvFinalBalaceValue = textView15;
        this.tvFinalTotalRupiah = textView16;
        this.tvFinalTotalValue = textView17;
        this.tvRoundingOff = textView18;
        this.tvRoundingOffRupiah = textView19;
        this.tvRoundingOffValue = textView20;
        this.tvTaxTotal = textView21;
        this.tvTaxTotalRupiah = textView22;
        this.tvTaxValue = textView23;
        this.tvTotalBalace = textView24;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDaySecurityBalanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDaySecurityBalanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_day_security_balance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDaySecurityBalanceBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.gbReactivation;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.gbReactivation);
            if (group != null) {
                i = R.id.imgLineBottomSheet;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
                if (viewFindChildViewById != null) {
                    i = R.id.imgLineBottomSheet2;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet2);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.imgLineBottomSheet3;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet3);
                        if (viewFindChildViewById3 != null) {
                            i = R.id.imgLineBottomSheet4;
                            View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet4);
                            if (viewFindChildViewById4 != null) {
                                i = R.id.tvBalaceDevelopment;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopment);
                                if (textView != null) {
                                    i = R.id.tvBalaceDevelopmentRupiah;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopmentRupiah);
                                    if (textView2 != null) {
                                        i = R.id.tvBalaceDevelopmentTotal;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopmentTotal);
                                        if (textView3 != null) {
                                            i = R.id.tvBalaceDevelopmentTotalRupiah;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopmentTotalRupiah);
                                            if (textView4 != null) {
                                                i = R.id.tvBalaceDevelopmentTotalValue;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopmentTotalValue);
                                                if (textView5 != null) {
                                                    i = R.id.tvBalaceDevelopmentValue;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalaceDevelopmentValue);
                                                    if (textView6 != null) {
                                                        i = R.id.tvBeginingBalance;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeginingBalance);
                                                        if (textView7 != null) {
                                                            i = R.id.tvBeginingBalanceRupiah;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeginingBalanceRupiah);
                                                            if (textView8 != null) {
                                                                i = R.id.tvBeginingBalanceValue;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeginingBalanceValue);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvBpuFeeBalace;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBpuFeeBalace);
                                                                    if (textView10 != null) {
                                                                        i = R.id.tvBpuFeeBalaceValue;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBpuFeeBalaceValue);
                                                                        if (textView11 != null) {
                                                                            i = R.id.tvBpuFeeRupiah;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBpuFeeRupiah);
                                                                            if (textView12 != null) {
                                                                                i = R.id.tvFinalBalace;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinalBalace);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.tvFinalBalaceRupiah;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinalBalaceRupiah);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.tvFinalBalaceValue;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinalBalaceValue);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.tvFinalTotalRupiah;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinalTotalRupiah);
                                                                                            if (textView16 != null) {
                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinalTotalValue);
                                                                                                if (textView17 != null) {
                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRoundingOff);
                                                                                                    if (textView18 != null) {
                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRoundingOffRupiah);
                                                                                                        if (textView19 != null) {
                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRoundingOffValue);
                                                                                                            if (textView20 != null) {
                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTaxTotal);
                                                                                                                if (textView21 != null) {
                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTaxTotalRupiah);
                                                                                                                    if (textView22 != null) {
                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTaxValue);
                                                                                                                        if (textView23 != null) {
                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalBalace);
                                                                                                                            if (textView24 != null) {
                                                                                                                                return new FragmentClaimOldDaySecurityBalanceBinding((ScrollView) view, button, group, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24);
                                                                                                                            }
                                                                                                                            i = R.id.tvTotalBalace;
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTaxValue;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTaxTotalRupiah;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvTaxTotal;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvRoundingOffValue;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvRoundingOffRupiah;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvRoundingOff;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvFinalTotalValue;
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
