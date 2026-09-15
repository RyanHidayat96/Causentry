package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentChangePhotoDialogBinding implements ViewBinding {
    public final MaterialButton btnCancel;
    public final ImageButton imgTakeFromGallery;
    public final ImageButton imgTakeFromPhoto;
    private final FrameLayout rootView;
    public final TextView tvChooseSourcePhoto;
    public final TextView tvGallery;
    public final TextView tvTakePhoto;

    private FragmentChangePhotoDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, ImageButton imageButton, ImageButton imageButton2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.btnCancel = materialButton;
        this.imgTakeFromGallery = imageButton;
        this.imgTakeFromPhoto = imageButton2;
        this.tvChooseSourcePhoto = textView;
        this.tvGallery = textView2;
        this.tvTakePhoto = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChangePhotoDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChangePhotoDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_change_photo_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChangePhotoDialogBinding bind(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.imgTakeFromGallery;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.imgTakeFromGallery);
            if (imageButton != null) {
                i = R.id.imgTakeFromPhoto;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.imgTakeFromPhoto);
                if (imageButton2 != null) {
                    i = R.id.tvChooseSourcePhoto;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseSourcePhoto);
                    if (textView != null) {
                        i = R.id.tvGallery;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGallery);
                        if (textView2 != null) {
                            i = R.id.tvTakePhoto;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTakePhoto);
                            if (textView3 != null) {
                                return new FragmentChangePhotoDialogBinding((FrameLayout) view, materialButton, imageButton, imageButton2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
