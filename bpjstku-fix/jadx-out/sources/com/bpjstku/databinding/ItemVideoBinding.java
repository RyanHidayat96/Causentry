package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemVideoBinding implements ViewBinding {
    public final MaterialButton btnDetailVideo;
    public final ImageView imgThumbnailVideo;
    public final LinearLayout layoutBottom;
    private final MaterialCardView rootView;
    public final TextView tvDate;
    public final TextView tvDescVideo;
    public final TextView tvTitleVideo;

    private ItemVideoBinding(MaterialCardView materialCardView, MaterialButton materialButton, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.btnDetailVideo = materialButton;
        this.imgThumbnailVideo = imageView;
        this.layoutBottom = linearLayout;
        this.tvDate = textView;
        this.tvDescVideo = textView2;
        this.tvTitleVideo = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemVideoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVideoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_video, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVideoBinding bind(View view) {
        int i = R.id.btnDetailVideo;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDetailVideo);
        if (materialButton != null) {
            i = R.id.imgThumbnailVideo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgThumbnailVideo);
            if (imageView != null) {
                i = R.id.layout_bottom;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_bottom);
                if (linearLayout != null) {
                    i = R.id.tvDate;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDate);
                    if (textView != null) {
                        i = R.id.tvDescVideo;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescVideo);
                        if (textView2 != null) {
                            i = R.id.tvTitleVideo;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleVideo);
                            if (textView3 != null) {
                                return new ItemVideoBinding((MaterialCardView) view, materialButton, imageView, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
