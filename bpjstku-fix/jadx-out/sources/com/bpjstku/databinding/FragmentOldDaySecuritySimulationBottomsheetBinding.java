package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentOldDaySecuritySimulationBottomsheetBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final View imgLineBottomSheet;
    private final RelativeLayout rootView;
    public final RecyclerView rvSimulationOldDaySecurity;
    public final AppCompatTextView tvTitleBottomSheet;

    private FragmentOldDaySecuritySimulationBottomsheetBinding(RelativeLayout relativeLayout, MaterialButton materialButton, View view, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.rootView = relativeLayout;
        this.btnBack = materialButton;
        this.imgLineBottomSheet = view;
        this.rvSimulationOldDaySecurity = recyclerView;
        this.tvTitleBottomSheet = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOldDaySecuritySimulationBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOldDaySecuritySimulationBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_old_day_security_simulation_bottomsheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOldDaySecuritySimulationBottomsheetBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.imgLineBottomSheet;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
            if (viewFindChildViewById != null) {
                i = R.id.rvSimulationOldDaySecurity;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvSimulationOldDaySecurity);
                if (recyclerView != null) {
                    i = R.id.tvTitleBottomSheet;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                    if (appCompatTextView != null) {
                        return new FragmentOldDaySecuritySimulationBottomsheetBinding((RelativeLayout) view, materialButton, viewFindChildViewById, recyclerView, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
