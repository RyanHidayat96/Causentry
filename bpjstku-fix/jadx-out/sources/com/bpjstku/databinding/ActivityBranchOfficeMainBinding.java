package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBranchOfficeMainBinding implements ViewBinding {
    public final LayoutToolbarCenterBinding include2;
    private final ConstraintLayout rootView;

    private ActivityBranchOfficeMainBinding(ConstraintLayout constraintLayout, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = constraintLayout;
        this.include2 = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBranchOfficeMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBranchOfficeMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_branch_office_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityBranchOfficeMainBinding bind(View view) {
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.include2);
        if (viewFindChildViewById != null) {
            return new ActivityBranchOfficeMainBinding((ConstraintLayout) view, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.include2)));
    }
}
