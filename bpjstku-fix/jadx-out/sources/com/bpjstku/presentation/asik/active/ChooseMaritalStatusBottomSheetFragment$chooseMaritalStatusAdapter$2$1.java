package com.bpjstku.presentation.asik.active;

import com.bpjstku.domain.asik.model.MaritalStatus;
import defpackage.AppCompatDelegateImplApi33ImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ChooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1 extends FunctionReferenceImpl implements Function1<MaritalStatus, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(MaritalStatus maritalStatus) {
        Intrinsics.checkNotNullParameter(maritalStatus, "");
        AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3((AppCompatDelegateImplApi33ImplExternalSyntheticLambda0) this.receiver, maritalStatus);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(MaritalStatus maritalStatus) {
        TuitionPaymentFragmentbindingInflater1(maritalStatus);
        return Unit.INSTANCE;
    }

    public ChooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1(Object obj) {
        super(1, obj, AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/asik/model/MaritalStatus;)V", 0);
    }
}
