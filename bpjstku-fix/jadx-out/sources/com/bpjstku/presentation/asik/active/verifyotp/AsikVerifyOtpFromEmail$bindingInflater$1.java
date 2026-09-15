package com.bpjstku.presentation.asik.active.verifyotp;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikVerifyOtpFromEmailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikVerifyOtpFromEmail$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikVerifyOtpFromEmailBinding> {
    public static final AsikVerifyOtpFromEmail$bindingInflater$1 b = new AsikVerifyOtpFromEmail$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikVerifyOtpFromEmailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikVerifyOtpFromEmailBinding.inflate(layoutInflater);
    }

    AsikVerifyOtpFromEmail$bindingInflater$1() {
        super(1, ActivityAsikVerifyOtpFromEmailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikVerifyOtpFromEmailBinding;", 0);
    }
}
