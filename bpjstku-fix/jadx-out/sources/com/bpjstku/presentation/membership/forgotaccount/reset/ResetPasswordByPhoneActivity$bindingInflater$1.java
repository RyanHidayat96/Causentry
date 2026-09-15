package com.bpjstku.presentation.membership.forgotaccount.reset;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityResetPasswordByPhoneBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ResetPasswordByPhoneActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityResetPasswordByPhoneBinding> {
    public static final ResetPasswordByPhoneActivity$bindingInflater$1 b = new ResetPasswordByPhoneActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityResetPasswordByPhoneBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityResetPasswordByPhoneBinding.inflate(layoutInflater);
    }

    ResetPasswordByPhoneActivity$bindingInflater$1() {
        super(1, ActivityResetPasswordByPhoneBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityResetPasswordByPhoneBinding;", 0);
    }
}
