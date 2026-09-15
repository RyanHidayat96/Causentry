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

/* JADX INFO: loaded from: classes6.dex */
public final class ActivitySourcePodcastViewerBinding implements ViewBinding {
    public final ImageView idPdfView;
    public final PhotoView ivImage;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ConstraintLayout rootView;

    private ActivitySourcePodcastViewerBinding(ConstraintLayout constraintLayout, ImageView imageView, PhotoView photoView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = constraintLayout;
        this.idPdfView = imageView;
        this.ivImage = photoView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySourcePodcastViewerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySourcePodcastViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_source_podcast_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySourcePodcastViewerBinding bind(View view) {
        int i = R.id.idPdfView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.idPdfView);
        if (imageView != null) {
            i = R.id.ivImage;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, R.id.ivImage);
            if (photoView != null) {
                i = R.id.layout_toolbar_center;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    return new ActivitySourcePodcastViewerBinding((ConstraintLayout) view, imageView, photoView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
