package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTuitionPaymentHistoryBinding implements ViewBinding {
    public final CardView cvPaymentHistory;
    public final MultiStateView msvPaymentHistory;
    private final ConstraintLayout rootView;
    public final RecyclerView rvPaymentHistory;
    public final SwipeRefreshLayout srlPaymentHistory;

    private FragmentTuitionPaymentHistoryBinding(ConstraintLayout constraintLayout, CardView cardView, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.rootView = constraintLayout;
        this.cvPaymentHistory = cardView;
        this.msvPaymentHistory = multiStateView;
        this.rvPaymentHistory = recyclerView;
        this.srlPaymentHistory = swipeRefreshLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTuitionPaymentHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTuitionPaymentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tuition_payment_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTuitionPaymentHistoryBinding bind(View view) {
        int i = R.id.cvPaymentHistory;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvPaymentHistory);
        if (cardView != null) {
            i = R.id.msvPaymentHistory;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvPaymentHistory);
            if (multiStateView != null) {
                i = R.id.rvPaymentHistory;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPaymentHistory);
                if (recyclerView != null) {
                    i = R.id.srlPaymentHistory;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.srlPaymentHistory);
                    if (swipeRefreshLayout != null) {
                        return new FragmentTuitionPaymentHistoryBinding((ConstraintLayout) view, cardView, multiStateView, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
