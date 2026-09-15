package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentEvidenceClaimButtomSheetBinding implements ViewBinding {
    public final Button btnCloseNotification;
    public final Button btnDownloadEvidenceTransaction;
    public final TextView deleteNotification;
    public final ImageView iconNotification;
    public final MultiStateView msvEvidence;
    private final MultiStateView rootView;
    public final TextView tvInfoMessageNotification;
    public final TextView tvNotificationClaim;

    private FragmentEvidenceClaimButtomSheetBinding(MultiStateView multiStateView, Button button, Button button2, TextView textView, ImageView imageView, MultiStateView multiStateView2, TextView textView2, TextView textView3) {
        this.rootView = multiStateView;
        this.btnCloseNotification = button;
        this.btnDownloadEvidenceTransaction = button2;
        this.deleteNotification = textView;
        this.iconNotification = imageView;
        this.msvEvidence = multiStateView2;
        this.tvInfoMessageNotification = textView2;
        this.tvNotificationClaim = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static FragmentEvidenceClaimButtomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEvidenceClaimButtomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_evidence_claim_buttom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEvidenceClaimButtomSheetBinding bind(View view) {
        int i = R.id.btnCloseNotification;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnCloseNotification);
        if (button != null) {
            i = R.id.btnDownloadEvidenceTransaction;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnDownloadEvidenceTransaction);
            if (button2 != null) {
                i = R.id.deleteNotification;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.deleteNotification);
                if (textView != null) {
                    i = R.id.iconNotification;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iconNotification);
                    if (imageView != null) {
                        MultiStateView multiStateView = (MultiStateView) view;
                        i = R.id.tvInfoMessageNotification;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoMessageNotification);
                        if (textView2 != null) {
                            i = R.id.tvNotificationClaim;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotificationClaim);
                            if (textView3 != null) {
                                return new FragmentEvidenceClaimButtomSheetBinding(multiStateView, button, button2, textView, imageView, multiStateView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
