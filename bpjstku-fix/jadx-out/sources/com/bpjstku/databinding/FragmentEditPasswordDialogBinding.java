package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentEditPasswordDialogBinding implements ViewBinding {
    public final Button btnSavePassword;
    public final MaterialCardView cvEnterPasswordWarning;
    public final ImageView imgWarning1;
    private final FrameLayout rootView;
    public final TextInputLayout tilConfirmedNewPassword;
    public final TextInputLayout tilNewPassword;
    public final TextInputLayout tilOldPassword;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvEditPassword;

    private FragmentEditPasswordDialogBinding(FrameLayout frameLayout, Button button, MaterialCardView materialCardView, ImageView imageView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.btnSavePassword = button;
        this.cvEnterPasswordWarning = materialCardView;
        this.imgWarning1 = imageView;
        this.tilConfirmedNewPassword = textInputLayout;
        this.tilNewPassword = textInputLayout2;
        this.tilOldPassword = textInputLayout3;
        this.tvClaimNonSalariedWorkerInfo1 = textView;
        this.tvEditPassword = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditPasswordDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditPasswordDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_edit_password_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEditPasswordDialogBinding bind(View view) {
        int i = R.id.btnSavePassword;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSavePassword);
        if (button != null) {
            i = R.id.cvEnterPasswordWarning;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvEnterPasswordWarning);
            if (materialCardView != null) {
                i = R.id.imgWarning1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                if (imageView != null) {
                    i = R.id.tilConfirmedNewPassword;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilConfirmedNewPassword);
                    if (textInputLayout != null) {
                        i = R.id.tilNewPassword;
                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNewPassword);
                        if (textInputLayout2 != null) {
                            i = R.id.tilOldPassword;
                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilOldPassword);
                            if (textInputLayout3 != null) {
                                i = R.id.tvClaimNonSalariedWorkerInfo1;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                if (textView != null) {
                                    i = R.id.tvEditPassword;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPassword);
                                    if (textView2 != null) {
                                        return new FragmentEditPasswordDialogBinding((FrameLayout) view, button, materialCardView, imageView, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
