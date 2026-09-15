package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import com.bpjstku.domain.general.model.CodeNamePair;
import defpackage.getBundleFromItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class BranchPioneerOfficeBottomSheetDialogFragment$chooseAddressPostalCodeAdapter$2$1 extends FunctionReferenceImpl implements Function1<CodeNamePair, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        getBundleFromItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2((getBundleFromItem) this.receiver, codeNamePair);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CodeNamePair codeNamePair) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(codeNamePair);
        return Unit.INSTANCE;
    }

    public BranchPioneerOfficeBottomSheetDialogFragment$chooseAddressPostalCodeAdapter$2$1(Object obj) {
        super(1, obj, getBundleFromItem.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", 0);
    }
}
