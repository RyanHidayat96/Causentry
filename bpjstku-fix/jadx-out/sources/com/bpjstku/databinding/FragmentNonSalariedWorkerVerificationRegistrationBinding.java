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

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentNonSalariedWorkerVerificationRegistrationBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final CardView cvIdentityCardUpload;
    public final CardView cvPhotoWorkAgreement;
    public final CardView cvSelfieWithIdCard;
    public final ImageView imgFacialVerification;
    public final ImageView imgIdCardUpload;
    public final ImageView imgSelfieWithIdCard;
    private final ScrollView rootView;
    public final TextView tvFacialVerification;
    public final TextView tvFacialVerificationLabel;
    public final TextView tvIdCardUpload;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvLivenessCheck;

    private FragmentNonSalariedWorkerVerificationRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, CardView cardView, CardView cardView2, CardView cardView3, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = scrollView;
        this.btnConfirmation = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.cvIdentityCardUpload = cardView;
        this.cvPhotoWorkAgreement = cardView2;
        this.cvSelfieWithIdCard = cardView3;
        this.imgFacialVerification = imageView;
        this.imgIdCardUpload = imageView2;
        this.imgSelfieWithIdCard = imageView3;
        this.tvFacialVerification = textView;
        this.tvFacialVerificationLabel = textView2;
        this.tvIdCardUpload = textView3;
        this.tvIdCardUploadLabel = textView4;
        this.tvLivenessCheck = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerVerificationRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerVerificationRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_verification_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerVerificationRegistrationBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.cvIdentityCardUpload;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvIdentityCardUpload);
                if (cardView != null) {
                    i = R.id.cvPhotoWorkAgreement;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvPhotoWorkAgreement);
                    if (cardView2 != null) {
                        i = R.id.cvSelfieWithIdCard;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.cvSelfieWithIdCard);
                        if (cardView3 != null) {
                            i = R.id.imgFacialVerification;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgFacialVerification);
                            if (imageView != null) {
                                i = R.id.imgIdCardUpload;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardUpload);
                                if (imageView2 != null) {
                                    i = R.id.imgSelfieWithIdCard;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelfieWithIdCard);
                                    if (imageView3 != null) {
                                        i = R.id.tvFacialVerification;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFacialVerification);
                                        if (textView != null) {
                                            i = R.id.tvFacialVerificationLabel;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFacialVerificationLabel);
                                            if (textView2 != null) {
                                                i = R.id.tvIdCardUpload;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUpload);
                                                if (textView3 != null) {
                                                    i = R.id.tvIdCardUploadLabel;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                                    if (textView4 != null) {
                                                        i = R.id.tvLivenessCheck;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheck);
                                                        if (textView5 != null) {
                                                            return new FragmentNonSalariedWorkerVerificationRegistrationBinding((ScrollView) view, materialButton, appCompatCheckBox, cardView, cardView2, cardView3, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5);
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
