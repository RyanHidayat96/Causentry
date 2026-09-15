package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityImageDigitalCardBinding implements ViewBinding {
    public final MaterialButton btnSaveDigitalCard;
    public final PhotoView imgDigitalCardDetail;
    private final RelativeLayout rootView;

    private ActivityImageDigitalCardBinding(RelativeLayout relativeLayout, MaterialButton materialButton, PhotoView photoView) {
        this.rootView = relativeLayout;
        this.btnSaveDigitalCard = materialButton;
        this.imgDigitalCardDetail = photoView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityImageDigitalCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityImageDigitalCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_image_digital_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityImageDigitalCardBinding bind(View view) {
        int i = R.id.btnSaveDigitalCard;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSaveDigitalCard);
        if (materialButton != null) {
            i = R.id.imgDigitalCardDetail;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, R.id.imgDigitalCardDetail);
            if (photoView != null) {
                return new ActivityImageDigitalCardBinding((RelativeLayout) view, materialButton, photoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
