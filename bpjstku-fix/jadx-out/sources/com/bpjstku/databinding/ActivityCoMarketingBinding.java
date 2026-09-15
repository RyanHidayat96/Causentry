package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityCoMarketingBinding implements ViewBinding {
    public final AppBarLayout appbarNews;
    public final MaterialButton btnUsePromo;
    public final MaterialCardView cvPromos;
    public final ImageView imgComar;
    public final ImageView imgVoucherBanner;
    public final MultiStateView msvContent;
    private final MultiStateView rootView;
    public final RecyclerView rvMerchant;
    public final RecyclerView rvVoucher;
    public final MaterialToolbar toolbarComar;
    public final TextView tvNewMerchant;
    public final TextView tvNewVoucher;
    public final TextView tvSearchMerchant;
    public final TextView tvTitleDiscount;
    public final TextView tvToolbarTitle;
    public final TextView tvVision;
    public final TextView tvVoucherCode;
    public final TextView tvVoucherName;

    private ActivityCoMarketingBinding(MultiStateView multiStateView, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, MultiStateView multiStateView2, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = multiStateView;
        this.appbarNews = appBarLayout;
        this.btnUsePromo = materialButton;
        this.cvPromos = materialCardView;
        this.imgComar = imageView;
        this.imgVoucherBanner = imageView2;
        this.msvContent = multiStateView2;
        this.rvMerchant = recyclerView;
        this.rvVoucher = recyclerView2;
        this.toolbarComar = materialToolbar;
        this.tvNewMerchant = textView;
        this.tvNewVoucher = textView2;
        this.tvSearchMerchant = textView3;
        this.tvTitleDiscount = textView4;
        this.tvToolbarTitle = textView5;
        this.tvVision = textView6;
        this.tvVoucherCode = textView7;
        this.tvVoucherName = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static ActivityCoMarketingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCoMarketingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_co_marketing, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCoMarketingBinding bind(View view) {
        int i = R.id.appbarNews;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbarNews);
        if (appBarLayout != null) {
            i = R.id.btnUsePromo;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnUsePromo);
            if (materialButton != null) {
                i = R.id.cvPromos;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPromos);
                if (materialCardView != null) {
                    i = R.id.imgComar;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgComar);
                    if (imageView != null) {
                        i = R.id.imgVoucherBanner;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVoucherBanner);
                        if (imageView2 != null) {
                            MultiStateView multiStateView = (MultiStateView) view;
                            i = R.id.rvMerchant;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvMerchant);
                            if (recyclerView != null) {
                                i = R.id.rvVoucher;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvVoucher);
                                if (recyclerView2 != null) {
                                    i = R.id.toolbarComar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbarComar);
                                    if (materialToolbar != null) {
                                        i = R.id.tvNewMerchant;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewMerchant);
                                        if (textView != null) {
                                            i = R.id.tvNewVoucher;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewVoucher);
                                            if (textView2 != null) {
                                                i = R.id.tvSearchMerchant;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSearchMerchant);
                                                if (textView3 != null) {
                                                    i = R.id.tvTitleDiscount;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDiscount);
                                                    if (textView4 != null) {
                                                        i = R.id.tvToolbarTitle;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
                                                        if (textView5 != null) {
                                                            i = R.id.tvVision;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVision);
                                                            if (textView6 != null) {
                                                                i = R.id.tvVoucherCode;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVoucherCode);
                                                                if (textView7 != null) {
                                                                    i = R.id.tvVoucherName;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVoucherName);
                                                                    if (textView8 != null) {
                                                                        return new ActivityCoMarketingBinding(multiStateView, appBarLayout, materialButton, materialCardView, imageView, imageView2, multiStateView, recyclerView, recyclerView2, materialToolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
