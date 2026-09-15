package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySuccessRegistrationNonSalariedWorkerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySuccessRegistrationNonSalariedWorkerBinding> {
    public static final SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1 b = new SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivitySuccessRegistrationNonSalariedWorkerBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySuccessRegistrationNonSalariedWorkerBinding.inflate(layoutInflater);
    }

    SuccessRegistrationNonSalariedWorkerActivity$bindingInflater$1() {
        super(1, ActivitySuccessRegistrationNonSalariedWorkerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySuccessRegistrationNonSalariedWorkerBinding;", 0);
    }
}
