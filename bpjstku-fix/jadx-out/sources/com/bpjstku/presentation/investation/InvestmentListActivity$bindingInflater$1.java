package com.bpjstku.presentation.investation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityInvestmentListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvestmentListActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityInvestmentListBinding> {
    public static final InvestmentListActivity$bindingInflater$1 b = new InvestmentListActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityInvestmentListBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityInvestmentListBinding.inflate(layoutInflater);
    }

    InvestmentListActivity$bindingInflater$1() {
        super(1, ActivityInvestmentListBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityInvestmentListBinding;", 0);
    }
}
