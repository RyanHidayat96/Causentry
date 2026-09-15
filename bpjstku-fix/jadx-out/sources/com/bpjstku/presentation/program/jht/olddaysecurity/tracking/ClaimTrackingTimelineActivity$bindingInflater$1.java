package com.bpjstku.presentation.program.jht.olddaysecurity.tracking;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimTrackingTimelineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimTrackingTimelineActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimTrackingTimelineBinding> {
    public static final ClaimTrackingTimelineActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ClaimTrackingTimelineActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimTrackingTimelineBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimTrackingTimelineBinding.inflate(layoutInflater);
    }

    ClaimTrackingTimelineActivity$bindingInflater$1() {
        super(1, ActivityClaimTrackingTimelineBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimTrackingTimelineBinding;", 0);
    }
}
