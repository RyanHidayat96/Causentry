package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDataUnmatchedComplaintBinding implements ViewBinding {
    public final MaterialButton btnSendComplaintDataUnMatched;
    public final View divQuestionSecond;
    public final TextInputEditText edtActualTotalEmployee;
    public final TextInputEditText edtActualWage;
    public final TextInputEditText edtChooseJamsostekIdNumber;
    public final TextInputEditText edtReportedTotalEmployee;
    public final TextInputEditText edtReportedWage;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final RadioButton rbActiveMembership;
    public final RadioButton rbCorrectTotalEmployee;
    public final RadioButton rbCorrectWages;
    public final RadioButton rbInCorrectTotalEmployee;
    public final RadioButton rbInCorrectWages;
    public final RadioButton rbNonActiveMembership;
    public final RadioGroup rgMembershipStatus;
    public final RadioGroup rgTotalEmployeeStatus;
    public final RadioGroup rgWagesStatus;
    private final LinearLayout rootView;
    public final TextInputLayout tilActualTotalEmployee;
    public final TextInputLayout tilActualWage;
    public final TextInputLayout tilChooseJamsostekIdNumber;
    public final TextInputLayout tilReportedTotalEmployee;
    public final TextInputLayout tilReportedWage;
    public final LinearLayout totalEmployeeCorrectionContainer;
    public final TextView tvChooseAnswerQuestion;
    public final TextView tvQuestionStatusActive;
    public final TextView tvQuestionTotalEmployee;
    public final TextView tvQuestionWagesStatus;
    public final View viewMembershipStatusSeparator;
    public final LinearLayout wageCorrectionContainer;

    private ActivityDataUnmatchedComplaintBinding(LinearLayout linearLayout, MaterialButton materialButton, View view, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioButton radioButton6, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.btnSendComplaintDataUnMatched = materialButton;
        this.divQuestionSecond = view;
        this.edtActualTotalEmployee = textInputEditText;
        this.edtActualWage = textInputEditText2;
        this.edtChooseJamsostekIdNumber = textInputEditText3;
        this.edtReportedTotalEmployee = textInputEditText4;
        this.edtReportedWage = textInputEditText5;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rbActiveMembership = radioButton;
        this.rbCorrectTotalEmployee = radioButton2;
        this.rbCorrectWages = radioButton3;
        this.rbInCorrectTotalEmployee = radioButton4;
        this.rbInCorrectWages = radioButton5;
        this.rbNonActiveMembership = radioButton6;
        this.rgMembershipStatus = radioGroup;
        this.rgTotalEmployeeStatus = radioGroup2;
        this.rgWagesStatus = radioGroup3;
        this.tilActualTotalEmployee = textInputLayout;
        this.tilActualWage = textInputLayout2;
        this.tilChooseJamsostekIdNumber = textInputLayout3;
        this.tilReportedTotalEmployee = textInputLayout4;
        this.tilReportedWage = textInputLayout5;
        this.totalEmployeeCorrectionContainer = linearLayout2;
        this.tvChooseAnswerQuestion = textView;
        this.tvQuestionStatusActive = textView2;
        this.tvQuestionTotalEmployee = textView3;
        this.tvQuestionWagesStatus = textView4;
        this.viewMembershipStatusSeparator = view2;
        this.wageCorrectionContainer = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDataUnmatchedComplaintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDataUnmatchedComplaintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_data_unmatched_complaint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDataUnmatchedComplaintBinding bind(View view) {
        int i = R.id.btnSendComplaintDataUnMatched;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSendComplaintDataUnMatched);
        if (materialButton != null) {
            i = R.id.divQuestionSecond;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divQuestionSecond);
            if (viewFindChildViewById != null) {
                i = R.id.edtActualTotalEmployee;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtActualTotalEmployee);
                if (textInputEditText != null) {
                    i = R.id.edtActualWage;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtActualWage);
                    if (textInputEditText2 != null) {
                        i = R.id.edtChooseJamsostekIdNumber;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseJamsostekIdNumber);
                        if (textInputEditText3 != null) {
                            i = R.id.edtReportedTotalEmployee;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReportedTotalEmployee);
                            if (textInputEditText4 != null) {
                                i = R.id.edtReportedWage;
                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReportedWage);
                                if (textInputEditText5 != null) {
                                    i = R.id.layout_toolbar;
                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                    if (viewFindChildViewById2 != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById2);
                                        i = R.id.rbActiveMembership;
                                        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbActiveMembership);
                                        if (radioButton != null) {
                                            i = R.id.rbCorrectTotalEmployee;
                                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbCorrectTotalEmployee);
                                            if (radioButton2 != null) {
                                                i = R.id.rbCorrectWages;
                                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbCorrectWages);
                                                if (radioButton3 != null) {
                                                    i = R.id.rbInCorrectTotalEmployee;
                                                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbInCorrectTotalEmployee);
                                                    if (radioButton4 != null) {
                                                        i = R.id.rbInCorrectWages;
                                                        RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbInCorrectWages);
                                                        if (radioButton5 != null) {
                                                            i = R.id.rbNonActiveMembership;
                                                            RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbNonActiveMembership);
                                                            if (radioButton6 != null) {
                                                                i = R.id.rgMembershipStatus;
                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgMembershipStatus);
                                                                if (radioGroup != null) {
                                                                    i = R.id.rgTotalEmployeeStatus;
                                                                    RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgTotalEmployeeStatus);
                                                                    if (radioGroup2 != null) {
                                                                        i = R.id.rgWagesStatus;
                                                                        RadioGroup radioGroup3 = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgWagesStatus);
                                                                        if (radioGroup3 != null) {
                                                                            i = R.id.tilActualTotalEmployee;
                                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilActualTotalEmployee);
                                                                            if (textInputLayout != null) {
                                                                                i = R.id.tilActualWage;
                                                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilActualWage);
                                                                                if (textInputLayout2 != null) {
                                                                                    i = R.id.tilChooseJamsostekIdNumber;
                                                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseJamsostekIdNumber);
                                                                                    if (textInputLayout3 != null) {
                                                                                        i = R.id.tilReportedTotalEmployee;
                                                                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReportedTotalEmployee);
                                                                                        if (textInputLayout4 != null) {
                                                                                            i = R.id.tilReportedWage;
                                                                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReportedWage);
                                                                                            if (textInputLayout5 != null) {
                                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.totalEmployeeCorrectionContainer);
                                                                                                if (linearLayout != null) {
                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseAnswerQuestion);
                                                                                                    if (textView != null) {
                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_question_status_active);
                                                                                                        if (textView2 != null) {
                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_question_total_employee);
                                                                                                            if (textView3 != null) {
                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_question_wages_status);
                                                                                                                if (textView4 != null) {
                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewMembershipStatusSeparator);
                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.wageCorrectionContainer);
                                                                                                                        if (linearLayout2 != null) {
                                                                                                                            return new ActivityDataUnmatchedComplaintBinding((LinearLayout) view, materialButton, viewFindChildViewById, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, layoutToolbarCenterBindingBind, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioGroup, radioGroup2, radioGroup3, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, linearLayout, textView, textView2, textView3, textView4, viewFindChildViewById3, linearLayout2);
                                                                                                                        }
                                                                                                                        i = R.id.wageCorrectionContainer;
                                                                                                                    } else {
                                                                                                                        i = R.id.viewMembershipStatusSeparator;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tv_question_wages_status;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tv_question_total_employee;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tv_question_status_active;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvChooseAnswerQuestion;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.totalEmployeeCorrectionContainer;
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
