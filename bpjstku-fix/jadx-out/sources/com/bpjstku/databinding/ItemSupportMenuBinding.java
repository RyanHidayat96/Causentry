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
public final class ItemSupportMenuBinding implements ViewBinding {
    public final AppCompatImageView imgBalanceCheck;
    public final AppCompatImageView imgSupportMenu;
    private final CardView rootView;
    public final AppCompatTextView tvSupportMenuDescription;
    public final AppCompatTextView tvSupportMenuTitle;

    private ItemSupportMenuBinding(CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = cardView;
        this.imgBalanceCheck = appCompatImageView;
        this.imgSupportMenu = appCompatImageView2;
        this.tvSupportMenuDescription = appCompatTextView;
        this.tvSupportMenuTitle = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemSupportMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSupportMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_support_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSupportMenuBinding bind(View view) {
        int i = R.id.imgBalanceCheck;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
        if (appCompatImageView != null) {
            i = R.id.imgSupportMenu;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgSupportMenu);
            if (appCompatImageView2 != null) {
                i = R.id.tvSupportMenuDescription;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvSupportMenuDescription);
                if (appCompatTextView != null) {
                    i = R.id.tvSupportMenuTitle;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvSupportMenuTitle);
                    if (appCompatTextView2 != null) {
                        return new ItemSupportMenuBinding((CardView) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
