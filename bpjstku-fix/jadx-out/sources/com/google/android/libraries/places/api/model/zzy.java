package com.google.android.libraries.places.api.model;

import java.time.Instant;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzy extends FuelPrice {
    private final FuelPrice.FuelType zza;
    private final Money zzb;
    private final Instant zzc;

    zzy(FuelPrice.FuelType fuelType, Money money, Instant instant) {
        if (fuelType == null) {
            throw new NullPointerException("Null type");
        }
        this.zza = fuelType;
        if (money == null) {
            throw new NullPointerException("Null price");
        }
        this.zzb = money;
        if (instant == null) {
            throw new NullPointerException("Null updateTime");
        }
        this.zzc = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuelPrice)) {
            return false;
        }
        FuelPrice fuelPrice = (FuelPrice) obj;
        return this.zza.equals(fuelPrice.getType()) && this.zzb.equals(fuelPrice.getPrice()) && this.zzc.equals(fuelPrice.getUpdateTime());
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String string2 = this.zzb.toString();
        int length2 = string2.length();
        String string3 = this.zzc.toString();
        StringBuilder sb = new StringBuilder(length + 23 + length2 + 13 + string3.length() + 1);
        sb.append("FuelPrice{type=");
        sb.append(string);
        sb.append(", price=");
        sb.append(string2);
        sb.append(", updateTime=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final Money getPrice() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final FuelPrice.FuelType getType() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.FuelPrice
    public final Instant getUpdateTime() {
        return this.zzc;
    }
}
