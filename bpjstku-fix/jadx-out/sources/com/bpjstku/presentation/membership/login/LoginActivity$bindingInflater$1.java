package com.bpjstku.presentation.membership.login;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityLoginBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LoginActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityLoginBinding> {
    public static final LoginActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new LoginActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityLoginBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityLoginBinding.inflate(layoutInflater);
    }

    LoginActivity$bindingInflater$1() {
        super(1, ActivityLoginBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityLoginBinding;", 0);
    }
}
