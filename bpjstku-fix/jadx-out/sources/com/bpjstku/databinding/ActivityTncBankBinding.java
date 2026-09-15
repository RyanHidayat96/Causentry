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
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityTncBankBinding implements ViewBinding {
    public final MaterialButton btnAgree;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ScrollView rootView;
    public final TextView tvBankDesc;
    public final TextView tvTitleBank;

    private ActivityTncBankBinding(ScrollView scrollView, MaterialButton materialButton, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnAgree = materialButton;
        this.imgBackground = imageView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.tvBankDesc = textView;
        this.tvTitleBank = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityTncBankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTncBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tnc_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTncBankBinding bind(View view) {
        int i = R.id.btnAgree;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAgree);
        if (materialButton != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.layout_toolbar_center;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.tvBankDesc;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBankDesc);
                    if (textView != null) {
                        i = R.id.tvTitleBank;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBank);
                        if (textView2 != null) {
                            return new ActivityTncBankBinding((ScrollView) view, materialButton, imageView, layoutToolbarCenterBindingBind, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
