package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJpnPeriodicChooseKpjBinding implements ViewBinding {
    public final AppBarLayout appbarNews;
    public final ImageView imgLapakAsikBackground;
    public final ImageView imgLapakAsikBackground2;
    public final LayoutToolbarCenterPinnedBinding layoutToolbarCenterPinned;
    public final MultiStateView msvDigitalCard;
    private final MultiStateView rootView;
    public final RecyclerView rvDigitalCard;
    public final TextView tvChooseParticipantKpj;

    private ActivityJpnPeriodicChooseKpjBinding(MultiStateView multiStateView, AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, LayoutToolbarCenterPinnedBinding layoutToolbarCenterPinnedBinding, MultiStateView multiStateView2, RecyclerView recyclerView, TextView textView) {
        this.rootView = multiStateView;
        this.appbarNews = appBarLayout;
        this.imgLapakAsikBackground = imageView;
        this.imgLapakAsikBackground2 = imageView2;
        this.layoutToolbarCenterPinned = layoutToolbarCenterPinnedBinding;
        this.msvDigitalCard = multiStateView2;
        this.rvDigitalCard = recyclerView;
        this.tvChooseParticipantKpj = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static ActivityJpnPeriodicChooseKpjBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJpnPeriodicChooseKpjBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jpn_periodic_choose_kpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJpnPeriodicChooseKpjBinding bind(View view) {
        int i = R.id.appbarNews;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbarNews);
        if (appBarLayout != null) {
            i = R.id.imgLapakAsikBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLapakAsikBackground);
            if (imageView != null) {
                i = R.id.imgLapakAsikBackground2;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLapakAsikBackground2);
                if (imageView2 != null) {
                    i = R.id.layout_toolbar_center_pinned;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center_pinned);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterPinnedBinding layoutToolbarCenterPinnedBindingBind = LayoutToolbarCenterPinnedBinding.bind(viewFindChildViewById);
                        MultiStateView multiStateView = (MultiStateView) view;
                        i = R.id.rvDigitalCard;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvDigitalCard);
                        if (recyclerView != null) {
                            i = R.id.tvChooseParticipantKpj;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseParticipantKpj);
                            if (textView != null) {
                                return new ActivityJpnPeriodicChooseKpjBinding(multiStateView, appBarLayout, imageView, imageView2, layoutToolbarCenterPinnedBindingBind, multiStateView, recyclerView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
