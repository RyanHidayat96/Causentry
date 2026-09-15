package com.bpjstku.presentation.membership.registration;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityChooseMembershipRegistrationTypeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ChooseMembershipRegistrationTypeActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityChooseMembershipRegistrationTypeBinding> {
    public static final ChooseMembershipRegistrationTypeActivity$bindingInflater$1 b = new ChooseMembershipRegistrationTypeActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityChooseMembershipRegistrationTypeBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityChooseMembershipRegistrationTypeBinding.inflate(layoutInflater);
    }

    ChooseMembershipRegistrationTypeActivity$bindingInflater$1() {
        super(1, ActivityChooseMembershipRegistrationTypeBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityChooseMembershipRegistrationTypeBinding;", 0);
    }
}
