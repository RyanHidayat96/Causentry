package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import org.sufficientlysecure.htmltextview.HtmlTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDetailNewsBinding implements ViewBinding {
    public final MaterialButton btnShareNews;
    public final MaterialCardView cvNewsImage;
    public final ImageView imgBackground;
    public final ImageView imgNews;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final NestedScrollView rootView;
    public final RecyclerView rvOtherNews;
    public final HtmlTextView tvNewsContent;
    public final TextView tvNewsDate;
    public final TextView tvNewsTitle;
    public final TextView tvOtherNews;

    private ActivityDetailNewsBinding(NestedScrollView nestedScrollView, MaterialButton materialButton, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, HtmlTextView htmlTextView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = nestedScrollView;
        this.btnShareNews = materialButton;
        this.cvNewsImage = materialCardView;
        this.imgBackground = imageView;
        this.imgNews = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvOtherNews = recyclerView;
        this.tvNewsContent = htmlTextView;
        this.tvNewsDate = textView;
        this.tvNewsTitle = textView2;
        this.tvOtherNews = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDetailNewsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDetailNewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_detail_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDetailNewsBinding bind(View view) {
        int i = R.id.btnShareNews;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnShareNews);
        if (materialButton != null) {
            i = R.id.cvNewsImage;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvNewsImage);
            if (materialCardView != null) {
                i = R.id.imgBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                if (imageView != null) {
                    i = R.id.imgNews;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNews);
                    if (imageView2 != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.rvOtherNews;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvOtherNews);
                            if (recyclerView != null) {
                                i = R.id.tvNewsContent;
                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(view, R.id.tvNewsContent);
                                if (htmlTextView != null) {
                                    i = R.id.tvNewsDate;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsDate);
                                    if (textView != null) {
                                        i = R.id.tvNewsTitle;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNewsTitle);
                                        if (textView2 != null) {
                                            i = R.id.tvOtherNews;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherNews);
                                            if (textView3 != null) {
                                                return new ActivityDetailNewsBinding((NestedScrollView) view, materialButton, materialCardView, imageView, imageView2, layoutToolbarCenterBindingBind, recyclerView, htmlTextView, textView, textView2, textView3);
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
