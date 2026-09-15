package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityProgramBinding implements ViewBinding {
    public final ImageView imgProgramBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final RecyclerView rvProgram;

    private ActivityProgramBinding(ConstraintLayout constraintLayout, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.imgProgramBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvProgram = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityProgramBinding bind(View view) {
        int i = R.id.imgProgramBackground;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgramBackground);
        if (imageView != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvProgram);
                if (recyclerView != null) {
                    return new ActivityProgramBinding((ConstraintLayout) view, imageView, layoutToolbarCenterBindingBind, recyclerView);
                }
                i = R.id.rvProgram;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
