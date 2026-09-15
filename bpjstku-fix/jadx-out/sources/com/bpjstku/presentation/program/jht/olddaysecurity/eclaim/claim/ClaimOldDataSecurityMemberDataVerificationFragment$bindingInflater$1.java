package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentClaimOldDataSecurityMemberDataVerificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDataSecurityMemberDataVerificationBinding> {
    public static final ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1();

    public final FragmentClaimOldDataSecurityMemberDataVerificationBinding b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentClaimOldDataSecurityMemberDataVerificationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentClaimOldDataSecurityMemberDataVerificationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return b(layoutInflater, viewGroup, bool.booleanValue());
    }

    ClaimOldDataSecurityMemberDataVerificationFragment$bindingInflater$1() {
        super(3, FragmentClaimOldDataSecurityMemberDataVerificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentClaimOldDataSecurityMemberDataVerificationBinding;", 0);
    }
}
