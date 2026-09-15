package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemDigitalCardFollowingProgramBinding implements ViewBinding {
    public final AppCompatImageView imgProgram;
    private final LinearLayout rootView;
    public final TextView tvProgramItem;

    private ItemDigitalCardFollowingProgramBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = linearLayout;
        this.imgProgram = appCompatImageView;
        this.tvProgramItem = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemDigitalCardFollowingProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDigitalCardFollowingProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_digital_card_following_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemDigitalCardFollowingProgramBinding bind(View view) {
        int i = R.id.imgProgram;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgProgram);
        if (appCompatImageView != null) {
            i = R.id.tvProgramItem;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramItem);
            if (textView != null) {
                return new ItemDigitalCardFollowingProgramBinding((LinearLayout) view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
