package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikVerifyOtpFromPhoneBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikAccountVerificationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikVerifyOtpFromPhoneBinding> {
    public static final AsikAccountVerificationActivity$bindingInflater$1 b = new AsikAccountVerificationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikVerifyOtpFromPhoneBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikVerifyOtpFromPhoneBinding.inflate(layoutInflater);
    }

    AsikAccountVerificationActivity$bindingInflater$1() {
        super(1, ActivityAsikVerifyOtpFromPhoneBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikVerifyOtpFromPhoneBinding;", 0);
    }
}
