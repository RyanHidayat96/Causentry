package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentClaimOldDaySecurityReactivationBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final MaterialButton btnNext;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final ConstraintLayout clReactivation;
    public final CardView cvCaptureImage;
    public final Barrier dynamicBarrier;
    public final TextInputEditText edtChooseJobFirst;
    public final TextInputEditText edtChooseJobSecond;
    public final TextInputEditText edtChooseLocation;
    public final TextInputEditText edtFamilyCardNumber;
    public final TextInputEditText edtReason;
    public final ImageView imgBanner;
    public final ImageView imgCapture;
    public final ImageButton imgSelfiePhoto;
    public final AppCompatRadioButton rbHealthy;
    public final AppCompatRadioButton rbNo;
    public final AppCompatRadioButton rbSick;
    public final AppCompatRadioButton rbYes;
    public final RadioGroup rgChooseCondition;
    public final RadioGroup rgChooseIsBpu;
    public final RadioGroup rgMonthlyFee;
    public final RadioGroup rgReason;
    private final ScrollView rootView;
    public final TextInputLayout tilChooseJobFirst;
    public final TextInputLayout tilChooseJobSecond;
    public final TextInputLayout tilChooseLocation;
    public final TextInputLayout tilFamilyCardNumber;
    public final TextInputLayout tilReason;
    public final TextView tvCaptureImage;
    public final TextView tvCaptureLabel;
    public final TextView tvFamilyCardNumber;
    public final TextView tvInfoTuition;
    public final TextView tvMemberCondition;
    public final TextView tvMonthlyFee;
    public final TextView tvNumberFive;
    public final TextView tvNumberFour;
    public final TextView tvNumberOne;
    public final TextView tvNumberOnes;
    public final TextView tvNumberSix;
    public final TextView tvNumberThree;
    public final TextView tvNumberTwo;
    public final TextView tvNumberTwoReason;
    public final TextView tvQuestionReactivation;
    public final TextView tvQuestionWork;
    public final TextView tvReason;
    public final TextView tvRedactionReactivation;
    public final TextView tvWorkLocation;

    private FragmentClaimOldDaySecurityReactivationBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, AppCompatCheckBox appCompatCheckBox, ConstraintLayout constraintLayout, CardView cardView, Barrier barrier, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, ImageView imageView, ImageView imageView2, ImageButton imageButton, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, AppCompatRadioButton appCompatRadioButton3, AppCompatRadioButton appCompatRadioButton4, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, RadioGroup radioGroup4, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19) {
        this.rootView = scrollView;
        this.btnBack = materialButton;
        this.btnNext = materialButton2;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.clReactivation = constraintLayout;
        this.cvCaptureImage = cardView;
        this.dynamicBarrier = barrier;
        this.edtChooseJobFirst = textInputEditText;
        this.edtChooseJobSecond = textInputEditText2;
        this.edtChooseLocation = textInputEditText3;
        this.edtFamilyCardNumber = textInputEditText4;
        this.edtReason = textInputEditText5;
        this.imgBanner = imageView;
        this.imgCapture = imageView2;
        this.imgSelfiePhoto = imageButton;
        this.rbHealthy = appCompatRadioButton;
        this.rbNo = appCompatRadioButton2;
        this.rbSick = appCompatRadioButton3;
        this.rbYes = appCompatRadioButton4;
        this.rgChooseCondition = radioGroup;
        this.rgChooseIsBpu = radioGroup2;
        this.rgMonthlyFee = radioGroup3;
        this.rgReason = radioGroup4;
        this.tilChooseJobFirst = textInputLayout;
        this.tilChooseJobSecond = textInputLayout2;
        this.tilChooseLocation = textInputLayout3;
        this.tilFamilyCardNumber = textInputLayout4;
        this.tilReason = textInputLayout5;
        this.tvCaptureImage = textView;
        this.tvCaptureLabel = textView2;
        this.tvFamilyCardNumber = textView3;
        this.tvInfoTuition = textView4;
        this.tvMemberCondition = textView5;
        this.tvMonthlyFee = textView6;
        this.tvNumberFive = textView7;
        this.tvNumberFour = textView8;
        this.tvNumberOne = textView9;
        this.tvNumberOnes = textView10;
        this.tvNumberSix = textView11;
        this.tvNumberThree = textView12;
        this.tvNumberTwo = textView13;
        this.tvNumberTwoReason = textView14;
        this.tvQuestionReactivation = textView15;
        this.tvQuestionWork = textView16;
        this.tvReason = textView17;
        this.tvRedactionReactivation = textView18;
        this.tvWorkLocation = textView19;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDaySecurityReactivationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDaySecurityReactivationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_day_security_reactivation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDaySecurityReactivationBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton2 != null) {
                i = R.id.cbAgreeTermCondition;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
                if (appCompatCheckBox != null) {
                    i = R.id.clReactivation;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clReactivation);
                    if (constraintLayout != null) {
                        i = R.id.cvCaptureImage;
                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvCaptureImage);
                        if (cardView != null) {
                            i = R.id.dynamicBarrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.dynamicBarrier);
                            if (barrier != null) {
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
                                                i = R.id.edtReason;
                                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReason);
                                                if (textInputEditText5 != null) {
                                                    i = R.id.imgBanner;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBanner);
                                                    if (imageView != null) {
                                                        i = R.id.imgCapture;
                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCapture);
                                                        if (imageView2 != null) {
                                                            i = R.id.imgSelfiePhoto;
                                                            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.imgSelfiePhoto);
                                                            if (imageButton != null) {
                                                                i = R.id.rbHealthy;
                                                                AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbHealthy);
                                                                if (appCompatRadioButton != null) {
                                                                    i = R.id.rbNo;
                                                                    AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbNo);
                                                                    if (appCompatRadioButton2 != null) {
                                                                        i = R.id.rbSick;
                                                                        AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbSick);
                                                                        if (appCompatRadioButton3 != null) {
                                                                            i = R.id.rbYes;
                                                                            AppCompatRadioButton appCompatRadioButton4 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbYes);
                                                                            if (appCompatRadioButton4 != null) {
                                                                                i = R.id.rgChooseCondition;
                                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseCondition);
                                                                                if (radioGroup != null) {
                                                                                    i = R.id.rgChooseIsBpu;
                                                                                    RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseIsBpu);
                                                                                    if (radioGroup2 != null) {
                                                                                        i = R.id.rgMonthlyFee;
                                                                                        RadioGroup radioGroup3 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgMonthlyFee);
                                                                                        if (radioGroup3 != null) {
                                                                                            i = R.id.rgReason;
                                                                                            RadioGroup radioGroup4 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgReason);
                                                                                            if (radioGroup4 != null) {
                                                                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobFirst);
                                                                                                if (textInputLayout != null) {
                                                                                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJobSecond);
                                                                                                    if (textInputLayout2 != null) {
                                                                                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseLocation);
                                                                                                        if (textInputLayout3 != null) {
                                                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFamilyCardNumber);
                                                                                                            if (textInputLayout4 != null) {
                                                                                                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReason);
                                                                                                                if (textInputLayout5 != null) {
                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCaptureImage);
                                                                                                                    if (textView != null) {
                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvCaptureLabel);
                                                                                                                        if (textView2 != null) {
                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFamilyCardNumber);
                                                                                                                            if (textView3 != null) {
                                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoTuition);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMemberCondition);
                                                                                                                                    if (textView5 != null) {
                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMonthlyFee);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberFive);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberFour);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberOne);
                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberOnes);
                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberSix);
                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberThree);
                                                                                                                                                                if (textView12 != null) {
                                                                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberTwo);
                                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNumberTwoReason);
                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQuestionReactivation);
                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQuestionWork);
                                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReason);
                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRedactionReactivation);
                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkLocation);
                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                return new FragmentClaimOldDaySecurityReactivationBinding((ScrollView) view, materialButton, materialButton2, appCompatCheckBox, constraintLayout, cardView, barrier, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, imageView, imageView2, imageButton, appCompatRadioButton, appCompatRadioButton2, appCompatRadioButton3, appCompatRadioButton4, radioGroup, radioGroup2, radioGroup3, radioGroup4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19);
                                                                                                                                                                                            }
                                                                                                                                                                                            i = R.id.tvWorkLocation;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i = R.id.tvRedactionReactivation;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i = R.id.tvReason;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i = R.id.tvQuestionWork;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i = R.id.tvQuestionReactivation;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.tvNumberTwoReason;
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
                                                                                                                                                            i = R.id.tvNumberOnes;
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
                                                                                                                                        i = R.id.tvMemberCondition;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvInfoTuition;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvFamilyCardNumber;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvCaptureLabel;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvCaptureImage;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tilReason;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tilFamilyCardNumber;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tilChooseLocation;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tilChooseJobSecond;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tilChooseJobFirst;
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
