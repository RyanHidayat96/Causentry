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
public final class ActivityListBankBinding implements ViewBinding {
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ScrollView rootView;
    public final RecyclerView rvListBank;

    private ActivityListBankBinding(ScrollView scrollView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.imgBackground = imageView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.rvListBank = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityListBankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityListBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_list_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityListBankBinding bind(View view) {
        int i = R.id.imgBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar_center;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListBank);
                if (recyclerView != null) {
                    return new ActivityListBankBinding((ScrollView) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvListBank;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
