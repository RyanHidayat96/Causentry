package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityVocationalBannerBinding implements ViewBinding {
    public final Button btnCheckEligibility;
    public final CardView cvBanner;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvEligibility;
    private final ConstraintLayout rootView;

    private ActivityVocationalBannerBinding(ConstraintLayout constraintLayout, Button button, CardView cardView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView) {
        this.rootView = constraintLayout;
        this.btnCheckEligibility = button;
        this.cvBanner = cardView;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvEligibility = multiStateView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalBannerBinding bind(View view) {
        int i = R.id.btnCheckEligibility;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCheckEligibility);
        if (button != null) {
            i = R.id.cvBanner;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvBanner);
            if (cardView != null) {
                i = R.id.imgBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.msvEligibility;
                        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvEligibility);
                        if (multiStateView != null) {
                            return new ActivityVocationalBannerBinding((ConstraintLayout) view, button, cardView, imageView, layoutToolbarCenterBindingBind, multiStateView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
