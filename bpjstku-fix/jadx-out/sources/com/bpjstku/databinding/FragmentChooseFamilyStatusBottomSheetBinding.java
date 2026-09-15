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
public final class FragmentChooseFamilyStatusBottomSheetBinding implements ViewBinding {
    public final MultiStateView msvFamilyStatus;
    private final FrameLayout rootView;
    public final RecyclerView rvFamilyStatus;
    public final TextView tvChooseFamilyStatus;

    private FragmentChooseFamilyStatusBottomSheetBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvFamilyStatus = multiStateView;
        this.rvFamilyStatus = recyclerView;
        this.tvChooseFamilyStatus = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseFamilyStatusBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseFamilyStatusBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_family_status_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseFamilyStatusBottomSheetBinding bind(View view) {
        int i = R.id.msvFamilyStatus;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvFamilyStatus);
        if (multiStateView != null) {
            i = R.id.rvFamilyStatus;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvFamilyStatus);
            if (recyclerView != null) {
                i = R.id.tvChooseFamilyStatus;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseFamilyStatus);
                if (textView != null) {
                    return new FragmentChooseFamilyStatusBottomSheetBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
