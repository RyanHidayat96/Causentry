package com.bpjstku.presentation.bsu;

import com.bpjstku.presentation.bsu.model.BankStatus;
import defpackage.jumpToCurrentState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1 extends FunctionReferenceImpl implements Function1<BankStatus, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankStatus bankStatus) {
        Intrinsics.checkNotNullParameter(bankStatus, "");
        jumpToCurrentState.TuitionPaymentFragmentbindingInflater1((jumpToCurrentState) this.receiver, bankStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(BankStatus bankStatus) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(bankStatus);
        return Unit.INSTANCE;
    }

    public ChooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1(Object obj) {
        super(1, obj, jumpToCurrentState.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/bsu/model/BankStatus;)V", 0);
    }
}
