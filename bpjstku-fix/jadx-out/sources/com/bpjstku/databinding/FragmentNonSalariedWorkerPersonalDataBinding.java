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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNonSalariedWorkerPersonalDataBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ConstraintLayout clKtpPlaceholder;
    public final CardView cvFotoKtp;
    public final TextInputEditText edtBirthDate;
    public final ImageView imgKtpCamera;
    public final ImageView imgKtpPhoto;
    public final ConstraintLayout nonSalariedWorkerPersonalDataContainer;
    private final ScrollView rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextView tvFotoKtpLabel;
    public final TextView tvPageSubtitle;
    public final TextView tvPageTitle;

    private FragmentNonSalariedWorkerPersonalDataBinding(ScrollView scrollView, MaterialButton materialButton, ConstraintLayout constraintLayout, CardView cardView, TextInputEditText textInputEditText, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.clKtpPlaceholder = constraintLayout;
        this.cvFotoKtp = cardView;
        this.edtBirthDate = textInputEditText;
        this.imgKtpCamera = imageView;
        this.imgKtpPhoto = imageView2;
        this.nonSalariedWorkerPersonalDataContainer = constraintLayout2;
        this.tilBirthDate = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdNumber = textInputLayout3;
        this.tvFotoKtpLabel = textView;
        this.tvPageSubtitle = textView2;
        this.tvPageTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerPersonalDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerPersonalDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_personal_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerPersonalDataBinding bind(View view) {
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
                        i = R.id.imgKtpCamera;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpCamera);
                        if (imageView != null) {
                            i = R.id.imgKtpPhoto;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpPhoto);
                            if (imageView2 != null) {
                                i = R.id.nonSalariedWorkerPersonalDataContainer;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.nonSalariedWorkerPersonalDataContainer);
                                if (constraintLayout2 != null) {
                                    i = R.id.tilBirthDate;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                    if (textInputLayout != null) {
                                        i = R.id.tilFullName;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilIdNumber;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tvFotoKtpLabel;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFotoKtpLabel);
                                                if (textView != null) {
                                                    i = R.id.tvPageSubtitle;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageSubtitle);
                                                    if (textView2 != null) {
                                                        i = R.id.tvPageTitle;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPageTitle);
                                                        if (textView3 != null) {
                                                            return new FragmentNonSalariedWorkerPersonalDataBinding((ScrollView) view, materialButton, constraintLayout, cardView, textInputEditText, imageView, imageView2, constraintLayout2, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2, textView3);
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
