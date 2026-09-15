package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentClaimOldDataSecurityConfirmationBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final TextInputEditText edtBankAccountName;
    public final TextInputEditText edtBankAccountNumber;
    public final TextInputEditText edtBankName;
    public final TextInputEditText edtBpuFee;
    public final TextInputEditText edtClaim;
    public final TextInputEditText edtCompanyLocation;
    public final TextInputEditText edtEmail;
    public final TextInputEditText edtFamilyCardNumber;
    public final TextInputEditText edtFinalBalance;
    public final TextInputEditText edtFullname;
    public final TextInputEditText edtIdKpj;
    public final TextInputEditText edtIdentityNumber;
    public final TextInputEditText edtNPWP;
    public final TextInputEditText edtOccupationFirst;
    public final TextInputEditText edtOccupationSecond;
    public final TextInputEditText edtPhoneNumber;
    public final Group gbReactivation;
    private final LinearLayout rootView;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankName;
    public final TextInputLayout tilBpuFee;
    public final TextInputLayout tilClaim;
    public final TextInputLayout tilCompanyLocation;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilFamilyCardNumber;
    public final TextInputLayout tilFinalBalance;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdKpj;
    public final TextInputLayout tilIdentityNumber;
    public final TextInputLayout tilNPWP;
    public final TextInputLayout tilOccupationFirst;
    public final TextInputLayout tilOccupationSecond;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvBpuMembership;
    public final TextView tvTermConditions;
    public final TextView tvTransferVia;

    private FragmentClaimOldDataSecurityConfirmationBinding(LinearLayout linearLayout, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, TextInputEditText textInputEditText7, TextInputEditText textInputEditText8, TextInputEditText textInputEditText9, TextInputEditText textInputEditText10, TextInputEditText textInputEditText11, TextInputEditText textInputEditText12, TextInputEditText textInputEditText13, TextInputEditText textInputEditText14, TextInputEditText textInputEditText15, TextInputEditText textInputEditText16, Group group, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextInputLayout textInputLayout7, TextInputLayout textInputLayout8, TextInputLayout textInputLayout9, TextInputLayout textInputLayout10, TextInputLayout textInputLayout11, TextInputLayout textInputLayout12, TextInputLayout textInputLayout13, TextInputLayout textInputLayout14, TextInputLayout textInputLayout15, TextInputLayout textInputLayout16, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnConfirmation = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.edtBankAccountName = textInputEditText;
        this.edtBankAccountNumber = textInputEditText2;
        this.edtBankName = textInputEditText3;
        this.edtBpuFee = textInputEditText4;
        this.edtClaim = textInputEditText5;
        this.edtCompanyLocation = textInputEditText6;
        this.edtEmail = textInputEditText7;
        this.edtFamilyCardNumber = textInputEditText8;
        this.edtFinalBalance = textInputEditText9;
        this.edtFullname = textInputEditText10;
        this.edtIdKpj = textInputEditText11;
        this.edtIdentityNumber = textInputEditText12;
        this.edtNPWP = textInputEditText13;
        this.edtOccupationFirst = textInputEditText14;
        this.edtOccupationSecond = textInputEditText15;
        this.edtPhoneNumber = textInputEditText16;
        this.gbReactivation = group;
        this.tilBankAccountName = textInputLayout;
        this.tilBankAccountNumber = textInputLayout2;
        this.tilBankName = textInputLayout3;
        this.tilBpuFee = textInputLayout4;
        this.tilClaim = textInputLayout5;
        this.tilCompanyLocation = textInputLayout6;
        this.tilEmail = textInputLayout7;
        this.tilFamilyCardNumber = textInputLayout8;
        this.tilFinalBalance = textInputLayout9;
        this.tilFullName = textInputLayout10;
        this.tilIdKpj = textInputLayout11;
        this.tilIdentityNumber = textInputLayout12;
        this.tilNPWP = textInputLayout13;
        this.tilOccupationFirst = textInputLayout14;
        this.tilOccupationSecond = textInputLayout15;
        this.tilPhoneNumber = textInputLayout16;
        this.tvBpuMembership = textView;
        this.tvTermConditions = textView2;
        this.tvTransferVia = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDataSecurityConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDataSecurityConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_data_security_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDataSecurityConfirmationBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.edtBankAccountName;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBankAccountName);
                if (textInputEditText != null) {
                    i = R.id.edtBankAccountNumber;
                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBankAccountNumber);
                    if (textInputEditText2 != null) {
                        i = R.id.edtBankName;
                        TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBankName);
                        if (textInputEditText3 != null) {
                            i = R.id.edtBpuFee;
                            TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBpuFee);
                            if (textInputEditText4 != null) {
                                i = R.id.edtClaim;
                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtClaim);
                                if (textInputEditText5 != null) {
                                    i = R.id.edtCompanyLocation;
                                    TextInputEditText textInputEditText6 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtCompanyLocation);
                                    if (textInputEditText6 != null) {
                                        i = R.id.edtEmail;
                                        TextInputEditText textInputEditText7 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtEmail);
                                        if (textInputEditText7 != null) {
                                            i = R.id.edtFamilyCardNumber;
                                            TextInputEditText textInputEditText8 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFamilyCardNumber);
                                            if (textInputEditText8 != null) {
                                                i = R.id.edtFinalBalance;
                                                TextInputEditText textInputEditText9 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFinalBalance);
                                                if (textInputEditText9 != null) {
                                                    i = R.id.edtFullname;
                                                    TextInputEditText textInputEditText10 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtFullname);
                                                    if (textInputEditText10 != null) {
                                                        i = R.id.edtIdKpj;
                                                        TextInputEditText textInputEditText11 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdKpj);
                                                        if (textInputEditText11 != null) {
                                                            i = R.id.edtIdentityNumber;
                                                            TextInputEditText textInputEditText12 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdentityNumber);
                                                            if (textInputEditText12 != null) {
                                                                i = R.id.edtNPWP;
                                                                TextInputEditText textInputEditText13 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtNPWP);
                                                                if (textInputEditText13 != null) {
                                                                    i = R.id.edtOccupationFirst;
                                                                    TextInputEditText textInputEditText14 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtOccupationFirst);
                                                                    if (textInputEditText14 != null) {
                                                                        i = R.id.edtOccupationSecond;
                                                                        TextInputEditText textInputEditText15 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtOccupationSecond);
                                                                        if (textInputEditText15 != null) {
                                                                            i = R.id.edtPhoneNumber;
                                                                            TextInputEditText textInputEditText16 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                                                                            if (textInputEditText16 != null) {
                                                                                i = R.id.gbReactivation;
                                                                                Group group = (Group) ViewBindings.findChildViewById(view, R.id.gbReactivation);
                                                                                if (group != null) {
                                                                                    i = R.id.tilBankAccountName;
                                                                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                                                                                    if (textInputLayout != null) {
                                                                                        i = R.id.tilBankAccountNumber;
                                                                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                                                                        if (textInputLayout2 != null) {
                                                                                            i = R.id.tilBankName;
                                                                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                                                                            if (textInputLayout3 != null) {
                                                                                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBpuFee);
                                                                                                if (textInputLayout4 != null) {
                                                                                                    TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilClaim);
                                                                                                    if (textInputLayout5 != null) {
                                                                                                        TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCompanyLocation);
                                                                                                        if (textInputLayout6 != null) {
                                                                                                            TextInputLayout textInputLayout7 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                                                                                            if (textInputLayout7 != null) {
                                                                                                                TextInputLayout textInputLayout8 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFamilyCardNumber);
                                                                                                                if (textInputLayout8 != null) {
                                                                                                                    TextInputLayout textInputLayout9 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFinalBalance);
                                                                                                                    if (textInputLayout9 != null) {
                                                                                                                        TextInputLayout textInputLayout10 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                                                                                        if (textInputLayout10 != null) {
                                                                                                                            TextInputLayout textInputLayout11 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdKpj);
                                                                                                                            if (textInputLayout11 != null) {
                                                                                                                                TextInputLayout textInputLayout12 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                                                                                                                if (textInputLayout12 != null) {
                                                                                                                                    TextInputLayout textInputLayout13 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNPWP);
                                                                                                                                    if (textInputLayout13 != null) {
                                                                                                                                        TextInputLayout textInputLayout14 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilOccupationFirst);
                                                                                                                                        if (textInputLayout14 != null) {
                                                                                                                                            TextInputLayout textInputLayout15 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilOccupationSecond);
                                                                                                                                            if (textInputLayout15 != null) {
                                                                                                                                                TextInputLayout textInputLayout16 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                                                                                                                if (textInputLayout16 != null) {
                                                                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBpuMembership);
                                                                                                                                                    if (textView != null) {
                                                                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermConditions);
                                                                                                                                                        if (textView2 != null) {
                                                                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTransferVia);
                                                                                                                                                            if (textView3 != null) {
                                                                                                                                                                return new FragmentClaimOldDataSecurityConfirmationBinding((LinearLayout) view, materialButton, appCompatCheckBox, textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, textInputEditText7, textInputEditText8, textInputEditText9, textInputEditText10, textInputEditText11, textInputEditText12, textInputEditText13, textInputEditText14, textInputEditText15, textInputEditText16, group, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7, textInputLayout8, textInputLayout9, textInputLayout10, textInputLayout11, textInputLayout12, textInputLayout13, textInputLayout14, textInputLayout15, textInputLayout16, textView, textView2, textView3);
                                                                                                                                                            }
                                                                                                                                                            i = R.id.tvTransferVia;
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvTermConditions;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvBpuMembership;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tilPhoneNumber;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tilOccupationSecond;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tilOccupationFirst;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tilNPWP;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tilIdentityNumber;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tilIdKpj;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tilFullName;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tilFinalBalance;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tilFamilyCardNumber;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tilEmail;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tilCompanyLocation;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tilClaim;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tilBpuFee;
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
