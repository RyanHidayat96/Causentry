package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentBpjstkuBranchOfficeMapBinding implements ViewBinding {
    public final FragmentContainerView mapBranchOffice;
    private final FragmentContainerView rootView;

    private FragmentBpjstkuBranchOfficeMapBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.mapBranchOffice = fragmentContainerView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final FragmentContainerView getRoot() {
        return this.rootView;
    }

    public static FragmentBpjstkuBranchOfficeMapBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBpjstkuBranchOfficeMapBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bpjstku_branch_office_map, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBpjstkuBranchOfficeMapBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new FragmentBpjstkuBranchOfficeMapBinding(fragmentContainerView, fragmentContainerView);
    }
}
