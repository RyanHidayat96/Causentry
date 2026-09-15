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
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentOldDaySecurityTuitionBottomSheetBinding implements ViewBinding {
    public final LinearLayout bottomSheetContainer;
    public final MaterialButton btnBack;
    public final View imgLineBottomSheet;
    public final MultiStateView msvGeneralList;
    private final LinearLayout rootView;
    public final RecyclerView rvListTuition;
    public final AppCompatTextView tvSumTuition;
    public final AppCompatTextView tvTitleBlthTuition;
    public final AppCompatTextView tvTitleBottomSheet;
    public final AppCompatTextView tvTitleSumTuition;
    public final AppCompatTextView tvTitleTuitionValue;

    private FragmentOldDaySecurityTuitionBottomSheetBinding(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialButton materialButton, View view, MultiStateView multiStateView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.rootView = linearLayout;
        this.bottomSheetContainer = linearLayout2;
        this.btnBack = materialButton;
        this.imgLineBottomSheet = view;
        this.msvGeneralList = multiStateView;
        this.rvListTuition = recyclerView;
        this.tvSumTuition = appCompatTextView;
        this.tvTitleBlthTuition = appCompatTextView2;
        this.tvTitleBottomSheet = appCompatTextView3;
        this.tvTitleSumTuition = appCompatTextView4;
        this.tvTitleTuitionValue = appCompatTextView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOldDaySecurityTuitionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOldDaySecurityTuitionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_old_day_security_tuition_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOldDaySecurityTuitionBottomSheetBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.imgLineBottomSheet;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
            if (viewFindChildViewById != null) {
                i = R.id.msvGeneralList;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvGeneralList);
                if (multiStateView != null) {
                    i = R.id.rvListTuition;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListTuition);
                    if (recyclerView != null) {
                        i = R.id.tvSumTuition;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvSumTuition);
                        if (appCompatTextView != null) {
                            i = R.id.tvTitleBlthTuition;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBlthTuition);
                            if (appCompatTextView2 != null) {
                                i = R.id.tvTitleBottomSheet;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                                if (appCompatTextView3 != null) {
                                    i = R.id.tvTitleSumTuition;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleSumTuition);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.tvTitleTuitionValue;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleTuitionValue);
                                        if (appCompatTextView5 != null) {
                                            return new FragmentOldDaySecurityTuitionBottomSheetBinding(linearLayout, linearLayout, materialButton, viewFindChildViewById, multiStateView, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
