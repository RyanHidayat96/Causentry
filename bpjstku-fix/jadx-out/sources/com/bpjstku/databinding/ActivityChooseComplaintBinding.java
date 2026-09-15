package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityChooseComplaintBinding implements ViewBinding {
    public final MaterialCardView cvComplaintHistory;
    public final MaterialCardView cvNonRegisteredCompany;
    public final MaterialCardView cvUnmatchedData;
    public final ImageView imgBackground;
    public final ImageView imgComplaintHistory;
    public final ImageView imgNonRegisteredCompany;
    public final ImageView imgUnmatchedData;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvComplaintHistory;
    public final TextView tvComplaintInfo;
    public final AppCompatTextView tvNonRegisteredCompany;
    public final AppCompatTextView tvUnmatchedData;

    private ActivityChooseComplaintBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LayoutToolbarCenterBinding layoutToolbarCenterBinding, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.cvComplaintHistory = materialCardView;
        this.cvNonRegisteredCompany = materialCardView2;
        this.cvUnmatchedData = materialCardView3;
        this.imgBackground = imageView;
        this.imgComplaintHistory = imageView2;
        this.imgNonRegisteredCompany = imageView3;
        this.imgUnmatchedData = imageView4;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvComplaintHistory = appCompatTextView;
        this.tvComplaintInfo = textView;
        this.tvNonRegisteredCompany = appCompatTextView2;
        this.tvUnmatchedData = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChooseComplaintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChooseComplaintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_choose_complaint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityChooseComplaintBinding bind(View view) {
        int i = R.id.cvComplaintHistory;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvComplaintHistory);
        if (materialCardView != null) {
            i = R.id.cvNonRegisteredCompany;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvNonRegisteredCompany);
            if (materialCardView2 != null) {
                i = R.id.cvUnmatchedData;
                MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvUnmatchedData);
                if (materialCardView3 != null) {
                    i = R.id.imgBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (imageView != null) {
                        i = R.id.imgComplaintHistory;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgComplaintHistory);
                        if (imageView2 != null) {
                            i = R.id.imgNonRegisteredCompany;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNonRegisteredCompany);
                            if (imageView3 != null) {
                                i = R.id.imgUnmatchedData;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUnmatchedData);
                                if (imageView4 != null) {
                                    i = R.id.layout_toolbar;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                    if (viewFindChildViewById != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                        i = R.id.tvComplaintHistory;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvComplaintHistory);
                                        if (appCompatTextView != null) {
                                            i = R.id.tvComplaintInfo;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvComplaintInfo);
                                            if (textView != null) {
                                                i = R.id.tvNonRegisteredCompany;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNonRegisteredCompany);
                                                if (appCompatTextView2 != null) {
                                                    i = R.id.tvUnmatchedData;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvUnmatchedData);
                                                    if (appCompatTextView3 != null) {
                                                        return new ActivityChooseComplaintBinding((ConstraintLayout) view, materialCardView, materialCardView2, materialCardView3, imageView, imageView2, imageView3, imageView4, layoutToolbarCenterBindingBind, appCompatTextView, textView, appCompatTextView2, appCompatTextView3);
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
