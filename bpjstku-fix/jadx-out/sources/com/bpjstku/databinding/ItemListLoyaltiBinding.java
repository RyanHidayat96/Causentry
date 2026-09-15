package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemListLoyaltiBinding implements ViewBinding {
    public final AppCompatImageView icLoyaltiMenu;
    public final AppCompatImageView imgBalanceCheck;
    private final CardView rootView;
    public final AppCompatTextView tvTitleLoyalti;

    private ItemListLoyaltiBinding(CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = cardView;
        this.icLoyaltiMenu = appCompatImageView;
        this.imgBalanceCheck = appCompatImageView2;
        this.tvTitleLoyalti = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemListLoyaltiBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListLoyaltiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_loyalti, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemListLoyaltiBinding bind(View view) {
        int i = R.id.icLoyaltiMenu;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.icLoyaltiMenu);
        if (appCompatImageView != null) {
            i = R.id.imgBalanceCheck;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
            if (appCompatImageView2 != null) {
                i = R.id.tvTitleLoyalti;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleLoyalti);
                if (appCompatTextView != null) {
                    return new ItemListLoyaltiBinding((CardView) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
