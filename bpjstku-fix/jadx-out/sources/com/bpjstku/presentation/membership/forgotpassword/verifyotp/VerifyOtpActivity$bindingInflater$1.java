package com.bpjstku.presentation.membership.forgotpassword.verifyotp;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVerifyOtpBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VerifyOtpActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVerifyOtpBinding> {
    public static final VerifyOtpActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new VerifyOtpActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityVerifyOtpBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVerifyOtpBinding.inflate(layoutInflater);
    }

    VerifyOtpActivity$bindingInflater$1() {
        super(1, ActivityVerifyOtpBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVerifyOtpBinding;", 0);
    }
}
