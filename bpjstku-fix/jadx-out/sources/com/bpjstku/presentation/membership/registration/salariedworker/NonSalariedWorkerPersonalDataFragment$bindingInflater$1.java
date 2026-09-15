package com.bpjstku.presentation.membership.registration.salariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentNonSalariedWorkerPersonalDataBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class NonSalariedWorkerPersonalDataFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerPersonalDataBinding> {
    public static final NonSalariedWorkerPersonalDataFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new NonSalariedWorkerPersonalDataFragment$bindingInflater$1();

    public final FragmentNonSalariedWorkerPersonalDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentNonSalariedWorkerPersonalDataBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentNonSalariedWorkerPersonalDataBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    NonSalariedWorkerPersonalDataFragment$bindingInflater$1() {
        super(3, FragmentNonSalariedWorkerPersonalDataBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentNonSalariedWorkerPersonalDataBinding;", 0);
    }
}
