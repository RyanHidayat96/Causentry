package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPhoneActivationVerificationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final MaterialCardView cvPhoneNumber;
    public final EditText edtPhoneNumber;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ConstraintLayout phoneNumberVerificationContainer;
    private final ConstraintLayout rootView;
    public final TextView tvEnterPhoneNumber;
    public final TextView tvEnterPhoneNumberInstruction;
    public final TextView tvNotes;
    public final TextView tvPhoneExample;
    public final TextView tvPrefix;

    private ActivityPhoneActivationVerificationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialCardView materialCardView, EditText editText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.btnNext = materialButton;
        this.cvPhoneNumber = materialCardView;
        this.edtPhoneNumber = editText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.phoneNumberVerificationContainer = constraintLayout2;
        this.tvEnterPhoneNumber = textView;
        this.tvEnterPhoneNumberInstruction = textView2;
        this.tvNotes = textView3;
        this.tvPhoneExample = textView4;
        this.tvPrefix = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPhoneActivationVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPhoneActivationVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_phone_activation_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPhoneActivationVerificationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvPhoneNumber;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumber);
            if (materialCardView != null) {
                i = R.id.edtPhoneNumber;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                if (editText != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = R.id.tvEnterPhoneNumber;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterPhoneNumber);
                        if (textView != null) {
                            i = R.id.tvEnterPhoneNumberInstruction;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEnterPhoneNumberInstruction);
                            if (textView2 != null) {
                                i = R.id.tvNotes;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotes);
                                if (textView3 != null) {
                                    i = R.id.tvPhoneExample;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneExample);
                                    if (textView4 != null) {
                                        i = R.id.tvPrefix;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                        if (textView5 != null) {
                                            return new ActivityPhoneActivationVerificationBinding(constraintLayout, materialButton, materialCardView, editText, layoutToolbarCenterBindingBind, constraintLayout, textView, textView2, textView3, textView4, textView5);
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
