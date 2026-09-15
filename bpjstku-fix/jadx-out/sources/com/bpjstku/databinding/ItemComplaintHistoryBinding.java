package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemComplaintHistoryBinding implements ViewBinding {
    public final ConstraintLayout containerComplaintHistoryItem;
    public final AppCompatImageView imgComplaintHistory;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvComplaintDate;
    public final AppCompatTextView tvTitleComplaintHistory;
    public final View viewUnreadIndicator;

    private ItemComplaintHistoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view) {
        this.rootView = constraintLayout;
        this.containerComplaintHistoryItem = constraintLayout2;
        this.imgComplaintHistory = appCompatImageView;
        this.tvComplaintDate = appCompatTextView;
        this.tvTitleComplaintHistory = appCompatTextView2;
        this.viewUnreadIndicator = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemComplaintHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemComplaintHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_complaint_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemComplaintHistoryBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.imgComplaintHistory;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgComplaintHistory);
        if (appCompatImageView != null) {
            i = R.id.tvComplaintDate;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvComplaintDate);
            if (appCompatTextView != null) {
                i = R.id.tvTitleComplaintHistory;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleComplaintHistory);
                if (appCompatTextView2 != null) {
                    i = R.id.viewUnreadIndicator;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewUnreadIndicator);
                    if (viewFindChildViewById != null) {
                        return new ItemComplaintHistoryBinding(constraintLayout, constraintLayout, appCompatImageView, appCompatTextView, appCompatTextView2, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
