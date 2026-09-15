package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPaymentAutoDebetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PaymentAutoDebetActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPaymentAutoDebetBinding> {
    public static final PaymentAutoDebetActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new PaymentAutoDebetActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityPaymentAutoDebetBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPaymentAutoDebetBinding.inflate(layoutInflater);
    }

    PaymentAutoDebetActivity$bindingInflater$1() {
        super(1, ActivityPaymentAutoDebetBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPaymentAutoDebetBinding;", 0);
    }
}
