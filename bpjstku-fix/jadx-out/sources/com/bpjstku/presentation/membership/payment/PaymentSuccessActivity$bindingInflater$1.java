package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPaymentSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PaymentSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPaymentSuccessBinding> {
    public static final PaymentSuccessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new PaymentSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityPaymentSuccessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPaymentSuccessBinding.inflate(layoutInflater);
    }

    PaymentSuccessActivity$bindingInflater$1() {
        super(1, ActivityPaymentSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPaymentSuccessBinding;", 0);
    }
}
