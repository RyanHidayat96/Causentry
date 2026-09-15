package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemNewsBinding implements ViewBinding {
    public final ImageView imgNews;
    private final MaterialCardView rootView;
    public final TextView tvNewsDate;
    public final TextView tvNewsTitle;

    private ItemNewsBinding(MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.imgNews = imageView;
        this.tvNewsDate = textView;
        this.tvNewsTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemNewsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemNewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemNewsBinding bind(View view) {
        int i = R.id.imgNews;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNews);
        if (imageView != null) {
            i = R.id.tvNewsDate;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsDate);
            if (textView != null) {
                i = R.id.tvNewsTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsTitle);
                if (textView2 != null) {
                    return new ItemNewsBinding((MaterialCardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
