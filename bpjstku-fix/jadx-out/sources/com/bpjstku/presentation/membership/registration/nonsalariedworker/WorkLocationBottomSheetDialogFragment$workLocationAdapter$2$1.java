package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import com.bpjstku.presentation.membership.registration.model.WorkLocation;
import defpackage.getActivitySideSheetPosition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class WorkLocationBottomSheetDialogFragment$workLocationAdapter$2$1 extends FunctionReferenceImpl implements Function1<WorkLocation, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(WorkLocation workLocation) {
        Intrinsics.checkNotNullParameter(workLocation, "");
        getActivitySideSheetPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault2((getActivitySideSheetPosition) this.receiver, workLocation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(WorkLocation workLocation) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(workLocation);
        return Unit.INSTANCE;
    }

    public WorkLocationBottomSheetDialogFragment$workLocationAdapter$2$1(Object obj) {
        super(1, obj, getActivitySideSheetPosition.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;)V", 0);
    }
}
