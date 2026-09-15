package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimChooseMembershipBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimChooseMembershipActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimChooseMembershipBinding> {
    public static final ClaimChooseMembershipActivity$bindingInflater$1 b = new ClaimChooseMembershipActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimChooseMembershipBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimChooseMembershipBinding.inflate(layoutInflater);
    }

    ClaimChooseMembershipActivity$bindingInflater$1() {
        super(1, ActivityClaimChooseMembershipBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimChooseMembershipBinding;", 0);
    }
}
