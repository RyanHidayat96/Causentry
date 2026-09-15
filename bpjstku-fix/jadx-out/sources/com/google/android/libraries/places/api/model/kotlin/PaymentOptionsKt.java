package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.PaymentOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0006\u001a\u00020\u00052\u001b\b\u0002\u0010\u0004\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/model/PaymentOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lcom/google/android/libraries/places/api/model/PaymentOptions;", "paymentOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/libraries/places/api/model/PaymentOptions;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PaymentOptionsKt {
    public static final PaymentOptions paymentOptions(Function1<? super PaymentOptions.Builder, Unit> function1) {
        PaymentOptions.Builder builder = PaymentOptions.builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        PaymentOptions paymentOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(paymentOptionsBuild, "");
        return paymentOptionsBuild;
    }

    public static /* synthetic */ PaymentOptions paymentOptions$default(Function1 function1, int i, Object obj) {
        if (1 == (i & 1)) {
            function1 = null;
        }
        return paymentOptions(function1);
    }
}
