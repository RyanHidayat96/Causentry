package com.bpjstku.presentation.scholarship.benefit.fragment;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.getOrderedSupportedStreamUseCaseSurfaceConfigList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ScholarBenefitItemBottomDialog$chooseAddressPostalCodeAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void b(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        getOrderedSupportedStreamUseCaseSurfaceConfigList.b((getOrderedSupportedStreamUseCaseSurfaceConfigList) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        b(codeNamePair);
        return Unit.INSTANCE;
    }

    public ScholarBenefitItemBottomDialog$chooseAddressPostalCodeAdapter$2$1(Object obj) {
        super(1, obj, getOrderedSupportedStreamUseCaseSurfaceConfigList.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
