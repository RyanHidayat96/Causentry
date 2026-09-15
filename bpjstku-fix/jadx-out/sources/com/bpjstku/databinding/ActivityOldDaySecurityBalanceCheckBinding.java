package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityOldDaySecurityBalanceCheckBinding implements ViewBinding {
    public final TextInputEditText edtChooseKpj;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvJhtBalance;
    private final ConstraintLayout rootView;
    public final RecyclerView rvBalanceCheck;
    public final SwipeRefreshLayout srlBalanceCheck;
    public final TextInputLayout tilChooseKpj;

    private ActivityOldDaySecurityBalanceCheckBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextInputLayout textInputLayout) {
        this.rootView = constraintLayout;
        this.edtChooseKpj = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvJhtBalance = multiStateView;
        this.rvBalanceCheck = recyclerView;
        this.srlBalanceCheck = swipeRefreshLayout;
        this.tilChooseKpj = textInputLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOldDaySecurityBalanceCheckBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityOldDaySecurityBalanceCheckBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_old_day_security_balance_check, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityOldDaySecurityBalanceCheckBinding bind(View view) {
        int i = R.id.edtChooseKpj;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChooseKpj);
        if (textInputEditText != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.msvJhtBalance;
                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvJhtBalance);
                if (multiStateView != null) {
                    i = R.id.rvBalanceCheck;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBalanceCheck);
                    if (recyclerView != null) {
                        i = R.id.srlBalanceCheck;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.srlBalanceCheck);
                        if (swipeRefreshLayout != null) {
                            i = R.id.tilChooseKpj;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseKpj);
                            if (textInputLayout != null) {
                                return new ActivityOldDaySecurityBalanceCheckBinding((ConstraintLayout) view, textInputEditText, layoutToolbarCenterBindingBind, multiStateView, recyclerView, swipeRefreshLayout, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
