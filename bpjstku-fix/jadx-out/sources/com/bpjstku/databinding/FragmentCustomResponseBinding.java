package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentCustomResponseBinding implements ViewBinding {
    public final ImageView imgResponse;
    private final FrameLayout rootView;
    public final TextView tvInfoMessage;

    private FragmentCustomResponseBinding(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.rootView = frameLayout;
        this.imgResponse = imageView;
        this.tvInfoMessage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCustomResponseBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCustomResponseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_custom_response, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCustomResponseBinding bind(View view) {
        int i = R.id.imgResponse;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgResponse);
        if (imageView != null) {
            i = R.id.tvInfoMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoMessage);
            if (textView != null) {
                return new FragmentCustomResponseBinding((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
