package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemScholarProveFileBinding implements ViewBinding {
    public final Barrier fragScholarProveBarrier;
    public final ImageButton itemScholarProveDelete;
    public final ImageButton itemScholarProveEdit;
    public final TextView itemScholarProveFile;
    public final ImageView itemScholarProveIcon;
    public final ImageView itemScholarProveImage;
    public final TextView itemScholarProveTitle;
    private final MaterialCardView rootView;

    private ItemScholarProveFileBinding(MaterialCardView materialCardView, Barrier barrier, ImageButton imageButton, ImageButton imageButton2, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        this.rootView = materialCardView;
        this.fragScholarProveBarrier = barrier;
        this.itemScholarProveDelete = imageButton;
        this.itemScholarProveEdit = imageButton2;
        this.itemScholarProveFile = textView;
        this.itemScholarProveIcon = imageView;
        this.itemScholarProveImage = imageView2;
        this.itemScholarProveTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemScholarProveFileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScholarProveFileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_scholar_prove_file, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemScholarProveFileBinding bind(View view) {
        int i = R.id.frag_scholar_prove_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.frag_scholar_prove_barrier);
        if (barrier != null) {
            i = R.id.item_scholar_prove_delete;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_delete);
            if (imageButton != null) {
                i = R.id.item_scholar_prove_edit;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_edit);
                if (imageButton2 != null) {
                    i = R.id.item_scholar_prove_file;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_file);
                    if (textView != null) {
                        i = R.id.item_scholar_prove_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_icon);
                        if (imageView != null) {
                            i = R.id.item_scholar_prove_image;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_image);
                            if (imageView2 != null) {
                                i = R.id.item_scholar_prove_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_prove_title);
                                if (textView2 != null) {
                                    return new ItemScholarProveFileBinding((MaterialCardView) view, barrier, imageButton, imageButton2, textView, imageView, imageView2, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
