package com.bpjstku.presentation.asik.active;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.bypassDispatchKeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChoosePostalCodeAddressBottomSheetFragment$chooseAddressPostalCodeAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        bypassDispatchKeyEvent.b((bypassDispatchKeyEvent) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair);
        return Unit.INSTANCE;
    }

    public ChoosePostalCodeAddressBottomSheetFragment$chooseAddressPostalCodeAdapter$2$1(Object obj) {
        super(1, obj, bypassDispatchKeyEvent.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
