package com.bpjstku.presentation.vocational.bottomsheets;

import com.bpjstku.domain.vocation.model.Bank;
import defpackage.applyQuirks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class BankBottomSheetFragment$adapter$2$1 extends FunctionReferenceImpl implements Function1<Bank, Unit> {
    public final void b(Bank bank) {
        Intrinsics.checkNotNullParameter(bank, "");
        applyQuirks.TuitionPaymentFragmentbindingInflater1((applyQuirks) this.receiver, bank);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bank bank) {
        b(bank);
        return Unit.INSTANCE;
    }

    public BankBottomSheetFragment$adapter$2$1(Object obj) {
        super(1, obj, applyQuirks.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/vocation/model/Bank;)V", 0);
    }
}
