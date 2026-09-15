package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentChooseCitizenshipBottomSheetBinding implements ViewBinding {
    public final Button btnApply;
    public final RadioButton rbWnaSegment;
    public final RadioButton rbWniSegment;
    public final RadioGroup rgChooseCitizenship;
    private final FrameLayout rootView;
    public final TextView tvChooseSegment;

    private FragmentChooseCitizenshipBottomSheetBinding(FrameLayout frameLayout, Button button, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, TextView textView) {
        this.rootView = frameLayout;
        this.btnApply = button;
        this.rbWnaSegment = radioButton;
        this.rbWniSegment = radioButton2;
        this.rgChooseCitizenship = radioGroup;
        this.tvChooseSegment = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseCitizenshipBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseCitizenshipBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_citizenship_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseCitizenshipBottomSheetBinding bind(View view) {
        int i = R.id.btnApply;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnApply);
        if (button != null) {
            i = R.id.rbWnaSegment;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbWnaSegment);
            if (radioButton != null) {
                i = R.id.rbWniSegment;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbWniSegment);
                if (radioButton2 != null) {
                    i = R.id.rgChooseCitizenship;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseCitizenship);
                    if (radioGroup != null) {
                        i = R.id.tvChooseSegment;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseSegment);
                        if (textView != null) {
                            return new FragmentChooseCitizenshipBottomSheetBinding((FrameLayout) view, button, radioButton, radioButton2, radioGroup, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
