package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemOldDaySecurityBinding implements ViewBinding {
    public final AppCompatImageView imgBalanceCheck;
    public final AppCompatImageView imgOldDaySecurity;
    private final CardView rootView;
    public final AppCompatTextView tvOldDaySecurityMenu;
    public final AppCompatTextView tvOldDaySecurityMenuDescription;

    private ItemOldDaySecurityBinding(CardView cardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.rootView = cardView;
        this.imgBalanceCheck = appCompatImageView;
        this.imgOldDaySecurity = appCompatImageView2;
        this.tvOldDaySecurityMenu = appCompatTextView;
        this.tvOldDaySecurityMenuDescription = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemOldDaySecurityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemOldDaySecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_old_day_security, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemOldDaySecurityBinding bind(View view) {
        int i = R.id.imgBalanceCheck;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgBalanceCheck);
        if (appCompatImageView != null) {
            i = R.id.imgOldDaySecurity;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgOldDaySecurity);
            if (appCompatImageView2 != null) {
                i = R.id.tvOldDaySecurityMenu;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvOldDaySecurityMenu);
                if (appCompatTextView != null) {
                    i = R.id.tvOldDaySecurityMenuDescription;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvOldDaySecurityMenuDescription);
                    if (appCompatTextView2 != null) {
                        return new ItemOldDaySecurityBinding((CardView) view, appCompatImageView, appCompatImageView2, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
