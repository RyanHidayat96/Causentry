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
public final class ItemSimulationPensionSecurityBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvTitleSimulationPensionSecurity;
    public final AppCompatTextView tvValueSimulationPensionSecurity;

    private ItemSimulationPensionSecurityBinding(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.tvTitleSimulationPensionSecurity = appCompatTextView;
        this.tvValueSimulationPensionSecurity = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSimulationPensionSecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemSimulationPensionSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_simulation_pension_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemSimulationPensionSecurityBinding bind(View view) {
        int i = R.id.tvTitleSimulationPensionSecurity;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleSimulationPensionSecurity);
        if (appCompatTextView != null) {
            i = R.id.tvValueSimulationPensionSecurity;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueSimulationPensionSecurity);
            if (appCompatTextView2 != null) {
                return new ItemSimulationPensionSecurityBinding((ConstraintLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
