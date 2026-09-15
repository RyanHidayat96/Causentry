package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityNewActivationPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NewActivationPasswordActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNewActivationPasswordBinding> {
    public static final NewActivationPasswordActivity$bindingInflater$1 b = new NewActivationPasswordActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityNewActivationPasswordBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNewActivationPasswordBinding.inflate(layoutInflater);
    }

    NewActivationPasswordActivity$bindingInflater$1() {
        super(1, ActivityNewActivationPasswordBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNewActivationPasswordBinding;", 0);
    }
}
