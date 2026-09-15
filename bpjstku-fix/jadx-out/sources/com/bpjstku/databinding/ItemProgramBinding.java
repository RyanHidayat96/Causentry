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
public final class ItemProgramBinding implements ViewBinding {
    public final ImageView imgProgram;
    public final ImageView imgStatusCheck;
    private final CardView rootView;
    public final TextView tvProgramTitle;
    public final TextView tvProgramUserStatus;

    private ItemProgramBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.imgProgram = imageView;
        this.imgStatusCheck = imageView2;
        this.tvProgramTitle = textView;
        this.tvProgramUserStatus = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemProgramBinding bind(View view) {
        int i = R.id.imgProgram;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgram);
        if (imageView != null) {
            i = R.id.imgStatusCheck;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgStatusCheck);
            if (imageView2 != null) {
                i = R.id.tvProgramTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramTitle);
                if (textView != null) {
                    i = R.id.tvProgramUserStatus;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramUserStatus);
                    if (textView2 != null) {
                        return new ItemProgramBinding((CardView) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
