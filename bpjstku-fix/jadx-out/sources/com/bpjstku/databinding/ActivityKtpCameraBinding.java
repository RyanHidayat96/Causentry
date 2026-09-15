package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityKtpCameraBinding implements ViewBinding {
    public final ImageButton btnCapture;
    public final ImageButton btnClose;
    public final MaterialButton btnRetake;
    public final MaterialButton btnUsePhoto;
    public final TextureView cameraPreview;
    public final ImageView imgPreview;
    public final View ktpFrame;
    public final View overlayBottom;
    public final View overlayLeft;
    public final View overlayRight;
    public final View overlayTop;
    private final ConstraintLayout rootView;
    public final TextView tvInstruction;
    public final TextView tvTitle;

    private ActivityKtpCameraBinding(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, MaterialButton materialButton, MaterialButton materialButton2, TextureView textureView, ImageView imageView, View view, View view2, View view3, View view4, View view5, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnCapture = imageButton;
        this.btnClose = imageButton2;
        this.btnRetake = materialButton;
        this.btnUsePhoto = materialButton2;
        this.cameraPreview = textureView;
        this.imgPreview = imageView;
        this.ktpFrame = view;
        this.overlayBottom = view2;
        this.overlayLeft = view3;
        this.overlayRight = view4;
        this.overlayTop = view5;
        this.tvInstruction = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityKtpCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityKtpCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ktp_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityKtpCameraBinding bind(View view) {
        int i = R.id.btnCapture;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btnCapture);
        if (imageButton != null) {
            i = R.id.btnClose;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.btnClose);
            if (imageButton2 != null) {
                i = R.id.btnRetake;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRetake);
                if (materialButton != null) {
                    i = R.id.btnUsePhoto;
                    MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnUsePhoto);
                    if (materialButton2 != null) {
                        i = R.id.cameraPreview;
                        TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, R.id.cameraPreview);
                        if (textureView != null) {
                            i = R.id.imgPreview;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPreview);
                            if (imageView != null) {
                                i = R.id.ktpFrame;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.ktpFrame);
                                if (viewFindChildViewById != null) {
                                    i = R.id.overlayBottom;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.overlayBottom);
                                    if (viewFindChildViewById2 != null) {
                                        i = R.id.overlayLeft;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.overlayLeft);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.overlayRight;
                                            View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.overlayRight);
                                            if (viewFindChildViewById4 != null) {
                                                i = R.id.overlayTop;
                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.overlayTop);
                                                if (viewFindChildViewById5 != null) {
                                                    i = R.id.tvInstruction;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInstruction);
                                                    if (textView != null) {
                                                        i = R.id.tvTitle;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                        if (textView2 != null) {
                                                            return new ActivityKtpCameraBinding((ConstraintLayout) view, imageButton, imageButton2, materialButton, materialButton2, textureView, imageView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, textView, textView2);
                                                        }
                                                    }
                                                }
                                            }
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
