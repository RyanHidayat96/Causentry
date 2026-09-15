package com.bpjstku.presentation.program.jht.olddaysecurity.tracking;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimTrackingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimTrackingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimTrackingBinding> {
    public static final ClaimTrackingActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ClaimTrackingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimTrackingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimTrackingBinding.inflate(layoutInflater);
    }

    ClaimTrackingActivity$bindingInflater$1() {
        super(1, ActivityClaimTrackingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimTrackingBinding;", 0);
    }
}
