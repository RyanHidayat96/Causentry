package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityListStreamingBinding implements ViewBinding {
    public final ImageView imgRctiPlus;
    public final ImageView imgVisionPlus;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayout llRctiPlus;
    public final LinearLayout llVisionPlus;
    private final ConstraintLayout rootView;
    public final View viewRctiPlusSeparator;
    public final View viewVisionPlusSeparator;

    private ActivityListStreamingBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, LinearLayout linearLayout2, View view, View view2) {
        this.rootView = constraintLayout;
        this.imgRctiPlus = imageView;
        this.imgVisionPlus = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llRctiPlus = linearLayout;
        this.llVisionPlus = linearLayout2;
        this.viewRctiPlusSeparator = view;
        this.viewVisionPlusSeparator = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityListStreamingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityListStreamingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_list_streaming, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityListStreamingBinding bind(View view) {
        int i = R.id.imgRctiPlus;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgRctiPlus);
        if (imageView != null) {
            i = R.id.imgVisionPlus;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVisionPlus);
            if (imageView2 != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.llRctiPlus;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llRctiPlus);
                    if (linearLayout != null) {
                        i = R.id.llVisionPlus;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llVisionPlus);
                        if (linearLayout2 != null) {
                            i = R.id.viewRctiPlusSeparator;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewRctiPlusSeparator);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.viewVisionPlusSeparator;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewVisionPlusSeparator);
                                if (viewFindChildViewById3 != null) {
                                    return new ActivityListStreamingBinding((ConstraintLayout) view, imageView, imageView2, layoutToolbarCenterBindingBind, linearLayout, linearLayout2, viewFindChildViewById2, viewFindChildViewById3);
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
