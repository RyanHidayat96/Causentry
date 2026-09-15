package com.bpjstku.presentation.ewallet;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityEwalletBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class EWalletActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityEwalletBinding> {
    public static final EWalletActivity$bindingInflater$1 b = new EWalletActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityEwalletBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityEwalletBinding.inflate(layoutInflater);
    }

    EWalletActivity$bindingInflater$1() {
        super(1, ActivityEwalletBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityEwalletBinding;", 0);
    }
}
