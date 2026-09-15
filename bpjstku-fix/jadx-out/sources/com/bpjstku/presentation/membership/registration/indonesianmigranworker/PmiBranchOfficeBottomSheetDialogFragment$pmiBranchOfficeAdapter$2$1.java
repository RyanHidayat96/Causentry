package com.bpjstku.presentation.membership.registration.indonesianmigranworker;

import com.bpjstku.domain.registration.pmi.model.PmiBranchOffice;
import defpackage.postToMainThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class PmiBranchOfficeBottomSheetDialogFragment$pmiBranchOfficeAdapter$2$1 extends FunctionReferenceImpl implements Function1<PmiBranchOffice, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(PmiBranchOffice pmiBranchOffice) {
        Intrinsics.checkNotNullParameter(pmiBranchOffice, "");
        postToMainThread.b((postToMainThread) this.receiver, pmiBranchOffice);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PmiBranchOffice pmiBranchOffice) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(pmiBranchOffice);
        return Unit.INSTANCE;
    }

    public PmiBranchOfficeBottomSheetDialogFragment$pmiBranchOfficeAdapter$2$1(Object obj) {
        super(1, obj, postToMainThread.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/registration/pmi/model/PmiBranchOffice;)V", 0);
    }
}
