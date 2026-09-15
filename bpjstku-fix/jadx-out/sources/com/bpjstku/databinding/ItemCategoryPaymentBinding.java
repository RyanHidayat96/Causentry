package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemCategoryPaymentBinding implements ViewBinding {
    public final ImageView imgCategoryPayment;
    private final ConstraintLayout rootView;
    public final TextView tvPaymentMethod;

    private ItemCategoryPaymentBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgCategoryPayment = imageView;
        this.tvPaymentMethod = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCategoryPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCategoryPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_category_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemCategoryPaymentBinding bind(View view) {
        int i = R.id.imgCategoryPayment;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCategoryPayment);
        if (imageView != null) {
            i = R.id.tvPaymentMethod;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethod);
            if (textView != null) {
                return new ItemCategoryPaymentBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
