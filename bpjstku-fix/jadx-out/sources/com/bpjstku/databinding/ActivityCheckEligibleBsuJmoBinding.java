package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityCheckEligibleBsuJmoBinding implements ViewBinding {
    public final Button btnCheckEligibleBsu;
    public final TextInputEditText edtBirthDate;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final ConstraintLayout mainContainer;
    private final LinearLayout rootView;
    public final ScrollView scrollView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilEmail;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumberParticipant;
    public final TextInputLayout tilMothersName;
    public final TextInputLayout tilPhoneNumber;
    public final TextView tvReminderVerifyDataPersonal;

    private ActivityCheckEligibleBsuJmoBinding(LinearLayout linearLayout, Button button, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ConstraintLayout constraintLayout, ScrollView scrollView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6, TextView textView) {
        this.rootView = linearLayout;
        this.btnCheckEligibleBsu = button;
        this.edtBirthDate = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.mainContainer = constraintLayout;
        this.scrollView = scrollView;
        this.tilBirthDate = textInputLayout;
        this.tilEmail = textInputLayout2;
        this.tilFullName = textInputLayout3;
        this.tilIdNumberParticipant = textInputLayout4;
        this.tilMothersName = textInputLayout5;
        this.tilPhoneNumber = textInputLayout6;
        this.tvReminderVerifyDataPersonal = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityCheckEligibleBsuJmoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCheckEligibleBsuJmoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_check_eligible_bsu_jmo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCheckEligibleBsuJmoBinding bind(View view) {
        int i = R.id.btnCheckEligibleBsu;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCheckEligibleBsu);
        if (button != null) {
            i = R.id.edtBirthDate;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
            if (textInputEditText != null) {
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
                            i = R.id.tilBirthDate;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                            if (textInputLayout != null) {
                                i = R.id.tilEmail;
                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmail);
                                if (textInputLayout2 != null) {
                                    i = R.id.tilFullName;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                    if (textInputLayout3 != null) {
                                        i = R.id.tilIdNumberParticipant;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumberParticipant);
                                        if (textInputLayout4 != null) {
                                            i = R.id.tilMothersName;
                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilMothersName);
                                            if (textInputLayout5 != null) {
                                                i = R.id.tilPhoneNumber;
                                                TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                                if (textInputLayout6 != null) {
                                                    i = R.id.tvReminderVerifyDataPersonal;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                    if (textView != null) {
                                                        return new ActivityCheckEligibleBsuJmoBinding((LinearLayout) view, button, textInputEditText, layoutToolbarCenterBindingBind, constraintLayout, scrollView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textView);
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
