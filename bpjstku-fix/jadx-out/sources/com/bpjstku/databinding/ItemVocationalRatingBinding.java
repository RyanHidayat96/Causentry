package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemVocationalRatingBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final AppCompatRatingBar rtbVocation;
    public final TextView tvRatingTitle;

    private ItemVocationalRatingBinding(LinearLayout linearLayout, AppCompatRatingBar appCompatRatingBar, TextView textView) {
        this.rootView = linearLayout;
        this.rtbVocation = appCompatRatingBar;
        this.tvRatingTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemVocationalRatingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVocationalRatingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_vocational_rating, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVocationalRatingBinding bind(View view) {
        int i = R.id.rtbVocation;
        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) ViewBindings.findChildViewById(view, R.id.rtbVocation);
        if (appCompatRatingBar != null) {
            i = R.id.tvRatingTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRatingTitle);
            if (textView != null) {
                return new ItemVocationalRatingBinding((LinearLayout) view, appCompatRatingBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
