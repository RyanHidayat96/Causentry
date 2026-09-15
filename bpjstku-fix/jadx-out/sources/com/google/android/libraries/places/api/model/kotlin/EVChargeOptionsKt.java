package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVChargeOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "p0", "", "Lcom/google/android/libraries/places/api/model/ConnectorAggregation;", "p1", "Lcom/google/android/libraries/places/api/model/EVChargeOptions;", "evChargeOptions", "(ILjava/util/List;)Lcom/google/android/libraries/places/api/model/EVChargeOptions;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EVChargeOptionsKt {
    public static final EVChargeOptions evChargeOptions(int i, List<? extends ConnectorAggregation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        EVChargeOptions eVChargeOptionsNewInstance = EVChargeOptions.newInstance(Integer.valueOf(i), list);
        Intrinsics.checkNotNullExpressionValue(eVChargeOptionsNewInstance, "");
        return eVChargeOptionsNewInstance;
    }
}
