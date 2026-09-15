package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentClaimOldDaySecurityDocumentUploadBinding implements ViewBinding {
    public final Button btnNext;
    public final CardView cvBpjstkCardUpload;
    public final CardView cvFamilyCardUpload;
    public final CardView cvIdCardUpload;
    public final CardView cvPaklaringUpload;
    public final ImageView imgBpjstkCardUpload;
    public final ImageView imgBpjstkuCardPhoto;
    public final ImageView imgFamilyCardPhoto;
    public final ImageView imgFamilyCardUpload;
    public final ImageView imgIdCardUpload;
    public final ImageView imgIdPhoto;
    public final ImageView imgPaklaringPhoto;
    public final ImageView imgPaklaringUpload;
    private final ScrollView rootView;
    public final TextView tvFamilyCardError;
    public final TextView tvFamilyCardLabel;
    public final TextView tvIdCardError;
    public final TextView tvIdCardUploadLabel;
    public final TextView tvPaklaringError;
    public final TextView tvPaklaringUpload;
    public final TextView tvQuitWorkStatementFromCompanyNote;
    public final TextView tvUploadBpjstkCard;
    public final TextView tvUploadFamilyCard;
    public final TextView tvUploadIdCard;
    public final TextView tvUploadPaklaring;
    public final TextView tvvBpjstkCardUploadLabel;

    private FragmentClaimOldDaySecurityDocumentUploadBinding(ScrollView scrollView, Button button, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = scrollView;
        this.btnNext = button;
        this.cvBpjstkCardUpload = cardView;
        this.cvFamilyCardUpload = cardView2;
        this.cvIdCardUpload = cardView3;
        this.cvPaklaringUpload = cardView4;
        this.imgBpjstkCardUpload = imageView;
        this.imgBpjstkuCardPhoto = imageView2;
        this.imgFamilyCardPhoto = imageView3;
        this.imgFamilyCardUpload = imageView4;
        this.imgIdCardUpload = imageView5;
        this.imgIdPhoto = imageView6;
        this.imgPaklaringPhoto = imageView7;
        this.imgPaklaringUpload = imageView8;
        this.tvFamilyCardError = textView;
        this.tvFamilyCardLabel = textView2;
        this.tvIdCardError = textView3;
        this.tvIdCardUploadLabel = textView4;
        this.tvPaklaringError = textView5;
        this.tvPaklaringUpload = textView6;
        this.tvQuitWorkStatementFromCompanyNote = textView7;
        this.tvUploadBpjstkCard = textView8;
        this.tvUploadFamilyCard = textView9;
        this.tvUploadIdCard = textView10;
        this.tvUploadPaklaring = textView11;
        this.tvvBpjstkCardUploadLabel = textView12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentClaimOldDaySecurityDocumentUploadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentClaimOldDaySecurityDocumentUploadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_claim_old_day_security_document_upload, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentClaimOldDaySecurityDocumentUploadBinding bind(View view) {
        int i = R.id.btnNext;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (button != null) {
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
                                                        i = R.id.imgPaklaringUpload;
                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPaklaringUpload);
                                                        if (imageView8 != null) {
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
                                                                            i = R.id.tvPaklaringError;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringError);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvPaklaringUpload;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaklaringUpload);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvQuitWorkStatementFromCompanyNote;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQuitWorkStatementFromCompanyNote);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tvUploadBpjstkCard;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadBpjstkCard);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.tvUploadFamilyCard;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadFamilyCard);
                                                                                            if (textView9 != null) {
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadIdCard);
                                                                                                if (textView10 != null) {
                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUploadPaklaring);
                                                                                                    if (textView11 != null) {
                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvvBpjstkCardUploadLabel);
                                                                                                        if (textView12 != null) {
                                                                                                            return new FragmentClaimOldDaySecurityDocumentUploadBinding((ScrollView) view, button, cardView, cardView2, cardView3, cardView4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
                                                                                                        }
                                                                                                        i = R.id.tvvBpjstkCardUploadLabel;
                                                                                                    } else {
                                                                                                        i = R.id.tvUploadPaklaring;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvUploadIdCard;
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
