package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ListNewsBinding implements ViewBinding {
    public final CardView cvNews;
    public final ImageView imgIconBerita;
    private final ConstraintLayout rootView;
    public final TextView tvBeritaLain;
    public final TextView tvNewsDate;

    private ListNewsBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cvNews = cardView;
        this.imgIconBerita = imageView;
        this.tvBeritaLain = textView;
        this.tvNewsDate = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ListNewsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ListNewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ListNewsBinding bind(View view) {
        int i = R.id.cvNews;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvNews);
        if (cardView != null) {
            i = R.id.imgIconBerita;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIconBerita);
            if (imageView != null) {
                i = R.id.tvBeritaLain;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeritaLain);
                if (textView != null) {
                    i = R.id.tvNewsDate;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsDate);
                    if (textView2 != null) {
                        return new ListNewsBinding((ConstraintLayout) view, cardView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
