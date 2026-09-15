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
public final class ItemVocationTrainingChildBinding implements ViewBinding {
    public final ImageView imgArrowRight;
    private final ConstraintLayout rootView;
    public final TextView tvTrainingInformation;
    public final TextView tvTrainingName;

    private ItemVocationTrainingChildBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.imgArrowRight = imageView;
        this.tvTrainingInformation = textView;
        this.tvTrainingName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemVocationTrainingChildBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVocationTrainingChildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_vocation_training_child, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVocationTrainingChildBinding bind(View view) {
        int i = R.id.imgArrowRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowRight);
        if (imageView != null) {
            i = R.id.tvTrainingInformation;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingInformation);
            if (textView != null) {
                i = R.id.tvTrainingName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingName);
                if (textView2 != null) {
                    return new ItemVocationTrainingChildBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
