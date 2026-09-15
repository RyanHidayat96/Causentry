package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityVideoListBinding implements ViewBinding {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final LinearLayout rootView;
    private final LinearLayout rootView_;
    public final RecyclerView rvVideo;

    private ActivityVideoListBinding(LinearLayout linearLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.rootView_ = linearLayout;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.rootView = linearLayout2;
        this.rvVideo = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView_;
    }

    public static ActivityVideoListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVideoListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_video_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVideoListBinding bind(View view) {
        int i = R.id.layout_toolbar_center;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
        if (viewFindChildViewById != null) {
            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
            LinearLayout linearLayout = (LinearLayout) view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvVideo);
            if (recyclerView != null) {
                return new ActivityVideoListBinding(linearLayout, layoutToolbarCenterBindingBind, linearLayout, recyclerView);
            }
            i = R.id.rvVideo;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static int b() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 7531903;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        b = iMaxMemory;
        return iMaxMemory;
    }
}
