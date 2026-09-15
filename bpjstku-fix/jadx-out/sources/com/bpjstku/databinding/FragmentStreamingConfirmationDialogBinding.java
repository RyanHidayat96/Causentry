package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentStreamingConfirmationDialogBinding implements ViewBinding {
    public final MaterialButton btnNextVisionPlus;
    public final AppCompatCheckBox cbAgreeTermCondition;
    private final FrameLayout rootView;
    public final TextView tvInfo;

    private FragmentStreamingConfirmationDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, TextView textView) {
        this.rootView = frameLayout;
        this.btnNextVisionPlus = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.tvInfo = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentStreamingConfirmationDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStreamingConfirmationDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_streaming_confirmation_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentStreamingConfirmationDialogBinding bind(View view) {
        int i = R.id.btnNextVisionPlus;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNextVisionPlus);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.tvInfo;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfo);
                if (textView != null) {
                    return new FragmentStreamingConfirmationDialogBinding((FrameLayout) view, materialButton, appCompatCheckBox, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
