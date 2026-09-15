package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityNonRegisterCompanyComplaintBinding implements ViewBinding {
    public final Button btnSendComplaintNonRegisteredCompany;
    public final ImageButton btnTakeCompanyPhoto;
    public final ImageView imgCamera;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final LinearLayout rootView;
    public final TextInputLayout tilCompanyAddress;
    public final TextInputLayout tilCompanyLocation;
    public final TextInputLayout tilCompanyName;
    public final TextView tvCompanyPhotoError;
    public final TextView tvFillForm;
    public final TextView tvTakePhoto;

    private ActivityNonRegisterCompanyComplaintBinding(LinearLayout linearLayout, Button button, ImageButton imageButton, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.btnSendComplaintNonRegisteredCompany = button;
        this.btnTakeCompanyPhoto = imageButton;
        this.imgCamera = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tilCompanyAddress = textInputLayout;
        this.tilCompanyLocation = textInputLayout2;
        this.tilCompanyName = textInputLayout3;
        this.tvCompanyPhotoError = textView;
        this.tvFillForm = textView2;
        this.tvTakePhoto = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityNonRegisterCompanyComplaintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNonRegisterCompanyComplaintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_non_register_company_complaint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNonRegisterCompanyComplaintBinding bind(View view) {
        int i = R.id.btnSendComplaintNonRegisteredCompany;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSendComplaintNonRegisteredCompany);
        if (button != null) {
            i = R.id.btnTakeCompanyPhoto;
            ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btnTakeCompanyPhoto);
            if (imageButton != null) {
                i = R.id.imgCamera;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCamera);
                if (imageView != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tilCompanyAddress;
                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCompanyAddress);
                        if (textInputLayout != null) {
                            i = R.id.tilCompanyLocation;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCompanyLocation);
                            if (textInputLayout2 != null) {
                                i = R.id.tilCompanyName;
                                TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilCompanyName);
                                if (textInputLayout3 != null) {
                                    i = R.id.tvCompanyPhotoError;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCompanyPhotoError);
                                    if (textView != null) {
                                        i = R.id.tvFillForm;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFillForm);
                                        if (textView2 != null) {
                                            i = R.id.tvTakePhoto;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTakePhoto);
                                            if (textView3 != null) {
                                                return new ActivityNonRegisterCompanyComplaintBinding((LinearLayout) view, button, imageButton, imageView, layoutToolbarCenterBindingBind, textInputLayout, textInputLayout2, textInputLayout3, textView, textView2, textView3);
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
