package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemRegionalOfficeBinding implements ViewBinding {
    public final AppCompatImageView imgArrowRegionalOffice;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvDescLocationBranchOFfice;
    public final AppCompatTextView tvNameLocationBranchOFfice;

    private ItemRegionalOfficeBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.imgArrowRegionalOffice = appCompatImageView;
        this.tvDescLocationBranchOFfice = appCompatTextView;
        this.tvNameLocationBranchOFfice = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemRegionalOfficeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemRegionalOfficeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_regional_office, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemRegionalOfficeBinding bind(View view) {
        int i = R.id.imgArrowRegionalOffice;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgArrowRegionalOffice);
        if (appCompatImageView != null) {
            i = R.id.tvDescLocationBranchOFfice;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDescLocationBranchOFfice);
            if (appCompatTextView != null) {
                i = R.id.tvNameLocationBranchOFfice;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNameLocationBranchOFfice);
                if (appCompatTextView2 != null) {
                    return new ItemRegionalOfficeBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
