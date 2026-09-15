package com.bpjstku.presentation.complaint.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentWageAmountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class WageAmountFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentWageAmountBinding> {
    public static final WageAmountFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WageAmountFragment$bindingInflater$1();

    public final FragmentWageAmountBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentWageAmountBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentWageAmountBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    WageAmountFragment$bindingInflater$1() {
        super(3, FragmentWageAmountBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentWageAmountBinding;", 0);
    }
}
