package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySearchCoMarketingBinding implements ViewBinding {
    public final TextInputEditText edtSearch;
    public final ImageView imResultEmpty;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final LinearLayout llFilter;
    private final ConstraintLayout rootView;
    public final RecyclerView rvMerchant;
    public final TextView tvCategory;
    public final TextView tvLocation;

    private ActivitySearchCoMarketingBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.edtSearch = textInputEditText;
        this.imResultEmpty = imageView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.llFilter = linearLayout;
        this.rvMerchant = recyclerView;
        this.tvCategory = textView;
        this.tvLocation = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySearchCoMarketingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySearchCoMarketingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_search_co_marketing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySearchCoMarketingBinding bind(View view) {
        int i = R.id.edtSearch;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtSearch);
        if (textInputEditText != null) {
            i = R.id.imResultEmpty;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imResultEmpty);
            if (imageView != null) {
                i = R.id.layout_toolbar_center;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.llFilter;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llFilter);
                    if (linearLayout != null) {
                        i = R.id.rvMerchant;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvMerchant);
                        if (recyclerView != null) {
                            i = R.id.tvCategory;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCategory);
                            if (textView != null) {
                                i = R.id.tvLocation;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLocation);
                                if (textView2 != null) {
                                    return new ActivitySearchCoMarketingBinding((ConstraintLayout) view, textInputEditText, imageView, layoutToolbarCenterBindingBind, linearLayout, recyclerView, textView, textView2);
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
