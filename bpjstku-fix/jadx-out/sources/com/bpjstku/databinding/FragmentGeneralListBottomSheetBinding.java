package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentGeneralListBottomSheetBinding implements ViewBinding {
    public final LinearLayout bottomSheetContainer;
    public final MultiStateView msvGeneralList;
    private final LinearLayout rootView;
    public final RecyclerView rvItem;
    public final SearchView svSearchItem;
    public final TextView tvTitle;
    public final View viewTopLine;

    private FragmentGeneralListBottomSheetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MultiStateView multiStateView, RecyclerView recyclerView, SearchView searchView, TextView textView, View view) {
        this.rootView = linearLayout;
        this.bottomSheetContainer = linearLayout2;
        this.msvGeneralList = multiStateView;
        this.rvItem = recyclerView;
        this.svSearchItem = searchView;
        this.tvTitle = textView;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentGeneralListBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGeneralListBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_general_list_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentGeneralListBottomSheetBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.msvGeneralList;
        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvGeneralList);
        if (multiStateView != null) {
            i = R.id.rvItem;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvItem);
            if (recyclerView != null) {
                i = R.id.svSearchItem;
                SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.svSearchItem);
                if (searchView != null) {
                    i = R.id.tvTitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView != null) {
                        i = R.id.viewTopLine;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                        if (viewFindChildViewById != null) {
                            return new FragmentGeneralListBottomSheetBinding(linearLayout, linearLayout, multiStateView, recyclerView, searchView, textView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
