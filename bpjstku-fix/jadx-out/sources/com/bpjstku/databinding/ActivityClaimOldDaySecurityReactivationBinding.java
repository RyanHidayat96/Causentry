package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimOldDaySecurityReactivationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final CardView cvCaptureImage;
    public final TextInputEditText edtChooseJobFirst;
    public final TextInputEditText edtChooseJobSecond;
    public final TextInputEditText edtChooseLocation;
    public final TextInputEditText edtFamilyCardNumber;
    public final ImageView imgBanner;
    public final ImageView imgCapture;
    public final ImageButton imgSelfiePhoto;
    public final MaterialToolbar layoutToolbar;
    public final AppCompatRadioButton rb100;
    public final AppCompatRadioButton rb50;
    public final AppCompatRadioButton rbNo;
    public final AppCompatRadioButton rbYes;
    public final RadioGroup rgChooseIsBpu;
    public final RadioGroup rgMonthlyFee;
    private final LinearLayout rootView;
    public final TextInputLayout tilChooseJobFirst;
    public final TextInputLayout tilChooseJobSecond;
    public final TextInputLayout tilChooseLocation;
    public final TextInputLayout tilFamilyCardNumber;
    public final TextView tvCaptureImage;
    public final TextView tvCaptureLabel;
    public final TextView tvFamilyCardNumber;
    public final TextView tvMonthlyFee;
    public final TextView tvNumberFive;
    public final TextView tvNumberFour;
    public final TextView tvNumberOne;
    public final TextView tvNumberSix;
    public final TextView tvNumberThree;
    public final TextView tvNumberTwo;
    public final TextView tvQuestionReactivation;
    public final TextView tvQuestionWork;
    public final TextView tvRedactionReactivation;
    public final TextView tvToolbarTitle;
    public final TextView tvWorkLocation;

    private ActivityClaimOldDaySecurityReactivationBinding(LinearLayout linearLayout, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, CardView cardView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, ImageView imageView, ImageView imageView2, ImageButton imageButton, MaterialToolbar materialToolbar, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, AppCompatRadioButton appCompatRadioButton4, RadioGroup radioGroup, RadioGroup radioGroup2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.rootView = linearLayout;
        this.btnNext = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.cvCaptureImage = cardView;
        this.edtChooseJobFirst = textInputEditText;
        this.edtChooseJobSecond = textInputEditText2;
        this.edtChooseLocation = textInputEditText3;
        this.edtFamilyCardNumber = textInputEditText4;
        this.imgBanner = imageView;
        this.imgCapture = imageView2;
        this.imgSelfiePhoto = imageButton;
        this.layoutToolbar = materialToolbar;
        this.rb100 = appCompatRadioButton;
        this.rb50 = appCompatRadioButton2;
        this.rbNo = appCompatRadioButton3;
        this.rbYes = appCompatRadioButton4;
        this.rgChooseIsBpu = radioGroup;
        this.rgMonthlyFee = radioGroup2;
        this.tilChooseJobFirst = textInputLayout;
        this.tilChooseJobSecond = textInputLayout2;
        this.tilChooseLocation = textInputLayout3;
        this.tilFamilyCardNumber = textInputLayout4;
        this.tvCaptureImage = textView;
        this.tvCaptureLabel = textView2;
        this.tvFamilyCardNumber = textView3;
        this.tvMonthlyFee = textView4;
        this.tvNumberFive = textView5;
        this.tvNumberFour = textView6;
        this.tvNumberOne = textView7;
        this.tvNumberSix = textView8;
        this.tvNumberThree = textView9;
        this.tvNumberTwo = textView10;
        this.tvQuestionReactivation = textView11;
        this.tvQuestionWork = textView12;
        this.tvRedactionReactivation = textView13;
        this.tvToolbarTitle = textView14;
        this.tvWorkLocation = textView15;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimOldDaySecurityReactivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimOldDaySecurityReactivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_old_day_security_reactivation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimOldDaySecurityReactivationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.cvCaptureImage;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvCaptureImage);
                if (cardView != null) {
                    i = R.id.edtChooseJobFirst;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJobFirst);
                    if (textInputEditText != null) {
                        i = R.id.edtChooseJobSecond;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJobSecond);
                        if (textInputEditText2 != null) {
                            i = R.id.edtChooseLocation;
                            TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseLocation);
                            if (textInputEditText3 != null) {
                                i = R.id.edtFamilyCardNumber;
                                TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFamilyCardNumber);
                                if (textInputEditText4 != null) {
                                    i = R.id.imgBanner;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBanner);
                                    if (imageView != null) {
                                        i = R.id.imgCapture;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCapture);
                                        if (imageView2 != null) {
                                            i = R.id.imgSelfiePhoto;
                                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.imgSelfiePhoto);
                                            if (imageButton != null) {
                                                i = R.id.layoutToolbar;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                                                if (materialToolbar != null) {
                                                    i = R.id.rb100;
                                                    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rb100);
                                                    if (appCompatRadioButton != null) {
                                                        i = R.id.rb50;
                                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rb50);
                                                        if (appCompatRadioButton2 != null) {
                                                            i = R.id.rbNo;
                                                            AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbNo);
                                                            if (appCompatRadioButton3 != null) {
                                                                i = R.id.rbYes;
                                                                AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbYes);
                                                                if (appCompatRadioButton4 != null) {
                                                                    i = R.id.rgChooseIsBpu;
                                                                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseIsBpu);
                                                                    if (radioGroup != null) {
                                                                        i = R.id.rgMonthlyFee;
                                                                        RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgMonthlyFee);
                                                                        if (radioGroup2 != null) {
                                                                            i = R.id.tilChooseJobFirst;
                                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobFirst);
                                                                            if (textInputLayout != null) {
                                                                                i = R.id.tilChooseJobSecond;
                                                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobSecond);
                                                                                if (textInputLayout2 != null) {
                                                                                    i = R.id.tilChooseLocation;
                                                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseLocation);
                                                                                    if (textInputLayout3 != null) {
                                                                                        i = R.id.tilFamilyCardNumber;
                                                                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFamilyCardNumber);
                                                                                        if (textInputLayout4 != null) {
                                                                                            i = R.id.tvCaptureImage;
                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCaptureImage);
                                                                                            if (textView != null) {
                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvCaptureLabel);
                                                                                                if (textView2 != null) {
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFamilyCardNumber);
                                                                                                    if (textView3 != null) {
                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMonthlyFee);
                                                                                                        if (textView4 != null) {
                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberFive);
                                                                                                            if (textView5 != null) {
                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberFour);
                                                                                                                if (textView6 != null) {
                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberOne);
                                                                                                                    if (textView7 != null) {
                                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberSix);
                                                                                                                        if (textView8 != null) {
                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberThree);
                                                                                                                            if (textView9 != null) {
                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberTwo);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQuestionReactivation);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQuestionWork);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRedactionReactivation);
                                                                                                                                            if (textView13 != null) {
                                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
                                                                                                                                                if (textView14 != null) {
                                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkLocation);
                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                        return new ActivityClaimOldDaySecurityReactivationBinding((LinearLayout) view, materialButton, appCompatCheckBox, cardView, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, imageView, imageView2, imageButton, materialToolbar, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, appCompatRadioButton4, radioGroup, radioGroup2, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
                                                                                                                                                    }
                                                                                                                                                    i = R.id.tvWorkLocation;
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvToolbarTitle;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvRedactionReactivation;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvQuestionWork;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvQuestionReactivation;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvNumberTwo;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvNumberThree;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvNumberSix;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvNumberOne;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvNumberFour;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvNumberFive;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvMonthlyFee;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvFamilyCardNumber;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvCaptureLabel;
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
