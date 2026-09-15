package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityClaimSubmissionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ClaimSubmissionActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityClaimSubmissionBinding> {
    public static final ClaimSubmissionActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ClaimSubmissionActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityClaimSubmissionBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityClaimSubmissionBinding.inflate(layoutInflater);
    }

    ClaimSubmissionActivity$bindingInflater$1() {
        super(1, ActivityClaimSubmissionBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityClaimSubmissionBinding;", 0);
    }
}
