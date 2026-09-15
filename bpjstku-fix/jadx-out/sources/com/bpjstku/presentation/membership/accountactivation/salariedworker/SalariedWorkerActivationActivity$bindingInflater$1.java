package com.bpjstku.presentation.membership.accountactivation.salariedworker;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySalariedWorkerActivationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SalariedWorkerActivationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySalariedWorkerActivationBinding> {
    public static final SalariedWorkerActivationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new SalariedWorkerActivationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivitySalariedWorkerActivationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySalariedWorkerActivationBinding.inflate(layoutInflater);
    }

    SalariedWorkerActivationActivity$bindingInflater$1() {
        super(1, ActivitySalariedWorkerActivationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySalariedWorkerActivationBinding;", 0);
    }
}
