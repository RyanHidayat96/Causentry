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

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentChoosePuKpjBottomSheetBinding implements ViewBinding {
    private final FrameLayout rootView;
    public final RecyclerView rvChooseKpj;
    public final TextView tvChooseKpj;

    private FragmentChoosePuKpjBottomSheetBinding(FrameLayout frameLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.rvChooseKpj = recyclerView;
        this.tvChooseKpj = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChoosePuKpjBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChoosePuKpjBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_pu_kpj_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChoosePuKpjBottomSheetBinding bind(View view) {
        int i = R.id.rvChooseKpj;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseKpj);
        if (recyclerView != null) {
            i = R.id.tvChooseKpj;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseKpj);
            if (textView != null) {
                return new FragmentChoosePuKpjBottomSheetBinding((FrameLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
