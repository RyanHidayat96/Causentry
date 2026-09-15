package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDetailVoucherBinding implements ViewBinding {
    public final MaterialButton btnRedeem;
    public final ImageView imgVoucherBanner;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayout llRedeemSection;
    private final RelativeLayout rootView;
    public final TextView tvDescVoucher;
    public final TextView tvRedeemCode;
    public final TextView tvReedemStep;
    public final TextView tvTitleVoucher;

    private ActivityDetailVoucherBinding(RelativeLayout relativeLayout, MaterialButton materialButton, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.btnRedeem = materialButton;
        this.imgVoucherBanner = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llRedeemSection = linearLayout;
        this.tvDescVoucher = textView;
        this.tvRedeemCode = textView2;
        this.tvReedemStep = textView3;
        this.tvTitleVoucher = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDetailVoucherBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDetailVoucherBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_detail_voucher, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDetailVoucherBinding bind(View view) {
        int i = R.id.btnRedeem;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRedeem);
        if (materialButton != null) {
            i = R.id.imgVoucherBanner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVoucherBanner);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.llRedeemSection;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llRedeemSection);
                    if (linearLayout != null) {
                        i = R.id.tvDescVoucher;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVoucher);
                        if (textView != null) {
                            i = R.id.tvRedeemCode;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRedeemCode);
                            if (textView2 != null) {
                                i = R.id.tvReedemStep;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReedemStep);
                                if (textView3 != null) {
                                    i = R.id.tvTitleVoucher;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleVoucher);
                                    if (textView4 != null) {
                                        return new ActivityDetailVoucherBinding((RelativeLayout) view, materialButton, imageView, layoutToolbarCenterBindingBind, linearLayout, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
