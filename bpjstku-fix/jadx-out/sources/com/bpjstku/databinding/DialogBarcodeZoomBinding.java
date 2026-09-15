package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogBarcodeZoomBinding implements ViewBinding {
    public final MaterialButton btnDownload;
    public final ImageView ivClose;
    public final PhotoView photoView;
    private final ConstraintLayout rootView;

    private DialogBarcodeZoomBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, PhotoView photoView) {
        this.rootView = constraintLayout;
        this.btnDownload = materialButton;
        this.ivClose = imageView;
        this.photoView = photoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBarcodeZoomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogBarcodeZoomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_barcode_zoom, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DialogBarcodeZoomBinding bind(View view) {
        int i = R.id.btnDownload;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDownload);
        if (materialButton != null) {
            i = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
            if (imageView != null) {
                i = R.id.photoView;
                PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, R.id.photoView);
                if (photoView != null) {
                    return new DialogBarcodeZoomBinding((ConstraintLayout) view, materialButton, imageView, photoView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
