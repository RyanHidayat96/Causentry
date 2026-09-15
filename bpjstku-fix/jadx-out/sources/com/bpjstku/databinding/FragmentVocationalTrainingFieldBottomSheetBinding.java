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
public final class FragmentVocationalTrainingFieldBottomSheetBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RecyclerView rvTrainingField;
    public final TextInputLayout tilSearchField;
    public final TextView tvTrainingFieldTitle;

    private FragmentVocationalTrainingFieldBottomSheetBinding(ScrollView scrollView, RecyclerView recyclerView, TextInputLayout textInputLayout, TextView textView) {
        this.rootView = scrollView;
        this.rvTrainingField = recyclerView;
        this.tilSearchField = textInputLayout;
        this.tvTrainingFieldTitle = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalTrainingFieldBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalTrainingFieldBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_training_field_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalTrainingFieldBottomSheetBinding bind(View view) {
        int i = R.id.rvTrainingField;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTrainingField);
        if (recyclerView != null) {
            i = R.id.tilSearchField;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilSearchField);
            if (textInputLayout != null) {
                i = R.id.tvTrainingFieldTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingFieldTitle);
                if (textView != null) {
                    return new FragmentVocationalTrainingFieldBottomSheetBinding((ScrollView) view, recyclerView, textInputLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
