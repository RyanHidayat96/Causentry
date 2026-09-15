package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityAsikResignProgramBinding implements ViewBinding {
    public final MaterialButton btnAboutNonSalariedWorker;
    public final CardView cvNotReadyYet;
    public final CardView cvYesIdo;
    public final ImageView imgFailed;
    public final ImageView imgSuccess;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvCompleteYourPersonalData;
    public final TextView tvNotReadyYet;
    public final TextView tvYesIdo;

    private ActivityAsikResignProgramBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.btnAboutNonSalariedWorker = materialButton;
        this.cvNotReadyYet = cardView;
        this.cvYesIdo = cardView2;
        this.imgFailed = imageView;
        this.imgSuccess = imageView2;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvCompleteYourPersonalData = textView;
        this.tvNotReadyYet = textView2;
        this.tvYesIdo = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityAsikResignProgramBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityAsikResignProgramBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_asik_resign_program, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityAsikResignProgramBinding bind(View view) {
        int i = R.id.btnAboutNonSalariedWorker;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAboutNonSalariedWorker);
        if (materialButton != null) {
            i = R.id.cvNotReadyYet;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvNotReadyYet);
            if (cardView != null) {
                i = R.id.cvYesIdo;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cvYesIdo);
                if (cardView2 != null) {
                    i = R.id.imgFailed;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgFailed);
                    if (imageView != null) {
                        i = R.id.imgSuccess;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
                        if (imageView2 != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                i = R.id.tvCompleteYourPersonalData;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCompleteYourPersonalData);
                                if (textView != null) {
                                    i = R.id.tvNotReadyYet;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotReadyYet);
                                    if (textView2 != null) {
                                        i = R.id.tvYesIdo;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvYesIdo);
                                        if (textView3 != null) {
                                            return new ActivityAsikResignProgramBinding((ConstraintLayout) view, materialButton, cardView, cardView2, imageView, imageView2, layoutToolbarCenterBindingBind, textView, textView2, textView3);
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
