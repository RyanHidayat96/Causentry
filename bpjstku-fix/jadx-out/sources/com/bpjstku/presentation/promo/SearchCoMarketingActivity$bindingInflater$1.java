package com.bpjstku.presentation.promo;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySearchCoMarketingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SearchCoMarketingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySearchCoMarketingBinding> {
    public static final SearchCoMarketingActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new SearchCoMarketingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivitySearchCoMarketingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySearchCoMarketingBinding.inflate(layoutInflater);
    }

    SearchCoMarketingActivity$bindingInflater$1() {
        super(1, ActivitySearchCoMarketingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySearchCoMarketingBinding;", 0);
    }
}
