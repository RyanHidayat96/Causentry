package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimSubmissionSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimSubmissionSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimSubmissionSuccessBinding> {
    public static final ClaimSubmissionSuccessActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ClaimSubmissionSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimSubmissionSuccessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimSubmissionSuccessBinding.inflate(layoutInflater);
    }

    ClaimSubmissionSuccessActivity$bindingInflater$1() {
        super(1, ActivityClaimSubmissionSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimSubmissionSuccessBinding;", 0);
    }
}
