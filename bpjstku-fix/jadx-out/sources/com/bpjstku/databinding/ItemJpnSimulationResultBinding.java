package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemJpnSimulationResultBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RecyclerView rvJpnSimulationResultTable;
    public final TextView tvDateTime;

    private ItemJpnSimulationResultBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.rvJpnSimulationResultTable = recyclerView;
        this.tvDateTime = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemJpnSimulationResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemJpnSimulationResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_jpn_simulation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemJpnSimulationResultBinding bind(View view) {
        int i = R.id.rvJpnSimulationResultTable;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJpnSimulationResultTable);
        if (recyclerView != null) {
            i = R.id.tvDateTime;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDateTime);
            if (textView != null) {
                return new ItemJpnSimulationResultBinding((ConstraintLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
