package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPaymentNonInstantNonSalariedWorkerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PaymentNonInstantDetailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPaymentNonInstantNonSalariedWorkerBinding> {
    public static final PaymentNonInstantDetailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new PaymentNonInstantDetailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityPaymentNonInstantNonSalariedWorkerBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPaymentNonInstantNonSalariedWorkerBinding.inflate(layoutInflater);
    }

    PaymentNonInstantDetailActivity$bindingInflater$1() {
        super(1, ActivityPaymentNonInstantNonSalariedWorkerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPaymentNonInstantNonSalariedWorkerBinding;", 0);
    }
}
