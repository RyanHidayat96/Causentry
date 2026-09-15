package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemJpnSimulationResultTableBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvLabel;
    public final TextView tvValue;

    private ItemJpnSimulationResultTableBinding(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.tvLabel = textView;
        this.tvValue = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemJpnSimulationResultTableBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemJpnSimulationResultTableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_jpn_simulation_result_table, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemJpnSimulationResultTableBinding bind(View view) {
        int i = R.id.tvLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabel);
        if (textView != null) {
            i = R.id.tvValue;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvValue);
            if (textView2 != null) {
                return new ItemJpnSimulationResultTableBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
