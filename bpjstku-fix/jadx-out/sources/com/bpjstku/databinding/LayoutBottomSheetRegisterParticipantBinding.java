package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutBottomSheetRegisterParticipantBinding implements ViewBinding {
    public final LinearLayout containerChooseMembership;
    public final Group groupIndonesianMigrantWorker;
    public final Group groupNonSalariedWorkerCm;
    public final Group groupSalariedWorker;
    public final ImageView imgArrowIndonesianMigrantWorker;
    public final ImageView imgArrowNonSalariedWorker;
    public final ImageView imgArrowSalariedWorker;
    public final ImageView imgIndonesianMigrantWorker;
    public final AppCompatImageView imgLineBottomSheet;
    public final AppCompatImageView imgLineBottomSheetChooseMembership;
    public final ImageView imgNonSalariedWorker;
    public final ImageView imgSalariedWorker;
    public final RelativeLayout rlBottomSheetRegistrationParticipant;
    private final RelativeLayout rootView;
    public final TextView tvChooseParticipant;
    public final AppCompatTextView tvDescriptionRegisterParticipant;
    public final TextView tvIndonesianMigrantWorker;
    public final TextView tvNonSalariedWorker;
    public final TextView tvSalariedWorker;
    public final AppCompatTextView tvTitleRegisterParticipant;
    public final LottieAnimationView viewBottomSheetRegistrationParticipant;

    private LayoutBottomSheetRegisterParticipantBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, Group group, Group group2, Group group3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView5, ImageView imageView6, RelativeLayout relativeLayout2, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView2, LottieAnimationView lottieAnimationView) {
        this.rootView = relativeLayout;
        this.containerChooseMembership = linearLayout;
        this.groupIndonesianMigrantWorker = group;
        this.groupNonSalariedWorkerCm = group2;
        this.groupSalariedWorker = group3;
        this.imgArrowIndonesianMigrantWorker = imageView;
        this.imgArrowNonSalariedWorker = imageView2;
        this.imgArrowSalariedWorker = imageView3;
        this.imgIndonesianMigrantWorker = imageView4;
        this.imgLineBottomSheet = appCompatImageView;
        this.imgLineBottomSheetChooseMembership = appCompatImageView2;
        this.imgNonSalariedWorker = imageView5;
        this.imgSalariedWorker = imageView6;
        this.rlBottomSheetRegistrationParticipant = relativeLayout2;
        this.tvChooseParticipant = textView;
        this.tvDescriptionRegisterParticipant = appCompatTextView;
        this.tvIndonesianMigrantWorker = textView2;
        this.tvNonSalariedWorker = textView3;
        this.tvSalariedWorker = textView4;
        this.tvTitleRegisterParticipant = appCompatTextView2;
        this.viewBottomSheetRegistrationParticipant = lottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutBottomSheetRegisterParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutBottomSheetRegisterParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheet_register_participant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutBottomSheetRegisterParticipantBinding bind(View view) {
        int i = R.id.containerChooseMembership;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.containerChooseMembership);
        if (linearLayout != null) {
            i = R.id.groupIndonesianMigrantWorker;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupIndonesianMigrantWorker);
            if (group != null) {
                i = R.id.groupNonSalariedWorkerCm;
                Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.groupNonSalariedWorkerCm);
                if (group2 != null) {
                    i = R.id.groupSalariedWorker;
                    Group group3 = (Group) ViewBindings.findChildViewById(view, R.id.groupSalariedWorker);
                    if (group3 != null) {
                        i = R.id.imgArrowIndonesianMigrantWorker;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowIndonesianMigrantWorker);
                        if (imageView != null) {
                            i = R.id.imgArrowNonSalariedWorker;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowNonSalariedWorker);
                            if (imageView2 != null) {
                                i = R.id.imgArrowSalariedWorker;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowSalariedWorker);
                                if (imageView3 != null) {
                                    i = R.id.imgIndonesianMigrantWorker;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIndonesianMigrantWorker);
                                    if (imageView4 != null) {
                                        i = R.id.imgLineBottomSheet;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLineBottomSheet);
                                        if (appCompatImageView != null) {
                                            i = R.id.imgLineBottomSheetChooseMembership;
                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgLineBottomSheetChooseMembership);
                                            if (appCompatImageView2 != null) {
                                                i = R.id.imgNonSalariedWorker;
                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNonSalariedWorker);
                                                if (imageView5 != null) {
                                                    i = R.id.imgSalariedWorker;
                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSalariedWorker);
                                                    if (imageView6 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                                        i = R.id.tvChooseParticipant;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseParticipant);
                                                        if (textView != null) {
                                                            i = R.id.tvDescriptionRegisterParticipant;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDescriptionRegisterParticipant);
                                                            if (appCompatTextView != null) {
                                                                i = R.id.tvIndonesianMigrantWorker;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIndonesianMigrantWorker);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvNonSalariedWorker;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNonSalariedWorker);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvSalariedWorker;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSalariedWorker);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvTitleRegisterParticipant;
                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleRegisterParticipant);
                                                                            if (appCompatTextView2 != null) {
                                                                                i = R.id.viewBottomSheetRegistrationParticipant;
                                                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.viewBottomSheetRegistrationParticipant);
                                                                                if (lottieAnimationView != null) {
                                                                                    return new LayoutBottomSheetRegisterParticipantBinding(relativeLayout, linearLayout, group, group2, group3, imageView, imageView2, imageView3, imageView4, appCompatImageView, appCompatImageView2, imageView5, imageView6, relativeLayout, textView, appCompatTextView, textView2, textView3, textView4, appCompatTextView2, lottieAnimationView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
