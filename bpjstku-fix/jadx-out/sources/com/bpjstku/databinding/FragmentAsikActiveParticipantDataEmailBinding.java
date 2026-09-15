package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAsikActiveParticipantDataEmailBinding implements ViewBinding {
    public final MaterialButton btnNext;
    private final ScrollView rootView;
    public final TextInputLayout tilContactEmail;
    public final TextView tvReminderVerifyDataEmail;

    private FragmentAsikActiveParticipantDataEmailBinding(ScrollView scrollView, MaterialButton materialButton, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.tilContactEmail = textInputLayout;
        this.tvReminderVerifyDataEmail = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantDataEmailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantDataEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_data_email, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantDataEmailBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.tilContactEmail;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilContactEmail);
            if (textInputLayout != null) {
                i = R.id.tvReminderVerifyDataEmail;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataEmail);
                if (textView != null) {
                    return new FragmentAsikActiveParticipantDataEmailBinding((ScrollView) view, materialButton, textInputLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
