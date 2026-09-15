package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ItemVocationalTrainingBinding implements ViewBinding {
    public final MaterialButton btnBlkProfile;
    public final View divider;
    private final MaterialCardView rootView;
    public final RecyclerView rvVocationalTraining;
    public final TextView tvLpkName;

    private ItemVocationalTrainingBinding(MaterialCardView materialCardView, MaterialButton materialButton, View view, RecyclerView recyclerView, TextView textView) {
        this.rootView = materialCardView;
        this.btnBlkProfile = materialButton;
        this.divider = view;
        this.rvVocationalTraining = recyclerView;
        this.tvLpkName = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialCardView getRoot() {
        return this.rootView;
    }

    public static ItemVocationalTrainingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVocationalTrainingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_vocational_training, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVocationalTrainingBinding bind(View view) {
        int i = R.id.btnBlkProfile;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBlkProfile);
        if (materialButton != null) {
            i = R.id.divider;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
            if (viewFindChildViewById != null) {
                i = R.id.rvVocationalTraining;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvVocationalTraining);
                if (recyclerView != null) {
                    i = R.id.tvLpkName;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpkName);
                    if (textView != null) {
                        return new ItemVocationalTrainingBinding((MaterialCardView) view, materialButton, viewFindChildViewById, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
