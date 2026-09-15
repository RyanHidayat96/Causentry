package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityRegisterAutoDebetEwalletBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RegisterAutoDebetEwalletActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityRegisterAutoDebetEwalletBinding> {
    public static final RegisterAutoDebetEwalletActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RegisterAutoDebetEwalletActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityRegisterAutoDebetEwalletBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityRegisterAutoDebetEwalletBinding.inflate(layoutInflater);
    }

    RegisterAutoDebetEwalletActivity$bindingInflater$1() {
        super(1, ActivityRegisterAutoDebetEwalletBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityRegisterAutoDebetEwalletBinding;", 0);
    }
}
