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
public final class FragmentChooseReligionBottomSheetBinding implements ViewBinding {
    public final MultiStateView msvReligionStatus;
    private final FrameLayout rootView;
    public final RecyclerView rvChooseReligion;
    public final TextView tvChooseReligion;

    private FragmentChooseReligionBottomSheetBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvReligionStatus = multiStateView;
        this.rvChooseReligion = recyclerView;
        this.tvChooseReligion = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseReligionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseReligionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_religion_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseReligionBottomSheetBinding bind(View view) {
        int i = R.id.msvReligionStatus;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvReligionStatus);
        if (multiStateView != null) {
            i = R.id.rvChooseReligion;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseReligion);
            if (recyclerView != null) {
                i = R.id.tvChooseReligion;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseReligion);
                if (textView != null) {
                    return new FragmentChooseReligionBottomSheetBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
