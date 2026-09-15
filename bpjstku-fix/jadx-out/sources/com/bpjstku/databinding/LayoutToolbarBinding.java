package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutToolbarBinding implements ViewBinding {
    private final MaterialToolbar rootView;
    public final MaterialToolbar toolbar;

    private LayoutToolbarBinding(MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2) {
        this.rootView = materialToolbar;
        this.toolbar = materialToolbar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialToolbar getRoot() {
        return this.rootView;
    }

    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutToolbarBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) view;
        return new LayoutToolbarBinding(materialToolbar, materialToolbar);
    }
}
