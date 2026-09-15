package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityCheckEligibleBsuResultBinding implements ViewBinding {
    public final Button btnOk;
    public final ImageView imgCheckEligibleResult;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ConstraintLayout mainContainer;
    private final LinearLayout rootView;
    public final ScrollView scrollView;
    public final TextInputLayout tilBankAccountName;
    public final TextInputLayout tilBankAccountNumber;
    public final TextInputLayout tilBankName;
    public final TextView tvInstructionUpdateRekening;
    public final TextView tvStatusEligible;

    private ActivityCheckEligibleBsuResultBinding(LinearLayout linearLayout, Button button, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ConstraintLayout constraintLayout, ScrollView scrollView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.btnOk = button;
        this.imgCheckEligibleResult = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.mainContainer = constraintLayout;
        this.scrollView = scrollView;
        this.tilBankAccountName = textInputLayout;
        this.tilBankAccountNumber = textInputLayout2;
        this.tilBankName = textInputLayout3;
        this.tvInstructionUpdateRekening = textView;
        this.tvStatusEligible = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCheckEligibleBsuResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCheckEligibleBsuResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_eligible_bsu_result, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCheckEligibleBsuResultBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (button != null) {
            i = R.id.imgCheckEligibleResult;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCheckEligibleResult);
            if (imageView != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.mainContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                    if (constraintLayout != null) {
                        i = R.id.scroll_view;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_view);
                        if (scrollView != null) {
                            i = R.id.tilBankAccountName;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountName);
                            if (textInputLayout != null) {
                                i = R.id.tilBankAccountNumber;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankAccountNumber);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilBankName;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBankName);
                                    if (textInputLayout3 != null) {
                                        i = R.id.tvInstructionUpdateRekening;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInstructionUpdateRekening);
                                        if (textView != null) {
                                            i = R.id.tvStatusEligible;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusEligible);
                                            if (textView2 != null) {
                                                return new ActivityCheckEligibleBsuResultBinding((LinearLayout) view, button, imageView, layoutToolbarCenterBindingBind, constraintLayout, scrollView, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2);
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
