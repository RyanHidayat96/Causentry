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

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAsikMembershipStatusBinding implements ViewBinding {
    public final CardView cvLapakAsikActiveParticipant;
    public final CardView cvLapakAsikNonActiveParticipant;
    public final ImageView imgActiveParticipant;
    public final ImageView imgChevronRightActive;
    public final ImageView imgChevronRightNonactive;
    public final ImageView imgLapakAsikBackground;
    public final ImageView imgNonActiveParticipant;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvActiveParticipant;
    public final TextView tvChooseParticipantStatus;
    public final TextView tvNonActiveParticipant;

    private ActivityAsikMembershipStatusBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.cvLapakAsikActiveParticipant = cardView;
        this.cvLapakAsikNonActiveParticipant = cardView2;
        this.imgActiveParticipant = imageView;
        this.imgChevronRightActive = imageView2;
        this.imgChevronRightNonactive = imageView3;
        this.imgLapakAsikBackground = imageView4;
        this.imgNonActiveParticipant = imageView5;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvActiveParticipant = textView;
        this.tvChooseParticipantStatus = textView2;
        this.tvNonActiveParticipant = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAsikMembershipStatusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAsikMembershipStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_asik_membership_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAsikMembershipStatusBinding bind(View view) {
        int i = R.id.cvLapakAsikActiveParticipant;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvLapakAsikActiveParticipant);
        if (cardView != null) {
            i = R.id.cvLapakAsikNonActiveParticipant;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvLapakAsikNonActiveParticipant);
            if (cardView2 != null) {
                i = R.id.imgActiveParticipant;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgActiveParticipant);
                if (imageView != null) {
                    i = R.id.img_chevron_right_active;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_chevron_right_active);
                    if (imageView2 != null) {
                        i = R.id.img_chevron_right_nonactive;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_chevron_right_nonactive);
                        if (imageView3 != null) {
                            i = R.id.imgLapakAsikBackground;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLapakAsikBackground);
                            if (imageView4 != null) {
                                i = R.id.imgNonActiveParticipant;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNonActiveParticipant);
                                if (imageView5 != null) {
                                    i = R.id.layout_toolbar;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                    if (viewFindChildViewById != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                        i = R.id.tvActiveParticipant;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvActiveParticipant);
                                        if (textView != null) {
                                            i = R.id.tvChooseParticipantStatus;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseParticipantStatus);
                                            if (textView2 != null) {
                                                i = R.id.tvNonActiveParticipant;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNonActiveParticipant);
                                                if (textView3 != null) {
                                                    return new ActivityAsikMembershipStatusBinding((ConstraintLayout) view, cardView, cardView2, imageView, imageView2, imageView3, imageView4, imageView5, layoutToolbarCenterBindingBind, textView, textView2, textView3);
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
