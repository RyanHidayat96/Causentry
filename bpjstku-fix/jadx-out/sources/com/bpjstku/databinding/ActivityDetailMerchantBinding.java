package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDetailMerchantBinding implements ViewBinding {
    public final MaterialButton btnRedeem;
    public final ImageView imgMerchant;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayout llRedeemSection;
    public final LinearLayout llSectionBtn;
    public final RelativeLayout root;
    private final RelativeLayout rootView;
    public final RecyclerView rvTnc;
    public final TextView tvLabelLocation;
    public final TextView tvLabelPeriode;
    public final TextView tvLabelTnc;
    public final TextView tvLocation;
    public final TextView tvPeriode;
    public final TextView tvRedeemCode;
    public final TextView tvTitleDetail;
    public final TextView tvWebLink;
    public final View view1;
    public final View view2;
    public final View view3;

    private ActivityDetailMerchantBinding(RelativeLayout relativeLayout, MaterialButton materialButton, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view, View view2, View view3) {
        this.rootView = relativeLayout;
        this.btnRedeem = materialButton;
        this.imgMerchant = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llRedeemSection = linearLayout;
        this.llSectionBtn = linearLayout2;
        this.root = relativeLayout2;
        this.rvTnc = recyclerView;
        this.tvLabelLocation = textView;
        this.tvLabelPeriode = textView2;
        this.tvLabelTnc = textView3;
        this.tvLocation = textView4;
        this.tvPeriode = textView5;
        this.tvRedeemCode = textView6;
        this.tvTitleDetail = textView7;
        this.tvWebLink = textView8;
        this.view1 = view;
        this.view2 = view2;
        this.view3 = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDetailMerchantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDetailMerchantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_detail_merchant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDetailMerchantBinding bind(View view) {
        int i = R.id.btnRedeem;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRedeem);
        if (materialButton != null) {
            i = R.id.imgMerchant;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMerchant);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.llRedeemSection;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llRedeemSection);
                    if (linearLayout != null) {
                        i = R.id.llSectionBtn;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llSectionBtn);
                        if (linearLayout2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i = R.id.rvTnc;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTnc);
                            if (recyclerView != null) {
                                i = R.id.tvLabelLocation;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelLocation);
                                if (textView != null) {
                                    i = R.id.tvLabelPeriode;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelPeriode);
                                    if (textView2 != null) {
                                        i = R.id.tvLabelTnc;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTnc);
                                        if (textView3 != null) {
                                            i = R.id.tvLocation;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLocation);
                                            if (textView4 != null) {
                                                i = R.id.tvPeriode;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPeriode);
                                                if (textView5 != null) {
                                                    i = R.id.tvRedeemCode;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRedeemCode);
                                                    if (textView6 != null) {
                                                        i = R.id.tvTitleDetail;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDetail);
                                                        if (textView7 != null) {
                                                            i = R.id.tvWebLink;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWebLink);
                                                            if (textView8 != null) {
                                                                i = R.id.view1;
                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.view1);
                                                                if (viewFindChildViewById2 != null) {
                                                                    i = R.id.view2;
                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.view2);
                                                                    if (viewFindChildViewById3 != null) {
                                                                        i = R.id.view3;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.view3);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            return new ActivityDetailMerchantBinding(relativeLayout, materialButton, imageView, layoutToolbarCenterBindingBind, linearLayout, linearLayout2, relativeLayout, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
