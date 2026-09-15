package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.FuelPrice;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx {
    public static final boolean zza(FuelPrice.FuelType fuelType) {
        Intrinsics.checkNotNullParameter(fuelType, "");
        return fuelType == FuelPrice.FuelType.REGULAR_UNLEADED || fuelType == FuelPrice.FuelType.MIDGRADE || fuelType == FuelPrice.FuelType.PREMIUM || fuelType == FuelPrice.FuelType.DIESEL;
    }

    public static final boolean zzb(FuelPrice fuelPrice, Instant instant) {
        Intrinsics.checkNotNullParameter(fuelPrice, "");
        if (instant == null) {
            return false;
        }
        Instant instantMinus = instant.minus(24L, (TemporalUnit) ChronoUnit.HOURS);
        Intrinsics.checkNotNullExpressionValue(instantMinus, "");
        return fuelPrice.getUpdateTime().isBefore(instantMinus);
    }
}
