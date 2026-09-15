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
public final class ActivityEwalletBinding implements ViewBinding {
    public final RecyclerView activityEwalletRecycler;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;

    private ActivityEwalletBinding(ScrollView scrollView, RecyclerView recyclerView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = scrollView;
        this.activityEwalletRecycler = recyclerView;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEwalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEwalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ewallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEwalletBinding bind(View view) {
        int i = R.id.activity_ewallet_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.activity_ewallet_recycler);
        if (recyclerView != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    return new ActivityEwalletBinding((ScrollView) view, recyclerView, imageView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
