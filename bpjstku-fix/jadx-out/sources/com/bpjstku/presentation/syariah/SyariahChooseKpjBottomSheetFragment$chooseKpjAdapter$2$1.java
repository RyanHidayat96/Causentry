package com.bpjstku.presentation.syariah;

import com.bpjstku.presentation.syariah.model.SyariahChooseKpjModel;
import defpackage.CameraCharacteristicsApi28Impl;
import defpackage.addTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class SyariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1 extends FunctionReferenceImpl implements Function1<SyariahChooseKpjModel, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(SyariahChooseKpjModel syariahChooseKpjModel) {
        Intrinsics.checkNotNullParameter(syariahChooseKpjModel, "");
        Object[] objArr = {(CameraCharacteristicsApi28Impl) this.receiver, syariahChooseKpjModel};
        int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
        CameraCharacteristicsApi28Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addTask.TuitionPaymentFragmentbindingInflater1(), addTask.TuitionPaymentFragmentbindingInflater1(), 1696957250, objArr, -1696957249, iTuitionPaymentFragmentbindingInflater1, addTask.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(SyariahChooseKpjModel syariahChooseKpjModel) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(syariahChooseKpjModel);
        return Unit.INSTANCE;
    }

    public SyariahChooseKpjBottomSheetFragment$chooseKpjAdapter$2$1(Object obj) {
        super(1, obj, CameraCharacteristicsApi28Impl.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/syariah/model/SyariahChooseKpjModel;)V", 0);
    }
}
