package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutVocationCheckElegibilityLoadingBinding implements ViewBinding {
    public final CardView cvWaitingCheckEligibilitas;
    private final ConstraintLayout rootView;
    public final TextView tvCheckEligibilitasLabel;
    public final TextView tvWaiting;

    private LayoutVocationCheckElegibilityLoadingBinding(ConstraintLayout constraintLayout, CardView cardView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cvWaitingCheckEligibilitas = cardView;
        this.tvCheckEligibilitasLabel = textView;
        this.tvWaiting = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutVocationCheckElegibilityLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutVocationCheckElegibilityLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_vocation_check_elegibility_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutVocationCheckElegibilityLoadingBinding bind(View view) {
        int i = R.id.cvWaitingCheckEligibilitas;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvWaitingCheckEligibilitas);
        if (cardView != null) {
            i = R.id.tvCheckEligibilitasLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCheckEligibilitasLabel);
            if (textView != null) {
                i = R.id.tvWaiting;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWaiting);
                if (textView2 != null) {
                    return new LayoutVocationCheckElegibilityLoadingBinding((ConstraintLayout) view, cardView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
