package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityMaintenanceBinding implements ViewBinding {
    public final MaterialButton btnOk;
    public final MaterialCardView cvMaintenance;
    public final ImageView imgMaintenance;
    private final ScrollView rootView;
    public final TextView tvMaintenanceMessage;

    private ActivityMaintenanceBinding(ScrollView scrollView, MaterialButton materialButton, MaterialCardView materialCardView, ImageView imageView, TextView textView) {
        this.rootView = scrollView;
        this.btnOk = materialButton;
        this.cvMaintenance = materialCardView;
        this.imgMaintenance = imageView;
        this.tvMaintenanceMessage = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityMaintenanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMaintenanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_maintenance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityMaintenanceBinding bind(View view) {
        int i = R.id.btnOk;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnOk);
        if (materialButton != null) {
            i = R.id.cvMaintenance;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvMaintenance);
            if (materialCardView != null) {
                i = R.id.imgMaintenance;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMaintenance);
                if (imageView != null) {
                    i = R.id.tvMaintenanceMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvMaintenanceMessage);
                    if (textView != null) {
                        return new ActivityMaintenanceBinding((ScrollView) view, materialButton, materialCardView, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
