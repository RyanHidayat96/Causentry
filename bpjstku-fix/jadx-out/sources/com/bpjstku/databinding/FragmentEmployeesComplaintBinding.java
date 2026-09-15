package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import defpackage.CloseGuardHelperCloseGuardApi30Impl;
import defpackage.getApplicationFromContext;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentEmployeesComplaintBinding implements ViewBinding {
    public final MaterialButton btnBack;
    public final MaterialButton btnDetailComplaint;
    public final ImageView imgEmpty;
    private final ConstraintLayout rootView;
    public final RecyclerView rvTrackingComplaint;
    public final TextView tvEmptyEmployeeComplaint;

    private FragmentEmployeesComplaintBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.btnBack = materialButton;
        this.btnDetailComplaint = materialButton2;
        this.imgEmpty = imageView;
        this.rvTrackingComplaint = recyclerView;
        this.tvEmptyEmployeeComplaint = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmployeesComplaintBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmployeesComplaintBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_employees_complaint, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmployeesComplaintBinding bind(View view) {
        int i = R.id.btnBack;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
        if (materialButton != null) {
            i = R.id.btnDetailComplaint;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDetailComplaint);
            if (materialButton2 != null) {
                i = R.id.imgEmpty;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgEmpty);
                if (imageView != null) {
                    i = R.id.rvTrackingComplaint;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTrackingComplaint);
                    if (recyclerView != null) {
                        i = R.id.tvEmptyEmployeeComplaint;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmptyEmployeeComplaint);
                        if (textView != null) {
                            return new FragmentEmployeesComplaintBinding((ConstraintLayout) view, materialButton, materialButton2, imageView, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        getApplicationFromContext.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = CloseGuardHelperCloseGuardApi30Impl.TuitionPaymentFragmentbindingInflater1[0];
    }
}
