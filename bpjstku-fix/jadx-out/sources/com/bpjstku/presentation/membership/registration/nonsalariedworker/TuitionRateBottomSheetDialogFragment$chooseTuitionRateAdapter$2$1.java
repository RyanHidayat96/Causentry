package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import com.bpjstku.presentation.membership.registration.model.TuitionRate;
import defpackage.CustomTabsIntent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class TuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1 extends FunctionReferenceImpl implements Function1<TuitionRate, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionRate tuitionRate) {
        Intrinsics.checkNotNullParameter(tuitionRate, "");
        CustomTabsIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault2((CustomTabsIntent) this.receiver, tuitionRate);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TuitionRate tuitionRate) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionRate);
        return Unit.INSTANCE;
    }

    public TuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1(Object obj) {
        super(1, obj, CustomTabsIntent.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;)V", 0);
    }
}
