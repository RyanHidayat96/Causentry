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
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJpnPeriodicBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final CircleImageView civProfile;
    public final CardView cvInfoJp;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvNamesWorker;
    public final TextView tvNotConfirmationJP;
    public final TextView tvProgramsCovered;

    private ActivityJpnPeriodicBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, CircleImageView circleImageView, CardView cardView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnConfirmation = materialButton;
        this.civProfile = circleImageView;
        this.cvInfoJp = cardView;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvNamesWorker = textView;
        this.tvNotConfirmationJP = textView2;
        this.tvProgramsCovered = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityJpnPeriodicBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJpnPeriodicBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jpn_periodic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJpnPeriodicBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.civProfile;
            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
            if (circleImageView != null) {
                i = R.id.cvInfoJp;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
                if (cardView != null) {
                    i = R.id.imgBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (imageView != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.tvNamesWorker;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesWorker);
                            if (textView != null) {
                                i = R.id.tvNotConfirmationJP;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotConfirmationJP);
                                if (textView2 != null) {
                                    i = R.id.tvProgramsCovered;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramsCovered);
                                    if (textView3 != null) {
                                        return new ActivityJpnPeriodicBinding((ConstraintLayout) view, materialButton, circleImageView, cardView, imageView, layoutToolbarCenterBindingBind, textView, textView2, textView3);
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
