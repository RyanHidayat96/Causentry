package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimOldDaySecurityViewBalanceJhtBinding implements ViewBinding {
    public final MaterialButton btnSendEmail;
    public final PhotoView idPdfView;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    private final ConstraintLayout rootView;

    private ActivityClaimOldDaySecurityViewBalanceJhtBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, PhotoView photoView, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = constraintLayout;
        this.btnSendEmail = materialButton;
        this.idPdfView = photoView;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimOldDaySecurityViewBalanceJhtBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimOldDaySecurityViewBalanceJhtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_old_day_security_view_balance_jht, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimOldDaySecurityViewBalanceJhtBinding bind(View view) {
        int i = R.id.btnSendEmail;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSendEmail);
        if (materialButton != null) {
            i = R.id.idPdfView;
            PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, R.id.idPdfView);
            if (photoView != null) {
                i = R.id.layout_toolbar_center;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                if (viewFindChildViewById != null) {
                    return new ActivityClaimOldDaySecurityViewBalanceJhtBinding((ConstraintLayout) view, materialButton, photoView, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
