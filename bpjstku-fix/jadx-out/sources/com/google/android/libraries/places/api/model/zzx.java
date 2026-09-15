package com.google.android.libraries.places.api.model;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
final class zzx extends FuelPrice.Builder {
    private FuelPrice.FuelType zza;
    private Money zzb;
    private Instant zzc;

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice build() {
        Money money;
        Instant instant;
        FuelPrice.FuelType fuelType = this.zza;
        if (fuelType != null && (money = this.zzb) != null && (instant = this.zzc) != null) {
            return new zzcq(fuelType, money, instant);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" type");
        }
        if (this.zzb == null) {
            sb.append(" price");
        }
        if (this.zzc == null) {
            sb.append(" updateTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setPrice(Money money) {
        if (money == null) {
            throw new NullPointerException("Null price");
        }
        this.zzb = money;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setType(FuelPrice.FuelType fuelType) {
        if (fuelType == null) {
            throw new NullPointerException("Null type");
        }
        this.zza = fuelType;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice.Builder
    public final FuelPrice.Builder setUpdateTime(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.zzc = instant;
        return this;
    }

    zzx() {
    }
}
