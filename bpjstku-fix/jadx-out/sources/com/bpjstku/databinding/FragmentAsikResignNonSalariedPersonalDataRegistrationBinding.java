package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikResignNonSalariedPersonalDataRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvIdCardUpload;
    public final TextInputEditText edtBirthDate;
    public final ImageView imgIdCardUpload;
    public final RadioButton rbOneMonthPeriod;
    public final RadioButton rbThreeMonthPeriod;
    public final RadioGroup rgGender;
    private final ScrollView rootView;
    public final TextInputLayout tilAddress;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextView tvChooseGender;
    public final TextView tvIdCard;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvWarningPleaseFillYourPersonalDataNow;

    private FragmentAsikResignNonSalariedPersonalDataRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, TextInputEditText textInputEditText, ImageView imageView, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvIdCardUpload = cardView;
        this.edtBirthDate = textInputEditText;
        this.imgIdCardUpload = imageView;
        this.rbOneMonthPeriod = radioButton;
        this.rbThreeMonthPeriod = radioButton2;
        this.rgGender = radioGroup;
        this.tilAddress = textInputLayout;
        this.tilBirthDate = textInputLayout2;
        this.tilFullName = textInputLayout3;
        this.tilIdNumber = textInputLayout4;
        this.tvChooseGender = textView;
        this.tvIdCard = textView2;
        this.tvIdCardUploadLabel = textView3;
        this.tvWarningPleaseFillYourPersonalDataNow = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikResignNonSalariedPersonalDataRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikResignNonSalariedPersonalDataRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_resign_non_salaried_personal_data_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikResignNonSalariedPersonalDataRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvIdCardUpload;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvIdCardUpload);
            if (cardView != null) {
                i = R.id.edtBirthDate;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                if (textInputEditText != null) {
                    i = R.id.imgIdCardUpload;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardUpload);
                    if (imageView != null) {
                        i = R.id.rbOneMonthPeriod;
                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbOneMonthPeriod);
                        if (radioButton != null) {
                            i = R.id.rbThreeMonthPeriod;
                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbThreeMonthPeriod);
                            if (radioButton2 != null) {
                                i = R.id.rgGender;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgGender);
                                if (radioGroup != null) {
                                    i = R.id.tilAddress;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddress);
                                    if (textInputLayout != null) {
                                        i = R.id.tilBirthDate;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilFullName;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tilIdNumber;
                                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                                if (textInputLayout4 != null) {
                                                    i = R.id.tvChooseGender;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseGender);
                                                    if (textView != null) {
                                                        i = R.id.tvIdCard;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCard);
                                                        if (textView2 != null) {
                                                            i = R.id.tvIdCardUploadLabel;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                                            if (textView3 != null) {
                                                                i = R.id.tvWarningPleaseFillYourPersonalDataNow;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWarningPleaseFillYourPersonalDataNow);
                                                                if (textView4 != null) {
                                                                    return new FragmentAsikResignNonSalariedPersonalDataRegistrationBinding((ScrollView) view, materialButton, cardView, textInputEditText, imageView, radioButton, radioButton2, radioGroup, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3, textView4);
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
