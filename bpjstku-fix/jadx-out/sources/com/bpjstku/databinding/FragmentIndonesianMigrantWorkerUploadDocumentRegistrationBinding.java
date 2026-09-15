package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ConstraintLayout containerIdCard;
    public final ConstraintLayout containerWorkAgreement;
    public final CardView cvIdCardUpload;
    public final CardView cvWorkAgreement;
    public final ImageView imgIdCardPhoto;
    public final ImageView imgIdCardUploadIcon;
    public final ImageView imgWorkAgreementIcon;
    public final ImageView imgWorkAgreementPhoto;
    private final ScrollView rootView;
    public final TextView tvIdCardError;
    public final TextView tvIdCardUpload;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvWorkAgreement;
    public final TextView tvWorkAgreementLabel;
    public final TextView tvWorkAgrermentError;

    private FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.containerIdCard = constraintLayout;
        this.containerWorkAgreement = constraintLayout2;
        this.cvIdCardUpload = cardView;
        this.cvWorkAgreement = cardView2;
        this.imgIdCardPhoto = imageView;
        this.imgIdCardUploadIcon = imageView2;
        this.imgWorkAgreementIcon = imageView3;
        this.imgWorkAgreementPhoto = imageView4;
        this.tvIdCardError = textView;
        this.tvIdCardUpload = textView2;
        this.tvIdCardUploadLabel = textView3;
        this.tvWorkAgreement = textView4;
        this.tvWorkAgreementLabel = textView5;
        this.tvWorkAgrermentError = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesian_migrant_worker_upload_document_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.containerIdCard;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerIdCard);
            if (constraintLayout != null) {
                i = R.id.containerWorkAgreement;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerWorkAgreement);
                if (constraintLayout2 != null) {
                    i = R.id.cvIdCardUpload;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvIdCardUpload);
                    if (cardView != null) {
                        i = R.id.cvWorkAgreement;
                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvWorkAgreement);
                        if (cardView2 != null) {
                            i = R.id.imgIdCardPhoto;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardPhoto);
                            if (imageView != null) {
                                i = R.id.imgIdCardUploadIcon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardUploadIcon);
                                if (imageView2 != null) {
                                    i = R.id.imgWorkAgreementIcon;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWorkAgreementIcon);
                                    if (imageView3 != null) {
                                        i = R.id.imgWorkAgreementPhoto;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWorkAgreementPhoto);
                                        if (imageView4 != null) {
                                            i = R.id.tvIdCardError;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardError);
                                            if (textView != null) {
                                                i = R.id.tvIdCardUpload;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUpload);
                                                if (textView2 != null) {
                                                    i = R.id.tvIdCardUploadLabel;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                                    if (textView3 != null) {
                                                        i = R.id.tvWorkAgreement;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkAgreement);
                                                        if (textView4 != null) {
                                                            i = R.id.tvWorkAgreementLabel;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkAgreementLabel);
                                                            if (textView5 != null) {
                                                                i = R.id.tvWorkAgrermentError;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkAgrermentError);
                                                                if (textView6 != null) {
                                                                    return new FragmentIndonesianMigrantWorkerUploadDocumentRegistrationBinding((ScrollView) view, materialButton, constraintLayout, constraintLayout2, cardView, cardView2, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6);
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
