package com.bpjstku.presentation.promo;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityCoMarketingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class CoMarketingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityCoMarketingBinding> {
    public static final CoMarketingActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new CoMarketingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityCoMarketingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityCoMarketingBinding.inflate(layoutInflater);
    }

    CoMarketingActivity$bindingInflater$1() {
        super(1, ActivityCoMarketingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityCoMarketingBinding;", 0);
    }
}
