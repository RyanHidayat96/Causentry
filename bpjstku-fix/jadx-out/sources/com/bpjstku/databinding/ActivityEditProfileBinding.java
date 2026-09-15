package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityEditProfileBinding implements ViewBinding {
    public final CircleImageView civProfilePhoto;
    public final Guideline editProfileGuideline;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextView tvAddKpj;
    public final TextView tvChangeProfilePhoto;
    public final TextView tvEditEmail;
    public final TextView tvEditPassword;
    public final TextView tvEditPhoneNumber;
    public final TextView tvEmail;
    public final TextView tvPhoneNumber;
    public final View viewEmailSeparator;
    public final View viewKpjSeparator;
    public final View viewPasswordSeparator;
    public final View viewPhoneNumberSeparator;
    public final View viewProfilePhotoSeparator;

    private ActivityEditProfileBinding(ScrollView scrollView, CircleImageView circleImageView, Guideline guideline, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, View view, View view2, View view3, View view4, View view5) {
        this.rootView = scrollView;
        this.civProfilePhoto = circleImageView;
        this.editProfileGuideline = guideline;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvAddKpj = textView;
        this.tvChangeProfilePhoto = textView2;
        this.tvEditEmail = textView3;
        this.tvEditPassword = textView4;
        this.tvEditPhoneNumber = textView5;
        this.tvEmail = textView6;
        this.tvPhoneNumber = textView7;
        this.viewEmailSeparator = view;
        this.viewKpjSeparator = view2;
        this.viewPasswordSeparator = view3;
        this.viewPhoneNumberSeparator = view4;
        this.viewProfilePhotoSeparator = view5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEditProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEditProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_edit_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEditProfileBinding bind(View view) {
        int i = R.id.civProfilePhoto;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfilePhoto);
        if (circleImageView != null) {
            i = R.id.editProfileGuideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.editProfileGuideline);
            if (guideline != null) {
                i = R.id.layout_toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                if (viewFindChildViewById != null) {
                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                    i = R.id.tvAddKpj;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAddKpj);
                    if (textView != null) {
                        i = R.id.tvChangeProfilePhoto;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChangeProfilePhoto);
                        if (textView2 != null) {
                            i = R.id.tvEditEmail;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditEmail);
                            if (textView3 != null) {
                                i = R.id.tvEditPassword;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPassword);
                                if (textView4 != null) {
                                    i = R.id.tvEditPhoneNumber;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPhoneNumber);
                                    if (textView5 != null) {
                                        i = R.id.tvEmail;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmail);
                                        if (textView6 != null) {
                                            i = R.id.tvPhoneNumber;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumber);
                                            if (textView7 != null) {
                                                i = R.id.viewEmailSeparator;
                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewEmailSeparator);
                                                if (viewFindChildViewById2 != null) {
                                                    i = R.id.viewKpjSeparator;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewKpjSeparator);
                                                    if (viewFindChildViewById3 != null) {
                                                        i = R.id.viewPasswordSeparator;
                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewPasswordSeparator);
                                                        if (viewFindChildViewById4 != null) {
                                                            i = R.id.viewPhoneNumberSeparator;
                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewPhoneNumberSeparator);
                                                            if (viewFindChildViewById5 != null) {
                                                                i = R.id.viewProfilePhotoSeparator;
                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewProfilePhotoSeparator);
                                                                if (viewFindChildViewById6 != null) {
                                                                    return new ActivityEditProfileBinding((ScrollView) view, circleImageView, guideline, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
