package com.bpjstku.presentation.scholarship.benefit.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentScholarBenefitStep3Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ScholarBenefitStep3Fragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep3Binding> {
    public static final ScholarBenefitStep3Fragment$bindingInflater$1 b = new ScholarBenefitStep3Fragment$bindingInflater$1();

    public final FragmentScholarBenefitStep3Binding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentScholarBenefitStep3Binding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentScholarBenefitStep3Binding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    ScholarBenefitStep3Fragment$bindingInflater$1() {
        super(3, FragmentScholarBenefitStep3Binding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentScholarBenefitStep3Binding;", 0);
    }
}
