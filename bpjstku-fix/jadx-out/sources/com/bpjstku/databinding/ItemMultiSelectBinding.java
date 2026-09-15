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

/* JADX INFO: loaded from: classes6.dex */
public final class ItemMultiSelectBinding implements ViewBinding {
    public final LinearLayout itemSelect;
    public final ImageView ivCheckIcon;
    private final LinearLayout rootView;
    public final TextView tvOption;

    private ItemMultiSelectBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.itemSelect = linearLayout2;
        this.ivCheckIcon = imageView;
        this.tvOption = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemMultiSelectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemMultiSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_multi_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemMultiSelectBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.ivCheckIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivCheckIcon);
        if (imageView != null) {
            i = R.id.tvOption;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvOption);
            if (textView != null) {
                return new ItemMultiSelectBinding(linearLayout, linearLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
