package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityBalanceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class ClaimOldDaySecurityBalanceFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityBalanceBinding> {
    public static final ClaimOldDaySecurityBalanceFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ClaimOldDaySecurityBalanceFragment$bindingInflater$1();

    public final FragmentClaimOldDaySecurityBalanceBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentClaimOldDaySecurityBalanceBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentClaimOldDaySecurityBalanceBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    ClaimOldDaySecurityBalanceFragment$bindingInflater$1() {
        super(3, FragmentClaimOldDaySecurityBalanceBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityBalanceBinding;", 0);
    }
}
