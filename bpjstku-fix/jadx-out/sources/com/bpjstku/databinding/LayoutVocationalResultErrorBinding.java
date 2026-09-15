package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutVocationalResultErrorBinding implements ViewBinding {
    public final Button btnBack;
    public final ImageView imgVocationalEligibilityResult;
    private final ConstraintLayout rootView;
    public final TextView tvEligibilityResult;

    private LayoutVocationalResultErrorBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.btnBack = button;
        this.imgVocationalEligibilityResult = imageView;
        this.tvEligibilityResult = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutVocationalResultErrorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVocationalResultErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_vocational_result_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutVocationalResultErrorBinding bind(View view) {
        int i = R.id.btnBack;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (button != null) {
            i = R.id.imgVocationalEligibilityResult;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVocationalEligibilityResult);
            if (imageView != null) {
                i = R.id.tvEligibilityResult;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEligibilityResult);
                if (textView != null) {
                    return new LayoutVocationalResultErrorBinding((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
