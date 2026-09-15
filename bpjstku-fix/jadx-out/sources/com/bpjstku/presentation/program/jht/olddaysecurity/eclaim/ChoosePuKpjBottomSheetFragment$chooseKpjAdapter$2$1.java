package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim;

import com.bpjstku.domain.jht.model.Kpj;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChoosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1 extends FunctionReferenceImpl implements Function1<Kpj, Unit> {
    public final void b(Kpj kpj) {
        Intrinsics.checkNotNullParameter(kpj, "");
        Camera2CameraControlImplExternalSyntheticLambda2.TuitionPaymentFragmentbindingInflater1((Camera2CameraControlImplExternalSyntheticLambda2) this.receiver, kpj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Kpj kpj) {
        b(kpj);
        return Unit.INSTANCE;
    }

    public ChoosePuKpjBottomSheetFragment$chooseKpjAdapter$2$1(Object obj) {
        super(1, obj, Camera2CameraControlImplExternalSyntheticLambda2.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/jht/model/Kpj;)V", 0);
    }
}
