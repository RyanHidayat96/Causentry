package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailComplaintBottomSheetBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final View line1;
    public final LinearLayout llEmployee;
    public final LinearLayout llEmployeeAct;
    public final LinearLayout llNominalAct;
    public final LinearLayout llNotes;
    public final LinearLayout llStatusAct;
    public final LinearLayout llStatusKpj;
    private final ConstraintLayout rootView;
    public final TextView tvAmountAct;
    public final Barrier tvBarrierBottom;
    public final Barrier tvBarrierTop;
    public final TextView tvDetail;
    public final TextView tvKpjAct;
    public final TextView tvKpjNotes;
    public final TextView tvLabelAmountNotes;
    public final TextView tvLabelKpjAct;
    public final TextView tvLabelKpjNotes;
    public final TextView tvLabelTkAct;
    public final TextView tvLabelTkNotes;
    public final TextView tvNotes;
    public final TextView tvSemicolon1;
    public final TextView tvSemicolon2;
    public final TextView tvSemicolon3;
    public final TextView tvTitle;
    public final TextView tvTkAct;
    public final TextView tvTkNotes;
    public final TextView tvlabelAmountAct;

    private DetailComplaintBottomSheetBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, View view, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView, Barrier barrier, Barrier barrier2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17) {
        this.rootView = constraintLayout;
        this.btnBack = materialButton;
        this.line1 = view;
        this.llEmployee = linearLayout;
        this.llEmployeeAct = linearLayout2;
        this.llNominalAct = linearLayout3;
        this.llNotes = linearLayout4;
        this.llStatusAct = linearLayout5;
        this.llStatusKpj = linearLayout6;
        this.tvAmountAct = textView;
        this.tvBarrierBottom = barrier;
        this.tvBarrierTop = barrier2;
        this.tvDetail = textView2;
        this.tvKpjAct = textView3;
        this.tvKpjNotes = textView4;
        this.tvLabelAmountNotes = textView5;
        this.tvLabelKpjAct = textView6;
        this.tvLabelKpjNotes = textView7;
        this.tvLabelTkAct = textView8;
        this.tvLabelTkNotes = textView9;
        this.tvNotes = textView10;
        this.tvSemicolon1 = textView11;
        this.tvSemicolon2 = textView12;
        this.tvSemicolon3 = textView13;
        this.tvTitle = textView14;
        this.tvTkAct = textView15;
        this.tvTkNotes = textView16;
        this.tvlabelAmountAct = textView17;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DetailComplaintBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DetailComplaintBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.detail_complaint_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static DetailComplaintBottomSheetBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.line1;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.line1);
            if (viewFindChildViewById != null) {
                i = R.id.llEmployee;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llEmployee);
                if (linearLayout != null) {
                    i = R.id.llEmployeeAct;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llEmployeeAct);
                    if (linearLayout2 != null) {
                        i = R.id.llNominalAct;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llNominalAct);
                        if (linearLayout3 != null) {
                            i = R.id.llNotes;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llNotes);
                            if (linearLayout4 != null) {
                                i = R.id.llStatusAct;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llStatusAct);
                                if (linearLayout5 != null) {
                                    i = R.id.llStatusKpj;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llStatusKpj);
                                    if (linearLayout6 != null) {
                                        i = R.id.tvAmountAct;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAmountAct);
                                        if (textView != null) {
                                            i = R.id.tvBarrierBottom;
                                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.tvBarrierBottom);
                                            if (barrier != null) {
                                                i = R.id.tvBarrierTop;
                                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, R.id.tvBarrierTop);
                                                if (barrier2 != null) {
                                                    i = R.id.tvDetail;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDetail);
                                                    if (textView2 != null) {
                                                        i = R.id.tvKpjAct;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjAct);
                                                        if (textView3 != null) {
                                                            i = R.id.tvKpjNotes;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvKpjNotes);
                                                            if (textView4 != null) {
                                                                i = R.id.tvLabelAmountNotes;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelAmountNotes);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvLabelKpjAct;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKpjAct);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tvLabelKpjNotes;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelKpjNotes);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tvLabelTkAct;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTkAct);
                                                                            if (textView8 != null) {
                                                                                i = R.id.tvLabelTkNotes;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelTkNotes);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.tvNotes;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotes);
                                                                                    if (textView10 != null) {
                                                                                        i = R.id.tvSemicolon1;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSemicolon1);
                                                                                        if (textView11 != null) {
                                                                                            i = R.id.tvSemicolon2;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSemicolon2);
                                                                                            if (textView12 != null) {
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSemicolon3);
                                                                                                if (textView13 != null) {
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                                                                    if (textView14 != null) {
                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTkAct);
                                                                                                        if (textView15 != null) {
                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTkNotes);
                                                                                                            if (textView16 != null) {
                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvlabelAmountAct);
                                                                                                                if (textView17 != null) {
                                                                                                                    return new DetailComplaintBottomSheetBinding((ConstraintLayout) view, materialButton, viewFindChildViewById, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView, barrier, barrier2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
                                                                                                                }
                                                                                                                i = R.id.tvlabelAmountAct;
                                                                                                            } else {
                                                                                                                i = R.id.tvTkNotes;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvTkAct;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTitle;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvSemicolon3;
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
