package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemPaymentEwalletBinding implements ViewBinding {
    public final ImageView imgCheckListGopay;
    public final ImageView imgCheckListShopeePay;
    public final ImageView imgEwallet;
    private final ConstraintLayout rootView;

    private ItemPaymentEwalletBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.imgCheckListGopay = imageView;
        this.imgCheckListShopeePay = imageView2;
        this.imgEwallet = imageView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemPaymentEwalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPaymentEwalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_payment_ewallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemPaymentEwalletBinding bind(View view) {
        int i = R.id.imgCheckListGopay;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCheckListGopay);
        if (imageView != null) {
            i = R.id.imgCheckListShopeePay;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCheckListShopeePay);
            if (imageView2 != null) {
                i = R.id.imgEwallet;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgEwallet);
                if (imageView3 != null) {
                    return new ItemPaymentEwalletBinding((ConstraintLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
