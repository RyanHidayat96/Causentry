package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutQueueingFeatureButtonBinding implements ViewBinding {
    public final CardView cardQueueingFeature;
    public final ImageView ivQueueingIcon;
    private final CardView rootView;
    public final TextView tvQueueingDetail;
    public final TextView tvQueueingTitle;

    private LayoutQueueingFeatureButtonBinding(CardView cardView, CardView cardView2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.cardQueueingFeature = cardView2;
        this.ivQueueingIcon = imageView;
        this.tvQueueingDetail = textView;
        this.tvQueueingTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static LayoutQueueingFeatureButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutQueueingFeatureButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_queueing_feature_button, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutQueueingFeatureButtonBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.ivQueueingIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivQueueingIcon);
        if (imageView != null) {
            i = R.id.tvQueueingDetail;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvQueueingDetail);
            if (textView != null) {
                i = R.id.tvQueueingTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQueueingTitle);
                if (textView2 != null) {
                    return new LayoutQueueingFeatureButtonBinding(cardView, cardView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
