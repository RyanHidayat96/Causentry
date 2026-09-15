package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentRevampResultDialogBinding implements ViewBinding {
    public final MaterialButton btnRevampCancel;
    public final MaterialButton btnRevampContinue;
    public final ImageView imgDialog;
    public final ImageView imgState;
    private final FrameLayout rootView;
    public final TextView tvResultMessage;
    public final TextView tvResultTitle;

    private FragmentRevampResultDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.btnRevampCancel = materialButton;
        this.btnRevampContinue = materialButton2;
        this.imgDialog = imageView;
        this.imgState = imageView2;
        this.tvResultMessage = textView;
        this.tvResultTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRevampResultDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRevampResultDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_revamp_result_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRevampResultDialogBinding bind(View view) {
        int i = R.id.btnRevampCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRevampCancel);
        if (materialButton != null) {
            i = R.id.btnRevampContinue;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnRevampContinue);
            if (materialButton2 != null) {
                i = R.id.imgDialog;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDialog);
                if (imageView != null) {
                    i = R.id.imgState;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgState);
                    if (imageView2 != null) {
                        i = R.id.tvResultMessage;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultMessage);
                        if (textView != null) {
                            i = R.id.tvResultTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultTitle);
                            if (textView2 != null) {
                                return new FragmentRevampResultDialogBinding((FrameLayout) view, materialButton, materialButton2, imageView, imageView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
