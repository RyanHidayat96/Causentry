package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimOldDaySecurityWorkTerminationParticipantBinding implements ViewBinding {
    public final Barrier barBottomLayout;
    public final MaterialButton btnNext;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final TextInputEditText edtDateTerminationAnnouncement;
    public final TextInputEditText edtDateWorkAgreement;
    public final Group groupInput;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextInputLayout tilDateTerminationAnnouncement;
    public final TextInputLayout tilDateWorkAgreement;
    public final TextInputLayout tilDivisionWorkParticipant;
    public final TextInputLayout tilNumberTerminationLetter;
    public final TextInputLayout tilNumberWorkAgreement;
    public final TextInputLayout tilOccupation;

    private ActivityClaimOldDaySecurityWorkTerminationParticipantBinding(ScrollView scrollView, Barrier barrier, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, Group group, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextInputLayout textInputLayout6) {
        this.rootView = scrollView;
        this.barBottomLayout = barrier;
        this.btnNext = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.edtDateTerminationAnnouncement = textInputEditText;
        this.edtDateWorkAgreement = textInputEditText2;
        this.groupInput = group;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilDateTerminationAnnouncement = textInputLayout;
        this.tilDateWorkAgreement = textInputLayout2;
        this.tilDivisionWorkParticipant = textInputLayout3;
        this.tilNumberTerminationLetter = textInputLayout4;
        this.tilNumberWorkAgreement = textInputLayout5;
        this.tilOccupation = textInputLayout6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_old_day_security_work_termination_participant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantBinding bind(View view) {
        int i = R.id.barBottomLayout;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.barBottomLayout);
        if (barrier != null) {
            i = R.id.btnNext;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
            if (materialButton != null) {
                i = R.id.cbAgreeTermCondition;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
                if (appCompatCheckBox != null) {
                    i = R.id.edtDateTerminationAnnouncement;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtDateTerminationAnnouncement);
                    if (textInputEditText != null) {
                        i = R.id.edtDateWorkAgreement;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtDateWorkAgreement);
                        if (textInputEditText2 != null) {
                            i = R.id.groupInput;
                            Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupInput);
                            if (group != null) {
                                i = R.id.layout_toolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                if (viewFindChildViewById != null) {
                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                    i = R.id.tilDateTerminationAnnouncement;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilDateTerminationAnnouncement);
                                    if (textInputLayout != null) {
                                        i = R.id.tilDateWorkAgreement;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilDateWorkAgreement);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilDivisionWorkParticipant;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilDivisionWorkParticipant);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tilNumberTerminationLetter;
                                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNumberTerminationLetter);
                                                if (textInputLayout4 != null) {
                                                    i = R.id.tilNumberWorkAgreement;
                                                    TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilNumberWorkAgreement);
                                                    if (textInputLayout5 != null) {
                                                        i = R.id.tilOccupation;
                                                        TextInputLayout textInputLayout6 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilOccupation);
                                                        if (textInputLayout6 != null) {
                                                            return new ActivityClaimOldDaySecurityWorkTerminationParticipantBinding((ScrollView) view, barrier, materialButton, appCompatCheckBox, textInputEditText, textInputEditText2, group, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6);
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
