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
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemDanasiagaBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final View itemDanasiagaBottomdiv;
    public final TextView itemDanasiagaBunga;
    public final TextView itemDanasiagaBungaTitle;
    public final TextView itemDanasiagaCompany;
    public final TextView itemDanasiagaDescription;
    public final ImageView itemDanasiagaLogo;
    public final TextView itemDanasiagaProses;
    public final TextView itemDanasiagaProsesTitle;
    public final TextView itemDanasiagaTenor;
    public final TextView itemDanasiagaTenorTitle;
    public final TextView itemDanasiagaTitle;
    private final MaterialCardView rootView;

    private ItemDanasiagaBinding(MaterialCardView materialCardView, ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = materialCardView;
        this.container = constraintLayout;
        this.itemDanasiagaBottomdiv = view;
        this.itemDanasiagaBunga = textView;
        this.itemDanasiagaBungaTitle = textView2;
        this.itemDanasiagaCompany = textView3;
        this.itemDanasiagaDescription = textView4;
        this.itemDanasiagaLogo = imageView;
        this.itemDanasiagaProses = textView5;
        this.itemDanasiagaProsesTitle = textView6;
        this.itemDanasiagaTenor = textView7;
        this.itemDanasiagaTenorTitle = textView8;
        this.itemDanasiagaTitle = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemDanasiagaBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDanasiagaBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_danasiaga, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemDanasiagaBinding bind(View view) {
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.container);
        if (constraintLayout != null) {
            i = R.id.item_danasiaga_bottomdiv;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.item_danasiaga_bottomdiv);
            if (viewFindChildViewById != null) {
                i = R.id.item_danasiaga_bunga;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_bunga);
                if (textView != null) {
                    i = R.id.item_danasiaga_bunga_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_bunga_title);
                    if (textView2 != null) {
                        i = R.id.item_danasiaga_company;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_company);
                        if (textView3 != null) {
                            i = R.id.item_danasiaga_description;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_description);
                            if (textView4 != null) {
                                i = R.id.item_danasiaga_logo;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_logo);
                                if (imageView != null) {
                                    i = R.id.item_danasiaga_proses;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_proses);
                                    if (textView5 != null) {
                                        i = R.id.item_danasiaga_proses_title;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_proses_title);
                                        if (textView6 != null) {
                                            i = R.id.item_danasiaga_tenor;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_tenor);
                                            if (textView7 != null) {
                                                i = R.id.item_danasiaga_tenor_title;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_tenor_title);
                                                if (textView8 != null) {
                                                    i = R.id.item_danasiaga_title;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.item_danasiaga_title);
                                                    if (textView9 != null) {
                                                        return new ItemDanasiagaBinding((MaterialCardView) view, constraintLayout, viewFindChildViewById, textView, textView2, textView3, textView4, imageView, textView5, textView6, textView7, textView8, textView9);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
