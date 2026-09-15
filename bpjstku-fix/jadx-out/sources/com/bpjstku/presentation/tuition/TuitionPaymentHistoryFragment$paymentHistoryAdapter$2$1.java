package com.bpjstku.presentation.tuition;

import com.bpjstku.domain.tuition.model.PaymentHistoryItem;
import defpackage.profileToDynamicRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class TuitionPaymentHistoryFragment$paymentHistoryAdapter$2$1 extends FunctionReferenceImpl implements Function1<PaymentHistoryItem, Unit> {
    public final void b(PaymentHistoryItem paymentHistoryItem) {
        Intrinsics.checkNotNullParameter(paymentHistoryItem, "");
        ((profileToDynamicRange) this.receiver).b(paymentHistoryItem);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PaymentHistoryItem paymentHistoryItem) {
        b(paymentHistoryItem);
        return Unit.INSTANCE;
    }

    public TuitionPaymentHistoryFragment$paymentHistoryAdapter$2$1(Object obj) {
        super(1, obj, profileToDynamicRange.class, "b", "b(Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;)V", 0);
    }
}
