package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityJkpBiometricBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvLivenessCheck;
    public final MaterialCardView cvSelfieInfo;
    public final ImageView imgLivenessCheck;
    public final AppCompatImageView imgLivenessCheck2;
    public final AppCompatImageView imgLivenessCheck3;
    public final ImageView imgSelfiePhoto;
    public final AppCompatImageView ivInformation;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextView tvLivenessCheck;
    public final TextView tvLivenessCheckLabel;
    public final AppCompatTextView tvTitleInformation;
    public final AppCompatTextView tvTitleInformation1;

    private ActivityJkpBiometricBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, MaterialCardView materialCardView, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView2, AppCompatImageView appCompatImageView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvLivenessCheck = cardView;
        this.cvSelfieInfo = materialCardView;
        this.imgLivenessCheck = imageView;
        this.imgLivenessCheck2 = appCompatImageView;
        this.imgLivenessCheck3 = appCompatImageView2;
        this.imgSelfiePhoto = imageView2;
        this.ivInformation = appCompatImageView3;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvLivenessCheck = textView;
        this.tvLivenessCheckLabel = textView2;
        this.tvTitleInformation = appCompatTextView;
        this.tvTitleInformation1 = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityJkpBiometricBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJkpBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jkp_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJkpBiometricBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvLivenessCheck;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvLivenessCheck);
            if (cardView != null) {
                i = R.id.cvSelfieInfo;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvSelfieInfo);
                if (materialCardView != null) {
                    i = R.id.imgLivenessCheck;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck);
                    if (imageView != null) {
                        i = R.id.imgLivenessCheck2;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck2);
                        if (appCompatImageView != null) {
                            i = R.id.imgLivenessCheck3;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck3);
                            if (appCompatImageView2 != null) {
                                i = R.id.imgSelfiePhoto;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelfiePhoto);
                                if (imageView2 != null) {
                                    i = R.id.ivInformation;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivInformation);
                                    if (appCompatImageView3 != null) {
                                        i = R.id.layout_toolbar;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                        if (viewFindChildViewById != null) {
                                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                            i = R.id.tvLivenessCheck;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheck);
                                            if (textView != null) {
                                                i = R.id.tvLivenessCheckLabel;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheckLabel);
                                                if (textView2 != null) {
                                                    i = R.id.tvTitleInformation;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                                    if (appCompatTextView != null) {
                                                        i = R.id.tvTitleInformation1;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation1);
                                                        if (appCompatTextView2 != null) {
                                                            return new ActivityJkpBiometricBinding((ScrollView) view, materialButton, cardView, materialCardView, imageView, appCompatImageView, appCompatImageView2, imageView2, appCompatImageView3, layoutToolbarCenterBindingBind, textView, textView2, appCompatTextView, appCompatTextView2);
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
