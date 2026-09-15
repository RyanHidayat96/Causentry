package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentRegionalOfficeDirectoryBinding implements ViewBinding {
    public final AppCompatImageView imgCollapseBottomSheetDirectory;
    public final MultiStateView msvRegionalOffice;
    private final RelativeLayout rootView;
    public final RecyclerView rvBranchOfficeDirectory;
    public final SearchView svSearchItem;
    public final AppCompatTextView tvTitleBottomSheet;
    public final View viewLineBottomSheet;

    private FragmentRegionalOfficeDirectoryBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, MultiStateView multiStateView, RecyclerView recyclerView, SearchView searchView, AppCompatTextView appCompatTextView, View view) {
        this.rootView = relativeLayout;
        this.imgCollapseBottomSheetDirectory = appCompatImageView;
        this.msvRegionalOffice = multiStateView;
        this.rvBranchOfficeDirectory = recyclerView;
        this.svSearchItem = searchView;
        this.tvTitleBottomSheet = appCompatTextView;
        this.viewLineBottomSheet = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRegionalOfficeDirectoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRegionalOfficeDirectoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_regional_office_directory, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRegionalOfficeDirectoryBinding bind(View view) {
        int i = R.id.imgCollapseBottomSheetDirectory;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgCollapseBottomSheetDirectory);
        if (appCompatImageView != null) {
            i = R.id.msvRegionalOffice;
            MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvRegionalOffice);
            if (multiStateView != null) {
                i = R.id.rvBranchOfficeDirectory;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBranchOfficeDirectory);
                if (recyclerView != null) {
                    i = R.id.svSearchItem;
                    SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.svSearchItem);
                    if (searchView != null) {
                        i = R.id.tvTitleBottomSheet;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                        if (appCompatTextView != null) {
                            i = R.id.viewLineBottomSheet;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineBottomSheet);
                            if (viewFindChildViewById != null) {
                                return new FragmentRegionalOfficeDirectoryBinding((RelativeLayout) view, appCompatImageView, multiStateView, recyclerView, searchView, appCompatTextView, viewFindChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
