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
public final class ItemListBankBinding implements ViewBinding {
    public final ImageView arrowAction;
    public final ImageView imgBank;
    private final MaterialCardView rootView;
    public final TextView tvDescBank;
    public final TextView tvTitleBank;

    private ItemListBankBinding(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.arrowAction = imageView;
        this.imgBank = imageView2;
        this.tvDescBank = textView;
        this.tvTitleBank = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemListBankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemListBankBinding bind(View view) {
        int i = R.id.arrowAction;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowAction);
        if (imageView != null) {
            i = R.id.imgBank;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBank);
            if (imageView2 != null) {
                i = R.id.tvDescBank;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescBank);
                if (textView != null) {
                    i = R.id.tvTitleBank;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBank);
                    if (textView2 != null) {
                        return new ItemListBankBinding((MaterialCardView) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
