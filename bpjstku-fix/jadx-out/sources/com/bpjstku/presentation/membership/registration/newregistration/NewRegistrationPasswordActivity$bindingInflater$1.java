package com.bpjstku.presentation.membership.registration.newregistration;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityRegistrationPasswordBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NewRegistrationPasswordActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityRegistrationPasswordBinding> {
    public static final NewRegistrationPasswordActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new NewRegistrationPasswordActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityRegistrationPasswordBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityRegistrationPasswordBinding.inflate(layoutInflater);
    }

    NewRegistrationPasswordActivity$bindingInflater$1() {
        super(1, ActivityRegistrationPasswordBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityRegistrationPasswordBinding;", 0);
    }
}
