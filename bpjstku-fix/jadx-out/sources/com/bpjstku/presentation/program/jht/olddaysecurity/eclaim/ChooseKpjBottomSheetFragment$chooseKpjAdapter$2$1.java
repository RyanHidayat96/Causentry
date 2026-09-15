package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim;

import com.bpjstku.domain.jht.model.Kpj;
import defpackage.updateSessionConfigSynchronous;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 extends FunctionReferenceImpl implements Function1<Kpj, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(Kpj kpj) {
        Intrinsics.checkNotNullParameter(kpj, "");
        updateSessionConfigSynchronous.TuitionPaymentFragmentbindingInflater1((updateSessionConfigSynchronous) this.receiver, kpj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Kpj kpj) {
        TuitionPaymentFragmentbindingInflater1(kpj);
        return Unit.INSTANCE;
    }

    public ChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1(Object obj) {
        super(1, obj, updateSessionConfigSynchronous.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/jht/model/Kpj;)V", 0);
    }
}
