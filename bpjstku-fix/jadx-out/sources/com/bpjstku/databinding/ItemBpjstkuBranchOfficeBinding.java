package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemBpjstkuBranchOfficeBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvBranchOffice;
    public final TextView tvBranchOfficeRegionalName;

    private ItemBpjstkuBranchOfficeBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.rvBranchOffice = recyclerView;
        this.tvBranchOfficeRegionalName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemBpjstkuBranchOfficeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBpjstkuBranchOfficeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_bpjstku_branch_office, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBpjstkuBranchOfficeBinding bind(View view) {
        int i = R.id.rvBranchOffice;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBranchOffice);
        if (recyclerView != null) {
            i = R.id.tvBranchOfficeRegionalName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBranchOfficeRegionalName);
            if (textView != null) {
                return new ItemBpjstkuBranchOfficeBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
