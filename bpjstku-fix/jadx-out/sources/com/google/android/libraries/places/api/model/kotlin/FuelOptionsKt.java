package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "p0", "Lcom/google/android/libraries/places/api/model/FuelOptions;", "fuelOptions", "(Ljava/util/List;)Lcom/google/android/libraries/places/api/model/FuelOptions;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FuelOptionsKt {
    public static final FuelOptions fuelOptions(List<? extends FuelPrice> list) {
        Intrinsics.checkNotNullParameter(list, "");
        FuelOptions fuelOptionsNewInstance = FuelOptions.newInstance(list);
        Intrinsics.checkNotNullExpressionValue(fuelOptionsNewInstance, "");
        return fuelOptionsNewInstance;
    }
}
