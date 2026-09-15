package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemJkpMenuBinding implements ViewBinding {
    public final AppCompatImageView imgBalanceCheck;
    public final AppCompatImageView imgJpnSimulation;
    private final MaterialCardView rootView;
    public final AppCompatTextView tvJpSimulationDescription;
    public final AppCompatTextView tvJpSimulationMenu;

    private ItemJkpMenuBinding(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = materialCardView;
        this.imgBalanceCheck = appCompatImageView;
        this.imgJpnSimulation = appCompatImageView2;
        this.tvJpSimulationDescription = appCompatTextView;
        this.tvJpSimulationMenu = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemJkpMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemJkpMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_jkp_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemJkpMenuBinding bind(View view) {
        int i = R.id.imgBalanceCheck;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
        if (appCompatImageView != null) {
            i = R.id.imgJpnSimulation;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJpnSimulation);
            if (appCompatImageView2 != null) {
                i = R.id.tvJpSimulationDescription;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpSimulationDescription);
                if (appCompatTextView != null) {
                    i = R.id.tvJpSimulationMenu;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpSimulationMenu);
                    if (appCompatTextView2 != null) {
                        return new ItemJkpMenuBinding((MaterialCardView) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
