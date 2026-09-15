package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemVoucherBinding implements ViewBinding {
    public final MaterialButton btnDetail;
    public final ImageView imgVoucher;
    private final MaterialCardView rootView;
    public final TextView tvDescVoucher;
    public final TextView tvLocation;
    public final TextView tvTitleVoucher;

    private ItemVoucherBinding(MaterialCardView materialCardView, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.btnDetail = materialButton;
        this.imgVoucher = imageView;
        this.tvDescVoucher = textView;
        this.tvLocation = textView2;
        this.tvTitleVoucher = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemVoucherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVoucherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_voucher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVoucherBinding bind(View view) {
        int i = R.id.btnDetail;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDetail);
        if (materialButton != null) {
            i = R.id.imgVoucher;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVoucher);
            if (imageView != null) {
                i = R.id.tvDescVoucher;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVoucher);
                if (textView != null) {
                    i = R.id.tvLocation;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLocation);
                    if (textView2 != null) {
                        i = R.id.tvTitleVoucher;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleVoucher);
                        if (textView3 != null) {
                            return new ItemVoucherBinding((MaterialCardView) view, materialButton, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
