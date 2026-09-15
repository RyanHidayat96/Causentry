package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityEditPhoneNumberBinding implements ViewBinding {
    public final Button btnSavePhoneNumber;
    public final MaterialCardView cvPhoneNumber;
    public final EditText edtPhoneNumber;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView tvEditPhoneNumberInstruction;
    public final TextView tvNotes;
    public final TextView tvPrefix;
    public final TextView tvSamplePhoneNumber;

    private ActivityEditPhoneNumberBinding(ConstraintLayout constraintLayout, Button button, MaterialCardView materialCardView, EditText editText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnSavePhoneNumber = button;
        this.cvPhoneNumber = materialCardView;
        this.edtPhoneNumber = editText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvEditPhoneNumberInstruction = textView;
        this.tvNotes = textView2;
        this.tvPrefix = textView3;
        this.tvSamplePhoneNumber = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityEditPhoneNumberBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEditPhoneNumberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_edit_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEditPhoneNumberBinding bind(View view) {
        int i = R.id.btnSavePhoneNumber;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnSavePhoneNumber);
        if (button != null) {
            i = R.id.cvPhoneNumber;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPhoneNumber);
            if (materialCardView != null) {
                i = R.id.edtPhoneNumber;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                if (editText != null) {
                    i = R.id.layout_toolbar;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                    if (viewFindChildViewById != null) {
                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                        i = R.id.tvEditPhoneNumberInstruction;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditPhoneNumberInstruction);
                        if (textView != null) {
                            i = R.id.tvNotes;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotes);
                            if (textView2 != null) {
                                i = R.id.tvPrefix;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                if (textView3 != null) {
                                    i = R.id.tvSamplePhoneNumber;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSamplePhoneNumber);
                                    if (textView4 != null) {
                                        return new ActivityEditPhoneNumberBinding((ConstraintLayout) view, button, materialCardView, editText, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
