package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySupportBinding implements ViewBinding {
    public final ImageView imgProgramBackground;
    public final LinearLayout layoutAntrianOnlineInfo;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSupport;
    public final TextView tvAntrianOnlineInfo;

    private ActivitySupportBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgProgramBackground = imageView;
        this.layoutAntrianOnlineInfo = linearLayout;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.rvSupport = recyclerView;
        this.tvAntrianOnlineInfo = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySupportBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySupportBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_support, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySupportBinding bind(View view) {
        int i = R.id.imgProgramBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgramBackground);
        if (imageView != null) {
            i = R.id.layoutAntrianOnlineInfo;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutAntrianOnlineInfo);
            if (linearLayout != null) {
                i = R.id.layout_toolbar_center;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.rvSupport;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvSupport);
                    if (recyclerView != null) {
                        i = R.id.tvAntrianOnlineInfo;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAntrianOnlineInfo);
                        if (textView != null) {
                            return new ActivitySupportBinding((ConstraintLayout) view, imageView, linearLayout, layoutToolbarCenterBindingBind, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
