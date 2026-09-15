package com.bpjstku.presentation.membership.registration.salariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentSalariedWorkerPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class SalariedWorkerPasswordFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPasswordBinding> {
    public static final SalariedWorkerPasswordFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new SalariedWorkerPasswordFragment$bindingInflater$1();

    public final FragmentSalariedWorkerPasswordBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentSalariedWorkerPasswordBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentSalariedWorkerPasswordBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    SalariedWorkerPasswordFragment$bindingInflater$1() {
        super(3, FragmentSalariedWorkerPasswordBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentSalariedWorkerPasswordBinding;", 0);
    }
}
