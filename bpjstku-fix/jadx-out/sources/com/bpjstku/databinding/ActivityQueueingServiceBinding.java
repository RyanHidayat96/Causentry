package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityQueueingServiceBinding implements ViewBinding {
    public final CardView cardClaimService;
    public final CardView cardInfoComplaintService;
    public final ImageView ivClaimArrow;
    public final ImageView ivClaimIcon;
    public final ImageView ivInfoArrow;
    public final ImageView ivInfoIcon;
    public final ImageView ivQueueingIllustration;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvClaimDescription;
    public final TextView tvClaimTitle;
    public final TextView tvInfoDescription;
    public final TextView tvInfoTitle;
    public final TextView tvQueueingDescription;
    public final TextView tvQueueingTitle;

    private ActivityQueueingServiceBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.cardClaimService = cardView;
        this.cardInfoComplaintService = cardView2;
        this.ivClaimArrow = imageView;
        this.ivClaimIcon = imageView2;
        this.ivInfoArrow = imageView3;
        this.ivInfoIcon = imageView4;
        this.ivQueueingIllustration = imageView5;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvClaimDescription = textView;
        this.tvClaimTitle = textView2;
        this.tvInfoDescription = textView3;
        this.tvInfoTitle = textView4;
        this.tvQueueingDescription = textView5;
        this.tvQueueingTitle = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityQueueingServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityQueueingServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_queueing_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityQueueingServiceBinding bind(View view) {
        int i = R.id.cardClaimService;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cardClaimService);
        if (cardView != null) {
            i = R.id.cardInfoComplaintService;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cardInfoComplaintService);
            if (cardView2 != null) {
                i = R.id.ivClaimArrow;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClaimArrow);
                if (imageView != null) {
                    i = R.id.ivClaimIcon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClaimIcon);
                    if (imageView2 != null) {
                        i = R.id.ivInfoArrow;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivInfoArrow);
                        if (imageView3 != null) {
                            i = R.id.ivInfoIcon;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivInfoIcon);
                            if (imageView4 != null) {
                                i = R.id.ivQueueingIllustration;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivQueueingIllustration);
                                if (imageView5 != null) {
                                    i = R.id.layoutToolbar;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                                    if (viewFindChildViewById != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                        i = R.id.tvClaimDescription;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimDescription);
                                        if (textView != null) {
                                            i = R.id.tvClaimTitle;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimTitle);
                                            if (textView2 != null) {
                                                i = R.id.tvInfoDescription;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoDescription);
                                                if (textView3 != null) {
                                                    i = R.id.tvInfoTitle;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoTitle);
                                                    if (textView4 != null) {
                                                        i = R.id.tvQueueingDescription;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQueueingDescription);
                                                        if (textView5 != null) {
                                                            i = R.id.tvQueueingTitle;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQueueingTitle);
                                                            if (textView6 != null) {
                                                                return new ActivityQueueingServiceBinding((ConstraintLayout) view, cardView, cardView2, imageView, imageView2, imageView3, imageView4, imageView5, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4, textView5, textView6);
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
