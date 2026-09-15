package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemWorkLocationBinding implements ViewBinding {
    public final ImageView imgSelected;
    private final MaterialCardView rootView;
    public final TextView tvWorkLocationCity;

    private ItemWorkLocationBinding(MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        this.rootView = materialCardView;
        this.imgSelected = imageView;
        this.tvWorkLocationCity = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemWorkLocationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemWorkLocationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_work_location, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemWorkLocationBinding bind(View view) {
        int i = R.id.imgSelected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelected);
        if (imageView != null) {
            i = R.id.tvWorkLocationCity;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkLocationCity);
            if (textView != null) {
                return new ItemWorkLocationBinding((MaterialCardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
