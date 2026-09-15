package com.bpjstku.presentation.program;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimChooseSegmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimChooseSegmentActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimChooseSegmentBinding> {
    public static final ClaimChooseSegmentActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new ClaimChooseSegmentActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimChooseSegmentBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimChooseSegmentBinding.inflate(layoutInflater);
    }

    ClaimChooseSegmentActivity$bindingInflater$1() {
        super(1, ActivityClaimChooseSegmentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimChooseSegmentBinding;", 0);
    }
}
