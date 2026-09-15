package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentShowMoreHomeBinding implements ViewBinding {
    public final MaterialButton btnCloseDialog;
    public final MultiStateView msvMenu;
    private final RelativeLayout rootView;
    public final RecyclerView rvServices;
    public final AppCompatTextView tvTitleBottomSheet;
    public final View viewLineBottomSheet;

    private FragmentShowMoreHomeBinding(RelativeLayout relativeLayout, MaterialButton materialButton, MultiStateView multiStateView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, View view) {
        this.rootView = relativeLayout;
        this.btnCloseDialog = materialButton;
        this.msvMenu = multiStateView;
        this.rvServices = recyclerView;
        this.tvTitleBottomSheet = appCompatTextView;
        this.viewLineBottomSheet = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentShowMoreHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentShowMoreHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_show_more_home, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentShowMoreHomeBinding bind(View view) {
        int i = R.id.btnCloseDialog;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCloseDialog);
        if (materialButton != null) {
            i = R.id.msvMenu;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvMenu);
            if (multiStateView != null) {
                i = R.id.rvServices;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvServices);
                if (recyclerView != null) {
                    i = R.id.tvTitleBottomSheet;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                    if (appCompatTextView != null) {
                        i = R.id.viewLineBottomSheet;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineBottomSheet);
                        if (viewFindChildViewById != null) {
                            return new FragmentShowMoreHomeBinding((RelativeLayout) view, materialButton, multiStateView, recyclerView, appCompatTextView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
