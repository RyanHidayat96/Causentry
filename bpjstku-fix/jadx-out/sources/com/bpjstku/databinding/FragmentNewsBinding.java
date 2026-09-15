package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentNewsBinding implements ViewBinding {
    public final AppBarLayout appbarNews;
    public final CoordinatorLayout clNews;
    public final MaterialCardView cvLatestNews;
    public final ImageView imgNews;
    public final MultiStateView msvContent;
    private final MultiStateView rootView;
    public final RecyclerView rvOtherNews;
    public final TextView tvLatestNews;
    public final TextView tvNewsDate;
    public final TextView tvNewsTitle;
    public final TextView tvOtherNews;

    private FragmentNewsBinding(MultiStateView multiStateView, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, MaterialCardView materialCardView, ImageView imageView, MultiStateView multiStateView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = multiStateView;
        this.appbarNews = appBarLayout;
        this.clNews = coordinatorLayout;
        this.cvLatestNews = materialCardView;
        this.imgNews = imageView;
        this.msvContent = multiStateView2;
        this.rvOtherNews = recyclerView;
        this.tvLatestNews = textView;
        this.tvNewsDate = textView2;
        this.tvNewsTitle = textView3;
        this.tvOtherNews = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static FragmentNewsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNewsBinding bind(View view) {
        int i = R.id.appbarNews;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbarNews);
        if (appBarLayout != null) {
            i = R.id.clNews;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.clNews);
            if (coordinatorLayout != null) {
                i = R.id.cvLatestNews;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvLatestNews);
                if (materialCardView != null) {
                    i = R.id.imgNews;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNews);
                    if (imageView != null) {
                        MultiStateView multiStateView = (MultiStateView) view;
                        i = R.id.rvOtherNews;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvOtherNews);
                        if (recyclerView != null) {
                            i = R.id.tvLatestNews;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLatestNews);
                            if (textView != null) {
                                i = R.id.tvNewsDate;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsDate);
                                if (textView2 != null) {
                                    i = R.id.tvNewsTitle;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsTitle);
                                    if (textView3 != null) {
                                        i = R.id.tvOtherNews;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherNews);
                                        if (textView4 != null) {
                                            return new FragmentNewsBinding(multiStateView, appBarLayout, coordinatorLayout, materialCardView, imageView, multiStateView, recyclerView, textView, textView2, textView3, textView4);
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
