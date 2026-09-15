package com.bpjstku.presentation.promo.bottomsheet;

import com.bpjstku.domain.promo.model.CategoryMerchant;
import defpackage.triggerAePrecapture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class CategoryBottomSheetFragment$adapter$2$1 extends FunctionReferenceImpl implements Function1<CategoryMerchant, Unit> {
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CategoryMerchant categoryMerchant) {
        Intrinsics.checkNotNullParameter(categoryMerchant, "");
        triggerAePrecapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1((triggerAePrecapture) this.receiver, categoryMerchant);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CategoryMerchant categoryMerchant) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(categoryMerchant);
        return Unit.INSTANCE;
    }

    public CategoryBottomSheetFragment$adapter$2$1(Object obj) {
        super(1, obj, triggerAePrecapture.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/domain/promo/model/CategoryMerchant;)V", 0);
    }
}
