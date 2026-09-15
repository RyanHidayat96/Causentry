package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemEwalletBinding implements ViewBinding {
    public final ImageView itemEwalletAction;
    public final Barrier itemEwalletBarrier;
    public final MaterialButton itemEwalletConnect;
    public final ImageView itemEwalletLogo;
    public final TextView itemEwalletPrice;
    public final TextView itemEwalletStatus;
    public final MaterialCardView itemEwalletStatusLayout;
    public final TextView itemEwalletTitle;
    private final MaterialCardView rootView;

    private ItemEwalletBinding(MaterialCardView materialCardView, ImageView imageView, Barrier barrier, MaterialButton materialButton, ImageView imageView2, TextView textView, TextView textView2, MaterialCardView materialCardView2, TextView textView3) {
        this.rootView = materialCardView;
        this.itemEwalletAction = imageView;
        this.itemEwalletBarrier = barrier;
        this.itemEwalletConnect = materialButton;
        this.itemEwalletLogo = imageView2;
        this.itemEwalletPrice = textView;
        this.itemEwalletStatus = textView2;
        this.itemEwalletStatusLayout = materialCardView2;
        this.itemEwalletTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemEwalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemEwalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_ewallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemEwalletBinding bind(View view) {
        int i = R.id.item_ewallet_action;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.item_ewallet_action);
        if (imageView != null) {
            i = R.id.item_ewallet_barrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.item_ewallet_barrier);
            if (barrier != null) {
                i = R.id.item_ewallet_connect;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.item_ewallet_connect);
                if (materialButton != null) {
                    i = R.id.item_ewallet_logo;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.item_ewallet_logo);
                    if (imageView2 != null) {
                        i = R.id.item_ewallet_price;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_ewallet_price);
                        if (textView != null) {
                            i = R.id.item_ewallet_status;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_ewallet_status);
                            if (textView2 != null) {
                                i = R.id.item_ewallet_status_layout;
                                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.item_ewallet_status_layout);
                                if (materialCardView != null) {
                                    i = R.id.item_ewallet_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.item_ewallet_title);
                                    if (textView3 != null) {
                                        return new ItemEwalletBinding((MaterialCardView) view, imageView, barrier, materialButton, imageView2, textView, textView2, materialCardView, textView3);
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
