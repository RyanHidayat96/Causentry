package com.bpjstku.presentation.promo;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPromoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PromoActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPromoBinding> {
    public static final PromoActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new PromoActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityPromoBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPromoBinding.inflate(layoutInflater);
    }

    PromoActivity$bindingInflater$1() {
        super(1, ActivityPromoBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPromoBinding;", 0);
    }
}
