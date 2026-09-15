package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBookingAntreanSuccessBinding implements ViewBinding {
    public final MaterialButton btnKembaliHalamanAwal;
    public final CardView cardDataPeserta;
    public final ImageView ivBack;
    public final ImageView ivBarcodeImage;
    public final LinearLayout linearAlamatKantorCabang;
    public final LinearLayout linearEmail;
    public final LinearLayout linearHandphone;
    public final LinearLayout linearJamKedatangan;
    public final LinearLayout linearLayanan;
    public final LinearLayout linearNamaKantorCabang;
    public final LinearLayout linearNamaLengkap;
    public final LinearLayout linearNikNomorKartu;
    public final LinearLayout linearTanggalKedatangan;
    private final ConstraintLayout rootView;
    public final TextView tvKodeBookingValue;
    public final TextView tvNarasiConfirm;
    public final TextView tvNarasiDatang;
    public final TextView tvNarasiTerimakasih;
    public final TextView tvSuccessAlamatKantor;
    public final TextView tvSuccessEmail;
    public final TextView tvSuccessHandphone;
    public final TextView tvSuccessJam;
    public final TextView tvSuccessKantorCabang;
    public final TextView tvSuccessNamaLengkap;
    public final TextView tvSuccessNik;
    public final TextView tvSuccessTanggal;
    public final TextView tvSuccessTitle;
    public final TextView tvSuccessTopik;

    private ActivityBookingAntreanSuccessBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14) {
        this.rootView = constraintLayout;
        this.btnKembaliHalamanAwal = materialButton;
        this.cardDataPeserta = cardView;
        this.ivBack = imageView;
        this.ivBarcodeImage = imageView2;
        this.linearAlamatKantorCabang = linearLayout;
        this.linearEmail = linearLayout2;
        this.linearHandphone = linearLayout3;
        this.linearJamKedatangan = linearLayout4;
        this.linearLayanan = linearLayout5;
        this.linearNamaKantorCabang = linearLayout6;
        this.linearNamaLengkap = linearLayout7;
        this.linearNikNomorKartu = linearLayout8;
        this.linearTanggalKedatangan = linearLayout9;
        this.tvKodeBookingValue = textView;
        this.tvNarasiConfirm = textView2;
        this.tvNarasiDatang = textView3;
        this.tvNarasiTerimakasih = textView4;
        this.tvSuccessAlamatKantor = textView5;
        this.tvSuccessEmail = textView6;
        this.tvSuccessHandphone = textView7;
        this.tvSuccessJam = textView8;
        this.tvSuccessKantorCabang = textView9;
        this.tvSuccessNamaLengkap = textView10;
        this.tvSuccessNik = textView11;
        this.tvSuccessTanggal = textView12;
        this.tvSuccessTitle = textView13;
        this.tvSuccessTopik = textView14;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBookingAntreanSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBookingAntreanSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_booking_antrean_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityBookingAntreanSuccessBinding bind(View view) {
        int i = R.id.btnKembaliHalamanAwal;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnKembaliHalamanAwal);
        if (materialButton != null) {
            i = R.id.cardDataPeserta;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cardDataPeserta);
            if (cardView != null) {
                i = R.id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivBack);
                if (imageView != null) {
                    i = R.id.ivBarcodeImage;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivBarcodeImage);
                    if (imageView2 != null) {
                        i = R.id.linearAlamatKantorCabang;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearAlamatKantorCabang);
                        if (linearLayout != null) {
                            i = R.id.linearEmail;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearEmail);
                            if (linearLayout2 != null) {
                                i = R.id.linearHandphone;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearHandphone);
                                if (linearLayout3 != null) {
                                    i = R.id.linearJamKedatangan;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearJamKedatangan);
                                    if (linearLayout4 != null) {
                                        i = R.id.linearLayanan;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayanan);
                                        if (linearLayout5 != null) {
                                            i = R.id.linearNamaKantorCabang;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearNamaKantorCabang);
                                            if (linearLayout6 != null) {
                                                i = R.id.linearNamaLengkap;
                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearNamaLengkap);
                                                if (linearLayout7 != null) {
                                                    i = R.id.linearNikNomorKartu;
                                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearNikNomorKartu);
                                                    if (linearLayout8 != null) {
                                                        i = R.id.linearTanggalKedatangan;
                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearTanggalKedatangan);
                                                        if (linearLayout9 != null) {
                                                            i = R.id.tvKodeBookingValue;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvKodeBookingValue);
                                                            if (textView != null) {
                                                                i = R.id.tvNarasiConfirm;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNarasiConfirm);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvNarasiDatang;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNarasiDatang);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvNarasiTerimakasih;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNarasiTerimakasih);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvSuccessAlamatKantor;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessAlamatKantor);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvSuccessEmail;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessEmail);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvSuccessHandphone;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessHandphone);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tvSuccessJam;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessJam);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.tvSuccessKantorCabang;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessKantorCabang);
                                                                                            if (textView9 != null) {
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessNamaLengkap);
                                                                                                if (textView10 != null) {
                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessNik);
                                                                                                    if (textView11 != null) {
                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessTanggal);
                                                                                                        if (textView12 != null) {
                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessTitle);
                                                                                                            if (textView13 != null) {
                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessTopik);
                                                                                                                if (textView14 != null) {
                                                                                                                    return new ActivityBookingAntreanSuccessBinding((ConstraintLayout) view, materialButton, cardView, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                                                }
                                                                                                                i = R.id.tvSuccessTopik;
                                                                                                            } else {
                                                                                                                i = R.id.tvSuccessTitle;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvSuccessTanggal;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvSuccessNik;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvSuccessNamaLengkap;
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
