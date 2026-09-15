package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySyariahPrintEakadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SyariahPrintEakadActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySyariahPrintEakadBinding> {
    public static final SyariahPrintEakadActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SyariahPrintEakadActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivitySyariahPrintEakadBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySyariahPrintEakadBinding.inflate(layoutInflater);
    }

    SyariahPrintEakadActivity$bindingInflater$1() {
        super(1, ActivitySyariahPrintEakadBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySyariahPrintEakadBinding;", 0);
    }
}
