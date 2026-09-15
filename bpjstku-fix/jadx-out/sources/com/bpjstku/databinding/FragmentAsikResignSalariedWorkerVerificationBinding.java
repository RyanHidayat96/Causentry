package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikResignSalariedWorkerVerificationBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final CardView cvFacialVerification;
    public final CardView cvSelfieWithIdCard;
    public final ImageView imgFacialVerification;
    public final ImageView imgIdCardUpload;
    private final ScrollView rootView;
    public final TextView tvFacialVerification;
    public final TextView tvFacialVerificationLabel;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvLivenessCheck;
    public final TextView tvWarningPleaseFillYourVerificationNow;

    private FragmentAsikResignSalariedWorkerVerificationBinding(ScrollView scrollView, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnConfirmation = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.cvFacialVerification = cardView;
        this.cvSelfieWithIdCard = cardView2;
        this.imgFacialVerification = imageView;
        this.imgIdCardUpload = imageView2;
        this.tvFacialVerification = textView;
        this.tvFacialVerificationLabel = textView2;
        this.tvIdCardUploadLabel = textView3;
        this.tvLivenessCheck = textView4;
        this.tvWarningPleaseFillYourVerificationNow = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikResignSalariedWorkerVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikResignSalariedWorkerVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_resign_salaried_worker_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikResignSalariedWorkerVerificationBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.cvFacialVerification;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvFacialVerification);
                if (cardView != null) {
                    i = R.id.cvSelfieWithIdCard;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvSelfieWithIdCard);
                    if (cardView2 != null) {
                        i = R.id.imgFacialVerification;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgFacialVerification);
                        if (imageView != null) {
                            i = R.id.imgIdCardUpload;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardUpload);
                            if (imageView2 != null) {
                                i = R.id.tvFacialVerification;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFacialVerification);
                                if (textView != null) {
                                    i = R.id.tvFacialVerificationLabel;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFacialVerificationLabel);
                                    if (textView2 != null) {
                                        i = R.id.tvIdCardUploadLabel;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                        if (textView3 != null) {
                                            i = R.id.tvLivenessCheck;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheck);
                                            if (textView4 != null) {
                                                i = R.id.tvWarningPleaseFillYourVerificationNow;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWarningPleaseFillYourVerificationNow);
                                                if (textView5 != null) {
                                                    return new FragmentAsikResignSalariedWorkerVerificationBinding((ScrollView) view, materialButton, appCompatCheckBox, cardView, cardView2, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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
