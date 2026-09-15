package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FuelOptions implements Parcelable {

    public static abstract class Builder {
        public FuelOptions build() {
            setFuelPrices(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFuelPrices()));
            return zza();
        }

        public abstract List<FuelPrice> getFuelPrices();

        public abstract Builder setFuelPrices(List<FuelPrice> list);

        abstract FuelOptions zza();
    }

    public static FuelOptions newInstance(List<FuelPrice> list) {
        zzv zzvVar = new zzv();
        zzvVar.setFuelPrices(list);
        return zzvVar.build();
    }

    public abstract List<FuelPrice> getFuelPrices();
}
