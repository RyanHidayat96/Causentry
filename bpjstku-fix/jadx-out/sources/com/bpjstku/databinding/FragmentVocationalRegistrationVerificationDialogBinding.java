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

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentVocationalRegistrationVerificationDialogBinding implements ViewBinding {
    public final Button btnCancel;
    public final Button btnConfirmation;
    public final ImageView imgWarning;
    private final FrameLayout rootView;
    public final TextView tvConfirmation;
    public final TextView tvConfirmationContent;

    private FragmentVocationalRegistrationVerificationDialogBinding(FrameLayout frameLayout, Button button, Button button2, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.btnCancel = button;
        this.btnConfirmation = button2;
        this.imgWarning = imageView;
        this.tvConfirmation = textView;
        this.tvConfirmationContent = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalRegistrationVerificationDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalRegistrationVerificationDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_registration_verification_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalRegistrationVerificationDialogBinding bind(View view) {
        int i = R.id.btnCancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (button != null) {
            i = R.id.btnConfirmation;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
            if (button2 != null) {
                i = R.id.imgWarning;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning);
                if (imageView != null) {
                    i = R.id.tvConfirmation;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmation);
                    if (textView != null) {
                        i = R.id.tvConfirmationContent;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationContent);
                        if (textView2 != null) {
                            return new FragmentVocationalRegistrationVerificationDialogBinding((FrameLayout) view, button, button2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
