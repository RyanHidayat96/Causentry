package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentBpjstkuBranchOfficeDirectoryBinding implements ViewBinding {
    public final ImageView imgArrowDown;
    public final MaterialToolbar mttbDirectoryOffice;
    private final ConstraintLayout rootView;
    public final RecyclerView rvBranchOfficeList;
    public final TextView tvToolbarTitle;

    private FragmentBpjstkuBranchOfficeDirectoryBinding(ConstraintLayout constraintLayout, ImageView imageView, MaterialToolbar materialToolbar, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgArrowDown = imageView;
        this.mttbDirectoryOffice = materialToolbar;
        this.rvBranchOfficeList = recyclerView;
        this.tvToolbarTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBpjstkuBranchOfficeDirectoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBpjstkuBranchOfficeDirectoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bpjstku_branch_office_directory, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBpjstkuBranchOfficeDirectoryBinding bind(View view) {
        int i = R.id.imgArrowDown;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowDown);
        if (imageView != null) {
            i = R.id.mttbDirectoryOffice;
            MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.mttbDirectoryOffice);
            if (materialToolbar != null) {
                i = R.id.rvBranchOfficeList;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBranchOfficeList);
                if (recyclerView != null) {
                    i = R.id.tvToolbarTitle;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
                    if (textView != null) {
                        return new FragmentBpjstkuBranchOfficeDirectoryBinding((ConstraintLayout) view, imageView, materialToolbar, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
