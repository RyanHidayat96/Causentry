package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentCustomBottomDialogBinding implements ViewBinding {
    public final TextView btnNo;
    public final MaterialButton btnResultDialog;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final ImageView imgSuccess;
    private final FrameLayout rootView;
    public final TextView tvResultMessage;
    public final TextView tvResultTitle;

    private FragmentCustomBottomDialogBinding(FrameLayout frameLayout, TextView textView, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, ImageView imageView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.btnNo = textView;
        this.btnResultDialog = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.imgSuccess = imageView;
        this.tvResultMessage = textView2;
        this.tvResultTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCustomBottomDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCustomBottomDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_custom_bottom_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCustomBottomDialogBinding bind(View view) {
        int i = R.id.btnNo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnNo);
        if (textView != null) {
            i = R.id.btnResultDialog;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnResultDialog);
            if (materialButton != null) {
                i = R.id.cbAgreeTermCondition;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
                if (appCompatCheckBox != null) {
                    i = R.id.imgSuccess;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
                    if (imageView != null) {
                        i = R.id.tvResultMessage;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultMessage);
                        if (textView2 != null) {
                            i = R.id.tvResultTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultTitle);
                            if (textView3 != null) {
                                return new FragmentCustomBottomDialogBinding((FrameLayout) view, textView, materialButton, appCompatCheckBox, imageView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
