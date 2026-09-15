package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityVocationalRegistrationResultBinding implements ViewBinding {
    public final Button btnBack;
    public final ImageView imgVocationalRegistrationResult;
    public final MultiStateView msvVocationResult;
    private final ConstraintLayout rootView;
    public final TextView tvRegistrationResultDescription;
    public final TextView tvRegistrationResultInformation;
    public final TextView tvVocationalRegistrationResult;

    private ActivityVocationalRegistrationResultBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, MultiStateView multiStateView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnBack = button;
        this.imgVocationalRegistrationResult = imageView;
        this.msvVocationResult = multiStateView;
        this.tvRegistrationResultDescription = textView;
        this.tvRegistrationResultInformation = textView2;
        this.tvVocationalRegistrationResult = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalRegistrationResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalRegistrationResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_registration_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalRegistrationResultBinding bind(View view) {
        int i = R.id.btnBack;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (button != null) {
            i = R.id.imgVocationalRegistrationResult;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgVocationalRegistrationResult);
            if (imageView != null) {
                i = R.id.msvVocationResult;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvVocationResult);
                if (multiStateView != null) {
                    i = R.id.tvRegistrationResultDescription;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationResultDescription);
                    if (textView != null) {
                        i = R.id.tvRegistrationResultInformation;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegistrationResultInformation);
                        if (textView2 != null) {
                            i = R.id.tvVocationalRegistrationResult;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVocationalRegistrationResult);
                            if (textView3 != null) {
                                return new ActivityVocationalRegistrationResultBinding((ConstraintLayout) view, button, imageView, multiStateView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
