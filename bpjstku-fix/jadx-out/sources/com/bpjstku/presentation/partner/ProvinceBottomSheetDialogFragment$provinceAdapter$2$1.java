package com.bpjstku.presentation.partner;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.createServiceIntent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ProvinceBottomSheetDialogFragment$provinceAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        createServiceIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault3((createServiceIntent) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        return Unit.INSTANCE;
    }

    public ProvinceBottomSheetDialogFragment$provinceAdapter$2$1(Object obj) {
        super(1, obj, createServiceIntent.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
