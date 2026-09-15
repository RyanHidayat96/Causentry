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
import defpackage.getMappingAreaSize;
import defpackage.isMappingAreaCovered;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemPlkkBinding implements ViewBinding {
    public final ImageView imgSelected;
    private final MaterialCardView rootView;
    public final TextView tvPlkkName;

    private ItemPlkkBinding(MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        this.rootView = materialCardView;
        this.imgSelected = imageView;
        this.tvPlkkName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemPlkkBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPlkkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_plkk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemPlkkBinding bind(View view) {
        int i = R.id.imgSelected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelected);
        if (imageView != null) {
            i = R.id.tvPlkkName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvPlkkName);
            if (textView != null) {
                return new ItemPlkkBinding((MaterialCardView) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        isMappingAreaCovered.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = getMappingAreaSize.b[0];
    }
}
