package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentClaimOldDataSecurityMemberDataVerificationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final CardView cvLivenessCheck;
    public final MaterialCardView cvSelfieInfo;
    public final ImageView imgLivenessCheck;
    public final ImageView imgSelfiePhoto;
    public final AppCompatImageView ivInformation;
    private final ScrollView rootView;
    public final TextView tvLivenessCheck;
    public final TextView tvLivenessCheckLabel;
    public final AppCompatTextView tvTitleInformation;

    private FragmentClaimOldDataSecurityMemberDataVerificationBinding(ScrollView scrollView, MaterialButton materialButton, CardView cardView, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, AppCompatTextView appCompatTextView) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cvLivenessCheck = cardView;
        this.cvSelfieInfo = materialCardView;
        this.imgLivenessCheck = imageView;
        this.imgSelfiePhoto = imageView2;
        this.ivInformation = appCompatImageView;
        this.tvLivenessCheck = textView;
        this.tvLivenessCheckLabel = textView2;
        this.tvTitleInformation = appCompatTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDataSecurityMemberDataVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDataSecurityMemberDataVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_data_security_member_data_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDataSecurityMemberDataVerificationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cvLivenessCheck;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvLivenessCheck);
            if (cardView != null) {
                i = R.id.cvSelfieInfo;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvSelfieInfo);
                if (materialCardView != null) {
                    i = R.id.imgLivenessCheck;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLivenessCheck);
                    if (imageView != null) {
                        i = R.id.imgSelfiePhoto;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSelfiePhoto);
                        if (imageView2 != null) {
                            i = R.id.ivInformation;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.ivInformation);
                            if (appCompatImageView != null) {
                                i = R.id.tvLivenessCheck;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheck);
                                if (textView != null) {
                                    i = R.id.tvLivenessCheckLabel;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLivenessCheckLabel);
                                    if (textView2 != null) {
                                        i = R.id.tvTitleInformation;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformation);
                                        if (appCompatTextView != null) {
                                            return new FragmentClaimOldDataSecurityMemberDataVerificationBinding((ScrollView) view, materialButton, cardView, materialCardView, imageView, imageView2, appCompatImageView, textView, textView2, appCompatTextView);
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
