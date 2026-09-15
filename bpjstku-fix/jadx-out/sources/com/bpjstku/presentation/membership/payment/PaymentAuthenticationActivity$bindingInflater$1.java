package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPaymentAuthenticationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PaymentAuthenticationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPaymentAuthenticationBinding> {
    public static final PaymentAuthenticationActivity$bindingInflater$1 b = new PaymentAuthenticationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityPaymentAuthenticationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPaymentAuthenticationBinding.inflate(layoutInflater);
    }

    PaymentAuthenticationActivity$bindingInflater$1() {
        super(1, ActivityPaymentAuthenticationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPaymentAuthenticationBinding;", 0);
    }
}
