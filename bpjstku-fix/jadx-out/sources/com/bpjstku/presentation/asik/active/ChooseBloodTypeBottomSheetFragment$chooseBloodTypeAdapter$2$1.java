package com.bpjstku.presentation.asik.active;

import com.bpjstku.domain.asik.model.BloodTypeStatus;
import defpackage.setLocales;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1 extends FunctionReferenceImpl implements Function1<BloodTypeStatus, Unit> {
    public final void b(BloodTypeStatus bloodTypeStatus) {
        Intrinsics.checkNotNullParameter(bloodTypeStatus, "");
        setLocales.b((setLocales) this.receiver, bloodTypeStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(BloodTypeStatus bloodTypeStatus) {
        b(bloodTypeStatus);
        return Unit.INSTANCE;
    }

    public ChooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1(Object obj) {
        super(1, obj, setLocales.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/asik/model/BloodTypeStatus;)V", 0);
    }
}
