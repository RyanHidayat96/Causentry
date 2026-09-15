package com.bpjstku.presentation.program.jkp.tracking;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkpClaimTrackingTimelineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkpClaimTrackingTimelineActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkpClaimTrackingTimelineBinding> {
    public static final JkpClaimTrackingTimelineActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new JkpClaimTrackingTimelineActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityJkpClaimTrackingTimelineBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkpClaimTrackingTimelineBinding.inflate(layoutInflater);
    }

    JkpClaimTrackingTimelineActivity$bindingInflater$1() {
        super(1, ActivityJkpClaimTrackingTimelineBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkpClaimTrackingTimelineBinding;", 0);
    }
}
