package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemEditProfileListBinding implements ViewBinding {
    public final ImageView imgEditProfileList;
    public final ImageView imgPhotoProfile;
    private final CardView rootView;
    public final TextView tvEditProfileList;

    private ItemEditProfileListBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView) {
        this.rootView = cardView;
        this.imgEditProfileList = imageView;
        this.imgPhotoProfile = imageView2;
        this.tvEditProfileList = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemEditProfileListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemEditProfileListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_edit_profile_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemEditProfileListBinding bind(View view) {
        int i = R.id.imgEditProfileList;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgEditProfileList);
        if (imageView != null) {
            i = R.id.imgPhotoProfile;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPhotoProfile);
            if (imageView2 != null) {
                i = R.id.tvEditProfileList;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditProfileList);
                if (textView != null) {
                    return new ItemEditProfileListBinding((CardView) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
