package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBookingAntreanConfirmationBinding implements ViewBinding {
    public final MaterialButton btnSubmit;
    public final CheckBox cbPersetujuan;
    public final TextView etKategori;
    public final ImageView ivBack;
    private final ConstraintLayout rootView;
    public final TextView tvConfirmSubtitle;
    public final TextView tvConfirmTitle;
    public final TextView tvConfirmValueJam;
    public final TextView tvConfirmValueKantorCabang;
    public final TextView tvConfirmValueTanggal;
    public final TextView tvConfirmValueTopik;
    public final TextView tvLabelJam;
    public final TextView tvLabelKantorCabang;
    public final TextView tvLabelKategori;
    public final TextView tvLabelTanggal;
    public final TextView tvLabelTopik;

    private ActivityBookingAntreanConfirmationBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, CheckBox checkBox, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        this.rootView = constraintLayout;
        this.btnSubmit = materialButton;
        this.cbPersetujuan = checkBox;
        this.etKategori = textView;
        this.ivBack = imageView;
        this.tvConfirmSubtitle = textView2;
        this.tvConfirmTitle = textView3;
        this.tvConfirmValueJam = textView4;
        this.tvConfirmValueKantorCabang = textView5;
        this.tvConfirmValueTanggal = textView6;
        this.tvConfirmValueTopik = textView7;
        this.tvLabelJam = textView8;
        this.tvLabelKantorCabang = textView9;
        this.tvLabelKategori = textView10;
        this.tvLabelTanggal = textView11;
        this.tvLabelTopik = textView12;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBookingAntreanConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBookingAntreanConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_booking_antrean_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityBookingAntreanConfirmationBinding bind(View view) {
        int i = R.id.btnSubmit;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSubmit);
        if (materialButton != null) {
            i = R.id.cbPersetujuan;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cbPersetujuan);
            if (checkBox != null) {
                i = R.id.etKategori;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.etKategori);
                if (textView != null) {
                    i = R.id.ivBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivBack);
                    if (imageView != null) {
                        i = R.id.tvConfirmSubtitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmSubtitle);
                        if (textView2 != null) {
                            i = R.id.tvConfirmTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmTitle);
                            if (textView3 != null) {
                                i = R.id.tvConfirmValueJam;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmValueJam);
                                if (textView4 != null) {
                                    i = R.id.tvConfirmValueKantorCabang;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmValueKantorCabang);
                                    if (textView5 != null) {
                                        i = R.id.tvConfirmValueTanggal;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmValueTanggal);
                                        if (textView6 != null) {
                                            i = R.id.tvConfirmValueTopik;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvConfirmValueTopik);
                                            if (textView7 != null) {
                                                i = R.id.tvLabelJam;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelJam);
                                                if (textView8 != null) {
                                                    i = R.id.tvLabelKantorCabang;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKantorCabang);
                                                    if (textView9 != null) {
                                                        i = R.id.tvLabelKategori;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKategori);
                                                        if (textView10 != null) {
                                                            i = R.id.tvLabelTanggal;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTanggal);
                                                            if (textView11 != null) {
                                                                i = R.id.tvLabelTopik;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTopik);
                                                                if (textView12 != null) {
                                                                    return new ActivityBookingAntreanConfirmationBinding((ConstraintLayout) view, materialButton, checkBox, textView, imageView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
