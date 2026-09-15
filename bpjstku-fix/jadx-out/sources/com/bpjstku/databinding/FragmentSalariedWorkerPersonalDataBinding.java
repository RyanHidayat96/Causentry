package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSalariedWorkerPersonalDataBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ConstraintLayout clKtpPlaceholder;
    public final CardView cvFotoKtp;
    public final TextInputEditText edtBirthDate;
    public final TextInputEditText edtIdNumber;
    public final ImageView imgKtpCamera;
    public final ImageView imgKtpPhoto;
    private final FrameLayout rootView;
    public final ConstraintLayout salariedWorkerPersonalDataContainer;
    public final ScrollView scrollForm;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilJamsostekIdNumber;
    public final TextView tvCompleteYourPersonalData;
    public final TextView tvFotoKtpLabel;
    public final TextView tvPageSubtitle;
    public final TextView tvPageTitle;

    private FragmentSalariedWorkerPersonalDataBinding(FrameLayout frameLayout, MaterialButton materialButton, ConstraintLayout constraintLayout, CardView cardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ScrollView scrollView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.btnNext = materialButton;
        this.clKtpPlaceholder = constraintLayout;
        this.cvFotoKtp = cardView;
        this.edtBirthDate = textInputEditText;
        this.edtIdNumber = textInputEditText2;
        this.imgKtpCamera = imageView;
        this.imgKtpPhoto = imageView2;
        this.salariedWorkerPersonalDataContainer = constraintLayout2;
        this.scrollForm = scrollView;
        this.tilBirthDate = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdNumber = textInputLayout3;
        this.tilJamsostekIdNumber = textInputLayout4;
        this.tvCompleteYourPersonalData = textView;
        this.tvFotoKtpLabel = textView2;
        this.tvPageSubtitle = textView3;
        this.tvPageTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSalariedWorkerPersonalDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSalariedWorkerPersonalDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_salaried_worker_personal_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSalariedWorkerPersonalDataBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.clKtpPlaceholder;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clKtpPlaceholder);
            if (constraintLayout != null) {
                i = R.id.cvFotoKtp;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvFotoKtp);
                if (cardView != null) {
                    i = R.id.edtBirthDate;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                    if (textInputEditText != null) {
                        i = R.id.edtIdNumber;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdNumber);
                        if (textInputEditText2 != null) {
                            i = R.id.imgKtpCamera;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpCamera);
                            if (imageView != null) {
                                i = R.id.imgKtpPhoto;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpPhoto);
                                if (imageView2 != null) {
                                    i = R.id.salariedWorkerPersonalDataContainer;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.salariedWorkerPersonalDataContainer);
                                    if (constraintLayout2 != null) {
                                        i = R.id.scrollForm;
                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollForm);
                                        if (scrollView != null) {
                                            i = R.id.tilBirthDate;
                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                            if (textInputLayout != null) {
                                                i = R.id.tilFullName;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                if (textInputLayout2 != null) {
                                                    i = R.id.tilIdNumber;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                                    if (textInputLayout3 != null) {
                                                        i = R.id.tilJamsostekIdNumber;
                                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilJamsostekIdNumber);
                                                        if (textInputLayout4 != null) {
                                                            i = R.id.tvCompleteYourPersonalData;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCompleteYourPersonalData);
                                                            if (textView != null) {
                                                                i = R.id.tvFotoKtpLabel;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFotoKtpLabel);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvPageSubtitle;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageSubtitle);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvPageTitle;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageTitle);
                                                                        if (textView4 != null) {
                                                                            return new FragmentSalariedWorkerPersonalDataBinding((FrameLayout) view, materialButton, constraintLayout, cardView, textInputEditText, textInputEditText2, imageView, imageView2, constraintLayout2, scrollView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3, textView4);
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
