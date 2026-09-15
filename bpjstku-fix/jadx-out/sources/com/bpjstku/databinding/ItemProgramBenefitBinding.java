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

/* JADX INFO: loaded from: classes3.dex */
public final class ItemProgramBenefitBinding implements ViewBinding {
    public final ImageView iconInfoProgram;
    private final ConstraintLayout rootView;
    public final TextView tvProgramDescription;
    public final TextView tvProgramTitle;

    private ItemProgramBenefitBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.iconInfoProgram = imageView;
        this.tvProgramDescription = textView;
        this.tvProgramTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemProgramBenefitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemProgramBenefitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_program_benefit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemProgramBenefitBinding bind(View view) {
        int i = R.id.iconInfoProgram;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iconInfoProgram);
        if (imageView != null) {
            i = R.id.tvProgramDescription;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramDescription);
            if (textView != null) {
                i = R.id.tvProgramTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramTitle);
                if (textView2 != null) {
                    return new ItemProgramBenefitBinding((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
