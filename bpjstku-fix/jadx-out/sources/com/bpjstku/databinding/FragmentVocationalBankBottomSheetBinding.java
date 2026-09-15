package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentVocationalBankBottomSheetBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RecyclerView rvBankName;
    public final TextInputLayout tilSearchBank;
    public final TextView tvBankName;

    private FragmentVocationalBankBottomSheetBinding(ScrollView scrollView, RecyclerView recyclerView, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = scrollView;
        this.rvBankName = recyclerView;
        this.tilSearchBank = textInputLayout;
        this.tvBankName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalBankBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalBankBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_bank_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalBankBottomSheetBinding bind(View view) {
        int i = R.id.rvBankName;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvBankName);
        if (recyclerView != null) {
            i = R.id.tilSearchBank;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSearchBank);
            if (textInputLayout != null) {
                i = R.id.tvBankName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBankName);
                if (textView != null) {
                    return new FragmentVocationalBankBottomSheetBinding((ScrollView) view, recyclerView, textInputLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
