package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAuthenticationOtpBniAutodebetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AuthenticationOtpBniAutodebetActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAuthenticationOtpBniAutodebetBinding> {
    public static final AuthenticationOtpBniAutodebetActivity$bindingInflater$1 b = new AuthenticationOtpBniAutodebetActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityAuthenticationOtpBniAutodebetBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAuthenticationOtpBniAutodebetBinding.inflate(layoutInflater);
    }

    AuthenticationOtpBniAutodebetActivity$bindingInflater$1() {
        super(1, ActivityAuthenticationOtpBniAutodebetBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAuthenticationOtpBniAutodebetBinding;", 0);
    }
}
