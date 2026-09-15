package com.bpjstku.presentation.membership.accountactivation.salariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentSalariedActivationWorkerPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class SalariedActivationWorkerPasswordFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedActivationWorkerPasswordBinding> {
    public static final SalariedActivationWorkerPasswordFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new SalariedActivationWorkerPasswordFragment$bindingInflater$1();

    public final FragmentSalariedActivationWorkerPasswordBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentSalariedActivationWorkerPasswordBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentSalariedActivationWorkerPasswordBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    SalariedActivationWorkerPasswordFragment$bindingInflater$1() {
        super(3, FragmentSalariedActivationWorkerPasswordBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentSalariedActivationWorkerPasswordBinding;", 0);
    }
}
