package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentKpjBottomSheetDialogBinding implements ViewBinding {
    public final ConstraintLayout bottomSheetContainer;
    public final MaterialButton btnChooseJamsostekNumberId;
    private final ConstraintLayout rootView;
    public final RecyclerView rvJamsostekNumberId;
    public final TextView tvChooseJamsostekNumberId;
    public final View viewTopLine;

    private FragmentKpjBottomSheetDialogBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, MaterialButton materialButton, RecyclerView recyclerView, TextView textView, View view) {
        this.rootView = constraintLayout;
        this.bottomSheetContainer = constraintLayout2;
        this.btnChooseJamsostekNumberId = materialButton;
        this.rvJamsostekNumberId = recyclerView;
        this.tvChooseJamsostekNumberId = textView;
        this.viewTopLine = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentKpjBottomSheetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentKpjBottomSheetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_kpj_bottom_sheet_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentKpjBottomSheetDialogBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.btnChooseJamsostekNumberId;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChooseJamsostekNumberId);
        if (materialButton != null) {
            i = R.id.rvJamsostekNumberId;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvJamsostekNumberId);
            if (recyclerView != null) {
                i = R.id.tvChooseJamsostekNumberId;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseJamsostekNumberId);
                if (textView != null) {
                    i = R.id.viewTopLine;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewTopLine);
                    if (viewFindChildViewById != null) {
                        return new FragmentKpjBottomSheetDialogBinding(constraintLayout, constraintLayout, materialButton, recyclerView, textView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
