package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemVocationalTrainingFieldBinding implements ViewBinding {
    public final ImageView imgSelected;
    private final ConstraintLayout rootView;
    public final TextView tvTrainingField;

    private ItemVocationalTrainingFieldBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgSelected = imageView;
        this.tvTrainingField = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemVocationalTrainingFieldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVocationalTrainingFieldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_vocational_training_field, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVocationalTrainingFieldBinding bind(View view) {
        int i = R.id.imgSelected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelected);
        if (imageView != null) {
            i = R.id.tvTrainingField;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingField);
            if (textView != null) {
                return new ItemVocationalTrainingFieldBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
