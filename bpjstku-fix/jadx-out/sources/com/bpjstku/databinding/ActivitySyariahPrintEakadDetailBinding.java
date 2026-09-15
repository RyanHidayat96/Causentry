package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySyariahPrintEakadDetailBinding implements ViewBinding {
    public final MaterialButton btnSaveEakad;
    public final PhotoView idPdfView;
    public final LayoutToolbarBinding layoutToolbar;
    private final ConstraintLayout rootView;

    private ActivitySyariahPrintEakadDetailBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, PhotoView photoView, LayoutToolbarBinding layoutToolbarBinding) {
        this.rootView = constraintLayout;
        this.btnSaveEakad = materialButton;
        this.idPdfView = photoView;
        this.layoutToolbar = layoutToolbarBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySyariahPrintEakadDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySyariahPrintEakadDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_syariah_print_eakad_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySyariahPrintEakadDetailBinding bind(View view) {
        int i = R.id.btnSaveEakad;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSaveEakad);
        if (materialButton != null) {
            i = R.id.idPdfView;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, R.id.idPdfView);
            if (photoView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    return new ActivitySyariahPrintEakadDetailBinding((ConstraintLayout) view, materialButton, photoView, LayoutToolbarBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
