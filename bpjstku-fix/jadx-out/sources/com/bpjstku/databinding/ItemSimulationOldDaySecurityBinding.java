package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemSimulationOldDaySecurityBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvTitleSimulationOldDaySecurity;
    public final AppCompatTextView tvValueSimulationOldDaySecurity;

    private ItemSimulationOldDaySecurityBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.tvTitleSimulationOldDaySecurity = appCompatTextView;
        this.tvValueSimulationOldDaySecurity = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSimulationOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSimulationOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_simulation_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSimulationOldDaySecurityBinding bind(View view) {
        int i = R.id.tvTitleSimulationOldDaySecurity;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleSimulationOldDaySecurity);
        if (appCompatTextView != null) {
            i = R.id.tvValueSimulationOldDaySecurity;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueSimulationOldDaySecurity);
            if (appCompatTextView2 != null) {
                return new ItemSimulationOldDaySecurityBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
