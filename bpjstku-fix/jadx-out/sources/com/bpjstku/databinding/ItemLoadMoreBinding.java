package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemLoadMoreBinding implements ViewBinding {
    public final ProgressBar pbLoadMore;
    private final RelativeLayout rootView;
    public final TextView tvLoadMoreError;

    private ItemLoadMoreBinding(RelativeLayout relativeLayout, ProgressBar progressBar, TextView textView) {
        this.rootView = relativeLayout;
        this.pbLoadMore = progressBar;
        this.tvLoadMoreError = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemLoadMoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemLoadMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_load_more, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemLoadMoreBinding bind(View view) {
        int i = R.id.pbLoadMore;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pbLoadMore);
        if (progressBar != null) {
            i = R.id.tvLoadMoreError;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLoadMoreError);
            if (textView != null) {
                return new ItemLoadMoreBinding((RelativeLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
