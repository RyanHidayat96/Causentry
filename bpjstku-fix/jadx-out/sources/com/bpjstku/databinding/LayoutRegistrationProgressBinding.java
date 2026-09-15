package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutRegistrationProgressBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final SeekBar sbRegisterProgression;
    public final TextView tvRegistrationStep;
    public final TextView tvStepNumber;

    private LayoutRegistrationProgressBinding(ConstraintLayout constraintLayout, SeekBar seekBar, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.sbRegisterProgression = seekBar;
        this.tvRegistrationStep = textView;
        this.tvStepNumber = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutRegistrationProgressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutRegistrationProgressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_registration_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutRegistrationProgressBinding bind(View view) {
        int i = R.id.sbRegisterProgression;
        SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.sbRegisterProgression);
        if (seekBar != null) {
            i = R.id.tvRegistrationStep;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationStep);
            if (textView != null) {
                i = R.id.tvStepNumber;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStepNumber);
                if (textView2 != null) {
                    return new LayoutRegistrationProgressBinding((ConstraintLayout) view, seekBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
