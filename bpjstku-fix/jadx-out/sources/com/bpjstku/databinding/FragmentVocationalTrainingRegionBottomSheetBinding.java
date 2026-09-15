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
public final class FragmentVocationalTrainingRegionBottomSheetBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RecyclerView rvTrainingRegion;
    public final TextInputLayout tilSearchRegion;
    public final TextView tvTrainingRegionTitle;

    private FragmentVocationalTrainingRegionBottomSheetBinding(ScrollView scrollView, RecyclerView recyclerView, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = scrollView;
        this.rvTrainingRegion = recyclerView;
        this.tilSearchRegion = textInputLayout;
        this.tvTrainingRegionTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalTrainingRegionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalTrainingRegionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_training_region_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalTrainingRegionBottomSheetBinding bind(View view) {
        int i = R.id.rvTrainingRegion;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTrainingRegion);
        if (recyclerView != null) {
            i = R.id.tilSearchRegion;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSearchRegion);
            if (textInputLayout != null) {
                i = R.id.tvTrainingRegionTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingRegionTitle);
                if (textView != null) {
                    return new FragmentVocationalTrainingRegionBottomSheetBinding((ScrollView) view, recyclerView, textInputLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
