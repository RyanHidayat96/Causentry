package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemAsikAddKpjDeletableBinding implements ViewBinding {
    private final TextInputLayout rootView;
    public final TextInputLayout tilKpjDeletable;

    private ItemAsikAddKpjDeletableBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.tilKpjDeletable = textInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final TextInputLayout getRoot() {
        return this.rootView;
    }

    public static ItemAsikAddKpjDeletableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAsikAddKpjDeletableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_asik_add_kpj_deletable, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemAsikAddKpjDeletableBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new ItemAsikAddKpjDeletableBinding(textInputLayout, textInputLayout);
    }
}
