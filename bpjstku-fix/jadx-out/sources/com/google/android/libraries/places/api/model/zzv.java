package com.google.android.libraries.places.api.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzv extends FuelOptions.Builder {
    private List zza;

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final List<FuelPrice> getFuelPrices() {
        List<FuelPrice> list = this.zza;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"fuelPrices\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    public final FuelOptions.Builder setFuelPrices(List<FuelPrice> list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.FuelOptions.Builder
    final FuelOptions zza() {
        List list = this.zza;
        if (list != null) {
            return new zzco(list);
        }
        throw new IllegalStateException("Missing required properties: fuelPrices");
    }

    zzv() {
    }
}
