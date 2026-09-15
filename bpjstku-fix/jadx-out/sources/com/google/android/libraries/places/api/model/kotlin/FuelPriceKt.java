package com.google.android.libraries.places.api.model.kotlin;

import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.Money;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;", "p0", "Lcom/google/android/libraries/places/api/model/Money;", "p1", "Ljava/time/Instant;", "p2", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "fuelPrice", "(Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;Lcom/google/android/libraries/places/api/model/Money;Ljava/time/Instant;)Lcom/google/android/libraries/places/api/model/FuelPrice;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FuelPriceKt {
    public static final FuelPrice fuelPrice(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        Intrinsics.checkNotNullParameter(fuelType, "");
        Intrinsics.checkNotNullParameter(money, "");
        Intrinsics.checkNotNullParameter(instant, "");
        FuelPrice fuelPriceNewInstance = FuelPrice.newInstance(fuelType, money, instant);
        Intrinsics.checkNotNullExpressionValue(fuelPriceNewInstance, "");
        return fuelPriceNewInstance;
    }
}
