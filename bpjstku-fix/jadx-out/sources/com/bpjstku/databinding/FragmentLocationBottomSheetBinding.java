package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentLocationBottomSheetBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvPartnerFilter;
    public final AppCompatTextView tvLocation;
    public final View viewTopLine;

    private FragmentLocationBottomSheetBinding(LinearLayout linearLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, View view) {
        this.rootView = linearLayout;
        this.rvPartnerFilter = recyclerView;
        this.tvLocation = appCompatTextView;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLocationBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLocationBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_location_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLocationBottomSheetBinding bind(View view) {
        int i = R.id.rvPartnerFilter;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPartnerFilter);
        if (recyclerView != null) {
            i = R.id.tvLocation;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvLocation);
            if (appCompatTextView != null) {
                i = R.id.viewTopLine;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                if (viewFindChildViewById != null) {
                    return new FragmentLocationBottomSheetBinding((LinearLayout) view, recyclerView, appCompatTextView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
