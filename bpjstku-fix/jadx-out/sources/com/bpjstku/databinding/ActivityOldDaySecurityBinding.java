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
public final class ActivityOldDaySecurityBinding implements ViewBinding {
    public final ImageView imgOldDaySecurtityBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final RecyclerView rvOldDaySecurity;

    private ActivityOldDaySecurityBinding(ScrollView scrollView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = scrollView;
        this.imgOldDaySecurtityBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvOldDaySecurity = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOldDaySecurityBinding bind(View view) {
        int i = R.id.imgOldDaySecurtityBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOldDaySecurtityBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvOldDaySecurity);
                if (recyclerView != null) {
                    return new ActivityOldDaySecurityBinding((ScrollView) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvOldDaySecurity;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
