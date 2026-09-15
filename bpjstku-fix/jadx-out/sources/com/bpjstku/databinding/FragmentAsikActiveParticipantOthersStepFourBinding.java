package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikActiveParticipantOthersStepFourBinding implements ViewBinding {
    public final MaterialButton btnMin;
    public final MaterialButton btnNext;
    public final MaterialButton btnPlus;
    public final ConstraintLayout childrenContainer;
    public final LinearLayout childrenNameContainer;
    public final CardView cvScanKK;
    public final CardView cvScanKtp;
    public final TextInputEditText edtAddressPostalCode;
    public final TextInputEditText edtBirthDateEightChildren;
    public final TextInputEditText edtBirthDateEighteenChildren;
    public final TextInputEditText edtBirthDateElevenChildren;
    public final TextInputEditText edtBirthDateFather;
    public final TextInputEditText edtBirthDateFifteenChildren;
    public final TextInputEditText edtBirthDateFifthChildren;
    public final TextInputEditText edtBirthDateFirstChildren;
    public final TextInputEditText edtBirthDateFourteenChildren;
    public final TextInputEditText edtBirthDateFourthChildren;
    public final TextInputEditText edtBirthDateNineChildren;
    public final TextInputEditText edtBirthDateNineteenChildren;
    public final TextInputEditText edtBirthDateSecondChildren;
    public final TextInputEditText edtBirthDateSevenChildren;
    public final TextInputEditText edtBirthDateSeventeenChildren;
    public final TextInputEditText edtBirthDateSixteenChildren;
    public final TextInputEditText edtBirthDateSixthChildren;
    public final TextInputEditText edtBirthDateSpouse;
    public final TextInputEditText edtBirthDateTenChildren;
    public final TextInputEditText edtBirthDateThirdChildren;
    public final TextInputEditText edtBirthDateThirteenChildren;
    public final TextInputEditText edtBirthDateTwelveChildren;
    public final TextInputEditText edtBirthDateTwentyChildren;
    public final TextInputEditText edtChildren;
    public final TextInputEditText edtMaritalStatus;
    public final ImageView imgKKPhoto;
    public final ImageView imgKKUpload;
    public final ImageView imgKtpPhoto;
    public final ImageView imgKtpUpload;
    public final ConstraintLayout mainContainer;
    public final AppCompatRadioButton rbFemale;
    public final AppCompatRadioButton rbMale;
    public final RadioGroup rgChooseGender;
    private final ScrollView rootView;
    public final TextInputLayout tilAddressPostalCode;
    public final TextInputLayout tilBirthDateEightChildren;
    public final TextInputLayout tilBirthDateEighteenChildren;
    public final TextInputLayout tilBirthDateElevenChildren;
    public final TextInputLayout tilBirthDateFather;
    public final TextInputLayout tilBirthDateFifteenChildren;
    public final TextInputLayout tilBirthDateFifthChildren;
    public final TextInputLayout tilBirthDateFirstChildren;
    public final TextInputLayout tilBirthDateFourteenChildren;
    public final TextInputLayout tilBirthDateFourthChildren;
    public final TextInputLayout tilBirthDateNineChildren;
    public final TextInputLayout tilBirthDateNineteenChildren;
    public final TextInputLayout tilBirthDateSecondChildren;
    public final TextInputLayout tilBirthDateSevenChildren;
    public final TextInputLayout tilBirthDateSeventeenChildren;
    public final TextInputLayout tilBirthDateSixteenChildren;
    public final TextInputLayout tilBirthDateSixthChildren;
    public final TextInputLayout tilBirthDateSpouse;
    public final TextInputLayout tilBirthDateTenChildren;
    public final TextInputLayout tilBirthDateThirdChildren;
    public final TextInputLayout tilBirthDateThirteenChildren;
    public final TextInputLayout tilBirthDateTwelveChildren;
    public final TextInputLayout tilBirthDateTwentyChildren;
    public final TextInputLayout tilChildren;
    public final TextInputLayout tilEightChild;
    public final TextInputLayout tilEighteenChild;
    public final TextInputLayout tilElevenChild;
    public final TextInputLayout tilFatherName;
    public final TextInputLayout tilFifteenChild;
    public final TextInputLayout tilFifthChild;
    public final TextInputLayout tilFirstChild;
    public final TextInputLayout tilFourteenChild;
    public final TextInputLayout tilFourthChild;
    public final TextInputLayout tilMaritalStatus;
    public final TextInputLayout tilMotherName;
    public final TextInputLayout tilNineChild;
    public final TextInputLayout tilNineteenChild;
    public final TextInputLayout tilParticipantAddress;
    public final TextInputLayout tilSecondChild;
    public final TextInputLayout tilSevenChild;
    public final TextInputLayout tilSeventeenChild;
    public final TextInputLayout tilSixteenChild;
    public final TextInputLayout tilSixthChild;
    public final TextInputLayout tilSpouseName;
    public final TextInputLayout tilTenChild;
    public final TextInputLayout tilThirdChild;
    public final TextInputLayout tilThirteenChild;
    public final TextInputLayout tilTwelveChild;
    public final TextInputLayout tilTwentyChild;
    public final TextView tvChildren;
    public final TextView tvGender;
    public final TextView tvKKError;
    public final TextView tvKtpError;
    public final TextView tvReminderVerifyDataPersonal;
    public final TextView tvScanKK;
    public final TextView tvScanKKLabel;
    public final TextView tvScanKTP;
    public final TextView tvScanKTPLabel;

    private FragmentAsikActiveParticipantOthersStepFourBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ConstraintLayout constraintLayout, LinearLayout linearLayout, CardView cardView, CardView cardView2, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, TextInputEditText textInputEditText8, TextInputEditText textInputEditText9, TextInputEditText textInputEditText10, TextInputEditText textInputEditText11, TextInputEditText textInputEditText12, TextInputEditText textInputEditText13, TextInputEditText textInputEditText14, TextInputEditText textInputEditText15, TextInputEditText textInputEditText16, TextInputEditText textInputEditText17, TextInputEditText textInputEditText18, TextInputEditText textInputEditText19, TextInputEditText textInputEditText20, TextInputEditText textInputEditText21, TextInputEditText textInputEditText22, TextInputEditText textInputEditText23, TextInputEditText textInputEditText24, TextInputEditText textInputEditText25, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout2, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextInputLayout textInputLayout13, TextInputLayout textInputLayout14, TextInputLayout textInputLayout15, TextInputLayout textInputLayout16, TextInputLayout textInputLayout17, TextInputLayout textInputLayout18, TextInputLayout textInputLayout19, TextInputLayout textInputLayout20, TextInputLayout textInputLayout21, TextInputLayout textInputLayout22, TextInputLayout textInputLayout23, TextInputLayout textInputLayout24, TextInputLayout textInputLayout25, TextInputLayout textInputLayout26, TextInputLayout textInputLayout27, TextInputLayout textInputLayout28, TextInputLayout textInputLayout29, TextInputLayout textInputLayout30, TextInputLayout textInputLayout31, TextInputLayout textInputLayout32, TextInputLayout textInputLayout33, TextInputLayout textInputLayout34, TextInputLayout textInputLayout35, TextInputLayout textInputLayout36, TextInputLayout textInputLayout37, TextInputLayout textInputLayout38, TextInputLayout textInputLayout39, TextInputLayout textInputLayout40, TextInputLayout textInputLayout41, TextInputLayout textInputLayout42, TextInputLayout textInputLayout43, TextInputLayout textInputLayout44, TextInputLayout textInputLayout45, TextInputLayout textInputLayout46, TextInputLayout textInputLayout47, TextInputLayout textInputLayout48, TextInputLayout textInputLayout49, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = scrollView;
        this.btnMin = materialButton;
        this.btnNext = materialButton2;
        this.btnPlus = materialButton3;
        this.childrenContainer = constraintLayout;
        this.childrenNameContainer = linearLayout;
        this.cvScanKK = cardView;
        this.cvScanKtp = cardView2;
        this.edtAddressPostalCode = textInputEditText;
        this.edtBirthDateEightChildren = textInputEditText2;
        this.edtBirthDateEighteenChildren = textInputEditText3;
        this.edtBirthDateElevenChildren = textInputEditText4;
        this.edtBirthDateFather = textInputEditText5;
        this.edtBirthDateFifteenChildren = textInputEditText6;
        this.edtBirthDateFifthChildren = textInputEditText7;
        this.edtBirthDateFirstChildren = textInputEditText8;
        this.edtBirthDateFourteenChildren = textInputEditText9;
        this.edtBirthDateFourthChildren = textInputEditText10;
        this.edtBirthDateNineChildren = textInputEditText11;
        this.edtBirthDateNineteenChildren = textInputEditText12;
        this.edtBirthDateSecondChildren = textInputEditText13;
        this.edtBirthDateSevenChildren = textInputEditText14;
        this.edtBirthDateSeventeenChildren = textInputEditText15;
        this.edtBirthDateSixteenChildren = textInputEditText16;
        this.edtBirthDateSixthChildren = textInputEditText17;
        this.edtBirthDateSpouse = textInputEditText18;
        this.edtBirthDateTenChildren = textInputEditText19;
        this.edtBirthDateThirdChildren = textInputEditText20;
        this.edtBirthDateThirteenChildren = textInputEditText21;
        this.edtBirthDateTwelveChildren = textInputEditText22;
        this.edtBirthDateTwentyChildren = textInputEditText23;
        this.edtChildren = textInputEditText24;
        this.edtMaritalStatus = textInputEditText25;
        this.imgKKPhoto = imageView;
        this.imgKKUpload = imageView2;
        this.imgKtpPhoto = imageView3;
        this.imgKtpUpload = imageView4;
        this.mainContainer = constraintLayout2;
        this.rbFemale = appCompatRadioButton;
        this.rbMale = appCompatRadioButton2;
        this.rgChooseGender = radioGroup;
        this.tilAddressPostalCode = textInputLayout;
        this.tilBirthDateEightChildren = textInputLayout2;
        this.tilBirthDateEighteenChildren = textInputLayout3;
        this.tilBirthDateElevenChildren = textInputLayout4;
        this.tilBirthDateFather = textInputLayout5;
        this.tilBirthDateFifteenChildren = textInputLayout6;
        this.tilBirthDateFifthChildren = textInputLayout7;
        this.tilBirthDateFirstChildren = textInputLayout8;
        this.tilBirthDateFourteenChildren = textInputLayout9;
        this.tilBirthDateFourthChildren = textInputLayout10;
        this.tilBirthDateNineChildren = textInputLayout11;
        this.tilBirthDateNineteenChildren = textInputLayout12;
        this.tilBirthDateSecondChildren = textInputLayout13;
        this.tilBirthDateSevenChildren = textInputLayout14;
        this.tilBirthDateSeventeenChildren = textInputLayout15;
        this.tilBirthDateSixteenChildren = textInputLayout16;
        this.tilBirthDateSixthChildren = textInputLayout17;
        this.tilBirthDateSpouse = textInputLayout18;
        this.tilBirthDateTenChildren = textInputLayout19;
        this.tilBirthDateThirdChildren = textInputLayout20;
        this.tilBirthDateThirteenChildren = textInputLayout21;
        this.tilBirthDateTwelveChildren = textInputLayout22;
        this.tilBirthDateTwentyChildren = textInputLayout23;
        this.tilChildren = textInputLayout24;
        this.tilEightChild = textInputLayout25;
        this.tilEighteenChild = textInputLayout26;
        this.tilElevenChild = textInputLayout27;
        this.tilFatherName = textInputLayout28;
        this.tilFifteenChild = textInputLayout29;
        this.tilFifthChild = textInputLayout30;
        this.tilFirstChild = textInputLayout31;
        this.tilFourteenChild = textInputLayout32;
        this.tilFourthChild = textInputLayout33;
        this.tilMaritalStatus = textInputLayout34;
        this.tilMotherName = textInputLayout35;
        this.tilNineChild = textInputLayout36;
        this.tilNineteenChild = textInputLayout37;
        this.tilParticipantAddress = textInputLayout38;
        this.tilSecondChild = textInputLayout39;
        this.tilSevenChild = textInputLayout40;
        this.tilSeventeenChild = textInputLayout41;
        this.tilSixteenChild = textInputLayout42;
        this.tilSixthChild = textInputLayout43;
        this.tilSpouseName = textInputLayout44;
        this.tilTenChild = textInputLayout45;
        this.tilThirdChild = textInputLayout46;
        this.tilThirteenChild = textInputLayout47;
        this.tilTwelveChild = textInputLayout48;
        this.tilTwentyChild = textInputLayout49;
        this.tvChildren = textView;
        this.tvGender = textView2;
        this.tvKKError = textView3;
        this.tvKtpError = textView4;
        this.tvReminderVerifyDataPersonal = textView5;
        this.tvScanKK = textView6;
        this.tvScanKKLabel = textView7;
        this.tvScanKTP = textView8;
        this.tvScanKTPLabel = textView9;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantOthersStepFourBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantOthersStepFourBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_others_step_four, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantOthersStepFourBinding bind(View view) {
        int i = R.id.btnMin;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnMin);
        if (materialButton != null) {
            i = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton2 != null) {
                i = R.id.btnPlus;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPlus);
                if (materialButton3 != null) {
                    i = R.id.childrenContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.childrenContainer);
                    if (constraintLayout != null) {
                        i = R.id.childrenNameContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.childrenNameContainer);
                        if (linearLayout != null) {
                            i = R.id.cvScanKK;
                            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvScanKK);
                            if (cardView != null) {
                                i = R.id.cvScanKtp;
                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvScanKtp);
                                if (cardView2 != null) {
                                    i = R.id.edtAddressPostalCode;
                                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtAddressPostalCode);
                                    if (textInputEditText != null) {
                                        i = R.id.edtBirthDateEightChildren;
                                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateEightChildren);
                                        if (textInputEditText2 != null) {
                                            i = R.id.edtBirthDateEighteenChildren;
                                            TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateEighteenChildren);
                                            if (textInputEditText3 != null) {
                                                i = R.id.edtBirthDateElevenChildren;
                                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateElevenChildren);
                                                if (textInputEditText4 != null) {
                                                    i = R.id.edtBirthDateFather;
                                                    TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFather);
                                                    if (textInputEditText5 != null) {
                                                        i = R.id.edtBirthDateFifteenChildren;
                                                        TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFifteenChildren);
                                                        if (textInputEditText6 != null) {
                                                            i = R.id.edtBirthDateFifthChildren;
                                                            TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFifthChildren);
                                                            if (textInputEditText7 != null) {
                                                                i = R.id.edtBirthDateFirstChildren;
                                                                TextInputEditText textInputEditText8 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFirstChildren);
                                                                if (textInputEditText8 != null) {
                                                                    i = R.id.edtBirthDateFourteenChildren;
                                                                    TextInputEditText textInputEditText9 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFourteenChildren);
                                                                    if (textInputEditText9 != null) {
                                                                        i = R.id.edtBirthDateFourthChildren;
                                                                        TextInputEditText textInputEditText10 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateFourthChildren);
                                                                        if (textInputEditText10 != null) {
                                                                            i = R.id.edtBirthDateNineChildren;
                                                                            TextInputEditText textInputEditText11 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateNineChildren);
                                                                            if (textInputEditText11 != null) {
                                                                                i = R.id.edtBirthDateNineteenChildren;
                                                                                TextInputEditText textInputEditText12 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateNineteenChildren);
                                                                                if (textInputEditText12 != null) {
                                                                                    i = R.id.edtBirthDateSecondChildren;
                                                                                    TextInputEditText textInputEditText13 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSecondChildren);
                                                                                    if (textInputEditText13 != null) {
                                                                                        i = R.id.edtBirthDateSevenChildren;
                                                                                        TextInputEditText textInputEditText14 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSevenChildren);
                                                                                        if (textInputEditText14 != null) {
                                                                                            i = R.id.edtBirthDateSeventeenChildren;
                                                                                            TextInputEditText textInputEditText15 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSeventeenChildren);
                                                                                            if (textInputEditText15 != null) {
                                                                                                TextInputEditText textInputEditText16 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSixteenChildren);
                                                                                                if (textInputEditText16 != null) {
                                                                                                    TextInputEditText textInputEditText17 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSixthChildren);
                                                                                                    if (textInputEditText17 != null) {
                                                                                                        TextInputEditText textInputEditText18 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateSpouse);
                                                                                                        if (textInputEditText18 != null) {
                                                                                                            TextInputEditText textInputEditText19 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateTenChildren);
                                                                                                            if (textInputEditText19 != null) {
                                                                                                                TextInputEditText textInputEditText20 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateThirdChildren);
                                                                                                                if (textInputEditText20 != null) {
                                                                                                                    TextInputEditText textInputEditText21 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateThirteenChildren);
                                                                                                                    if (textInputEditText21 != null) {
                                                                                                                        TextInputEditText textInputEditText22 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateTwelveChildren);
                                                                                                                        if (textInputEditText22 != null) {
                                                                                                                            TextInputEditText textInputEditText23 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDateTwentyChildren);
                                                                                                                            if (textInputEditText23 != null) {
                                                                                                                                TextInputEditText textInputEditText24 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChildren);
                                                                                                                                if (textInputEditText24 != null) {
                                                                                                                                    TextInputEditText textInputEditText25 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtMaritalStatus);
                                                                                                                                    if (textInputEditText25 != null) {
                                                                                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKKPhoto);
                                                                                                                                        if (imageView != null) {
                                                                                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKKUpload);
                                                                                                                                            if (imageView2 != null) {
                                                                                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpPhoto);
                                                                                                                                                if (imageView3 != null) {
                                                                                                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgKtpUpload);
                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                                                                                                                                                        if (constraintLayout2 != null) {
                                                                                                                                                            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbFemale);
                                                                                                                                                            if (appCompatRadioButton != null) {
                                                                                                                                                                AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbMale);
                                                                                                                                                                if (appCompatRadioButton2 != null) {
                                                                                                                                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseGender);
                                                                                                                                                                    if (radioGroup != null) {
                                                                                                                                                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilAddressPostalCode);
                                                                                                                                                                        if (textInputLayout != null) {
                                                                                                                                                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateEightChildren);
                                                                                                                                                                            if (textInputLayout2 != null) {
                                                                                                                                                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateEighteenChildren);
                                                                                                                                                                                if (textInputLayout3 != null) {
                                                                                                                                                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateElevenChildren);
                                                                                                                                                                                    if (textInputLayout4 != null) {
                                                                                                                                                                                        TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFather);
                                                                                                                                                                                        if (textInputLayout5 != null) {
                                                                                                                                                                                            TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFifteenChildren);
                                                                                                                                                                                            if (textInputLayout6 != null) {
                                                                                                                                                                                                TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFifthChildren);
                                                                                                                                                                                                if (textInputLayout7 != null) {
                                                                                                                                                                                                    TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFirstChildren);
                                                                                                                                                                                                    if (textInputLayout8 != null) {
                                                                                                                                                                                                        TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFourteenChildren);
                                                                                                                                                                                                        if (textInputLayout9 != null) {
                                                                                                                                                                                                            TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateFourthChildren);
                                                                                                                                                                                                            if (textInputLayout10 != null) {
                                                                                                                                                                                                                TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateNineChildren);
                                                                                                                                                                                                                if (textInputLayout11 != null) {
                                                                                                                                                                                                                    TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateNineteenChildren);
                                                                                                                                                                                                                    if (textInputLayout12 != null) {
                                                                                                                                                                                                                        TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSecondChildren);
                                                                                                                                                                                                                        if (textInputLayout13 != null) {
                                                                                                                                                                                                                            TextInputLayout textInputLayout14 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSevenChildren);
                                                                                                                                                                                                                            if (textInputLayout14 != null) {
                                                                                                                                                                                                                                TextInputLayout textInputLayout15 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSeventeenChildren);
                                                                                                                                                                                                                                if (textInputLayout15 != null) {
                                                                                                                                                                                                                                    TextInputLayout textInputLayout16 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSixteenChildren);
                                                                                                                                                                                                                                    if (textInputLayout16 != null) {
                                                                                                                                                                                                                                        TextInputLayout textInputLayout17 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSixthChildren);
                                                                                                                                                                                                                                        if (textInputLayout17 != null) {
                                                                                                                                                                                                                                            TextInputLayout textInputLayout18 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateSpouse);
                                                                                                                                                                                                                                            if (textInputLayout18 != null) {
                                                                                                                                                                                                                                                TextInputLayout textInputLayout19 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateTenChildren);
                                                                                                                                                                                                                                                if (textInputLayout19 != null) {
                                                                                                                                                                                                                                                    TextInputLayout textInputLayout20 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateThirdChildren);
                                                                                                                                                                                                                                                    if (textInputLayout20 != null) {
                                                                                                                                                                                                                                                        TextInputLayout textInputLayout21 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateThirteenChildren);
                                                                                                                                                                                                                                                        if (textInputLayout21 != null) {
                                                                                                                                                                                                                                                            TextInputLayout textInputLayout22 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateTwelveChildren);
                                                                                                                                                                                                                                                            if (textInputLayout22 != null) {
                                                                                                                                                                                                                                                                TextInputLayout textInputLayout23 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDateTwentyChildren);
                                                                                                                                                                                                                                                                if (textInputLayout23 != null) {
                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout24 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChildren);
                                                                                                                                                                                                                                                                    if (textInputLayout24 != null) {
                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout25 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEightChild);
                                                                                                                                                                                                                                                                        if (textInputLayout25 != null) {
                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout26 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEighteenChild);
                                                                                                                                                                                                                                                                            if (textInputLayout26 != null) {
                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout27 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilElevenChild);
                                                                                                                                                                                                                                                                                if (textInputLayout27 != null) {
                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout28 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFatherName);
                                                                                                                                                                                                                                                                                    if (textInputLayout28 != null) {
                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout29 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFifteenChild);
                                                                                                                                                                                                                                                                                        if (textInputLayout29 != null) {
                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout30 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFifthChild);
                                                                                                                                                                                                                                                                                            if (textInputLayout30 != null) {
                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout31 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFirstChild);
                                                                                                                                                                                                                                                                                                if (textInputLayout31 != null) {
                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout32 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFourteenChild);
                                                                                                                                                                                                                                                                                                    if (textInputLayout32 != null) {
                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout33 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFourthChild);
                                                                                                                                                                                                                                                                                                        if (textInputLayout33 != null) {
                                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout34 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMaritalStatus);
                                                                                                                                                                                                                                                                                                            if (textInputLayout34 != null) {
                                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout35 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMotherName);
                                                                                                                                                                                                                                                                                                                if (textInputLayout35 != null) {
                                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout36 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNineChild);
                                                                                                                                                                                                                                                                                                                    if (textInputLayout36 != null) {
                                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout37 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNineteenChild);
                                                                                                                                                                                                                                                                                                                        if (textInputLayout37 != null) {
                                                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout38 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilParticipantAddress);
                                                                                                                                                                                                                                                                                                                            if (textInputLayout38 != null) {
                                                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout39 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSecondChild);
                                                                                                                                                                                                                                                                                                                                if (textInputLayout39 != null) {
                                                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout40 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSevenChild);
                                                                                                                                                                                                                                                                                                                                    if (textInputLayout40 != null) {
                                                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout41 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSeventeenChild);
                                                                                                                                                                                                                                                                                                                                        if (textInputLayout41 != null) {
                                                                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout42 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSixteenChild);
                                                                                                                                                                                                                                                                                                                                            if (textInputLayout42 != null) {
                                                                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout43 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSixthChild);
                                                                                                                                                                                                                                                                                                                                                if (textInputLayout43 != null) {
                                                                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout44 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSpouseName);
                                                                                                                                                                                                                                                                                                                                                    if (textInputLayout44 != null) {
                                                                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout45 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTenChild);
                                                                                                                                                                                                                                                                                                                                                        if (textInputLayout45 != null) {
                                                                                                                                                                                                                                                                                                                                                            TextInputLayout textInputLayout46 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilThirdChild);
                                                                                                                                                                                                                                                                                                                                                            if (textInputLayout46 != null) {
                                                                                                                                                                                                                                                                                                                                                                TextInputLayout textInputLayout47 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilThirteenChild);
                                                                                                                                                                                                                                                                                                                                                                if (textInputLayout47 != null) {
                                                                                                                                                                                                                                                                                                                                                                    TextInputLayout textInputLayout48 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTwelveChild);
                                                                                                                                                                                                                                                                                                                                                                    if (textInputLayout48 != null) {
                                                                                                                                                                                                                                                                                                                                                                        TextInputLayout textInputLayout49 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilTwentyChild);
                                                                                                                                                                                                                                                                                                                                                                        if (textInputLayout49 != null) {
                                                                                                                                                                                                                                                                                                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChildren);
                                                                                                                                                                                                                                                                                                                                                                            if (textView != null) {
                                                                                                                                                                                                                                                                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGender);
                                                                                                                                                                                                                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKKError);
                                                                                                                                                                                                                                                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKtpError);
                                                                                                                                                                                                                                                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                                                                                                                                                                                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKK);
                                                                                                                                                                                                                                                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKKLabel);
                                                                                                                                                                                                                                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTP);
                                                                                                                                                                                                                                                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvScanKTPLabel);
                                                                                                                                                                                                                                                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                return new FragmentAsikActiveParticipantOthersStepFourBinding((ScrollView) view, materialButton, materialButton2, materialButton3, constraintLayout, linearLayout, cardView, cardView2, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, textInputEditText13, textInputEditText14, textInputEditText15, textInputEditText16, textInputEditText17, textInputEditText18, textInputEditText19, textInputEditText20, textInputEditText21, textInputEditText22, textInputEditText23, textInputEditText24, textInputEditText25, imageView, imageView2, imageView3, imageView4, constraintLayout2, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout14, textInputLayout15, textInputLayout16, textInputLayout17, textInputLayout18, textInputLayout19, textInputLayout20, textInputLayout21, textInputLayout22, textInputLayout23, textInputLayout24, textInputLayout25, textInputLayout26, textInputLayout27, textInputLayout28, textInputLayout29, textInputLayout30, textInputLayout31, textInputLayout32, textInputLayout33, textInputLayout34, textInputLayout35, textInputLayout36, textInputLayout37, textInputLayout38, textInputLayout39, textInputLayout40, textInputLayout41, textInputLayout42, textInputLayout43, textInputLayout44, textInputLayout45, textInputLayout46, textInputLayout47, textInputLayout48, textInputLayout49, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tvScanKTPLabel;
                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tvScanKTP;
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tvScanKKLabel;
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tvScanKK;
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tvReminderVerifyDataPersonal;
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tvKtpError;
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tvKKError;
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tvGender;
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tvChildren;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tilTwentyChild;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tilTwelveChild;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tilThirteenChild;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                                i = R.id.tilThirdChild;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                            i = R.id.tilTenChild;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                                        i = R.id.tilSpouseName;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                                    i = R.id.tilSixthChild;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                                i = R.id.tilSixteenChild;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                            i = R.id.tilSeventeenChild;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                                        i = R.id.tilSevenChild;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                                    i = R.id.tilSecondChild;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                                i = R.id.tilParticipantAddress;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                            i = R.id.tilNineteenChild;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                                        i = R.id.tilNineChild;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                                    i = R.id.tilMotherName;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                                i = R.id.tilMaritalStatus;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                            i = R.id.tilFourthChild;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                                        i = R.id.tilFourteenChild;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                                    i = R.id.tilFirstChild;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                                i = R.id.tilFifthChild;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                            i = R.id.tilFifteenChild;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                                        i = R.id.tilFatherName;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                                    i = R.id.tilElevenChild;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                i = R.id.tilEighteenChild;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                            i = R.id.tilEightChild;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                                        i = R.id.tilChildren;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                                    i = R.id.tilBirthDateTwentyChildren;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                i = R.id.tilBirthDateTwelveChildren;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                            i = R.id.tilBirthDateThirteenChildren;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                        i = R.id.tilBirthDateThirdChildren;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                                    i = R.id.tilBirthDateTenChildren;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                i = R.id.tilBirthDateSpouse;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            i = R.id.tilBirthDateSixthChildren;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        i = R.id.tilBirthDateSixteenChildren;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                                    i = R.id.tilBirthDateSeventeenChildren;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                i = R.id.tilBirthDateSevenChildren;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                            i = R.id.tilBirthDateSecondChildren;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                        i = R.id.tilBirthDateNineteenChildren;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    i = R.id.tilBirthDateNineChildren;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                i = R.id.tilBirthDateFourthChildren;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            i = R.id.tilBirthDateFourteenChildren;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        i = R.id.tilBirthDateFirstChildren;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    i = R.id.tilBirthDateFifthChildren;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                i = R.id.tilBirthDateFifteenChildren;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i = R.id.tilBirthDateFather;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i = R.id.tilBirthDateElevenChildren;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i = R.id.tilBirthDateEighteenChildren;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i = R.id.tilBirthDateEightChildren;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.tilAddressPostalCode;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.rgChooseGender;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.rbMale;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.rbFemale;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.mainContainer;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.imgKtpUpload;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.imgKtpPhoto;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.imgKKUpload;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.imgKKPhoto;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.edtMaritalStatus;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.edtChildren;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.edtBirthDateTwentyChildren;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.edtBirthDateTwelveChildren;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.edtBirthDateThirteenChildren;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.edtBirthDateThirdChildren;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.edtBirthDateTenChildren;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.edtBirthDateSpouse;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.edtBirthDateSixthChildren;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.edtBirthDateSixteenChildren;
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
