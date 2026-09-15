package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentJpnSimulationResultBinding implements ViewBinding {
    public final MultiStateView msvJpnSimulationResult;
    private final MultiStateView rootView;
    public final RecyclerView rvJpnSimulationResult;

    private FragmentJpnSimulationResultBinding(MultiStateView multiStateView, MultiStateView multiStateView2, RecyclerView recyclerView) {
        this.rootView = multiStateView;
        this.msvJpnSimulationResult = multiStateView2;
        this.rvJpnSimulationResult = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static FragmentJpnSimulationResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentJpnSimulationResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_jpn_simulation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentJpnSimulationResultBinding bind(View view) {
        MultiStateView multiStateView = (MultiStateView) view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJpnSimulationResult);
        if (recyclerView != null) {
            return new FragmentJpnSimulationResultBinding(multiStateView, multiStateView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rvJpnSimulationResult)));
    }
}
