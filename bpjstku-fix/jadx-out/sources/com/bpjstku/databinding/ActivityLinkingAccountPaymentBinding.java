package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLinkingAccountPaymentBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final ImageView imgBpjstku;
    public final ImageView imgMerchantPartner;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayoutCompat llMerchantBrand;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvTitleInfoAutodebet;
    public final TextView tvTitleInfoNama;
    public final TextView tvTitleInfoNamaValue;
    public final TextView tvTitleInfoNik;
    public final TextView tvTitleInfoNikValue;
    public final TextView tvTitleInfoTuition;
    public final TextView tvTitleInfoTuitionMitra;
    public final TextView tvTitleInfoTuitionMitraValue;
    public final TextView tvTitleInfoTuitionValue;
    public final TextView tvTitleStatusLinkingAccount;
    public final TextView tvTotalAutodebet;
    public final TextView tvTotalAutodebetValue;
    public final View viewLineTotalPayment;

    private ActivityLinkingAccountPaymentBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayoutCompat linearLayoutCompat, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, View view) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.imgBpjstku = imageView;
        this.imgMerchantPartner = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llMerchantBrand = linearLayoutCompat;
        this.tilPhoneNumber = textInputLayout;
        this.tvTitleInfoAutodebet = textView;
        this.tvTitleInfoNama = textView2;
        this.tvTitleInfoNamaValue = textView3;
        this.tvTitleInfoNik = textView4;
        this.tvTitleInfoNikValue = textView5;
        this.tvTitleInfoTuition = textView6;
        this.tvTitleInfoTuitionMitra = textView7;
        this.tvTitleInfoTuitionMitraValue = textView8;
        this.tvTitleInfoTuitionValue = textView9;
        this.tvTitleStatusLinkingAccount = textView10;
        this.tvTotalAutodebet = textView11;
        this.tvTotalAutodebetValue = textView12;
        this.viewLineTotalPayment = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLinkingAccountPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLinkingAccountPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_linking_account_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityLinkingAccountPaymentBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.imgBpjstku;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBpjstku);
            if (imageView != null) {
                i = R.id.imgMerchantPartner;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMerchantPartner);
                if (imageView2 != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.llMerchantBrand;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.llMerchantBrand);
                        if (linearLayoutCompat != null) {
                            i = R.id.tilPhoneNumber;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                            if (textInputLayout != null) {
                                i = R.id.tvTitleInfoAutodebet;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoAutodebet);
                                if (textView != null) {
                                    i = R.id.tvTitleInfoNama;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNama);
                                    if (textView2 != null) {
                                        i = R.id.tvTitleInfoNamaValue;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNamaValue);
                                        if (textView3 != null) {
                                            i = R.id.tvTitleInfoNik;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNik);
                                            if (textView4 != null) {
                                                i = R.id.tvTitleInfoNikValue;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNikValue);
                                                if (textView5 != null) {
                                                    i = R.id.tvTitleInfoTuition;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuition);
                                                    if (textView6 != null) {
                                                        i = R.id.tvTitleInfoTuitionMitra;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuitionMitra);
                                                        if (textView7 != null) {
                                                            i = R.id.tvTitleInfoTuitionMitraValue;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuitionMitraValue);
                                                            if (textView8 != null) {
                                                                i = R.id.tvTitleInfoTuitionValue;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuitionValue);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvTitleStatusLinkingAccount;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleStatusLinkingAccount);
                                                                    if (textView10 != null) {
                                                                        i = R.id.tvTotalAutodebet;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalAutodebet);
                                                                        if (textView11 != null) {
                                                                            i = R.id.tvTotalAutodebetValue;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalAutodebetValue);
                                                                            if (textView12 != null) {
                                                                                i = R.id.viewLineTotalPayment;
                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineTotalPayment);
                                                                                if (viewFindChildViewById2 != null) {
                                                                                    return new ActivityLinkingAccountPaymentBinding((ConstraintLayout) view, materialButton, imageView, imageView2, layoutToolbarCenterBindingBind, linearLayoutCompat, textInputLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewFindChildViewById2);
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
