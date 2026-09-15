package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemPaymentHistoryBinding implements ViewBinding {
    public final ConstraintLayout containerPaymentHistoryItem;
    public final AppCompatImageView imgPaymentHistory;
    public final ImageView imgUnreadIndicator;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvPaymentDate;
    public final AppCompatTextView tvTitlePaymentHistory;
    public final AppCompatTextView tvValuePayment;
    public final View viewUnreadIndicator;

    private ItemPaymentHistoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, View view) {
        this.rootView = constraintLayout;
        this.containerPaymentHistoryItem = constraintLayout2;
        this.imgPaymentHistory = appCompatImageView;
        this.imgUnreadIndicator = imageView;
        this.tvPaymentDate = appCompatTextView;
        this.tvTitlePaymentHistory = appCompatTextView2;
        this.tvValuePayment = appCompatTextView3;
        this.viewUnreadIndicator = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemPaymentHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPaymentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_payment_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemPaymentHistoryBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.imgPaymentHistory;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgPaymentHistory);
        if (appCompatImageView != null) {
            i = R.id.imgUnreadIndicator;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUnreadIndicator);
            if (imageView != null) {
                i = R.id.tvPaymentDate;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPaymentDate);
                if (appCompatTextView != null) {
                    i = R.id.tvTitlePaymentHistory;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitlePaymentHistory);
                    if (appCompatTextView2 != null) {
                        i = R.id.tvValuePayment;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValuePayment);
                        if (appCompatTextView3 != null) {
                            i = R.id.viewUnreadIndicator;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewUnreadIndicator);
                            if (viewFindChildViewById != null) {
                                return new ItemPaymentHistoryBinding(constraintLayout, constraintLayout, appCompatImageView, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
