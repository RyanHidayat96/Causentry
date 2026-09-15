package com.bpjstku.presentation.program.jkp.tracking;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkpClaimTrackingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkpClaimTrackingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkpClaimTrackingBinding> {
    public static final JkpClaimTrackingActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new JkpClaimTrackingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityJkpClaimTrackingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkpClaimTrackingBinding.inflate(layoutInflater);
    }

    JkpClaimTrackingActivity$bindingInflater$1() {
        super(1, ActivityJkpClaimTrackingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkpClaimTrackingBinding;", 0);
    }
}
