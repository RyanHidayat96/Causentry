package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPaymentOneTimeSuccessBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final Button btnRegisterAutoDebit;
    public final Button btnback;
    public final ImageView imgCategoryPayment;
    public final LinearLayout llMethodPayment;
    public final ConstraintLayout mainContainer;
    private final ScrollView rootView;
    public final TextView tvDatePayment;
    public final TextView tvInfoName;
    public final TextView tvInfoNameValue;
    public final TextView tvInfoNikPaid;
    public final TextView tvInfoPayment;
    public final TextView tvInfoPeriods;
    public final TextView tvInfoProgramPaid;
    public final TextView tvInfoValueNikPaid;
    public final TextView tvInfoValueProgramPaid;
    public final TextView tvPaymentMethod;
    public final TextView tvTitleDetailPayment;
    public final TextView tvTitleFeeMitra;
    public final TextView tvTitleInfoAmount;
    public final TextView tvTitleInfoPayment;
    public final TextView tvTotalPaid;
    public final TextView tvValueAmount;
    public final TextView tvValueFeeMitra;
    public final TextView tvValueInfoPeriods;
    public final TextView tvValueTotalPaid;
    public final View viewLineDetailPayment;
    public final View viewLineInfo;
    public final View viewLineTotalPayment;

    private ActivityPaymentOneTimeSuccessBinding(ScrollView scrollView, LottieAnimationView lottieAnimationView, Button button, Button button2, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, View view, View view2, View view3) {
        this.rootView = scrollView;
        this.animationView = lottieAnimationView;
        this.btnRegisterAutoDebit = button;
        this.btnback = button2;
        this.imgCategoryPayment = imageView;
        this.llMethodPayment = linearLayout;
        this.mainContainer = constraintLayout;
        this.tvDatePayment = textView;
        this.tvInfoName = textView2;
        this.tvInfoNameValue = textView3;
        this.tvInfoNikPaid = textView4;
        this.tvInfoPayment = textView5;
        this.tvInfoPeriods = textView6;
        this.tvInfoProgramPaid = textView7;
        this.tvInfoValueNikPaid = textView8;
        this.tvInfoValueProgramPaid = textView9;
        this.tvPaymentMethod = textView10;
        this.tvTitleDetailPayment = textView11;
        this.tvTitleFeeMitra = textView12;
        this.tvTitleInfoAmount = textView13;
        this.tvTitleInfoPayment = textView14;
        this.tvTotalPaid = textView15;
        this.tvValueAmount = textView16;
        this.tvValueFeeMitra = textView17;
        this.tvValueInfoPeriods = textView18;
        this.tvValueTotalPaid = textView19;
        this.viewLineDetailPayment = view;
        this.viewLineInfo = view2;
        this.viewLineTotalPayment = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityPaymentOneTimeSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentOneTimeSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_payment_one_time_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPaymentOneTimeSuccessBinding bind(View view) {
        int i = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animationView);
        if (lottieAnimationView != null) {
            i = R.id.btnRegisterAutoDebit;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnRegisterAutoDebit);
            if (button != null) {
                i = R.id.btnback;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnback);
                if (button2 != null) {
                    i = R.id.imgCategoryPayment;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCategoryPayment);
                    if (imageView != null) {
                        i = R.id.llMethodPayment;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMethodPayment);
                        if (linearLayout != null) {
                            i = R.id.mainContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                            if (constraintLayout != null) {
                                i = R.id.tvDatePayment;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDatePayment);
                                if (textView != null) {
                                    i = R.id.tvInfoName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoName);
                                    if (textView2 != null) {
                                        i = R.id.tvInfoNameValue;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoNameValue);
                                        if (textView3 != null) {
                                            i = R.id.tvInfoNikPaid;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoNikPaid);
                                            if (textView4 != null) {
                                                i = R.id.tvInfoPayment;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoPayment);
                                                if (textView5 != null) {
                                                    i = R.id.tvInfoPeriods;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoPeriods);
                                                    if (textView6 != null) {
                                                        i = R.id.tvInfoProgramPaid;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoProgramPaid);
                                                        if (textView7 != null) {
                                                            i = R.id.tvInfoValueNikPaid;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoValueNikPaid);
                                                            if (textView8 != null) {
                                                                i = R.id.tvInfoValueProgramPaid;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoValueProgramPaid);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvPaymentMethod;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethod);
                                                                    if (textView10 != null) {
                                                                        i = R.id.tvTitleDetailPayment;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDetailPayment);
                                                                        if (textView11 != null) {
                                                                            i = R.id.tvTitleFeeMitra;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleFeeMitra);
                                                                            if (textView12 != null) {
                                                                                i = R.id.tvTitleInfoAmount;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoAmount);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.tvTitleInfoPayment;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoPayment);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.tvTotalPaid;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalPaid);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.tvValueAmount;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValueAmount);
                                                                                            if (textView16 != null) {
                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValueFeeMitra);
                                                                                                if (textView17 != null) {
                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValueInfoPeriods);
                                                                                                    if (textView18 != null) {
                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValueTotalPaid);
                                                                                                        if (textView19 != null) {
                                                                                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineDetailPayment);
                                                                                                            if (viewFindChildViewById != null) {
                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineInfo);
                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewLineTotalPayment);
                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                        return new ActivityPaymentOneTimeSuccessBinding((ScrollView) view, lottieAnimationView, button, button2, imageView, linearLayout, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                                                                                                                    }
                                                                                                                    i = R.id.viewLineTotalPayment;
                                                                                                                } else {
                                                                                                                    i = R.id.viewLineInfo;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.viewLineDetailPayment;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvValueTotalPaid;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvValueInfoPeriods;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvValueFeeMitra;
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
