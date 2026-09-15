package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutBottomsheetBranchOfficeBinding implements ViewBinding {
    public final RelativeLayout containerIconMarkerClosest;
    public final AppCompatImageView imgDirection;
    public final AppCompatImageView imgLineBottomSheet;
    public final AppCompatImageView imgLocationBranchOffice;
    public final AppCompatImageView imgMarkerClosest;
    public final RelativeLayout rlBottomSheetBranchOffice;
    private final RelativeLayout rootView;
    public final AppCompatTextView tvDescLocationBranchOFfice;
    public final AppCompatTextView tvFaxBranchOFfice;
    public final AppCompatTextView tvNameLocationBranchOFfice;
    public final AppCompatTextView tvTelpBranchOFfice;

    private LayoutBottomsheetBranchOfficeBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, RelativeLayout relativeLayout3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = relativeLayout;
        this.containerIconMarkerClosest = relativeLayout2;
        this.imgDirection = appCompatImageView;
        this.imgLineBottomSheet = appCompatImageView2;
        this.imgLocationBranchOffice = appCompatImageView3;
        this.imgMarkerClosest = appCompatImageView4;
        this.rlBottomSheetBranchOffice = relativeLayout3;
        this.tvDescLocationBranchOFfice = appCompatTextView;
        this.tvFaxBranchOFfice = appCompatTextView2;
        this.tvNameLocationBranchOFfice = appCompatTextView3;
        this.tvTelpBranchOFfice = appCompatTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBottomsheetBranchOfficeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBottomsheetBranchOfficeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottomsheet_branch_office, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutBottomsheetBranchOfficeBinding bind(View view) {
        int i = R.id.containerIconMarkerClosest;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.containerIconMarkerClosest);
        if (relativeLayout != null) {
            i = R.id.imgDirection;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgDirection);
            if (appCompatImageView != null) {
                i = R.id.imgLineBottomSheet;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
                if (appCompatImageView2 != null) {
                    i = R.id.imgLocationBranchOffice;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLocationBranchOffice);
                    if (appCompatImageView3 != null) {
                        i = R.id.imgMarkerClosest;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgMarkerClosest);
                        if (appCompatImageView4 != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                            i = R.id.tvDescLocationBranchOFfice;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDescLocationBranchOFfice);
                            if (appCompatTextView != null) {
                                i = R.id.tvFaxBranchOFfice;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvFaxBranchOFfice);
                                if (appCompatTextView2 != null) {
                                    i = R.id.tvNameLocationBranchOFfice;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNameLocationBranchOFfice);
                                    if (appCompatTextView3 != null) {
                                        i = R.id.tvTelpBranchOFfice;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTelpBranchOFfice);
                                        if (appCompatTextView4 != null) {
                                            return new LayoutBottomsheetBranchOfficeBinding(relativeLayout2, relativeLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, relativeLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
