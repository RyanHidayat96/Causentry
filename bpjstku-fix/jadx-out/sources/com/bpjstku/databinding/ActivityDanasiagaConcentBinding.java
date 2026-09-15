package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDanasiagaConcentBinding implements ViewBinding {
    public final MaterialButton activityDanasiagaAgree;
    public final TextView activityDanasiagaContent;
    public final TextView activityDanasiagaTitle;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;

    private ActivityDanasiagaConcentBinding(ScrollView scrollView, MaterialButton materialButton, TextView textView, TextView textView2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = scrollView;
        this.activityDanasiagaAgree = materialButton;
        this.activityDanasiagaContent = textView;
        this.activityDanasiagaTitle = textView2;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDanasiagaConcentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDanasiagaConcentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_danasiaga_concent, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDanasiagaConcentBinding bind(View view) {
        int i = R.id.activity_danasiaga_agree;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.activity_danasiaga_agree);
        if (materialButton != null) {
            i = R.id.activity_danasiaga_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.activity_danasiaga_content);
            if (textView != null) {
                i = R.id.activity_danasiaga_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.activity_danasiaga_title);
                if (textView2 != null) {
                    i = R.id.imgBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (imageView != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            return new ActivityDanasiagaConcentBinding((ScrollView) view, materialButton, textView, textView2, imageView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
