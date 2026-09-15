package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityComplaintHistoryBinding implements ViewBinding {
    public final CardView cvComplaintHistory;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvComplaintHistory;
    private final ConstraintLayout rootView;
    public final RecyclerView rvComplaintHistory;
    public final SwipeRefreshLayout srlComplaintHistory;
    public final TextView tvEnmptyComplaint;
    public final ImageView viewBackgroundn;

    private ActivityComplaintHistoryBinding(ConstraintLayout constraintLayout, CardView cardView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, ImageView imageView) {
        this.rootView = constraintLayout;
        this.cvComplaintHistory = cardView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvComplaintHistory = multiStateView;
        this.rvComplaintHistory = recyclerView;
        this.srlComplaintHistory = swipeRefreshLayout;
        this.tvEnmptyComplaint = textView;
        this.viewBackgroundn = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityComplaintHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityComplaintHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_complaint_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityComplaintHistoryBinding bind(View view) {
        int i = R.id.cvComplaintHistory;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvComplaintHistory);
        if (cardView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.msvComplaintHistory;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvComplaintHistory);
                if (multiStateView != null) {
                    i = R.id.rvComplaintHistory;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvComplaintHistory);
                    if (recyclerView != null) {
                        i = R.id.srlComplaintHistory;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.srlComplaintHistory);
                        if (swipeRefreshLayout != null) {
                            i = R.id.tvEnmptyComplaint;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnmptyComplaint);
                            if (textView != null) {
                                i = R.id.viewBackgroundn;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.viewBackgroundn);
                                if (imageView != null) {
                                    return new ActivityComplaintHistoryBinding((ConstraintLayout) view, cardView, layoutToolbarCenterBindingBind, multiStateView, recyclerView, swipeRefreshLayout, textView, imageView);
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
