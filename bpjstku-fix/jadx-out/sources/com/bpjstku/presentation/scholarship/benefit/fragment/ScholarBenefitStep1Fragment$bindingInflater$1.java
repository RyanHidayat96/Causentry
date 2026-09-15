package com.bpjstku.presentation.scholarship.benefit.fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentScholarBenefitStep1Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ScholarBenefitStep1Fragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentScholarBenefitStep1Binding> {
    public static final ScholarBenefitStep1Fragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ScholarBenefitStep1Fragment$bindingInflater$1();

    public final FragmentScholarBenefitStep1Binding TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentScholarBenefitStep1Binding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentScholarBenefitStep1Binding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(layoutInflater, viewGroup, bool.booleanValue());
    }

    ScholarBenefitStep1Fragment$bindingInflater$1() {
        super(3, FragmentScholarBenefitStep1Binding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentScholarBenefitStep1Binding;", 0);
    }
}
