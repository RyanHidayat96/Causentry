package com.bpjstku.presentation.program;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentProgramBenefitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ProgramBenefitFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentProgramBenefitBinding> {
    public static final ProgramBenefitFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ProgramBenefitFragment$bindingInflater$1();

    public final FragmentProgramBenefitBinding b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentProgramBenefitBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentProgramBenefitBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return b(layoutInflater, viewGroup, bool.booleanValue());
    }

    ProgramBenefitFragment$bindingInflater$1() {
        super(3, FragmentProgramBenefitBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentProgramBenefitBinding;", 0);
    }
}
