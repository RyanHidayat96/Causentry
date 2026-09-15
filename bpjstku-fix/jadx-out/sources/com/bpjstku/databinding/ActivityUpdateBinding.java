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
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityUpdateBinding implements ViewBinding {
    public final MaterialButton btnSkipUpdate;
    public final MaterialButton btnUpdateApplication;
    public final ImageView imgForceUpdate;
    private final ConstraintLayout rootView;
    public final TextView tvForceUpdateContent;
    public final TextView tvForceUpdateTitle;

    private ActivityUpdateBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnSkipUpdate = materialButton;
        this.btnUpdateApplication = materialButton2;
        this.imgForceUpdate = imageView;
        this.tvForceUpdateContent = textView;
        this.tvForceUpdateTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityUpdateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_update, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityUpdateBinding bind(View view) {
        int i = R.id.btnSkipUpdate;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSkipUpdate);
        if (materialButton != null) {
            i = R.id.btnUpdateApplication;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnUpdateApplication);
            if (materialButton2 != null) {
                i = R.id.imgForceUpdate;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgForceUpdate);
                if (imageView != null) {
                    i = R.id.tvForceUpdateContent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvForceUpdateContent);
                    if (textView != null) {
                        i = R.id.tvForceUpdateTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvForceUpdateTitle);
                        if (textView2 != null) {
                            return new ActivityUpdateBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
