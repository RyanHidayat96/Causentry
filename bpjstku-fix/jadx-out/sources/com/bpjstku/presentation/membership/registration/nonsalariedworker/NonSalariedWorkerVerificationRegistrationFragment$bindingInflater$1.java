package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentNonSalariedWorkerVerificationRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerVerificationRegistrationBinding> {
    public static final NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1();

    public final FragmentNonSalariedWorkerVerificationRegistrationBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentNonSalariedWorkerVerificationRegistrationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentNonSalariedWorkerVerificationRegistrationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1() {
        super(3, FragmentNonSalariedWorkerVerificationRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentNonSalariedWorkerVerificationRegistrationBinding;", 0);
    }
}
