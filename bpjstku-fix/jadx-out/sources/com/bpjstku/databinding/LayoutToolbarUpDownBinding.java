package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutToolbarUpDownBinding implements ViewBinding {
    private final MaterialToolbar rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvToolbarTitle;

    private LayoutToolbarUpDownBinding(MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, TextView textView) {
        this.rootView = materialToolbar;
        this.toolbar = materialToolbar2;
        this.tvToolbarTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialToolbar getRoot() {
        return this.rootView;
    }

    public static LayoutToolbarUpDownBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutToolbarUpDownBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_toolbar_up_down, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutToolbarUpDownBinding bind(View view) {
        MaterialToolbar materialToolbar = (MaterialToolbar) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
        if (textView != null) {
            return new LayoutToolbarUpDownBinding(materialToolbar, materialToolbar, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvToolbarTitle)));
    }
}
