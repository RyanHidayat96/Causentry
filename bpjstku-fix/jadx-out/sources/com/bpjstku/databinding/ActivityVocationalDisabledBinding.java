package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityVocationalDisabledBinding implements ViewBinding {
    public final Button btnBack;
    public final ImageView imgBackground;
    public final ImageView imgVocationalEligibilityResult;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvEligibilityResult;

    private ActivityVocationalDisabledBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView) {
        this.rootView = constraintLayout;
        this.btnBack = button;
        this.imgBackground = imageView;
        this.imgVocationalEligibilityResult = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvEligibilityResult = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalDisabledBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalDisabledBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_disabled, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalDisabledBinding bind(View view) {
        int i = R.id.btnBack;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (button != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.imgVocationalEligibilityResult;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVocationalEligibilityResult);
                if (imageView2 != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tvEligibilityResult;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEligibilityResult);
                        if (textView != null) {
                            return new ActivityVocationalDisabledBinding((ConstraintLayout) view, button, imageView, imageView2, layoutToolbarCenterBindingBind, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
