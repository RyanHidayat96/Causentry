package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemScholarPersonBinding implements ViewBinding {
    public final TextView itemScholarPersonCode;
    public final CircleImageView itemScholarPersonImg;
    public final TextView itemScholarPersonName;
    private final MaterialCardView rootView;

    private ItemScholarPersonBinding(MaterialCardView materialCardView, TextView textView, CircleImageView circleImageView, TextView textView2) {
        this.rootView = materialCardView;
        this.itemScholarPersonCode = textView;
        this.itemScholarPersonImg = circleImageView;
        this.itemScholarPersonName = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemScholarPersonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScholarPersonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_scholar_person, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemScholarPersonBinding bind(View view) {
        int i = R.id.item_scholar_person_code;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_person_code);
        if (textView != null) {
            i = R.id.item_scholar_person_img;
            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.item_scholar_person_img);
            if (circleImageView != null) {
                i = R.id.item_scholar_person_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_person_name);
                if (textView2 != null) {
                    return new ItemScholarPersonBinding((MaterialCardView) view, textView, circleImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
