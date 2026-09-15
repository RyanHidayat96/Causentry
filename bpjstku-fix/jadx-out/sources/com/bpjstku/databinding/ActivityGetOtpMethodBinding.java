package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityGetOtpMethodBinding implements ViewBinding {
    public final MaterialCardView cvConfirmationByEmail;
    public final MaterialCardView cvConfirmationByPhone;
    public final ImageView imgEmail;
    public final ImageView imgPhone;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvChooseConfirmationAccount;
    public final TextView tvChooseConfirmationAccountInstruction;
    public final TextView tvConfirmationAccountByEmail;
    public final TextView tvConfirmationAccountByPhone;
    public final TextView tvConfirmationAccountEmailInfo;
    public final TextView tvConfirmationAccountInfoPhone;

    private ActivityGetOtpMethodBinding(ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.cvConfirmationByEmail = materialCardView;
        this.cvConfirmationByPhone = materialCardView2;
        this.imgEmail = imageView;
        this.imgPhone = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvChooseConfirmationAccount = textView;
        this.tvChooseConfirmationAccountInstruction = textView2;
        this.tvConfirmationAccountByEmail = textView3;
        this.tvConfirmationAccountByPhone = textView4;
        this.tvConfirmationAccountEmailInfo = textView5;
        this.tvConfirmationAccountInfoPhone = textView6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGetOtpMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGetOtpMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_get_otp_method, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityGetOtpMethodBinding bind(View view) {
        int i = R.id.cvConfirmationByEmail;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvConfirmationByEmail);
        if (materialCardView != null) {
            i = R.id.cvConfirmationByPhone;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvConfirmationByPhone);
            if (materialCardView2 != null) {
                i = R.id.imgEmail;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgEmail);
                if (imageView != null) {
                    i = R.id.imgPhone;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPhone);
                    if (imageView2 != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.tvChooseConfirmationAccount;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseConfirmationAccount);
                            if (textView != null) {
                                i = R.id.tvChooseConfirmationAccountInstruction;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseConfirmationAccountInstruction);
                                if (textView2 != null) {
                                    i = R.id.tvConfirmationAccountByEmail;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationAccountByEmail);
                                    if (textView3 != null) {
                                        i = R.id.tvConfirmationAccountByPhone;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationAccountByPhone);
                                        if (textView4 != null) {
                                            i = R.id.tvConfirmationAccountEmailInfo;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationAccountEmailInfo);
                                            if (textView5 != null) {
                                                i = R.id.tvConfirmationAccountInfoPhone;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationAccountInfoPhone);
                                                if (textView6 != null) {
                                                    return new ActivityGetOtpMethodBinding((ConstraintLayout) view, materialCardView, materialCardView2, imageView, imageView2, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4, textView5, textView6);
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
