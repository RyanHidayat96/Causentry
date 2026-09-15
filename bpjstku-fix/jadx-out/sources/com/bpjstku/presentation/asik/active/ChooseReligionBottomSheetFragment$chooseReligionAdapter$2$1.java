package com.bpjstku.presentation.asik.active;

import com.bpjstku.domain.asik.model.ReligionStatus;
import defpackage.onWindowStartingActionMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseReligionBottomSheetFragment$chooseReligionAdapter$2$1 extends FunctionReferenceImpl implements Function1<ReligionStatus, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(ReligionStatus religionStatus) {
        Intrinsics.checkNotNullParameter(religionStatus, "");
        onWindowStartingActionMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1((onWindowStartingActionMode) this.receiver, religionStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ReligionStatus religionStatus) {
        TuitionPaymentFragmentbindingInflater1(religionStatus);
        return Unit.INSTANCE;
    }

    public ChooseReligionBottomSheetFragment$chooseReligionAdapter$2$1(Object obj) {
        super(1, obj, onWindowStartingActionMode.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/asik/model/ReligionStatus;)V", 0);
    }
}
