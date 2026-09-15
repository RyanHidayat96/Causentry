package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemScholarEdubenefitBinding implements ViewBinding {
    public final TextView itemScholarEdubenAmount;
    public final TextView itemScholarEdubenAmountTitle;
    public final MaterialCardView itemScholarEdubenContent;
    public final TextView itemScholarEdubenTanggal;
    public final TextView itemScholarEdubenTanggalTitle;
    public final TextView itemScholarEdubenTarget;
    public final View itemScholarEdubenTargetDivider;
    public final TextView itemScholarEdubenTargetTitle;
    public final TextView itemScholarEdubenYear;
    private final ConstraintLayout rootView;

    private ItemScholarEdubenefitBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, MaterialCardView materialCardView, TextView textView3, TextView textView4, TextView textView5, View view, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.itemScholarEdubenAmount = textView;
        this.itemScholarEdubenAmountTitle = textView2;
        this.itemScholarEdubenContent = materialCardView;
        this.itemScholarEdubenTanggal = textView3;
        this.itemScholarEdubenTanggalTitle = textView4;
        this.itemScholarEdubenTarget = textView5;
        this.itemScholarEdubenTargetDivider = view;
        this.itemScholarEdubenTargetTitle = textView6;
        this.itemScholarEdubenYear = textView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemScholarEdubenefitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemScholarEdubenefitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_scholar_edubenefit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemScholarEdubenefitBinding bind(View view) {
        int i = R.id.item_scholar_eduben_amount;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_amount);
        if (textView != null) {
            i = R.id.item_scholar_eduben_amount_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_amount_title);
            if (textView2 != null) {
                i = R.id.item_scholar_eduben_content;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_content);
                if (materialCardView != null) {
                    i = R.id.item_scholar_eduben_tanggal;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_tanggal);
                    if (textView3 != null) {
                        i = R.id.item_scholar_eduben_tanggal_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_tanggal_title);
                        if (textView4 != null) {
                            i = R.id.item_scholar_eduben_target;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_target);
                            if (textView5 != null) {
                                i = R.id.item_scholar_eduben_target_divider;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_target_divider);
                                if (viewFindChildViewById != null) {
                                    i = R.id.item_scholar_eduben_target_title;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_target_title);
                                    if (textView6 != null) {
                                        i = R.id.item_scholar_eduben_year;
                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.item_scholar_eduben_year);
                                        if (textView7 != null) {
                                            return new ItemScholarEdubenefitBinding((ConstraintLayout) view, textView, textView2, materialCardView, textView3, textView4, textView5, viewFindChildViewById, textView6, textView7);
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
