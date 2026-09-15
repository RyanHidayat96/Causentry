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
public final class FragmentProcessResultDialogBinding implements ViewBinding {
    public final MaterialButton btnResultDialog;
    public final MaterialButton btnSecondaryResultDialog;
    public final ImageView imgSuccess;
    private final FrameLayout rootView;
    public final TextView tvResultMessage;
    public final TextView tvResultTitle;

    private FragmentProcessResultDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.btnResultDialog = materialButton;
        this.btnSecondaryResultDialog = materialButton2;
        this.imgSuccess = imageView;
        this.tvResultMessage = textView;
        this.tvResultTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProcessResultDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProcessResultDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_process_result_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProcessResultDialogBinding bind(View view) {
        int i = R.id.btnResultDialog;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnResultDialog);
        if (materialButton != null) {
            i = R.id.btnSecondaryResultDialog;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSecondaryResultDialog);
            if (materialButton2 != null) {
                i = R.id.imgSuccess;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
                if (imageView != null) {
                    i = R.id.tvResultMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultMessage);
                    if (textView != null) {
                        i = R.id.tvResultTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultTitle);
                        if (textView2 != null) {
                            return new FragmentProcessResultDialogBinding((FrameLayout) view, materialButton, materialButton2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
