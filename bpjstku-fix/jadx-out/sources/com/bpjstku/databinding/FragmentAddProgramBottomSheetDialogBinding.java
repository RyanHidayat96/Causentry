package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAddProgramBottomSheetDialogBinding implements ViewBinding {
    public final MaterialButton btnAddProgram;
    public final MaterialButton btnCancel;
    public final CheckBox cbOldDaySecurity;
    private final FrameLayout rootView;
    public final TextView tvChooseProgram;
    public final View viewLineJHT;

    private FragmentAddProgramBottomSheetDialogBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, CheckBox checkBox, TextView textView, View view) {
        this.rootView = frameLayout;
        this.btnAddProgram = materialButton;
        this.btnCancel = materialButton2;
        this.cbOldDaySecurity = checkBox;
        this.tvChooseProgram = textView;
        this.viewLineJHT = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAddProgramBottomSheetDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAddProgramBottomSheetDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_add_program_bottom_sheet_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAddProgramBottomSheetDialogBinding bind(View view) {
        int i = R.id.btnAddProgram;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAddProgram);
        if (materialButton != null) {
            i = R.id.btnCancel;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCancel);
            if (materialButton2 != null) {
                i = R.id.cbOldDaySecurity;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cbOldDaySecurity);
                if (checkBox != null) {
                    i = R.id.tvChooseProgram;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseProgram);
                    if (textView != null) {
                        i = R.id.viewLineJHT;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewLineJHT);
                        if (viewFindChildViewById != null) {
                            return new FragmentAddProgramBottomSheetDialogBinding((FrameLayout) view, materialButton, materialButton2, checkBox, textView, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
