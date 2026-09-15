package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemKpjListDisabledBinding implements ViewBinding {
    public final TextInputEditText edtIdKpj;
    private final TextInputLayout rootView;
    public final TextInputLayout tilIdKpj;

    private ItemKpjListDisabledBinding(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.edtIdKpj = textInputEditText;
        this.tilIdKpj = textInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final TextInputLayout getRoot() {
        return this.rootView;
    }

    public static ItemKpjListDisabledBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemKpjListDisabledBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_kpj_list_disabled, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemKpjListDisabledBinding bind(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdKpj);
        if (textInputEditText != null) {
            TextInputLayout textInputLayout = (TextInputLayout) view;
            return new ItemKpjListDisabledBinding(textInputLayout, textInputEditText, textInputLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.edtIdKpj)));
    }
}
