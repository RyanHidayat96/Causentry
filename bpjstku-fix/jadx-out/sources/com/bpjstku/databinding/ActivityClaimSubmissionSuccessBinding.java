package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityClaimSubmissionSuccessBinding implements ViewBinding {
    public final Button btnOk;
    public final ImageView imgSuccess;
    private final ConstraintLayout rootView;
    public final TextView tvClaimSubmissionSuccess;
    public final TextView tvClaimSubmissionSuccessMessage;

    private ActivityClaimSubmissionSuccessBinding(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnOk = button;
        this.imgSuccess = imageView;
        this.tvClaimSubmissionSuccess = textView;
        this.tvClaimSubmissionSuccessMessage = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimSubmissionSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimSubmissionSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_submission_success, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimSubmissionSuccessBinding bind(View view) {
        int i = R.id.btnOk;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (button != null) {
            i = R.id.imgSuccess;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSuccess);
            if (imageView != null) {
                i = R.id.tvClaimSubmissionSuccess;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimSubmissionSuccess);
                if (textView != null) {
                    i = R.id.tvClaimSubmissionSuccessMessage;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClaimSubmissionSuccessMessage);
                    if (textView2 != null) {
                        return new ActivityClaimSubmissionSuccessBinding((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
