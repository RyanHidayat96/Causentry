package com.bpjstku.presentation.report;

import com.bpjstku.domain.report.model.Healthcare;
import defpackage.isImageAnalysis;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class PlkkBottomSheetFragment$healtchCareAdapter$2$1 extends FunctionReferenceImpl implements Function1<Healthcare, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Healthcare healthcare) {
        Intrinsics.checkNotNullParameter(healthcare, "");
        isImageAnalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3((isImageAnalysis) this.receiver, healthcare);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Healthcare healthcare) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(healthcare);
        return Unit.INSTANCE;
    }

    public PlkkBottomSheetFragment$healtchCareAdapter$2$1(Object obj) {
        super(1, obj, isImageAnalysis.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/report/model/Healthcare;)V", 0);
    }
}
