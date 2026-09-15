package com.bpjstku.presentation.membership.accountactivation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityChooseMembershipActivationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ChooseMembershipActivationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityChooseMembershipActivationBinding> {
    public static final ChooseMembershipActivationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ChooseMembershipActivationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityChooseMembershipActivationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityChooseMembershipActivationBinding.inflate(layoutInflater);
    }

    ChooseMembershipActivationActivity$bindingInflater$1() {
        super(1, ActivityChooseMembershipActivationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityChooseMembershipActivationBinding;", 0);
    }
}
