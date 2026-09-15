package com.bpjstku.presentation.partner;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.TrustedWebActivityService1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class CityBottomSheetDialogFragment$cityAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        TrustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2((TrustedWebActivityService1) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair);
        return Unit.INSTANCE;
    }

    public CityBottomSheetDialogFragment$cityAdapter$2$1(Object obj) {
        super(1, obj, TrustedWebActivityService1.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
