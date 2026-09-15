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
public final class FragmentListTuitionRateBinding implements ViewBinding {
    public final MultiStateView msvListTuitionRates;
    private final FrameLayout rootView;
    public final RecyclerView rvItem;
    public final TextView tvChooseTuitionRates;

    private FragmentListTuitionRateBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvListTuitionRates = multiStateView;
        this.rvItem = recyclerView;
        this.tvChooseTuitionRates = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentListTuitionRateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentListTuitionRateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_list_tuition_rate, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentListTuitionRateBinding bind(View view) {
        int i = R.id.msvListTuitionRates;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvListTuitionRates);
        if (multiStateView != null) {
            i = R.id.rvItem;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvItem);
            if (recyclerView != null) {
                i = R.id.tvChooseTuitionRates;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseTuitionRates);
                if (textView != null) {
                    return new FragmentListTuitionRateBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
