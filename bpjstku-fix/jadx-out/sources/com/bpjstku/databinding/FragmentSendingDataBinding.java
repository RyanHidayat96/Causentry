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

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSendingDataBinding implements ViewBinding {
    public final ImageView imgSuccess;
    private final FrameLayout rootView;
    public final TextView tvInfoMessage;
    public final TextView tvResultTitle;

    private FragmentSendingDataBinding(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.imgSuccess = imageView;
        this.tvInfoMessage = textView;
        this.tvResultTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSendingDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSendingDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sending_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSendingDataBinding bind(View view) {
        int i = R.id.imgSuccess;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
        if (imageView != null) {
            i = R.id.tvInfoMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoMessage);
            if (textView != null) {
                i = R.id.tvResultTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultTitle);
                if (textView2 != null) {
                    return new FragmentSendingDataBinding((FrameLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
