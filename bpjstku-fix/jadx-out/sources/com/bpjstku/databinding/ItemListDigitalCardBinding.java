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
public final class ItemListDigitalCardBinding implements ViewBinding {
    public final ImageView imgDigitalCard;
    public final ImageView imgDigitalCardCheck;
    private final MaterialCardView rootView;
    public final TextView tvKpjNumber;
    public final TextView tvMembershipCategory;

    private ItemListDigitalCardBinding(MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.imgDigitalCard = imageView;
        this.imgDigitalCardCheck = imageView2;
        this.tvKpjNumber = textView;
        this.tvMembershipCategory = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemListDigitalCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListDigitalCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_digital_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemListDigitalCardBinding bind(View view) {
        int i = R.id.imgDigitalCard;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDigitalCard);
        if (imageView != null) {
            i = R.id.imgDigitalCardCheck;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDigitalCardCheck);
            if (imageView2 != null) {
                i = R.id.tvKpjNumber;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjNumber);
                if (textView != null) {
                    i = R.id.tvMembershipCategory;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipCategory);
                    if (textView2 != null) {
                        return new ItemListDigitalCardBinding((MaterialCardView) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
