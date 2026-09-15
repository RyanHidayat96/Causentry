package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentShowDialogUnlinkEwalletBinding implements ViewBinding {
    public final MaterialButton btnCancel;
    public final MaterialButton btnDeleteAccount;
    private final FrameLayout rootView;
    public final AppCompatTextView tvMessage;
    public final AppCompatTextView tvTitle;

    private FragmentShowDialogUnlinkEwalletBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = frameLayout;
        this.btnCancel = materialButton;
        this.btnDeleteAccount = materialButton2;
        this.tvMessage = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentShowDialogUnlinkEwalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentShowDialogUnlinkEwalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_show_dialog_unlink_ewallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentShowDialogUnlinkEwalletBinding bind(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnDeleteAccount;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDeleteAccount);
            if (materialButton2 != null) {
                i = R.id.tvMessage;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvMessage);
                if (appCompatTextView != null) {
                    i = R.id.tvTitle;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (appCompatTextView2 != null) {
                        return new FragmentShowDialogUnlinkEwalletBinding((FrameLayout) view, materialButton, materialButton2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
