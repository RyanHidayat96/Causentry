package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSimpleDialogBinding implements ViewBinding {
    public final MaterialButton btnResultDialog;
    private final FrameLayout rootView;
    public final TextView tvResultMessage;

    private FragmentSimpleDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, TextView textView) {
        this.rootView = frameLayout;
        this.btnResultDialog = materialButton;
        this.tvResultMessage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSimpleDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSimpleDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_simple_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSimpleDialogBinding bind(View view) {
        int i = R.id.btnResultDialog;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnResultDialog);
        if (materialButton != null) {
            i = R.id.tvResultMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultMessage);
            if (textView != null) {
                return new FragmentSimpleDialogBinding((FrameLayout) view, materialButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
