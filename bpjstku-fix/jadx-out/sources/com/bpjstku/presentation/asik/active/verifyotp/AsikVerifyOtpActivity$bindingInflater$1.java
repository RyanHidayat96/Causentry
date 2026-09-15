package com.bpjstku.presentation.asik.active.verifyotp;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikVerifyOtpBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikVerifyOtpActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikVerifyOtpBinding> {
    public static final AsikVerifyOtpActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AsikVerifyOtpActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikVerifyOtpBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikVerifyOtpBinding.inflate(layoutInflater);
    }

    AsikVerifyOtpActivity$bindingInflater$1() {
        super(1, ActivityAsikVerifyOtpBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikVerifyOtpBinding;", 0);
    }
}
