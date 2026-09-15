package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentPlkkBottomSheetBinding implements ViewBinding {
    public final TextInputEditText edtPLKKlocation;
    private final FrameLayout rootView;
    public final RecyclerView rvChoosePlkk;
    public final TextInputLayout tilPLKKlocation;
    public final AppCompatTextView tvPlkkNearest;
    public final View viewTopLine;

    private FragmentPlkkBottomSheetBinding(FrameLayout frameLayout, TextInputEditText textInputEditText, RecyclerView recyclerView, TextInputLayout textInputLayout, AppCompatTextView appCompatTextView, View view) {
        this.rootView = frameLayout;
        this.edtPLKKlocation = textInputEditText;
        this.rvChoosePlkk = recyclerView;
        this.tilPLKKlocation = textInputLayout;
        this.tvPlkkNearest = appCompatTextView;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPlkkBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlkkBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_plkk_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPlkkBottomSheetBinding bind(View view) {
        int i = R.id.edtPLKKlocation;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtPLKKlocation);
        if (textInputEditText != null) {
            i = R.id.rvChoosePlkk;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChoosePlkk);
            if (recyclerView != null) {
                i = R.id.tilPLKKlocation;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilPLKKlocation);
                if (textInputLayout != null) {
                    i = R.id.tvPlkkNearest;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPlkkNearest);
                    if (appCompatTextView != null) {
                        i = R.id.viewTopLine;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                        if (viewFindChildViewById != null) {
                            return new FragmentPlkkBottomSheetBinding((FrameLayout) view, textInputEditText, recyclerView, textInputLayout, appCompatTextView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
