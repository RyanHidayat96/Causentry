package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ComplaintFuBottomSheetBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final View line1;
    public final View line2;
    public final View line3;
    public final LinearLayout llActivity;
    public final TextView llDesc;
    public final LinearLayout llStatusKpj;
    private final ConstraintLayout rootView;
    public final TextView tvAktifitas;
    public final TextView tvContentDesc;
    public final TextView tvStatus;
    public final TextView tvTitle;

    private ComplaintFuBottomSheetBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, View view, View view2, View view3, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.btnBack = materialButton;
        this.line1 = view;
        this.line2 = view2;
        this.line3 = view3;
        this.llActivity = linearLayout;
        this.llDesc = textView;
        this.llStatusKpj = linearLayout2;
        this.tvAktifitas = textView2;
        this.tvContentDesc = textView3;
        this.tvStatus = textView4;
        this.tvTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ComplaintFuBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ComplaintFuBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.complaint_fu_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ComplaintFuBottomSheetBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.line1;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.line1);
            if (viewFindChildViewById != null) {
                i = R.id.line2;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.line2);
                if (viewFindChildViewById2 != null) {
                    i = R.id.line3;
                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.line3);
                    if (viewFindChildViewById3 != null) {
                        i = R.id.llActivity;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llActivity);
                        if (linearLayout != null) {
                            i = R.id.llDesc;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.llDesc);
                            if (textView != null) {
                                i = R.id.llStatusKpj;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llStatusKpj);
                                if (linearLayout2 != null) {
                                    i = R.id.tvAktifitas;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAktifitas);
                                    if (textView2 != null) {
                                        i = R.id.tvContentDesc;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvContentDesc);
                                        if (textView3 != null) {
                                            i = R.id.tvStatus;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatus);
                                            if (textView4 != null) {
                                                i = R.id.tvTitle;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                                                if (textView5 != null) {
                                                    return new ComplaintFuBottomSheetBinding((ConstraintLayout) view, materialButton, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, linearLayout, textView, linearLayout2, textView2, textView3, textView4, textView5);
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
