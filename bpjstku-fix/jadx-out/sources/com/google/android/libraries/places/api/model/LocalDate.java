package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.material.timepicker.TimeModel;
import com.google.common.collect.Range;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.updateAndVerifyState;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LocalDate implements Parcelable, Comparable<LocalDate> {
    public static LocalDate newInstance(int i, int i2, int i3) {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza(i);
        zzaaVar.zzb(i2);
        zzaaVar.zzc(i3);
        LocalDate localDateZzd = zzaaVar.zzd();
        int month = localDateZzd.getMonth();
        Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, 12);
        Integer numValueOf = Integer.valueOf(month);
        if (!(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.lowerBound.b(numValueOf) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault2.upperBound.b(numValueOf))) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Month must not be out of range of 1 to 12, but was: %s.", Integer.valueOf(month)));
        }
        int day = localDateZzd.getDay();
        Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, 31);
        Integer numValueOf2 = Integer.valueOf(day);
        if (!(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.lowerBound.b(numValueOf2) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault3.upperBound.b(numValueOf2))) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Day must not be out of range of 1 to 31, but was: %s.", Integer.valueOf(day)));
        }
        if (Arrays.asList(4, 6, 9, 11).contains(numValueOf)) {
            Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, 30);
            updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault4.lowerBound.b(numValueOf2) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault4.upperBound.b(numValueOf2), "%s is not a valid day for month %s.", day, month);
        }
        if (month == 2) {
            int year = localDateZzd.getYear();
            Range rangeTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Range.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, Integer.valueOf(year % 4 == 0 ? 29 : 28));
            updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rangeTuitionPaymentFragmentspecialinlinedviewModeldefault5.lowerBound.b(numValueOf2) && !rangeTuitionPaymentFragmentspecialinlinedviewModeldefault5.upperBound.b(numValueOf2), "%s is not a valid day for month %s in year %s.", numValueOf2, 2, Integer.valueOf(year));
        }
        return localDateZzd;
    }

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(getYear()), String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(getMonth())), String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(getDay())));
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDate localDate) {
        int day;
        int day2;
        if (localDate == null) {
            throw new NullPointerException("dateToCompare must not be null.");
        }
        if (this == localDate) {
            return 0;
        }
        if (getYear() != localDate.getYear()) {
            day = getYear();
            day2 = localDate.getYear();
        } else if (getMonth() != localDate.getMonth()) {
            day = getMonth();
            day2 = localDate.getMonth();
        } else {
            day = getDay();
            day2 = localDate.getDay();
        }
        return day - day2;
    }
}
