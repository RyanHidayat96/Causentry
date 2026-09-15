package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityEvidenceClaimOldDaySecurityBinding implements ViewBinding {
    public final Button btnDownloadEvidenceTransaction;
    public final TextView descriptionImgStatus;
    public final TextView descriptionStatus;
    public final ImageView imgOldDaySecurtityBackground;
    public final ImageView imgStatus;
    public final ConstraintLayout layout1;
    public final ConstraintLayout layout2;
    public final ScrollView layoutScroll;
    private final RelativeLayout rootView;
    public final TextView statusTransactionValue;
    public final LayoutToolbarCenterBinding toolbar;
    public final TextView tvBankAccount;
    public final TextView tvBankAccountValue;
    public final TextView tvBankName;
    public final TextView tvBankNameValue;
    public final TextView tvNumberKpj;
    public final TextView tvNumberKpjValue;
    public final TextView tvReceiverName;
    public final TextView tvReceiverNameValue;
    public final TextView tvStatusTransaction;
    public final TextView tvTransaction;
    public final TextView tvTransactionValue;

    private ActivityEvidenceClaimOldDaySecurityBinding(RelativeLayout relativeLayout, Button button, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ScrollView scrollView, TextView textView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = relativeLayout;
        this.btnDownloadEvidenceTransaction = button;
        this.descriptionImgStatus = textView;
        this.descriptionStatus = textView2;
        this.imgOldDaySecurtityBackground = imageView;
        this.imgStatus = imageView2;
        this.layout1 = constraintLayout;
        this.layout2 = constraintLayout2;
        this.layoutScroll = scrollView;
        this.statusTransactionValue = textView3;
        this.toolbar = layoutToolbarCenterBinding;
        this.tvBankAccount = textView4;
        this.tvBankAccountValue = textView5;
        this.tvBankName = textView6;
        this.tvBankNameValue = textView7;
        this.tvNumberKpj = textView8;
        this.tvNumberKpjValue = textView9;
        this.tvReceiverName = textView10;
        this.tvReceiverNameValue = textView11;
        this.tvStatusTransaction = textView12;
        this.tvTransaction = textView13;
        this.tvTransactionValue = textView14;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEvidenceClaimOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEvidenceClaimOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_evidence_claim_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEvidenceClaimOldDaySecurityBinding bind(View view) {
        int i = R.id.btnDownloadEvidenceTransaction;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnDownloadEvidenceTransaction);
        if (button != null) {
            i = R.id.description_img_status;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.description_img_status);
            if (textView != null) {
                i = R.id.description_status;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.description_status);
                if (textView2 != null) {
                    i = R.id.imgOldDaySecurtityBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOldDaySecurtityBackground);
                    if (imageView != null) {
                        i = R.id.img_status;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_status);
                        if (imageView2 != null) {
                            i = R.id.layout_1;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layout_1);
                            if (constraintLayout != null) {
                                i = R.id.layout_2;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layout_2);
                                if (constraintLayout2 != null) {
                                    i = R.id.layout_scroll;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.layout_scroll);
                                    if (scrollView != null) {
                                        i = R.id.status_transaction_value;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.status_transaction_value);
                                        if (textView3 != null) {
                                            i = R.id.toolbar;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.toolbar);
                                            if (viewFindChildViewById != null) {
                                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
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
                                                                i = R.id.tv_number_kpj;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_kpj);
                                                                if (textView8 != null) {
                                                                    i = R.id.tv_number_kpj_value;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number_kpj_value);
                                                                    if (textView9 != null) {
                                                                        i = R.id.tv_receiver_name;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_receiver_name);
                                                                        if (textView10 != null) {
                                                                            i = R.id.tv_receiver_name_value;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_receiver_name_value);
                                                                            if (textView11 != null) {
                                                                                i = R.id.tv_status_transaction;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_status_transaction);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.tv_transaction;
                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_transaction);
                                                                                    if (textView13 != null) {
                                                                                        i = R.id.tv_transaction_value;
                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_transaction_value);
                                                                                        if (textView14 != null) {
                                                                                            return new ActivityEvidenceClaimOldDaySecurityBinding((RelativeLayout) view, button, textView, textView2, imageView, imageView2, constraintLayout, constraintLayout2, scrollView, textView3, layoutToolbarCenterBindingBind, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
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
