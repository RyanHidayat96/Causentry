package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAddKpjBinding implements ViewBinding {
    public final AppCompatAutoCompleteTextView actvChooseCitizenship;
    public final AppCompatAutoCompleteTextView actvChooseSegment;
    public final Button btnSave;
    public final TextInputEditText edtIdentityNumber;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextInputLayout tilChooseCitizenship;
    public final TextInputLayout tilChooseSegment;
    public final TextInputLayout tilIdentityNumber;

    private ActivityAddKpjBinding(ConstraintLayout constraintLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2, Button button, TextInputEditText textInputEditText, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3) {
        this.rootView = constraintLayout;
        this.actvChooseCitizenship = appCompatAutoCompleteTextView;
        this.actvChooseSegment = appCompatAutoCompleteTextView2;
        this.btnSave = button;
        this.edtIdentityNumber = textInputEditText;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilChooseCitizenship = textInputLayout;
        this.tilChooseSegment = textInputLayout2;
        this.tilIdentityNumber = textInputLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAddKpjBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAddKpjBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_add_kpj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAddKpjBinding bind(View view) {
        int i = R.id.actvChooseCitizenship;
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvChooseCitizenship);
        if (appCompatAutoCompleteTextView != null) {
            i = R.id.actvChooseSegment;
            AppCompatAutoCompleteTextView appCompatAutoCompleteTextView2 = (AppCompatAutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actvChooseSegment);
            if (appCompatAutoCompleteTextView2 != null) {
                i = R.id.btnSave;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSave);
                if (button != null) {
                    i = R.id.edtIdentityNumber;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtIdentityNumber);
                    if (textInputEditText != null) {
                        i = R.id.imgBackground;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                        if (imageView != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                i = R.id.tilChooseCitizenship;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseCitizenship);
                                if (textInputLayout != null) {
                                    i = R.id.tilChooseSegment;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseSegment);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tilIdentityNumber;
                                        TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdentityNumber);
                                        if (textInputLayout3 != null) {
                                            return new ActivityAddKpjBinding((ConstraintLayout) view, appCompatAutoCompleteTextView, appCompatAutoCompleteTextView2, button, textInputEditText, imageView, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3);
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
