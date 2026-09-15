package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemKodeNonaktifBinding implements ViewBinding {
    public final AppCompatRadioButton rbKodeNonaktif;
    private final AppCompatRadioButton rootView;

    private ItemKodeNonaktifBinding(AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2) {
        this.rootView = appCompatRadioButton;
        this.rbKodeNonaktif = appCompatRadioButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final AppCompatRadioButton getRoot() {
        return this.rootView;
    }

    public static ItemKodeNonaktifBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemKodeNonaktifBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_kode_nonaktif, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemKodeNonaktifBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) view;
        return new ItemKodeNonaktifBinding(appCompatRadioButton, appCompatRadioButton);
    }
}
