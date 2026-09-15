package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemScholarProveResultBinding implements ViewBinding {
    public final TextView itemScholarPsTitle;
    private final MaterialCardView rootView;

    private ItemScholarProveResultBinding(MaterialCardView materialCardView, TextView textView) {
        this.rootView = materialCardView;
        this.itemScholarPsTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemScholarProveResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScholarProveResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_scholar_prove_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemScholarProveResultBinding bind(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_ps_title);
        if (textView != null) {
            return new ItemScholarProveResultBinding((MaterialCardView) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.item_scholar_ps_title)));
    }
}
