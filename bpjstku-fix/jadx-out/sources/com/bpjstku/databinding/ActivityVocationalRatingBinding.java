package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityVocationalRatingBinding implements ViewBinding {
    public final Button btnSendSurvey;
    public final LayoutToolbarBinding layoutToolbar;
    public final MultiStateView msvRating;
    private final ConstraintLayout rootView;
    public final RecyclerView rvVocationalRating;
    public final TextView tvRatingInstruction;

    private ActivityVocationalRatingBinding(ConstraintLayout constraintLayout, Button button, LayoutToolbarBinding layoutToolbarBinding, MultiStateView multiStateView, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.btnSendSurvey = button;
        this.layoutToolbar = layoutToolbarBinding;
        this.msvRating = multiStateView;
        this.rvVocationalRating = recyclerView;
        this.tvRatingInstruction = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityVocationalRatingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityVocationalRatingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_vocational_rating, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityVocationalRatingBinding bind(View view) {
        int i = R.id.btnSendSurvey;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSendSurvey);
        if (button != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                i = R.id.msvRating;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvRating);
                if (multiStateView != null) {
                    i = R.id.rvVocationalRating;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvVocationalRating);
                    if (recyclerView != null) {
                        i = R.id.tvRatingInstruction;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvRatingInstruction);
                        if (textView != null) {
                            return new ActivityVocationalRatingBinding((ConstraintLayout) view, button, layoutToolbarBindingBind, multiStateView, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
