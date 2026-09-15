package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemInformationListBinding implements ViewBinding {
    public final ImageView imgArrowRight;
    private final CardView rootView;
    public final ConstraintLayout rvInformationCategoryItemsContainer;
    public final TextView tvInformationCategoryItem;

    private ItemInformationListBinding(CardView cardView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = cardView;
        this.imgArrowRight = imageView;
        this.rvInformationCategoryItemsContainer = constraintLayout;
        this.tvInformationCategoryItem = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemInformationListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemInformationListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_information_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemInformationListBinding bind(View view) {
        int i = R.id.imgArrowRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowRight);
        if (imageView != null) {
            i = R.id.rvInformationCategoryItemsContainer;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.rvInformationCategoryItemsContainer);
            if (constraintLayout != null) {
                i = R.id.tvInformationCategoryItem;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInformationCategoryItem);
                if (textView != null) {
                    return new ItemInformationListBinding((CardView) view, imageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
