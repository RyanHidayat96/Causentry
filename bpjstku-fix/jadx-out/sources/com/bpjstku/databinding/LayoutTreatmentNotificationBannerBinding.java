package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutTreatmentNotificationBannerBinding implements ViewBinding {
    public final CardView cvTreatmentNotification;
    private final CardView rootView;
    public final TextView tvTreatmentMessage;

    private LayoutTreatmentNotificationBannerBinding(CardView cardView, CardView cardView2, TextView textView) {
        this.rootView = cardView;
        this.cvTreatmentNotification = cardView2;
        this.tvTreatmentMessage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static LayoutTreatmentNotificationBannerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutTreatmentNotificationBannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_treatment_notification_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutTreatmentNotificationBannerBinding bind(View view) {
        CardView cardView = (CardView) view;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTreatmentMessage);
        if (textView != null) {
            return new LayoutTreatmentNotificationBannerBinding(cardView, cardView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tvTreatmentMessage)));
    }
}
