package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentJpnPeriodicInformationBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final CircleImageView civProfile;
    public final CardView cvInfoJp;
    private final NestedScrollView rootView;
    public final TextView tvGreeting;
    public final TextView tvNamesWorker;
    public final TextView tvProgramsCovered;
    public final TextView tvTitleTotalBenefit;

    private FragmentJpnPeriodicInformationBinding(NestedScrollView nestedScrollView, MaterialButton materialButton, CircleImageView circleImageView, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = nestedScrollView;
        this.btnConfirmation = materialButton;
        this.civProfile = circleImageView;
        this.cvInfoJp = cardView;
        this.tvGreeting = textView;
        this.tvNamesWorker = textView2;
        this.tvProgramsCovered = textView3;
        this.tvTitleTotalBenefit = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentJpnPeriodicInformationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentJpnPeriodicInformationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_jpn_periodic_information, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentJpnPeriodicInformationBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.civProfile;
            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
            if (circleImageView != null) {
                i = R.id.cvInfoJp;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
                if (cardView != null) {
                    i = R.id.tvGreeting;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGreeting);
                    if (textView != null) {
                        i = R.id.tvNamesWorker;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesWorker);
                        if (textView2 != null) {
                            i = R.id.tvProgramsCovered;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramsCovered);
                            if (textView3 != null) {
                                i = R.id.tvTitleTotalBenefit;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleTotalBenefit);
                                if (textView4 != null) {
                                    return new FragmentJpnPeriodicInformationBinding((NestedScrollView) view, materialButton, circleImageView, cardView, textView, textView2, textView3, textView4);
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
