package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentEditPhoneNumberDialogBinding implements ViewBinding {
    public final Button btnSavePhoneNumber;
    public final MaterialCardView cvPhoneNumber;
    public final TextInputEditText edtPhoneNumber;
    private final FrameLayout rootView;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvEditPhoneNumber;
    public final TextView tvEditPhoneNumberInstruction;
    public final TextView tvPrefix;
    public final TextView tvSamplePhoneNumber;

    private FragmentEditPhoneNumberDialogBinding(FrameLayout frameLayout, Button button, MaterialCardView materialCardView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.btnSavePhoneNumber = button;
        this.cvPhoneNumber = materialCardView;
        this.edtPhoneNumber = textInputEditText;
        this.tilPhoneNumber = textInputLayout;
        this.tvEditPhoneNumber = textView;
        this.tvEditPhoneNumberInstruction = textView2;
        this.tvPrefix = textView3;
        this.tvSamplePhoneNumber = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEditPhoneNumberDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEditPhoneNumberDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_edit_phone_number_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEditPhoneNumberDialogBinding bind(View view) {
        int i = R.id.btnSavePhoneNumber;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSavePhoneNumber);
        if (button != null) {
            i = R.id.cvPhoneNumber;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumber);
            if (materialCardView != null) {
                i = R.id.edtPhoneNumber;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                if (textInputEditText != null) {
                    i = R.id.tilPhoneNumber;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                    if (textInputLayout != null) {
                        i = R.id.tvEditPhoneNumber;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPhoneNumber);
                        if (textView != null) {
                            i = R.id.tvEditPhoneNumberInstruction;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPhoneNumberInstruction);
                            if (textView2 != null) {
                                i = R.id.tvPrefix;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                if (textView3 != null) {
                                    i = R.id.tvSamplePhoneNumber;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSamplePhoneNumber);
                                    if (textView4 != null) {
                                        return new FragmentEditPhoneNumberDialogBinding((FrameLayout) view, button, materialCardView, textInputEditText, textInputLayout, textView, textView2, textView3, textView4);
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
