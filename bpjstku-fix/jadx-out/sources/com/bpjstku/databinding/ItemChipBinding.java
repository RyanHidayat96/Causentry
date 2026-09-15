package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemChipBinding implements ViewBinding {
    public final Chip chipCategory;
    private final Chip rootView;

    private ItemChipBinding(Chip chip, Chip chip2) {
        this.rootView = chip;
        this.chipCategory = chip2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final Chip getRoot() {
        return this.rootView;
    }

    public static ItemChipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemChipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemChipBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Chip chip = (Chip) view;
        return new ItemChipBinding(chip, chip);
    }
}
