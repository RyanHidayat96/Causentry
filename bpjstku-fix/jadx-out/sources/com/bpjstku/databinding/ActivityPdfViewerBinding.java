package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityPdfViewerBinding implements ViewBinding {
    public final Button btnNext;
    public final Button btnPrevious;
    public final ImageView imageViewPdf;
    public final LinearLayout layoutControls;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final TextView textPageInfo;
    public final Toolbar toolbar;

    private ActivityPdfViewerBinding(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView, LinearLayout linearLayout, ProgressBar progressBar, ScrollView scrollView, TextView textView, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.btnNext = button;
        this.btnPrevious = button2;
        this.imageViewPdf = imageView;
        this.layoutControls = linearLayout;
        this.progressBar = progressBar;
        this.scrollView = scrollView;
        this.textPageInfo = textView;
        this.toolbar = toolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPdfViewerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPdfViewerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_pdf_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPdfViewerBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.btnPrevious;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnPrevious);
            if (button2 != null) {
                i = R.id.imageViewPdf;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageViewPdf);
                if (imageView != null) {
                    i = R.id.layoutControls;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutControls);
                    if (linearLayout != null) {
                        i = R.id.progressBar;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                        if (progressBar != null) {
                            i = R.id.scrollView;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                            if (scrollView != null) {
                                i = R.id.textPageInfo;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textPageInfo);
                                if (textView != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                    if (toolbar != null) {
                                        return new ActivityPdfViewerBinding((ConstraintLayout) view, button, button2, imageView, linearLayout, progressBar, scrollView, textView, toolbar);
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
