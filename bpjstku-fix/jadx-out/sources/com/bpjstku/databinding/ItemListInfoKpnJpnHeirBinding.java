package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemListInfoKpnJpnHeirBinding implements ViewBinding {
    private final MaterialCardView rootView;
    public final TextView tvKpjNumber;
    public final TextView tvMembershipName;

    private ItemListInfoKpnJpnHeirBinding(MaterialCardView materialCardView, TextView textView, TextView textView2) {
        this.rootView = materialCardView;
        this.tvKpjNumber = textView;
        this.tvMembershipName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemListInfoKpnJpnHeirBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemListInfoKpnJpnHeirBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_info_kpn_jpn_heir, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemListInfoKpnJpnHeirBinding bind(View view) {
        int i = R.id.tvKpjNumber;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjNumber);
        if (textView != null) {
            i = R.id.tvMembershipName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipName);
            if (textView2 != null) {
                return new ItemListInfoKpnJpnHeirBinding((MaterialCardView) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
