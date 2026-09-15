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

/* JADX INFO: loaded from: classes3.dex */
public final class ItemBpjsServiceBinding implements ViewBinding {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1916069432;
    public final ImageView imgService;
    private final ConstraintLayout rootView;
    public final TextView tvServiceName;

    private ItemBpjsServiceBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgService = imageView;
        this.tvServiceName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBpjsServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBpjsServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_bpjs_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBpjsServiceBinding bind(View view) {
        int i = R.id.imgService;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgService);
        if (imageView != null) {
            i = R.id.tvServiceName;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvServiceName);
            if (textView != null) {
                return new ItemBpjsServiceBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
