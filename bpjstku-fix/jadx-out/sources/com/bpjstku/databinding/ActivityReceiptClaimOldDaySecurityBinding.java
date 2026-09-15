package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityReceiptClaimOldDaySecurityBinding implements ViewBinding {
    public final ImageView btnDownload;
    public final MaterialButton btnDownload1;
    public final MaterialButton btnShare;
    public final TextView codeClaim;
    public final View divider;
    public final View divider2;
    public final ConstraintLayout footer;
    public final ImageView imgJmo;
    public final ImageView imgOldDaySecurtityBackground;
    public final ImageView imgOldDaySecurtityBackground2;
    public final ScrollView rootReceipt;
    private final ScrollView rootView;
    public final TextView statusTransactionValue;
    public final TextView timeStatus;
    public final MaterialToolbar toolbarEvidence;
    public final TextView tvBankAccount;
    public final TextView tvBankAccountValue;
    public final TextView tvBankName;
    public final TextView tvBankNameValue;
    public final TextView tvDescSkn;
    public final TextView tvNotificationClaim;
    public final TextView tvNumberKpj;
    public final TextView tvNumberKpjValue;
    public final TextView tvReceiverName;
    public final TextView tvReceiverNameValue;
    public final TextView tvStatusTransaction;
    public final TextView tvTransaction;
    public final TextView tvTransactionValue;

    private ActivityReceiptClaimOldDaySecurityBinding(ScrollView scrollView, ImageView imageView, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, View view, View view2, ConstraintLayout constraintLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, ScrollView scrollView2, TextView textView2, TextView textView3, MaterialToolbar materialToolbar, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.rootView = scrollView;
        this.btnDownload = imageView;
        this.btnDownload1 = materialButton;
        this.btnShare = materialButton2;
        this.codeClaim = textView;
        this.divider = view;
        this.divider2 = view2;
        this.footer = constraintLayout;
        this.imgJmo = imageView2;
        this.imgOldDaySecurtityBackground = imageView3;
        this.imgOldDaySecurtityBackground2 = imageView4;
        this.rootReceipt = scrollView2;
        this.statusTransactionValue = textView2;
        this.timeStatus = textView3;
        this.toolbarEvidence = materialToolbar;
        this.tvBankAccount = textView4;
        this.tvBankAccountValue = textView5;
        this.tvBankName = textView6;
        this.tvBankNameValue = textView7;
        this.tvDescSkn = textView8;
        this.tvNotificationClaim = textView9;
        this.tvNumberKpj = textView10;
        this.tvNumberKpjValue = textView11;
        this.tvReceiverName = textView12;
        this.tvReceiverNameValue = textView13;
        this.tvStatusTransaction = textView14;
        this.tvTransaction = textView15;
        this.tvTransactionValue = textView16;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityReceiptClaimOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityReceiptClaimOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_receipt_claim_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityReceiptClaimOldDaySecurityBinding bind(View view) {
        int i = R.id.btnDownload;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.btnDownload);
        if (imageView != null) {
            i = R.id.btn_download;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_download);
            if (materialButton != null) {
                i = R.id.btnShare;
                MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnShare);
                if (materialButton2 != null) {
                    i = R.id.code_claim;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.code_claim);
                    if (textView != null) {
                        i = R.id.divider;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                        if (viewFindChildViewById != null) {
                            i = R.id.divider2;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider2);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.footer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.footer);
                                if (constraintLayout != null) {
                                    i = R.id.img_jmo;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_jmo);
                                    if (imageView2 != null) {
                                        i = R.id.imgOldDaySecurtityBackground;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOldDaySecurtityBackground);
                                        if (imageView3 != null) {
                                            i = R.id.imgOldDaySecurtityBackground2;
                                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOldDaySecurtityBackground2);
                                            if (imageView4 != null) {
                                                ScrollView scrollView = (ScrollView) view;
                                                i = R.id.status_transaction_value;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.status_transaction_value);
                                                if (textView2 != null) {
                                                    i = R.id.time_status;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.time_status);
                                                    if (textView3 != null) {
                                                        i = R.id.toolbar_evidence;
                                                        MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbar_evidence);
                                                        if (materialToolbar != null) {
                                                            i = R.id.tv_bank_account;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bank_account);
                                                            if (textView4 != null) {
                                                                i = R.id.tv_bank_account_value;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bank_account_value);
                                                                if (textView5 != null) {
                                                                    i = R.id.tv_bank_name;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bank_name);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tv_bank_name_value;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bank_name_value);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tv_desc_skn;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_skn);
                                                                            if (textView8 != null) {
                                                                                i = R.id.tvNotificationClaim;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotificationClaim);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.tv_number_kpj;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_kpj);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.tv_number_kpj_value;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_kpj_value);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.tv_receiver_name;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_receiver_name);
                                                                                            if (textView12 != null) {
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_receiver_name_value);
                                                                                                if (textView13 != null) {
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_transaction);
                                                                                                    if (textView14 != null) {
                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_transaction);
                                                                                                        if (textView15 != null) {
                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_transaction_value);
                                                                                                            if (textView16 != null) {
                                                                                                                return new ActivityReceiptClaimOldDaySecurityBinding(scrollView, imageView, materialButton, materialButton2, textView, viewFindChildViewById, viewFindChildViewById2, constraintLayout, imageView2, imageView3, imageView4, scrollView, textView2, textView3, materialToolbar, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
                                                                                                            }
                                                                                                            i = R.id.tv_transaction_value;
                                                                                                        } else {
                                                                                                            i = R.id.tv_transaction;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tv_status_transaction;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tv_receiver_name_value;
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
