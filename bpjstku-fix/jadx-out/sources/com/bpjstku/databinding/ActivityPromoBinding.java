package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPromoBinding implements ViewBinding {
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvPromo;
    private final ConstraintLayout rootView;
    public final RecyclerView rvPromo;

    private ActivityPromoBinding(ConstraintLayout constraintLayout, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvPromo = multiStateView;
        this.rvPromo = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPromoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPromoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_promo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPromoBinding bind(View view) {
        int i = R.id.imgBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.msvPromo;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvPromo);
                if (multiStateView != null) {
                    i = R.id.rvPromo;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPromo);
                    if (recyclerView != null) {
                        return new ActivityPromoBinding((ConstraintLayout) view, imageView, layoutToolbarCenterBindingBind, multiStateView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
