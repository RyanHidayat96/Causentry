package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIdCardUploadDialogBinding implements ViewBinding {
    public final MaterialButton btnTakePhoto;
    public final MaterialButton btnTakePhotoFromGallery;
    public final ImageView imgIdCard;
    public final ImageView imgPointDataCheckingInstruction;
    public final ImageView imgPointUploadIdCardInstruction;
    private final FrameLayout rootView;
    public final TextView tvDataCheckingInstruction;
    public final TextView tvIdCardUpload;
    public final TextView tvUploadIdCardInstruction;

    private FragmentIdCardUploadDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.btnTakePhoto = materialButton;
        this.btnTakePhotoFromGallery = materialButton2;
        this.imgIdCard = imageView;
        this.imgPointDataCheckingInstruction = imageView2;
        this.imgPointUploadIdCardInstruction = imageView3;
        this.tvDataCheckingInstruction = textView;
        this.tvIdCardUpload = textView2;
        this.tvUploadIdCardInstruction = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIdCardUploadDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIdCardUploadDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_id_card_upload_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIdCardUploadDialogBinding bind(View view) {
        int i = R.id.btnTakePhoto;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnTakePhoto);
        if (materialButton != null) {
            i = R.id.btnTakePhotoFromGallery;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnTakePhotoFromGallery);
            if (materialButton2 != null) {
                i = R.id.imgIdCard;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCard);
                if (imageView != null) {
                    i = R.id.imgPointDataCheckingInstruction;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPointDataCheckingInstruction);
                    if (imageView2 != null) {
                        i = R.id.imgPointUploadIdCardInstruction;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPointUploadIdCardInstruction);
                        if (imageView3 != null) {
                            i = R.id.tvDataCheckingInstruction;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDataCheckingInstruction);
                            if (textView != null) {
                                i = R.id.tvIdCardUpload;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUpload);
                                if (textView2 != null) {
                                    i = R.id.tvUploadIdCardInstruction;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadIdCardInstruction);
                                    if (textView3 != null) {
                                        return new FragmentIdCardUploadDialogBinding((FrameLayout) view, materialButton, materialButton2, imageView, imageView2, imageView3, textView, textView2, textView3);
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
