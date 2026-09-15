package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTuitionFeeBinding implements ViewBinding {
    public final LinearLayout llTuitionBpu;
    public final LinearLayout llTuitionJakon;
    public final LinearLayout llTuitionPmi;
    public final LinearLayout llTuitionPu;
    private final LinearLayout rootView;
    public final TextView tvTuitionBpu;
    public final TextView tvTuitionJakon;
    public final TextView tvTuitionPMI;
    public final TextView tvTuitionPu;

    private FragmentTuitionFeeBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.llTuitionBpu = linearLayout2;
        this.llTuitionJakon = linearLayout3;
        this.llTuitionPmi = linearLayout4;
        this.llTuitionPu = linearLayout5;
        this.tvTuitionBpu = textView;
        this.tvTuitionJakon = textView2;
        this.tvTuitionPMI = textView3;
        this.tvTuitionPu = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTuitionFeeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTuitionFeeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tuition_fee, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTuitionFeeBinding bind(View view) {
        int i = R.id.llTuitionBpu;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTuitionBpu);
        if (linearLayout != null) {
            i = R.id.llTuitionJakon;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTuitionJakon);
            if (linearLayout2 != null) {
                i = R.id.llTuitionPmi;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTuitionPmi);
                if (linearLayout3 != null) {
                    i = R.id.llTuitionPu;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTuitionPu);
                    if (linearLayout4 != null) {
                        i = R.id.tvTuitionBpu;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionBpu);
                        if (textView != null) {
                            i = R.id.tvTuitionJakon;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionJakon);
                            if (textView2 != null) {
                                i = R.id.tvTuitionPMI;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionPMI);
                                if (textView3 != null) {
                                    i = R.id.tvTuitionPu;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTuitionPu);
                                    if (textView4 != null) {
                                        return new FragmentTuitionFeeBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4);
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
