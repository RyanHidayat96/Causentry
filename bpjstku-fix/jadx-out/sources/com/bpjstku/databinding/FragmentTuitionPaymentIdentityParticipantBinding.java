package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentTuitionPaymentIdentityParticipantBinding implements ViewBinding {
    public final MaterialButton btnCheckBpuIdNumber;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilIdNumber;
    public final TextView tvEnterPhoneNumberInstruction;

    private FragmentTuitionPaymentIdentityParticipantBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.btnCheckBpuIdNumber = materialButton;
        this.tilIdNumber = textInputLayout;
        this.tvEnterPhoneNumberInstruction = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTuitionPaymentIdentityParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTuitionPaymentIdentityParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tuition_payment_identity_participant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTuitionPaymentIdentityParticipantBinding bind(View view) {
        int i = R.id.btnCheckBpuIdNumber;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCheckBpuIdNumber);
        if (materialButton != null) {
            i = R.id.tilIdNumber;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
            if (textInputLayout != null) {
                i = R.id.tvEnterPhoneNumberInstruction;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterPhoneNumberInstruction);
                if (textView != null) {
                    return new FragmentTuitionPaymentIdentityParticipantBinding((ConstraintLayout) view, materialButton, textInputLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
