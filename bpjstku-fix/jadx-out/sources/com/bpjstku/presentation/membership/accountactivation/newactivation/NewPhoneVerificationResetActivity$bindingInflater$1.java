package com.bpjstku.presentation.membership.accountactivation.newactivation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPhoneActivationVerificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NewPhoneVerificationResetActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPhoneActivationVerificationBinding> {
    public static final NewPhoneVerificationResetActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new NewPhoneVerificationResetActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityPhoneActivationVerificationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPhoneActivationVerificationBinding.inflate(layoutInflater);
    }

    NewPhoneVerificationResetActivity$bindingInflater$1() {
        super(1, ActivityPhoneActivationVerificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPhoneActivationVerificationBinding;", 0);
    }
}
