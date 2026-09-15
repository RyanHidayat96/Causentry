package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentShowRateAppBinding implements ViewBinding {
    public final MaterialButton btnNo;
    public final MaterialButton btnYes;
    private final FrameLayout rootView;
    public final AppCompatRatingBar rtbApp;
    public final AppCompatTextView tvMessage;
    public final AppCompatTextView tvTitle;

    private FragmentShowRateAppBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatRatingBar appCompatRatingBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = frameLayout;
        this.btnNo = materialButton;
        this.btnYes = materialButton2;
        this.rtbApp = appCompatRatingBar;
        this.tvMessage = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentShowRateAppBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentShowRateAppBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_show_rate_app, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentShowRateAppBinding bind(View view) {
        int i = R.id.btnNo;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNo);
        if (materialButton != null) {
            i = R.id.btnYes;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnYes);
            if (materialButton2 != null) {
                i = R.id.rtbApp;
                AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) ViewBindings.findChildViewById(view, R.id.rtbApp);
                if (appCompatRatingBar != null) {
                    i = R.id.tvMessage;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvMessage);
                    if (appCompatTextView != null) {
                        i = R.id.tvTitle;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                        if (appCompatTextView2 != null) {
                            return new FragmentShowRateAppBinding((FrameLayout) view, materialButton, materialButton2, appCompatRatingBar, appCompatTextView, appCompatTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
