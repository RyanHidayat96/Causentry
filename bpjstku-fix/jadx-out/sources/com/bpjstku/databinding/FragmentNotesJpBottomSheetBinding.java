package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNotesJpBottomSheetBinding implements ViewBinding {
    public final MaterialButton btnResultDialog;
    private final RelativeLayout rootView;
    public final LinearLayout tvResultMessage;
    public final TextView tvResultTitle;

    private FragmentNotesJpBottomSheetBinding(RelativeLayout relativeLayout, MaterialButton materialButton, LinearLayout linearLayout, TextView textView) {
        this.rootView = relativeLayout;
        this.btnResultDialog = materialButton;
        this.tvResultMessage = linearLayout;
        this.tvResultTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentNotesJpBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNotesJpBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_notes_jp_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNotesJpBottomSheetBinding bind(View view) {
        int i = R.id.btnResultDialog;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnResultDialog);
        if (materialButton != null) {
            i = R.id.tvResultMessage;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tvResultMessage);
            if (linearLayout != null) {
                i = R.id.tvResultTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvResultTitle);
                if (textView != null) {
                    return new FragmentNotesJpBottomSheetBinding((RelativeLayout) view, materialButton, linearLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
