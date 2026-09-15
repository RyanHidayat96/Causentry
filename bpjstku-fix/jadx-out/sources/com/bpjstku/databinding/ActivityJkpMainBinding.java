package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJkpMainBinding implements ViewBinding {
    public final ImageView imgLossJobSecurtityBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final RecyclerView rvJkpMenu;

    private ActivityJkpMainBinding(ScrollView scrollView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.imgLossJobSecurtityBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvJkpMenu = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityJkpMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJkpMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jkp_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJkpMainBinding bind(View view) {
        int i = R.id.imgLossJobSecurtityBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLossJobSecurtityBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJkpMenu);
                if (recyclerView != null) {
                    return new ActivityJkpMainBinding((ScrollView) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvJkpMenu;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
