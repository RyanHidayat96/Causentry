package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FuelPrice implements Parcelable {

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Builder {
        public abstract FuelPrice build();

        public abstract Builder setPrice(Money money);

        public abstract Builder setType(FuelType fuelType);

        public abstract Builder setUpdateTime(Instant instant);
    }

    public enum FuelType implements Parcelable {
        FUEL_TYPE_UNSPECIFIED,
        DIESEL,
        REGULAR_UNLEADED,
        MIDGRADE,
        PREMIUM,
        SP91,
        SP91_E10,
        SP92,
        SP95,
        SP95_E10,
        SP98,
        SP99,
        SP100,
        LPG,
        E80,
        E85,
        METHANE,
        BIO_DIESEL,
        TRUCK_DIESEL;

        public static final Parcelable.Creator<FuelType> CREATOR = new zzen();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static FuelPrice newInstance(FuelType fuelType, Money money, Instant instant) {
        zzx zzxVar = new zzx();
        zzxVar.setType(fuelType);
        zzxVar.setPrice(money);
        zzxVar.setUpdateTime(instant);
        return zzxVar.build();
    }

    public abstract Money getPrice();

    public abstract FuelType getType();

    public abstract Instant getUpdateTime();
}
