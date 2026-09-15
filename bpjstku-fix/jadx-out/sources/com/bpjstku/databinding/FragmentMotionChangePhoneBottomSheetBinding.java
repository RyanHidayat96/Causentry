package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentMotionChangePhoneBottomSheetBinding implements ViewBinding {
    public final MaterialButton btnCancel;
    public final MaterialButton btnChange;
    private final FrameLayout rootView;
    public final TextView tvDesc;
    public final TextView tvTitle;

    private FragmentMotionChangePhoneBottomSheetBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.btnCancel = materialButton;
        this.btnChange = materialButton2;
        this.tvDesc = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMotionChangePhoneBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMotionChangePhoneBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_motion_change_phone_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMotionChangePhoneBottomSheetBinding bind(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnChange;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnChange);
            if (materialButton2 != null) {
                i = R.id.tvDesc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                if (textView != null) {
                    i = R.id.tvTitle;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
                    if (textView2 != null) {
                        return new FragmentMotionChangePhoneBottomSheetBinding((FrameLayout) view, materialButton, materialButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
