package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentNonSalariedWorkerPersonalDataRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerPersonalDataRegistrationBinding> {
    public static final NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1();

    public final FragmentNonSalariedWorkerPersonalDataRegistrationBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentNonSalariedWorkerPersonalDataRegistrationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentNonSalariedWorkerPersonalDataRegistrationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1() {
        super(3, FragmentNonSalariedWorkerPersonalDataRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentNonSalariedWorkerPersonalDataRegistrationBinding;", 0);
    }
}
