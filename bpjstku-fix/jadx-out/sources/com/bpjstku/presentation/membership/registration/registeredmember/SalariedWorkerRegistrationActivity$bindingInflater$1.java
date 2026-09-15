package com.bpjstku.presentation.membership.registration.registeredmember;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySalariedWorkerRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SalariedWorkerRegistrationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySalariedWorkerRegistrationBinding> {
    public static final SalariedWorkerRegistrationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new SalariedWorkerRegistrationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivitySalariedWorkerRegistrationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySalariedWorkerRegistrationBinding.inflate(layoutInflater);
    }

    SalariedWorkerRegistrationActivity$bindingInflater$1() {
        super(1, ActivitySalariedWorkerRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySalariedWorkerRegistrationBinding;", 0);
    }
}
