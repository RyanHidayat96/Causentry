package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemCheckboxProgramBinding implements ViewBinding {
    public final AppCompatImageView imgProgram;
    public final ImageView rbProgramJHT;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvProgramTitle;

    private ItemCheckboxProgramBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.imgProgram = appCompatImageView;
        this.rbProgramJHT = imageView;
        this.tvProgramTitle = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemCheckboxProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCheckboxProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_checkbox_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemCheckboxProgramBinding bind(View view) {
        int i = R.id.imgProgram;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgram);
        if (appCompatImageView != null) {
            i = R.id.rbProgramJHT;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.rbProgramJHT);
            if (imageView != null) {
                i = R.id.tvProgramTitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvProgramTitle);
                if (appCompatTextView != null) {
                    return new ItemCheckboxProgramBinding((ConstraintLayout) view, appCompatImageView, imageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
