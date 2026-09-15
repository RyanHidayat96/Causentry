package com.bpjstku.presentation.membership.registration.newregistration;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPhoneVerificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NewPhoneVerificationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPhoneVerificationBinding> {
    public static final NewPhoneVerificationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new NewPhoneVerificationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityPhoneVerificationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPhoneVerificationBinding.inflate(layoutInflater);
    }

    NewPhoneVerificationActivity$bindingInflater$1() {
        super(1, ActivityPhoneVerificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPhoneVerificationBinding;", 0);
    }
}
