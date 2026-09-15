package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityEwalletUnlinkBinding implements ViewBinding {
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final RecyclerView rvEwallet;
    public final Button unlinkEwallet;

    private ActivityEwalletUnlinkBinding(ScrollView scrollView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, Button button) {
        this.rootView = scrollView;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvEwallet = recyclerView;
        this.unlinkEwallet = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEwalletUnlinkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEwalletUnlinkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ewallet_unlink, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEwalletUnlinkBinding bind(View view) {
        int i = R.id.imgBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.rvEwallet;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvEwallet);
                if (recyclerView != null) {
                    i = R.id.unlinkEwallet;
                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.unlinkEwallet);
                    if (button != null) {
                        return new ActivityEwalletUnlinkBinding((ScrollView) view, imageView, layoutToolbarCenterBindingBind, recyclerView, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
