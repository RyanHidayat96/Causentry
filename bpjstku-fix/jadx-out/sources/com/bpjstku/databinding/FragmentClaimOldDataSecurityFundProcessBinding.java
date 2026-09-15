package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentClaimOldDataSecurityFundProcessBinding implements ViewBinding {
    public final MaterialButton btnBPJSTKUWallet;
    public final MaterialButton btnNext;
    public final MaterialButton btnSavingAccount;
    public final MaterialCardView cvBankCheckInfo;
    public final MaterialCardView cvClaimNonSalariedWorkerInfo;
    public final ImageView imgWarning;
    public final ImageView imgWarning1;
    private final ScrollView rootView;
    public final MaterialButtonToggleGroup tgTransferContainer;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankName;
    public final TextInputLayout tilNPWP;
    public final TextView tvClaimNonSalariedWorkerInfo1;
    public final TextView tvInformationBank1;
    public final TextView tvTitleInformationKpj;
    public final TextView tvTitleInformationKpj1;
    public final TextView tvTitleInformationKpj1Continue;
    public final TextView tvTitleInformationKpj2;
    public final TextView tvTitleInformationKpj3;
    public final TextView tvTitleInformationKpj4;
    public final TextView tvTitleInformationKpj5;
    public final TextView tvTitleInformationKpj5a;
    public final TextView tvTitleInformationKpj5b;
    public final TextView tvTitleInformationKpj6;
    public final TextView tvTitleKpj1;
    public final TextView tvTitleKpj2;
    public final TextView tvTitleKpj3;
    public final TextView tvTitleKpj4;
    public final TextView tvTitleKpj5;
    public final TextView tvTitleKpj5a;
    public final TextView tvTitleKpj5b;
    public final TextView tvTitleKpj6;
    public final TextView tvTransferVia;

    private FragmentClaimOldDataSecurityFundProcessBinding(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, MaterialButtonToggleGroup materialButtonToggleGroup, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21) {
        this.rootView = scrollView;
        this.btnBPJSTKUWallet = materialButton;
        this.btnNext = materialButton2;
        this.btnSavingAccount = materialButton3;
        this.cvBankCheckInfo = materialCardView;
        this.cvClaimNonSalariedWorkerInfo = materialCardView2;
        this.imgWarning = imageView;
        this.imgWarning1 = imageView2;
        this.tgTransferContainer = materialButtonToggleGroup;
        this.tilBankAccountName = textInputLayout;
        this.tilBankAccountNumber = textInputLayout2;
        this.tilBankName = textInputLayout3;
        this.tilNPWP = textInputLayout4;
        this.tvClaimNonSalariedWorkerInfo1 = textView;
        this.tvInformationBank1 = textView2;
        this.tvTitleInformationKpj = textView3;
        this.tvTitleInformationKpj1 = textView4;
        this.tvTitleInformationKpj1Continue = textView5;
        this.tvTitleInformationKpj2 = textView6;
        this.tvTitleInformationKpj3 = textView7;
        this.tvTitleInformationKpj4 = textView8;
        this.tvTitleInformationKpj5 = textView9;
        this.tvTitleInformationKpj5a = textView10;
        this.tvTitleInformationKpj5b = textView11;
        this.tvTitleInformationKpj6 = textView12;
        this.tvTitleKpj1 = textView13;
        this.tvTitleKpj2 = textView14;
        this.tvTitleKpj3 = textView15;
        this.tvTitleKpj4 = textView16;
        this.tvTitleKpj5 = textView17;
        this.tvTitleKpj5a = textView18;
        this.tvTitleKpj5b = textView19;
        this.tvTitleKpj6 = textView20;
        this.tvTransferVia = textView21;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDataSecurityFundProcessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDataSecurityFundProcessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_data_security_fund_process, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDataSecurityFundProcessBinding bind(View view) {
        int i = R.id.btnBPJSTKUWallet;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBPJSTKUWallet);
        if (materialButton != null) {
            i = R.id.btnNext;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton2 != null) {
                i = R.id.btnSavingAccount;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSavingAccount);
                if (materialButton3 != null) {
                    i = R.id.cvBankCheckInfo;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvBankCheckInfo);
                    if (materialCardView != null) {
                        i = R.id.cvClaimNonSalariedWorkerInfo;
                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvClaimNonSalariedWorkerInfo);
                        if (materialCardView2 != null) {
                            i = R.id.imgWarning;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning);
                            if (imageView != null) {
                                i = R.id.imgWarning1;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                                if (imageView2 != null) {
                                    i = R.id.tgTransferContainer;
                                    MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) ViewBindings.findChildViewById(view, R.id.tgTransferContainer);
                                    if (materialButtonToggleGroup != null) {
                                        i = R.id.tilBankAccountName;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                                        if (textInputLayout != null) {
                                            i = R.id.tilBankAccountNumber;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                            if (textInputLayout2 != null) {
                                                i = R.id.tilBankName;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                                if (textInputLayout3 != null) {
                                                    i = R.id.tilNPWP;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNPWP);
                                                    if (textInputLayout4 != null) {
                                                        i = R.id.tvClaimNonSalariedWorkerInfo1;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimNonSalariedWorkerInfo1);
                                                        if (textView != null) {
                                                            i = R.id.tvInformationBank1;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInformationBank1);
                                                            if (textView2 != null) {
                                                                i = R.id.tvTitleInformationKpj;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj);
                                                                if (textView3 != null) {
                                                                    i = R.id.tvTitleInformationKpj1;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj1);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tvTitleInformationKpj1Continue;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj1Continue);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tvTitleInformationKpj2;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj2);
                                                                            if (textView6 != null) {
                                                                                i = R.id.tvTitleInformationKpj3;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj3);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tvTitleInformationKpj4;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj4);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.tvTitleInformationKpj5;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj5);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.tvTitleInformationKpj5a;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj5a);
                                                                                            if (textView10 != null) {
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj5b);
                                                                                                if (textView11 != null) {
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj6);
                                                                                                    if (textView12 != null) {
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj1);
                                                                                                        if (textView13 != null) {
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj2);
                                                                                                            if (textView14 != null) {
                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj3);
                                                                                                                if (textView15 != null) {
                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj4);
                                                                                                                    if (textView16 != null) {
                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj5);
                                                                                                                        if (textView17 != null) {
                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj5a);
                                                                                                                            if (textView18 != null) {
                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj5b);
                                                                                                                                if (textView19 != null) {
                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj6);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTransferVia);
                                                                                                                                        if (textView21 != null) {
                                                                                                                                            return new FragmentClaimOldDataSecurityFundProcessBinding((ScrollView) view, materialButton, materialButton2, materialButton3, materialCardView, materialCardView2, imageView, imageView2, materialButtonToggleGroup, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21);
                                                                                                                                        }
                                                                                                                                        i = R.id.tvTransferVia;
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvTitleKpj6;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvTitleKpj5b;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvTitleKpj5a;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTitleKpj5;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTitleKpj4;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvTitleKpj3;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvTitleKpj2;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvTitleKpj1;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTitleInformationKpj6;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvTitleInformationKpj5b;
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
