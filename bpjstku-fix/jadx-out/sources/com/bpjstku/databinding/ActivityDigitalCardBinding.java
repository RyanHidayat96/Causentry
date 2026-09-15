package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDigitalCardBinding implements ViewBinding {
    public final ImageView imgBackground;
    public final MultiStateView msvDigitalCard;
    private final ConstraintLayout rootView;
    public final RecyclerView rvDigitalCard;
    public final LayoutToolbarCenterBinding toolbarCenter;
    public final TextView tvChooseJamsostekNumberId;

    private ActivityDigitalCardBinding(ConstraintLayout constraintLayout, ImageView imageView, MultiStateView multiStateView, RecyclerView recyclerView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView) {
        this.rootView = constraintLayout;
        this.imgBackground = imageView;
        this.msvDigitalCard = multiStateView;
        this.rvDigitalCard = recyclerView;
        this.toolbarCenter = layoutToolbarCenterBinding;
        this.tvChooseJamsostekNumberId = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDigitalCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDigitalCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_digital_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDigitalCardBinding bind(View view) {
        int i = R.id.imgBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
        if (imageView != null) {
            i = R.id.msvDigitalCard;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvDigitalCard);
            if (multiStateView != null) {
                i = R.id.rvDigitalCard;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvDigitalCard);
                if (recyclerView != null) {
                    i = R.id.toolbarCenter;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.toolbarCenter);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tvChooseJamsostekNumberId;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseJamsostekNumberId);
                        if (textView != null) {
                            return new ActivityDigitalCardBinding((ConstraintLayout) view, imageView, multiStateView, recyclerView, layoutToolbarCenterBindingBind, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
