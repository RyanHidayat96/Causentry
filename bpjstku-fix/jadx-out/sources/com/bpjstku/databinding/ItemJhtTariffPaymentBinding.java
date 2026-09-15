package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemJhtTariffPaymentBinding implements ViewBinding {
    public final RadioButton rbTariffItem;
    private final RadioButton rootView;

    private ItemJhtTariffPaymentBinding(RadioButton radioButton, RadioButton radioButton2) {
        this.rootView = radioButton;
        this.rbTariffItem = radioButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RadioButton getRoot() {
        return this.rootView;
    }

    public static ItemJhtTariffPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemJhtTariffPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_jht_tariff_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemJhtTariffPaymentBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RadioButton radioButton = (RadioButton) view;
        return new ItemJhtTariffPaymentBinding(radioButton, radioButton);
    }
}
