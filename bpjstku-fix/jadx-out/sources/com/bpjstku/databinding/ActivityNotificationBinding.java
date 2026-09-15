package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityNotificationBinding implements ViewBinding {
    public final CardView cvNotification;
    public final LayoutToolbarBinding layoutToolbar;
    public final MultiStateView msvNotification;
    private final ConstraintLayout rootView;
    public final RecyclerView rvNotification;
    public final SwipeRefreshLayout srlNotification;
    public final ImageView viewBackgroundNotification;

    private ActivityNotificationBinding(ConstraintLayout constraintLayout, CardView cardView, LayoutToolbarBinding layoutToolbarBinding, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.cvNotification = cardView;
        this.layoutToolbar = layoutToolbarBinding;
        this.msvNotification = multiStateView;
        this.rvNotification = recyclerView;
        this.srlNotification = swipeRefreshLayout;
        this.viewBackgroundNotification = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNotificationBinding bind(View view) {
        int i = R.id.cvNotification;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvNotification);
        if (cardView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                i = R.id.msvNotification;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvNotification);
                if (multiStateView != null) {
                    i = R.id.rvNotification;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvNotification);
                    if (recyclerView != null) {
                        i = R.id.srlNotification;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.srlNotification);
                        if (swipeRefreshLayout != null) {
                            i = R.id.viewBackgroundNotification;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.viewBackgroundNotification);
                            if (imageView != null) {
                                return new ActivityNotificationBinding((ConstraintLayout) view, cardView, layoutToolbarBindingBind, multiStateView, recyclerView, swipeRefreshLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
