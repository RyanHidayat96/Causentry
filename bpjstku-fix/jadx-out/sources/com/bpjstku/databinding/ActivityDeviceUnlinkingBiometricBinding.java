package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDeviceUnlinkingBiometricBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ConstraintLayout clKtpPlaceholder;
    public final CardView cvFotoKtp;
    public final TextInputEditText etNamaLengkap;
    public final TextInputEditText etNik;
    public final TextInputEditText etNomorPeserta;
    public final TextInputEditText etTanggalLahir;
    public final ImageView imgKtpCamera;
    public final ImageView imgKtpPhoto;
    public final LayoutToolbarBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextInputLayout tilNamaLengkap;
    public final TextInputLayout tilNik;
    public final TextInputLayout tilNomorPeserta;
    public final TextInputLayout tilTanggalLahir;
    public final AppCompatTextView tvKtpLabel;
    public final AppCompatTextView tvSubtitle;
    public final AppCompatTextView tvTitle;

    private ActivityDeviceUnlinkingBiometricBinding(ScrollView scrollView, MaterialButton materialButton, ConstraintLayout constraintLayout, CardView cardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, ImageView imageView, ImageView imageView2, LayoutToolbarBinding layoutToolbarBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.clKtpPlaceholder = constraintLayout;
        this.cvFotoKtp = cardView;
        this.etNamaLengkap = textInputEditText;
        this.etNik = textInputEditText2;
        this.etNomorPeserta = textInputEditText3;
        this.etTanggalLahir = textInputEditText4;
        this.imgKtpCamera = imageView;
        this.imgKtpPhoto = imageView2;
        this.layoutToolbar = layoutToolbarBinding;
        this.tilNamaLengkap = textInputLayout;
        this.tilNik = textInputLayout2;
        this.tilNomorPeserta = textInputLayout3;
        this.tilTanggalLahir = textInputLayout4;
        this.tvKtpLabel = appCompatTextView;
        this.tvSubtitle = appCompatTextView2;
        this.tvTitle = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDeviceUnlinkingBiometricBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceUnlinkingBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_device_unlinking_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDeviceUnlinkingBiometricBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.clKtpPlaceholder;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clKtpPlaceholder);
            if (constraintLayout != null) {
                i = R.id.cvFotoKtp;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvFotoKtp);
                if (cardView != null) {
                    i = R.id.etNamaLengkap;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etNamaLengkap);
                    if (textInputEditText != null) {
                        i = R.id.etNik;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etNik);
                        if (textInputEditText2 != null) {
                            i = R.id.etNomorPeserta;
                            TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etNomorPeserta);
                            if (textInputEditText3 != null) {
                                i = R.id.etTanggalLahir;
                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.etTanggalLahir);
                                if (textInputEditText4 != null) {
                                    i = R.id.imgKtpCamera;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpCamera);
                                    if (imageView != null) {
                                        i = R.id.imgKtpPhoto;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpPhoto);
                                        if (imageView2 != null) {
                                            i = R.id.layoutToolbar;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                                            if (viewFindChildViewById != null) {
                                                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                                                i = R.id.tilNamaLengkap;
                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNamaLengkap);
                                                if (textInputLayout != null) {
                                                    i = R.id.tilNik;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNik);
                                                    if (textInputLayout2 != null) {
                                                        i = R.id.tilNomorPeserta;
                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNomorPeserta);
                                                        if (textInputLayout3 != null) {
                                                            i = R.id.tilTanggalLahir;
                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTanggalLahir);
                                                            if (textInputLayout4 != null) {
                                                                i = R.id.tvKtpLabel;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvKtpLabel);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.tvSubtitle;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvSubtitle);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.tvTitle;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                                        if (appCompatTextView3 != null) {
                                                                            return new ActivityDeviceUnlinkingBiometricBinding((ScrollView) view, materialButton, constraintLayout, cardView, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, imageView, imageView2, layoutToolbarBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
