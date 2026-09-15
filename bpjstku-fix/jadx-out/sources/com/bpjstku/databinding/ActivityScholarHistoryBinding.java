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

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityScholarHistoryBinding implements ViewBinding {
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final RecyclerView recyclerHistory;
    private final ConstraintLayout rootView;

    private ActivityScholarHistoryBinding(ConstraintLayout constraintLayout, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.imgBackground = imageView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.recyclerHistory = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityScholarHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScholarHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_scholar_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityScholarHistoryBinding bind(View view) {
        int i = R.id.imgBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar_center;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerHistory);
                if (recyclerView != null) {
                    return new ActivityScholarHistoryBinding((ConstraintLayout) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.recyclerHistory;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
