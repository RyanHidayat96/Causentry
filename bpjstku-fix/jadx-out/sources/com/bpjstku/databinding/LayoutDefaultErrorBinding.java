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
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutDefaultErrorBinding implements ViewBinding {
    public final MaterialButton btnError;
    public final ConstraintLayout errorLayout;
    public final ImageView imgError;
    private final ConstraintLayout rootView;
    public final TextView tvMessage;
    public final TextView tvTitle;

    private LayoutDefaultErrorBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnError = materialButton;
        this.errorLayout = constraintLayout2;
        this.imgError = imageView;
        this.tvMessage = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutDefaultErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutDefaultErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_default_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutDefaultErrorBinding bind(View view) {
        int i = R.id.btnError;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnError);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.imgError;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgError);
            if (imageView != null) {
                i = R.id.tvMessage;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvMessage);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView2 != null) {
                        return new LayoutDefaultErrorBinding(constraintLayout, materialButton, constraintLayout, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
