package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityDocumentUploadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityDocumentUploadBinding> {
    public static final ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1();

    public final FragmentClaimOldDaySecurityDocumentUploadBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentClaimOldDaySecurityDocumentUploadBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentClaimOldDaySecurityDocumentUploadBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    ClaimOldDaySecurityDocumentUploadFragment$bindingInflater$1() {
        super(3, FragmentClaimOldDaySecurityDocumentUploadBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityDocumentUploadBinding;", 0);
    }
}
