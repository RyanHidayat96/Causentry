package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDeviceUnlinkingLivenessBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final View divider1;
    public final View divider2;
    public final AppCompatImageView imgLivenessGood;
    public final AppCompatImageView imgLivenessWrong;
    public final LayoutToolbarBinding layoutToolbar;
    public final LinearLayout llDo1;
    public final LinearLayout llDo2;
    public final LinearLayout llDo3;
    public final LinearLayout llDo4;
    public final LinearLayout llDo5;
    public final LinearLayout llExampleImages;
    public final LinearLayout llPanduanBox;
    private final ScrollView rootView;
    public final AppCompatTextView tvTitleInformation;

    private ActivityDeviceUnlinkingLivenessBinding(ScrollView scrollView, MaterialButton materialButton, View view, View view2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LayoutToolbarBinding layoutToolbarBinding, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, AppCompatTextView appCompatTextView) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.divider1 = view;
        this.divider2 = view2;
        this.imgLivenessGood = appCompatImageView;
        this.imgLivenessWrong = appCompatImageView2;
        this.layoutToolbar = layoutToolbarBinding;
        this.llDo1 = linearLayout;
        this.llDo2 = linearLayout2;
        this.llDo3 = linearLayout3;
        this.llDo4 = linearLayout4;
        this.llDo5 = linearLayout5;
        this.llExampleImages = linearLayout6;
        this.llPanduanBox = linearLayout7;
        this.tvTitleInformation = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceUnlinkingLivenessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceUnlinkingLivenessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_device_unlinking_liveness, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDeviceUnlinkingLivenessBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.divider1;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divider1);
            if (viewFindChildViewById != null) {
                i = R.id.divider2;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider2);
                if (viewFindChildViewById2 != null) {
                    i = R.id.imgLivenessGood;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessGood);
                    if (appCompatImageView != null) {
                        i = R.id.imgLivenessWrong;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessWrong);
                        if (appCompatImageView2 != null) {
                            i = R.id.layoutToolbar;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                            if (viewFindChildViewById3 != null) {
                                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById3);
                                i = R.id.llDo1;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo1);
                                if (linearLayout != null) {
                                    i = R.id.llDo2;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo2);
                                    if (linearLayout2 != null) {
                                        i = R.id.llDo3;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo3);
                                        if (linearLayout3 != null) {
                                            i = R.id.llDo4;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo4);
                                            if (linearLayout4 != null) {
                                                i = R.id.llDo5;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo5);
                                                if (linearLayout5 != null) {
                                                    i = R.id.llExampleImages;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llExampleImages);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.llPanduanBox;
                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPanduanBox);
                                                        if (linearLayout7 != null) {
                                                            i = R.id.tvTitleInformation;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                                            if (appCompatTextView != null) {
                                                                return new ActivityDeviceUnlinkingLivenessBinding((ScrollView) view, materialButton, viewFindChildViewById, viewFindChildViewById2, appCompatImageView, appCompatImageView2, layoutToolbarBindingBind, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, appCompatTextView);
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
