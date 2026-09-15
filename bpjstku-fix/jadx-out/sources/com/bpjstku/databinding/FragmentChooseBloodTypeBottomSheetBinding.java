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
public final class FragmentChooseBloodTypeBottomSheetBinding implements ViewBinding {
    public final MultiStateView msvBloodTypeStatus;
    private final FrameLayout rootView;
    public final RecyclerView rvChooseBloodType;
    public final TextView tvChooseBloodType;

    private FragmentChooseBloodTypeBottomSheetBinding(FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = frameLayout;
        this.msvBloodTypeStatus = multiStateView;
        this.rvChooseBloodType = recyclerView;
        this.tvChooseBloodType = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseBloodTypeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseBloodTypeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_blood_type_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseBloodTypeBottomSheetBinding bind(View view) {
        int i = R.id.msvBloodTypeStatus;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvBloodTypeStatus);
        if (multiStateView != null) {
            i = R.id.rvChooseBloodType;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseBloodType);
            if (recyclerView != null) {
                i = R.id.tvChooseBloodType;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseBloodType);
                if (textView != null) {
                    return new FragmentChooseBloodTypeBottomSheetBinding((FrameLayout) view, multiStateView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
