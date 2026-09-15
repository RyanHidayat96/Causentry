package com.bpjstku.databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityVocationalTrainingDetilInformationBinding implements ViewBinding {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static int b;
    public final Button btnApplyNow;
    public final MaterialCardView cvTrainingDescription;
    public final MaterialCardView cvTrainingModule;
    public final ImageView imgShowMore;
    public final ImageView imgTrainingDuration;
    public final ImageView imgTrainingLocation;
    public final ImageView imgTrainingParticipants;
    private final ScrollView rootView;
    public final MaterialToolbar toolbar;
    public final TextView tvLpkname;
    public final TextView tvRating;
    public final TextView tvShowMore;
    public final TextView tvToolbarTitle;
    public final TextView tvTrainingDescription;
    public final TextView tvTrainingDescriptionTitle;
    public final TextView tvTrainingDuration;
    public final TextView tvTrainingLocation;
    public final TextView tvTrainingModule;
    public final TextView tvTrainingModuleTitle;
    public final TextView tvTrainingParticipants;

    private ActivityVocationalTrainingDetilInformationBinding(ScrollView scrollView, Button button, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, MaterialToolbar materialToolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = scrollView;
        this.btnApplyNow = button;
        this.cvTrainingDescription = materialCardView;
        this.cvTrainingModule = materialCardView2;
        this.imgShowMore = imageView;
        this.imgTrainingDuration = imageView2;
        this.imgTrainingLocation = imageView3;
        this.imgTrainingParticipants = imageView4;
        this.toolbar = materialToolbar;
        this.tvLpkname = textView;
        this.tvRating = textView2;
        this.tvShowMore = textView3;
        this.tvToolbarTitle = textView4;
        this.tvTrainingDescription = textView5;
        this.tvTrainingDescriptionTitle = textView6;
        this.tvTrainingDuration = textView7;
        this.tvTrainingLocation = textView8;
        this.tvTrainingModule = textView9;
        this.tvTrainingModuleTitle = textView10;
        this.tvTrainingParticipants = textView11;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalTrainingDetilInformationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalTrainingDetilInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_training_detil_information, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalTrainingDetilInformationBinding bind(View view) {
        int i = R.id.btnApplyNow;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnApplyNow);
        if (button != null) {
            i = R.id.cvTrainingDescription;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvTrainingDescription);
            if (materialCardView != null) {
                i = R.id.cvTrainingModule;
                MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvTrainingModule);
                if (materialCardView2 != null) {
                    i = R.id.imgShowMore;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgShowMore);
                    if (imageView != null) {
                        i = R.id.imgTrainingDuration;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTrainingDuration);
                        if (imageView2 != null) {
                            i = R.id.imgTrainingLocation;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTrainingLocation);
                            if (imageView3 != null) {
                                i = R.id.imgTrainingParticipants;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTrainingParticipants);
                                if (imageView4 != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                                    if (materialToolbar != null) {
                                        i = R.id.tvLpkname;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpkname);
                                        if (textView != null) {
                                            i = R.id.tvRating;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRating);
                                            if (textView2 != null) {
                                                i = R.id.tvShowMore;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvShowMore);
                                                if (textView3 != null) {
                                                    i = R.id.tvToolbarTitle;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvToolbarTitle);
                                                    if (textView4 != null) {
                                                        i = R.id.tvTrainingDescription;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingDescription);
                                                        if (textView5 != null) {
                                                            i = R.id.tvTrainingDescriptionTitle;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingDescriptionTitle);
                                                            if (textView6 != null) {
                                                                i = R.id.tvTrainingDuration;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingDuration);
                                                                if (textView7 != null) {
                                                                    i = R.id.tvTrainingLocation;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingLocation);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tvTrainingModule;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingModule);
                                                                        if (textView9 != null) {
                                                                            i = R.id.tvTrainingModuleTitle;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingModuleTitle);
                                                                            if (textView10 != null) {
                                                                                i = R.id.tvTrainingParticipants;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingParticipants);
                                                                                if (textView11 != null) {
                                                                                    return new ActivityVocationalTrainingDetilInformationBinding((ScrollView) view, button, materialCardView, materialCardView2, imageView, imageView2, imageView3, imageView4, materialToolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = b;
        int i2 = i % 8783548;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }
}
