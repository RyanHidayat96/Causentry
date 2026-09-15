package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentProgramBenefitBinding implements ViewBinding {
    private final RecyclerView rootView;
    public final RecyclerView rvBenefits;

    private FragmentProgramBenefitBinding(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rvBenefits = recyclerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RecyclerView getRoot() {
        return this.rootView;
    }

    public static FragmentProgramBenefitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProgramBenefitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_program_benefit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProgramBenefitBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new FragmentProgramBenefitBinding(recyclerView, recyclerView);
    }
}
