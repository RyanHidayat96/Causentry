package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBranchOfficeBinding implements ViewBinding {
    public final FrameLayout flMap;
    public final AppCompatImageView ivExpandBottomSheetDirectory;
    public final LayoutBottomsheetBranchOfficeBinding layoutBottomsheetBranchOffice;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final RelativeLayout rlBottomSheetBranchOfficeDirectory;
    private final CoordinatorLayout rootView;

    private ActivityBranchOfficeBinding(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, AppCompatImageView appCompatImageView, LayoutBottomsheetBranchOfficeBinding layoutBottomsheetBranchOfficeBinding, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RelativeLayout relativeLayout) {
        this.rootView = coordinatorLayout;
        this.flMap = frameLayout;
        this.ivExpandBottomSheetDirectory = appCompatImageView;
        this.layoutBottomsheetBranchOffice = layoutBottomsheetBranchOfficeBinding;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rlBottomSheetBranchOfficeDirectory = relativeLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBranchOfficeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBranchOfficeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_branch_office, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityBranchOfficeBinding bind(View view) {
        int i = R.id.flMap;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flMap);
        if (frameLayout != null) {
            i = R.id.ivExpandBottomSheetDirectory;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivExpandBottomSheetDirectory);
            if (appCompatImageView != null) {
                i = R.id.layout_bottomsheet_branch_office;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_bottomsheet_branch_office);
                if (viewFindChildViewById != null) {
                    LayoutBottomsheetBranchOfficeBinding layoutBottomsheetBranchOfficeBindingBind = LayoutBottomsheetBranchOfficeBinding.bind(viewFindChildViewById);
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById2 != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById2);
                        i = R.id.rlBottomSheetBranchOfficeDirectory;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlBottomSheetBranchOfficeDirectory);
                        if (relativeLayout != null) {
                            return new ActivityBranchOfficeBinding((CoordinatorLayout) view, frameLayout, appCompatImageView, layoutBottomsheetBranchOfficeBindingBind, layoutToolbarCenterBindingBind, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
