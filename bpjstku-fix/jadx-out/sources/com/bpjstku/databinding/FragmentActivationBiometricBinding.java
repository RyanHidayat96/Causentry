package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentActivationBiometricBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvLivenessCheck;
    public final View divider1;
    public final View divider2;
    public final ImageView imgLivenessCheck;
    public final AppCompatImageView imgLivenessGood;
    public final AppCompatImageView imgLivenessWrong;
    public final LinearLayout llDo1;
    public final LinearLayout llDo2;
    public final LinearLayout llDo3;
    public final LinearLayout llDo4;
    public final LinearLayout llDo5;
    public final LinearLayout llExampleImages;
    public final LinearLayout llPanduanBox;
    private final ScrollView rootView;
    public final AppCompatTextView tvDoTitle;
    public final TextView tvLivenessCheckLabel;
    public final AppCompatTextView tvTitleInformation;

    private FragmentActivationBiometricBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, View view, View view2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, AppCompatTextView appCompatTextView, TextView textView, AppCompatTextView appCompatTextView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvLivenessCheck = cardView;
        this.divider1 = view;
        this.divider2 = view2;
        this.imgLivenessCheck = imageView;
        this.imgLivenessGood = appCompatImageView;
        this.imgLivenessWrong = appCompatImageView2;
        this.llDo1 = linearLayout;
        this.llDo2 = linearLayout2;
        this.llDo3 = linearLayout3;
        this.llDo4 = linearLayout4;
        this.llDo5 = linearLayout5;
        this.llExampleImages = linearLayout6;
        this.llPanduanBox = linearLayout7;
        this.tvDoTitle = appCompatTextView;
        this.tvLivenessCheckLabel = textView;
        this.tvTitleInformation = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentActivationBiometricBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentActivationBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_activation_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentActivationBiometricBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvLivenessCheck;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvLivenessCheck);
            if (cardView != null) {
                i = R.id.divider1;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divider1);
                if (viewFindChildViewById != null) {
                    i = R.id.divider2;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider2);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.imgLivenessCheck;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck);
                        if (imageView != null) {
                            i = R.id.imgLivenessGood;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessGood);
                            if (appCompatImageView != null) {
                                i = R.id.imgLivenessWrong;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessWrong);
                                if (appCompatImageView2 != null) {
                                    i = R.id.llDo1;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo1);
                                    if (linearLayout != null) {
                                        i = R.id.llDo2;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo2);
                                        if (linearLayout2 != null) {
                                            i = R.id.llDo3;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo3);
                                            if (linearLayout3 != null) {
                                                i = R.id.llDo4;
                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo4);
                                                if (linearLayout4 != null) {
                                                    i = R.id.llDo5;
                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo5);
                                                    if (linearLayout5 != null) {
                                                        i = R.id.llExampleImages;
                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llExampleImages);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.llPanduanBox;
                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPanduanBox);
                                                            if (linearLayout7 != null) {
                                                                i = R.id.tvDoTitle;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDoTitle);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.tvLivenessCheckLabel;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheckLabel);
                                                                    if (textView != null) {
                                                                        i = R.id.tvTitleInformation;
                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                                                        if (appCompatTextView2 != null) {
                                                                            return new FragmentActivationBiometricBinding((ScrollView) view, materialButton, cardView, viewFindChildViewById, viewFindChildViewById2, imageView, appCompatImageView, appCompatImageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, appCompatTextView, textView, appCompatTextView2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
