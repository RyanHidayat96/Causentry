package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemUserKpjBinding implements ViewBinding {
    public final AppCompatRadioButton rbKpjId;
    private final AppCompatRadioButton rootView;

    private ItemUserKpjBinding(AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2) {
        this.rootView = appCompatRadioButton;
        this.rbKpjId = appCompatRadioButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final AppCompatRadioButton getRoot() {
        return this.rootView;
    }

    public static ItemUserKpjBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemUserKpjBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_user_kpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemUserKpjBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) view;
        return new ItemUserKpjBinding(appCompatRadioButton, appCompatRadioButton);
    }
}
