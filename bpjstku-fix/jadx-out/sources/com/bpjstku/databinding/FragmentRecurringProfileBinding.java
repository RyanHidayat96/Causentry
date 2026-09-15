package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentRecurringProfileBinding implements ViewBinding {
    public final LottieAnimationView animationView;
    public final LinearLayout bottomSheetContainer;
    public final Button btnBack;
    private final LinearLayout rootView;
    public final TextView tvDescription;
    public final TextView tvInfoAutoDebit;
    public final TextView tvRecurringChannelTitle;
    public final TextView tvRecurringChannelTitleValue;
    public final TextView tvTitle;
    public final TextView tvTitleName;
    public final TextView tvTitleNameValue;
    public final TextView tvTitleNik;
    public final TextView tvTitleNikValue;
    public final TextView tvTitleProgram;
    public final TextView tvTitleProgramValue;
    public final TextView tvTuitionTitle;
    public final TextView tvTuitionTitleValue;
    public final View viewSeparator;
    public final View viewSeparatorAmount;
    public final View viewSeparatorName;
    public final View viewSeparatorNik;
    public final View viewSeparatorProgram;

    private FragmentRecurringProfileBinding(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, LinearLayout linearLayout2, Button button, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, View view, View view2, View view3, View view4, View view5) {
        this.rootView = linearLayout;
        this.animationView = lottieAnimationView;
        this.bottomSheetContainer = linearLayout2;
        this.btnBack = button;
        this.tvDescription = textView;
        this.tvInfoAutoDebit = textView2;
        this.tvRecurringChannelTitle = textView3;
        this.tvRecurringChannelTitleValue = textView4;
        this.tvTitle = textView5;
        this.tvTitleName = textView6;
        this.tvTitleNameValue = textView7;
        this.tvTitleNik = textView8;
        this.tvTitleNikValue = textView9;
        this.tvTitleProgram = textView10;
        this.tvTitleProgramValue = textView11;
        this.tvTuitionTitle = textView12;
        this.tvTuitionTitleValue = textView13;
        this.viewSeparator = view;
        this.viewSeparatorAmount = view2;
        this.viewSeparatorName = view3;
        this.viewSeparatorNik = view4;
        this.viewSeparatorProgram = view5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRecurringProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRecurringProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recurring_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRecurringProfileBinding bind(View view) {
        int i = R.id.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.animationView);
        if (lottieAnimationView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.btnBack;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBack);
            if (button != null) {
                i = R.id.tvDescription;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescription);
                if (textView != null) {
                    i = R.id.tvInfoAutoDebit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoAutoDebit);
                    if (textView2 != null) {
                        i = R.id.tvRecurringChannelTitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRecurringChannelTitle);
                        if (textView3 != null) {
                            i = R.id.tvRecurringChannelTitleValue;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRecurringChannelTitleValue);
                            if (textView4 != null) {
                                i = R.id.tvTitle;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                if (textView5 != null) {
                                    i = R.id.tvTitleName;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleName);
                                    if (textView6 != null) {
                                        i = R.id.tvTitleNameValue;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleNameValue);
                                        if (textView7 != null) {
                                            i = R.id.tvTitleNik;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleNik);
                                            if (textView8 != null) {
                                                i = R.id.tvTitleNikValue;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleNikValue);
                                                if (textView9 != null) {
                                                    i = R.id.tvTitleProgram;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleProgram);
                                                    if (textView10 != null) {
                                                        i = R.id.tvTitleProgramValue;
                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleProgramValue);
                                                        if (textView11 != null) {
                                                            i = R.id.tvTuitionTitle;
                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionTitle);
                                                            if (textView12 != null) {
                                                                i = R.id.tvTuitionTitleValue;
                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionTitleValue);
                                                                if (textView13 != null) {
                                                                    i = R.id.viewSeparator;
                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewSeparator);
                                                                    if (viewFindChildViewById != null) {
                                                                        i = R.id.viewSeparatorAmount;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewSeparatorAmount);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.viewSeparatorName;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewSeparatorName);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R.id.viewSeparatorNik;
                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewSeparatorNik);
                                                                                if (viewFindChildViewById4 != null) {
                                                                                    i = R.id.viewSeparatorProgram;
                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewSeparatorProgram);
                                                                                    if (viewFindChildViewById5 != null) {
                                                                                        return new FragmentRecurringProfileBinding(linearLayout, lottieAnimationView, linearLayout, button, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
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
