package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes6.dex */
public final class BottomSheetKtpGuidanceBinding implements ViewBinding {
    public final MaterialButton btnMulaiFoto;
    private final LinearLayout rootView;

    private BottomSheetKtpGuidanceBinding(LinearLayout linearLayout, MaterialButton materialButton) {
        this.rootView = linearLayout;
        this.btnMulaiFoto = materialButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static BottomSheetKtpGuidanceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetKtpGuidanceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_ktp_guidance, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BottomSheetKtpGuidanceBinding bind(View view) {
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnMulaiFoto);
        if (materialButton != null) {
            return new BottomSheetKtpGuidanceBinding((LinearLayout) view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.btnMulaiFoto)));
    }
}
