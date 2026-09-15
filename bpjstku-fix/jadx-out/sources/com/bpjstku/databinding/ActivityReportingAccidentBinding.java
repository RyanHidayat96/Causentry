package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityReportingAccidentBinding implements ViewBinding {
    public final AutoCompleteTextView actvChooseClosestplkk;
    public final Button btnSendReport;
    public final ImageButton btnTakeAccidentPhoto;
    public final TextInputEditText edtReporting;
    public final ImageView imgTakeAccidentPhoto;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final ConstraintLayout takeAccidentPhotoContainer;
    public final TextInputLayout tilChooseNearestPLKK;
    public final TextInputLayout tilEmployeeName;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilReporting;
    public final TextView tvFillFormInstruction;
    public final TextView tvPhotoError;
    public final TextView tvTakeAccidentPhotoLabel;

    private ActivityReportingAccidentBinding(ConstraintLayout constraintLayout, AutoCompleteTextView autoCompleteTextView, Button button, ImageButton imageButton, TextInputEditText textInputEditText, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.actvChooseClosestplkk = autoCompleteTextView;
        this.btnSendReport = button;
        this.btnTakeAccidentPhoto = imageButton;
        this.edtReporting = textInputEditText;
        this.imgTakeAccidentPhoto = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.takeAccidentPhotoContainer = constraintLayout2;
        this.tilChooseNearestPLKK = textInputLayout;
        this.tilEmployeeName = textInputLayout2;
        this.tilIdNumber = textInputLayout3;
        this.tilReporting = textInputLayout4;
        this.tvFillFormInstruction = textView;
        this.tvPhotoError = textView2;
        this.tvTakeAccidentPhotoLabel = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityReportingAccidentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityReportingAccidentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_reporting_accident, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityReportingAccidentBinding bind(View view) {
        int i = R.id.actvChooseClosestplkk;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvChooseClosestplkk);
        if (autoCompleteTextView != null) {
            i = R.id.btnSendReport;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSendReport);
            if (button != null) {
                i = R.id.btnTakeAccidentPhoto;
                ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btnTakeAccidentPhoto);
                if (imageButton != null) {
                    i = R.id.edtReporting;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtReporting);
                    if (textInputEditText != null) {
                        i = R.id.imgTakeAccidentPhoto;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTakeAccidentPhoto);
                        if (imageView != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                i = R.id.takeAccidentPhotoContainer;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.takeAccidentPhotoContainer);
                                if (constraintLayout != null) {
                                    i = R.id.tilChooseNearestPLKK;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseNearestPLKK);
                                    if (textInputLayout != null) {
                                        i = R.id.tilEmployeeName;
                                        TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmployeeName);
                                        if (textInputLayout2 != null) {
                                            i = R.id.tilIdNumber;
                                            TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                            if (textInputLayout3 != null) {
                                                i = R.id.tilReporting;
                                                TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReporting);
                                                if (textInputLayout4 != null) {
                                                    i = R.id.tvFillFormInstruction;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFillFormInstruction);
                                                    if (textView != null) {
                                                        i = R.id.tvPhotoError;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhotoError);
                                                        if (textView2 != null) {
                                                            i = R.id.tvTakeAccidentPhotoLabel;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTakeAccidentPhotoLabel);
                                                            if (textView3 != null) {
                                                                return new ActivityReportingAccidentBinding((ConstraintLayout) view, autoCompleteTextView, button, imageButton, textInputEditText, imageView, layoutToolbarCenterBindingBind, constraintLayout, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2, textView3);
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
