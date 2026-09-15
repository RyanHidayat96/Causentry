package com.bpjstku.presentation.account.setting;

import com.bpjstku.presentation.account.model.ItemAutodebitParticipant;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import defpackage.getEntries;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class NonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1 extends FunctionReferenceImpl implements Function1<ItemAutodebitParticipant, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ItemAutodebitParticipant itemAutodebitParticipant) {
        Intrinsics.checkNotNullParameter(itemAutodebitParticipant, "");
        Object[] objArr = {(getEntries) this.receiver, itemAutodebitParticipant};
        getEntries.b(zzir.TuitionPaymentFragmentbindingInflater1(), 2043782399, objArr, zzir.TuitionPaymentFragmentbindingInflater1(), zzir.TuitionPaymentFragmentbindingInflater1(), -2043782398, zzir.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ItemAutodebitParticipant itemAutodebitParticipant) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(itemAutodebitParticipant);
        return Unit.INSTANCE;
    }

    public NonactiveAutodebitBottomSheetDialogFragment$chooseItemAutodebitParticipantAdapter$2$1(Object obj) {
        super(1, obj, getEntries.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/account/model/ItemAutodebitParticipant;)V", 0);
    }
}
