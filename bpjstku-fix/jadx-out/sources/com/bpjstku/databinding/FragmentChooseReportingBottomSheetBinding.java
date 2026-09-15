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
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentChooseReportingBottomSheetBinding implements ViewBinding {
    public final MultiStateView msvReportingStatus;
    private final FrameLayout rootView;
    public final RecyclerView rvChooseReporting;
    public final TextView tvChooseReporting;

    private FragmentChooseReportingBottomSheetBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvReportingStatus = multiStateView;
        this.rvChooseReporting = recyclerView;
        this.tvChooseReporting = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseReportingBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseReportingBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_reporting_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseReportingBottomSheetBinding bind(View view) {
        int i = R.id.msvReportingStatus;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvReportingStatus);
        if (multiStateView != null) {
            i = R.id.rvChooseReporting;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseReporting);
            if (recyclerView != null) {
                i = R.id.tvChooseReporting;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseReporting);
                if (textView != null) {
                    return new FragmentChooseReportingBottomSheetBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
