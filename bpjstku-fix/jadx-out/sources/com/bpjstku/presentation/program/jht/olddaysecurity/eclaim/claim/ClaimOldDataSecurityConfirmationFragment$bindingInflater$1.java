package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentClaimOldDataSecurityConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ClaimOldDataSecurityConfirmationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDataSecurityConfirmationBinding> {
    public static final ClaimOldDataSecurityConfirmationFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ClaimOldDataSecurityConfirmationFragment$bindingInflater$1();

    public final FragmentClaimOldDataSecurityConfirmationBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentClaimOldDataSecurityConfirmationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentClaimOldDataSecurityConfirmationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    ClaimOldDataSecurityConfirmationFragment$bindingInflater$1() {
        super(3, FragmentClaimOldDataSecurityConfirmationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentClaimOldDataSecurityConfirmationBinding;", 0);
    }
}
