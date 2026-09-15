package com.bpjstku.presentation.membership.forgotaccount.inputnik;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityGetOtpMethodBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class GetOtpMethodActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityGetOtpMethodBinding> {
    public static final GetOtpMethodActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new GetOtpMethodActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityGetOtpMethodBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityGetOtpMethodBinding.inflate(layoutInflater);
    }

    GetOtpMethodActivity$bindingInflater$1() {
        super(1, ActivityGetOtpMethodBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityGetOtpMethodBinding;", 0);
    }
}
