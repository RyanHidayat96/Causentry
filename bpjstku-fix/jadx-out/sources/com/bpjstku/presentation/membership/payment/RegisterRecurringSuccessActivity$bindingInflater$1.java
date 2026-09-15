package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityRegisterRecurringSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RegisterRecurringSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityRegisterRecurringSuccessBinding> {
    public static final RegisterRecurringSuccessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new RegisterRecurringSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityRegisterRecurringSuccessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityRegisterRecurringSuccessBinding.inflate(layoutInflater);
    }

    RegisterRecurringSuccessActivity$bindingInflater$1() {
        super(1, ActivityRegisterRecurringSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityRegisterRecurringSuccessBinding;", 0);
    }
}
