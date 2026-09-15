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
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemAsikAddKpjBinding implements ViewBinding {
    public final MaterialCardView cvInformationKpj;
    public final ImageView imgWarning;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilKpj;
    public final TextView tvTitleInformationKpj;

    private ItemAsikAddKpjBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ImageView imageView, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.cvInformationKpj = materialCardView;
        this.imgWarning = imageView;
        this.tilKpj = textInputLayout;
        this.tvTitleInformationKpj = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemAsikAddKpjBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemAsikAddKpjBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_asik_add_kpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemAsikAddKpjBinding bind(View view) {
        int i = R.id.cvInformationKpj;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvInformationKpj);
        if (materialCardView != null) {
            i = R.id.imgWarning;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning);
            if (imageView != null) {
                i = R.id.tilKpj;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilKpj);
                if (textInputLayout != null) {
                    i = R.id.tvTitleInformationKpj;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj);
                    if (textView != null) {
                        return new ItemAsikAddKpjBinding((ConstraintLayout) view, materialCardView, imageView, textInputLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
