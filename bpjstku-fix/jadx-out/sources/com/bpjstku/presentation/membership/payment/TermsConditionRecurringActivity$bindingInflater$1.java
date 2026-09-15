package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTermsConditionRecurringBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TermsConditionRecurringActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTermsConditionRecurringBinding> {
    public static final TermsConditionRecurringActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TermsConditionRecurringActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityTermsConditionRecurringBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTermsConditionRecurringBinding.inflate(layoutInflater);
    }

    TermsConditionRecurringActivity$bindingInflater$1() {
        super(1, ActivityTermsConditionRecurringBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTermsConditionRecurringBinding;", 0);
    }
}
