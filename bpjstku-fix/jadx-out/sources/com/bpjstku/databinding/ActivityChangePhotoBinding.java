package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityChangePhotoBinding implements ViewBinding {
    public final Button btnSaveChange;
    public final MaterialButton btnUploadAnotherPhoto;
    public final CircleImageView civProfilePhoto;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;

    private ActivityChangePhotoBinding(ConstraintLayout constraintLayout, Button button, MaterialButton materialButton, CircleImageView circleImageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = constraintLayout;
        this.btnSaveChange = button;
        this.btnUploadAnotherPhoto = materialButton;
        this.civProfilePhoto = circleImageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityChangePhotoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChangePhotoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityChangePhotoBinding bind(View view) {
        int i = R.id.btnSaveChange;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSaveChange);
        if (button != null) {
            i = R.id.btnUploadAnotherPhoto;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnUploadAnotherPhoto);
            if (materialButton != null) {
                i = R.id.civProfilePhoto;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfilePhoto);
                if (circleImageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        return new ActivityChangePhotoBinding((ConstraintLayout) view, button, materialButton, circleImageView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
