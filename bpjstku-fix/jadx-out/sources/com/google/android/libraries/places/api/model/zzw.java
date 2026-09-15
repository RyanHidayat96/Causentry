package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzw extends FuelOptions {
    private final List zza;

    zzw(List list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FuelOptions) {
            return this.zza.equals(((FuelOptions) obj).getFuelPrices());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 24);
        sb.append("FuelOptions{fuelPrices=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions
    public final List<FuelPrice> getFuelPrices() {
        return this.zza;
    }
}
