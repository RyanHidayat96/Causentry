package com.bpjstku.presentation.vocational.bottomsheets;

import com.bpjstku.domain.vocation.model.TrainingField;
import defpackage.RequestMonitorExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class TrainingFieldBottomSheetFragment$adapter$2$1 extends FunctionReferenceImpl implements Function1<TrainingField, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TrainingField trainingField) {
        Intrinsics.checkNotNullParameter(trainingField, "");
        RequestMonitorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((RequestMonitorExternalSyntheticLambda0) this.receiver, trainingField);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TrainingField trainingField) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(trainingField);
        return Unit.INSTANCE;
    }

    public TrainingFieldBottomSheetFragment$adapter$2$1(Object obj) {
        super(1, obj, RequestMonitorExternalSyntheticLambda0.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/vocation/model/TrainingField;)V", 0);
    }
}
