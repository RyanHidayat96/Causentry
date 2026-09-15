package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikActiveParticipantPersonalDataBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvIdCardUpload;
    public final TextInputEditText edtBirthDate;
    public final ImageView imgIdCardUpload;
    public final AppCompatRadioButton rbFemale;
    public final AppCompatRadioButton rbMale;
    public final RadioGroup rgChooseGender;
    private final ScrollView rootView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final AppCompatTextView tvChooseGender;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvReminderVerifyDataPersonal;
    public final AppCompatTextView tvScanKTP;

    private FragmentAsikActiveParticipantPersonalDataBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, TextInputEditText textInputEditText, ImageView imageView, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView2) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvIdCardUpload = cardView;
        this.edtBirthDate = textInputEditText;
        this.imgIdCardUpload = imageView;
        this.rbFemale = appCompatRadioButton;
        this.rbMale = appCompatRadioButton2;
        this.rgChooseGender = radioGroup;
        this.tilBirthDate = textInputLayout;
        this.tilFullName = textInputLayout2;
        this.tilIdNumber = textInputLayout3;
        this.tvChooseGender = appCompatTextView;
        this.tvIdCardUploadLabel = textView;
        this.tvReminderVerifyDataPersonal = textView2;
        this.tvScanKTP = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantPersonalDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantPersonalDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_personal_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantPersonalDataBinding bind(View view) {
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
                        i = R.id.rbFemale;
                        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbFemale);
                        if (appCompatRadioButton != null) {
                            i = R.id.rbMale;
                            AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbMale);
                            if (appCompatRadioButton2 != null) {
                                i = R.id.rgChooseGender;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseGender);
                                if (radioGroup != null) {
                                    i = R.id.tilBirthDate;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                    if (textInputLayout != null) {
                                        i = R.id.tilFullName;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilIdNumber;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tvChooseGender;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChooseGender);
                                                if (appCompatTextView != null) {
                                                    i = R.id.tvIdCardUploadLabel;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                                    if (textView != null) {
                                                        i = R.id.tvReminderVerifyDataPersonal;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                        if (textView2 != null) {
                                                            i = R.id.tvScanKTP;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                            if (appCompatTextView2 != null) {
                                                                return new FragmentAsikActiveParticipantPersonalDataBinding((ScrollView) view, materialButton, cardView, textInputEditText, imageView, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout, textInputLayout2, textInputLayout3, appCompatTextView, textView, textView2, appCompatTextView2);
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
