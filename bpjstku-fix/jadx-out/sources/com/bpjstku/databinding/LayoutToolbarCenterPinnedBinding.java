package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutToolbarCenterPinnedBinding implements ViewBinding {
    private final MaterialToolbar rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvToolbarTitle;

    private LayoutToolbarCenterPinnedBinding(MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, TextView textView) {
        this.rootView = materialToolbar;
        this.toolbar = materialToolbar2;
        this.tvToolbarTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialToolbar getRoot() {
        return this.rootView;
    }

    public static LayoutToolbarCenterPinnedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutToolbarCenterPinnedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_toolbar_center_pinned, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutToolbarCenterPinnedBinding bind(View view) {
        MaterialToolbar materialToolbar = (MaterialToolbar) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
        if (textView != null) {
            return new LayoutToolbarCenterPinnedBinding(materialToolbar, materialToolbar, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvToolbarTitle)));
    }
}
