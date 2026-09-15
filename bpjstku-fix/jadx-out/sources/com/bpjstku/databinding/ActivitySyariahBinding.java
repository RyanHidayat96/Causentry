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
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivitySyariahBinding implements ViewBinding {
    public final MaterialButton btnActivateSyariahService;
    public final MaterialButton btnViewFaqSyariahService;
    public final LayoutToolbarBinding layoutToolbar;
    private final LinearLayout rootView;
    public final RecyclerView rvListPrimaryFaq;
    public final TextView tvSyariahFaqTitle;
    public final TextView tvSyariahServiceDescription;
    public final TextView tvSyariahServiceInfo;
    public final TextView tvSyariahServiceTitle;

    private ActivitySyariahBinding(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, LayoutToolbarBinding layoutToolbarBinding, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.btnActivateSyariahService = materialButton;
        this.btnViewFaqSyariahService = materialButton2;
        this.layoutToolbar = layoutToolbarBinding;
        this.rvListPrimaryFaq = recyclerView;
        this.tvSyariahFaqTitle = textView;
        this.tvSyariahServiceDescription = textView2;
        this.tvSyariahServiceInfo = textView3;
        this.tvSyariahServiceTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySyariahBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySyariahBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_syariah, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivitySyariahBinding bind(View view) {
        int i = R.id.btnActivateSyariahService;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnActivateSyariahService);
        if (materialButton != null) {
            i = R.id.btnViewFaqSyariahService;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnViewFaqSyariahService);
            if (materialButton2 != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                    i = R.id.rvListPrimaryFaq;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListPrimaryFaq);
                    if (recyclerView != null) {
                        i = R.id.tvSyariahFaqTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvSyariahFaqTitle);
                        if (textView != null) {
                            i = R.id.tvSyariahServiceDescription;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSyariahServiceDescription);
                            if (textView2 != null) {
                                i = R.id.tvSyariahServiceInfo;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSyariahServiceInfo);
                                if (textView3 != null) {
                                    i = R.id.tvSyariahServiceTitle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSyariahServiceTitle);
                                    if (textView4 != null) {
                                        return new ActivitySyariahBinding((LinearLayout) view, materialButton, materialButton2, layoutToolbarBindingBind, recyclerView, textView, textView2, textView3, textView4);
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
