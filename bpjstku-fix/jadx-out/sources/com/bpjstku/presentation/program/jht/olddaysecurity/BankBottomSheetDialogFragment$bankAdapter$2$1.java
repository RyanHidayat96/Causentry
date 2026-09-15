package com.bpjstku.presentation.program.jht.olddaysecurity;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.getExposureControl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class BankBottomSheetDialogFragment$bankAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        getExposureControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3((getExposureControl) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        return Unit.INSTANCE;
    }

    public BankBottomSheetDialogFragment$bankAdapter$2$1(Object obj) {
        super(1, obj, getExposureControl.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
