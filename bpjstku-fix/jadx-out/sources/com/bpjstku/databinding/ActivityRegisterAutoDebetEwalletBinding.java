package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegisterAutoDebetEwalletBinding implements ViewBinding {
    public final Button btnNext;
    public final RelativeLayout containerTitleInputPhoneNumber;
    public final MaterialCardView cvPhoneNumber;
    public final EditText edtPhoneNumber;
    public final ImageView imgLogo;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvEnterPhoneNumberInstruction;
    public final TextView tvPaymentMethod;
    public final TextView tvPrefix;

    private ActivityRegisterAutoDebetEwalletBinding(ConstraintLayout constraintLayout, Button button, RelativeLayout relativeLayout, MaterialCardView materialCardView, EditText editText, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnNext = button;
        this.containerTitleInputPhoneNumber = relativeLayout;
        this.cvPhoneNumber = materialCardView;
        this.edtPhoneNumber = editText;
        this.imgLogo = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvEnterPhoneNumberInstruction = textView;
        this.tvPaymentMethod = textView2;
        this.tvPrefix = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegisterAutoDebetEwalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegisterAutoDebetEwalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_register_auto_debet_ewallet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegisterAutoDebetEwalletBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.containerTitleInputPhoneNumber;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.containerTitleInputPhoneNumber);
            if (relativeLayout != null) {
                i = R.id.cvPhoneNumber;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumber);
                if (materialCardView != null) {
                    i = R.id.edtPhoneNumber;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                    if (editText != null) {
                        i = R.id.imgLogo;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                        if (imageView != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                i = R.id.tvEnterPhoneNumberInstruction;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterPhoneNumberInstruction);
                                if (textView != null) {
                                    i = R.id.tvPaymentMethod;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethod);
                                    if (textView2 != null) {
                                        i = R.id.tvPrefix;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                        if (textView3 != null) {
                                            return new ActivityRegisterAutoDebetEwalletBinding((ConstraintLayout) view, button, relativeLayout, materialCardView, editText, imageView, layoutToolbarCenterBindingBind, textView, textView2, textView3);
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
