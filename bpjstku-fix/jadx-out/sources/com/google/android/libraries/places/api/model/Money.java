package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import defpackage.CameraStateRegistryCameraRegistration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Money implements Parcelable {

    public static abstract class Builder {
        public Money build() {
            long jLongValue = getUnits().longValue();
            Integer nanos = getNanos();
            if (jLongValue > 0) {
                if (!(nanos.intValue() >= 0)) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Unit is positive and nano must be positive or zero, but was: %s.", nanos));
                }
            } else if (jLongValue < 0) {
                if (!(nanos.intValue() <= 0)) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Unit is negative and nano must be negative or zero, but was: %s.", nanos));
                }
            }
            return zza();
        }

        public abstract Integer getNanos();

        public abstract Long getUnits();

        public abstract Builder setCurrencyCode(String str);

        public abstract Builder setNanos(Integer num);

        public abstract Builder setUnits(Long l);

        abstract Money zza();
    }

    public static Money newInstance(String str, Long l, Integer num) {
        zzae zzaeVar = new zzae();
        zzaeVar.setCurrencyCode(str);
        zzaeVar.setUnits(l);
        zzaeVar.setNanos(num);
        return zzaeVar.build();
    }

    public abstract String getCurrencyCode();

    public abstract Integer getNanos();

    public abstract Long getUnits();
}
