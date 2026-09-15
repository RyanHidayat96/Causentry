package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import defpackage.TimeoutRetryPolicy;
import defpackage.getSessionConfigs;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentOtherBottomSheetBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final RecyclerView rvEntertainment;
    public final RecyclerView rvFinance;
    public final RecyclerView rvServices;
    public final TextView tvOtherEntertainment;
    public final TextView tvOtherFinance;
    public final TextView tvOtherServices;
    public final TextView tvOtherTitle;

    private FragmentOtherBottomSheetBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.rvEntertainment = recyclerView;
        this.rvFinance = recyclerView2;
        this.rvServices = recyclerView3;
        this.tvOtherEntertainment = textView;
        this.tvOtherFinance = textView2;
        this.tvOtherServices = textView3;
        this.tvOtherTitle = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOtherBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOtherBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_other_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOtherBottomSheetBinding bind(View view) {
        int i = R.id.rvEntertainment;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvEntertainment);
        if (recyclerView != null) {
            i = R.id.rvFinance;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvFinance);
            if (recyclerView2 != null) {
                i = R.id.rvServices;
                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvServices);
                if (recyclerView3 != null) {
                    i = R.id.tvOtherEntertainment;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherEntertainment);
                    if (textView != null) {
                        i = R.id.tvOtherFinance;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherFinance);
                        if (textView2 != null) {
                            i = R.id.tvOtherServices;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherServices);
                            if (textView3 != null) {
                                i = R.id.tvOtherTitle;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherTitle);
                                if (textView4 != null) {
                                    return new FragmentOtherBottomSheetBinding((RelativeLayout) view, recyclerView, recyclerView2, recyclerView3, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        getSessionConfigs.b[0] = TimeoutRetryPolicy.b[0];
    }
}
