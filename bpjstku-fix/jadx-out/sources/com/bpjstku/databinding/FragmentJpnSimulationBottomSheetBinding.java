package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentJpnSimulationBottomSheetBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final MultiStateView msvJpnSimulationResult;
    private final FrameLayout rootView;
    public final RecyclerView rvJpnSimulationResult;
    public final TextView tvJpSimulationResult;
    public final View viewLine;
    public final View viewTopLine;

    private FragmentJpnSimulationBottomSheetBinding(FrameLayout frameLayout, MaterialButton materialButton, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView, View view, View view2) {
        this.rootView = frameLayout;
        this.btnBack = materialButton;
        this.msvJpnSimulationResult = multiStateView;
        this.rvJpnSimulationResult = recyclerView;
        this.tvJpSimulationResult = textView;
        this.viewLine = view;
        this.viewTopLine = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentJpnSimulationBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentJpnSimulationBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_jpn_simulation_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentJpnSimulationBottomSheetBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.msvJpnSimulationResult;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvJpnSimulationResult);
            if (multiStateView != null) {
                i = R.id.rvJpnSimulationResult;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJpnSimulationResult);
                if (recyclerView != null) {
                    i = R.id.tvJpSimulationResult;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvJpSimulationResult);
                    if (textView != null) {
                        i = R.id.viewLine;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLine);
                        if (viewFindChildViewById != null) {
                            i = R.id.viewTopLine;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                            if (viewFindChildViewById2 != null) {
                                return new FragmentJpnSimulationBottomSheetBinding((FrameLayout) view, materialButton, multiStateView, recyclerView, textView, viewFindChildViewById, viewFindChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
