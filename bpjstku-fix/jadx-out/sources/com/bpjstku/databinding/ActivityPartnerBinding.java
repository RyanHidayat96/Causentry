package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPartnerBinding implements ViewBinding {
    public final MaterialButton btnFilterPartner;
    public final ImageView ivArrorRight;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvPartner;
    private final ConstraintLayout rootView;
    public final RecyclerView rvPartner;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final AppCompatTextView tvCity;
    public final AppCompatTextView tvProvince;
    public final AppCompatTextView tvTitleMitraList;
    public final ImageView viewBackgroundPartner;

    private ActivityPartnerBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ImageView imageView2) {
        this.rootView = constraintLayout;
        this.btnFilterPartner = materialButton;
        this.ivArrorRight = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvPartner = multiStateView;
        this.rvPartner = recyclerView;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.tvCity = appCompatTextView;
        this.tvProvince = appCompatTextView2;
        this.tvTitleMitraList = appCompatTextView3;
        this.viewBackgroundPartner = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPartnerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPartnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_partner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPartnerBinding bind(View view) {
        int i = R.id.btnFilterPartner;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnFilterPartner);
        if (materialButton != null) {
            i = R.id.ivArrorRight;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivArrorRight);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.msvPartner;
                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvPartner);
                    if (multiStateView != null) {
                        i = R.id.rvPartner;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPartner);
                        if (recyclerView != null) {
                            i = R.id.swipeRefreshLayout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.swipeRefreshLayout);
                            if (swipeRefreshLayout != null) {
                                i = R.id.tvCity;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCity);
                                if (appCompatTextView != null) {
                                    i = R.id.tvProvince;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvProvince);
                                    if (appCompatTextView2 != null) {
                                        i = R.id.tvTitleMitraList;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleMitraList);
                                        if (appCompatTextView3 != null) {
                                            i = R.id.viewBackgroundPartner;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.viewBackgroundPartner);
                                            if (imageView2 != null) {
                                                return new ActivityPartnerBinding((ConstraintLayout) view, materialButton, imageView, layoutToolbarCenterBindingBind, multiStateView, recyclerView, swipeRefreshLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
