package com.bpjstku.presentation.scholarship.benefit.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentScholarBenefitStep2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ScholarBenefitStep2Fragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep2Binding> {
    public static final ScholarBenefitStep2Fragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ScholarBenefitStep2Fragment$bindingInflater$1();

    public final FragmentScholarBenefitStep2Binding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentScholarBenefitStep2Binding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentScholarBenefitStep2Binding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    ScholarBenefitStep2Fragment$bindingInflater$1() {
        super(3, FragmentScholarBenefitStep2Binding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentScholarBenefitStep2Binding;", 0);
    }
}
