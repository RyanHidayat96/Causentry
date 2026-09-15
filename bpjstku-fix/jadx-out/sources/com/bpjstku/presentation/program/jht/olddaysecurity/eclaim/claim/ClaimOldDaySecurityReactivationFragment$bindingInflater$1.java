package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityReactivationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ClaimOldDaySecurityReactivationFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityReactivationBinding> {
    public static final ClaimOldDaySecurityReactivationFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new ClaimOldDaySecurityReactivationFragment$bindingInflater$1();

    public final FragmentClaimOldDaySecurityReactivationBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentClaimOldDaySecurityReactivationBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentClaimOldDaySecurityReactivationBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    ClaimOldDaySecurityReactivationFragment$bindingInflater$1() {
        super(3, FragmentClaimOldDaySecurityReactivationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityReactivationBinding;", 0);
    }
}
