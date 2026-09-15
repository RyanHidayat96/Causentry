package com.bpjstku.presentation.promo;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPromoDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PromoDetailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPromoDetailBinding> {
    public static final PromoDetailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new PromoDetailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityPromoDetailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPromoDetailBinding.inflate(layoutInflater);
    }

    PromoDetailActivity$bindingInflater$1() {
        super(1, ActivityPromoDetailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPromoDetailBinding;", 0);
    }
}
