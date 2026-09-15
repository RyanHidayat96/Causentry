package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.common.collect.Range;
import defpackage.CameraStateRegistryCameraRegistration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    public static LocalTime newInstance(int i, int i2) {
        try {
            zzac zzacVar = new zzac();
            zzacVar.zza(i);
            zzacVar.zzb(i2);
            LocalTime localTimeZzc = zzacVar.zzc();
            int hours = localTimeZzc.getHours();
            Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0, 23);
            Integer numValueOf = Integer.valueOf(hours);
            if (!(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(numValueOf) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(numValueOf))) {
                throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Hours must not be out-of-range: 0 to 23, but was: %s.", Integer.valueOf(hours)));
            }
            int minutes = localTimeZzc.getMinutes();
            Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0, 59);
            Integer numValueOf2 = Integer.valueOf(minutes);
            if (rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.lowerBound.b(numValueOf2) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.upperBound.b(numValueOf2)) {
                return localTimeZzc;
            }
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Minutes must not be out-of-range: 0 to 59, but was: %s.", Integer.valueOf(minutes)));
        } catch (IllegalStateException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int getHours();

    public abstract int getMinutes();

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int hours;
        int hours2;
        if (localTime == null) {
            throw new NullPointerException("compare must not be null.");
        }
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }
}
