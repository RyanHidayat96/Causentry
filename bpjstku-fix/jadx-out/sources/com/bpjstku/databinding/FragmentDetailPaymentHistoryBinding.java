package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentDetailPaymentHistoryBinding implements ViewBinding {
    public final LinearLayout bottomSheetContainer;
    public final MaterialButton btnBack;
    public final ImageView imgMethodPayment;
    public final ImageView imgStatusPaymentHistory;
    public final LinearLayout llPaymentItem;
    public final MultiStateView msvDetailTuitionResult;
    private final LinearLayout rootView;
    public final RecyclerView rvDetailTuitionResult;
    public final TextView tvDatePayment;
    public final TextView tvMerchantPayment;
    public final TextView tvMerchantPaymentDescription;
    public final TextView tvStatusPaymentHistory;
    public final TextView tvTitlePaymentHistory;
    public final TextView tvTitleTransactionId;
    public final TextView tvValueTransactionId;
    public final View viewTopLine;

    private FragmentDetailPaymentHistoryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialButton materialButton, ImageView imageView, ImageView imageView2, LinearLayout linearLayout3, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view) {
        this.rootView = linearLayout;
        this.bottomSheetContainer = linearLayout2;
        this.btnBack = materialButton;
        this.imgMethodPayment = imageView;
        this.imgStatusPaymentHistory = imageView2;
        this.llPaymentItem = linearLayout3;
        this.msvDetailTuitionResult = multiStateView;
        this.rvDetailTuitionResult = recyclerView;
        this.tvDatePayment = textView;
        this.tvMerchantPayment = textView2;
        this.tvMerchantPaymentDescription = textView3;
        this.tvStatusPaymentHistory = textView4;
        this.tvTitlePaymentHistory = textView5;
        this.tvTitleTransactionId = textView6;
        this.tvValueTransactionId = textView7;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDetailPaymentHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDetailPaymentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_detail_payment_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDetailPaymentHistoryBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.imgMethodPayment;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMethodPayment);
            if (imageView != null) {
                i = R.id.imgStatusPaymentHistory;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgStatusPaymentHistory);
                if (imageView2 != null) {
                    i = R.id.llPaymentItem;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPaymentItem);
                    if (linearLayout2 != null) {
                        i = R.id.msvDetailTuitionResult;
                        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvDetailTuitionResult);
                        if (multiStateView != null) {
                            i = R.id.rvDetailTuitionResult;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvDetailTuitionResult);
                            if (recyclerView != null) {
                                i = R.id.tvDatePayment;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDatePayment);
                                if (textView != null) {
                                    i = R.id.tvMerchantPayment;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMerchantPayment);
                                    if (textView2 != null) {
                                        i = R.id.tvMerchantPaymentDescription;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMerchantPaymentDescription);
                                        if (textView3 != null) {
                                            i = R.id.tvStatusPaymentHistory;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusPaymentHistory);
                                            if (textView4 != null) {
                                                i = R.id.tvTitlePaymentHistory;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePaymentHistory);
                                                if (textView5 != null) {
                                                    i = R.id.tvTitleTransactionId;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleTransactionId);
                                                    if (textView6 != null) {
                                                        i = R.id.tvValueTransactionId;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValueTransactionId);
                                                        if (textView7 != null) {
                                                            i = R.id.viewTopLine;
                                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                                                            if (viewFindChildViewById != null) {
                                                                return new FragmentDetailPaymentHistoryBinding(linearLayout, linearLayout, materialButton, imageView, imageView2, linearLayout2, multiStateView, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewFindChildViewById);
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
