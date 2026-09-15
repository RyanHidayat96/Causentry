package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemPartnerBinding implements ViewBinding {
    public final CardView cvPartner;
    private final CardView rootView;
    public final AppCompatTextView tvLocationDescPartner;
    public final TextView tvLocationNamePartner;

    private ItemPartnerBinding(CardView cardView, CardView cardView2, AppCompatTextView appCompatTextView, TextView textView) {
        this.rootView = cardView;
        this.cvPartner = cardView2;
        this.tvLocationDescPartner = appCompatTextView;
        this.tvLocationNamePartner = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemPartnerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemPartnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_partner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemPartnerBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.tvLocationDescPartner;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvLocationDescPartner);
        if (appCompatTextView != null) {
            i = R.id.tvLocationNamePartner;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLocationNamePartner);
            if (textView != null) {
                return new ItemPartnerBinding(cardView, cardView, appCompatTextView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
