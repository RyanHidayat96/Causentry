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

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTutorialVerificationBiometricBinding implements ViewBinding {
    public final Button btnBack;
    public final Button btnOpenCamera;
    public final ImageView imgTutorialVerifBiometric;
    private final FrameLayout rootView;
    public final TextView tvDescriptionFirst;
    public final TextView tvDescriptionFourth;
    public final TextView tvDescriptionSecond;
    public final TextView tvDescriptionThird;
    public final TextView tvTitleDialogVerifBiometric;

    private FragmentTutorialVerificationBiometricBinding(FrameLayout frameLayout, Button button, Button button2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = frameLayout;
        this.btnBack = button;
        this.btnOpenCamera = button2;
        this.imgTutorialVerifBiometric = imageView;
        this.tvDescriptionFirst = textView;
        this.tvDescriptionFourth = textView2;
        this.tvDescriptionSecond = textView3;
        this.tvDescriptionThird = textView4;
        this.tvTitleDialogVerifBiometric = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTutorialVerificationBiometricBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTutorialVerificationBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tutorial_verification_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTutorialVerificationBiometricBinding bind(View view) {
        int i = R.id.btnBack;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (button != null) {
            i = R.id.btnOpenCamera;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnOpenCamera);
            if (button2 != null) {
                i = R.id.imgTutorialVerifBiometric;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTutorialVerifBiometric);
                if (imageView != null) {
                    i = R.id.tvDescriptionFirst;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionFirst);
                    if (textView != null) {
                        i = R.id.tvDescriptionFourth;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionFourth);
                        if (textView2 != null) {
                            i = R.id.tvDescriptionSecond;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionSecond);
                            if (textView3 != null) {
                                i = R.id.tvDescriptionThird;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionThird);
                                if (textView4 != null) {
                                    i = R.id.tvTitleDialogVerifBiometric;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDialogVerifBiometric);
                                    if (textView5 != null) {
                                        return new FragmentTutorialVerificationBiometricBinding((FrameLayout) view, button, button2, imageView, textView, textView2, textView3, textView4, textView5);
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
