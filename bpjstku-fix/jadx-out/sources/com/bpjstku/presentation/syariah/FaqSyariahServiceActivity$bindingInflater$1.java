package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityFaqSyariahServiceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class FaqSyariahServiceActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityFaqSyariahServiceBinding> {
    public static final FaqSyariahServiceActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new FaqSyariahServiceActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityFaqSyariahServiceBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityFaqSyariahServiceBinding.inflate(layoutInflater);
    }

    FaqSyariahServiceActivity$bindingInflater$1() {
        super(1, ActivityFaqSyariahServiceBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityFaqSyariahServiceBinding;", 0);
    }
}
