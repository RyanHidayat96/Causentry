package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentNonSalariedWorkerConfirmationRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerConfirmationRegistrationBinding> {
    public static final NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1();

    public final FragmentNonSalariedWorkerConfirmationRegistrationBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentNonSalariedWorkerConfirmationRegistrationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentNonSalariedWorkerConfirmationRegistrationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(layoutInflater, viewGroup, bool.booleanValue());
    }

    NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1() {
        super(3, FragmentNonSalariedWorkerConfirmationRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentNonSalariedWorkerConfirmationRegistrationBinding;", 0);
    }
}
