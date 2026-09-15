package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemProgramServiceBinding implements ViewBinding {
    public final AppCompatImageView imgBalanceCheck;
    public final AppCompatImageView imgIcon;
    private final MaterialCardView rootView;
    public final AppCompatTextView tvDesc;
    public final AppCompatTextView tvTitle;

    private ItemProgramServiceBinding(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = materialCardView;
        this.imgBalanceCheck = appCompatImageView;
        this.imgIcon = appCompatImageView2;
        this.tvDesc = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemProgramServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemProgramServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_program_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemProgramServiceBinding bind(View view) {
        int i = R.id.imgBalanceCheck;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
        if (appCompatImageView != null) {
            i = R.id.imgIcon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgIcon);
            if (appCompatImageView2 != null) {
                i = R.id.tvDesc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                if (appCompatTextView != null) {
                    i = R.id.tvTitle;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (appCompatTextView2 != null) {
                        return new ItemProgramServiceBinding((MaterialCardView) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
