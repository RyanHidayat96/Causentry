package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegisterBniAutodebetBinding implements ViewBinding {
    public final Button btnProcess;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilValueAccountNumberBni;
    public final TextInputLayout tilValueAccountNumberBniDebitCard;
    public final TextInputLayout tilValueParticipantAmountTuition;
    public final TextInputLayout tilValueParticipantId;
    public final TextInputLayout tilValueParticipantName;
    public final TextInputLayout tilValueParticipantProgram;
    public final TextView tvTitleDebitCardInfo;
    public final TextView tvTitleParticipantInfo;

    private ActivityRegisterBniAutodebetBinding(ConstraintLayout constraintLayout, Button button, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnProcess = button;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilValueAccountNumberBni = textInputLayout;
        this.tilValueAccountNumberBniDebitCard = textInputLayout2;
        this.tilValueParticipantAmountTuition = textInputLayout3;
        this.tilValueParticipantId = textInputLayout4;
        this.tilValueParticipantName = textInputLayout5;
        this.tilValueParticipantProgram = textInputLayout6;
        this.tvTitleDebitCardInfo = textView;
        this.tvTitleParticipantInfo = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegisterBniAutodebetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegisterBniAutodebetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_register_bni_autodebet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegisterBniAutodebetBinding bind(View view) {
        int i = R.id.btnProcess;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnProcess);
        if (button != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.tilValueAccountNumberBni;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueAccountNumberBni);
                if (textInputLayout != null) {
                    i = R.id.tilValueAccountNumberBniDebitCard;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueAccountNumberBniDebitCard);
                    if (textInputLayout2 != null) {
                        i = R.id.tilValueParticipantAmountTuition;
                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueParticipantAmountTuition);
                        if (textInputLayout3 != null) {
                            i = R.id.tilValueParticipantId;
                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueParticipantId);
                            if (textInputLayout4 != null) {
                                i = R.id.tilValueParticipantName;
                                TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueParticipantName);
                                if (textInputLayout5 != null) {
                                    i = R.id.tilValueParticipantProgram;
                                    TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueParticipantProgram);
                                    if (textInputLayout6 != null) {
                                        i = R.id.tvTitleDebitCardInfo;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDebitCardInfo);
                                        if (textView != null) {
                                            i = R.id.tvTitleParticipantInfo;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleParticipantInfo);
                                            if (textView2 != null) {
                                                return new ActivityRegisterBniAutodebetBinding((ConstraintLayout) view, button, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView, textView2);
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
