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
public final class ItemBranchOfficeBinding implements ViewBinding {
    public final AppCompatImageView imgLocation;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvDescLocationBranchOFfice;
    public final AppCompatTextView tvNameLocationBranchOFfice;

    private ItemBranchOfficeBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.imgLocation = appCompatImageView;
        this.tvDescLocationBranchOFfice = appCompatTextView;
        this.tvNameLocationBranchOFfice = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBranchOfficeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBranchOfficeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_branch_office, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBranchOfficeBinding bind(View view) {
        int i = R.id.imgLocation;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLocation);
        if (appCompatImageView != null) {
            i = R.id.tvDescLocationBranchOFfice;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDescLocationBranchOFfice);
            if (appCompatTextView != null) {
                i = R.id.tvNameLocationBranchOFfice;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNameLocationBranchOFfice);
                if (appCompatTextView2 != null) {
                    return new ItemBranchOfficeBinding((ConstraintLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
