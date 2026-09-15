package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityFaqSyariahServiceBinding implements ViewBinding {
    public final LayoutToolbarBinding layoutToolbar;
    private final LinearLayout rootView;
    public final RecyclerView rvListFaq;
    public final TextView tvTitleFaq;

    private ActivityFaqSyariahServiceBinding(LinearLayout linearLayout, LayoutToolbarBinding layoutToolbarBinding, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.layoutToolbar = layoutToolbarBinding;
        this.rvListFaq = recyclerView;
        this.tvTitleFaq = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityFaqSyariahServiceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFaqSyariahServiceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_faq_syariah_service, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityFaqSyariahServiceBinding bind(View view) {
        int i = R.id.layout_toolbar;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
        if (viewFindChildViewById != null) {
            LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
            int i2 = R.id.rvListFaq;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListFaq);
            if (recyclerView != null) {
                i2 = R.id.tvTitleFaq;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleFaq);
                if (textView != null) {
                    return new ActivityFaqSyariahServiceBinding((LinearLayout) view, layoutToolbarBindingBind, recyclerView, textView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
