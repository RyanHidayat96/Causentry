package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding implements ViewBinding {
    public final Button btnNext;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final CardView cvBpjstkCardUpload;
    public final CardView cvFamilyCardUpload;
    public final CardView cvIdCardUpload;
    public final CardView cvPaklaringUpload;
    public final CardView cvPaklaringUpload1;
    public final ImageView imgBpjstkCardUpload;
    public final ImageView imgBpjstkuCardPhoto;
    public final ImageView imgFamilyCardPhoto;
    public final ImageView imgFamilyCardUpload;
    public final ImageView imgIdCardUpload;
    public final ImageView imgIdPhoto;
    public final ImageView imgPaklaringPhoto;
    public final ImageView imgPaklaringPhoto1;
    public final ImageView imgPaklaringUpload;
    public final ImageView imgPaklaringUpload1;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final TextView tvFamilyCardError;
    public final TextView tvFamilyCardLabel;
    public final TextView tvIdCardError;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvPaklaringError;
    public final TextView tvPaklaringError1;
    public final TextView tvPaklaringUpload;
    public final TextView tvPaklaringUpload1;
    public final TextView tvUploadBpjstkCard;
    public final TextView tvUploadFamilyCard;
    public final TextView tvUploadIdCard;
    public final TextView tvUploadPaklaring;
    public final TextView tvUploadPaklaring1;
    public final TextView tvvBpjstkCardUploadLabel;

    private ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding(ScrollView scrollView, Button button, AppCompatCheckBox appCompatCheckBox, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, CardView cardView5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.cvBpjstkCardUpload = cardView;
        this.cvFamilyCardUpload = cardView2;
        this.cvIdCardUpload = cardView3;
        this.cvPaklaringUpload = cardView4;
        this.cvPaklaringUpload1 = cardView5;
        this.imgBpjstkCardUpload = imageView;
        this.imgBpjstkuCardPhoto = imageView2;
        this.imgFamilyCardPhoto = imageView3;
        this.imgFamilyCardUpload = imageView4;
        this.imgIdCardUpload = imageView5;
        this.imgIdPhoto = imageView6;
        this.imgPaklaringPhoto = imageView7;
        this.imgPaklaringPhoto1 = imageView8;
        this.imgPaklaringUpload = imageView9;
        this.imgPaklaringUpload1 = imageView10;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvFamilyCardError = textView;
        this.tvFamilyCardLabel = textView2;
        this.tvIdCardError = textView3;
        this.tvIdCardUploadLabel = textView4;
        this.tvPaklaringError = textView5;
        this.tvPaklaringError1 = textView6;
        this.tvPaklaringUpload = textView7;
        this.tvPaklaringUpload1 = textView8;
        this.tvUploadBpjstkCard = textView9;
        this.tvUploadFamilyCard = textView10;
        this.tvUploadIdCard = textView11;
        this.tvUploadPaklaring = textView12;
        this.tvUploadPaklaring1 = textView13;
        this.tvvBpjstkCardUploadLabel = textView14;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_old_day_security_work_termination_participant_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.cvBpjstkCardUpload;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvBpjstkCardUpload);
                if (cardView != null) {
                    i = R.id.cvFamilyCardUpload;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvFamilyCardUpload);
                    if (cardView2 != null) {
                        i = R.id.cvIdCardUpload;
                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.cvIdCardUpload);
                        if (cardView3 != null) {
                            i = R.id.cvPaklaringUpload;
                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, R.id.cvPaklaringUpload);
                            if (cardView4 != null) {
                                i = R.id.cvPaklaringUpload1;
                                CardView cardView5 = (CardView) ViewBindings.findChildViewById(view, R.id.cvPaklaringUpload1);
                                if (cardView5 != null) {
                                    i = R.id.imgBpjstkCardUpload;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBpjstkCardUpload);
                                    if (imageView != null) {
                                        i = R.id.imgBpjstkuCardPhoto;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBpjstkuCardPhoto);
                                        if (imageView2 != null) {
                                            i = R.id.imgFamilyCardPhoto;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgFamilyCardPhoto);
                                            if (imageView3 != null) {
                                                i = R.id.imgFamilyCardUpload;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgFamilyCardUpload);
                                                if (imageView4 != null) {
                                                    i = R.id.imgIdCardUpload;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCardUpload);
                                                    if (imageView5 != null) {
                                                        i = R.id.imgIdPhoto;
                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdPhoto);
                                                        if (imageView6 != null) {
                                                            i = R.id.imgPaklaringPhoto;
                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaklaringPhoto);
                                                            if (imageView7 != null) {
                                                                i = R.id.imgPaklaringPhoto1;
                                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaklaringPhoto1);
                                                                if (imageView8 != null) {
                                                                    i = R.id.imgPaklaringUpload;
                                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaklaringUpload);
                                                                    if (imageView9 != null) {
                                                                        i = R.id.imgPaklaringUpload1;
                                                                        ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaklaringUpload1);
                                                                        if (imageView10 != null) {
                                                                            i = R.id.layout_toolbar;
                                                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                                            if (viewFindChildViewById != null) {
                                                                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                                                                i = R.id.tvFamilyCardError;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvFamilyCardError);
                                                                                if (textView != null) {
                                                                                    i = R.id.tvFamilyCardLabel;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFamilyCardLabel);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvIdCardError;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardError);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tvIdCardUploadLabel;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCardUploadLabel);
                                                                                            if (textView4 != null) {
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringError);
                                                                                                if (textView5 != null) {
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringError1);
                                                                                                    if (textView6 != null) {
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringUpload);
                                                                                                        if (textView7 != null) {
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringUpload1);
                                                                                                            if (textView8 != null) {
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadBpjstkCard);
                                                                                                                if (textView9 != null) {
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadFamilyCard);
                                                                                                                    if (textView10 != null) {
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadIdCard);
                                                                                                                        if (textView11 != null) {
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadPaklaring);
                                                                                                                            if (textView12 != null) {
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadPaklaring1);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvvBpjstkCardUploadLabel);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        return new ActivityClaimOldDaySecurityWorkTerminationParticipantConfirmationBinding((ScrollView) view, button, appCompatCheckBox, cardView, cardView2, cardView3, cardView4, cardView5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                                                                    }
                                                                                                                                    i = R.id.tvvBpjstkCardUploadLabel;
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvUploadPaklaring1;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvUploadPaklaring;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvUploadIdCard;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvUploadFamilyCard;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvUploadBpjstkCard;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvPaklaringUpload1;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvPaklaringUpload;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvPaklaringError1;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvPaklaringError;
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
