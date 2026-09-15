package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemRadioButtonBinding implements ViewBinding {
    public final AppCompatRadioButton rbChoice;
    private final AppCompatRadioButton rootView;

    private ItemRadioButtonBinding(AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2) {
        this.rootView = appCompatRadioButton;
        this.rbChoice = appCompatRadioButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final AppCompatRadioButton getRoot() {
        return this.rootView;
    }

    public static ItemRadioButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemRadioButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_radio_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemRadioButtonBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) view;
        return new ItemRadioButtonBinding(appCompatRadioButton, appCompatRadioButton);
    }
}
