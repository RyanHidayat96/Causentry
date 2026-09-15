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
public final class ItemKpjListBinding implements ViewBinding {
    public final ImageView imgCard;
    public final ImageView imgChecklist;
    private final ConstraintLayout rootView;
    public final TextView tvKpjNumber;

    private ItemKpjListBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.imgCard = imageView;
        this.imgChecklist = imageView2;
        this.tvKpjNumber = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemKpjListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemKpjListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_kpj_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemKpjListBinding bind(View view) {
        int i = R.id.imgCard;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCard);
        if (imageView != null) {
            i = R.id.imgChecklist;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgChecklist);
            if (imageView2 != null) {
                i = R.id.tvKpjNumber;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjNumber);
                if (textView != null) {
                    return new ItemKpjListBinding((ConstraintLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
