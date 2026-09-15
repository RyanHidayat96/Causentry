package com.bpjstku.presentation.openbanking;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTncBankBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TncBankActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTncBankBinding> {
    public static final TncBankActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TncBankActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityTncBankBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTncBankBinding.inflate(layoutInflater);
    }

    TncBankActivity$bindingInflater$1() {
        super(1, ActivityTncBankBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTncBankBinding;", 0);
    }
}
