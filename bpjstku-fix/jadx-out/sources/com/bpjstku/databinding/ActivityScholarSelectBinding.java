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

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityScholarSelectBinding implements ViewBinding {
    public final RecyclerView actScholarRecycler;
    public final TextView actScholarSubtitle;
    public final TextView actScholarTitle;
    public final ImageView imgBackground;
    public final ImageView imgBackgroundTop;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;

    private ActivityScholarSelectBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = constraintLayout;
        this.actScholarRecycler = recyclerView;
        this.actScholarSubtitle = textView;
        this.actScholarTitle = textView2;
        this.imgBackground = imageView;
        this.imgBackgroundTop = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityScholarSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScholarSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_scholar_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityScholarSelectBinding bind(View view) {
        int i = R.id.act_scholar_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.act_scholar_recycler);
        if (recyclerView != null) {
            i = R.id.act_scholar_subtitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.act_scholar_subtitle);
            if (textView != null) {
                i = R.id.act_scholar_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.act_scholar_title);
                if (textView2 != null) {
                    i = R.id.imgBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (imageView != null) {
                        i = R.id.imgBackgroundTop;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackgroundTop);
                        if (imageView2 != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                return new ActivityScholarSelectBinding((ConstraintLayout) view, recyclerView, textView, textView2, imageView, imageView2, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
