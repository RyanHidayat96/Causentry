package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentEditEmailDialogBinding implements ViewBinding {
    public final Button btnSaveEmail;
    private final ScrollView rootView;
    public final TextInputLayout tilEmail;
    public final TextView tvEditEmail;
    public final TextView tvEditEmailInstruction;

    private FragmentEditEmailDialogBinding(ScrollView scrollView, Button button, TextInputLayout textInputLayout, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnSaveEmail = button;
        this.tilEmail = textInputLayout;
        this.tvEditEmail = textView;
        this.tvEditEmailInstruction = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentEditEmailDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditEmailDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_edit_email_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEditEmailDialogBinding bind(View view) {
        int i = R.id.btnSaveEmail;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSaveEmail);
        if (button != null) {
            i = R.id.tilEmail;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
            if (textInputLayout != null) {
                i = R.id.tvEditEmail;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditEmail);
                if (textView != null) {
                    i = R.id.tvEditEmailInstruction;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditEmailInstruction);
                    if (textView2 != null) {
                        return new FragmentEditEmailDialogBinding((ScrollView) view, button, textInputLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
