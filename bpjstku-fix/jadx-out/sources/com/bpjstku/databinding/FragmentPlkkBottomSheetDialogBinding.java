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
public final class FragmentPlkkBottomSheetDialogBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RecyclerView rvChooseClosestPlkk;
    public final TextInputLayout tilSearchPlkk;
    public final TextView tvClosestPlkk;
    public final View viewTopLine;

    private FragmentPlkkBottomSheetDialogBinding(ScrollView scrollView, RecyclerView recyclerView, TextInputLayout textInputLayout, TextView textView, View view) {
        this.rootView = scrollView;
        this.rvChooseClosestPlkk = recyclerView;
        this.tilSearchPlkk = textInputLayout;
        this.tvClosestPlkk = textView;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPlkkBottomSheetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPlkkBottomSheetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_plkk_bottom_sheet_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPlkkBottomSheetDialogBinding bind(View view) {
        int i = R.id.rvChooseClosestPlkk;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvChooseClosestPlkk);
        if (recyclerView != null) {
            i = R.id.tilSearchPlkk;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSearchPlkk);
            if (textInputLayout != null) {
                i = R.id.tvClosestPlkk;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvClosestPlkk);
                if (textView != null) {
                    i = R.id.viewTopLine;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                    if (viewFindChildViewById != null) {
                        return new FragmentPlkkBottomSheetDialogBinding((ScrollView) view, recyclerView, textInputLayout, textView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
