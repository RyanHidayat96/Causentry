package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityKtpGuidanceBinding implements ViewBinding {
    public final MaterialButton btnMulaiFoto;
    private final ConstraintLayout rootView;
    public final ScrollView scrollGuidance;
    public final Toolbar toolbar;

    private ActivityKtpGuidanceBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ScrollView scrollView, Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.btnMulaiFoto = materialButton;
        this.scrollGuidance = scrollView;
        this.toolbar = toolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityKtpGuidanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityKtpGuidanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ktp_guidance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityKtpGuidanceBinding bind(View view) {
        int i = R.id.btnMulaiFoto;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnMulaiFoto);
        if (materialButton != null) {
            i = R.id.scrollGuidance;
            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollGuidance);
            if (scrollView != null) {
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                if (toolbar != null) {
                    return new ActivityKtpGuidanceBinding((ConstraintLayout) view, materialButton, scrollView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
