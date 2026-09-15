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
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemInvestmentBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final ImageView ivInvest;
    private final MaterialCardView rootView;
    public final TextView tvCompany;
    public final TextView tvDescription;
    public final TextView tvTitle;

    private ItemInvestmentBinding(MaterialCardView materialCardView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = materialCardView;
        this.container = constraintLayout;
        this.ivInvest = imageView;
        this.tvCompany = textView;
        this.tvDescription = textView2;
        this.tvTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemInvestmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemInvestmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_investment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemInvestmentBinding bind(View view) {
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.container);
        if (constraintLayout != null) {
            i = R.id.iv_invest;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_invest);
            if (imageView != null) {
                i = R.id.tv_company;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_company);
                if (textView != null) {
                    i = R.id.tv_description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                    if (textView2 != null) {
                        i = R.id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView3 != null) {
                            return new ItemInvestmentBinding((MaterialCardView) view, constraintLayout, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
