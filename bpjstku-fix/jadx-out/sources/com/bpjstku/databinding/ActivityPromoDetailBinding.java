package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityPromoDetailBinding implements ViewBinding {
    public final MaterialCardView cvPromoDetailImage;
    public final ImageView imgBackground;
    public final ImageView imgPromoDetail;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextView tvPromoDate;
    public final TextView tvPromoDescription;
    public final TextView tvPromoTitle;

    private ActivityPromoDetailBinding(ScrollView scrollView, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.cvPromoDetailImage = materialCardView;
        this.imgBackground = imageView;
        this.imgPromoDetail = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvPromoDate = textView;
        this.tvPromoDescription = textView2;
        this.tvPromoTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityPromoDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPromoDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_promo_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPromoDetailBinding bind(View view) {
        int i = R.id.cvPromoDetailImage;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPromoDetailImage);
        if (materialCardView != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.imgPromoDetail;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPromoDetail);
                if (imageView2 != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tvPromoDate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPromoDate);
                        if (textView != null) {
                            i = R.id.tvPromoDescription;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPromoDescription);
                            if (textView2 != null) {
                                i = R.id.tvPromoTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPromoTitle);
                                if (textView3 != null) {
                                    return new ActivityPromoDetailBinding((ScrollView) view, materialCardView, imageView, imageView2, layoutToolbarCenterBindingBind, textView, textView2, textView3);
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
