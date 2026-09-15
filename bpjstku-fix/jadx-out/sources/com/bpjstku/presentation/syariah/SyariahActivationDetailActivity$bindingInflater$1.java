package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySyariahActivationDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SyariahActivationDetailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySyariahActivationDetailBinding> {
    public static final SyariahActivationDetailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SyariahActivationDetailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivitySyariahActivationDetailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySyariahActivationDetailBinding.inflate(layoutInflater);
    }

    SyariahActivationDetailActivity$bindingInflater$1() {
        super(1, ActivitySyariahActivationDetailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySyariahActivationDetailBinding;", 0);
    }
}
