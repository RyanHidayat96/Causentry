package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDanasiagaBinding implements ViewBinding {
    public final RecyclerView activityDanasiagaRecycler;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;

    private ActivityDanasiagaBinding(ScrollView scrollView, RecyclerView recyclerView, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = scrollView;
        this.activityDanasiagaRecycler = recyclerView;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDanasiagaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDanasiagaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_danasiaga, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDanasiagaBinding bind(View view) {
        int i = R.id.activity_danasiaga_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.activity_danasiaga_recycler);
        if (recyclerView != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    return new ActivityDanasiagaBinding((ScrollView) view, recyclerView, imageView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
