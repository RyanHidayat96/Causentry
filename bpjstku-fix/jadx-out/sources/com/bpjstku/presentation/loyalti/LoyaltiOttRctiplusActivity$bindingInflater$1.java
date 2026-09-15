package com.bpjstku.presentation.loyalti;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityLayoutOttRctiPlusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LoyaltiOttRctiplusActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityLayoutOttRctiPlusBinding> {
    public static final LoyaltiOttRctiplusActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new LoyaltiOttRctiplusActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityLayoutOttRctiPlusBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityLayoutOttRctiPlusBinding.inflate(layoutInflater);
    }

    LoyaltiOttRctiplusActivity$bindingInflater$1() {
        super(1, ActivityLayoutOttRctiPlusBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityLayoutOttRctiPlusBinding;", 0);
    }
}
