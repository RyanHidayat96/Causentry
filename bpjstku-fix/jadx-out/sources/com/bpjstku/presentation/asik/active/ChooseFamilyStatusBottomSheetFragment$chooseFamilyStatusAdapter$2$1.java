package com.bpjstku.presentation.asik.active;

import com.bpjstku.domain.asik.model.FamilyStatus;
import defpackage.unregisterOnBackInvokedCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1 extends FunctionReferenceImpl implements Function1<FamilyStatus, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(FamilyStatus familyStatus) {
        Intrinsics.checkNotNullParameter(familyStatus, "");
        unregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1((unregisterOnBackInvokedCallback) this.receiver, familyStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(FamilyStatus familyStatus) {
        TuitionPaymentFragmentbindingInflater1(familyStatus);
        return Unit.INSTANCE;
    }

    public ChooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1(Object obj) {
        super(1, obj, unregisterOnBackInvokedCallback.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/asik/model/FamilyStatus;)V", 0);
    }
}
