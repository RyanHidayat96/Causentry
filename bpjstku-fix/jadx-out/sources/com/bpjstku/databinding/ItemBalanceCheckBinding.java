package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemBalanceCheckBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView tvBalanceInformationTitle;
    public final TextView tvBalanceInformationValue;

    private ItemBalanceCheckBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.tvBalanceInformationTitle = textView;
        this.tvBalanceInformationValue = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemBalanceCheckBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemBalanceCheckBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_balance_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemBalanceCheckBinding bind(View view) {
        int i = R.id.tvBalanceInformationTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceInformationTitle);
        if (textView != null) {
            i = R.id.tvBalanceInformationValue;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBalanceInformationValue);
            if (textView2 != null) {
                return new ItemBalanceCheckBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
