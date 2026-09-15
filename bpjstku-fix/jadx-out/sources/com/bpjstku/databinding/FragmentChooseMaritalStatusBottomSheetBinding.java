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
public final class FragmentChooseMaritalStatusBottomSheetBinding implements ViewBinding {
    public final MultiStateView msvMaritalStatus;
    private final FrameLayout rootView;
    public final RecyclerView rvChooseMaritalStatus;
    public final TextView tvChooseMaritalStatus;

    private FragmentChooseMaritalStatusBottomSheetBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvMaritalStatus = multiStateView;
        this.rvChooseMaritalStatus = recyclerView;
        this.tvChooseMaritalStatus = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseMaritalStatusBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseMaritalStatusBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_marital_status_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseMaritalStatusBottomSheetBinding bind(View view) {
        int i = R.id.msvMaritalStatus;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvMaritalStatus);
        if (multiStateView != null) {
            i = R.id.rvChooseMaritalStatus;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseMaritalStatus);
            if (recyclerView != null) {
                i = R.id.tvChooseMaritalStatus;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseMaritalStatus);
                if (textView != null) {
                    return new FragmentChooseMaritalStatusBottomSheetBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
