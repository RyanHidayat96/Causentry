package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemEwalletDetailBinding implements ViewBinding {
    public final ImageView imgItemEwallet;
    public final MaterialCardView itemEwalletStatusLayout;
    private final MaterialCardView rootView;
    public final TextView tvItemEwalletPrice;
    public final TextView tvItemEwalletTitle;

    private ItemEwalletDetailBinding(MaterialCardView materialCardView, ImageView imageView, MaterialCardView materialCardView2, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.imgItemEwallet = imageView;
        this.itemEwalletStatusLayout = materialCardView2;
        this.tvItemEwalletPrice = textView;
        this.tvItemEwalletTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemEwalletDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemEwalletDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_ewallet_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemEwalletDetailBinding bind(View view) {
        int i = R.id.img_item_ewallet;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_item_ewallet);
        if (imageView != null) {
            i = R.id.item_ewallet_status_layout;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.item_ewallet_status_layout);
            if (materialCardView != null) {
                i = R.id.tv_item_ewallet_price;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_item_ewallet_price);
                if (textView != null) {
                    i = R.id.tv_item_ewallet_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_item_ewallet_title);
                    if (textView2 != null) {
                        return new ItemEwalletDetailBinding((MaterialCardView) view, imageView, materialCardView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
