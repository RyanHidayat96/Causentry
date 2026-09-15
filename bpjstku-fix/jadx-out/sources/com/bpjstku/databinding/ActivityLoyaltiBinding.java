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

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityLoyaltiBinding implements ViewBinding {
    public final ImageView imgProgramBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final RecyclerView rvLoyalti;

    private ActivityLoyaltiBinding(ConstraintLayout constraintLayout, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.imgProgramBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvLoyalti = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLoyaltiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLoyaltiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_loyalti, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLoyaltiBinding bind(View view) {
        int i = R.id.imgProgramBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgramBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvLoyalti);
                if (recyclerView != null) {
                    return new ActivityLoyaltiBinding((ConstraintLayout) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvLoyalti;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
