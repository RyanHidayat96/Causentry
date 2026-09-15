package com.bpjstku.presentation.membership.registration;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVerifyAccountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class EmailVerificationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVerifyAccountBinding> {
    public static final EmailVerificationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new EmailVerificationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityVerifyAccountBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVerifyAccountBinding.inflate(layoutInflater);
    }

    EmailVerificationActivity$bindingInflater$1() {
        super(1, ActivityVerifyAccountBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVerifyAccountBinding;", 0);
    }
}
