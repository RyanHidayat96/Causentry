package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityVocationalRegisteredParticipantBinding implements ViewBinding {
    public final Button btnNext;
    public final ConstraintLayout clInfo;
    public final CardView cvRegisteredParticipant;
    public final ImageView imgBackground;
    public final ImageView imgInfo;
    public final LayoutToolbarBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvFullName;
    public final TextView tvFullNameLabel;
    public final TextView tvIdCard;
    public final TextView tvIdCardLabel;
    public final TextView tvLpk;
    public final TextView tvLpkLabel;
    public final TextView tvRatingReminder;
    public final TextView tvRegisteredInformation;
    public final TextView tvTraining;
    public final TextView tvTrainingLabel;
    public final View viewFullNameSeparator;
    public final View viewIdCardSeparator;
    public final View viewTrainingSeparator;

    private ActivityVocationalRegisteredParticipantBinding(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, ImageView imageView2, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view, View view2, View view3) {
        this.rootView = constraintLayout;
        this.btnNext = button;
        this.clInfo = constraintLayout2;
        this.cvRegisteredParticipant = cardView;
        this.imgBackground = imageView;
        this.imgInfo = imageView2;
        this.layoutToolbar = layoutToolbarBinding;
        this.tvFullName = textView;
        this.tvFullNameLabel = textView2;
        this.tvIdCard = textView3;
        this.tvIdCardLabel = textView4;
        this.tvLpk = textView5;
        this.tvLpkLabel = textView6;
        this.tvRatingReminder = textView7;
        this.tvRegisteredInformation = textView8;
        this.tvTraining = textView9;
        this.tvTrainingLabel = textView10;
        this.viewFullNameSeparator = view;
        this.viewIdCardSeparator = view2;
        this.viewTrainingSeparator = view3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalRegisteredParticipantBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalRegisteredParticipantBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_registered_participant, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalRegisteredParticipantBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.clInfo;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clInfo);
            if (constraintLayout != null) {
                i = R.id.cvRegisteredParticipant;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvRegisteredParticipant);
                if (cardView != null) {
                    i = R.id.imgBackground;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (imageView != null) {
                        i = R.id.imgInfo;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgInfo);
                        if (imageView2 != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                                i = R.id.tvFullName;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFullName);
                                if (textView != null) {
                                    i = R.id.tvFullNameLabel;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFullNameLabel);
                                    if (textView2 != null) {
                                        i = R.id.tvIdCard;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCard);
                                        if (textView3 != null) {
                                            i = R.id.tvIdCardLabel;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardLabel);
                                            if (textView4 != null) {
                                                i = R.id.tvLpk;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpk);
                                                if (textView5 != null) {
                                                    i = R.id.tvLpkLabel;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpkLabel);
                                                    if (textView6 != null) {
                                                        i = R.id.tvRatingReminder;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRatingReminder);
                                                        if (textView7 != null) {
                                                            i = R.id.tvRegisteredInformation;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegisteredInformation);
                                                            if (textView8 != null) {
                                                                i = R.id.tvTraining;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTraining);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvTrainingLabel;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingLabel);
                                                                    if (textView10 != null) {
                                                                        i = R.id.viewFullNameSeparator;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewFullNameSeparator);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.viewIdCardSeparator;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewIdCardSeparator);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R.id.viewTrainingSeparator;
                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewTrainingSeparator);
                                                                                if (viewFindChildViewById4 != null) {
                                                                                    return new ActivityVocationalRegisteredParticipantBinding((ConstraintLayout) view, button, constraintLayout, cardView, imageView, imageView2, layoutToolbarBindingBind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
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
