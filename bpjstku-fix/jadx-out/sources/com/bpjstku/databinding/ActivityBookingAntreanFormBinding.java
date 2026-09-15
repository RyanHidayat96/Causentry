package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBookingAntreanFormBinding implements ViewBinding {
    public final TextView actvJam;
    public final TextView actvKantorCabang;
    public final TextView actvTanggal;
    public final MaterialButton btnSelanjutnya;
    public final TextView etKategori;
    public final TextView etTopik;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvAlamatKantor;
    public final TextView tvFormSubtitle;
    public final TextView tvFormTitle;
    public final TextView tvLabelJam;
    public final TextView tvLabelKantorCabang;
    public final TextView tvLabelKategori;
    public final TextView tvLabelTanggal;
    public final TextView tvLabelTopik;

    private ActivityBookingAntreanFormBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, MaterialButton materialButton, TextView textView4, TextView textView5, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = constraintLayout;
        this.actvJam = textView;
        this.actvKantorCabang = textView2;
        this.actvTanggal = textView3;
        this.btnSelanjutnya = materialButton;
        this.etKategori = textView4;
        this.etTopik = textView5;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvAlamatKantor = textView6;
        this.tvFormSubtitle = textView7;
        this.tvFormTitle = textView8;
        this.tvLabelJam = textView9;
        this.tvLabelKantorCabang = textView10;
        this.tvLabelKategori = textView11;
        this.tvLabelTanggal = textView12;
        this.tvLabelTopik = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityBookingAntreanFormBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityBookingAntreanFormBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_booking_antrean_form, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityBookingAntreanFormBinding bind(View view) {
        int i = R.id.actvJam;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.actvJam);
        if (textView != null) {
            i = R.id.actvKantorCabang;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.actvKantorCabang);
            if (textView2 != null) {
                i = R.id.actvTanggal;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.actvTanggal);
                if (textView3 != null) {
                    i = R.id.btnSelanjutnya;
                    MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSelanjutnya);
                    if (materialButton != null) {
                        i = R.id.etKategori;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.etKategori);
                        if (textView4 != null) {
                            i = R.id.etTopik;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.etTopik);
                            if (textView5 != null) {
                                i = R.id.layoutToolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                                if (viewFindChildViewById != null) {
                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                    i = R.id.tvAlamatKantor;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAlamatKantor);
                                    if (textView6 != null) {
                                        i = R.id.tvFormSubtitle;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFormSubtitle);
                                        if (textView7 != null) {
                                            i = R.id.tvFormTitle;
                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFormTitle);
                                            if (textView8 != null) {
                                                i = R.id.tvLabelJam;
                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelJam);
                                                if (textView9 != null) {
                                                    i = R.id.tvLabelKantorCabang;
                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKantorCabang);
                                                    if (textView10 != null) {
                                                        i = R.id.tvLabelKategori;
                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKategori);
                                                        if (textView11 != null) {
                                                            i = R.id.tvLabelTanggal;
                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTanggal);
                                                            if (textView12 != null) {
                                                                i = R.id.tvLabelTopik;
                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTopik);
                                                                if (textView13 != null) {
                                                                    return new ActivityBookingAntreanFormBinding((ConstraintLayout) view, textView, textView2, textView3, materialButton, textView4, textView5, layoutToolbarCenterBindingBind, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
