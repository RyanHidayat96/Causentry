package com.bpjstku.presentation.report;

import com.bpjstku.domain.report.model.ReportStatus;
import defpackage.hasPreviewSurface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseReportingBottomSheetFragment$chooseReportingAdapter$2$1 extends FunctionReferenceImpl implements Function1<ReportStatus, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ReportStatus reportStatus) {
        Intrinsics.checkNotNullParameter(reportStatus, "");
        hasPreviewSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1((hasPreviewSurface) this.receiver, reportStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ReportStatus reportStatus) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(reportStatus);
        return Unit.INSTANCE;
    }

    public ChooseReportingBottomSheetFragment$chooseReportingAdapter$2$1(Object obj) {
        super(1, obj, hasPreviewSurface.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/report/model/ReportStatus;)V", 0);
    }
}
