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
public final class FragmentChooseSegmentBottomSheetBinding implements ViewBinding {
    public final Button btnApply;
    public final RadioButton rbBPUSegment;
    public final RadioButton rbPMISegment;
    public final RadioButton rbPUSegment;
    public final RadioGroup rgChooseSegment;
    private final FrameLayout rootView;
    public final TextView tvChooseSegment;

    private FragmentChooseSegmentBottomSheetBinding(FrameLayout frameLayout, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, TextView textView) {
        this.rootView = frameLayout;
        this.btnApply = button;
        this.rbBPUSegment = radioButton;
        this.rbPMISegment = radioButton2;
        this.rbPUSegment = radioButton3;
        this.rgChooseSegment = radioGroup;
        this.tvChooseSegment = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseSegmentBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseSegmentBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_choose_segment_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseSegmentBottomSheetBinding bind(View view) {
        int i = R.id.btnApply;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnApply);
        if (button != null) {
            i = R.id.rbBPUSegment;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbBPUSegment);
            if (radioButton != null) {
                i = R.id.rbPMISegment;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbPMISegment);
                if (radioButton2 != null) {
                    i = R.id.rbPUSegment;
                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbPUSegment);
                    if (radioButton3 != null) {
                        i = R.id.rgChooseSegment;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgChooseSegment);
                        if (radioGroup != null) {
                            i = R.id.tvChooseSegment;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseSegment);
                            if (textView != null) {
                                return new FragmentChooseSegmentBottomSheetBinding((FrameLayout) view, button, radioButton, radioButton2, radioButton3, radioGroup, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
