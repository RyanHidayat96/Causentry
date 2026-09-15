package com.bpjstku.presentation.membership.forgotpassword.inputemail;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityForgotPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ForgotPasswordActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityForgotPasswordBinding> {
    public static final ForgotPasswordActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ForgotPasswordActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityForgotPasswordBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityForgotPasswordBinding.inflate(layoutInflater);
    }

    ForgotPasswordActivity$bindingInflater$1() {
        super(1, ActivityForgotPasswordBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityForgotPasswordBinding;", 0);
    }
}
