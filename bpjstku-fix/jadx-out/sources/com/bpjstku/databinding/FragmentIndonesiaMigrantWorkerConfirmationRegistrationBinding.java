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
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding implements ViewBinding {
    public final MaterialButton btnCancel;
    public final MaterialButton btnNext;
    public final MaterialCardView cvProgramSelected;
    private final FrameLayout rootView;
    public final AppCompatTextView tvDescConfirmation;
    public final AppCompatTextView tvFeeAmountMonth;
    public final AppCompatTextView tvTitleConfirmation;
    public final AppCompatTextView tvValueFeeAmountMonth;

    private FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = frameLayout;
        this.btnCancel = materialButton;
        this.btnNext = materialButton2;
        this.cvProgramSelected = materialCardView;
        this.tvDescConfirmation = appCompatTextView;
        this.tvFeeAmountMonth = appCompatTextView2;
        this.tvTitleConfirmation = appCompatTextView3;
        this.tvValueFeeAmountMonth = appCompatTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesia_migrant_worker_confirmation_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding bind(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton2 != null) {
                i = R.id.cvProgramSelected;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvProgramSelected);
                if (materialCardView != null) {
                    i = R.id.tvDescConfirmation;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDescConfirmation);
                    if (appCompatTextView != null) {
                        i = R.id.tvFeeAmountMonth;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvFeeAmountMonth);
                        if (appCompatTextView2 != null) {
                            i = R.id.tvTitleConfirmation;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleConfirmation);
                            if (appCompatTextView3 != null) {
                                i = R.id.tvValueFeeAmountMonth;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueFeeAmountMonth);
                                if (appCompatTextView4 != null) {
                                    return new FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding((FrameLayout) view, materialButton, materialButton2, materialCardView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
