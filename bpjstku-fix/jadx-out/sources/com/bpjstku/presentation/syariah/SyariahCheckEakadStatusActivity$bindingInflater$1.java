package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySyariahCheckEakadStatusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SyariahCheckEakadStatusActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySyariahCheckEakadStatusBinding> {
    public static final SyariahCheckEakadStatusActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new SyariahCheckEakadStatusActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivitySyariahCheckEakadStatusBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySyariahCheckEakadStatusBinding.inflate(layoutInflater);
    }

    SyariahCheckEakadStatusActivity$bindingInflater$1() {
        super(1, ActivitySyariahCheckEakadStatusBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySyariahCheckEakadStatusBinding;", 0);
    }
}
