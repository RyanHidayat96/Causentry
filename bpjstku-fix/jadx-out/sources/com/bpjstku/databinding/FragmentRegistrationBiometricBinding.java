package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentRegistrationBiometricBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvLivenessCheck;
    public final MaterialCardView cvSelfieInfo;
    public final View divider1;
    public final View divider2;
    public final ImageView imgLivenessCheck;
    public final AppCompatImageView imgLivenessCheck2;
    public final AppCompatImageView imgLivenessCheck3;
    public final AppCompatImageView imgLivenessGood;
    public final AppCompatImageView imgLivenessWrong;
    public final ImageView imgSelfiePhoto;
    public final AppCompatImageView ivInformation;
    public final LinearLayout llDo1;
    public final LinearLayout llDo2;
    public final LinearLayout llDo3;
    public final LinearLayout llDo4;
    public final LinearLayout llDo5;
    public final LinearLayout llExampleImages;
    public final LinearLayout llPanduanBox;
    private final ScrollView rootView;
    public final AppCompatTextView tvDoTitle;
    public final TextView tvLivenessCheck;
    public final TextView tvLivenessCheckLabel;
    public final AppCompatTextView tvTitleInformation;
    public final AppCompatTextView tvTitleInformation1;

    private FragmentRegistrationBiometricBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, MaterialCardView materialCardView, View view, View view2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, ImageView imageView2, AppCompatImageView appCompatImageView5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, AppCompatTextView appCompatTextView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvLivenessCheck = cardView;
        this.cvSelfieInfo = materialCardView;
        this.divider1 = view;
        this.divider2 = view2;
        this.imgLivenessCheck = imageView;
        this.imgLivenessCheck2 = appCompatImageView;
        this.imgLivenessCheck3 = appCompatImageView2;
        this.imgLivenessGood = appCompatImageView3;
        this.imgLivenessWrong = appCompatImageView4;
        this.imgSelfiePhoto = imageView2;
        this.ivInformation = appCompatImageView5;
        this.llDo1 = linearLayout;
        this.llDo2 = linearLayout2;
        this.llDo3 = linearLayout3;
        this.llDo4 = linearLayout4;
        this.llDo5 = linearLayout5;
        this.llExampleImages = linearLayout6;
        this.llPanduanBox = linearLayout7;
        this.tvDoTitle = appCompatTextView;
        this.tvLivenessCheck = textView;
        this.tvLivenessCheckLabel = textView2;
        this.tvTitleInformation = appCompatTextView2;
        this.tvTitleInformation1 = appCompatTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentRegistrationBiometricBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentRegistrationBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_registration_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentRegistrationBiometricBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvLivenessCheck;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvLivenessCheck);
            if (cardView != null) {
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvSelfieInfo);
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divider1);
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.divider2);
                i = R.id.imgLivenessCheck;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck);
                if (imageView != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck2);
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck3);
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessGood);
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessWrong);
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelfiePhoto);
                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivInformation);
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo1);
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo2);
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo3);
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo4);
                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDo5);
                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llExampleImages);
                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llPanduanBox);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDoTitle);
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheck);
                    i = R.id.tvLivenessCheckLabel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheckLabel);
                    if (textView2 != null) {
                        i = R.id.tvTitleInformation;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                        if (appCompatTextView2 != null) {
                            return new FragmentRegistrationBiometricBinding((ScrollView) view, materialButton, cardView, materialCardView, viewFindChildViewById, viewFindChildViewById2, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, imageView2, appCompatImageView5, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, appCompatTextView, textView, textView2, appCompatTextView2, (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation1));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
