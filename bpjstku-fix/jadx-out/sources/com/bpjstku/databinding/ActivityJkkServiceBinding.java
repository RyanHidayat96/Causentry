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
public final class ActivityJkkServiceBinding implements ViewBinding {
    public final ImageView imgLossJobSecurtityBackground;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ScrollView rootView;
    public final RecyclerView rvJkkService;

    private ActivityJkkServiceBinding(ScrollView scrollView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.imgLossJobSecurtityBackground = imageView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.rvJkkService = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityJkkServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJkkServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jkk_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJkkServiceBinding bind(View view) {
        int i = R.id.imgLossJobSecurtityBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLossJobSecurtityBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar_center;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJkkService);
                if (recyclerView != null) {
                    return new ActivityJkkServiceBinding((ScrollView) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvJkkService;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
